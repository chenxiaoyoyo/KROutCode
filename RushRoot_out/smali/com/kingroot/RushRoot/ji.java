package com.kingroot.RushRoot; class ji { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/ji;
a=0;// .super Landroid/content/pm/PackageManager;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile a:Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ji;->a:Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0}, Landroid/content/pm/PackageManager;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ji;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/kingroot/RushRoot/ji;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ji;->a:Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ji;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ji;->a:Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ji;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/ji;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ji;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ji;->a:Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ji;->a:Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 66
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
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
a=0;// .method public addPackageToPreferred(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 752
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->addPackageToPreferred(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 754
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addPermission(Landroid/content/pm/PermissionInfo;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->addPermission(Landroid/content/pm/PermissionInfo;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 335
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 328
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 329
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v1, v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 332
a=0;//     check-cast v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addPermissionAsync(Landroid/content/pm/PermissionInfo;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->addPermissionAsync(Landroid/content/pm/PermissionInfo;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 348
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 342
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 343
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v1, v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 345
a=0;//     check-cast v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addPreferredActivity(Landroid/content/IntentFilter;I[Landroid/content/ComponentName;Landroid/content/ComponentName;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 781
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Landroid/content/pm/PackageManager;->addPreferredActivity(Landroid/content/IntentFilter;I[Landroid/content/ComponentName;Landroid/content/ComponentName;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 784
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public canonicalToCurrentPackageNames([Ljava/lang/String;)[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->canonicalToCurrentPackageNames([Ljava/lang/String;)[Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public checkPermission(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 318
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v0, -0x270f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public checkSignatures(II)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->checkSignatures(II)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 379
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v0, -0x270f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public checkSignatures(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->checkSignatures(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 368
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v0, -0x270f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clearPackagePreferredActivities(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->clearPackagePreferredActivities(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 793
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public currentToCanonicalPackageNames([Ljava/lang/String;)[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->currentToCanonicalPackageNames([Ljava/lang/String;)[Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 583
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 590
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 591
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 584
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 585
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 587
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 593
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityIcon(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 600
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 607
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 608
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 601
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 602
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 604
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 610
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 244
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 245
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 246
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 254
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 872
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 874
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 881
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 882
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 875
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 876
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 878
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 884
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityLogo(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 889
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 891
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getActivityLogo(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 898
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 899
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 892
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 893
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 895
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 901
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAllPermissionGroups(I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 213
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getAllPermissionGroups(I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 215
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationEnabledSetting(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 849
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationEnabledSetting(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 856
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 850
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 851
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v1, v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 853
a=0;//     check-cast v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 856
a=0;//     :cond_0
a=0;//     const/16 v0, -0x270f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 627
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 629
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 637
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 646
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 647
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 640
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 641
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 643
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 649
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 226
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 233
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 227
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 230
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 677
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 679
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationLogo(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 906
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 908
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getApplicationLogo(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 910
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationLogo(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 918
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 920
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationLogo(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 927
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 928
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 921
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 922
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 924
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 930
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getComponentEnabledSetting(Landroid/content/ComponentName;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 825
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 826
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 828
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v0, -0x270f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 616
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 618
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 571
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 573
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getInstalledApplications(I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 409
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 411
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getInstalledPackages(I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 299
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 307
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 742
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 744
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getInstrumentationInfo(Landroid/content/ComponentName;I)Landroid/content/pm/InstrumentationInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 548
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getInstrumentationInfo(Landroid/content/ComponentName;I)Landroid/content/pm/InstrumentationInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 550
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 132
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getNameForUid(I)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 398
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 400
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPackageGids(Ljava/lang/String;)[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getPackageGids(Ljava/lang/String;)[I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 149
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 143
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 144
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 86
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPackagesForUid(I)[Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 389
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPermissionGroupInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionGroupInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 196
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getPermissionGroupInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionGroupInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 197
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 198
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 200
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 167
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 162
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPreferredActivities(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 801
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->getPreferredActivities(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 804
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPreferredPackages(I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 770
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getPreferredPackages(I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 772
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getProviderInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 936
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 938
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getProviderInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 945
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 946
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 939
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 940
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 942
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 948
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getReceiverInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 262
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getReceiverInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 269
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 263
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 264
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 266
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 272
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getResourcesForActivity(Landroid/content/ComponentName;)Landroid/content/res/Resources;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 687
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 689
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getResourcesForActivity(Landroid/content/ComponentName;)Landroid/content/res/Resources;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 696
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 697
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 690
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 691
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 693
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 699
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 705
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 707
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 714
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 715
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 708
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 709
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 711
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 717
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 723
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 725
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 733
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 734
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 727
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 728
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 730
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 736
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 281
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 282
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 283
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 285
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 431
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager;->getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 433
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Landroid/content/pm/FeatureInfo;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSystemSharedLibraryNames()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 418
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 420
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager;->getSystemSharedLibraryNames()[Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 422
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getText(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 656
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->getText(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 658
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getXml(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/content/res/XmlResourceParser;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->getXml(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/content/res/XmlResourceParser;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 669
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasSystemFeature(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 441
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 443
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSafeMode()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 862
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager;->isSafeMode()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 864
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 492
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 494
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryContentProviders(Ljava/lang/String;II)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->queryContentProviders(Ljava/lang/String;II)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 539
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryInstrumentation(Ljava/lang/String;I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->queryInstrumentation(Ljava/lang/String;I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 562
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 465
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 468
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2, p3, p4}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 482
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 515
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 517
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public queryPermissionsByGroup(Ljava/lang/String;I)Ljava/util/List;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->queryPermissionsByGroup(Ljava/lang/String;I)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 185
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v2, v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     check-cast v0, Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removePackageFromPreferred(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 761
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->removePackageFromPreferred(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 763
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removePermission(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 354
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->removePermission(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 361
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 355
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 356
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v1, v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 358
a=0;//     check-cast v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 453
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 455
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 527
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 503
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 505
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setApplicationEnabledSetting(Ljava/lang/String;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 837
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->setApplicationEnabledSetting(Ljava/lang/String;II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 840
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setComponentEnabledSetting(Landroid/content/ComponentName;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 813
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 816
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
