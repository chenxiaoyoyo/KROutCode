package com.tencent.feedback.eup; class b { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/eup/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/feedback/eup/b;->c:Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/tencent/feedback/eup/b;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/eup/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/List;IZ)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 534
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-gtz p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 574
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 539
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 541
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcom/tencent/feedback/eup/b$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/eup/b$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/feedback/eup/b$1;-><init>(Lcom/tencent/feedback/eup/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/b$1;);
a=0;//     invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 559
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 560
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p2, v0, :cond_3
a=0;// 
a=0;//     .line 562
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     .line 563
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/d;->b()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 566
a=0;//     :cond_2
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 569
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 572
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 573
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/eup/c;->a(Landroid/content/Context;Ljava/util/List;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 574
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/feedback/eup/b;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const-class v1, Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/eup/b;->c:Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/eup/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/feedback/eup/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/b;);
a=0;//     sput-object v0, Lcom/tencent/feedback/eup/b;->c:Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/feedback/eup/b;->c:Lcom/tencent/feedback/eup/b;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
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
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 426
a=0;//     new-instance v4, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/feedback/eup/d;);
a=0;//     invoke-direct {v4}, Lcom/tencent/feedback/eup/d;-><init>()V
a=0;// 
a=0;//     .line 427
a=0;//     #v4=(Reference,Lcom/tencent/feedback/eup/d;);
a=0;//     invoke-virtual {v4, p5}, Lcom/tencent/feedback/eup/d;->i(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 428
a=0;//     invoke-virtual {v4, p6}, Lcom/tencent/feedback/eup/d;->j(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 429
a=0;//     add-long v1, p11, p2
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v4, v1, v2}, Lcom/tencent/feedback/eup/d;->b(J)V
a=0;// 
a=0;//     .line 432
a=0;//     if-eqz p13, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {p13 .. p13}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     .line 436
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p13 .. p13}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit16 v1, v1, -0x2710
a=0;// 
a=0;//     invoke-virtual/range {p13 .. p13}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p13
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object p13
a=0;// 
a=0;//     .line 444
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz p14, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p14
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     .line 448
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 449
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v3, v2, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p14
a=0;// 
a=0;//     array-length v2, v0
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     if-ltz v3, :cond_1
a=0;// 
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     .line 452
a=0;//     aget-byte v5, p14, v2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     aput-byte v5, v1, v3
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 449
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 438
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 440
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,[B);v3=(Integer);v5=(Conflicted);
a=0;//     move-object/from16 p14, v1
a=0;// 
a=0;//     .line 463
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-object/from16 v0, p13
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Lcom/tencent/feedback/eup/d;->l(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 464
a=0;//     move-object/from16 v0, p14
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/tencent/feedback/eup/d;->b([B)V
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v4, p7}, Lcom/tencent/feedback/eup/d;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 466
a=0;//     if-eqz p9, :cond_3
a=0;// 
a=0;//     invoke-virtual {p9}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 468
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     const-string p9, "empty message"
a=0;// 
a=0;//     .line 475
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     invoke-virtual {v4, p9}, Lcom/tencent/feedback/eup/d;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 476
a=0;//     invoke-virtual {v4, p8}, Lcom/tencent/feedback/eup/d;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 478
a=0;//     if-eqz p10, :cond_5
a=0;// 
a=0;//     invoke-virtual/range {p10 .. p10}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 480
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     const-string p10, "empty stack"
a=0;// 
a=0;//     .line 482
a=0;//     :cond_6
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/tencent/feedback/eup/d;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 483
a=0;//     const/high16 v1, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v4, v1}, Lcom/tencent/feedback/eup/d;->a(F)V
a=0;// 
a=0;//     .line 484
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->h(Landroid/content/Context;)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v4, v1, v2}, Lcom/tencent/feedback/eup/d;->c(J)V
a=0;// 
a=0;//     .line 485
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/d;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/common/d;->j()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {v4, v1, v2}, Lcom/tencent/feedback/eup/d;->e(J)V
a=0;// 
a=0;//     .line 486
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/d;->i()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     invoke-virtual {v4, v1, v2}, Lcom/tencent/feedback/eup/d;->d(J)V
a=0;// 
a=0;//     .line 487
a=0;//     invoke-virtual {v4, p1}, Lcom/tencent/feedback/eup/d;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 488
a=0;//     invoke-virtual {v4, p1}, Lcom/tencent/feedback/eup/d;->k(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 489
a=0;//     invoke-virtual {v4, p4}, Lcom/tencent/feedback/eup/d;->a(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 490
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/a;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Lcom/tencent/feedback/eup/d;->m(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 491
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v5, "/system/bin/sh"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v1, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v5, "-c"
a=0;// 
a=0;//     aput-object v5, v1, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "getprop ro.build.fingerprint"
a=0;// 
a=0;//     aput-object v5, v1, v3
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/a;->a([Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_8
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     :goto_4
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Lcom/tencent/feedback/eup/d;->n(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 492
a=0;//     const-string v1, "record id:%s"
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
a=0;//     invoke-virtual {v4}, Lcom/tencent/feedback/eup/d;->A()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 493
a=0;//     const-string v1, "rom id %s"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/tencent/feedback/eup/d;->D()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 495
a=0;//     return-object v4
a=0;// 
a=0;//     .line 457
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 459
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 470
a=0;//     :cond_7
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-virtual {p9}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_4
a=0;// 
a=0;//     .line 473
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x3e8
a=0;// 
a=0;//     invoke-virtual {p9, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p9
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 491
a=0;//     :cond_8
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/lang/StringBuilder;);v3=(Integer);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "fail"
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 518
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->i()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->n()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Map;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object/from16 v5, p1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v6, p2
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v7, p3
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v8, p4
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v9, p5
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v10, p6
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-wide/from16 v11, p7
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-object/from16 v13, p9
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v14, p10
a=0;// 
a=0;//     #v14=(Reference,[B);
a=0;//     invoke-static/range {v0 .. v14}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/ArrayList;Ljava/lang/Throwable;III)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     :goto_0
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-gt p2, p3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p4, :cond_1
a=0;// 
a=0;//     .line 754
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 738
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 p2, p2, 0x1
a=0;// 
a=0;//     .line 739
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 740
a=0;//     #v1=(Reference,[Ljava/lang/StackTraceElement;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 742
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     .line 744
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 742
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 748
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 750
a=0;//     const-string v0, "cause by:"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 751
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 752
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcom/tencent/feedback/eup/d;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 652
a=0;//     #v0=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->isStoreCrashSdcard()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 656
a=0;//     :try_start_0
a=0;//     const-string v2, "save eup logs"
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
a=0;//     .line 657
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 658
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/common/c;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 659
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/common/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 660
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/eup/d;->v()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 661
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Locale;);
a=0;//     const-string v7, "#--------\npackage:%s\nversion:%s\nsdk:%s\nprocess:%s\ndate:%s\ntype:%s\nmessage:%s\nstack:\n%s\neupID:%s\n"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/16 v8, 0x9
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput-object v4, v8, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/common/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v8, v3
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput-object v5, v8, v2
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v9=(Reference,Ljava/util/Locale;);
a=0;//     aput-object v2, v8, v3
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/eup/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v8, v2
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/eup/d;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v8, v2
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/eup/d;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v8, v2
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/eup/d;->A()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v8, v2
a=0;// 
a=0;//     invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 663
a=0;//     invoke-virtual {p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getStoreDirectoryPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 665
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/common/a;->f(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 691
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 661
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Reference,Ljava/util/Date;);v3=(PosByte);v4=(LongLo);v5=(LongHi);v6=(Reference,Ljava/util/Locale;);v7=(Reference,Ljava/lang/String;);v8=(Reference,[Ljava/lang/Object;);v9=(Null);
a=0;//     new-instance v4, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v5, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v4, v5, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v4, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 670
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "/euplog.txt"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getCrashSdcardMaxSize()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const-string v6, "rqdp{  sv sd start}"
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v6, v7}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-gtz v6, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 671
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 670
a=0;//     :cond_4
a=0;//     #v0=(Null);v6=(Integer);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "mounted"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "/Tencent/"
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/common/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v7, v6, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v3, v5}, Lcom/tencent/feedback/proguard/a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     const-string v2, "rqdp{  sv sd end}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 685
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 687
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "rqdp{  save error} %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v1, v0
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 688
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 674
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     #v1=(One);v4=(Conflicted);v6=(Reference,Ljava/util/Locale;);v7=(Reference,Ljava/lang/String;);v8=(Reference,[Ljava/lang/Object;);v9=(Reference,Ljava/util/Locale;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getStoreDirectoryPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 675
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 677
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 680
a=0;//     :cond_7
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     const-string v5, "euplog.txt"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 682
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getCrashSdcardMaxSize()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v4}, Lcom/tencent/feedback/proguard/a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 683
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static d()Ljava/util/Map;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 233
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 236
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 239
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 241
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 242
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     array-length v7, v1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v7, :cond_0
a=0;// 
a=0;//     aget-object v8, v1, v3
a=0;// 
a=0;//     .line 244
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v8}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 242
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 246
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Thread;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "add all thread error"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 256
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/util/HashMap;);v2=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 700
a=0;//     new-instance v0, Lcom/tencent/feedback/eup/b$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/eup/b$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/feedback/eup/b$2;-><init>(Lcom/tencent/feedback/eup/b;)V
a=0;// 
a=0;//     .line 707
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/b$2;);
a=0;//     const-string v1, "ImmediateEUP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 708
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 711
a=0;//     const-wide/16 v1, 0xbb8
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Thread;->join(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 717
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 713
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 715
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "rqdp{ eup regist}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     if-eq v0, p0, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/eup/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     .line 62
a=0;//     invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 55
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
a=0;// .method public final a(Lcom/tencent/feedback/eup/d;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/e;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/e;->q()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/feedback/eup/b;->a(Lcom/tencent/feedback/eup/d;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/tencent/feedback/eup/d;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     const-string v1, "bean == null "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 336
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 418
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 341
a=0;//     const-string v1, "no strategy!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 342
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 346
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->isMerged()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 348
a=0;//     if-nez p1, :cond_4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 349
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/tencent/feedback/eup/d;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 351
a=0;//     const-string v2, "merge success return"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 353
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->B()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->r()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_3
a=0;// 
a=0;//     .line 355
a=0;//     const-string v1, "rqdp{ may be crash too frequent! do immediate upload in merge!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 356
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/tencent/feedback/eup/b;->e()V
a=0;// 
a=0;//     .line 359
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 348
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/a;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     const-string v1, "rqdp{  md5 error!}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v5=(Uninit);
a=0;//     const-string v2, "(0x[\\d[a-z]]{8})|(\\d)"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/d;);
a=0;//     invoke-virtual {v0, v5}, Lcom/tencent/feedback/eup/d;->g(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/eup/d;->b(Z)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/eup/d;->b(I)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/eup/d;->a(I)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v3, "desc"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const-wide/16 v12, -0x1
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     const-wide/16 v10, -0x1
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-static/range {v1 .. v14}, Lcom/tencent/feedback/eup/c;->a(Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;IIIIJJLjava/lang/Boolean;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v1, "rqdp{  new one ,no merged!}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Reference,Ljava/util/List;);v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     const-string v2, "rqdp{ already merged} %d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Byte);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->r()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->b(I)V
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->f(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_a
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->f(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "rqdp{  EUPDAO.insertOrUpdateEUP() start}"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     if-nez v1, :cond_c
a=0;// 
a=0;//     :cond_b
a=0;//     const-string v2, "rqdp{  context == null || bean == null,pls check}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const-string v3, "rqdp{  eupMeg update success} %b , c:%d , at:%s up:%d"
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v2, v4, v5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->r()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->o()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->u()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->u()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     #v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/eup/c;->b(Landroid/content/Context;Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 363
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getMaxStoredNum()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 364
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/b;);
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     add-int/lit8 v2, v15, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "asc"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const-wide/16 v12, -0x1
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     const-wide/16 v10, -0x1
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-static/range {v1 .. v14}, Lcom/tencent/feedback/eup/c;->a(Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;IIIIJJLjava/lang/Boolean;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 366
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_10
a=0;// 
a=0;//     .line 369
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int/2addr v1, v15
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 370
a=0;//     if-lez v1, :cond_e
a=0;// 
a=0;//     .line 372
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->b()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v2, v1, v3}, Lcom/tencent/feedback/eup/b;->a(Ljava/util/List;IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 373
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v1, :cond_e
a=0;// 
a=0;//     .line 375
a=0;//     const-string v1, "can\'t add more eup!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 376
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 381
a=0;//     :cond_e
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lez v1, :cond_10
a=0;// 
a=0;//     .line 383
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     .line 384
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     .line 386
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_12
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->b()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_12
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Byte);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 390
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 392
a=0;//     :cond_f
a=0;//     #v1=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/eup/d;->b()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_10
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long v1, v3, v1
a=0;// 
a=0;//     const-wide/32 v3, 0xea60
a=0;// 
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_10
a=0;// 
a=0;//     .line 394
a=0;//     const-string v1, "rqdp{ may be crash too frequent! do immediate upload in not merge!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 395
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/tencent/feedback/eup/b;->e()V
a=0;// 
a=0;//     .line 401
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-direct/range {p0 .. p2}, Lcom/tencent/feedback/eup/b;->b(Lcom/tencent/feedback/eup/d;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
a=0;// 
a=0;//     .line 404
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/common/a;->e(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_11
a=0;// 
a=0;//     .line 406
a=0;//     const-string v1, "save log"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getOnlyLogTag()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getMaxLogRow()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/proguard/a;->a(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/eup/d;->a([B)V
a=0;// 
a=0;//     .line 415
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/feedback/eup/c;->a(Landroid/content/Context;Lcom/tencent/feedback/eup/d;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 416
a=0;//     #v1=(Boolean);
a=0;//     const-string v2, "store new eup pn:%s, isMe:%b , isNa:%b , res:%b "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->v()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->c()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/tencent/feedback/eup/d;->d()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 411
a=0;//     :cond_11
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/eup/d;->a([B)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_12
a=0;//     #v1=(Reference,Lcom/tencent/feedback/eup/d;);v2=(Reference,Lcom/tencent/feedback/eup/d;);v3=(Reference,Ljava/util/Iterator;);v4=(Byte);v5=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/common/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 263
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     .line 264
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 265
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 266
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 270
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->getCrashRuntimeStrategy()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getMaxStackFrame()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getMaxStackLine()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v8, "change frame:%d  line:%d"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v8, p2, v9, v3, v1}, Lcom/tencent/feedback/eup/b;->a(Ljava/util/ArrayList;Ljava/lang/Throwable;III)V
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 272
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 274
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "create stack from throw fail!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v8}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 277
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 279
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v7, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 282
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const-string v1, "rqdp{ stack:}%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object v7, v3, v8
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v3, Ljava/util/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v3}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v3}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     move-object v10, p3
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v11, p4
a=0;// 
a=0;//     #v11=(Reference,[B);
a=0;//     invoke-static/range {v1 .. v11}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 285
a=0;//     move/from16 v0, p5
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/feedback/eup/d;->a(Z)V
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_1
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/b;->d()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 292
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/eup/d;->I()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 295
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/eup/d;->I()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 306
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Lcom/tencent/feedback/eup/b;->a(Lcom/tencent/feedback/eup/d;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 265
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/content/Context;);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 266
a=0;//     :cond_4
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 270
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v1=(Boolean);v3=(Reference,Ljava/lang/StringBuilder;);v8=(Reference,Ljava/util/Iterator;);v9=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     move-object v7, v1
a=0;// 
a=0;//     .line 276
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 270
a=0;//     :cond_6
a=0;//     #v1=(Integer);v3=(Integer);v9=(Null);
a=0;//     const-string v1, ""
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 301
a=0;//     :catch_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Reference,Ujava/lang/Object;);v8=(LongLo);v9=(LongHi);v10=(Reference,Ljava/lang/String;);v11=(Reference,[B);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 303
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "get all threads stack fail"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 304
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "rqdp{ eup unregister}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;// 
a=0;//     .line 76
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/eup/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 69
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
a=0;// .method public final c()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 763
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/a;->b()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 764
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 766
a=0;//     const-string v2, "rqdp{  today fail?}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 767
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     .line 770
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/eup/f;->a(Landroid/content/Context;)Lcom/tencent/feedback/eup/f;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/feedback/eup/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v3, v0}, Lcom/tencent/feedback/eup/f;->a(Landroid/content/Context;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 771
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 773
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 92
a=0;//     #v6=(One);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_0
a=0;//     invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/eup/e;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     const-string v1, "rqdp{  instance == null}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-object v7, v0
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v7=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     :try_start_1
a=0;//     invoke-interface {v7, p1, p2}, Lcom/tencent/feedback/eup/CrashHandleListener;->onCrashHappen(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 118
a=0;//     :try_start_2
a=0;//     invoke-interface {v7}, Lcom/tencent/feedback/eup/CrashHandleListener;->getCrashExtraData()[B
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 128
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-interface {v7}, Lcom/tencent/feedback/eup/CrashHandleListener;->getCrashExtraMessage()Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 137
a=0;//     :goto_3
a=0;//     #v3=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     if-nez p1, :cond_4
a=0;// 
a=0;//     :try_start_4
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 139
a=0;//     :goto_4
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/tencent/feedback/eup/b;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 140
a=0;//     #v0=(Boolean);
a=0;//     const-string v1, "rqdp{ handle eup result} %b"
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
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 144
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 148
a=0;//     :try_start_5
a=0;//     invoke-interface {v7, p1, p2}, Lcom/tencent/feedback/eup/CrashHandleListener;->onCrashFinished(Ljava/lang/Thread;Ljava/lang/Throwable;)Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 157
a=0;//     :goto_5
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 159
a=0;//     :try_start_6
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const-string v0, "rqdp{ syscrhandle!}"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 162
a=0;//     :cond_2
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_3
a=0;//     :try_start_7
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/e;->p()Lcom/tencent/feedback/eup/CrashHandleListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v7, v1
a=0;// 
a=0;//     #v7=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 105
a=0;//     const-string v2, "rqdp{ your crash handle happen error} %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 92
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 120
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,Ujava/lang/Object;);v7=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);v8=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 122
a=0;//     :try_start_8
a=0;//     const-string v2, "rqdp{ your crash handle extra data error} %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move-object v4, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 130
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Reference,[B);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 132
a=0;//     const-string v2, "rqdp{ your crash handle extra message error} %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v3, v5
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 137
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 150
a=0;//     :catch_3
a=0;//     #v2=(Reference,[Ljava/lang/Object;);v3=(Null);v5=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     const-string v1, "rqdp{ your crash handle finish error} %s"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 159
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     const-string v0, "rqdp{ kill!}"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Landroid/os/Process;->killProcess(I)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/lang/System;->exit(I)V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Uninit);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
