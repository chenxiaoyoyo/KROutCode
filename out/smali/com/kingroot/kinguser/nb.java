package com.kingroot.kinguser; class nb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nb;
a=0;// .super Lcom/kingroot/kinguser/md;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/md;-><init>(I)V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public d([B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yn;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yn;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yn;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/nb;->a([BLcom/kingroot/kinguser/afv;)V
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hP()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 27
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nb;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afv;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nb;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yn;
a=0;// 
a=0;//     .line 30
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/yn;->yF:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 35
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yn;);v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nb;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/mf;->a(Landroid/content/Context;Lcom/kingroot/kinguser/yn;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afv;);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
