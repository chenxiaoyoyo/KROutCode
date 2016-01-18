package com.android.animation; class ValueAnimator$AnimationHandler { void a() { int a;
a=0;// .class Lcom/android/animation/ValueAnimator$AnimationHandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/animation/ValueAnimator$AnimationHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/android/animation/ValueAnimator$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator$AnimationHandler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/animation/ValueAnimator$AnimationHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 586
a=0;//     #v3=(One);
a=0;//     invoke-static {}, Lcom/android/animation/ValueAnimator;->access$000()Ljava/lang/ThreadLocal;
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
a=0;//     .line 587
a=0;//     invoke-static {}, Lcom/android/animation/ValueAnimator;->access$100()Ljava/lang/ThreadLocal;
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
a=0;//     .line 588
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 682
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 592
a=0;//     :pswitch_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Ljava/util/ArrayList;);v2=(Integer);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-static {}, Lcom/android/animation/ValueAnimator;->access$200()Ljava/lang/ThreadLocal;
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
a=0;//     .line 593
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
a=0;//     .line 594
a=0;//     :cond_1
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 601
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
a=0;//     .line 602
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 604
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 605
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 606
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
a=0;//     .line 607
a=0;//     invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 609
a=0;//     invoke-static {v4}, Lcom/android/animation/ValueAnimator;->access$300(Lcom/android/animation/ValueAnimator;)J
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
a=0;//     .line 610
a=0;//     invoke-static {v4}, Lcom/android/animation/ValueAnimator;->access$400(Lcom/android/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 606
a=0;//     :goto_3
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 612
a=0;//     :cond_3
a=0;//     #v4=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 620
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 621
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {}, Lcom/android/animation/ValueAnimator;->access$500()Ljava/lang/ThreadLocal;
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
a=0;//     .line 622
a=0;//     invoke-static {}, Lcom/android/animation/ValueAnimator;->access$600()Ljava/lang/ThreadLocal;
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
a=0;//     .line 626
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 627
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
a=0;//     .line 628
a=0;//     invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 629
a=0;//     invoke-static {v4, v7, v8}, Lcom/android/animation/ValueAnimator;->access$700(Lcom/android/animation/ValueAnimator;J)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 630
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 627
a=0;//     :cond_5
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 633
a=0;//     :cond_6
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 634
a=0;//     if-lez v9, :cond_8
a=0;// 
a=0;//     .line 635
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Integer);
a=0;//     if-ge v6, v9, :cond_7
a=0;// 
a=0;//     .line 636
a=0;//     invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 637
a=0;//     invoke-static {v4}, Lcom/android/animation/ValueAnimator;->access$400(Lcom/android/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 638
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v4, v10}, Lcom/android/animation/ValueAnimator;->access$802(Lcom/android/animation/ValueAnimator;Z)Z
a=0;// 
a=0;//     .line 639
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 635
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 641
a=0;//     :cond_7
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 646
a=0;//     :cond_8
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 647
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 648
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);
a=0;//     if-ge v4, v6, :cond_b
a=0;// 
a=0;//     .line 649
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 650
a=0;//     invoke-virtual {v2, v7, v8}, Lcom/android/animation/ValueAnimator;->animationFrame(J)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_9
a=0;// 
a=0;//     .line 651
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 653
a=0;//     :cond_9
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v9, v6, :cond_a
a=0;// 
a=0;//     .line 654
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v6
a=0;// 
a=0;//     :goto_7
a=0;//     move v6, v4
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 666
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 663
a=0;//     :cond_a
a=0;//     #v2=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     .line 664
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v6
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 667
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_d
a=0;// 
a=0;//     .line 668
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_8
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v4, v2, :cond_c
a=0;// 
a=0;//     .line 669
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/android/animation/ValueAnimator;->access$900(Lcom/android/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 668
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 671
a=0;//     :cond_c
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 676
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
a=0;//     .line 677
a=0;//     :cond_e
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Lcom/android/animation/ValueAnimator;->access$1000()J
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
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lcom/android/animation/ValueAnimator$AnimationHandler;->sendEmptyMessageDelayed(IJ)Z
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
a=0;//     .line 588
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
