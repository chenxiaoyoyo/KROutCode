package com.kingroot.kinguser; class wc { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/wc;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile WcThread done"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/wb;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private uT:Ljava/util/List;
a=0;// 
a=0;// .field private uU:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/vz;Ljava/util/List;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/wc;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 209
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wc;->uT:Ljava/util/List;
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uT:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
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
a=0;// .method public abstract b(Lcom/kingroot/kinguser/wb;)V
a=0;// .end method
a=0;// 
a=0;// .method public interrupt()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
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
a=0;// .method public isRunning()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
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
a=0;// .method public lS()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uT:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 233
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wc;->uT:Ljava/util/List;
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uT:Ljava/util/List;
a=0;// 
a=0;//     return-object v0
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
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 242
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p0}, Lcom/kingroot/kinguser/wc;->b(Lcom/kingroot/kinguser/wb;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 246
a=0;//     return-void
a=0;// 
a=0;//     .line 244
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wc;->uU:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
