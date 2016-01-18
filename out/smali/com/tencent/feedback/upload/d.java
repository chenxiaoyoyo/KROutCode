package com.tencent.feedback.upload; class d { void a() { int a;
a=0;// .class public abstract Lcom/tencent/feedback/upload/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/feedback/upload/d;->a:Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/tencent/feedback/upload/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/feedback/upload/d;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     const-class v1, Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/d;->a:Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/d;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Lcom/tencent/feedback/upload/d$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/upload/d$a;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/feedback/upload/d$a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/d$a;);
a=0;//     sput-object v0, Lcom/tencent/feedback/upload/d;->a:Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/d;->a:Lcom/tencent/feedback/upload/d;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 44
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
a=0;// .method public abstract a(Ljava/lang/String;[BLcom/tencent/feedback/upload/c;)[B
a=0;// .end method
}}
