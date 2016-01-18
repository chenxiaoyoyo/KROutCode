package com.kingroot.RushRoot; class jv { void a() { int a;
a=0;// .class Lcom/kingroot/RushRoot/jv;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/util/HashMap;
a=0;// 
a=0;// .field protected b:Ljava/util/HashMap;
a=0;// 
a=0;// .field protected c:Ljava/lang/String;
a=0;// 
a=0;// .field d:Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;// .field private e:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/jv;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jv;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 25
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jv;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 29
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jv;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "GBK"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jv;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kd;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/kd;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kd;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jv;->d:Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/ArrayList;Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     #v3=(Null);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 279
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "byte"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "only byte[] is supported"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 283
a=0;//     const-string v1, "java.util.List"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 284
a=0;//     invoke-static {v0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "Array"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 287
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 318
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 290
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v0, Ljava/lang/reflect/Array;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 291
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "can not support Array, please use List"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 292
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v0, Ljava/util/List;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 293
a=0;//     const-string v1, "java.util.List"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 294
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 295
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     .line 296
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     :cond_4
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 301
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v0, Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 302
a=0;//     const-string v1, "java.util.Map"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 303
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     .line 304
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     .line 305
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 306
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 307
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 308
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     :cond_6
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 312
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 316
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/jv;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 86
a=0;//     #v3=(One);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 87
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
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 90
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
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     instance-of v0, p2, Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 93
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
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kf;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/kf;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kf;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jv;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kf;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p2, v1}, Lcom/kingroot/RushRoot/kf;->a(Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/kf;->a()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/kh;->a(Ljava/nio/ByteBuffer;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 100
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 101
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v2, p2}, Lcom/kingroot/RushRoot/jv;->a(Ljava/util/ArrayList;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/jt;->a(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jv;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jv;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a([B)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 328
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jv;->d:Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kd;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/RushRoot/kd;->a([B)V
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jv;->d:Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jv;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kd;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 330
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 331
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 332
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v4, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 333
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jv;->d:Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v4, v4}, Lcom/kingroot/RushRoot/kd;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jv;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 335
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a()[B
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 321
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kf;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/RushRoot/kf;-><init>(I)V
a=0;// 
a=0;//     .line 322
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kf;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jv;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kf;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jv;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/RushRoot/kf;->a(Ljava/util/Map;I)V
a=0;// 
a=0;//     .line 324
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/kf;->a()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/kh;->a(Ljava/nio/ByteBuffer;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
