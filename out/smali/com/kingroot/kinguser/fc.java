package com.kingroot.kinguser; class fc { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/fc;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 304
a=0;//     #v6=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/vz;->run()V
a=0;// 
a=0;//     .line 305
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 306
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 310
a=0;//     :cond_1
a=0;//     #v1=(PosByte);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 311
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 315
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 316
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 319
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 321
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/kinguser/hx;->n(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v4, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 325
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     iput v6, v4, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     .line 326
a=0;//     iput v6, v4, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     .line 327
a=0;//     const/16 v2, 0x1ed
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iput v2, v4, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     .line 328
a=0;//     const-string v2, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v4, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 329
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v5, " zls"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0, v4}, Lcom/kingroot/kinguser/hx;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/hz;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v2, v6
a=0;// 
a=0;//     .line 331
a=0;//     if-ne v2, v7, :cond_3
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v5, " zls"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0, v4}, Lcom/kingroot/kinguser/hx;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/hz;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 333
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v7, :cond_3
a=0;// 
a=0;//     .line 346
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     invoke-static {v3, v0, v1}, Lcom/kingroot/kinguser/ez;->c(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(PosByte);v4=(Reference,Lcom/kingroot/kinguser/hz;);v5=(Reference,Ljava/lang/String;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
}}
