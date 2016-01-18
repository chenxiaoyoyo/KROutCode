package com.kingroot.RushRoot.views.components; class RootingProgressBar { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/views/components/RootingProgressBar;
a=0;// .super Landroid/view/View;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// .field private f:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/RootingProgressBar;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->a()V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/RootingProgressBar;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->a()V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/views/components/RootingProgressBar;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     const v2, 0x7f070008
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->a:I
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 58
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     .line 63
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->h:[I
a=0;// 
a=0;//     .line 64
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->h:[I
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->h:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     const/16 v2, 0xff
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/high16 v3, 0x43650000    # 229.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v4, -0x3e59745d
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x43720000    # 242.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const v5, -0x3ed8ba2f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x437d0000    # 253.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const v6, -0x4022e8ba
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v2, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v1, v0
a=0;// 
a=0;//     .line 77
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/views/components/RootingProgressBar;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/views/components/RootingProgressBar;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x2d
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/RushRoot/views/components/RootingProgressBar;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final onAttachedToWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/d;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/RushRoot/views/components/d;-><init>(Lcom/kingroot/RushRoot/views/components/RootingProgressBar;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/d;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 152
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->e:Landroid/os/Handler;
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/os/Handler;);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x2d
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     #v4=(Null);
a=0;//     iget v6, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v7, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     if-ge v7, v8, :cond_3
a=0;// 
a=0;//     .line 88
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v6, v0
a=0;// 
a=0;//     .line 89
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->h:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     aget v0, v2, v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 96
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-lt v6, v8, :cond_4
a=0;// 
a=0;//     .line 97
a=0;//     add-int/lit8 v0, v6, -0x2d
a=0;// 
a=0;//     .line 100
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x2a
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     add-int/lit8 v0, v7, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     move v7, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     const v1, -0x241914
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 100
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     const/high16 v1, 0x42b70000    # 91.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v2, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     add-float v2, v1, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->d:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     const/high16 v3, 0x40a00000    # 5.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->f:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 102
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected final onSizeChanged(IIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 118
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->b:I
a=0;// 
a=0;//     .line 119
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->c:I
a=0;// 
a=0;//     .line 120
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->a:I
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
a=0;//     .line 121
a=0;//     #v0=(Float);
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     add-float v2, v4, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v3, v4, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->c:I
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
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/views/components/RootingProgressBar;->d:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
}}
