package com.kingcore.uilib; class CircleWithButton { void a() { int a;
a=0;// .class public Lcom/kingcore/uilib/CircleWithButton;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aA:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private aB:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private aC:I
a=0;// 
a=0;// .field private aD:I
a=0;// 
a=0;// .field private aE:Ljava/lang/String;
a=0;// 
a=0;// .field private aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private aG:Landroid/widget/TextView;
a=0;// 
a=0;// .field private aH:Landroid/widget/TextView;
a=0;// 
a=0;// .field private final aI:I
a=0;// 
a=0;// .field private final aJ:I
a=0;// 
a=0;// .field private aK:Ljava/lang/String;
a=0;// 
a=0;// .field private aL:Ljava/lang/String;
a=0;// 
a=0;// .field private aM:Z
a=0;// 
a=0;// .field private aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;// .field private aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;// .field private final aP:I
a=0;// 
a=0;// .field private final aQ:I
a=0;// 
a=0;// .field private aR:F
a=0;// 
a=0;// .field private aS:Z
a=0;// 
a=0;// .field private ak:I
a=0;// 
a=0;// .field private al:I
a=0;// 
a=0;// .field private am:I
a=0;// 
a=0;// .field private ap:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private at:F
a=0;// 
a=0;// .field private au:I
a=0;// 
a=0;// .field private av:F
a=0;// 
a=0;// .field private aw:F
a=0;// 
a=0;// .field private ax:F
a=0;// 
a=0;// .field private ay:F
a=0;// 
a=0;// .field private az:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/CircleWithButton;);
a=0;//     const/high16 v0, 0x40400000    # 3.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->at:F
a=0;// 
a=0;//     .line 66
a=0;//     iput v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aC:I
a=0;// 
a=0;//     .line 67
a=0;//     iput v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aD:I
a=0;// 
a=0;//     .line 68
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aE:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     iput v1, p0, Lcom/kingcore/uilib/CircleWithButton;->aI:I
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aJ:I
a=0;// 
a=0;//     .line 83
a=0;//     iput-boolean v1, p0, Lcom/kingcore/uilib/CircleWithButton;->aM:Z
a=0;// 
a=0;//     .line 87
a=0;//     const/16 v0, 0x168
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aP:I
a=0;// 
a=0;//     .line 88
a=0;//     const/16 v0, 0x5a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aQ:I
a=0;// 
a=0;//     .line 341
a=0;//     const v0, 0x3eb33333    # 0.35f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aR:F
a=0;// 
a=0;//     .line 467
a=0;//     iput-boolean v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aS:Z
a=0;// 
a=0;//     .line 92
a=0;//     iput-object p1, p0, Lcom/kingcore/uilib/CircleWithButton;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 93
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ce;->dc:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/kingcore/uilib/CircleWithButton;->aE:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->au:I
a=0;// 
a=0;//     .line 96
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->au:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingcore/uilib/CircleWithButton;->g(I)V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/CircleWithButton;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingcore/uilib/CircleWithButton;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingcore/uilib/CircleWithButton;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 197
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->invalidate()V
a=0;// 
a=0;//     .line 198
a=0;//     return-void
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/View;Lcom/android/animation/AnimatorListenerAdapter;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     .line 516
a=0;//     #v6=(PosByte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 531
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "scaleX"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v6, [F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     fill-array-data v1, :array_0
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 520
a=0;//     const-string v1, "scaleY"
a=0;// 
a=0;//     new-array v2, v6, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     fill-array-data v2, :array_1
a=0;// 
a=0;//     invoke-static {p0, v1, v2}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 521
a=0;//     const-string v2, "alpha"
a=0;// 
a=0;//     new-array v3, v6, [F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     fill-array-data v3, :array_2
a=0;// 
a=0;//     invoke-static {p0, v2, v3}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 523
a=0;//     new-instance v3, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v3}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 524
a=0;//     #v3=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v4=(Reference,[Lcom/android/animation/Animator;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v1, v4, v0
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/android/animation/AnimatorSet;->playTogether([Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 525
a=0;//     const-wide/16 v0, 0x12c
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3, v0, v1}, Lcom/android/animation/AnimatorSet;->setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 526
a=0;//     new-instance v0, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-virtual {v3, v0}, Lcom/android/animation/AnimatorSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 527
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 528
a=0;//     invoke-virtual {v3, p1}, Lcom/android/animation/AnimatorSet;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 530
a=0;//     :cond_1
a=0;//     invoke-virtual {v3}, Lcom/android/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 519
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x3f000000    # 0.5f
a=0;//     .end array-data
a=0;// 
a=0;//     .line 520
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x3f000000    # 0.5f
a=0;//     .end array-data
a=0;// 
a=0;//     .line 521
a=0;//     :array_2
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingcore/uilib/CircleWithButton;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iput-boolean p1, p0, Lcom/kingcore/uilib/CircleWithButton;->aS:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private aa()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     .line 471
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ab()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/AnimatorSet;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 475
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aS:Z
a=0;// 
a=0;//     .line 479
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 477
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private ac()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v6, 0x3f733333    # 0.95f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 482
a=0;//     #v4=(Null);
a=0;//     const-string v0, "scaleX"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v5, [F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     aput v3, v1, v4
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 483
a=0;//     const-string v1, "scaleY"
a=0;// 
a=0;//     new-array v2, v5, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     aput v3, v2, v4
a=0;// 
a=0;//     invoke-static {p0, v1, v2}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 484
a=0;//     new-instance v2, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v2}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iput-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 485
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     new-array v3, v7, [Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/android/animation/Animator;);
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     aput-object v1, v3, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/android/animation/AnimatorSet;->playTogether([Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 486
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     const-wide/16 v1, 0x32
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/android/animation/AnimatorSet;->setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     new-instance v1, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 488
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ay;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ay;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/ay;-><init>(Lcom/kingcore/uilib/CircleWithButton;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ay;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 497
a=0;//     const-string v0, "scaleX"
a=0;// 
a=0;//     new-array v1, v5, [F
a=0;// 
a=0;//     aput v6, v1, v4
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 498
a=0;//     const-string v1, "scaleY"
a=0;// 
a=0;//     new-array v2, v5, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     aput v6, v2, v4
a=0;// 
a=0;//     invoke-static {p0, v1, v2}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 499
a=0;//     new-instance v2, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v2}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iput-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 500
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     new-array v3, v7, [Lcom/android/animation/Animator;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     aput-object v1, v3, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/android/animation/AnimatorSet;->playTogether([Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 501
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     const-wide/16 v1, 0x32
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/android/animation/AnimatorSet;->setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 502
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     new-instance v1, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/az;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/az;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/az;-><init>(Lcom/kingcore/uilib/CircleWithButton;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/az;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/AnimatorSet;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 512
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic b(Lcom/kingcore/uilib/CircleWithButton;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/view/View;Lcom/android/animation/AnimatorListenerAdapter;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     .line 535
a=0;//     #v6=(PosByte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 552
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 538
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "scaleX"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v6, [F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     fill-array-data v1, :array_0
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 540
a=0;//     const-string v1, "scaleY"
a=0;// 
a=0;//     new-array v2, v6, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     fill-array-data v2, :array_1
a=0;// 
a=0;//     invoke-static {p0, v1, v2}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 542
a=0;//     const-string v2, "alpha"
a=0;// 
a=0;//     new-array v3, v6, [F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     fill-array-data v3, :array_2
a=0;// 
a=0;//     invoke-static {p0, v2, v3}, Lcom/android/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 544
a=0;//     new-instance v3, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v3}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 545
a=0;//     #v3=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Lcom/android/animation/Animator;
a=0;// 
a=0;//     #v4=(Reference,[Lcom/android/animation/Animator;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v1, v4, v0
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/android/animation/AnimatorSet;->playTogether([Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 546
a=0;//     const-wide/16 v0, 0x12c
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3, v0, v1}, Lcom/android/animation/AnimatorSet;->setDuration(J)Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 547
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v3, v0}, Lcom/android/animation/AnimatorSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 548
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 549
a=0;//     invoke-virtual {v3, p1}, Lcom/android/animation/AnimatorSet;->addListener(Lcom/android/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 551
a=0;//     :cond_1
a=0;//     invoke-virtual {v3}, Lcom/android/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 538
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x3f000000    # 0.5f
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// 
a=0;//     .line 540
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x3f000000    # 0.5f
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// 
a=0;//     .line 542
a=0;//     :array_2
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic c(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aD:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic d(Lcom/kingcore/uilib/CircleWithButton;)Landroid/graphics/Paint;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic e(Lcom/kingcore/uilib/CircleWithButton;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic f(Lcom/kingcore/uilib/CircleWithButton;)Landroid/graphics/Paint;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic g(Lcom/kingcore/uilib/CircleWithButton;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic h(Lcom/kingcore/uilib/CircleWithButton;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-boolean v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aS:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic i(Lcom/kingcore/uilib/CircleWithButton;)Lcom/android/animation/AnimatorSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aN:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v0, Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/AnimatorSet;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/AnimatorSet;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aO:Lcom/android/animation/AnimatorSet;
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private j(Landroid/content/Context;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, -0x2
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/16 v9, 0xe
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const-wide v7, 0x3fa999999999999aL    # 0.05
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 120
a=0;//     #v6=(One);
a=0;//     const v0, 0x3ecccccd    # 0.4f
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iget v3, p0, Lcom/kingcore/uilib/CircleWithButton;->am:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 122
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v9, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 123
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->am:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide v4, 0x3fc3333333333333L    # 0.15
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 124
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     mul-double/2addr v2, v7
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 125
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     mul-double/2addr v2, v7
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setId(I)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingcore/uilib/CircleWithButton;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 130
a=0;//     const v0, 0x3f59999a    # 0.85f
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v1, v0, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 132
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f080045
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f070016
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aK:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     .line 138
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide v4, 0x3f947ae147ae147bL    # 0.02
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 139
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     mul-double/2addr v2, v7
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 140
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     mul-double/2addr v2, v7
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v1, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingcore/uilib/CircleWithButton;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 146
a=0;//     const v0, 0x3f333333    # 0.7f
a=0;// 
a=0;//     .line 147
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v1, v0, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 148
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f080044
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f070016
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aL:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide v4, 0x3fa47ae147ae147bL    # 0.04
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 154
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     mul-double/2addr v2, v7
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 155
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     mul-double/2addr v2, v7
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 156
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v1, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingcore/uilib/CircleWithButton;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f080062
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->aC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->aD:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 173
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->az:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->az:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->az:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->az:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->az:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->aD:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 180
a=0;//     iget v0, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
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
a=0;//     .line 183
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     add-float v2, v10, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v3, v3, 0x3
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     add-float v3, v10, v0
a=0;// 
a=0;//     iget v4, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int/lit8 v4, v4, 0x3
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     iget v4, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-int/lit8 v5, v5, 0x3
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     iget v5, p0, Lcom/kingcore/uilib/CircleWithButton;->am:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float v0, v5, v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingcore/uilib/CircleWithButton;->ak:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-int/lit8 v5, v5, 0x3
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float/2addr v0, v5
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ap:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->invalidate()V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 344
a=0;//     #v3=(Byte);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/CircleWithButton;->am:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aR:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 345
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 346
a=0;//     new-instance v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 347
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 348
a=0;//     sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 350
a=0;//     new-instance v2, Lcom/kingroot/kinguser/as;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/as;);
a=0;//     invoke-direct {v2, p0, v1, v0}, Lcom/kingroot/kinguser/as;-><init>(Lcom/kingcore/uilib/CircleWithButton;Landroid/widget/ImageView;Landroid/widget/RelativeLayout$LayoutParams;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/as;);
a=0;//     const-wide/16 v0, 0xc8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v2, v0, v1}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     .line 389
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingcore/uilib/CircleWithButton;->setClickable(Z)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {p0, p1}, Lcom/kingcore/uilib/CircleWithButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 394
a=0;//     #v2=(Byte);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 395
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 396
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 397
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v2, 0x51
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 398
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V
a=0;// 
a=0;//     .line 399
a=0;//     invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 400
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aF:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 404
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aw;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/aw;-><init>(Lcom/kingcore/uilib/CircleWithButton;Landroid/widget/TextView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aw;);
a=0;//     const-wide/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0xc8
a=0;// 
a=0;//     .line 208
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-object p1, p0, Lcom/kingcore/uilib/CircleWithButton;->aK:Ljava/lang/String;
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aH:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 211
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ag;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ag;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/kingroot/kinguser/ag;-><init>(Lcom/kingcore/uilib/CircleWithButton;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ag;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 227
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ai;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ai;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/kingroot/kinguser/ai;-><init>(Lcom/kingcore/uilib/CircleWithButton;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ai;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0xc8
a=0;// 
a=0;//     .line 260
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-object p1, p0, Lcom/kingcore/uilib/CircleWithButton;->aL:Ljava/lang/String;
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aG:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     new-instance v0, Lcom/kingroot/kinguser/al;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/al;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/kingroot/kinguser/al;-><init>(Lcom/kingcore/uilib/CircleWithButton;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/al;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     .line 309
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/an;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/an;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/kingroot/kinguser/an;-><init>(Lcom/kingcore/uilib/CircleWithButton;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/an;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public g(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(Integer);
a=0;//     iput v1, p0, Lcom/kingcore/uilib/CircleWithButton;->av:F
a=0;// 
a=0;//     .line 103
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aw:F
a=0;// 
a=0;//     .line 104
a=0;//     iput v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ax:F
a=0;// 
a=0;//     .line 105
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->ay:F
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public h(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/CircleWithButton;->aD:I
a=0;// 
a=0;//     .line 315
a=0;//     iput p1, p0, Lcom/kingcore/uilib/CircleWithButton;->aC:I
a=0;// 
a=0;//     .line 316
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aq;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/aq;-><init>(Lcom/kingcore/uilib/CircleWithButton;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aq;);
a=0;//     const-wide/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/vm;->b(Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public i(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingcore/uilib/CircleWithButton;->a(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 392
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 426
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ap:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CircleWithButton;->aw:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/kingcore/uilib/CircleWithButton;->av:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Lcom/kingcore/uilib/CircleWithButton;->aA:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/CircleWithButton;->ap:Landroid/graphics/RectF;
a=0;// 
a=0;//     iget v2, p0, Lcom/kingcore/uilib/CircleWithButton;->ay:F
a=0;// 
a=0;//     iget v3, p0, Lcom/kingcore/uilib/CircleWithButton;->ax:F
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingcore/uilib/CircleWithButton;->aB:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 429
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 442
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1, p1}, Lcom/kingcore/uilib/CircleWithButton;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, p2}, Lcom/kingcore/uilib/CircleWithButton;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingcore/uilib/CircleWithButton;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 443
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 446
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 447
a=0;//     invoke-super {p0, v0, v0}, Landroid/widget/RelativeLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 434
a=0;//     iput p1, p0, Lcom/kingcore/uilib/CircleWithButton;->al:I
a=0;// 
a=0;//     .line 435
a=0;//     iput p2, p0, Lcom/kingcore/uilib/CircleWithButton;->am:I
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/CircleWithButton;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingcore/uilib/CircleWithButton;->j(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 437
a=0;//     invoke-direct {p0}, Lcom/kingcore/uilib/CircleWithButton;->ac()V
a=0;// 
a=0;//     .line 438
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 453
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 463
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/CircleWithButton;->invalidate()V
a=0;// 
a=0;//     .line 464
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 455
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lcom/kingcore/uilib/CircleWithButton;->aa()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 459
a=0;//     :pswitch_1
a=0;//     invoke-direct {p0}, Lcom/kingcore/uilib/CircleWithButton;->ab()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 453
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
