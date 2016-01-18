package krsdk; class g { void a() { int a;
a=0;// .class public final Lkrsdk/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Lkrsdk/d;
a=0;// 
a=0;// .field public static b:Landroid/os/HandlerThread;
a=0;// 
a=0;// .field public static c:Landroid/content/Context;
a=0;// 
a=0;// .field public static d:Landroid/content/Context;
a=0;// 
a=0;// .field public static volatile e:Z
a=0;// 
a=0;// .field private static f:Z
a=0;// 
a=0;// .field private static g:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 526
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lkrsdk/g;->e:Z
a=0;// 
a=0;//     .line 560
a=0;//     sput-boolean v0, Lkrsdk/g;->f:Z
a=0;// 
a=0;//     .line 561
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lkrsdk/g;->g:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/root/g;->d(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 402
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 403
a=0;//     const-string v0, "\u6709\u672a\u6267\u884c\u5b8c\u7684\u65b9\u6848\u8bb0\u5f55"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 404
a=0;//     sget-object v0, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/root/g;->c(Landroid/content/Context;)Lcom/kingroot/sdk/root/h;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 405
a=0;//     #v10=(Reference,Lcom/kingroot/sdk/root/h;);
a=0;//     iget v11, v4, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     .line 406
a=0;//     #v11=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 408
a=0;//     #v7=(Null);
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     sget-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 409
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     sget-object v0, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 411
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v4, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     .line 412
a=0;//     iget v2, v10, Lcom/kingroot/sdk/root/h;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     iget v2, v10, Lcom/kingroot/sdk/root/h;->d:I
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 413
a=0;//     :goto_0
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 414
a=0;//     iget v2, v10, Lcom/kingroot/sdk/root/h;->d:I
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     if-ne v2, v3, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 415
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v2}, Lkrsdk/c;->a(Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 416
a=0;//     #v3=(Integer);
a=0;//     const/16 v2, 0x3a98
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {v2, v5}, Lcom/kingroot/sdk/root/v;->a(II)Lcom/kingroot/sdk/root/v;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 417
a=0;//     #v7=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     iget v2, v10, Lcom/kingroot/sdk/root/h;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v7, v2}, Lkrsdk/c;->a(Lkrsdk/h;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 418
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move v9, v2
a=0;// 
a=0;//     .line 419
a=0;//     :goto_2
a=0;//     #v2=(Boolean);v9=(Boolean);
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     .line 420
a=0;//     const-string v2, "\u5ba2\u6237\u7aef\u53ef\u4e0a\u62a5Root\u6210\u529f\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 421
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v4, Lcom/kingroot/sdk/root/g;->j:Z
a=0;// 
a=0;//     .line 422
a=0;//     const-string v2, "\u8bb0\u5f55\u6210\u529f\u65b9\u6848\uff0c\u79fb\u9664\u4e0b\u4e00\u4e2a\u5f85\u6267\u884c\u65b9\u6848\u6807\u8bb0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 423
a=0;//     sget-object v2, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     const-string v5, "solution_success_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v12, v4, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v5, v12}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 424
a=0;//     sget-object v2, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     const-string v5, "next_execute_solution_id"
a=0;// 
a=0;//     invoke-static {v2, v5}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 430
a=0;//     :goto_3
a=0;//     #v12=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;ILcom/kingroot/sdk/root/g;I)V
a=0;// 
a=0;//     .line 432
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     move v3, v9
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;ZLcom/kingroot/sdk/root/g;II)V
a=0;// 
a=0;//     .line 435
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(PosByte);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v4}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;Lcom/kingroot/sdk/root/g;)V
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v3=(Reference,Lkrsdk/d;);
a=0;//     iget-object v3, v3, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/kd"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 438
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v6, v4}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;Lkrsdk/h;Lcom/kingroot/sdk/root/g;)V
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     move-object v5, v10
a=0;// 
a=0;//     .line 440
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/root/h;);
a=0;//     invoke-virtual/range {v2 .. v8}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/g;Lcom/kingroot/sdk/root/h;Lkrsdk/h;Lkrsdk/h;Z)V
a=0;// 
a=0;//     .line 441
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 444
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v4, v2}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/g;I)V
a=0;// 
a=0;//     .line 445
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/wupsession/c;->b(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 447
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 412
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Reference,Landroid/os/Handler;);v2=(Integer);v3=(PosByte);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Reference,Lcom/kingroot/sdk/root/h;);v11=(Integer);v12=(Uninit);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 414
a=0;//     :cond_3
a=0;//     #v8=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 418
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Integer);v5=(One);v6=(Integer);v7=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v9, v2
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 427
a=0;//     :cond_5
a=0;//     #v2=(Boolean);v9=(Boolean);
a=0;//     sget-object v2, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v5, v4, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v5}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 444
a=0;//     :cond_6
a=0;//     #v3=(Reference,Landroid/os/Handler;);v6=(Reference,Lcom/kingroot/sdk/root/l;);v9=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 363
a=0;//     const-class v1, Lkrsdk/g;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "func.RootExecutorFactory.initThreadIfNeed()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 364
a=0;//     sget-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 365
a=0;//     const-string v0, "Init KRSDKReportThread"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v2, "KRSDK.ReportThread"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 367
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     sput-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 363
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-static {}, Lkrsdk/b;->c()V
a=0;// 
a=0;//     .line 116
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, p1, v0}, Lcom/kingroot/sdk/util/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 117
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 118
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v1, 0x2711
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "extractFileToWorkDir throw exception"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lkrsdk/d;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     invoke-static {p0, p1, p0}, Lkrsdk/g;->a(Landroid/content/Context;Lkrsdk/d;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lkrsdk/d;Landroid/content/Context;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v7=(Null);
a=0;//     invoke-static {}, Lkrsdk/b;->c()V
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lkrsdk/g;->e:Z
a=0;// 
a=0;//     .line 147
a=0;//     iget-boolean v0, p1, Lkrsdk/d;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v1, p1, Lkrsdk/d;->e:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/commom/e;->a(ZZ)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-boolean v0, p1, Lkrsdk/d;->e:Z
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->a(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5
a=0;// 
a=0;//     .line 151
a=0;//     :try_start_1
a=0;//     invoke-static {p0, p2}, Lcom/kingroot/sdk/root/s;->a(Landroid/content/Context;Landroid/content/Context;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 157
a=0;//     :try_start_2
a=0;//     const-string v0, "RootExecutorFactory.init()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     sput-object p0, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 159
a=0;//     sput-object p2, Lkrsdk/g;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 160
a=0;//     sput-object p1, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     .line 192
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/Cryptor;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/commom/b;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 195
a=0;//     iget v0, p1, Lkrsdk/d;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, p0}, Lcom/kingroot/sdk/commom/c;->a(ILandroid/content/Context;)V
a=0;// 
a=0;//     .line 198
a=0;//     sget-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     sget-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z
a=0;// 
a=0;//     .line 200
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-static {}, Lkrsdk/g;->a()V
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v5, Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/os/Handler;);
a=0;//     sget-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v5, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 209
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 212
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     iget-object v3, p1, Lkrsdk/d;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 213
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     const-string v4, "__krsdk.res__"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 214
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/File;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 215
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 216
a=0;//     const-string v1, "DESCRYPT_FILE_FAIL"
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 217
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 216
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 218
a=0;//     const-string v0, "krsdk.res descryptFile fail."
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     const/16 v0, 0x2715
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "descrypt res fail. "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lkrsdk/b;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 355
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 152
a=0;//     :catch_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 153
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v1, 0x2712
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "verifyAuth fail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_5
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/os/Handler;);
a=0;//     move v2, v8
a=0;// 
a=0;//     .line 216
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 226
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     iget-object v1, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 225
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/File;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 226
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v1, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 227
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/sdk/util/c;->b(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     const-string v1, "kingroot-sdk"
a=0;// 
a=0;//     const-string v2, "Extract: finished."
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 248
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     const-string v1, "descrypt and extract krsdk.res done."
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 259
a=0;//     invoke-static {p2}, Lcom/kingroot/sdk/root/s;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 260
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/commom/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v2, p1, Lkrsdk/d;->h:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     iget-object v3, p1, Lkrsdk/d;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 263
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p1, Lkrsdk/d;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 264
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v1, p1, Lkrsdk/d;->h:Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_5
a=0;// 
a=0;//     .line 269
a=0;//     :cond_4
a=0;//     :try_start_5
a=0;//     const-string v1, "su"
a=0;// 
a=0;//     invoke-static {p2, v1}, Lcom/kingroot/sdk/util/c;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 271
a=0;//     const-string v1, "su"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     .line 272
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     const-string v4, "su"
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 270
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p2, v1, v2}, Lcom/kingroot/sdk/util/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 273
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     const-string v1, "105006"
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 274
a=0;//     const-string v1, "DESCRYPT_FILE_FAIL"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 275
a=0;//     :goto_3
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 274
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 284
a=0;//     :cond_5
a=0;//     :try_start_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     const-string v1, "superuser.apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v1}, Lcom/kingroot/sdk/util/c;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 286
a=0;//     const-string v1, "superuser.apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     .line 287
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     const-string v4, "superuser.apk"
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 285
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p2, v1, v2}, Lcom/kingroot/sdk/util/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 288
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     const-string v1, "105006"
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 289
a=0;//     const-string v1, "DESCRYPT_FILE_FAIL"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 290
a=0;//     :goto_4
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 289
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     .line 299
a=0;//     :cond_6
a=0;//     :try_start_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     const-string v1, "ku-config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v1}, Lcom/kingroot/sdk/util/c;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 300
a=0;//     const-string v1, "ku-config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     const-string v4, "ku-config"
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p2, v1, v2}, Lcom/kingroot/sdk/util/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_4
a=0;// 
a=0;//     .line 316
a=0;//     :cond_7
a=0;//     :goto_5
a=0;//     :try_start_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v1, "Posix.chmod start."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v1, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 318
a=0;//     #v3=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 319
a=0;//     array-length v4, v3
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_7
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v7
a=0;// 
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-lt v2, v4, :cond_c
a=0;// 
a=0;//     .line 334
a=0;//     :cond_8
a=0;//     :try_start_9
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ls -lZ "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/p;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 343
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fv;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/fv;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 344
a=0;//     sget-object v2, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 343
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/fv;->a(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 346
a=0;//     const-string v1, "init OK"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 347
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sput-boolean v1, Lkrsdk/g;->e:Z
a=0;// 
a=0;//     .line 349
a=0;//     const v1, 0x30d6e
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_5
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 351
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 238
a=0;//     :cond_9
a=0;//     :try_start_a
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Boolean);v2=(Reference,Ljava/io/File;);v3=(Boolean);v6=(Uninit);
a=0;//     const-string v1, "kingroot-sdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Extract: no changed."
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 240
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v8, v1
a=0;// 
a=0;//     .line 241
a=0;//     :try_start_b
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "UNZIP_RES"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 242
a=0;//     #v2=(One);
a=0;//     const-string v3, "7055"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Lcom/kingroot/sdk/util/f;->a(Ljava/lang/Throwable;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 243
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 241
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 244
a=0;//     const-string v0, "krsdk.res checkZipFileUpdate unzipFiles fail."
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 245
a=0;//     const/16 v0, 0x2716
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const-string v1, "unzip res fail. "
a=0;// 
a=0;//     invoke-static {v0, v1, v8}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 246
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v2=(Boolean);v6=(Uninit);v8=(One);
a=0;//     move v2, v8
a=0;// 
a=0;//     .line 274
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 278
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 279
a=0;//     const/16 v1, 0x2717
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "extract suku fail."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 280
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     move v2, v8
a=0;// 
a=0;//     .line 289
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 293
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 294
a=0;//     const/16 v1, 0x2717
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "extract suku fail."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 295
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 302
a=0;//     :catch_4
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 303
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v2, 0x2717
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-string v3, "extract kuconfig fail."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_5
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 352
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 353
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v1, 0x271a
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "unkown exception"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 354
a=0;//     sput-boolean v7, Lkrsdk/g;->e:Z
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 355
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 319
a=0;//     :cond_c
a=0;//     :try_start_c
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Conflicted);v2=(Integer);v3=(Reference,[Ljava/io/File;);v4=(Integer);v5=(Reference,Landroid/os/Handler;);v8=(One);
a=0;//     aget-object v1, v3, v2
a=0;// 
a=0;//     .line 320
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isFile()Z
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_7
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_d
a=0;// 
a=0;//     .line 322
a=0;//     :try_start_d
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v6, 0x1ed
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-static {v1, v6}, Lcom/kingroot/sdk/util/Posix;->chmod(Ljava/lang/String;I)I
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_6
a=0;// 
a=0;//     .line 319
a=0;//     :cond_d
a=0;//     :goto_7
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 324
a=0;//     :catch_6
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_7
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 329
a=0;//     :catch_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 330
a=0;//     const/16 v1, 0x2719
a=0;// 
a=0;//     :try_start_f
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "chmod fail."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lkrsdk/b;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_5
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 331
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     const-class v1, Lkrsdk/g;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "func.RootExecutorFactory.destoryThread()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 377
a=0;//     sget-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z
a=0;// 
a=0;//     .line 378
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 379
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 375
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 386
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     sget-object v1, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 387
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/sdk/wupsession/c;->c(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 391
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 389
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d()Lkrsdk/e;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     sget-object v0, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget-object v1, Lkrsdk/g;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/s;->a(Landroid/content/Context;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 491
a=0;//     const-string v0, "RootExecutorFactory.getRootExecutor()"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 492
a=0;//     sget-object v0, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 493
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     .line 494
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "\u8bf7\u5728\u4f60\u7684Application\u7684onCreate()\u4e2d\u8c03\u7528onApplicationCreate(Context, RootConfig)\u65b9\u6cd5"
a=0;// 
a=0;//     .line 493
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 498
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 499
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 519
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/q;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/q;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v2, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     sget-object v3, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/q;-><init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 523
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 502
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/m;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     sget-object v3, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/m;-><init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/m;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 506
a=0;//     :sswitch_1
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/ab;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/ab;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     sget-object v3, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/ab;-><init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :sswitch_2
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/w;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/w;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     sget-object v3, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/w;-><init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/w;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 512
a=0;//     :sswitch_3
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/ac;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/ac;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     sget-object v3, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/ac;-><init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ac;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 516
a=0;//     :sswitch_4
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/c;);
a=0;//     sget-object v1, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     sget-object v3, Lkrsdk/g;->b:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/c;-><init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/c;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 499
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x19a2e -> :sswitch_0
a=0;//         0x19a38 -> :sswitch_1
a=0;//         0x19a42 -> :sswitch_2
a=0;//         0x19a4c -> :sswitch_3
a=0;//         0x19a60 -> :sswitch_1
a=0;//         0x19a6a -> :sswitch_0
a=0;//         0x3c722 -> :sswitch_4
a=0;//         0x3c72c -> :sswitch_4
a=0;//     .end sparse-switch
a=0;// .end method
}}
