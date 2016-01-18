package com.android.animation; class AnimatorSet$AnimatorSetListener { void a() { int a;
a=0;// .class Lcom/android/animation/AnimatorSet$AnimatorSetListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/android/animation/AnimatorSet;Lcom/android/animation/AnimatorSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     iput-object p1, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 712
a=0;//     #p0=(Reference,Lcom/android/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     iput-object p2, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 713
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Lcom/android/animation/Animator;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 716
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iget-boolean v0, v0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 719
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-static {v0}, Lcom/android/animation/AnimatorSet;->access$000(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 720
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 721
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 722
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 723
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-interface {v0, v3}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationCancel(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 722
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 728
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 732
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, p0}, Lcom/android/animation/Animator;->removeListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 733
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-static {v0}, Lcom/android/animation/AnimatorSet;->access$000(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 734
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/android/animation/AnimatorSet;->access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 735
a=0;//     iput-boolean v1, v0, Lcom/android/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     .line 736
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/android/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 739
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-static {v0}, Lcom/android/animation/AnimatorSet;->access$200(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 741
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 742
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v5, :cond_3
a=0;// 
a=0;//     .line 743
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/android/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 748
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 751
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 752
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 754
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 755
a=0;//     :goto_2
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     if-ge v2, v4, :cond_1
a=0;// 
a=0;//     .line 756
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-interface {v1, v5}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 755
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 742
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);v4=(Reference,Ljava/util/ArrayList;);v5=(Integer);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 759
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/android/animation/AnimatorSet;->access$302(Lcom/android/animation/AnimatorSet;Z)Z
a=0;// 
a=0;//     .line 762
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v2=(Integer);v4=(Reference,Ljava/util/ArrayList;);v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Lcom/android/animation/Animator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 766
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Lcom/android/animation/Animator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 770
a=0;//     return-void
a=0;// .end method
}}
