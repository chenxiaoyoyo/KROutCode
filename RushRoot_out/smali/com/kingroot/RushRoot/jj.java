package com.kingroot.RushRoot; class jj { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static a([BIC)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     .line 314
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 320
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     return v1
a=0;// 
a=0;//     .line 315
a=0;//     :cond_1
a=0;//     array-length v0, p0
a=0;// 
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     aget-byte v0, p0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v0, p2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(I)Lcom/kingroot/RushRoot/jk;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 324
a=0;//     .line 330
a=0;//     :try_start_0
a=0;//     #v2=(Byte);
a=0;//     sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     const-string v3, "/proc/%d/cmdline"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v1, v3}, Lcom/kingroot/RushRoot/jf;->a(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 332
a=0;//     #v3=(Reference,[B);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 334
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v1, v4}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 335
a=0;//     #v4=(Integer);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-direct {v1, v3, v5, v4}, Ljava/lang/String;-><init>([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 338
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     const-string v4, "/proc/%d/status"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x96
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-static {v3, v4}, Lcom/kingroot/RushRoot/jf;->a(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 339
a=0;//     #v4=(Reference,[B);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 341
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v3, v5}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 343
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 344
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 349
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     add-int/lit8 v7, v5, -0x6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v3, v4, v6, v7}, Ljava/lang/String;-><init>([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 353
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     add-int/lit8 v1, v5, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     :try_start_2
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v1, v5}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 355
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     invoke-static {v4, v1, v5}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 357
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     invoke-static {v4, v1, v5}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 358
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 359
a=0;//     add-int/lit8 v5, v1, 0x7
a=0;// 
a=0;//     .line 364
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     invoke-static {v4, v1, v6}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 365
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     sub-int v7, v6, v5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v1, v4, v5, v7}, Ljava/lang/String;-><init>([BII)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 373
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v5, v6, 0x1
a=0;// 
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     :try_start_3
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v4, v5, v6}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 374
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 375
a=0;//     add-int/lit8 v5, v5, 0x6
a=0;// 
a=0;//     .line 380
a=0;//     add-int/lit8 v6, v5, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {v4, v6, v7}, Lcom/kingroot/RushRoot/jj;->a([BIC)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 381
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     sub-int/2addr v6, v5
a=0;// 
a=0;//     invoke-direct {v7, v4, v5, v6}, Ljava/lang/String;-><init>([BII)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v8, v4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v8
a=0;// 
a=0;//     .line 390
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     if-eq v3, v2, :cond_0
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 393
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jk;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 387
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);v3=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 393
a=0;//     :cond_1
a=0;//     #v1=(Integer);v8=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jk;);
a=0;//     invoke-direct {v0, p0, v3, v4, v1}, Lcom/kingroot/RushRoot/jk;-><init>(IILjava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jk;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 387
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);v8=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v4=(Reference,[B);v5=(Integer);v6=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Integer);
a=0;//     move-exception v4
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(PosByte);v7=(Integer);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v3=(Reference,Ljava/lang/String;);v6=(Integer);v7=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(PosByte);v6=(Null);v7=(Reference,Ljava/lang/Integer;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     move-object v4, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Reference,[B);v5=(Null);v6=(Reference,Ljava/lang/Integer;);v7=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final declared-synchronized a()Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     const-class v0, Lcom/kingroot/RushRoot/jj;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jj;->b()Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 127
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 126
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     .line 83
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 84
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ji;->a()Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 86
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ji;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningServiceInfo;
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v1, v0, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v4, v0, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/content/pm/ServiceInfo;);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v4, v1, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 103
a=0;//     iget-boolean v1, v1, Landroid/content/pm/ServiceInfo;->exported:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 105
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Null);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 97
a=0;//     :catch_2
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(One);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "service call activity 79 s16 "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
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
a=0;//     invoke-virtual {p1}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v0=(One);v2=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 34
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Integer);v2=(PosByte);
a=0;//     invoke-static {p0, p2}, Lcom/kingroot/RushRoot/jj;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b()Ljava/util/List;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 289
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/proc"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 290
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     return-object v1
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     .line 293
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 294
a=0;//     #v5=(Char);
a=0;//     const/16 v6, 0x39
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-gt v5, v6, :cond_1
a=0;// 
a=0;//     const/16 v6, 0x30
a=0;// 
a=0;//     if-ge v5, v6, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ujava/lang/Object;);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     :cond_2
a=0;//     #v4=(Null);v6=(PosByte);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 300
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/jj;->a(I)Lcom/kingroot/RushRoot/jk;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 301
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/jk;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
}}
