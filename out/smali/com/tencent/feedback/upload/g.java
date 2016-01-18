package com.tencent.feedback.upload; class g { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/upload/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/util/SparseArray;
a=0;// 
a=0;// .field private c:Ljava/util/List;
a=0;// 
a=0;// .field private d:Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     .line 93
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/upload/g;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/upload/g;->c:Ljava/util/List;
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/feedback/upload/g;->f:Z
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/feedback/upload/g;->g:I
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     .line 95
a=0;//     iput-boolean p2, p0, Lcom/tencent/feedback/upload/g;->f:Z
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/upload/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/upload/g;->d:Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/tencent/feedback/upload/g;->g:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static a([B)Lcom/tencent/feedback/proguard/D;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/d;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/proguard/d;-><init>()V
a=0;// 
a=0;//     .line 324
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/d;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/d;->e()V
a=0;// 
a=0;//     .line 325
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/feedback/proguard/d;->a([B)V
a=0;// 
a=0;//     .line 326
a=0;//     const-string v1, "detail"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lcom/tencent/feedback/proguard/D;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/proguard/D;);
a=0;//     invoke-direct {v2}, Lcom/tencent/feedback/proguard/D;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/proguard/D;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/feedback/proguard/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 327
a=0;//     const-class v1, Lcom/tencent/feedback/proguard/D;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     const-string v1, "rqdp{  covert to ResponsePackage}"
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
a=0;//     .line 330
a=0;//     const-class v1, Lcom/tencent/feedback/proguard/D;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/feedback/proguard/D;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 339
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 333
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 335
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/feedback/upload/g;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const-class v1, Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/upload/g;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, p0, v2}, Lcom/tencent/feedback/upload/g;-><init>(Landroid/content/Context;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     sput-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, "rqdp{  create uphandler up:true}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 51
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
a=0;// .method public static declared-synchronized a(Landroid/content/Context;Z)Lcom/tencent/feedback/upload/g;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const-class v1, Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/upload/g;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/tencent/feedback/upload/g;-><init>(Landroid/content/Context;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     sput-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     .line 72
a=0;//     const-string v0, "rqdp{  create uphandler up:}%b"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/upload/g;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     invoke-direct {v0, p1}, Lcom/tencent/feedback/upload/g;->a(Z)V
a=0;// 
a=0;//     .line 77
a=0;//     const-string v0, "rqdp{  change uphandler up:}%b"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/upload/g;->a:Lcom/tencent/feedback/upload/g;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 69
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
a=0;// .method private declared-synchronized a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput p1, p0, Lcom/tencent/feedback/upload/g;->g:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 142
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 141
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(IIJJZLjava/lang/String;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/g;->b()[Lcom/tencent/feedback/upload/UploadHandleListener;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 383
a=0;//     #v10=(Reference,[Lcom/tencent/feedback/upload/UploadHandleListener;);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 385
a=0;//     array-length v11, v10
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v9, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Integer);
a=0;//     if-ge v9, v11, :cond_0
a=0;// 
a=0;//     aget-object v0, v10, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-wide v3, p3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-wide/from16 v5, p5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move/from16 v7, p7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     move-object/from16 v8, p8
a=0;// 
a=0;//     .line 387
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface/range {v0 .. v8}, Lcom/tencent/feedback/upload/UploadHandleListener;->onUploadEnd(IIJJZLjava/lang/String;)V
a=0;// 
a=0;//     .line 385
a=0;//     add-int/lit8 v0, v9, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v9, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 391
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-boolean p1, p0, Lcom/tencent/feedback/upload/g;->f:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 714
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 713
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/util/SparseArray;I[B)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x12f
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/16 v3, 0x12d
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 600
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 693
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 606
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(One);v3=(PosShort);v4=(PosShort);v5=(Uninit);v6=(Uninit);
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     .line 676
a=0;//     invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/feedback/upload/e;
a=0;// 
a=0;//     .line 677
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     .line 679
a=0;//     const-string v0, "rqdp{  no handler key:}%d"
a=0;// 
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 680
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 611
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v2=(One);v3=(PosShort);
a=0;//     invoke-static {p3}, Lcom/tencent/feedback/upload/g;->b([B)Lcom/tencent/feedback/proguard/B;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 612
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 614
a=0;//     const-string v0, "rqdp{  mix error}"
a=0;// 
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 615
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 617
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);v2=(One);
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/B;->a:Ljava/util/Map;
a=0;// 
a=0;//     .line 619
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 621
a=0;//     invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 623
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     invoke-direct {p0, p1, v4, v0}, Lcom/tencent/feedback/upload/g;->a(Landroid/util/SparseArray;I[B)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 626
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 631
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);v1=(Null);v3=(PosShort);v4=(PosShort);
a=0;//     invoke-static {p3}, Lcom/tencent/feedback/upload/g;->b([B)Lcom/tencent/feedback/proguard/B;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 632
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 634
a=0;//     const-string v0, "rqdp{  mix error}"
a=0;// 
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 635
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 637
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);v2=(One);
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/B;->a:Ljava/util/Map;
a=0;// 
a=0;//     .line 639
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     .line 641
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 643
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     invoke-direct {p0, p1, v3, v0}, Lcom/tencent/feedback/upload/g;->a(Landroid/util/SparseArray;I[B)Z
a=0;// 
a=0;//     .line 645
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 647
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     invoke-direct {p0, p1, v4, v0}, Lcom/tencent/feedback/upload/g;->a(Landroid/util/SparseArray;I[B)Z
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 650
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 656
a=0;//     :sswitch_2
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Null);
a=0;//     const-string v0, "rqdp{  process CMD_RESPONSE_GEN_QIMEI}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 657
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/h;);
a=0;//     invoke-direct {v0, p3}, Lcom/tencent/feedback/proguard/h;-><init>([B)V
a=0;// 
a=0;//     .line 658
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/h;);
a=0;//     new-instance v1, Lcom/tencent/feedback/proguard/T;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/proguard/T;);
a=0;//     invoke-direct {v1}, Lcom/tencent/feedback/proguard/T;-><init>()V
a=0;// 
a=0;//     .line 659
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/T;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/feedback/proguard/T;->a(Lcom/tencent/feedback/proguard/h;)V
a=0;// 
a=0;//     .line 660
a=0;//     iget-object v0, v1, Lcom/tencent/feedback/proguard/T;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 662
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/h;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, v1, Lcom/tencent/feedback/proguard/T;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/feedback/common/h;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 664
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "QIMEI_DENGTA"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/tencent/feedback/proguard/T;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3, v4}, Lcom/tencent/feedback/common/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 666
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "rqdp{  Qimei:}%s rqdp{  imei:}%s rqdp{  imsi:}%s rqdp{  aid:}%s rqdp{  mac:}%s "
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, v1, Lcom/tencent/feedback/proguard/T;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v5, v1, Lcom/tencent/feedback/proguard/T;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget-object v5, v1, Lcom/tencent/feedback/proguard/T;->d:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     iget-object v5, v1, Lcom/tencent/feedback/proguard/T;->e:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     iget-object v1, v1, Lcom/tencent/feedback/proguard/T;->c:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v1, v3, v4
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 672
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 668
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 670
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 685
a=0;//     :cond_8
a=0;//     :try_start_1
a=0;//     #v1=(Null);v3=(PosShort);v4=(PosShort);v5=(Uninit);
a=0;//     const-string v3, "rqdp{  key:}%d rqdp{  handler: }%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 686
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {v0, p2, p3, v3}, Lcom/tencent/feedback/upload/e;->a(I[BZ)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 687
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 689
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/e;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 691
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 692
a=0;//     const-string v0, "rqdp{  handle error key:}%d"
a=0;// 
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 693
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 606
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0xf -> :sswitch_2
a=0;//         0x130 -> :sswitch_1
a=0;//         0x131 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private static b([B)Lcom/tencent/feedback/proguard/B;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 570
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 586
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 577
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Lcom/tencent/feedback/proguard/B;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/proguard/B;);
a=0;//     invoke-direct {v1}, Lcom/tencent/feedback/proguard/B;-><init>()V
a=0;// 
a=0;//     .line 578
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/B;);
a=0;//     new-instance v2, Lcom/tencent/feedback/proguard/h;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/proguard/h;);
a=0;//     invoke-direct {v2, p0}, Lcom/tencent/feedback/proguard/h;-><init>([B)V
a=0;// 
a=0;//     .line 579
a=0;//     #v2=(Reference,Lcom/tencent/feedback/proguard/h;);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/proguard/B;->a(Lcom/tencent/feedback/proguard/h;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 580
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 582
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 584
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Lcom/tencent/feedback/upload/AbstractUploadDatas;)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 287
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->a()Lcom/tencent/feedback/proguard/C;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/C;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     const-string v1, "rqdp{  [pid:}%s rqdp{  \nbid:}%s_%s rqdp{  \nsid:}%s_%s \n]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, v0, Lcom/tencent/feedback/proguard/C;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iget-object v4, v0, Lcom/tencent/feedback/proguard/C;->n:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget-object v4, v0, Lcom/tencent/feedback/proguard/C;->c:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     iget-object v4, v0, Lcom/tencent/feedback/proguard/C;->d:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     iget-object v4, v0, Lcom/tencent/feedback/proguard/C;->e:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 291
a=0;//     new-instance v1, Lcom/tencent/feedback/proguard/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/proguard/d;);
a=0;//     invoke-direct {v1}, Lcom/tencent/feedback/proguard/d;-><init>()V
a=0;// 
a=0;//     .line 292
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/d;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/d;->e()V
a=0;// 
a=0;//     .line 293
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/proguard/d;->a(I)V
a=0;// 
a=0;//     .line 294
a=0;//     const-string v2, "test"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/proguard/d;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 295
a=0;//     const-string v2, "test"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/proguard/d;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 296
a=0;//     const-string v2, "detail"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/tencent/feedback/proguard/d;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/d;->a()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 306
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 300
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 302
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 303
a=0;//     invoke-static {}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->d()V
a=0;// 
a=0;//     .line 306
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b()[Lcom/tencent/feedback/upload/UploadHandleListener;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Lcom/tencent/feedback/upload/UploadHandleListener;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/tencent/feedback/upload/UploadHandleListener;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lcom/tencent/feedback/upload/UploadHandleListener;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 401
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 396
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized c()Lcom/tencent/feedback/upload/d;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->d:Lcom/tencent/feedback/upload/d;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/d;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized d()Landroid/util/SparseArray;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 558
a=0;//     new-instance v0, Lcom/tencent/feedback/common/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/common/k;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/common/k;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/k;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/k;->a(Landroid/util/SparseArray;)Landroid/util/SparseArray;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 560
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
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
a=0;// .method private declared-synchronized e()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 704
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/upload/g;->f:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
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
a=0;// .method public final a(Lcom/tencent/feedback/upload/AbstractUploadDatas;)V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/g;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     const-string v0, "rqdp{   Not UpProc real event sync 2 DB done false}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->a()Lcom/tencent/feedback/proguard/C;
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->done(Z)V
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget v0, p1, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b:I
a=0;// 
a=0;//     const/16 v1, 0x457
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     .line 160
a=0;//     const-string v0, "rqdp{   Not UpProc not req }%d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 271
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 164
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosShort);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const-string v0, "rqdp{   NotUpProc com req start}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/g;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 170
a=0;//     const-string v0, "rqdp{  doUpload network is disabled!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->done(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/f;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/feedback/upload/g;->a(Lcom/tencent/feedback/upload/UploadHandleListener;)Z
a=0;// 
a=0;//     .line 182
a=0;//     if-nez p1, :cond_5
a=0;// 
a=0;//     .line 184
a=0;//     const-string v0, "rqdp{  upData == null?}"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 188
a=0;//     #v1=(Integer);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 190
a=0;//     #v7=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 193
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/g;->b()[Lcom/tencent/feedback/upload/UploadHandleListener;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,[Lcom/tencent/feedback/upload/UploadHandleListener;);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     array-length v9, v8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v10=(Conflicted);
a=0;//     if-ge v0, v9, :cond_6
a=0;// 
a=0;//     aget-object v10, v8, v0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-interface {v10, v1}, Lcom/tencent/feedback/upload/UploadHandleListener;->onUploadStart(I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 197
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "rqdp{  url error}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_7
a=0;// 
a=0;//     .line 204
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->done(Z)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     const-string v8, "url error"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/tencent/feedback/upload/g;->a(IIJJZLjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_8
a=0;//     const-string v8, "rqdp{  start upload cmd:}%d rqdp{  url:}%s rqdp{  datas:}%s"
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {p1}, Lcom/tencent/feedback/upload/g;->b(Lcom/tencent/feedback/upload/AbstractUploadDatas;)[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 215
a=0;//     if-nez v8, :cond_9
a=0;// 
a=0;//     .line 217
a=0;//     const-string v0, "rqdp{  sData error}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     const-string v8, "sData error"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/tencent/feedback/upload/g;->a(IIJJZLjava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_9
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/g;->c()Lcom/tencent/feedback/upload/d;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 225
a=0;//     if-nez v9, :cond_a
a=0;// 
a=0;//     .line 227
a=0;//     const-string v0, "rqdp{  reqH error}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 229
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     const-string v8, "reqH error"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/tencent/feedback/upload/g;->a(IIJJZLjava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     :cond_a
a=0;//     :try_start_0
a=0;//     new-instance v10, Lcom/tencent/feedback/upload/c;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/tencent/feedback/upload/c;);
a=0;//     invoke-direct {v10}, Lcom/tencent/feedback/upload/c;-><init>()V
a=0;// 
a=0;//     .line 236
a=0;//     #v10=(Reference,Lcom/tencent/feedback/upload/c;);
a=0;//     invoke-virtual {v9, v0, v8, v10}, Lcom/tencent/feedback/upload/d;->a(Ljava/lang/String;[BLcom/tencent/feedback/upload/c;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 237
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     .line 239
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/g;->a()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v8}, Lcom/tencent/feedback/upload/g;->a(I)V
a=0;// 
a=0;//     .line 246
a=0;//     :goto_2
a=0;//     invoke-virtual {v10}, Lcom/tencent/feedback/upload/c;->a()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 247
a=0;//     invoke-virtual {v10}, Lcom/tencent/feedback/upload/c;->b()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 250
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/upload/g;->a([B)Lcom/tencent/feedback/proguard/D;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 251
a=0;//     #v8=(Reference,Lcom/tencent/feedback/proguard/D;);
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     .line 253
a=0;//     iget v2, v8, Lcom/tencent/feedback/proguard/D;->b:I
a=0;// 
a=0;//     .line 254
a=0;//     #v2=(Integer);
a=0;//     iget-byte v0, v8, Lcom/tencent/feedback/proguard/D;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Boolean);
a=0;//     move v7, v0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v7=(Boolean);
a=0;//     if-eqz p1, :cond_c
a=0;// 
a=0;//     if-nez v8, :cond_f
a=0;// 
a=0;//     .line 259
a=0;//     :cond_c
a=0;//     :goto_4
a=0;//     #v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/g;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/tencent/feedback/upload/g;->a(IIJJZLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p1, v7}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->done(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_d
a=0;//     #v2=(Byte);v7=(Null);v8=(Reference,[B);v10=(Reference,Lcom/tencent/feedback/upload/c;);v11=(Reference,Ljava/lang/String;);v12=(Uninit);v13=(Uninit);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v8=(Null);
a=0;//     invoke-direct {p0, v8}, Lcom/tencent/feedback/upload/g;->a(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 261
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Integer);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v9, v0
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     move v10, v7
a=0;// 
a=0;//     .line 263
a=0;//     :try_start_2
a=0;//     #v10=(Boolean);
a=0;//     invoke-virtual {v9}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 264
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v9}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/tencent/feedback/upload/g;->a(IIJJZLjava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     const-string v0, "rqdp{  req error} %s"
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v9}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p1, v10}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->done(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     :cond_e
a=0;//     #v0=(Byte);v1=(Integer);v2=(Integer);v3=(LongLo);v10=(Reference,Lcom/tencent/feedback/upload/c;);v11=(Reference,Ljava/lang/String;);v12=(Uninit);v13=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 258
a=0;//     :cond_f
a=0;//     :try_start_3
a=0;//     #v0=(Conflicted);v7=(Boolean);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     iget-object v9, v8, Lcom/tencent/feedback/proguard/D;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/tencent/feedback/common/c;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v9, Ljava/util/Date;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v9}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Date;);
a=0;//     iget-wide v10, v8, Lcom/tencent/feedback/proguard/D;->g:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-virtual {v9}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     sub-long v9, v10, v12
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-virtual {v0, v9, v10}, Lcom/tencent/feedback/common/c;->a(J)V
a=0;// 
a=0;//     const-string v9, "rqdp{  fix ip:}%s rqdp{  tmgap:}%d"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->i()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);
a=0;//     invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_10
a=0;//     #v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-object v0, v8, Lcom/tencent/feedback/proguard/D;->c:[B
a=0;// 
a=0;//     if-nez v0, :cond_11
a=0;// 
a=0;//     const-string v0, "rqdp{  no response}"
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v8}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 270
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p1, v7}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->done(Z)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_11
a=0;//     :try_start_4
a=0;//     #v1=(Integer);v3=(LongLo);v8=(Reference,Lcom/tencent/feedback/proguard/D;);v9=(Reference,Ujava/lang/Object;);v10=(Reference,Ljava/lang/Object;);
a=0;//     iget-byte v9, v8, Lcom/tencent/feedback/proguard/D;->f:B
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     iget-byte v10, v8, Lcom/tencent/feedback/proguard/D;->e:B
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     iget-object v11, p0, Lcom/tencent/feedback/upload/g;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v11}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/tencent/feedback/proguard/w;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v0, v9, v10, v11}, Lcom/tencent/feedback/proguard/a;->b([BIILjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/g;->d()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v9, :cond_12
a=0;// 
a=0;//     invoke-virtual {v9}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-gtz v10, :cond_13
a=0;// 
a=0;//     :cond_12
a=0;//     const-string v0, "rqdp{  no handler!}"
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v8}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_13
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     iget v8, v8, Lcom/tencent/feedback/proguard/D;->b:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_14
a=0;// 
a=0;//     const-string v0, "rqdp{  response no datas}"
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v8}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_14
a=0;//     #v8=(Integer);
a=0;//     sparse-switch v10, :sswitch_data_0
a=0;// 
a=0;//     const-string v0, "rqdp{  unknown req:}%d "
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v8=(Integer);v9=(Reference,Landroid/util/SparseArray;);v10=(Integer);
a=0;//     const/16 v11, 0x131
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v8=(Integer);v10=(Integer);v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0x12e
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v8=(Integer);v10=(Integer);v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0x130
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_3
a=0;//     #v8=(Integer);v10=(Integer);v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0x12d
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_4
a=0;//     #v8=(Integer);v10=(Integer);v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0x12f
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_5
a=0;//     #v8=(Integer);v10=(Integer);v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0xb
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :sswitch_6
a=0;//     #v8=(Integer);v10=(Integer);v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0xf
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-eq v8, v11, :cond_15
a=0;// 
a=0;//     const-string v0, "rqdp{  UNMATCH req:}%d rqdp{  , rep:}%d"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v9, v11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v9, v10
a=0;// 
a=0;//     invoke-static {v0, v9}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_15
a=0;//     #v8=(Integer);v10=(Integer);v11=(PosShort);
a=0;//     invoke-direct {p0, v9, v8, v0}, Lcom/tencent/feedback/upload/g;->a(Landroid/util/SparseArray;I[B)Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 270
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v8=(Conflicted);v10=(Boolean);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move v7, v10
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 258
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x8 -> :sswitch_5
a=0;//         0xc -> :sswitch_5
a=0;//         0xf -> :sswitch_6
a=0;//         0xc8 -> :sswitch_0
a=0;//         0xc9 -> :sswitch_3
a=0;//         0xca -> :sswitch_1
a=0;//         0xcb -> :sswitch_4
a=0;//         0xcc -> :sswitch_2
a=0;//         0xcd -> :sswitch_4
a=0;//         0xce -> :sswitch_1
a=0;//         0xcf -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a(ILcom/tencent/feedback/upload/e;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
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
a=0;// .method public final declared-synchronized a(Lcom/tencent/feedback/upload/UploadHandleListener;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/g;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
