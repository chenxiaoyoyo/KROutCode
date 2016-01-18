package com.kingroot.RushRoot; class hz { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/hz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/RushRoot/iv;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hz;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/RushRoot/jc;Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     #v6=(Null);
a=0;//     invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 243
a=0;//     invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/kingroot/RushRoot/hp;
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {p1}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 245
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 246
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v3, Lcom/kingroot/RushRoot/il;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 249
a=0;//     invoke-static {v0, v6}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 252
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, v8, :cond_0
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     if-eq v3, v8, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     const-string v3, "chown %d.%d %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 254
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget v5, v1, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v6
a=0;// 
a=0;//     .line 255
a=0;//     iget v5, v1, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v7
a=0;// 
a=0;//     .line 256
a=0;//     aput-object v0, v4, v9
a=0;// 
a=0;//     .line 253
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 260
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, v8, :cond_1
a=0;// 
a=0;//     .line 261
a=0;//     const-string v3, "chmod 0%o %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget v5, v1, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v6
a=0;// 
a=0;//     aput-object v0, v4, v7
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 265
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 266
a=0;//     const-string v3, "chcon %s %s"
a=0;// 
a=0;//     new-array v4, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 267
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v1, v4, v6
a=0;// 
a=0;//     .line 268
a=0;//     aput-object v0, v4, v7
a=0;// 
a=0;//     .line 266
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 272
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v0, v7}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 274
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/il;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {p1, v2}, Lcom/kingroot/RushRoot/jc;->a(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     .line 277
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
