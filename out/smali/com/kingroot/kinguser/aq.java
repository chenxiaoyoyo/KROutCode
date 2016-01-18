package com.kingroot.kinguser; class aq { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aq;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingcore/uilib/CircleWithButton;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     .line 321
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
a=0;//     .line 322
a=0;//     const-wide/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/android/animation/ValueAnimator;->setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 323
a=0;//     new-instance v1, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/ValueAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ar;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ar;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/ar;-><init>(Lcom/kingroot/kinguser/aq;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ar;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/ValueAnimator;->addUpdateListener(Lcom/android/animation/ValueAnimator$AnimatorUpdateListener;)V
a=0;// 
a=0;//     .line 334
a=0;//     invoke-virtual {v0}, Lcom/android/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     .line 335
a=0;//     return-void
a=0;// 
a=0;//     .line 321
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
}}
