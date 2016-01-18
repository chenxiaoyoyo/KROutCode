package com.kingroot.sdk.commom; class c { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/commom/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Ljava/lang/String;
a=0;// 
a=0;// .field private static b:Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;// .field private static c:Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;// .field private static d:Lcom/kingroot/RushRoot/gj;
a=0;// 
a=0;// .field private static e:Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;// .field private static f:Lcom/kingroot/RushRoot/gk;
a=0;// 
a=0;// .field private static g:Lcom/kingroot/RushRoot/gm;
a=0;// 
a=0;// .field private static h:Lcom/kingroot/RushRoot/gu;
a=0;// 
a=0;// .field private static i:J
a=0;// 
a=0;// .field private static j:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Lcom/kingroot/RushRoot/gp;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->c:Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gp;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/kingroot/RushRoot/hb;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     const-class v1, Lcom/kingroot/sdk/commom/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v2, Lcom/kingroot/sdk/commom/c;->b:Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     .line 183
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/hb;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Lcom/kingroot/RushRoot/hb;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 184
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/j;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/kingroot/RushRoot/hb;->l:Ljava/lang/String;
a=0;// 
a=0;//     .line 185
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v2, Lcom/kingroot/RushRoot/hb;->h:I
a=0;// 
a=0;//     .line 187
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Lcom/kingroot/RushRoot/hb;->k:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 188
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
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
a=0;// .method public static a(ILandroid/content/Context;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v10, 0x27
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v2=(Null);
a=0;//     new-instance v4, Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/RushRoot/hb;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/RushRoot/hb;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/hb;);
a=0;//     const-string v0, "7DCC07BEEF647B2D"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/hb;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     sget v0, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v4, Lcom/kingroot/RushRoot/hb;->p:I
a=0;// 
a=0;//     .line 69
a=0;//     new-array v5, v9, [Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     const-string v0, "ro.mediatek.platform"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v5, v2
a=0;// 
a=0;//     const-string v0, "ro.build.hidden_ver"
a=0;// 
a=0;//     aput-object v0, v5, v1
a=0;// 
a=0;//     const-string v0, "ro.product.model"
a=0;// 
a=0;//     aput-object v0, v5, v8
a=0;// 
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v7=(Conflicted);
a=0;//     if-lt v3, v6, :cond_2
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/hb;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     iput v10, v4, Lcom/kingroot/RushRoot/hb;->i:I
a=0;// 
a=0;//     .line 71
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v4, Lcom/kingroot/RushRoot/hb;->o:I
a=0;// 
a=0;//     .line 73
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "[\\.]"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gt;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gt;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gt;);
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/hb;->j:Lcom/kingroot/RushRoot/gt;
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v5, v4, Lcom/kingroot/RushRoot/hb;->j:Lcom/kingroot/RushRoot/gt;
a=0;// 
a=0;//     array-length v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 76
a=0;//     aget-object v0, v3, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 75
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/RushRoot/gt;->a:I
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v5, v4, Lcom/kingroot/RushRoot/hb;->j:Lcom/kingroot/RushRoot/gt;
a=0;// 
a=0;//     array-length v0, v3
a=0;// 
a=0;//     if-lt v0, v8, :cond_4
a=0;// 
a=0;//     .line 78
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 77
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/RushRoot/gt;->b:I
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, v4, Lcom/kingroot/RushRoot/hb;->j:Lcom/kingroot/RushRoot/gt;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gt;);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     if-lt v0, v9, :cond_5
a=0;// 
a=0;//     aget-object v0, v3, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/RushRoot/gt;->c:I
a=0;// 
a=0;//     .line 82
a=0;//     sput-object v4, Lcom/kingroot/sdk/commom/c;->b:Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gp;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gp;-><init>()V
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gp;);
a=0;//     iput v8, v0, Lcom/kingroot/RushRoot/gp;->a:I
a=0;// 
a=0;//     .line 88
a=0;//     const/16 v1, 0xc9
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/gp;->b:I
a=0;// 
a=0;//     .line 89
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->c:Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gj;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gj;-><init>()V
a=0;// 
a=0;//     .line 95
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gj;);
a=0;//     iput v10, v0, Lcom/kingroot/RushRoot/gj;->b:I
a=0;// 
a=0;//     .line 96
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/gj;->c:I
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 103
a=0;//     const/16 v4, 0x2000
a=0;// 
a=0;//     .line 102
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 104
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/gj;->c:I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 112
a=0;//     :cond_1
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->d:Lcom/kingroot/RushRoot/gj;
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gz;-><init>()V
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gz;);
a=0;//     const-string v1, "7DCC07BEEF647B2D"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gz;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 119
a=0;//     const-string v1, "EP_KingRoot_SDK"
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gz;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 120
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gz;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 121
a=0;//     iput v8, v0, Lcom/kingroot/RushRoot/gz;->h:I
a=0;// 
a=0;//     .line 122
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gz;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 123
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gz;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {p1}, Lcom/kingroot/sdk/util/j;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 125
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Lcom/kingroot/sdk/util/j;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 126
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "screen="
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "*"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gz;->k:Ljava/lang/String;
a=0;// 
a=0;//     .line 127
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/gz;->m:I
a=0;// 
a=0;//     .line 129
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/gz;->o:I
a=0;// 
a=0;//     .line 130
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->e:Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gk;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gk;-><init>()V
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gk;);
a=0;//     const-string v1, "android_id"
a=0;// 
a=0;//     .line 136
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gk;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 138
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/fm;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/gk;->f:I
a=0;// 
a=0;//     .line 139
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gk;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 141
a=0;//     sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gk;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 143
a=0;//     invoke-static {p1}, Lcom/kingroot/sdk/util/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 142
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gk;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 144
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gk;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->f:Lcom/kingroot/RushRoot/gk;
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gm;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gm;-><init>()V
a=0;// 
a=0;//     .line 149
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gm;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 148
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gm;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 150
a=0;//     sget-object v1, Lcom/kingroot/sdk/commom/c;->c:Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gm;->b:Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     .line 151
a=0;//     iput p0, v0, Lcom/kingroot/RushRoot/gm;->c:I
a=0;// 
a=0;//     .line 152
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->g:Lcom/kingroot/RushRoot/gm;
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gu;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gu;-><init>()V
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gu;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->h:Lcom/kingroot/RushRoot/gu;
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/c;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 160
a=0;//     const-string v0, "session_id"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 161
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 163
a=0;//     :try_start_1
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/kingroot/sdk/commom/c;->i:J
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "local sessionId = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v1, Lcom/kingroot/sdk/commom/c;->i:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 172
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(One);v2=(Null);
a=0;//     aget-object v0, v5, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Reference,[Ljava/lang/String;);v7=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Reference,Lcom/kingroot/RushRoot/gt;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 166
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/kingroot/sdk/commom/c;->i:J
a=0;// 
a=0;//     .line 167
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "no local sessionId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Null);v3=(Reference,Ljava/lang/Object;);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 109
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static a(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     sput-wide p0, Lcom/kingroot/sdk/commom/c;->i:J
a=0;// 
a=0;//     .line 270
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->b:Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hb;);
a=0;//     sget-object v1, Lcom/kingroot/sdk/commom/c;->d:Lcom/kingroot/RushRoot/gj;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gj;);
a=0;//     sget-object v2, Lcom/kingroot/sdk/commom/c;->e:Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/gz;);
a=0;//     iput-object p0, v2, Lcom/kingroot/RushRoot/gz;->n:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p0, v1, Lcom/kingroot/RushRoot/gj;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p0, v0, Lcom/kingroot/RushRoot/hb;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 275
a=0;//     sput-object p0, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 276
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b()Lcom/kingroot/RushRoot/gj;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->d:Lcom/kingroot/RushRoot/gj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gj;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b(Landroid/content/Context;)Lcom/kingroot/RushRoot/gz;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     const-class v1, Lcom/kingroot/sdk/commom/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->e:Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;//     .line 227
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gz;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gz;->r:Ljava/lang/String;
a=0;// 
a=0;//     .line 228
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gz;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 229
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/j;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gz;->e:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 231
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 226
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
a=0;// .method public static declared-synchronized c(Landroid/content/Context;)Lcom/kingroot/RushRoot/gk;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     const-class v1, Lcom/kingroot/sdk/commom/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->f:Lcom/kingroot/RushRoot/gk;
a=0;// 
a=0;//     .line 241
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gk;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gk;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 242
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/j;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gk;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/j;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gk;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 245
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/j;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 244
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gk;->d:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 247
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 240
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
a=0;// .method public static declared-synchronized c()Lcom/kingroot/RushRoot/gm;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     const-class v0, Lcom/kingroot/sdk/commom/c;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/kingroot/sdk/commom/c;->g:Lcom/kingroot/RushRoot/gm;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 254
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gm;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 253
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
a=0;// .method public static declared-synchronized d()Lcom/kingroot/RushRoot/gu;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     const-class v1, Lcom/kingroot/sdk/commom/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->h:Lcom/kingroot/RushRoot/gu;
a=0;// 
a=0;//     .line 261
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gu;);
a=0;//     sget-wide v2, Lcom/kingroot/sdk/commom/c;->i:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/RushRoot/gu;->a:J
a=0;// 
a=0;//     .line 262
a=0;//     sget-object v2, Lcom/kingroot/sdk/commom/c;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gu;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 263
a=0;//     sget-object v2, Lcom/kingroot/sdk/commom/c;->f:Lcom/kingroot/RushRoot/gk;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/RushRoot/gk;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gu;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 264
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/f;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/gu;->d:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 265
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 260
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
