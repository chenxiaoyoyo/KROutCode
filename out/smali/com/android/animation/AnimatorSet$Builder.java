package com.android.animation; class AnimatorSet$Builder { void a() { int a;
a=0;// .class public Lcom/android/animation/AnimatorSet$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/android/animation/AnimatorSet;Lcom/android/animation/Animator;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1027
a=0;//     iput-object p1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1028
a=0;//     #p0=(Reference,Lcom/android/animation/AnimatorSet$Builder;);
a=0;//     invoke-static {p1}, Lcom/android/animation/AnimatorSet;->access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1029
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1030
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v0, p2}, Lcom/android/animation/AnimatorSet$Node;-><init>(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iput-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1031
a=0;//     invoke-static {p1}, Lcom/android/animation/AnimatorSet;->access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1032
a=0;//     invoke-static {p1}, Lcom/android/animation/AnimatorSet;->access$400(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public after(J)Lcom/android/animation/AnimatorSet$Builder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1105
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
a=0;//     .line 1106
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/android/animation/ValueAnimator;->setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 1107
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/AnimatorSet$Builder;->after(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 1108
a=0;//     return-object p0
a=0;// 
a=0;//     .line 1105
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public after(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1084
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
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
a=0;//     .line 1085
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1086
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v0, p1}, Lcom/android/animation/AnimatorSet$Node;-><init>(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 1087
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-static {v1}, Lcom/android/animation/AnimatorSet;->access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1088
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/android/animation/AnimatorSet;->access$400(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1090
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v1, v0, v2}, Lcom/android/animation/AnimatorSet$Dependency;-><init>(Lcom/android/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 1091
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet$Node;->addDependency(Lcom/android/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     .line 1092
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public before(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1064
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
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
a=0;//     .line 1065
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1066
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v0, p1}, Lcom/android/animation/AnimatorSet$Node;-><init>(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 1067
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-static {v1}, Lcom/android/animation/AnimatorSet;->access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1068
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/android/animation/AnimatorSet;->access$400(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1070
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v2, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/android/animation/AnimatorSet$Dependency;-><init>(Lcom/android/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 1071
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet$Node;->addDependency(Lcom/android/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     .line 1072
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public with(Lcom/android/animation/Animator;)Lcom/android/animation/AnimatorSet$Builder;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1044
a=0;//     iget-object v0, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
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
a=0;//     .line 1045
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1046
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v0, p1}, Lcom/android/animation/AnimatorSet$Node;-><init>(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 1047
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-static {v1}, Lcom/android/animation/AnimatorSet;->access$100(Lcom/android/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1048
a=0;//     iget-object v1, p0, Lcom/android/animation/AnimatorSet$Builder;->this$0:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/android/animation/AnimatorSet;->access$400(Lcom/android/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1050
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcom/android/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v2, p0, Lcom/android/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/android/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet$Node;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/android/animation/AnimatorSet$Dependency;-><init>(Lcom/android/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 1051
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet$Node;->addDependency(Lcom/android/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     .line 1052
a=0;//     return-object p0
a=0;// .end method
}}
