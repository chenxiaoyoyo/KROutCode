package com.tencent.feedback.common; class b { void a() { int a;
a=0;// .class public abstract Lcom/tencent/feedback/common/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// .field private static b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/tencent/feedback/common/b;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/tencent/feedback/common/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     new-instance v0, Lcom/tencent/feedback/common/b$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/common/b$a;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/feedback/common/b$a;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/b$a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Lcom/tencent/feedback/common/b;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     const-class v1, Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "rqdp{  AsyncTaskHandlerAbs setInstance} "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 81
a=0;//     sget-object v0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     if-eq v0, p0, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     sget-object v0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/b;->a()Z
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     sput-object p0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     .line 86
a=0;//     const-string v0, "rqdp{  AsyncTaskHandlerAbs setInstance end}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 87
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 80
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b()Lcom/tencent/feedback/common/b;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     const-class v1, Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Lcom/tencent/feedback/common/b$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/common/b$a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/common/b$a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/b$a;);
a=0;//     sput-object v0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/feedback/common/b;->b:Lcom/tencent/feedback/common/b;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 96
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract a()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract a(ILjava/lang/Runnable;JJ)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract a(IZ)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract a(Ljava/lang/Runnable;)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract a(Ljava/lang/Runnable;J)Z
a=0;// .end method
}}
