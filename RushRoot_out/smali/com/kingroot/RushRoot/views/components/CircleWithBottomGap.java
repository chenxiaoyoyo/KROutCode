package com.kingroot.RushRoot.views.components; class CircleWithBottomGap { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;
a=0;// .super Landroid/view/View;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:F
a=0;// 
a=0;// .field private b:F
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private g:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->h:I
a=0;// 
a=0;//     .line 28
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->h:I
a=0;// 
a=0;//     .line 29
a=0;//     const/high16 v0, 0x43960000    # 300.0f
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->a:F
a=0;// 
a=0;//     .line 30
a=0;//     const/high16 v0, 0x42f00000    # 120.0f
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->b:F
a=0;// 
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->a()V
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->h:I
a=0;// 
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->a()V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v1, 0x7f070001
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->c:I
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->h:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->f:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->b:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->a:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 58
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->d:I
a=0;// 
a=0;//     .line 59
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->e:I
a=0;// 
a=0;//     .line 60
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v2, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-double/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     add-float v2, v4, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v3, v4, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->d:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->e:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float v0, v5, v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;->f:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
}}
