package com.kingroot.RushRoot; class fh { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/fh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;)I
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     const/4 v13, 0x7
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v11, 0x7c
a=0;// 
a=0;//     .line 210
a=0;//     #v11=(PosByte);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     sget v1, Lcom/kingroot/RushRoot/eq;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v3}, Lcom/kingroot/RushRoot/fg;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fd;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Su count: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-lt v1, v4, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 230
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     #v0=(Null);v4=(Integer);
a=0;//     const-string v5, "reportroot_name_scan_su_result"
a=0;// 
a=0;//     invoke-virtual {p0, v5, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "result_"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     const-string v6, "\t"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v6, v7, :cond_1
a=0;// 
a=0;//     array-length v6, v5
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     if-ne v6, v7, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v7, v5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_3
a=0;// 
a=0;//     sget v7, Lcom/kingroot/RushRoot/eq;->b:I
a=0;// 
a=0;//     aget-object v8, v5, v12
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v7, v8}, Lcom/kingroot/RushRoot/fg;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     aget-object v7, v5, v13
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v5, v12
a=0;// 
a=0;//     aget-object v7, v5, v14
a=0;// 
a=0;//     aput-object v7, v5, v13
a=0;// 
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v5, v14
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Integer);v8=(PosByte);
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     aget-object v7, v5, v0
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     aget-object v7, v5, v12
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fb;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     aget-object v7, v5, v13
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     aget-object v5, v5, v14
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v5, Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/RushRoot/gy;);
a=0;//     invoke-direct {v5}, Lcom/kingroot/RushRoot/gy;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/RushRoot/gy;);
a=0;//     const v7, 0x3d093
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, v5, Lcom/kingroot/RushRoot/gy;->a:I
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide/16 v9, 0x3e8
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     div-long/2addr v7, v9
a=0;// 
a=0;//     long-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, v5, Lcom/kingroot/RushRoot/gy;->b:I
a=0;// 
a=0;//     const-string v7, "1"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iput-object v7, v5, Lcom/kingroot/RushRoot/gy;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, v5, Lcom/kingroot/RushRoot/gy;->e:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "SU SUI paramvalues: "
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, v5, Lcom/kingroot/RushRoot/gy;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);v7=(Integer);v8=(PosByte);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 215
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/gh;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/gh;);
a=0;//     invoke-direct {v1, v0}, Lcom/kingroot/RushRoot/gh;-><init>(B)V
a=0;// 
a=0;//     .line 216
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gh;);
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/gh;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/gh;);
a=0;//     invoke-direct {v3, v0}, Lcom/kingroot/RushRoot/gh;-><init>(B)V
a=0;// 
a=0;//     .line 217
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/gh;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "report"
a=0;// 
a=0;//     const-string v6, "reportSoftUsageInfo"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v6, v1, v3}, Lcom/kingroot/RushRoot/fh;->a(ILjava/lang/String;Ljava/lang/String;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)V
a=0;// 
a=0;//     .line 220
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fh;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     .line 221
a=0;//     const-string v4, "phonetype"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/fg;->a()Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v4, "userinfo"
a=0;// 
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fg;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v4, "suikey"
a=0;// 
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fg;->b(Landroid/content/Context;)Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v4, "vecsui"
a=0;// 
a=0;//     invoke-virtual {v1, v4, v2}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 223
a=0;//     invoke-static {p0, v1, v3}, Lcom/kingroot/RushRoot/fh;->a(Landroid/content/Context;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 225
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 226
a=0;//     const-string v2, "reportroot_name_scan_su_result"
a=0;// 
a=0;//     invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 227
a=0;//     const-string v0, "su scan result cleared"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 230
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, -0x1770
a=0;// 
a=0;//     .line 417
a=0;//     .line 423
a=0;//     #v1=(Short);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 426
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/RushRoot/gh;->a()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/util/Cryptor;->x(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 430
a=0;//     sget-object v3, Lcom/kingroot/sdk/commom/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 429
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v3}, Lcom/kingroot/sdk/wupsession/a;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/sdk/wupsession/a;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 431
a=0;//     :try_start_1
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 432
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/sdk/wupsession/a;->a([B)V
a=0;// 
a=0;//     .line 433
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->a()I
a=0;// 
a=0;//     .line 435
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "WupSession.reponseCode = "
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 436
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->c()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", contentLength = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 437
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->e()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", contentType = "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 438
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 435
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 440
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 441
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 443
a=0;//     const-string v0, "WupSession.httpConnection.getResponse(..)\u51fa\u9519\u4e86\uff01"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->c(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 444
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 473
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 446
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);v1=(Short);v2=(Integer);v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 449
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_6
a=0;// 
a=0;//     .line 450
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/util/Cryptor;->y(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 451
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 452
a=0;//     invoke-virtual {p2, v0}, Lcom/kingroot/RushRoot/gh;->a([B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 471
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 454
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Reference,[B);v4=(Integer);
a=0;//     const-string v0, "WupSession.Cryptor.y(..)\u51fa\u9519\u4e86\uff01"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->c(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 459
a=0;//     #v0=(Short);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 460
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/a;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v2, "WupSession.IllegalArgumentException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 461
a=0;//     const/16 v0, -0x17a9
a=0;// 
a=0;//     .line 471
a=0;//     #v0=(Short);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {v1}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 462
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Short);v2=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 463
a=0;//     :goto_3
a=0;//     :try_start_5
a=0;//     #v2=(Conflicted);v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v2, "WupSession.Exception"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 464
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 471
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 473
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 466
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 467
a=0;//     :goto_4
a=0;//     :try_start_6
a=0;//     #v2=(Conflicted);v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v2, "WupSession.Throwable"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     .line 471
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 473
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 470
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 471
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 473
a=0;//     :cond_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 470
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Short);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/a;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 466
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Short);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 462
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 459
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Short);v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,[B);v2=(Integer);v5=(LongHi);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(ILjava/lang/String;Ljava/lang/String;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 395
a=0;//     invoke-virtual {p3, p0}, Lcom/kingroot/RushRoot/gh;->a(I)V
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {p3, p1}, Lcom/kingroot/RushRoot/gh;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 397
a=0;//     invoke-virtual {p3, p2}, Lcom/kingroot/RushRoot/gh;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 399
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p4, v0}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 400
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static declared-synchronized b(Landroid/content/Context;)I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 487
a=0;//     #v1=(Null);
a=0;//     const-class v3, Lcom/kingroot/RushRoot/fh;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/fg;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 489
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 491
a=0;//     const-string v0, "getGuidFromServer called"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fg;->c(Landroid/content/Context;)Lcom/kingroot/RushRoot/gk;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/gh;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/gh;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v2, v5}, Lcom/kingroot/RushRoot/gh;-><init>(B)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/gh;);
a=0;//     new-instance v5, Lcom/kingroot/RushRoot/gh;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/RushRoot/gh;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {v5, v6}, Lcom/kingroot/RushRoot/gh;-><init>(B)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/RushRoot/gh;);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const-string v7, "info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "getGuid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7, v8, v2, v5}, Lcom/kingroot/RushRoot/fh;->a(ILjava/lang/String;Ljava/lang/String;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)V
a=0;// 
a=0;//     const-string v6, "phonetype"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/fg;->a()Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v6, v7}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v6, "userinfo"
a=0;// 
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/fg;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v6, v7}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v6, "deviceinfo"
a=0;// 
a=0;//     invoke-virtual {v2, v6, v0}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v2, v5}, Lcom/kingroot/RushRoot/fh;->a(Landroid/content/Context;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/gl;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/gl;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     const/16 v0, -0x7d1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 495
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 491
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gk;);v2=(Integer);v4=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);v5=(Reference,Lcom/kingroot/RushRoot/gh;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Lcom/kingroot/RushRoot/hb;);v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gl;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gl;);
a=0;//     const-string v2, "guidinfo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v2, v0}, Lcom/kingroot/RushRoot/gh;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/gl;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_1
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);v4=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fg;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "guid is set"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 495
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 487
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
