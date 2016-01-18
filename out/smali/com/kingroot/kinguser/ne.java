package com.kingroot.kinguser; class ne { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ne;
a=0;// .super Lcom/kingroot/kinguser/md;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/md;-><init>(I)V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ne;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public d([B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zn;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zn;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zn;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/ne;->a([BLcom/kingroot/kinguser/afv;)V
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hP()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 27
a=0;//     #v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ne;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afv;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ne;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/zn;
a=0;// 
a=0;//     .line 30
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/zn;->yH:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sparse-switch v2, :sswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 32
a=0;//     :sswitch_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zn;);v1=(PosByte);v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ne;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/zn;->yJ:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/mf;->f(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 35
a=0;//     :sswitch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ne;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/zn;->yJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/mf;->e(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 30
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x5 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
