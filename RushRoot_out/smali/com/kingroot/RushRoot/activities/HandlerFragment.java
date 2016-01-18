package com.kingroot.RushRoot.activities; class HandlerFragment { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/activities/HandlerFragment;
a=0;// .super Lcom/kingroot/loader/sdk/KPFragment;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     invoke-direct {p0}, Lcom/kingroot/loader/sdk/KPFragment;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/activities/HandlerFragment;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract a(Landroid/os/Message;)V
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Landroid/os/Message;J)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/activities/HandlerFragment;->j()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final j()Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/HandlerFragment;->a:Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/activities/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/activities/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/activities/b;-><init>(Lcom/kingroot/RushRoot/activities/HandlerFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/activities/b;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/activities/HandlerFragment;->a:Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/HandlerFragment;->a:Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/loader/sdk/KPFragment;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/activities/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/activities/b;-><init>(Lcom/kingroot/RushRoot/activities/HandlerFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/activities/b;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/activities/HandlerFragment;->a:Lcom/kingroot/RushRoot/activities/b;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
}}
