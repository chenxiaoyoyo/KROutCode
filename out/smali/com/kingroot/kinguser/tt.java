package com.kingroot.kinguser; class tt { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tt;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private volatile mIsRunning:Z
a=0;// 
a=0;// .field private tt:Landroid/net/LocalServerSocket;
a=0;// 
a=0;// .field private tu:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// .field private tv:Lcom/kingroot/kinguser/tu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/kingroot/kinguser/tu;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 20
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/tt;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/tt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 15
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;// 
a=0;//     .line 16
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/tt;->mIsRunning:Z
a=0;// 
a=0;//     .line 17
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/tt;->tu:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/tt;->tv:Lcom/kingroot/kinguser/tu;
a=0;// 
a=0;//     .line 21
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 22
a=0;//     invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tt;->tu:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 23
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/tt;->tv:Lcom/kingroot/kinguser/tu;
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/tt;->mIsRunning:Z
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/LocalServerSocket;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 46
a=0;//     :goto_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/net/LocalServerSocket;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 44
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 38
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized ky()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/tt;->start()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 28
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 27
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized kz()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tt;->close()V
a=0;// 
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tt;->tu:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tt;->tu:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 31
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
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tt;->close()V
a=0;// 
a=0;//     .line 57
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/net/LocalServerSocket;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/net/LocalServerSocket;);
a=0;//     const-string v2, "com.kingroot.kinguser.ku_server"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/LocalServerSocket;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/tt;->mIsRunning:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 64
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tt;->tv:Lcom/kingroot/kinguser/tu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/tu;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/tt;->tv:Lcom/kingroot/kinguser/tu;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/tu;);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/tt;->mIsRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Byte);
a=0;//     invoke-interface {v2, v0}, Lcom/kingroot/kinguser/tu;->aE(I)V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/tt;->mIsRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/LocalServerSocket;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/tt;->tt:Landroid/net/LocalServerSocket;
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/LocalServerSocket;);
a=0;//     invoke-virtual {v2}, Landroid/net/LocalServerSocket;->accept()Landroid/net/LocalSocket;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);v2=(Conflicted);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/tt;->mIsRunning:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     :catch_0
a=0;//     #v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 60
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tt;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Reference,Lcom/kingroot/kinguser/tu;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 74
a=0;//     :catch_1
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 75
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "Too many open files"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Landroid/os/Process;->killProcess(I)V
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {v1}, Ljava/lang/System;->exit(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 88
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);v2=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_2
a=0;//     new-instance v2, Lcom/kingroot/kinguser/tv;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/tv;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/tt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3, v0}, Lcom/kingroot/kinguser/tv;-><init>(Landroid/content/Context;Landroid/net/LocalSocket;)V
a=0;// 
a=0;//     .line 94
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/tv;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/tt;->tu:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 95
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 96
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 99
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 100
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
