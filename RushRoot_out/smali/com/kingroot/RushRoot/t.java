package com.kingroot.RushRoot; class t { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/t;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 572
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/t;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 572
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/t;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/t;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 587
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 588
a=0;//     #v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/n;->f()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 589
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/n;->g()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 590
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 684
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 594
a=0;//     :pswitch_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Ljava/util/ArrayList;);v2=(Integer);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/n;->h()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 595
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-lez v4, :cond_f
a=0;// 
a=0;//     .line 596
a=0;//     :cond_1
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 603
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     .line 604
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 606
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 607
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 608
a=0;//     #v7=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Integer);v6=(Integer);
a=0;//     if-ge v6, v7, :cond_2
a=0;// 
a=0;//     .line 609
a=0;//     invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/kingroot/RushRoot/n;
a=0;// 
a=0;//     .line 611
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/n;->a(Lcom/kingroot/RushRoot/n;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v8, v8, v10
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 612
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/n;->b(Lcom/kingroot/RushRoot/n;)V
a=0;// 
a=0;//     .line 608
a=0;//     :goto_3
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 614
a=0;//     :cond_3
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/n;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 622
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 623
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/n;->i()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 624
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/n;->j()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 628
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 629
a=0;//     #v9=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     :goto_4
a=0;//     #v4=(Integer);v6=(Integer);
a=0;//     if-ge v6, v9, :cond_6
a=0;// 
a=0;//     .line 630
a=0;//     invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/kingroot/RushRoot/n;
a=0;// 
a=0;//     .line 631
a=0;//     invoke-static {v4, v7, v8}, Lcom/kingroot/RushRoot/n;->a(Lcom/kingroot/RushRoot/n;J)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 632
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 629
a=0;//     :cond_5
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 635
a=0;//     :cond_6
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 636
a=0;//     if-lez v9, :cond_8
a=0;// 
a=0;//     .line 637
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Integer);
a=0;//     if-ge v6, v9, :cond_7
a=0;// 
a=0;//     .line 638
a=0;//     invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/kingroot/RushRoot/n;
a=0;// 
a=0;//     .line 639
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/n;->b(Lcom/kingroot/RushRoot/n;)V
a=0;// 
a=0;//     .line 640
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/n;->c(Lcom/kingroot/RushRoot/n;)Z
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 637
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 643
a=0;//     :cond_7
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 648
a=0;//     :cond_8
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 649
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 650
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);v4=(Integer);v6=(Integer);
a=0;//     if-ge v6, v4, :cond_b
a=0;// 
a=0;//     .line 651
a=0;//     invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/kingroot/RushRoot/n;
a=0;// 
a=0;//     .line 652
a=0;//     invoke-virtual {v2, v7, v8}, Lcom/kingroot/RushRoot/n;->b(J)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_9
a=0;// 
a=0;//     .line 653
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 655
a=0;//     :cond_9
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v9, v4, :cond_a
a=0;// 
a=0;//     .line 656
a=0;//     add-int/lit8 v2, v6, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v6, v2
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 665
a=0;//     :cond_a
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/n;);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     .line 666
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 669
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_d
a=0;// 
a=0;//     .line 670
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_7
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v4, v2, :cond_c
a=0;// 
a=0;//     .line 671
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/kingroot/RushRoot/n;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/n;->d(Lcom/kingroot/RushRoot/n;)V
a=0;// 
a=0;//     .line 670
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 673
a=0;//     :cond_c
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 678
a=0;//     :cond_d
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 679
a=0;//     :cond_e
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/n;->k()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v5, v7
a=0;// 
a=0;//     sub-long/2addr v3, v5
a=0;// 
a=0;//     invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lcom/kingroot/RushRoot/t;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/util/ArrayList;);v3=(One);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 590
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
