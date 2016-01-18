package com.kingroot.RushRoot.activities; class b { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/activities/b;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/activities/HandlerFragment;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/activities/b;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 16
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/activities/b;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 18
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 24
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/b;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/b;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/activities/HandlerFragment;
a=0;// 
a=0;//     .line 26
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/RushRoot/activities/HandlerFragment;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
