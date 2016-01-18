package com.kingroot.kinguser; class ar { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ar;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/animation/ValueAnimator$AnimatorUpdateListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/aq;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ar;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationUpdate(Lcom/android/animation/ValueAnimator;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingcore/uilib/CircleWithButton;->d(Lcom/kingcore/uilib/CircleWithButton;)Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/android/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float v0, v2, v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingcore/uilib/CircleWithButton;->c(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingcore/uilib/CircleWithButton;->c(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->red(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingcore/uilib/CircleWithButton;->c(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Landroid/graphics/Color;->green(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v4, v4, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingcore/uilib/CircleWithButton;->c(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Landroid/graphics/Color;->blue(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v0, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingcore/uilib/CircleWithButton;->f(Lcom/kingcore/uilib/CircleWithButton;)Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/android/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingcore/uilib/CircleWithButton;->e(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingcore/uilib/CircleWithButton;->e(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->red(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingcore/uilib/CircleWithButton;->e(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Landroid/graphics/Color;->green(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v4, v4, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingcore/uilib/CircleWithButton;->e(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Landroid/graphics/Color;->blue(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v0, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ar;->bc:Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aq;->aV:Lcom/kingcore/uilib/CircleWithButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingcore/uilib/CircleWithButton;->invalidate()V
a=0;// 
a=0;//     .line 332
a=0;//     return-void
a=0;// .end method
}}
