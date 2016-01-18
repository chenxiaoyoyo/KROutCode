package com.kingroot.kinguser; class ov { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ov;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/os;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ov;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v6, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v0, "MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     .line 211
a=0;//     #v6=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v0, "MM-dd HH:mm:ss"
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 213
a=0;//     #v7=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/gg;->cz()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 214
a=0;//     #v8=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v8}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 216
a=0;//     #v0=(Integer);
a=0;//     new-instance v9, Ljava/util/HashMap;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v9}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 218
a=0;//     #v9=(Reference,Ljava/util/HashMap;);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v4, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ltz v4, :cond_5
a=0;// 
a=0;//     .line 219
a=0;//     invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kn;
a=0;// 
a=0;//     .line 222
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 225
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->c(Lcom/kingroot/kinguser/os;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v2, v1, :cond_8
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->c(Lcom/kingroot/kinguser/os;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v10, v0, Lcom/kingroot/kinguser/kn;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 234
a=0;//     :goto_2
a=0;//     #v10=(Conflicted);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ko;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/ko;-><init>()V
a=0;// 
a=0;//     .line 237
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ko;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/kn;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcom/kingroot/kinguser/vb;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->lj:Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 241
a=0;//     :goto_3
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kn;->kI:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->d(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a0094
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     .line 243
a=0;//     const/16 v1, 0x41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     .line 244
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v2, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     .line 246
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->lf:Ljava/lang/String;
a=0;// 
a=0;//     .line 247
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->lg:Ljava/lang/String;
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     .line 249
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->c(Lcom/kingroot/kinguser/os;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 254
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ko;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/ko;-><init>()V
a=0;// 
a=0;//     .line 256
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ko;);
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kn;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     .line 257
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/kn;->mState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->e(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a0092
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_4
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     .line 259
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/kn;->mState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_3
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->g(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a0092
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     .line 261
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     .line 262
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     .line 268
a=0;//     :goto_5
a=0;//     #v1=(Boolean);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v2, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     .line 271
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     iget-wide v10, v0, Lcom/kingroot/kinguser/kn;->kK:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-direct {v1, v10, v11}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     .line 272
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v6, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     invoke-static {v1, v0, v7}, Lcom/kingroot/kinguser/os;->a(Lcom/kingroot/kinguser/os;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->lf:Ljava/lang/String;
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/kingroot/kinguser/ko;->lg:Ljava/lang/String;
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, v2, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 277
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 278
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 284
a=0;//     :goto_6
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, v2, Lcom/kingroot/kinguser/ko;->index:I
a=0;// 
a=0;//     .line 218
a=0;//     add-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     move v4, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kn;);v1=(Boolean);v2=(Integer);v3=(Null);v10=(Reference,Ljava/lang/String;);v11=(Conflicted);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 238
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Reference,Lcom/kingroot/kinguser/ko;);v3=(Reference,Ljava/lang/String;);v10=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 239
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 257
a=0;//     :cond_2
a=0;//     #v1=(Integer);v3=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->f(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a0093
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 264
a=0;//     :cond_3
a=0;//     #v1=(Integer);v3=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/os;->h(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a0093
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     .line 265
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     .line 266
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v2, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 280
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/lang/String;);v10=(LongLo);v11=(LongHi);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 281
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v1, v2, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 287
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Integer);v2=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/os;->c(Lcom/kingroot/kinguser/os;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_7
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/os;->c(Lcom/kingroot/kinguser/os;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 290
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v3, v2, v1, v0}, Lcom/kingroot/kinguser/os;->a(Lcom/kingroot/kinguser/os;ILjava/util/List;Lcom/kingroot/kinguser/ko;)V
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v3, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {v3, v0, v4, v6}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 295
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x40
a=0;// 
a=0;//     .line 296
a=0;//     if-gtz v0, :cond_6
a=0;// 
a=0;//     .line 297
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_8
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 298
a=0;//     new-instance v3, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v0, v4}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 287
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 305
a=0;//     :cond_7
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ov;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-virtual {v0, v5}, Lcom/kingroot/kinguser/os;->c(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Integer);v3=(Null);v4=(Integer);v6=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
