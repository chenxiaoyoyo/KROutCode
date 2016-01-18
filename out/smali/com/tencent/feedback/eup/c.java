package com.tencent.feedback.eup; class c { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/eup/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/upload/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/tencent/feedback/eup/c;);
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/eup/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     #v2=(Null);
a=0;//     const-string v0, "rqdp{  EUPDAO.querySum() start}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 132
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     const-string v0, "rqdp{  querySum() context is null arg}"
a=0;// 
a=0;//     new-array v1, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 135
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v1, v0, [I
a=0;// 
a=0;//     fill-array-data v1, :array_0
a=0;// 
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide v4, 0x7fffffffffffffffL
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;[IJJLjava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x2
a=0;//         0x1
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/util/List;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     #v0=(Null);
a=0;//     const-string v1, "rqdp{  EUPDAO.deleteEupList() start}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 91
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     const-string v1, "rqdp{  deleteEupList() have null args!}"
a=0;// 
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     new-array v2, v1, [Ljava/lang/Long;
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 102
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/d;->a()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v2, v1
a=0;// 
a=0;//     .line 102
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 107
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {p0, v2}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;[Ljava/lang/Long;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Lcom/tencent/feedback/eup/d;)Lcom/tencent/feedback/proguard/l;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v8=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 236
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/l;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v1, v7
a=0;// 
a=0;//     .line 227
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/l;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->i()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/proguard/a;->a(Ljava/lang/Object;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/feedback/proguard/l;-><init>(IIJ[B)V
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/l;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->o()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/proguard/l;->b(I)Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->r()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/proguard/l;->a(I)Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->t()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/proguard/l;->a(Ljava/lang/String;)Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->a()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/feedback/proguard/l;->a(J)Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/eup/d;->B()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move v1, v7
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/proguard/l;->c(I)Lcom/tencent/feedback/proguard/l;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 234
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 235
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 236
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/l;);v1=(Boolean);v2=(LongHi);v3=(LongLo);v4=(LongHi);v5=(Reference,[B);
a=0;//     move v1, v8
a=0;// 
a=0;//     .line 232
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;IIIIJJLjava/lang/Boolean;)Ljava/util/List;
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     const-string v2, "rqdp{  EUPDAO.queryEupRecent() start}"
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
a=0;//     .line 293
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, p11, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     cmp-long v2, p9, p11
a=0;// 
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     if-lez p6, :cond_2
a=0;// 
a=0;//     move/from16 v0, p5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p6
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     .line 296
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "rqdp{  context == null || limitNum == 0 || (timeEnd > 0 && timeStart > timeEnd) || (maxCount > 0 && miniCount > maxCount ,pls check}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 297
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 300
a=0;//     :cond_2
a=0;//     #v2=(Byte);v3=(LongHi);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     const-string v2, "asc"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 302
a=0;//     :goto_1
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 303
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 305
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v3, v2, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aput v4, v3, v2
a=0;// 
a=0;//     .line 320
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     if-nez p13, :cond_8
a=0;// 
a=0;//     const/16 v18, -0x1
a=0;// 
a=0;//     .line 321
a=0;//     :goto_3
a=0;//     #v18=(Byte);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const-wide/16 v6, -0x1
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move/from16 v8, p1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v9, p4
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v10, p5
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move/from16 v11, p6
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move/from16 v12, p7
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move/from16 v13, p8
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-wide/from16 v14, p9
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     move-wide/from16 v16, p11
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     invoke-static/range {v2 .. v18}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;[IIIJILjava/lang/String;IIIIJJI)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 323
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_a
a=0;// 
a=0;//     .line 324
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 300
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(LongHi);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 307
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(PosByte);v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     if-ne v0, v2, :cond_6
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     new-array v3, v2, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput v4, v3, v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 311
a=0;//     :cond_6
a=0;//     #v2=(One);v3=(Null);v4=(Uninit);
a=0;//     if-gez p3, :cond_7
a=0;// 
a=0;//     .line 313
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v3, v2, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     fill-array-data v3, :array_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 317
a=0;//     :cond_7
a=0;//     #v2=(One);v3=(Null);
a=0;//     const-string v2, "rqdp{  queryEupRecent() seletedRecordType unaccepted}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v4}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 320
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v3=(Reference,[I);v4=(Conflicted);
a=0;//     invoke-virtual/range {p13 .. p13}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v18=(Uninit);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 326
a=0;//     :cond_a
a=0;//     #v2=(Integer);v4=(Byte);v5=(Reference,Ljava/util/List;);v6=(LongLo);v7=(LongHi);v8=(Integer);v9=(Reference,Ljava/lang/String;);v10=(Integer);v11=(Integer);v12=(Integer);v13=(Integer);v14=(LongLo);v15=(LongHi);v16=(LongLo);v17=(LongHi);v18=(Byte);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 328
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 330
a=0;//     :cond_b
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     .line 333
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     check-cast v3, Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     .line 336
a=0;//     :try_start_0
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/l;->b()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/proguard/a;->b([B)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 338
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     const-class v7, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     .line 340
a=0;//     const-class v7, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/l;->a()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v2, v7, v8}, Lcom/tencent/feedback/eup/d;->a(J)V
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 345
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->remove()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 349
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 351
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 352
a=0;//     const-string v2, "rqdp{  query have error!}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 357
a=0;//     :cond_c
a=0;//     #v2=(Boolean);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_e
a=0;// 
a=0;//     .line 360
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "rqdp{  there are error datas ,should be remove }"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 362
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v6, v2, [Ljava/lang/Long;
a=0;// 
a=0;//     .line 364
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v3, v2, :cond_d
a=0;// 
a=0;//     .line 366
a=0;//     invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/l;->a()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v6, v3
a=0;// 
a=0;//     .line 364
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 369
a=0;//     :cond_d
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v6}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;[Ljava/lang/Long;)I
a=0;// 
a=0;//     .line 372
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "rqdp{  EUPDAO.queryEupRecent() end}"
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
a=0;//     move-object v2, v4
a=0;// 
a=0;//     .line 374
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1
a=0;//         0x2
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/tencent/feedback/eup/d;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Null);
a=0;//     const-string v1, "rqdp{  EUPDAO.insertEUP() start}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 31
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     :cond_0
a=0;//     const-string v1, "rqdp{  EUPDAO.insertEUP() have null args}"
a=0;// 
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v2=(Reference,[Ljava/lang/Object;);v3=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/feedback/eup/c;->a(Lcom/tencent/feedback/eup/d;)Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 40
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v1, "rqdp{  AnalyticsDAO.insert() have null args}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/l;->a()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p1, v1, v2}, Lcom/tencent/feedback/eup/d;->a(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 43
a=0;//     const-string v1, "rqdp{  EUPDAO.insertEUP() end}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Null);v2=(Reference,Lcom/tencent/feedback/proguard/l;);v3=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;Ljava/util/List;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 45
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     const-string v1, "rqdp{  EUPDAO.insertEUP() end}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 50
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v1, "rqdp{  insert fail!}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 52
a=0;//     const-string v1, "rqdp{  EUPDAO.insertEUP() end}"
a=0;// 
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  EUPDAO.insertEUP() end}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v0}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Ljava/util/List;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 188
a=0;//     #v1=(Null);
a=0;//     const-string v0, "rqdp{  EUPDAO.insertOrUpdateEupList() start}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 190
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "rqdp{  context == null ||| list == null || list.size() <= 0,pls check}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,[Ljava/lang/Object;);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Null);v3=(Uninit);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     .line 201
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/eup/c;->a(Lcom/tencent/feedback/eup/d;)Lcom/tencent/feedback/proguard/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 208
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 210
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 211
a=0;//     const-string v0, "rqdp{  insert fail!}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 212
a=0;//     const-string v0, "rqdp{  EUPDAO.insertOrUpdateEupList() end}"
a=0;// 
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-static {p0, v2}, Lcom/tencent/feedback/proguard/l;->b(Landroid/content/Context;Ljava/util/List;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 216
a=0;//     const-string v2, "rqdp{  EUPDAO.insertOrUpdateEupList() end}"
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  EUPDAO.insertOrUpdateEupList() end}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I[BZ)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 24
a=0;//     #v2=(Null);
a=0;//     const/16 v0, 0x12e
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 31
a=0;//     #v3=(Reference,Lcom/tencent/feedback/eup/e;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     const-string v0, "rqdp{  imposiable handle response ,but no eup instance!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 37
a=0;//     :cond_1
a=0;//     #v0=(PosShort);v1=(One);v3=(Reference,Lcom/tencent/feedback/eup/e;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v4, Lcom/tencent/feedback/proguard/V;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/feedback/proguard/V;);
a=0;//     invoke-direct {v4}, Lcom/tencent/feedback/proguard/V;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #v4=(Reference,Lcom/tencent/feedback/proguard/V;);
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/h;);
a=0;//     invoke-direct {v0, p2}, Lcom/tencent/feedback/proguard/h;-><init>([B)V
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/h;);
a=0;//     invoke-virtual {v4, v0}, Lcom/tencent/feedback/proguard/V;->a(Lcom/tencent/feedback/proguard/h;)V
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/eup/e;->o()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/eup/e;->n()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 47
a=0;//     const-string v0, "rqdp{  init eup sStrategy by default}"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v5}, Lcom/tencent/feedback/common/e;->f(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);v6=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Lcom/tencent/feedback/eup/e;->a(Lcom/tencent/feedback/eup/CrashStrategyBean;)V
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 58
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     :cond_2
a=0;//     move v0, v2
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     .line 60
a=0;//     const-string v0, "rqdp{  save eup strategy}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->f(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, p1, p2}, Lcom/tencent/feedback/proguard/a;->a(Landroid/content/Context;I[B)V
a=0;// 
a=0;//     .line 63
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "rqdp{  crashStrategy}[%s]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v4, v3, v5
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 69
a=0;//     const-string v3, "rqdp{  process crash strategy error} %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v1, v2
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v1=(One);v4=(Reference,Lcom/tencent/feedback/proguard/V;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v5, "rqdp{  init eup sStrategy by uStrategy}"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v5, v6}, Lcom/tencent/feedback/common/e;->f(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->clone()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 58
a=0;//     :cond_6
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/eup/CrashStrategyBean;->isMerged()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v5, v4, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eq v0, v5, :cond_9
a=0;// 
a=0;//     const-string v0, "rqdp{  is merged changed} %b"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-boolean v7, v4, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v0, v5}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-boolean v0, v4, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3, v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->setMerged(Z)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/eup/CrashStrategyBean;->isAssertOn()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iget-boolean v6, v4, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eq v5, v6, :cond_7
a=0;// 
a=0;//     iget-boolean v0, v4, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->setAssertEnable(Z)V
a=0;// 
a=0;//     const-string v0, "rqdp{ Assert enable changed: } %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-boolean v7, v4, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v0, v5}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getAssertTaskInterval()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v4, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v5, v6, :cond_8
a=0;// 
a=0;//     iget v0, v4, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->setAssertTaskInterval(I)V
a=0;// 
a=0;//     const-string v0, "rqdp{ Assert task interval changed: } %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget v7, v4, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v0, v5}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getAssertLimitCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v4, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     if-eq v5, v6, :cond_3
a=0;// 
a=0;//     iget v0, v4, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->setAssertLimitCount(I)V
a=0;// 
a=0;//     const-string v0, "rqdp{ Assert limit count changed: } %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget v6, v4, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v3, v5
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v5=(Boolean);v6=(Conflicted);v7=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
