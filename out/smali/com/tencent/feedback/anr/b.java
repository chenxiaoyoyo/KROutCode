package com.tencent.feedback.anr; class b { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/anr/b;
a=0;// .super Landroid/os/FileObserver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:J
a=0;// 
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/b;->c:Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const-string v0, "/data/anr/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/tencent/feedback/anr/b;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/feedback/anr/b;->a:J
a=0;// 
a=0;//     .line 36
a=0;//     invoke-static {p1}, Lcom/tencent/feedback/common/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/anr/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/feedback/anr/b;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     const-class v1, Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/b;->c:Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/anr/b;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/feedback/anr/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/b;);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/b;->c:Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/b;->c:Lcom/tencent/feedback/anr/b;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 62
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
a=0;// .method private declared-synchronized a()Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v1, "onTraceFileCloseWrite"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 108
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     iget-wide v1, p0, Lcom/tencent/feedback/anr/b;->a:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x1388
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v1, v3
a=0;// 
a=0;//     cmp-long v1, v6, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     const-string v1, "already done"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 134
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Byte);v2=(LongHi);v5=(Uninit);v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->getCrashRuntimeStrategy()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 117
a=0;//     #v1=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     const-string v1, "not strategy ? init eup ?"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);v2=(LongHi);v3=(LongLo);v4=(LongHi);v5=(Uninit);v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/CrashStrategyBean;->isMerged()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 123
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 125
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->i()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 126
a=0;//     :goto_2
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->n()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 127
a=0;//     :goto_3
a=0;//     #v5=(Reference,Ljava/util/Map;);
a=0;//     iput-wide v6, p0, Lcom/tencent/feedback/anr/b;->a:J
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-class v7, Lcom/tencent/feedback/common/service/RQDService;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v6, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 130
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "com.tencent.feedback.10"
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 131
a=0;//     const-string v7, "com.tencent.feedback.104"
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/anr/ANRHandleServiceTask;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;-><init>(ZLjava/lang/String;JLjava/util/Map;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/ANRHandleServiceTask;);
a=0;//     invoke-virtual {v6, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 133
a=0;//     const-string v0, "start service"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);v1=(Boolean);v2=(LongHi);v5=(Uninit);v6=(LongLo);v7=(LongHi);
a=0;//     const-string v2, "10000"
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 125
a=0;//     :cond_3
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 126
a=0;//     :cond_4
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onEvent(ILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v3=(Null);
a=0;//     const-string v0, "received event %d %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     aput-object p2, v1, v4
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 96
a=0;//     const-string v0, "/data/anr/traces.txt"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "/data/anr/"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     const-string v0, "not anr file %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v1, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/anr/b;->a()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public stopWatching()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     const-class v1, Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/b;->c:Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     .line 87
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 88
a=0;//     invoke-super {p0}, Landroid/os/FileObserver;->stopWatching()V
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
