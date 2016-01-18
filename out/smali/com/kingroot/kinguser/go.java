package com.kingroot.kinguser; class go { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/go;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic gX:Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/gn;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 386
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/go;->gX:Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/go;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 390
a=0;//     #v7=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/vz;->run()V
a=0;// 
a=0;//     .line 393
a=0;//     const-wide/16 v0, 0xbb8
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 398
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gD()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 399
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 400
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 438
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 404
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(LongHi);v4=(LongLo);v5=(LongHi);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/go;->gX:Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/gn;->cS()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 410
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 411
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v5, "ping"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " -p"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v4, v5, v8}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 412
a=0;//     new-instance v4, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v5, "version"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v8, " -v"
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v5, v0}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 414
a=0;//     const-string v0, "sh"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gr;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 418
a=0;//     const-string v1, ""
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v4, v7
a=0;// 
a=0;//     .line 419
a=0;//     :goto_2
a=0;//     #v4=(Boolean);v5=(Integer);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v5, v0, :cond_4
a=0;// 
a=0;//     .line 420
a=0;//     invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 421
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     iget-object v9, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 419
a=0;//     :goto_3
a=0;//     #v1=(Boolean);v9=(Conflicted);
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v4
a=0;// 
a=0;//     move v4, v1
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 425
a=0;//     :cond_2
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     const-string v10, "ping"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     .line 426
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 427
a=0;//     #v1=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 429
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/String;);v9=(Boolean);
a=0;//     iget-object v9, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "version"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     .line 430
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     iget-object v9, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_6
a=0;// 
a=0;//     .line 431
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 436
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     :goto_4
a=0;//     #v7=(Boolean);
a=0;//     invoke-static {v7, v1}, Lcom/kingroot/kinguser/st;->m(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 437
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/kingroot/kinguser/jc;->J(J)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v7=(Null);
a=0;//     move v7, v6
a=0;// 
a=0;//     .line 436
a=0;//     #v7=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 394
a=0;//     :catch_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(LongLo);v3=(LongHi);v4=(Boolean);v5=(Integer);v8=(Reference,Ljava/util/List;);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_3
a=0;// .end method
}}
