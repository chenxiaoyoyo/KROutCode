package com.kingroot.RushRoot.views.components; class SlidingUpPanelLayout { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// .field private static final b:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private A:F
a=0;// 
a=0;// .field private B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;// .field private final C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private D:Z
a=0;// 
a=0;// .field private final E:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private final e:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private final f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:I
a=0;// 
a=0;// .field private k:Z
a=0;// 
a=0;// .field private l:Z
a=0;// 
a=0;// .field private m:Z
a=0;// 
a=0;// .field private n:Landroid/view/View;
a=0;// 
a=0;// .field private o:I
a=0;// 
a=0;// .field private p:Landroid/view/View;
a=0;// 
a=0;// .field private q:Landroid/view/View;
a=0;// 
a=0;// .field private r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;// .field private s:F
a=0;// 
a=0;// .field private t:I
a=0;// 
a=0;// .field private u:Z
a=0;// 
a=0;// .field private v:Z
a=0;// 
a=0;// .field private w:Z
a=0;// 
a=0;// .field private final x:I
a=0;// 
a=0;// .field private y:F
a=0;// 
a=0;// .field private z:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const-class v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x10100af
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 294
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 299
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 304
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     const/16 v0, 0x190
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c:I
a=0;// 
a=0;//     .line 71
a=0;//     const/high16 v0, -0x67000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d:I
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 91
a=0;//     iput v5, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     .line 95
a=0;//     iput v5, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->h:I
a=0;// 
a=0;//     .line 100
a=0;//     iput v5, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     .line 105
a=0;//     iput v5, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j:I
a=0;// 
a=0;//     .line 120
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->m:Z
a=0;// 
a=0;//     .line 130
a=0;//     iput v5, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->o:I
a=0;// 
a=0;//     .line 150
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/views/components/i;->b:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     .line 189
a=0;//     iput v7, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->A:F
a=0;// 
a=0;//     .line 204
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     .line 209
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 315
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 316
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 319
a=0;//     #v3=(Reference,Landroid/content/res/TypedArray;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v3, v2, v2}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 321
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0x30
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v0, v4, :cond_0
a=0;// 
a=0;//     const/16 v4, 0x50
a=0;// 
a=0;//     if-eq v0, v4, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "gravity must be set to either top or bottom"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 325
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     const/16 v4, 0x50
a=0;// 
a=0;//     if-ne v0, v4, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     .line 328
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 330
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ad;->SlidingUpPanelLayout:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 334
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->h:I
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     .line 339
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j:I
a=0;// 
a=0;//     .line 342
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0x190
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c:I
a=0;// 
a=0;//     .line 345
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/high16 v4, -0x67000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d:I
a=0;// 
a=0;//     .line 349
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->o:I
a=0;// 
a=0;//     .line 352
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->m:Z
a=0;// 
a=0;//     .line 357
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 361
a=0;//     :cond_3
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
a=0;//     .line 362
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_4
a=0;// 
a=0;//     .line 363
a=0;//     const/high16 v3, 0x42880000    # 68.0f
a=0;// 
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v3, v6
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     .line 365
a=0;//     :cond_4
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     if-ne v3, v5, :cond_5
a=0;// 
a=0;//     .line 366
a=0;//     const/high16 v3, 0x40800000    # 4.0f
a=0;// 
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v3, v6
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     .line 368
a=0;//     :cond_5
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j:I
a=0;// 
a=0;//     if-ne v3, v5, :cond_6
a=0;// 
a=0;//     .line 369
a=0;//     mul-float v3, v7, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j:I
a=0;// 
a=0;//     .line 372
a=0;//     :cond_6
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     if-lez v3, :cond_9
a=0;// 
a=0;//     .line 373
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 374
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     const/high16 v4, 0x7f020000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 385
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 388
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/views/components/f;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/views/components/f;);
a=0;//     invoke-direct {v3, p0, v2}, Lcom/kingroot/RushRoot/views/components/f;-><init>(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;B)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/views/components/f;);
a=0;//     invoke-static {p0, v6, v3}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iput-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 392
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     .line 393
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->v:Z
a=0;// 
a=0;//     .line 395
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 396
a=0;//     #v0=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->x:I
a=0;// 
a=0;//     .line 397
a=0;//     return-void
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Null);v3=(Reference,Landroid/content/res/TypedArray;);v4=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 325
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 377
a=0;//     :cond_8
a=0;//     #v0=(Integer);v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     const v4, 0x7f020001
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 382
a=0;//     :cond_9
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;Lcom/kingroot/RushRoot/views/components/i;)Lcom/kingroot/RushRoot/views/components/i;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     sub-int v0, p1, v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/kingroot/RushRoot/views/components/g;->a(F)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->q:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/a;->a(Landroid/view/View;)Lcom/kingroot/RushRoot/views/components/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/RushRoot/views/components/a;->a(F)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     sub-int/2addr v0, p1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(F)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1179
a=0;//     #v1=(Null);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1197
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1184
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1186
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     add-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 1190
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v0}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1192
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e()V
a=0;// 
a=0;//     .line 1194
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1195
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1186
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);v3=(Reference,Landroid/view/View;);v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1197
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(II)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 940
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->n:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->n:Landroid/view/View;
a=0;// 
a=0;//     .line 941
a=0;//     :goto_0
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 949
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 940
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Reference,Landroid/view/View;);v3=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 943
a=0;//     :cond_2
a=0;//     new-array v3, v4, [I
a=0;// 
a=0;//     .line 944
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 945
a=0;//     new-array v4, v4, [I
a=0;// 
a=0;//     .line 946
a=0;//     #v4=(Reference,[I);
a=0;//     invoke-virtual {p0, v4}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 947
a=0;//     aget v5, v4, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, p1
a=0;// 
a=0;//     .line 948
a=0;//     aget v4, v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, p2
a=0;// 
a=0;//     .line 949
a=0;//     aget v6, v3, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v5, v6, :cond_0
a=0;// 
a=0;//     aget v6, v3, v0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     if-ge v5, v6, :cond_0
a=0;// 
a=0;//     aget v5, v3, v1
a=0;// 
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     aget v3, v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     if-ge v4, v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->u:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->A:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private f()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 989
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 990
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     .line 994
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 990
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 994
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Lcom/kingroot/RushRoot/views/components/i;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic j(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/kingroot/RushRoot/views/components/g;->d()V
a=0;// 
a=0;//     .line 546
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 547
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/views/components/g;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 485
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     .line 486
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 555
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/kingroot/RushRoot/views/components/g;->b()V
a=0;// 
a=0;//     .line 558
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 559
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final c()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 568
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     .line 570
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 571
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1280
a=0;//     instance-of v0, p1, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1203
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1204
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1205
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->abort()V
a=0;// 
a=0;//     .line 1211
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1209
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final d()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 577
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 610
a=0;//     :goto_0
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 580
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 581
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v6, v0, v2
a=0;// 
a=0;//     .line 582
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 583
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int v8, v0, v2
a=0;// 
a=0;//     .line 588
a=0;//     #v8=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Integer);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 590
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 591
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 592
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 596
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 597
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 598
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-static {v6, v10}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 600
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-static {v8, v10}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 603
a=0;//     if-lt v5, v4, :cond_1
a=0;// 
a=0;//     if-lt v7, v2, :cond_1
a=0;// 
a=0;//     if-gt v6, v3, :cond_1
a=0;// 
a=0;//     if-gt v8, v0, :cond_1
a=0;// 
a=0;//     .line 605
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 609
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);v4=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 588
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v1
a=0;// 
a=0;//     .line 594
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1215
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 1217
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1240
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1223
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1226
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1227
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     .line 1228
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1233
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1236
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1237
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v4, v3, v1, v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 1238
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1230
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1231
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 1127
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     .line 1130
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->save(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1132
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1134
a=0;//     #v1=(Null);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1138
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1139
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1140
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1141
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, v0, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 1147
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1150
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, v0, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     .line 1151
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1155
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1156
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 1159
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1160
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d:I
a=0;// 
a=0;//     const/high16 v2, -0x1000000
a=0;// 
a=0;//     and-int/2addr v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     .line 1161
a=0;//     #v0=(Char);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     sub-float v2, v5, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 1162
a=0;//     #v0=(Integer);
a=0;//     shl-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const v3, 0xffffff
a=0;// 
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     or-int/2addr v0, v2
a=0;// 
a=0;//     .line 1163
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 1164
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1167
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1144
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);v2=(Integer);v3=(Boolean);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->E:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method final e()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 616
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 618
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 616
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 622
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1268
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1285
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1274
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     invoke-direct {v0, p1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 637
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 638
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     .line 639
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 643
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 644
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     .line 645
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onFinishInflate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V
a=0;// 
a=0;//     .line 405
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 406
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->o:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->n:Landroid/view/View;
a=0;// 
a=0;//     .line 408
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 816
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 818
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->v:Z
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->u:Z
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 821
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 822
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 881
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Float);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 825
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v0, v3, :cond_3
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 828
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 832
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 833
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 837
a=0;//     #v4=(Float);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_5
a=0;//     :pswitch_0
a=0;//     #v3=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 878
a=0;//     :cond_6
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v3, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 881
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_7
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 839
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v2=(Null);v3=(Float);v4=(Float);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->u:Z
a=0;// 
a=0;//     .line 840
a=0;//     iput v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->y:F
a=0;// 
a=0;//     .line 841
a=0;//     iput v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->z:F
a=0;// 
a=0;//     .line 843
a=0;//     float-to-int v0, v3
a=0;// 
a=0;//     float-to-int v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->w:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 845
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 851
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v3=(Float);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->y:F
a=0;// 
a=0;//     sub-float v0, v3, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 852
a=0;//     #v5=(Float);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->z:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v0, v4, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 853
a=0;//     #v6=(Float);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 856
a=0;//     #v7=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->w:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 858
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->x:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v5, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->x:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpg-float v0, v6, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_8
a=0;// 
a=0;//     .line 859
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 862
a=0;//     :cond_8
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->x:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v6, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     .line 863
a=0;//     float-to-int v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v8, v4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {p0, v0, v8}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 867
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v8=(Conflicted);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v7, v6, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_9
a=0;// 
a=0;//     cmpl-float v5, v5, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gtz v5, :cond_a
a=0;// 
a=0;//     :cond_9
a=0;//     #v5=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(II)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 870
a=0;//     :cond_a
a=0;//     #v3=(Float);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 871
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->u:Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Byte);v4=(Float);v7=(Integer);v8=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 837
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 734
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 735
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 736
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 738
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 741
a=0;//     #v6=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 742
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/views/components/e;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/views/components/i;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v0, v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 750
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     .line 755
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v3, v6, :cond_9
a=0;// 
a=0;//     .line 756
a=0;//     invoke-virtual {p0, v3}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 758
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v0, v2, :cond_3
a=0;// 
a=0;//     .line 759
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     .line 763
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 766
a=0;//     #v8=(Integer);
a=0;//     iget-boolean v2, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 767
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v8, v2
a=0;// 
a=0;//     iput v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     .line 772
a=0;//     :cond_1
a=0;//     iget-boolean v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->k:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 773
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v5
a=0;// 
a=0;//     :goto_2
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 783
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     add-int v0, v2, v8
a=0;// 
a=0;//     .line 784
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     add-int/2addr v8, v4
a=0;// 
a=0;//     .line 788
a=0;//     invoke-virtual {v7, v4, v2, v8, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 755
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 744
a=0;//     :pswitch_0
a=0;//     #v3=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 747
a=0;//     :pswitch_1
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->A:F
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v2=(Boolean);v3=(Integer);v7=(Reference,Landroid/view/View;);v8=(Integer);v9=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 773
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 776
a=0;//     :cond_7
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     iget-boolean v2, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->t:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v9, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->s:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     mul-float/2addr v2, v9
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v5, v2
a=0;// 
a=0;//     .line 778
a=0;//     :goto_6
a=0;//     #v9=(Conflicted);
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->m:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);v2=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 776
a=0;//     #v2=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 791
a=0;//     :cond_9
a=0;//     #v0=(Integer);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 792
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d()V
a=0;// 
a=0;//     .line 795
a=0;//     :cond_a
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     .line 796
a=0;//     return-void
a=0;// 
a=0;//     .line 742
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 650
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 651
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 652
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 655
a=0;//     #v4=(Integer);
a=0;//     const/high16 v2, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     .line 656
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Width must have an exact value or MATCH_PARENT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 658
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     if-eq v1, v0, :cond_1
a=0;// 
a=0;//     .line 659
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Height must have an exact value or MATCH_PARENT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 663
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int v0, v4, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v5, v0, v1
a=0;// 
a=0;//     .line 664
a=0;//     #v5=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g:I
a=0;// 
a=0;//     .line 666
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 668
a=0;//     #v6=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-le v6, v0, :cond_2
a=0;// 
a=0;//     .line 669
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onMeasure: More than two child views are not supported."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 672
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     .line 676
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     .line 679
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v2, v6, :cond_9
a=0;// 
a=0;//     .line 680
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 681
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     .line 683
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v1, v8, :cond_3
a=0;// 
a=0;//     .line 685
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->b:Z
a=0;// 
a=0;//     .line 679
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v8=(Integer);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 671
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 689
a=0;//     :cond_3
a=0;//     #v7=(Reference,Landroid/view/View;);v8=(PosByte);v9=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v2, v1, :cond_4
a=0;// 
a=0;//     .line 690
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     .line 691
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->b:Z
a=0;// 
a=0;//     .line 692
a=0;//     iput-object v7, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     .line 693
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     .line 703
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     iget v1, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v8, -0x2
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v1, v8, :cond_5
a=0;// 
a=0;//     .line 704
a=0;//     const/high16 v1, -0x80000000
a=0;// 
a=0;//     invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 715
a=0;//     :goto_4
a=0;//     #v8=(Integer);
a=0;//     iget v8, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-ne v8, v9, :cond_7
a=0;// 
a=0;//     .line 716
a=0;//     const/high16 v0, -0x80000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 726
a=0;//     :goto_5
a=0;//     invoke-virtual {v7, v1, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 695
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);v1=(One);v8=(PosByte);v9=(Conflicted);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->m:Z
a=0;// 
a=0;//     .line 698
a=0;//     #v1=(Boolean);
a=0;//     iput-object v7, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->q:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 706
a=0;//     :cond_5
a=0;//     #v1=(Integer);v8=(Byte);
a=0;//     iget v1, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->width:I
a=0;// 
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     if-ne v1, v8, :cond_6
a=0;// 
a=0;//     .line 707
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 710
a=0;//     :cond_6
a=0;//     iget v1, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->width:I
a=0;// 
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v1, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 718
a=0;//     :cond_7
a=0;//     #v9=(Byte);
a=0;//     iget v8, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     if-ne v8, v9, :cond_8
a=0;// 
a=0;//     .line 719
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 722
a=0;//     :cond_8
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v0, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 729
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 730
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1302
a=0;//     check-cast p1, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;
a=0;// 
a=0;//     .line 1303
a=0;//     invoke-virtual {p1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1291
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1293
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;);
a=0;//     invoke-direct {v1, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1294
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     .line 1296
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 800
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 802
a=0;//     if-eq p2, p4, :cond_0
a=0;// 
a=0;//     .line 803
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     .line 805
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 888
a=0;//     #v2=(Null);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->l:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->v:Z
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 889
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 923
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 893
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Boolean);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 895
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 896
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 900
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 901
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 902
a=0;//     #v2=(Float);
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->y:F
a=0;// 
a=0;//     .line 903
a=0;//     iput v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->z:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 908
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 909
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 910
a=0;//     #v4=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->y:F
a=0;// 
a=0;//     sub-float v5, v3, v1
a=0;// 
a=0;//     .line 911
a=0;//     #v5=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->z:F
a=0;// 
a=0;//     sub-float v6, v4, v1
a=0;// 
a=0;//     .line 912
a=0;//     #v6=(Float);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->C:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 913
a=0;//     #v7=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->n:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->n:Landroid/view/View;
a=0;// 
a=0;//     .line 914
a=0;//     :goto_1
a=0;//     mul-float/2addr v5, v5
a=0;// 
a=0;//     mul-float/2addr v6, v6
a=0;// 
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     mul-int v6, v7, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     cmpg-float v5, v5, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(II)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 916
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 918
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/RushRoot/views/components/i;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     if-ne v1, v3, :cond_6
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     sget-object v3, Lcom/kingroot/RushRoot/views/components/i;->c:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     if-ne v1, v3, :cond_7
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 919
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->A:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/g;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v1}, Lcom/kingroot/RushRoot/views/components/g;->c()V
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->r:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     sget-object v4, Lcom/kingroot/RushRoot/views/components/i;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     if-eq v1, v4, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v8, :cond_8
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v8, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->requestLayout()V
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(F)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 913
a=0;//     :cond_5
a=0;//     #v1=(Reference,Landroid/view/View;);v3=(Float);v4=(Float);v5=(Float);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/views/components/i;);v4=(Integer);v5=(Byte);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 918
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Integer);v3=(Integer);v4=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 919
a=0;//     #v1=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 921
a=0;//     :cond_9
a=0;//     #v1=(Boolean);v3=(Reference,Lcom/kingroot/RushRoot/views/components/i;);v4=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->B:Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->p:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v1}, Lcom/kingroot/RushRoot/views/components/g;->a()V
a=0;// 
a=0;//     :cond_a
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->D:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(F)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 896
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
