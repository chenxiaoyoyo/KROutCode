package com.kingroot.kinguser; class nd { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nd;
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
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nd;);
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
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yt;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yt;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yt;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/nd;->a([BLcom/kingroot/kinguser/afv;)V
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hP()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nd;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/afv;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nd;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afv;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yt;
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nd;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/yt;->process:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/mf;->g(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
