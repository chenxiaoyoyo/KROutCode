package com.kingroot.kinguser.view; class CircleProcessView { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/view/CircleProcessView;
a=0;// .super Landroid/view/View;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Dl:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private Dm:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private Dn:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private Do:F
a=0;// 
a=0;// .field private Dp:I
a=0;// 
a=0;// .field private Dq:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/CircleProcessView;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/view/CircleProcessView;->init()V
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/CircleProcessView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     const v1, 0x7f080046
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dm:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dm:Landroid/graphics/Paint;
a=0;// 
a=0;//     const v2, 0x7f070008
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dm:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dm:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dn:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dn:Landroid/graphics/Paint;
a=0;// 
a=0;//     const v2, 0x7f070013
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dn:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dn:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput v3, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dp:I
a=0;// 
a=0;//     .line 50
a=0;//     iput v3, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dm:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dn:Landroid/graphics/Paint;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dl:Landroid/graphics/RectF;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dp:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dl:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     add-int/lit16 v0, v0, 0xb4
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     rsub-int v0, v0, 0x168
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dn:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dl:Landroid/graphics/RectF;
a=0;// 
a=0;//     const/high16 v2, 0x43340000    # 180.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dm:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 64
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dq:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dp:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/CircleProcessView;->invalidate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v6, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 81
a=0;//     #v6=(Integer);
a=0;//     invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-float/2addr v1, v6
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-float/2addr v2, v6
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/CircleProcessView;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-float/2addr v4, v6
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/CircleProcessView;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Do:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/CircleProcessView;->Dl:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
}}
