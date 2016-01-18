package com.kingroot.kinguser; class mn { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/mn;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile nW:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;// .field private nY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private nZ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/mn;->nW:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/mo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/mo;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/mo;-><init>(Lcom/kingroot/kinguser/mn;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mo;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mn;->nY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v0, Lcom/kingroot/kinguser/mq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/mq;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/mq;-><init>(Lcom/kingroot/kinguser/mn;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mq;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mn;->nZ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mn;->nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Lcom/kingroot/kinguser/xx;Lcom/kingroot/kinguser/xz;)Lcom/kingroot/kinguser/ya;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 306
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 353
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v1, p2, Lcom/kingroot/kinguser/xx;->wC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 343
a=0;//     iget v1, p2, Lcom/kingroot/kinguser/xx;->nO:I
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/mf;->a(Ljava/lang/String;IIIII)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 314
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p1, p2}, Lcom/kingroot/kinguser/mf;->a(Ljava/lang/String;Lcom/kingroot/kinguser/xx;)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     :sswitch_1
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/mf;->hV()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 324
a=0;//     :sswitch_2
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/mf;->hW()Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 329
a=0;//     :sswitch_3
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/mf;->hX()Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     :sswitch_4
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, p2}, Lcom/kingroot/kinguser/mf;->b(Ljava/lang/String;Lcom/kingroot/kinguser/xx;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 337
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/mn;->v(Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 312
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x14 -> :sswitch_4
a=0;//         0x15 -> :sswitch_2
a=0;//         0x16 -> :sswitch_1
a=0;//         0x17 -> :sswitch_3
a=0;//         0x18 -> :sswitch_4
a=0;//         0x12d -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/zd;)Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 445
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 447
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v4, p1, Lcom/kingroot/kinguser/zd;->wq:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 448
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 450
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     if-ltz v2, :cond_4
a=0;// 
a=0;//     .line 451
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xz;
a=0;// 
a=0;//     .line 452
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/xz;->wI:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 450
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 458
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xz;);v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/xz;->wI:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 461
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/xz;->wI:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     .line 462
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 467
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/mn;->d(Lcom/kingroot/kinguser/xz;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 468
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 473
a=0;//     :cond_3
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/xx;->wC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 480
a=0;//     :sswitch_0
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 481
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 488
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 473
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x3 -> :sswitch_0
a=0;//         0x4 -> :sswitch_0
a=0;//         0x6 -> :sswitch_0
a=0;//         0x9 -> :sswitch_0
a=0;//         0x15e -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/mn;Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/mn;->c(Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 256
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/mn;->d(Lcom/kingroot/kinguser/xz;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 266
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/mn;->b(Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/mn;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/mn;->ig()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/List;I)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 523
a=0;//     #v1=(Null);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 524
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xz;
a=0;// 
a=0;//     .line 525
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 527
a=0;//     #v5=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/mn;->e(Lcom/kingroot/kinguser/xz;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 532
a=0;//     :cond_0
a=0;//     #v5=(PosByte);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/xz;->wF:Lcom/kingroot/kinguser/xv;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/xv;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/mf;->a(Ljava/lang/String;IIILjava/util/ArrayList;I)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 539
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 543
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 544
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yb;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yb;-><init>()V
a=0;// 
a=0;//     .line 545
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yb;);
a=0;//     iput-object v6, v0, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 546
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mh;->a(Lcom/kingroot/kinguser/yb;)V
a=0;// 
a=0;//     .line 548
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 274
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 297
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/xz;->wF:Lcom/kingroot/kinguser/xv;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/xv;);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/xv;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 280
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/xz;->wI:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 281
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 286
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     .line 288
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, v2, v0, p1}, Lcom/kingroot/kinguser/mn;->a(Ljava/lang/String;Lcom/kingroot/kinguser/xx;Lcom/kingroot/kinguser/xz;)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 289
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 292
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 297
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/mn;)Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mn;->nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/kinguser/mn;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/mn;->ih()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c(Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 392
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 409
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 396
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/xz;->wI:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 397
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     .line 398
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     .line 400
a=0;//     :try_start_0
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/xz;->wF:Lcom/kingroot/kinguser/xv;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/xv;);
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/xv;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lcom/kingroot/kinguser/mn;->c(Ljava/lang/String;Lcom/kingroot/kinguser/xx;)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 401
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 402
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 404
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 409
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d(Lcom/kingroot/kinguser/xz;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/xz;->wG:Lcom/kingroot/kinguser/zk;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zk;);
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/zk;->Aj:I
a=0;// 
a=0;//     .line 516
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long/2addr v1, v3
a=0;// 
a=0;//     int-to-long v3, v0
a=0;// 
a=0;//     cmp-long v0, v1, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongLo);v2=(LongHi);v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e(Lcom/kingroot/kinguser/xz;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 554
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 574
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 559
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/mn;->d(Lcom/kingroot/kinguser/xz;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 560
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 563
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/xz;->mk()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 564
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 565
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 569
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v2=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     .line 570
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 571
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 574
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xx;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ie()Lcom/kingroot/kinguser/mn;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/kingroot/kinguser/mn;->nW:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     const-class v1, Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 54
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/mn;->nW:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/mn;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/mn;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/mn;->nW:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/mn;->nW:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 57
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private ig()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x3e8
a=0;// 
a=0;//     .line 113
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 115
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 116
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/me;->L(J)V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/zd;
a=0;// 
a=0;//     .line 122
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/zd;->zH:Ljava/lang/String;
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/me;->eT()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zd;);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v3=(LongHi);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/zd;->wq:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, v2, v3}, Lcom/kingroot/kinguser/mn;->a(Ljava/util/List;I)V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/me;->aG(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/zd;->zG:I
a=0;// 
a=0;//     .line 139
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/me;->hR()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     div-long/2addr v1, v6
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     .line 142
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     int-to-long v4, v1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long/2addr v4, v6
a=0;// 
a=0;//     add-long v1, v2, v4
a=0;// 
a=0;//     .line 143
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/mn;->N(J)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/mn;->nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/mn;->a(Lcom/kingroot/kinguser/zd;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/zd;->wq:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/mn;->v(Ljava/util/List;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mn;->nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/mn;->if()V
a=0;// 
a=0;//     .line 166
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bQ()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 169
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/gn;->cQ()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bX()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 171
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "am startservice -n "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v3, "com.kingroot.common.framework.service.KmSysService"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private ih()Ljava/util/ArrayList;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mn;->nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 361
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ms;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ms;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ms;-><init>(Lcom/kingroot/kinguser/mn;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ms;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 382
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private v(Ljava/util/List;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 223
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 224
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 225
a=0;//     invoke-interface {p1}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 227
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 228
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xz;
a=0;// 
a=0;//     .line 231
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/mn;->a(Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 232
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 236
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 242
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yb;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yb;-><init>()V
a=0;// 
a=0;//     .line 244
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yb;);
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 245
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mh;->a(Lcom/kingroot/kinguser/yb;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public N(J)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 496
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 497
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 498
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/eu;->fM:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 499
a=0;//     invoke-static {v0, v3, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 500
a=0;//     const-string v2, "alarm"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/AlarmManager;
a=0;// 
a=0;//     .line 501
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 502
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2, p1, p2, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 503
a=0;//     invoke-static {p1, p2}, Lcom/kingroot/kinguser/me;->M(J)V
a=0;// 
a=0;//     .line 504
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public at(Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 71
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/me;->hQ()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/me;->hR()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 74
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mn;->nY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vz;->aA(Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;Lcom/kingroot/kinguser/xx;)Lcom/kingroot/kinguser/ya;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 420
a=0;//     #v2=(Null);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 421
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {p2, p1}, Lcom/kingroot/kinguser/mt;->a(Lcom/kingroot/kinguser/xx;Ljava/lang/String;)Lcom/kingroot/kinguser/md;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 422
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/md;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 423
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/md;->hP()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v5=(Integer);
a=0;//     iget v0, p2, Lcom/kingroot/kinguser/xx;->wC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x15e
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 428
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 432
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosShort);v3=(Uninit);v4=(Uninit);
a=0;//     iget v1, p2, Lcom/kingroot/kinguser/xx;->nO:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/mf;->a(Ljava/lang/String;IIIII)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public if()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mn;->nX:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mn;->nZ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vz;->aA(Z)Z
a=0;// 
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
