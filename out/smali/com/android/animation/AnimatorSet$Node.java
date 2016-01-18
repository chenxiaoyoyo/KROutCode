package com.android.animation; class AnimatorSet$Node { void a() { int a;
a=0;// .class Lcom/android/animation/AnimatorSet$Node;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public animation:Lcom/android/animation/Animator;
a=0;// 
a=0;// .field public dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;// .field public done:Z
a=0;// 
a=0;// .field public nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;// .field public nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;// .field public tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/animation/Animator;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 923
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 883
a=0;//     #p0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 894
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 900
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 907
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 914
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/android/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     .line 924
a=0;//     iput-object p1, p0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     .line 925
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addDependency(Lcom/android/animation/AnimatorSet$Dependency;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 934
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 935
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 937
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 938
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 939
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 941
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Lcom/android/animation/AnimatorSet$Dependency;->node:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 942
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iget-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 943
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 945
a=0;//     :cond_2
a=0;//     iget-object v0, v0, Lcom/android/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 946
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/android/animation/AnimatorSet$Node;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 951
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 952
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/Animator;);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Animator;->clone()Lcom/android/animation/Animator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/android/animation/AnimatorSet$Node;->animation:Lcom/android/animation/Animator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 953
a=0;//     return-object v0
a=0;// 
a=0;//     .line 954
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 955
a=0;//     #v0=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 874
a=0;//     invoke-virtual {p0}, Lcom/android/animation/AnimatorSet$Node;->clone()Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     return-object v0
a=0;// .end method
}}
