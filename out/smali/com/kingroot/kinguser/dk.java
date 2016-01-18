package com.kingroot.kinguser; class dk { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/dk;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile AbsAppHandler done"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// # eC == absWeakRef
a=0;// .field private final eC:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/app/AbsApplication;)V
a=0;//	   # done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 95
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dk;);
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dk;->eC:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public az()Lcom/kingroot/kinguser/app/AbsApplication;
a=0;//	   # done az() == getAbsWeakRef
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dk;->eC:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/app/AbsApplication;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//	   # done
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
}}
