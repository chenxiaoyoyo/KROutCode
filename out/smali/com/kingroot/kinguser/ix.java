package com.kingroot.kinguser; class ix { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ix;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static ja:I
a=0;// 
a=0;// .field public static jb:I
a=0;// 
a=0;// .field private static jc:Lcom/kingroot/kinguser/ix;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/kinguser/ix;->ja:I
a=0;// 
a=0;//     .line 39
a=0;//     const/16 v0, 0x3f
a=0;// 
a=0;//     sput v0, Lcom/kingroot/kinguser/ix;->jb:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ix;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aC(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 160
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ej()Lcom/kingroot/kinguser/ix;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ix;->jc:Lcom/kingroot/kinguser/ix;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ix;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ix;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ix;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ix;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ix;->jc:Lcom/kingroot/kinguser/ix;
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ix;->jc:Lcom/kingroot/kinguser/ix;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private g(Ljava/lang/String;Z)I
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     .line 71
a=0;//     #v1=(Null);
a=0;//     const-class v0, Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "FLAG_DISABLE_AUTOSTART"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v5}, Lcom/kingroot/kinguser/ix;->s(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Integer);
a=0;//     const-string v5, "ro.miui.ui.version.name"
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/we;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 74
a=0;//     if-ne v0, v9, :cond_6
a=0;// 
a=0;//     .line 75
a=0;//     const-string v0, "com.android.internal.app.IAppOpsService$Stub"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "TRANSACTION_setMode"
a=0;// 
a=0;//     invoke-direct {p0, v0, v5}, Lcom/kingroot/kinguser/ix;->s(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 77
a=0;//     #v5=(Integer);
a=0;//     const-string v6, "service call %s %d i32 %d i32 %d s16 %s i32 %d"
a=0;// 
a=0;//     .line 79
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v7, p1, v8}, Lcom/kingroot/kinguser/vb;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/pm/ApplicationInfo;);v8=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Integer);
a=0;//     if-ne v5, v9, :cond_2
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(PosByte);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/pm/ApplicationInfo;);v1=(Null);v3=(PosByte);v5=(Integer);v7=(Reference,Ujava/lang/Object;);
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 88
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     if-eq v0, v9, :cond_3
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 94
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 96
a=0;//     :cond_4
a=0;//     #v1=(Null);v7=(Boolean);
a=0;//     const/4 v7, 0x6
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v8, "appops"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v7, v1
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v7, v8
a=0;// 
a=0;//     const/16 v5, 0x32
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v7, v2
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v7, v3
a=0;// 
a=0;//     aput-object p1, v7, v4
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v7, v3
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/ix;->aC(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 96
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/Integer;);v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 99
a=0;//     :cond_6
a=0;//     #v0=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const-string v5, "android.content.pm.IPackageManager$Stub"
a=0;// 
a=0;//     const-string v6, "TRANSACTION_setApplicationEnabledSetting"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5, v6}, Lcom/kingroot/kinguser/ix;->s(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 100
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v9, :cond_7
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 101
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_7
a=0;//     #v1=(Null);
a=0;//     const-string v6, "service call %s %d s16 %s i32 %d i32 %d i32 %d s16 %s"
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v8, "package"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v7, v1
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v7, v8
a=0;// 
a=0;//     aput-object p1, v7, v2
a=0;// 
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v7, v3
a=0;// 
a=0;//     if-eqz p2, :cond_8
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_8
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v7, v4
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     const-string v3, "com.android.settings"
a=0;// 
a=0;//     aput-object v3, v7, v0
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 107
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/ix;->aC(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 82
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Null);v3=(PosByte);v5=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private h(Ljava/lang/String;Z)I
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x4000
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v8, -0x4001
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 114
a=0;//     #v2=(One);
a=0;//     const-class v3, Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "FLAG_DISABLE_AUTOSTART"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/kinguser/ix;->s(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 115
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "ro.miui.ui.version.name"
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/we;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 120
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     const-string v4, "content query --uri  content://com.lbe.security.miui.permmgr/active/%s --projection userAccept:userReject"
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
a=0;//     aput-object p1, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v5}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 125
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(One);v3=(Reference,Lcom/kingroot/kinguser/gn;);v4=(Reference,Ljava/lang/String;);v5=(Boolean);v6=(Null);v7=(Uninit);v8=(LongLo);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 126
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     const-string v3, "userAccept="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const-string v4, ", userReject"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 132
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "userReject="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 133
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     .line 134
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aget-object v2, v2, v5
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v6, v2
a=0;// 
a=0;//     .line 137
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 138
a=0;//     or-long v4, v3, v10
a=0;// 
a=0;//     .line 139
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     and-long v2, v6, v8
a=0;// 
a=0;//     .line 146
a=0;//     :goto_1
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-string v6, "content update --uri  content://com.lbe.security.miui.permmgr/active/%s --bind userAccept:l:%d --bind userReject:l:%d"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p1, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v7, v8
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v2, v7, v4
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 148
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/ix;->aC(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Integer);v3=(LongLo);v4=(LongHi);v5=(One);v6=(LongLo);v7=(LongHi);v8=(LongLo);
a=0;//     and-long v4, v3, v8
a=0;// 
a=0;//     .line 142
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     or-long v2, v6, v10
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private s(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Byte);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/fy;->R(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     invoke-static {p2, v0}, Lcom/kingroot/kinguser/fy;->g(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public f(Ljava/lang/String;Z)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/ix;->g(Ljava/lang/String;Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/ix;->h(Ljava/lang/String;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     :cond_1
a=0;//     return v0
a=0;// .end method
}}
