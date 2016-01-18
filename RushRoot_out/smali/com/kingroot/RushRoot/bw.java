package com.kingroot.RushRoot; class bw { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/bw;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/RushRoot/bv;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field final synthetic c:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/bt;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/bw;->c:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;//     .line 209
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/bw;);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract a(Lcom/kingroot/RushRoot/bv;)V
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public interrupt()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 222
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->interrupt()V
a=0;// 
a=0;//     .line 223
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 242
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p0}, Lcom/kingroot/RushRoot/bw;->a(Lcom/kingroot/RushRoot/bv;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// 
a=0;//     .line 244
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/bw;->a:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
