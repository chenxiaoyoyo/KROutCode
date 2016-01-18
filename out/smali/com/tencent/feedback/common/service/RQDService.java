package com.tencent.feedback.common.service; class RQDService { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/common/service/RQDService;
a=0;// .super Landroid/app/IntentService;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     sput-object v0, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const-string v0, "RQDSERVICE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/service/RQDService;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected handleIntent(Landroid/content/Intent;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 54
a=0;//     #v4=(One);
a=0;//     const-string v0, "com.tencent.feedback.10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/feedback/common/service/a;->a(Landroid/content/Intent;)Lcom/tencent/feedback/common/service/RQDServiceTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/service/RQDServiceTask;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     const-string v1, "handle task %d %s"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/common/service/RQDServiceTask;->getTaskId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/common/service/RQDServiceTask;->getTaskName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
a=0;// 
a=0;//     .line 64
a=0;//     invoke-interface {v0, p0, p1}, Lcom/tencent/feedback/common/service/RQDServiceTask;->runInService(Lcom/tencent/feedback/common/service/RQDService;Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
a=0;// 
a=0;//     .line 73
a=0;//     const-string v0, "current pending %d"
a=0;// 
a=0;//     new-array v1, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v1, v5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 68
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
a=0;// 
a=0;//     .line 73
a=0;//     const-string v0, "current pending %d"
a=0;// 
a=0;//     new-array v1, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v1, v5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
a=0;// 
a=0;//     .line 73
a=0;//     const-string v1, "current pending %d"
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v3, Lcom/tencent/feedback/common/service/RQDService;->currentPendingNum:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/tencent/feedback/common/e;->a:Z
a=0;// 
a=0;//     .line 43
a=0;//     invoke-super {p0}, Landroid/app/IntentService;->onCreate()V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     const-string v0, "service destory"
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
a=0;//     .line 87
a=0;//     invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onHandleIntent(Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/feedback/common/service/RQDService;->handleIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
}}
