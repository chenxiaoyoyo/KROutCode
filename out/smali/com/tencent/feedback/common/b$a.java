package com.tencent.feedback.common; class b$a { void a() { int a;
a=0;// .class final Lcom/tencent/feedback/common/b$a;
a=0;// .super Lcom/tencent/feedback/common/b;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;// .field private c:Landroid/util/SparseArray;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/feedback/common/b$a;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V
a=0;// 
a=0;//     .line 124
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/b$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/b;-><init>()V
a=0;// 
a=0;//     .line 117
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/b$a;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     .line 118
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 128
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "ScheduledExecutorService is not valiable!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 206
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v1, "rqdp{  stopAllScheduleTasks start}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/b$a;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     const-string v1, "rqdp{  ScheduleTaskHandlerImp was closed , should all stopped!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 218
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     const-string v0, "rqdp{  stop All ScheduleTasks!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V
a=0;// 
a=0;//     .line 214
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V
a=0;// 
a=0;//     .line 216
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 217
a=0;//     const-string v0, "rqdp{  stopAllScheduleTasks end}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a(ILjava/lang/Runnable;JJ)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     #v2=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/b$a;->c()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     const-string v0, "rqdp{  ScheduleTaskHandlerImp was closed , should not post!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 180
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     :try_start_1
a=0;//     const-string v0, "rqdp{  task runner should not be null}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 166
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-boolean v2, Lcom/tencent/feedback/common/b$a;->a:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 170
a=0;//     cmp-long v2, p5, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     move-wide v4, p5
a=0;// 
a=0;//     .line 172
a=0;//     :goto_2
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/16 v0, 0x13
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/tencent/feedback/common/b$a;->a(IZ)Z
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 175
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     const-string v1, "rqdp{  add a new future! taskId} %d ,rqdp{   periodTime} %d"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/16 v6, 0x13
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     const/16 v2, 0x13
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Byte);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-wide p5, v0
a=0;// 
a=0;//     .line 170
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 158
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Boolean);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-wide v4, p5
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a(IZ)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/b$a;->c()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     const-string v1, "rqdp{  ScheduleTaskHandlerImp was closed , should all stopped}!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 200
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/concurrent/ScheduledFuture;
a=0;// 
a=0;//     .line 194
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     const-string v2, "cancel a old future!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->c:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 200
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a(Ljava/lang/Runnable;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/b$a;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     const-string v1, "rqdp{  ScheduleTaskHandlerImp was closed , should not post!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 151
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_1
a=0;//     const-string v1, "rqdp{  task runner should not be null}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a(Ljava/lang/Runnable;J)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 224
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/b$a;->c()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     const-string v1, "rqdp{  ScheduleTaskHandlerImp was closed , should not post!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 237
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(LongLo);v2=(LongHi);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 231
a=0;//     :try_start_1
a=0;//     const-string v1, "rqdp{  task runner should not be null}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 235
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(LongLo);v2=(LongHi);v3=(Boolean);
a=0;//     cmp-long v0, p2, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 236
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/b$a;->b:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     invoke-interface {v0, p1, p2, p3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 237
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongLo);
a=0;//     move-wide p2, v1
a=0;// 
a=0;//     .line 235
a=0;//     goto :goto_1
a=0;// .end method
}}
