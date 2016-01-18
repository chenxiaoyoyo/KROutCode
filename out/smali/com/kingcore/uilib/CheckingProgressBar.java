package com.kingcore.uilib; class CheckingProgressBar { void a() { int a;
a=0;// .class public final Lcom/kingcore/uilib/CheckingProgressBar;
a=0;// .super Landroid/view/View;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ai:F
a=0;// 
a=0;// .field private aj:I
a=0;// 
a=0;// .field private ak:I
a=0;// 
a=0;// .field private al:I
a=0;// 
a=0;// .field private am:I
a=0;// 
a=0;// .field private an:F
a=0;// 
a=0;// .field private ao:F
a=0;// 
a=0;// .field private ap:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private aq:F
a=0;// 
a=0;// .field private ar:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/CheckingProgressBar;);
a=0;//     invoke-direct {p0}, Lcom/kingcore/uilib/CheckingProgressBar;->init()V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/CheckingProgressBar;);
a=0;//     invoke-direct {p0}, Lcom/kingcore/uilib/CheckingProgressBar;->init()V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingcore/uilib/CheckingProgressBar;F)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingcore/uilib/CheckingProgressBar;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aj:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic b(Lcom/kingcore/uilib/CheckingProgressBar;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic b(Lcom/kingcore/uilib/CheckingProgressBar;F)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private init()V
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
a=0;//     .line 48
a=0;//     #v4=(Null);
a=0;//     const/high16 v0, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ai:F
a=0;// 
a=0;//     .line 49
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aj:I
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CheckingProgressBar;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v1, 0x7f080061
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ak:I
a=0;// 
a=0;//     .line 52
a=0;//     const/high16 v0, 0x42700000    # 60.0f
a=0;// 
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0, v5}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ak:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CheckingProgressBar;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f08005f
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
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ao:F
a=0;// 
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->an:F
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Landroid/graphics/SweepGradient;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/SweepGradient;);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->an:F
a=0;// 
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ao:F
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
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CheckingProgressBar;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     const v6, 0x7f070009
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
a=0;//     .line 66
a=0;//     #v0=(Reference,Landroid/graphics/SweepGradient;);
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// 
a=0;//     .line 61
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3e99999a    # 0.3f
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ad;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ad;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/ad;-><init>(Lcom/kingcore/uilib/CheckingProgressBar;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ad;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->mHandler:Landroid/os/Handler;
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
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/os/Handler;);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 72
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->aq:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->an:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ao:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ap:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     const/high16 v2, 0x43340000    # 180.0f
a=0;// 
a=0;//     iget v3, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ai:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 80
a=0;//     iput p1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->al:I
a=0;// 
a=0;//     .line 81
a=0;//     iput p2, p0, Lcom/kingcore/uilib/CheckingProgressBar;->am:I
a=0;// 
a=0;//     .line 82
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->al:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->an:F
a=0;// 
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->am:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ao:F
a=0;// 
a=0;//     .line 84
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ak:I
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
a=0;//     .line 85
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     add-float v2, v4, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v3, v4, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/CheckingProgressBar;->al:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingcore/uilib/CheckingProgressBar;->am:I
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
a=0;//     iput-object v1, p0, Lcom/kingcore/uilib/CheckingProgressBar;->ap:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
}}
