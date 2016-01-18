package com.kingroot.kinguser; class lz { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/lz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static mR:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ma;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ma;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ma;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ma;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/lz;->mR:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/pm/PackageInfo;)J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 159
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 160
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hM()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 41
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eJ()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x19bfcc00
a=0;// 
a=0;//     .line 43
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/ly;->r(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/lz;->mR:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hN()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 70
a=0;//     #v2=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vb;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Integer);v2=(One);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 86
a=0;//     :try_start_1
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 91
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     iget-object v7, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/vd;->bX(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v8, Lcom/kingroot/kinguser/ze;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/kingroot/kinguser/ze;);
a=0;//     invoke-direct {v8}, Lcom/kingroot/kinguser/ze;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v8=(Reference,Lcom/kingroot/kinguser/ze;);
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Lcom/kingroot/kinguser/ze;->cM(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v9, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/kingroot/kinguser/ze;->cO(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v9, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/kingroot/kinguser/ze;->cN(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v9, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/kingroot/kinguser/ze;->setName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget v9, v0, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Lcom/kingroot/kinguser/ze;->bp(I)V
a=0;// 
a=0;//     .line 99
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Lcom/kingroot/kinguser/ze;->cQ(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-virtual {v8, v1}, Lcom/kingroot/kinguser/ze;->bd(I)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lz;->a(Landroid/content/pm/PackageInfo;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, v0}, Lcom/kingroot/kinguser/ze;->bJ(I)V
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zf;);
a=0;//     invoke-direct {v0, v8}, Lcom/kingroot/kinguser/zf;-><init>(Lcom/kingroot/kinguser/ze;)V
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zf;);
a=0;//     invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 106
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 86
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Reference,Lcom/kingroot/kinguser/ze;);v9=(Integer);v10=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 100
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 110
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yz;);
a=0;//     invoke-direct {v0, v5}, Lcom/kingroot/kinguser/yz;-><init>(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yz;);
a=0;//     invoke-static {v4, v0}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/yz;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jc;->m(J)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
