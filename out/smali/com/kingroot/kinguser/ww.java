package com.kingroot.kinguser; class ww { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/ww;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic bB:Landroid/view/View;
a=0;// 
a=0;// .field final synthetic vO:Lcom/android/animation/AnimatorListenerAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/view/View;Lcom/android/animation/AnimatorListenerAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ww;->bB:Landroid/view/View;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/ww;->vO:Lcom/android/animation/AnimatorListenerAdapter;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ww;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPreDraw()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 316
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ww;->bB:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ww;->bB:Landroid/view/View;
a=0;// 
a=0;//     const-string v1, "translationY"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ww;->bB:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     aput v3, v2, v5
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput v3, v2, v4
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 321
a=0;//     new-instance v1, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v1}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 322
a=0;//     #v1=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     new-array v2, v4, [Lcom/android/animation/Animator;
a=0;// 
a=0;//     aput-object v0, v2, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/android/animation/AnimatorSet;->playTogether([Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 323
a=0;//     const-wide/16 v2, 0x12c
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/android/animation/AnimatorSet;->setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v1, v0}, Lcom/android/animation/AnimatorSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 325
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wx;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ww;->vO:Lcom/android/animation/AnimatorListenerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorListenerAdapter;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ww;->bB:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/kingroot/kinguser/wx;-><init>(Lcom/android/animation/AnimatorListenerAdapter;Landroid/view/View;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wx;);
a=0;//     invoke-virtual {v1, v0}, Lcom/android/animation/AnimatorSet;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 326
a=0;//     invoke-virtual {v1}, Lcom/android/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     .line 327
a=0;//     return v4
a=0;// .end method
}}
