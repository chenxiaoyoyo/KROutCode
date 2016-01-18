package com.kingroot.RushRoot.views.components; class CheckingProgressBar { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// .super Landroid/view/View;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:F
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:F
a=0;// 
a=0;// .field private g:F
a=0;// 
a=0;// .field private h:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private i:Landroid/os/Handler;
a=0;// 
a=0;// .field private j:F
a=0;// 
a=0;// .field private k:Landroid/graphics/Paint;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->a()V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->a()V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;F)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v4=(Null);
a=0;//     const/high16 v0, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->a:F
a=0;// 
a=0;//     .line 48
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->b:I
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->getResources()Landroid/content/res/Resources;
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
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->c:I
a=0;// 
a=0;//     .line 51
a=0;//     const/high16 v0, 0x42700000    # 60.0f
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0, v5}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f070002
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->g:F
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->f:F
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Landroid/graphics/SweepGradient;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/SweepGradient;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->f:F
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->g:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v3, v7, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aput v4, v3, v4
a=0;// 
a=0;//     const v4, 0xe5f2fd
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aput v4, v3, v5
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     const/high16 v6, 0x7f060000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     new-array v4, v7, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     fill-array-data v4, :array_0
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Landroid/graphics/SweepGradient;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3e99999a    # 0.3f
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;)F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final onAttachedToWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/b;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/RushRoot/views/components/b;-><init>(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/b;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->i:Landroid/os/Handler;
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 114
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->i:Landroid/os/Handler;
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/os/Handler;);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 71
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->j:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->f:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->g:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->h:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     const/high16 v2, 0x43340000    # 180.0f
a=0;// 
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->a:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onSizeChanged(IIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 79
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->d:I
a=0;// 
a=0;//     .line 80
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->e:I
a=0;// 
a=0;//     .line 81
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->f:F
a=0;// 
a=0;//     .line 82
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->g:F
a=0;// 
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->c:I
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
a=0;//     .line 84
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     add-float v2, v4, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v3, v4, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->d:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->e:I
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
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->h:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
}}
