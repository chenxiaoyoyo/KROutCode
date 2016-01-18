package com.kingcore.uilib; class TextProgressBar { void a() { int a;
a=0;// .class public Lcom/kingcore/uilib/TextProgressBar;
a=0;// .super Landroid/widget/ProgressBar;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ar:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private cB:Ljava/lang/String;
a=0;// 
a=0;// .field private cC:I
a=0;// 
a=0;// .field private cD:I
a=0;// 
a=0;// .field private cE:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/TextProgressBar;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/TextProgressBar;->cC:I
a=0;// 
a=0;//     .line 24
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/TextProgressBar;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/TextProgressBar;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/TextProgressBar;->cC:I
a=0;// 
a=0;//     .line 36
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/TextProgressBar;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/TextProgressBar;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/TextProgressBar;->cC:I
a=0;// 
a=0;//     .line 30
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/TextProgressBar;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/TextProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/TextProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/TextProgressBar;->cC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 42
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/TextProgressBar;->cB:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/TextProgressBar;->cE:F
a=0;// 
a=0;//     .line 45
a=0;//     const/high16 v0, 0x41600000    # 14.0f
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/TextProgressBar;->cE:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/TextProgressBar;->cD:I
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/widget/ProgressBar;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/TextProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/TextProgressBar;->cC:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/TextProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/TextProgressBar;->cB:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/kingcore/uilib/TextProgressBar;->cB:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v4, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/TextProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v2, p0, Lcom/kingcore/uilib/TextProgressBar;->cD:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/TextProgressBar;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/TextProgressBar;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v2, v0
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/TextProgressBar;->cB:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v3, p0, Lcom/kingcore/uilib/TextProgressBar;->ar:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v2, v1, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 63
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public v(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iput-object p1, p0, Lcom/kingcore/uilib/TextProgressBar;->cB:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
}}
