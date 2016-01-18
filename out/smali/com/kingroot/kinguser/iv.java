package com.kingroot.kinguser; class iv { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/iv;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static ed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/iv;->ee()V
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/iv;->ef()V
a=0;// 
a=0;//     .line 33
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/iv;->eg()V
a=0;// 
a=0;//     .line 34
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/iw;->eh()Lcom/kingroot/kinguser/iw;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/iw;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/iw;->ei()I
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static ee()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     .line 41
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 42
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 43
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 53
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v3=(Reference,[Landroid/content/pm/ActivityInfo;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v3, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     aget-object v5, v3, v0
a=0;// 
a=0;//     .line 58
a=0;//     #v5=(Null);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     iget-object v6, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     iget-object v6, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 57
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v5=(Integer);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 63
a=0;//     :cond_3
a=0;//     #v5=(Null);v6=(Boolean);
a=0;//     new-instance v6, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v1, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     #v6=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2, v6}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v8, :cond_2
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v2, v6, v5, v7}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->ka()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 73
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static ef()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ii;->dM()Lcom/kingroot/kinguser/ii;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ii;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ii;->dN()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v2, Lcom/kingroot/kinguser/common/firewall/Rule;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/common/firewall/Rule;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/common/firewall/Rule;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/common/firewall/Rule;);
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/common/firewall/Rule;->uid:I
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/common/firewall/Rule;->type:I
a=0;// 
a=0;//     .line 95
a=0;//     const-string v1, "ACCEPT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/common/firewall/Rule;->iI:Ljava/lang/String;
a=0;// 
a=0;//     .line 96
a=0;//     const-string v1, "ACCEPT"
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/common/firewall/Rule;->iJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ii;->dO()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/ii;->w(Z)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/ii;->a(Lcom/kingroot/kinguser/common/firewall/Rule;)V
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->kb()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Reference,Lcom/kingroot/kinguser/common/firewall/Rule;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ii;->dP()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 105
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/ii;->w(Z)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/ii;->a(Lcom/kingroot/kinguser/common/firewall/Rule;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static eg()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 121
a=0;//     #v4=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 124
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     new-instance v2, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-class v3, Lcom/kingroot/kinguser/activitys/SliderMainActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 125
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v4, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 135
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
