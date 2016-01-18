package com.kingroot.kinguser.view; class InkView { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/view/InkView;
a=0;// .super Landroid/view/View;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private DA:I
a=0;// 
a=0;// .field private DB:I
a=0;// 
a=0;// .field private DC:I
a=0;// 
a=0;// .field private DD:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;// .field private DE:Z
a=0;// 
a=0;// .field private DF:I
a=0;// 
a=0;// .field private DG:Z
a=0;// 
a=0;// .field private DH:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;// .field private DI:I
a=0;// 
a=0;// .field private DJ:I
a=0;// 
a=0;// .field private Dy:I
a=0;// 
a=0;// .field private Dz:I
a=0;// 
a=0;// .field private ar:Landroid/graphics/Paint;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/InkView;);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/view/InkView;->DD:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 32
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/view/InkView;->DE:Z
a=0;// 
a=0;//     .line 34
a=0;//     const/16 v0, 0x3c
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/InkView;->DF:I
a=0;// 
a=0;//     .line 35
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/view/InkView;->DG:Z
a=0;// 
a=0;//     .line 36
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/view/InkView;->DH:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/InkView;);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/view/InkView;->DD:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 32
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/view/InkView;->DE:Z
a=0;// 
a=0;//     .line 34
a=0;//     const/16 v0, 0x3c
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/InkView;->DF:I
a=0;// 
a=0;//     .line 35
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/view/InkView;->DG:Z
a=0;// 
a=0;//     .line 36
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/view/InkView;->DH:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 131
a=0;//     #v4=(Integer);
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 137
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/view/InkView;->DE:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/InkView;->DF:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
a=0;// 
a=0;//     .line 139
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/InkView;->Dy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/InkView;->Dz:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/InkView;->DB:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/InkView;->DB:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/InkView;->DA:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     .line 144
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     mul-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/InkView;->DC:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/2addr v0, v2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 149
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/InkView;->Dy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/InkView;->Dz:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/InkView;->DA:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     const/16 v1, 0xff
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/InkView;->DB:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/InkView;->DA:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 155
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/InkView;->Dy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/InkView;->Dz:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/InkView;->DB:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, v4
a=0;// 
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/view/InkView;->DA:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/view/InkView;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/InkView;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/view/InkView;->DE:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 230
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/InkView;->DD:Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/view/InkView;->DG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 226
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/InkView;->DI:I
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/InkView;->DJ:I
a=0;// 
a=0;//     .line 230
a=0;//     :cond_3
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
