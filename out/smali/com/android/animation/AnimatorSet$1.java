package com.android.animation; class AnimatorSet$1 { void a() { int a;
a=0;// .class Lcom/android/animation/AnimatorSet$1;
a=0;// .super Lcom/android/animation/AnimatorListenerAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field canceled:Z
a=0;// 
a=0;// .field final synthetic this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;// .field final synthetic val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/android/animation/AnimatorSet;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 508
a=0;//     iput-object p1, p0, Lcom/android/animation/AnimatorSet$1;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/android/animation/AnimatorSet$1;->val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/android/animation/AnimatorListenerAdapter;-><init>()V
a=0;// 
a=0;//     .line 509
a=0;//     #p0=(Reference,Lcom/android/animation/AnimatorSet$1;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet$1;->canceled:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Lcom/android/animation/Animator;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet$1;->canceled:Z
a=0;// 
a=0;//     .line 512
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     iget-boolean v0, p0, Lcom/android/animation/AnimatorSet$1;->canceled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 515
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$1;->val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 516
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
a=0;//     .line 517
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$1;->val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 518
a=0;//     iget-object v3, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/Animator;);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/Animator;->start()V
a=0;// 
a=0;//     .line 519
a=0;//     iget-object v3, p0, Lcom/android/animation/AnimatorSet$1;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/android/animation/AnimatorSet;->access$000(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 516
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 522
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
