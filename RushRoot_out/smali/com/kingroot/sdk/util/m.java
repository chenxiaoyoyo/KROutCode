package com.kingroot.sdk.util; class m { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/sdk/util/m;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private volatile a:Ljava/lang/Thread;
a=0;// 
a=0;// .field private volatile b:Ljava/util/List;
a=0;// 
a=0;// .field private final c:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 18
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/util/m;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 14
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/util/m;->b:Ljava/util/List;
a=0;// 
a=0;//     .line 15
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/util/m;->c:Ljava/lang/Object;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/sdk/util/m;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/util/m;->b:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/sdk/util/m;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/util/m;->b:Ljava/util/List;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 45
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Thread;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/util/m;->c:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v3, Lcom/kingroot/sdk/util/n;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/sdk/util/n;);
a=0;//     invoke-direct {v3, p0}, Lcom/kingroot/sdk/util/n;-><init>(Lcom/kingroot/sdk/util/m;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/util/n;);
a=0;//     invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     const-string v3, "SingleThreadHandler"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/Thread;->setPriority(I)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/Thread;->setDaemon(Z)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     return v0
a=0;// 
a=0;//     .line 47
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/sdk/util/m;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/util/m;->c:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/sdk/util/m;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/util/m;->a:Ljava/lang/Thread;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/util/m;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
