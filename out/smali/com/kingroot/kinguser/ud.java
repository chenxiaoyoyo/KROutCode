package com.kingroot.kinguser; class ud { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/ud;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final tB:J
a=0;// 
a=0;// .field private tC:J
a=0;// 
a=0;// .field private tD:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(JJ)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ue;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ue;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ue;-><init>(Lcom/kingroot/kinguser/ud;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 19
a=0;//     iput-wide p1, p0, Lcom/kingroot/kinguser/ud;->tC:J
a=0;// 
a=0;//     .line 20
a=0;//     iput-wide p3, p0, Lcom/kingroot/kinguser/ud;->tB:J
a=0;// 
a=0;//     .line 22
a=0;//     iput-wide p1, p0, Lcom/kingroot/kinguser/ud;->tD:J
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ud;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ud;->tD:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ud;J)J
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     iput-wide p1, p0, Lcom/kingroot/kinguser/ud;->tD:J
a=0;// 
a=0;//     return-wide p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/ud;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ud;->tB:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/kinguser/ud;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ud;->tC:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract b(JI)V
a=0;// .end method
a=0;// 
a=0;// .method public final cancel()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized kE()Lcom/kingroot/kinguser/ud;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ud;->tD:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ud;->onFinish()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ud;);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/ud;->tB:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 55
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract onFinish()V
a=0;// .end method
a=0;// 
a=0;// .method public final pause()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final resume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ud;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
}}
