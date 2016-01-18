package com.android.animation; class AnimatorSet { void a() { int a;
a=0;// .class public final Lcom/android/animation/AnimatorSet;
a=0;// .super Lcom/android/animation/Animator;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;// .field private mDuration:J
a=0;// 
a=0;// .field private mNeedsSort:Z
a=0;// 
a=0;// .field private mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;// .field private mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;// .field private mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mStartDelay:J
a=0;// 
a=0;// .field private mStarted:Z
a=0;// 
a=0;// .field mTerminated:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/android/animation/Animator;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 89
a=0;//     iput-object v2, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     .line 98
a=0;//     iput-boolean v1, p0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 104
a=0;//     iput-boolean v1, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 107
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/android/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     .line 110
a=0;//     iput-object v2, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 116
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/android/animation/AnimatorSet;->mDuration:J
a=0;// 
a=0;//     .line 1012
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$302(Lcom/android/animation/AnimatorSet;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iput-boolean p1, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private sortNodes()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 785
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 786
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 787
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 788
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 789
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v4, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 792
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 789
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 795
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 796
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     .line 797
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 798
a=0;//     :goto_2
a=0;//     #v4=(Integer);
a=0;//     if-ge v4, v7, :cond_5
a=0;// 
a=0;//     .line 799
a=0;//     invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 800
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 801
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 802
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 803
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     if-ge v2, v8, :cond_4
a=0;// 
a=0;//     .line 804
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v9, v1, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 806
a=0;//     iget-object v9, v1, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 807
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 803
a=0;//     :cond_3
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 798
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 812
a=0;//     :cond_5
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 813
a=0;//     invoke-virtual {v5, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 814
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 816
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);v7=(Conflicted);
a=0;//     iput-boolean v3, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 817
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_b
a=0;// 
a=0;//     .line 818
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Circular dependencies cannot exist in AnimatorSet"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 825
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 826
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v4, v5, :cond_b
a=0;// 
a=0;//     .line 827
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 828
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     .line 829
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 830
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v6, :cond_a
a=0;// 
a=0;//     .line 831
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 832
a=0;//     iget-object v7, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 833
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v7, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 835
a=0;//     :cond_8
a=0;//     iget-object v7, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v8, v1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v8=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v7, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 836
a=0;//     iget-object v7, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, v1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 830
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 842
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     iput-boolean v3, v0, Lcom/android/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     .line 826
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 845
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cancel()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 285
a=0;//     invoke-virtual {p0}, Lcom/android/animation/AnimatorSet;->isStarted()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 290
a=0;//     invoke-interface {v1, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationCancel(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 293
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/ValueAnimator;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/ValueAnimator;->cancel()V
a=0;// 
a=0;//     .line 302
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 304
a=0;//     invoke-interface {v0, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 297
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Animator;->cancel()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 307
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 309
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Null);v1=(Reference,Ljava/util/ArrayList;);v2=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/android/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-virtual {p0}, Lcom/android/animation/AnimatorSet;->clone()Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/android/animation/AnimatorSet;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 551
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0}, Lcom/android/animation/Animator;->clone()Lcom/android/animation/Animator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Animator;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 560
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 561
a=0;//     iput-boolean v2, v0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 562
a=0;//     iput-boolean v2, v0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 563
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 564
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 565
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 566
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 571
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 572
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 573
a=0;//     invoke-virtual {v1}, Lcom/android/animation/AnimatorSet$Node;->clone()Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 574
a=0;//     invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 576
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v6, v2, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/animation/Animator;);
a=0;//     invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 578
a=0;//     iput-object v3, v2, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 579
a=0;//     iput-object v3, v2, Lcom/android/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 580
a=0;//     iput-object v3, v2, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 581
a=0;//     iput-object v3, v2, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 584
a=0;//     iget-object v1, v2, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Animator;->getListeners()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 585
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 587
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Iterator;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 588
a=0;//     instance-of v8, v1, Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 589
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 590
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 592
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 595
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v8=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 596
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 597
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 604
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v3=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 605
a=0;//     invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 606
a=0;//     iget-object v3, v1, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 607
a=0;//     iget-object v1, v1, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 608
a=0;//     iget-object v3, v1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 609
a=0;//     new-instance v7, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     iget v1, v1, Lcom/android/animation/AnimatorSet$Dependency;->rule:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v7, v3, v1}, Lcom/android/animation/AnimatorSet$Dependency;-><init>(Lcom/android/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 611
a=0;//     #v7=(Reference,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {v2, v7}, Lcom/android/animation/AnimatorSet$Node;->addDependency(Lcom/android/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 616
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-virtual {p0}, Lcom/android/animation/AnimatorSet;->clone()Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public end()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {p0}, Lcom/android/animation/AnimatorSet;->isStarted()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 323
a=0;//     invoke-direct {p0}, Lcom/android/animation/AnimatorSet;->sortNodes()V
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v2, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v2, Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     invoke-direct {v2, p0, p0}, Lcom/android/animation/AnimatorSet$AnimatorSetListener;-><init>(Lcom/android/animation/AnimatorSet;Lcom/android/animation/AnimatorSet;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     iput-object v2, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     .line 328
a=0;//     :cond_0
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/android/animation/Animator;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/ValueAnimator;->cancel()V
a=0;// 
a=0;//     .line 334
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Animator;->end()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 339
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 343
a=0;//     invoke-interface {v0, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 346
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 348
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getChildAnimations()Ljava/util/ArrayList;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 201
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-wide v0, p0, Lcom/android/animation/AnimatorSet;->mDuration:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getStartDelay()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     iget-wide v0, p0, Lcom/android/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isRunning()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Animator;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 362
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isStarted()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     iget-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet$Builder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/AnimatorSet$Builder;-><init>(Lcom/android/animation/AnimatorSet;Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Builder;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public playSequentially(Ljava/util/List;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iput-boolean v2, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 181
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/AnimatorSet;->play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 184
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/AnimatorSet;->play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet$Builder;);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/android/animation/AnimatorSet$Builder;->before(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 184
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs playSequentially([Lcom/android/animation/Animator;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     iput-boolean v2, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 162
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/AnimatorSet;->play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     aget-object v1, p1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcom/android/animation/AnimatorSet;->play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$Builder;);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Lcom/android/animation/AnimatorSet$Builder;->before(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 165
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public playTogether(Ljava/util/Collection;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/android/animation/AnimatorSet$Builder;);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator;
a=0;// 
a=0;//     .line 144
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/AnimatorSet;->play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 149
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     invoke-virtual {v1, v0}, Lcom/android/animation/AnimatorSet$Builder;->with(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs playTogether([Lcom/android/animation/Animator;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 125
a=0;//     #v0=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/android/animation/AnimatorSet;->play(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 128
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,Lcom/android/animation/AnimatorSet$Builder;);v2=(Conflicted);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     aget-object v2, p1, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Lcom/android/animation/AnimatorSet$Builder;->with(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 128
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/android/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/android/animation/AnimatorSet;->setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 416
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "duration must be a value of zero or greater"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/android/animation/Animator;->setDuration(J)Lcom/android/animation/Animator;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iput-wide p1, p0, Lcom/android/animation/AnimatorSet;->mDuration:J
a=0;// 
a=0;//     .line 424
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/Animator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStartDelay(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     iput-wide p1, p0, Lcom/android/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     .line 390
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTarget(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     .line 218
a=0;//     instance-of v2, v0, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 219
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_1
a=0;//     instance-of v2, v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     check-cast v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/ObjectAnimator;->setTarget(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setupEndValues()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Animator;->setupEndValues()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 439
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setupStartValues()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Animator;->setupStartValues()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 432
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 451
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, p0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 452
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 456
a=0;//     invoke-direct {p0}, Lcom/android/animation/AnimatorSet;->sortNodes()V
a=0;// 
a=0;//     .line 458
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 459
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v3, v5, :cond_3
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/Animator;);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Animator;->getListeners()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 463
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 464
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     .line 467
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 468
a=0;//     instance-of v6, v1, Lcom/android/animation/AnimatorSet$DependencyListener;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     instance-of v6, v1, Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 470
a=0;//     :cond_1
a=0;//     iget-object v6, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/animation/Animator;);
a=0;//     invoke-virtual {v6, v1}, Lcom/android/animation/Animator;->removeListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 459
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 480
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 481
a=0;//     :goto_2
a=0;//     #v4=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v4, v5, :cond_8
a=0;// 
a=0;//     .line 482
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 484
a=0;//     new-instance v1, Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     invoke-direct {v1, p0, p0}, Lcom/android/animation/AnimatorSet$AnimatorSetListener;-><init>(Lcom/android/animation/AnimatorSet;Lcom/android/animation/AnimatorSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     iput-object v1, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     .line 486
a=0;//     :cond_4
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 487
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 497
a=0;//     :goto_3
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet;->mSetListener:Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/Animator;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 481
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 489
a=0;//     :cond_6
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);v1=(Integer);
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 490
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);
a=0;//     if-ge v3, v7, :cond_7
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v8, v1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v8=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iget-object v8, v8, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     new-instance v9, Lcom/android/animation/AnimatorSet$DependencyListener;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/android/animation/AnimatorSet$DependencyListener;);
a=0;//     iget v1, v1, Lcom/android/animation/AnimatorSet$Dependency;->rule:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v9, p0, v0, v1}, Lcom/android/animation/AnimatorSet$DependencyListener;-><init>(Lcom/android/animation/AnimatorSet;Lcom/android/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/android/animation/AnimatorSet$DependencyListener;);
a=0;//     invoke-virtual {v8, v9}, Lcom/android/animation/Animator;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 490
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 495
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 500
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);
a=0;//     iget-wide v0, p0, Lcom/android/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v10
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_9
a=0;// 
a=0;//     .line 501
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 502
a=0;//     iget-object v3, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/Animator;);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/Animator;->start()V
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v3, p0, Lcom/android/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 506
a=0;//     :cond_9
a=0;//     #v0=(Byte);v1=(LongHi);v3=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/android/animation/ValueAnimator;->ofFloat([F)Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 507
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     iget-wide v3, p0, Lcom/android/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/android/animation/ValueAnimator;->setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 508
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     new-instance v1, Lcom/android/animation/AnimatorSet$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/AnimatorSet$1;);
a=0;//     invoke-direct {v1, p0, v6}, Lcom/android/animation/AnimatorSet$1;-><init>(Lcom/android/animation/AnimatorSet;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/ValueAnimator;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 524
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mDelayAnim:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     .line 526
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 527
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 529
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 530
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     if-ge v3, v4, :cond_b
a=0;// 
a=0;//     .line 531
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationStart(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 530
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 534
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/android/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v10
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     .line 537
a=0;//     iput-boolean v2, p0, Lcom/android/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 538
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 539
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 541
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 542
a=0;//     :goto_7
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Integer);
a=0;//     if-ge v2, v3, :cond_c
a=0;// 
a=0;//     .line 543
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 542
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 547
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 506
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
}}
