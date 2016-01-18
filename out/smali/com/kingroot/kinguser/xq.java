package com.kingroot.kinguser; class xq { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/xq;
a=0;// .super Lcom/kingroot/kinguser/xp;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private wg:Ljava/util/HashMap;
a=0;// 
a=0;// .field wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;// .field protected wj:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/xp;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/xq;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 20
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/xq;->wg:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 23
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aau;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aau;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aau;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a([BLjava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aau;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/aau;->v([B)V
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wh:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aau;->dl(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, p2, v1, v2}, Lcom/kingroot/kinguser/aau;->d(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 261
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private e(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wg:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic cm(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/xp;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     #v2=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Boolean);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wg:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wg:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/kinguser/xq;->a([BLjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 147
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/xq;->e(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v1, Lcom/kingroot/kinguser/xo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/xo;);
a=0;//     invoke-direct {v1, v0}, Lcom/kingroot/kinguser/xo;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/xo;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 156
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->we:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wg:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wg:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->we:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 163
a=0;//     new-array v1, v2, [B
a=0;// 
a=0;//     .line 164
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 165
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 166
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 170
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aau;->v([B)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wh:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aau;->dl(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, p2, v1, v2}, Lcom/kingroot/kinguser/aau;->d(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/xq;->e(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 176
a=0;//     new-instance v1, Lcom/kingroot/kinguser/xo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/xo;);
a=0;//     invoke-direct {v1, v0}, Lcom/kingroot/kinguser/xo;-><init>(Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/xo;);
a=0;//     throw v1
a=0;// 
a=0;//     :cond_5
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public me()[B
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 365
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aaw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aaw;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/aaw;-><init>(I)V
a=0;// 
a=0;//     .line 367
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aaw;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wh:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aaw;->dl(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/aaw;->b(Ljava/util/Map;I)V
a=0;// 
a=0;//     .line 369
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/aaw;->mV()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/aay;->b(Ljava/nio/ByteBuffer;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 371
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/xp;->me()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public mf()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public p([B)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 400
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/xp;->p([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 409
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 402
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 403
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/aau;->v([B)V
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wh:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aau;->dl(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 405
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 406
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wi:Lcom/kingroot/kinguser/aau;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3, v3}, Lcom/kingroot/kinguser/aau;->b(Ljava/util/Map;IZ)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 80
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "put key can not is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "put value can not is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     instance-of v0, p2, Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "can not support Set"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aaw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aaw;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aaw;-><init>()V
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aaw;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wh:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aaw;->dl(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p2, v1}, Lcom/kingroot/kinguser/aaw;->b(Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/aaw;->mV()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/aay;->b(Ljava/nio/ByteBuffer;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/xq;->wj:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Lcom/kingroot/kinguser/xp;->put(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
