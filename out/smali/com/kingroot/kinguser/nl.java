package com.kingroot.kinguser; class nl { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/nl;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic oA:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/nk;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nl;->oA:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private au(Z)Ljava/util/List;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 454
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 456
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 458
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vb;->getInstalledApplications(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 459
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 460
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     .line 461
a=0;//     iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 468
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cr()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 469
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/km;
a=0;// 
a=0;//     .line 470
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/km;->kY:Lcom/kingroot/kinguser/ke;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ke;);
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/ke;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/km;->kY:Lcom/kingroot/kinguser/ke;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ke;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 476
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 387
a=0;//     #v9=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 388
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 389
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->gg()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 390
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->gh()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 391
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->ge()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 394
a=0;//     #v8=(Boolean);
a=0;//     cmp-long v4, v2, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {v6, v2, v3}, Lcom/kingroot/kinguser/jc;->H(J)V
a=0;// 
a=0;//     .line 448
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 401
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Byte);v5=(Uninit);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 402
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 404
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 405
a=0;//     invoke-direct {p0, v8}, Lcom/kingroot/kinguser/nl;->au(Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 406
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nl;->oA:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/nk;->y(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 411
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 412
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->gf()V
a=0;// 
a=0;//     .line 413
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cw()V
a=0;// 
a=0;//     .line 419
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v6, v9}, Lcom/kingroot/kinguser/jc;->aa(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     :cond_3
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x240c8400
a=0;// 
a=0;//     .line 426
a=0;//     #v4=(LongLo);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 427
a=0;//     invoke-direct {p0, v8}, Lcom/kingroot/kinguser/nl;->au(Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 428
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nl;->oA:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/nk;->y(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 433
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 434
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->gf()V
a=0;// 
a=0;//     .line 435
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cw()V
a=0;// 
a=0;//     .line 439
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v6, v9}, Lcom/kingroot/kinguser/jc;->aa(Z)V
a=0;// 
a=0;//     .line 446
a=0;//     :goto_1
a=0;//     invoke-virtual {v6, v2, v3}, Lcom/kingroot/kinguser/jc;->H(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 442
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v0}, Lcom/kingroot/kinguser/jc;->aa(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
