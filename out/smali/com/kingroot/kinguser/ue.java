package com.kingroot.kinguser; class ue { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ue;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ud;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ue;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 71
a=0;//     #v2=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/ud;->b(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;J)J
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ud;->onFinish()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ud;->b(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ue;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {p0, v0, v2, v3}, Lcom/kingroot/kinguser/ue;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     new-instance v4, Ljava/lang/Long;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/Long;);
a=0;//     const-wide/16 v5, 0x64
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-object v7, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/ud;->c(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/ud;->a(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     sub-long/2addr v7, v9
a=0;// 
a=0;//     mul-long/2addr v5, v7
a=0;// 
a=0;//     iget-object v7, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/ud;->c(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     div-long/2addr v5, v7
a=0;// 
a=0;//     invoke-direct {v4, v5, v6}, Ljava/lang/Long;-><init>(J)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Long;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/kingroot/kinguser/ud;->b(JI)V
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ue;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ue;->tE:Lcom/kingroot/kinguser/ud;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ud;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ud;->b(Lcom/kingroot/kinguser/ud;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {p0, v0, v2, v3}, Lcom/kingroot/kinguser/ue;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
