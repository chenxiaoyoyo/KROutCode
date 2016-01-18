package com.kingroot.kinguser.util; class ProcessUtils { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/util/ProcessUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static final declared-synchronized K(Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     const-class v2, Lcom/kingroot/kinguser/util/ProcessUtils;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/util/ProcessUtils;->lK()Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v3, Ljava/util/HashSet;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v3}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 158
a=0;//     #v3=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v3, p0}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 162
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     invoke-interface {p0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 163
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v5, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v3=(Reference,Ljava/util/HashSet;);v5=(Uninit);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 172
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static O(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 422
a=0;//     #v2=(Null);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 423
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 424
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 426
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 431
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a([BIC)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     .line 338
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 339
a=0;//     array-length v0, p0
a=0;// 
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     aget-byte v0, p0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v0, p2, :cond_2
a=0;// 
a=0;//     .line 344
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aX(I)Ljava/lang/String;
a=0;//	   # done aX == getProcessName()
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 37
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;
a=0;// 
a=0;//     .line 38
a=0;//     iget v2, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aY(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/util/ProcessUtils;->aZ(I)Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     .line 187
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static aZ(I)Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 348
a=0;//     .line 355
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     const-string v2, "/proc/%d/cmdline"
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
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v3, v5
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/uu;->r(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 356
a=0;//     #v2=(Reference,[B);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 358
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v0, v3}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 359
a=0;//     #v3=(Integer);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-direct {v0, v2, v5, v3}, Ljava/lang/String;-><init>([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 362
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     const-string v3, "/proc/%d/status"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
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
a=0;//     invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x96
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/uu;->r(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 363
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 365
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     .line 366
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v5, v3, v6}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 367
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Integer);v7=(Conflicted);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 414
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     if-eq v3, v1, :cond_0
a=0;// 
a=0;//     if-ne v2, v1, :cond_5
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v4
a=0;// 
a=0;//     .line 417
a=0;//     :goto_3
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 372
a=0;//     :cond_1
a=0;//     #v2=(PosByte);v3=(PosByte);v6=(Integer);v7=(Reference,Ljava/lang/Integer;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 373
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     sub-int v7, v6, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v3, v5, v2, v7}, Ljava/lang/String;-><init>([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 377
a=0;//     :goto_4
a=0;//     #v3=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {v5, v0, v2}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 379
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     invoke-static {v5, v0, v2}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 381
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     invoke-static {v5, v0, v2}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 382
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 383
a=0;//     #v2=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 385
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(PosByte);
a=0;//     add-int/lit8 v2, v0, 0x7
a=0;// 
a=0;//     .line 388
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v5, v0, v6}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 389
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 390
a=0;//     #v2=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 394
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     new-instance v6, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/String;);
a=0;//     sub-int v7, v0, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v6, v5, v2, v7}, Ljava/lang/String;-><init>([BII)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 397
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     :try_start_3
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v5, v0, v6}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 398
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 399
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 401
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x6
a=0;// 
a=0;//     .line 404
a=0;//     add-int/lit8 v6, v0, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {v5, v6, v7}, Lcom/kingroot/kinguser/util/ProcessUtils;->a([BIC)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 405
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     sub-int/2addr v6, v0
a=0;// 
a=0;//     invoke-direct {v7, v5, v0, v6}, Ljava/lang/String;-><init>([BII)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 410
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Integer);v3=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 417
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     invoke-direct {v0, p0, v3, v5, v2}, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;-><init>(IILjava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 410
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Integer);v2=(Integer);v5=(Reference,[B);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Integer);v2=(Integer);v6=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(PosByte);v3=(PosByte);v7=(Reference,Ljava/lang/Integer;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(PosShort);v6=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,[B);v5=(Null);v6=(Reference,Ljava/lang/Integer;);v7=(Uninit);
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static ce(Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 67
a=0;//     #v0=(One);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "service call activity 79 s16 "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static cf(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 440
a=0;//     #v0=(Byte);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 451
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 444
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 445
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 446
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/util/ProcessUtils;->K(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 447
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 448
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static lK()Ljava/util/List;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 311
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 313
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/proc"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 314
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v3, :cond_2
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     .line 317
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 318
a=0;//     #v5=(Char);
a=0;//     const/16 v6, 0x39
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-gt v5, v6, :cond_0
a=0;// 
a=0;//     const/16 v6, 0x30
a=0;// 
a=0;//     if-ge v5, v6, :cond_1
a=0;// 
a=0;//     .line 314
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ujava/lang/Object;);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 323
a=0;//     :cond_1
a=0;//     #v4=(Null);v6=(PosByte);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 324
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/util/ProcessUtils;->aZ(I)Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 325
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 328
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 333
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static r(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/util/ProcessUtils;->ce(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/util/ProcessUtils;->s(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static s(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/util/ProcessUtils;->t(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static t(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 115
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
a=0;//     .line 116
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
a=0;//     .line 117
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 119
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
a=0;//     .line 126
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/content/pm/ServiceInfo;);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v4, v1, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget-boolean v1, v1, Landroid/content/pm/ServiceInfo;->exported:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 129
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 132
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :catch_1
a=0;//     #v1=(Null);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 120
a=0;//     :catch_2
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_1
a=0;// .end method
}}
