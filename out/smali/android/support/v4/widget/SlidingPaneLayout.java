package android.support.v4.widget; class SlidingPaneLayout { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_FADE_COLOR:I = -0x33333334
a=0;// 
a=0;// .field private static final DEFAULT_OVERHANG_SIZE:I = 0x20
a=0;// 
a=0;// .field static final IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;// .field private static final MIN_FLING_VELOCITY:I = 0x190
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "SlidingPaneLayout"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCanSlide:Z
a=0;// 
a=0;// .field private mCoveredFadeColor:I
a=0;// 
a=0;// .field private final mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mIsUnableToDrag:Z
a=0;// 
a=0;// .field private final mOverhangSize:I
a=0;// 
a=0;// .field private mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;// .field private mParallaxBy:I
a=0;// 
a=0;// .field private mParallaxOffset:F
a=0;// 
a=0;// .field private final mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mPreservedOpenState:Z
a=0;// 
a=0;// .field private mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mSlideOffset:F
a=0;// 
a=0;// .field private mSlideRange:I
a=0;// 
a=0;// .field private mSlideableView:Landroid/view/View;
a=0;// 
a=0;// .field private mSliderFadeColor:I
a=0;// 
a=0;// .field private final mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     .line 200
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 245
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 249
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 252
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 107
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     const v0, -0x33333334
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     .line 182
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 254
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
a=0;//     .line 255
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x42000000    # 32.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v4
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I
a=0;// 
a=0;//     .line 257
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 261
a=0;//     new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;);
a=0;//     invoke-direct {v1, p0}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;);
a=0;//     invoke-static {p0, v1}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 262
a=0;//     invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 264
a=0;//     new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     invoke-static {p0, v4, v1}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     const/high16 v2, 0x43c80000    # 400.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Landroid/support/v4/widget/SlidingPaneLayout;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->onPanelDragged(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidateChildRegion(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private closePane(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 828
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->smoothSlideTo(FI)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 829
a=0;//     :cond_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 830
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 832
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private dimChildView(Landroid/view/View;FI)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 925
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 927
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v1, p2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 928
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v1, p3
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     .line 929
a=0;//     #v1=(Char);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, p2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     .line 930
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     const v2, 0xffffff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v2, p3
a=0;// 
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     .line 931
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 932
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 934
a=0;//     :cond_0
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     new-instance v3, Landroid/graphics/PorterDuffColorFilter;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/PorterDuffColorFilter;);
a=0;//     sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PorterDuff$Mode;);
a=0;//     invoke-direct {v3, v1, v4}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PorterDuffColorFilter;);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .line 935
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayerType(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eq v1, v5, :cond_1
a=0;// 
a=0;//     .line 936
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-static {p1, v5, v0}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 938
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidateChildRegion(Landroid/view/View;)V
a=0;// 
a=0;//     .line 947
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 939
a=0;//     :cond_3
a=0;//     #v1=(Byte);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayerType(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 940
a=0;//     iget-object v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 941
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .line 943
a=0;//     :cond_4
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;// 
a=0;//     .line 944
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 945
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private invalidateChildRegion(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 991
a=0;//     sget-object v0, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;->invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;// 
a=0;//     .line 992
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onPanelDragged(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 909
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 910
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 912
a=0;//     sub-int v1, p1, v1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     .line 914
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 915
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->parallaxOtherViews(F)V
a=0;// 
a=0;//     .line 918
a=0;//     :cond_0
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 919
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v0, v1, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     .line 921
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelSlide(Landroid/view/View;)V
a=0;// 
a=0;//     .line 922
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private openPane(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 836
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->smoothSlideTo(FI)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 837
a=0;//     :cond_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 840
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private parallaxOtherViews(F)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 1071
a=0;//     #v7=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1072
a=0;//     iget-boolean v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1073
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1074
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v1, v2, :cond_3
a=0;// 
a=0;//     .line 1075
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1076
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     .line 1074
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1072
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1078
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Integer);v3=(Reference,Landroid/view/View;);v4=(Reference,Landroid/view/View;);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float v4, v7, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     .line 1079
a=0;//     #v4=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     .line 1080
a=0;//     sub-float v5, v7, p1
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     .line 1081
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     .line 1083
a=0;//     invoke-virtual {v3, v4}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 1085
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1086
a=0;//     iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     sub-float v4, v7, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I
a=0;// 
a=0;//     invoke-direct {p0, v3, v4, v5}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1089
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static viewIsOpaque(Landroid/view/View;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 398
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->isOpaque(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 403
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(Boolean);v3=(Uninit);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x12
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 405
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 406
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);v2=(Reference,Landroid/graphics/drawable/Drawable;);v3=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 409
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected canScroll(Landroid/view/View;ZIII)Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1103
a=0;//     #v2=(One);
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move-object v6, p1
a=0;// 
a=0;//     .line 1104
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 1105
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1106
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1107
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1109
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v7, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     if-ltz v7, :cond_2
a=0;// 
a=0;//     .line 1112
a=0;//     invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1113
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     add-int v0, p4, v8
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     add-int v0, p4, v8
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     add-int v0, p5, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     add-int v0, p5, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     add-int v0, p4, v8
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v4, v0, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v0, p5, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     move v3, p3
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/SlidingPaneLayout;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1122
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1109
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/view/View;);v2=(One);v3=(Integer);v6=(Reference,Landroid/view/ViewGroup;);v7=(Integer);v8=(Integer);v9=(Integer);
a=0;//     add-int/lit8 v0, v7, -0x1
a=0;// 
a=0;//     move v7, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1122
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     neg-int v0, p3
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public canSlide()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 895
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1147
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
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
a=0;// .method public closePane()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 876
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1021
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
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
a=0;//     .line 1022
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1023
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->abort()V
a=0;// 
a=0;//     .line 1029
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1027
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnPanelClosed(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 344
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 345
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnPanelOpened(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 334
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 337
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 338
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnPanelSlide(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelSlide(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1053
a=0;//     #v1=(One);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 1055
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1056
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1068
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1055
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1061
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1062
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1063
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1064
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1065
a=0;//     #v0=(Integer);
a=0;//     sub-int v1, v2, v1
a=0;// 
a=0;//     .line 1066
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v4, v1, v3, v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 1067
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 951
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 953
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->save(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 955
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 957
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 958
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v4, v4, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 959
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 962
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v3, v4, :cond_1
a=0;// 
a=0;//     .line 963
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 985
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Float);
a=0;//     invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 987
a=0;//     return v0
a=0;// 
a=0;//     .line 965
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v1=(Null);v3=(Integer);v4=(PosByte);
a=0;//     iget-boolean v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     .line 966
a=0;//     invoke-virtual {p2}, Landroid/view/View;->isDrawingCacheEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 967
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p2, v3}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 969
a=0;//     :cond_2
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 970
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 971
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {p1, v3, v4, v5, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 972
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 974
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v4=(Null);v5=(Conflicted);
a=0;//     const-string v0, "SlidingPaneLayout"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "drawChild: child view "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " returned null drawing cache"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 975
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 978
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v1=(Null);v3=(Byte);v4=(PosByte);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->isDrawingCacheEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 979
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 981
a=0;//     :cond_5
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1135
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1152
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1140
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCoveredFadeColor()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getParallaxDistance()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSliderFadeColor()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isDimmed(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1126
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1130
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1129
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1130
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isOpen()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 886
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSlideable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 905
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 415
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 416
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 421
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 423
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 424
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->run()V
a=0;// 
a=0;//     .line 423
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 428
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 728
a=0;//     #v1=(One);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 731
a=0;//     #v3=(Integer);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 733
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 734
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 735
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 740
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 741
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 742
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 783
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Null);v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);v5=(Integer);v6=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 735
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 745
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v3, v0, :cond_5
a=0;// 
a=0;//     if-ne v3, v1, :cond_6
a=0;// 
a=0;//     .line 746
a=0;//     :cond_5
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 752
a=0;//     :cond_6
a=0;//     #v0=(PosByte);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     :cond_7
a=0;//     :pswitch_0
a=0;//     #v0=(Float);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 781
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v3, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 783
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_8
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_8
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 754
a=0;//     :pswitch_1
a=0;//     #v0=(PosByte);v2=(Null);v3=(Integer);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 755
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 756
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 757
a=0;//     #v3=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 758
a=0;//     iput v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v4, v5, v0, v3}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 762
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 768
a=0;//     :pswitch_2
a=0;//     #v0=(PosByte);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 769
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 770
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v0, v4
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 771
a=0;//     iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 772
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 773
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v4, v0, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_7
a=0;// 
a=0;//     cmpl-float v0, v3, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     .line 774
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 775
a=0;//     iput-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 752
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
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
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     sub-int v6, p4, p2
a=0;// 
a=0;//     .line 641
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 642
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 643
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 645
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 649
a=0;//     #v9=(Integer);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 650
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     .line 653
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v5, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v4, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Integer);v5=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v5, v9, :cond_6
a=0;// 
a=0;//     .line 654
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 656
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 653
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v5, 0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     move v4, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 650
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 660
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Conflicted);v4=(Integer);v5=(Integer);v10=(Reference,Landroid/view/View;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 662
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 663
a=0;//     #v11=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 665
a=0;//     #v2=(Null);
a=0;//     iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 666
a=0;//     iget v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v12, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/2addr v1, v12
a=0;// 
a=0;//     .line 667
a=0;//     sub-int v12, v6, v7
a=0;// 
a=0;//     iget v13, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     sub-int/2addr v12, v13
a=0;// 
a=0;//     invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     sub-int/2addr v12, v4
a=0;// 
a=0;//     sub-int/2addr v12, v1
a=0;// 
a=0;//     .line 669
a=0;//     iput v12, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     .line 670
a=0;//     iget v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     add-int/2addr v1, v4
a=0;// 
a=0;//     add-int/2addr v1, v12
a=0;// 
a=0;//     div-int/lit8 v13, v11, 0x2
a=0;// 
a=0;//     add-int/2addr v1, v13
a=0;// 
a=0;//     sub-int v13, v6, v7
a=0;// 
a=0;//     if-le v1, v13, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     .line 672
a=0;//     int-to-float v1, v12
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v12, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     mul-float/2addr v1, v12
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 680
a=0;//     :goto_4
a=0;//     #v12=(Conflicted);v13=(Conflicted);
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     .line 681
a=0;//     add-int v2, v0, v11
a=0;// 
a=0;//     .line 683
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v4, v8
a=0;// 
a=0;//     .line 684
a=0;//     invoke-virtual {v10, v0, v8, v2, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 686
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/2addr v3, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 670
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v2=(Null);v12=(Integer);v13=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 673
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 674
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 675
a=0;//     #v1=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 677
a=0;//     #v1=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 689
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 690
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 691
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 692
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->parallaxOtherViews(F)V
a=0;// 
a=0;//     .line 694
a=0;//     :cond_7
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 695
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v0, v1, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     .line 703
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;// 
a=0;//     .line 706
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 707
a=0;//     return-void
a=0;// 
a=0;//     .line 699
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v9, :cond_8
a=0;// 
a=0;//     .line 700
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     invoke-direct {p0, v1, v2, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     .line 699
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 433
a=0;//     #v3=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 434
a=0;//     #v2=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 435
a=0;//     #v1=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 437
a=0;//     #v0=(Integer);
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v3, v4, :cond_3
a=0;// 
a=0;//     .line 438
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 443
a=0;//     const/high16 v4, -0x80000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     move v9, v1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 466
a=0;//     :goto_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 467
a=0;//     #v1=(Null);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 468
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v9, :sswitch_data_0
a=0;// 
a=0;//     move v14, v0
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v14
a=0;// 
a=0;//     .line 477
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v14=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 478
a=0;//     #v3=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int v2, v10, v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int v5, v2, v4
a=0;// 
a=0;//     .line 480
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 482
a=0;//     #v11=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v11, v2, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     const-string v2, "SlidingPaneLayout"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "onMeasure: More than two child views are not supported."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 487
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     .line 491
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     move v8, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Float);v3=(Float);v6=(Boolean);v8=(Integer);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v8, v11, :cond_e
a=0;// 
a=0;//     .line 492
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 493
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 495
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_5
a=0;// 
a=0;//     .line 496
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move v4, v7
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 491
a=0;//     :goto_3
a=0;//     #v2=(Boolean);
a=0;//     add-int/lit8 v5, v8, 0x1
a=0;// 
a=0;//     move v8, v5
a=0;// 
a=0;//     move v6, v2
a=0;// 
a=0;//     move v7, v4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move v5, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 445
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     if-nez v3, :cond_1f
a=0;// 
a=0;//     .line 447
a=0;//     const/16 v2, 0x12c
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     move v9, v1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 450
a=0;//     :cond_2
a=0;//     #v4=(Boolean);v9=(Uninit);v10=(Uninit);
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
a=0;//     .line 452
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v4=(Integer);
a=0;//     if-nez v1, :cond_1f
a=0;// 
a=0;//     .line 453
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 457
a=0;//     if-nez v1, :cond_1f
a=0;// 
a=0;//     .line 458
a=0;//     const/high16 v1, -0x80000000
a=0;// 
a=0;//     .line 459
a=0;//     const/16 v0, 0x12c
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     move v9, v1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Integer);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Height must not be UNSPECIFIED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 470
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Null);v3=(Integer);v9=(Integer);v10=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v2, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 471
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 473
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v2, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     move v14, v0
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v14
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 500
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v2=(Float);v4=(PosByte);v5=(Integer);v6=(Boolean);v7=(Integer);v8=(Integer);v11=(Integer);v12=(Reference,Landroid/view/View;);v13=(Conflicted);v14=(Conflicted);
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_6
a=0;// 
a=0;//     .line 501
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     .line 505
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move v4, v7
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v6
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 509
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v2=(Float);v3=(Integer);v4=(Null);
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     .line 510
a=0;//     iget v4, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     const/4 v13, -0x2
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-ne v4, v13, :cond_9
a=0;// 
a=0;//     .line 511
a=0;//     sub-int v3, v10, v3
a=0;// 
a=0;//     const/high16 v4, -0x80000000
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 521
a=0;//     :goto_4
a=0;//     iget v4, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v13, -0x2
a=0;// 
a=0;//     if-ne v4, v13, :cond_b
a=0;// 
a=0;//     .line 522
a=0;//     const/high16 v4, -0x80000000
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 529
a=0;//     :goto_5
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v12, v3, v4}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 530
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 531
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 533
a=0;//     const/high16 v13, -0x80000000
a=0;// 
a=0;//     if-ne v9, v13, :cond_7
a=0;// 
a=0;//     if-le v4, v7, :cond_7
a=0;// 
a=0;//     .line 534
a=0;//     invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 537
a=0;//     :cond_7
a=0;//     sub-int v4, v5, v3
a=0;// 
a=0;//     .line 538
a=0;//     if-gez v4, :cond_d
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_6
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     or-int/2addr v3, v6
a=0;// 
a=0;//     .line 539
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 540
a=0;//     iput-object v12, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     :cond_8
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v7
a=0;// 
a=0;//     move v14, v2
a=0;// 
a=0;//     #v14=(Float);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     move v3, v14
a=0;// 
a=0;//     #v3=(Float);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 513
a=0;//     :cond_9
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v2=(Float);v3=(Integer);v13=(Byte);v14=(Conflicted);
a=0;//     iget v4, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     if-ne v4, v13, :cond_a
a=0;// 
a=0;//     .line 514
a=0;//     sub-int v3, v10, v3
a=0;// 
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 517
a=0;//     :cond_a
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 523
a=0;//     :cond_b
a=0;//     iget v4, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     if-ne v4, v13, :cond_c
a=0;// 
a=0;//     .line 524
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 526
a=0;//     :cond_c
a=0;//     iget v4, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/high16 v13, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v4, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 538
a=0;//     :cond_d
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 545
a=0;//     :cond_e
a=0;//     #v0=(Integer);v3=(Float);v4=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-nez v6, :cond_f
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpl-float v0, v2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1d
a=0;// 
a=0;//     .line 546
a=0;//     :cond_f
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I
a=0;// 
a=0;//     sub-int v12, v10, v0
a=0;// 
a=0;//     .line 548
a=0;//     #v12=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v9, v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     if-ge v9, v11, :cond_1d
a=0;// 
a=0;//     .line 549
a=0;//     invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 551
a=0;//     #v13=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_11
a=0;// 
a=0;//     .line 548
a=0;//     :cond_10
a=0;//     :goto_8
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     add-int/lit8 v0, v9, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v9, v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 555
a=0;//     :cond_11
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 557
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v3, v4, :cond_10
a=0;// 
a=0;//     .line 561
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     if-nez v3, :cond_13
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_13
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move v8, v3
a=0;// 
a=0;//     .line 562
a=0;//     :goto_9
a=0;//     #v3=(Boolean);v4=(PosByte);v8=(Boolean);
a=0;//     if-eqz v8, :cond_14
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 563
a=0;//     :goto_a
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     if-eqz v6, :cond_18
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eq v13, v3, :cond_18
a=0;// 
a=0;//     .line 564
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_10
a=0;// 
a=0;//     if-gt v4, v12, :cond_12
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_10
a=0;// 
a=0;//     .line 568
a=0;//     :cond_12
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     if-eqz v8, :cond_17
a=0;// 
a=0;//     .line 571
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_15
a=0;// 
a=0;//     .line 572
a=0;//     const/high16 v0, -0x80000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 585
a=0;//     :goto_b
a=0;//     #v4=(Integer);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v12, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 587
a=0;//     invoke-virtual {v13, v3, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 561
a=0;//     :cond_13
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v4=(PosByte);v8=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 562
a=0;//     :cond_14
a=0;//     #v3=(Boolean);v8=(Boolean);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 574
a=0;//     :cond_15
a=0;//     #v4=(Byte);
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     if-ne v3, v4, :cond_16
a=0;// 
a=0;//     .line 575
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 578
a=0;//     :cond_16
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 582
a=0;//     :cond_17
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v4=(Integer);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 589
a=0;//     :cond_18
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v3=(Conflicted);
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     cmpl-float v3, v3, v8
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_10
a=0;// 
a=0;//     .line 591
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1b
a=0;// 
a=0;//     .line 593
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v8, -0x2
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v3, v8, :cond_19
a=0;// 
a=0;//     .line 594
a=0;//     const/high16 v3, -0x80000000
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 608
a=0;//     :goto_c
a=0;//     #v8=(Integer);
a=0;//     if-eqz v6, :cond_1c
a=0;// 
a=0;//     .line 610
a=0;//     iget v8, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v8
a=0;// 
a=0;//     .line 611
a=0;//     sub-int v0, v10, v0
a=0;// 
a=0;//     .line 612
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v0, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 614
a=0;//     if-eq v4, v0, :cond_10
a=0;// 
a=0;//     .line 615
a=0;//     invoke-virtual {v13, v8, v3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 596
a=0;//     :cond_19
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v8=(Byte);
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     if-ne v3, v8, :cond_1a
a=0;// 
a=0;//     .line 597
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 600
a=0;//     :cond_1a
a=0;//     iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v3, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 604
a=0;//     :cond_1b
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v3, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 619
a=0;//     :cond_1c
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 620
a=0;//     #v8=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     mul-float/2addr v0, v8
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 621
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 623
a=0;//     invoke-virtual {v13, v0, v3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 629
a=0;//     :cond_1d
a=0;//     #v4=(Conflicted);v8=(Integer);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual {p0, v10, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 630
a=0;//     iput-boolean v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     .line 631
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1e
a=0;// 
a=0;//     if-nez v6, :cond_1e
a=0;// 
a=0;//     .line 633
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->abort()V
a=0;// 
a=0;//     .line 635
a=0;//     :cond_1e
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1f
a=0;//     #v0=(Integer);v2=(Integer);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     move v9, v1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 468
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         -0x80000000 -> :sswitch_1
a=0;//         0x40000000 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1167
a=0;//     check-cast p1, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
a=0;// 
a=0;//     .line 1168
a=0;//     invoke-virtual {p1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1170
a=0;//     iget-boolean v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1171
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane()Z
a=0;// 
a=0;//     .line 1175
a=0;//     :goto_0
a=0;//     iget-boolean v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 1176
a=0;//     return-void
a=0;// 
a=0;//     .line 1173
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1157
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1159
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SavedState;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1160
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SavedState;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isSlideable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isOpen()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
a=0;// 
a=0;//     .line 1162
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1160
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 713
a=0;//     if-eq p1, p3, :cond_0
a=0;// 
a=0;//     .line 714
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 716
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 788
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 789
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 824
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 792
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 794
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 795
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 797
a=0;//     #v0=(One);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 799
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 800
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 801
a=0;//     #v2=(Float);
a=0;//     iput v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 802
a=0;//     iput v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 807
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 808
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 809
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 810
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v1, v3
a=0;// 
a=0;//     .line 811
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float v4, v2, v4
a=0;// 
a=0;//     .line 812
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 813
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v3, v3
a=0;// 
a=0;//     mul-float/2addr v4, v4
a=0;// 
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     mul-int v4, v5, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpg-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v4, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 816
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, v1, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 797
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public openPane()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 858
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 720
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V
a=0;// 
a=0;//     .line 721
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 722
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 724
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 722
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setAllChildrenVisible()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 389
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
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
a=0;//     .line 390
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 391
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
a=0;//     .line 392
a=0;//     invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 389
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCoveredFadeColor(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I
a=0;// 
a=0;//     .line 314
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPanelSlideListener(Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     .line 325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setParallaxDistance(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->requestLayout()V
a=0;// 
a=0;//     .line 279
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1038
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1039
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowResource(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1048
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1049
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSliderFadeColor(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     .line 297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public smoothSlideClosed()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 866
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane()Z
a=0;// 
a=0;//     .line 867
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public smoothSlideOpen()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane()Z
a=0;// 
a=0;//     .line 849
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothSlideTo(FI)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1001
a=0;//     #v1=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1016
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1006
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1008
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     .line 1009
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     add-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 1011
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1012
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V
a=0;// 
a=0;//     .line 1013
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1014
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1016
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 349
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v8, v1, v2
a=0;// 
a=0;//     .line 350
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 351
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int v10, v1, v2
a=0;// 
a=0;//     .line 356
a=0;//     #v10=(Integer);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/widget/SlidingPaneLayout;->viewIsOpaque(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 358
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 359
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 360
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 365
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move v6, v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v5=(Integer);v6=(Integer);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-ge v6, v11, :cond_0
a=0;// 
a=0;//     .line 366
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, v6}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 368
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v12, v0, :cond_2
a=0;// 
a=0;//     .line 386
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 362
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 373
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Integer);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Integer);v11=(Integer);v12=(Reference,Landroid/view/View;);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 374
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v9, v13}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 375
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-static {v8, v14}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 376
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v10, v15}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 378
a=0;//     if-lt v5, v4, :cond_3
a=0;// 
a=0;//     if-lt v13, v2, :cond_3
a=0;// 
a=0;//     if-gt v14, v3, :cond_3
a=0;// 
a=0;//     if-gt v15, v1, :cond_3
a=0;// 
a=0;//     .line 380
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     .line 384
a=0;//     :goto_2
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v12, v5}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 365
a=0;//     add-int/lit8 v5, v6, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 382
a=0;//     :cond_3
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_2
a=0;// .end method
}}
