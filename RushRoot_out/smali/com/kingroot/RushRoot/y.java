package com.kingroot.RushRoot; class y { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/y;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/kingroot/RushRoot/bm;
a=0;// 
a=0;// .field private static b:Lcom/kingroot/RushRoot/bg;
a=0;// 
a=0;// .field private static c:Lcom/kingroot/RushRoot/bd;
a=0;// 
a=0;// .field private static d:Lcom/kingroot/RushRoot/bk;
a=0;// 
a=0;// .field private static e:Lcom/kingroot/RushRoot/be;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Lcom/kingroot/RushRoot/bg;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/y;->b:Lcom/kingroot/RushRoot/bg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bg;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v10, 0xe
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
a=0;//     .line 46
a=0;//     #v2=(Null);
a=0;//     new-instance v4, Lcom/kingroot/RushRoot/bm;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/RushRoot/bm;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/RushRoot/bm;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/bm;);
a=0;//     const-string v0, "02EE4B8C067620D3"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/bm;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ak;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/bm;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 49
a=0;//     const/16 v0, 0x107
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, v4, Lcom/kingroot/RushRoot/bm;->p:I
a=0;// 
a=0;//     .line 50
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
a=0;//     if-ge v3, v6, :cond_2
a=0;// 
a=0;//     aget-object v0, v5, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/commom/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/bm;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     iput v10, v4, Lcom/kingroot/RushRoot/bm;->i:I
a=0;// 
a=0;//     .line 52
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v4, Lcom/kingroot/RushRoot/bm;->o:I
a=0;// 
a=0;//     .line 54
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ak;->b()Ljava/lang/String;
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
a=0;//     .line 55
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bi;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bi;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bi;);
a=0;//     iput-object v0, v4, Lcom/kingroot/RushRoot/bm;->j:Lcom/kingroot/RushRoot/bi;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v5, v4, Lcom/kingroot/RushRoot/bm;->j:Lcom/kingroot/RushRoot/bi;
a=0;// 
a=0;//     array-length v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     aget-object v0, v3, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/RushRoot/bi;->a:I
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v5, v4, Lcom/kingroot/RushRoot/bm;->j:Lcom/kingroot/RushRoot/bi;
a=0;// 
a=0;//     array-length v0, v3
a=0;// 
a=0;//     if-lt v0, v8, :cond_4
a=0;// 
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/RushRoot/bi;->b:I
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, v4, Lcom/kingroot/RushRoot/bm;->j:Lcom/kingroot/RushRoot/bi;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/bi;);
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
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/RushRoot/bi;->c:I
a=0;// 
a=0;//     .line 60
a=0;//     sput-object v4, Lcom/kingroot/RushRoot/y;->a:Lcom/kingroot/RushRoot/bm;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bg;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bg;);
a=0;//     iput v8, v0, Lcom/kingroot/RushRoot/bg;->a:I
a=0;// 
a=0;//     .line 66
a=0;//     const/16 v1, 0xc9
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/bg;->b:I
a=0;// 
a=0;//     .line 67
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/y;->b:Lcom/kingroot/RushRoot/bg;
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bd;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bd;-><init>()V
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bd;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ak;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bd;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 73
a=0;//     iput v10, v0, Lcom/kingroot/RushRoot/bd;->b:I
a=0;// 
a=0;//     .line 74
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/bd;->c:I
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 79
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x2000
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 80
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/bd;->c:I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/y;->c:Lcom/kingroot/RushRoot/bd;
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bk;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bk;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bk;);
a=0;//     const-string v1, "02EE4B8C067620D3"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     const-string v1, "EP_KingRoot"
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ak;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 97
a=0;//     iput v8, v0, Lcom/kingroot/RushRoot/bk;->h:I
a=0;// 
a=0;//     .line 98
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 99
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 100
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->e(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 101
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 102
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
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->k:Ljava/lang/String;
a=0;// 
a=0;//     .line 103
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/bk;->m:I
a=0;// 
a=0;//     .line 104
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ak;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bk;->n:Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/bk;->o:I
a=0;// 
a=0;//     .line 106
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/y;->d:Lcom/kingroot/RushRoot/bk;
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/be;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/be;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/be;-><init>()V
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/be;);
a=0;//     const-string v1, "android_id"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/be;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 113
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/bs;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/be;->f:I
a=0;// 
a=0;//     .line 114
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/be;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 115
a=0;//     sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/be;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/al;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/be;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 117
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/x;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/be;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 118
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/y;->e:Lcom/kingroot/RushRoot/be;
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v1=(One);v7=(Boolean);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v3=(Reference,[Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Reference,Lcom/kingroot/RushRoot/bi;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bd;);v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 87
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public static b()Lcom/kingroot/RushRoot/bd;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/y;->c:Lcom/kingroot/RushRoot/bd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bd;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b(Landroid/content/Context;)Lcom/kingroot/RushRoot/bm;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     const-class v1, Lcom/kingroot/RushRoot/y;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v2, Lcom/kingroot/RushRoot/y;->a:Lcom/kingroot/RushRoot/bm;
a=0;// 
a=0;//     .line 129
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/bm;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/x;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Lcom/kingroot/RushRoot/bm;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 130
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/kingroot/RushRoot/bm;->l:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
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
a=0;//     iput v0, v2, Lcom/kingroot/RushRoot/bm;->h:I
a=0;// 
a=0;//     .line 132
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/x;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Lcom/kingroot/RushRoot/bm;->k:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 133
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
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
a=0;// .method public static declared-synchronized c(Landroid/content/Context;)Lcom/kingroot/RushRoot/bk;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     const-class v1, Lcom/kingroot/RushRoot/y;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/y;->d:Lcom/kingroot/RushRoot/bk;
a=0;// 
a=0;//     .line 169
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bk;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/x;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/bk;->r:Ljava/lang/String;
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/x;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/bk;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 171
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/bk;->e:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 173
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 168
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
a=0;// .method public static declared-synchronized d(Landroid/content/Context;)Lcom/kingroot/RushRoot/be;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     const-class v1, Lcom/kingroot/RushRoot/y;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/y;->e:Lcom/kingroot/RushRoot/be;
a=0;// 
a=0;//     .line 183
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/be;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/x;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/be;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 184
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/be;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 185
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/be;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 186
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/ar;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/be;->d:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 188
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 182
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
