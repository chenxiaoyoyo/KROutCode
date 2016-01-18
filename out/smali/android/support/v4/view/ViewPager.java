package android.support.v4.view; class ViewPager { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewPager;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CLOSE_ENOUGH:I = 0x2
a=0;// 
a=0;// .field private static final COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final DEFAULT_GUTTER_SIZE:I = 0x10
a=0;// 
a=0;// .field private static final DEFAULT_OFFSCREEN_PAGES:I = 0x1
a=0;// 
a=0;// .field private static final DRAW_ORDER_DEFAULT:I = 0x0
a=0;// 
a=0;// .field private static final DRAW_ORDER_FORWARD:I = 0x1
a=0;// 
a=0;// .field private static final DRAW_ORDER_REVERSE:I = 0x2
a=0;// 
a=0;// .field private static final INVALID_POINTER:I = -0x1
a=0;// 
a=0;// .field private static final LAYOUT_ATTRS:[I
a=0;// 
a=0;// .field private static final MAX_SETTLE_DURATION:I = 0x258
a=0;// 
a=0;// .field private static final MIN_DISTANCE_FOR_FLING:I = 0x19
a=0;// 
a=0;// .field private static final MIN_FLING_VELOCITY:I = 0x190
a=0;// 
a=0;// .field public static final SCROLL_STATE_DRAGGING:I = 0x1
a=0;// 
a=0;// .field public static final SCROLL_STATE_IDLE:I = 0x0
a=0;// 
a=0;// .field public static final SCROLL_STATE_SETTLING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ViewPager"
a=0;// 
a=0;// .field private static final USE_CACHE:Z
a=0;// 
a=0;// .field private static final sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private static final sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivePointerId:I
a=0;// 
a=0;// .field private mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;// .field private mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;// .field private mBottomPageBounds:I
a=0;// 
a=0;// .field private mCalledSuper:Z
a=0;// 
a=0;// .field private mChildHeightMeasureSpec:I
a=0;// 
a=0;// .field private mChildWidthMeasureSpec:I
a=0;// 
a=0;// .field private mCloseEnough:I
a=0;// 
a=0;// .field private mCurItem:I
a=0;// 
a=0;// .field private mDecorChildCount:I
a=0;// 
a=0;// .field private mDefaultGutterSize:I
a=0;// 
a=0;// .field private mDrawingOrder:I
a=0;// 
a=0;// .field private mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private final mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mExpectedAdapterCount:I
a=0;// 
a=0;// .field private mFakeDragBeginTime:J
a=0;// 
a=0;// .field private mFakeDragging:Z
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mFirstOffset:F
a=0;// 
a=0;// .field private mFlingDistance:I
a=0;// 
a=0;// .field private mGutterSize:I
a=0;// 
a=0;// .field private mIgnoreGutter:Z
a=0;// 
a=0;// .field private mInLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// .field private mIsBeingDragged:Z
a=0;// 
a=0;// .field private mIsUnableToDrag:Z
a=0;// 
a=0;// .field private final mItems:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mLastMotionX:F
a=0;// 
a=0;// .field private mLastMotionY:F
a=0;// 
a=0;// .field private mLastOffset:F
a=0;// 
a=0;// .field private mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;// .field private mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mMaximumVelocity:I
a=0;// 
a=0;// .field private mMinimumVelocity:I
a=0;// 
a=0;// .field private mNeedCalculatePageOffsets:Z
a=0;// 
a=0;// .field private mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;// .field private mOffscreenPageLimit:I
a=0;// 
a=0;// .field private mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// .field private mPageMargin:I
a=0;// 
a=0;// .field private mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;// .field private mPopulatePending:Z
a=0;// 
a=0;// .field private mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;// .field private mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;// .field private mRestoredCurItem:I
a=0;// 
a=0;// .field private mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;// .field private mScrollState:I
a=0;// 
a=0;// .field private mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private mScrollingCacheEnabled:Z
a=0;// 
a=0;// .field private mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private final mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;// .field private final mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private mTopPageBounds:I
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// .field private mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x10100b3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$1;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$2;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$2;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$2;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 344
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 130
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 137
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 138
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 139
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 151
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 152
a=0;//     const v0, 0x7f7fffff    # Float.MAX_VALUE
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 161
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 180
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 207
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 208
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 248
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 345
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V
a=0;// 
a=0;//     .line 346
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 349
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 130
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 137
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 138
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 139
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 151
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 152
a=0;//     const v0, 0x7f7fffff    # Float.MAX_VALUE
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 161
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 180
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 207
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 208
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 248
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V
a=0;// 
a=0;//     .line 351
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/view/ViewPager;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/view/ViewPager;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400()[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v10, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 1122
a=0;//     #v10=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1123
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1124
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     move v6, v0
a=0;// 
a=0;//     .line 1126
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v6=(Float);
a=0;//     if-eqz p3, :cond_6
a=0;// 
a=0;//     .line 1127
a=0;//     iget v0, p3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1129
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_3
a=0;// 
a=0;//     .line 1132
a=0;//     iget v1, p3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v2, p3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float v3, v1, v6
a=0;// 
a=0;//     .line 1133
a=0;//     #v3=(Float);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 1134
a=0;//     :goto_1
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-gt v2, v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_6
a=0;// 
a=0;//     .line 1135
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1136
a=0;//     :goto_2
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v2, v5, :cond_1
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     if-ge v1, v5, :cond_1
a=0;// 
a=0;//     .line 1137
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 1138
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1124
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v6, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1140
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v1=(Integer);v2=(Integer);v3=(Float);v5=(Integer);v6=(Float);
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ge v2, v5, :cond_2
a=0;// 
a=0;//     .line 1143
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v5, v2}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     add-float/2addr v3, v5
a=0;// 
a=0;//     .line 1144
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1146
a=0;//     :cond_2
a=0;//     #v5=(Integer);
a=0;//     iput v3, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1147
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, v6
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float/2addr v3, v0
a=0;// 
a=0;//     .line 1134
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1149
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     iget v1, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v0, v1, :cond_6
a=0;// 
a=0;//     .line 1150
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 1152
a=0;//     iget v3, p3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1153
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v2, v0, -0x1
a=0;// 
a=0;//     .line 1154
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v2, v0, :cond_6
a=0;// 
a=0;//     if-ltz v1, :cond_6
a=0;// 
a=0;//     .line 1155
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1156
a=0;//     :goto_5
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v2, v5, :cond_4
a=0;// 
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     .line 1157
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 1158
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1160
a=0;//     :cond_4
a=0;//     :goto_6
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v2, v5, :cond_5
a=0;// 
a=0;//     .line 1163
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v5, v2}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     sub-float/2addr v3, v5
a=0;// 
a=0;//     .line 1164
a=0;//     #v3=(Float);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1166
a=0;//     :cond_5
a=0;//     #v3=(Integer);v5=(Integer);
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float/2addr v3, v5
a=0;// 
a=0;//     .line 1167
a=0;//     #v3=(Float);
a=0;//     iput v3, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1154
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1173
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1174
a=0;//     #v8=(Integer);
a=0;//     iget v2, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1175
a=0;//     #v2=(Integer);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v0, -0x1
a=0;// 
a=0;//     .line 1176
a=0;//     #v1=(Integer);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     :goto_7
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 1177
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     add-int/lit8 v3, v7, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v3, :cond_8
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v3, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float/2addr v0, v10
a=0;// 
a=0;//     :goto_8
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 1180
a=0;//     add-int/lit8 v0, p2, -0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     :goto_9
a=0;//     #v5=(Integer);v9=(Conflicted);
a=0;//     if-ltz v5, :cond_b
a=0;// 
a=0;//     .line 1181
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 1182
a=0;//     :goto_a
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v1, v2, :cond_9
a=0;// 
a=0;//     .line 1183
a=0;//     iget-object v9, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v2, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v6
a=0;// 
a=0;//     sub-float v1, v3, v1
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 1176
a=0;//     :cond_7
a=0;//     #v0=(Integer);v3=(Conflicted);v5=(Conflicted);v9=(Uninit);
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 1177
a=0;//     :cond_8
a=0;//     #v3=(Integer);
a=0;//     const v0, 0x7f7fffff    # Float.MAX_VALUE
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 1185
a=0;//     :cond_9
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Integer);v9=(Conflicted);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v2, v6
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float v2, v3, v2
a=0;// 
a=0;//     .line 1186
a=0;//     iput v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1187
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 1180
a=0;//     :cond_a
a=0;//     add-int/lit8 v0, v5, -0x1
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 1189
a=0;//     :cond_b
a=0;//     #v2=(Integer);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v1, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float v2, v0, v6
a=0;// 
a=0;//     .line 1190
a=0;//     #v2=(Float);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     .line 1192
a=0;//     add-int/lit8 v0, p2, 0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     :goto_b
a=0;//     if-ge v5, v8, :cond_e
a=0;// 
a=0;//     .line 1193
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 1194
a=0;//     :goto_c
a=0;//     #v2=(Integer);v3=(Float);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ge v1, v2, :cond_c
a=0;// 
a=0;//     .line 1195
a=0;//     iget-object v9, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v6
a=0;// 
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 1197
a=0;//     :cond_c
a=0;//     #v9=(Conflicted);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     add-int/lit8 v9, v7, -0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v2, v9, :cond_d
a=0;// 
a=0;//     .line 1198
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v2, v10
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 1200
a=0;//     :cond_d
a=0;//     #v2=(Integer);
a=0;//     iput v3, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1201
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, v6
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float v2, v3, v0
a=0;// 
a=0;//     .line 1192
a=0;//     #v2=(Float);
a=0;//     add-int/lit8 v0, v5, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 1204
a=0;//     :cond_e
a=0;//     #v3=(Integer);v9=(Conflicted);
a=0;//     iput-boolean v4, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 1205
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private completeScroll(Z)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1736
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 1737
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1739
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1740
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1741
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1742
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1743
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1744
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v6}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1745
a=0;//     #v6=(Integer);
a=0;//     if-ne v1, v5, :cond_0
a=0;// 
a=0;//     if-eq v3, v6, :cond_1
a=0;// 
a=0;//     .line 1746
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v5, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1749
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 1750
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     .line 1751
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1752
a=0;//     iget-boolean v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 1754
a=0;//     iput-boolean v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 1750
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(PosByte);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1736
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1757
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v3=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 1758
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     .line 1759
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1764
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1761
a=0;//     :cond_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private determineTargetPage(IFII)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 2137
a=0;//     invoke-static {p4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I
a=0;// 
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     .line 2138
a=0;//     if-lez p3, :cond_1
a=0;// 
a=0;//     .line 2144
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 2145
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2146
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2149
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 2152
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     .line 2138
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2140
a=0;//     :cond_2
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-lt p1, v0, :cond_3
a=0;// 
a=0;//     const v0, 0x3ecccccd    # 0.4f
a=0;// 
a=0;//     .line 2141
a=0;//     :goto_1
a=0;//     int-to-float v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, p2
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2140
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const v0, 0x3f19999a    # 0.6f
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private enableLayers(Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1771
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 1772
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 1773
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 1775
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, v0, v5}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1772
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1773
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1777
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private endDrag()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2385
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 2386
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 2388
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2389
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 2390
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2392
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2566
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 2567
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 2569
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 2570
a=0;//     invoke-virtual {v1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 2588
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 2573
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2574
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 2575
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 2576
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 2578
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2579
a=0;//     :goto_2
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);v2=(Conflicted);v3=(Conflicted);
a=0;//     instance-of v2, v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eq v0, p0, :cond_1
a=0;// 
a=0;//     .line 2580
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 2581
a=0;//     iget v2, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2582
a=0;//     iget v2, v1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, v1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 2583
a=0;//     iget v2, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 2584
a=0;//     iget v2, v1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, v1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 2586
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 2588
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getClientWidth()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 478
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2094
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2095
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v0, v4
a=0;// 
a=0;//     move v9, v0
a=0;// 
a=0;//     .line 2096
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v9=(Float);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 2097
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 2100
a=0;//     #v5=(Byte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 2102
a=0;//     #v4=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v6, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v8, v5
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     move v2, v3
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     .line 2103
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(Integer);v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Boolean);v6=(Integer);v7=(Integer);v8=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     .line 2104
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2106
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     iget v10, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v11, v8, 0x1
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-eq v10, v11, :cond_6
a=0;// 
a=0;//     .line 2108
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2109
a=0;//     add-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     add-float/2addr v6, v1
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2110
a=0;//     add-int/lit8 v6, v8, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2111
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v7, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iput v6, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 2112
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     move-object v12, v0
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object v2, v12
a=0;// 
a=0;//     .line 2114
a=0;//     :goto_3
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v6=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget v6, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2117
a=0;//     iget v7, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v7, v6
a=0;// 
a=0;//     #v7=(Float);
a=0;//     add-float/2addr v7, v1
a=0;// 
a=0;//     .line 2118
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     cmpl-float v5, v9, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_2
a=0;// 
a=0;//     .line 2119
a=0;//     :cond_0
a=0;//     cmpg-float v4, v9, v7
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     if-ne v0, v4, :cond_5
a=0;// 
a=0;//     :cond_1
a=0;//     move-object v4, v2
a=0;// 
a=0;//     .line 2132
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v7=(Integer);v12=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     move v9, v2
a=0;// 
a=0;//     .line 2095
a=0;//     #v9=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);v9=(Float);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 2096
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2126
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Float);v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Byte);v6=(Integer);v7=(Float);v8=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v5, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2128
a=0;//     #v5=(Integer);
a=0;//     iget v4, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 2103
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v7, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v8, v5
a=0;// 
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Boolean);v12=(Conflicted);
a=0;//     move-object v12, v0
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object v2, v12
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private isGutterDrag(FF)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1767
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     cmpl-float v0, p2, v2
a=0;// 
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     cmpg-float v0, p2, v2
a=0;// 
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 2370
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2371
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2372
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 2375
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2376
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2377
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2378
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2379
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     .line 2382
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 2375
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private pageScrolled(I)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1631
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1632
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1633
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1, v0}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1634
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1635
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "onPageScrolled did not call superclass implementation"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1640
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1641
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1642
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v2
a=0;// 
a=0;//     .line 1643
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v4, v5
a=0;// 
a=0;//     .line 1644
a=0;//     iget v5, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1645
a=0;//     #v5=(Integer);
a=0;//     int-to-float v6, p1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v2, v6, v2
a=0;// 
a=0;//     iget v6, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v2, v6
a=0;// 
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v1, v4
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float v1, v2, v1
a=0;// 
a=0;//     .line 1647
a=0;//     int-to-float v2, v3
a=0;// 
a=0;//     mul-float/2addr v2, v1
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 1649
a=0;//     #v2=(Integer);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1650
a=0;//     invoke-virtual {p0, v5, v1, v2}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1651
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1652
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "onPageScrolled did not call superclass implementation"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1655
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Float);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private performDrag(F)Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2043
a=0;//     .line 2045
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr v0, p1
a=0;// 
a=0;//     .line 2046
a=0;//     #v0=(Float);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2048
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 2049
a=0;//     #v1=(Float);
a=0;//     add-float v5, v1, v0
a=0;// 
a=0;//     .line 2050
a=0;//     #v5=(Float);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 2052
a=0;//     #v7=(Integer);
a=0;//     int-to-float v0, v7
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float v4, v0, v1
a=0;// 
a=0;//     .line 2053
a=0;//     #v4=(Float);
a=0;//     int-to-float v0, v7
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     mul-float v6, v0, v1
a=0;// 
a=0;//     .line 2057
a=0;//     #v6=(Float);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2058
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2059
a=0;//     iget v8, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 2061
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v4, v7
a=0;// 
a=0;//     mul-float/2addr v0, v4
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move v4, v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 2063
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget v8, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v9}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     if-eq v8, v9, :cond_4
a=0;// 
a=0;//     .line 2065
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v3, v7
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v1, v3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 2068
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     cmpg-float v6, v5, v4
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_1
a=0;// 
a=0;//     .line 2069
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2070
a=0;//     sub-float v0, v4, v5
a=0;// 
a=0;//     .line 2071
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v2, v7
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2082
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v1, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v1, v4, v1
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2083
a=0;//     float-to-int v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 2084
a=0;//     float-to-int v0, v4
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     .line 2086
a=0;//     return v2
a=0;// 
a=0;//     .line 2074
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Float);v2=(Null);v3=(Boolean);
a=0;//     cmpl-float v0, v5, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 2075
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 2076
a=0;//     sub-float v0, v5, v1
a=0;// 
a=0;//     .line 2077
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v3, v7
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v0, v3
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     move v4, v1
a=0;// 
a=0;//     .line 2079
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v2=(Null);v3=(Boolean);
a=0;//     move v4, v5
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(One);v6=(Float);
a=0;//     move v1, v6
a=0;// 
a=0;//     #v1=(Float);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v9=(Uninit);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private recomputeScrollPosition(IIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1468
a=0;//     #v2=(Null);
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1469
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     add-int/2addr v0, p3
a=0;// 
a=0;//     .line 1470
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v1, p2, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     add-int/2addr v1, p4
a=0;// 
a=0;//     .line 1472
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1473
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float v1, v3, v1
a=0;// 
a=0;//     .line 1474
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v1, v0
a=0;// 
a=0;//     .line 1476
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1477
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1479
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->timePassed()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v5, v0, v3
a=0;// 
a=0;//     .line 1480
a=0;//     #v5=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1481
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iget v3, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v4, p1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 1494
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1485
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1486
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1487
a=0;//     :goto_1
a=0;//     #v0=(Float);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 1489
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 1490
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 1491
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1486
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v1=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private removeNonDecorViews()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 455
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 456
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 457
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 458
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->removeViewAt(I)V
a=0;// 
a=0;//     .line 459
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 454
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private scrollToItem(IZIZ)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 557
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 559
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 560
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 561
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 564
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 565
a=0;//     invoke-virtual {p0, v0, v1, p3}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 566
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 567
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 569
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 570
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 573
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     if-eqz p4, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 574
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 576
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 577
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 579
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 580
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 581
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setScrollState(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     .line 400
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 392
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 395
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->enableLayers(Z)V
a=0;// 
a=0;//     .line 397
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private setScrollingCacheEnabled(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2395
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 2396
a=0;//     iput-boolean p1, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     .line 2407
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private sortChildDrawingOrder()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1106
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1107
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1108
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1112
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1113
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 1114
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1115
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1113
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1110
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1117
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v1, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 1119
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addFocusables(Ljava/util/ArrayList;II)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 2612
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2614
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDescendantFocusability()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2616
a=0;//     #v2=(Integer);
a=0;//     const/high16 v0, 0x60000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v2, v0, :cond_1
a=0;// 
a=0;//     .line 2617
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     .line 2618
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 2619
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 2620
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2621
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget v4, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     .line 2622
a=0;//     invoke-virtual {v3, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V
a=0;// 
a=0;//     .line 2617
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2632
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     const/high16 v0, 0x40000
a=0;// 
a=0;//     if-ne v2, v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v1, v0, :cond_3
a=0;// 
a=0;//     .line 2638
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 2649
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 2641
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     and-int/lit8 v0, p3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusableInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 2645
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 2646
a=0;//     invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 830
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     .line 831
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput p1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 832
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v1, p0, p1}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     .line 833
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 834
a=0;//     if-ltz p2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p2, v1, :cond_1
a=0;// 
a=0;//     .line 835
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 839
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 837
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addTouchables(Ljava/util/ArrayList;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 2659
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 2660
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2661
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 2662
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 2663
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 2664
a=0;//     invoke-virtual {v1, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 2659
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2668
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1292
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1293
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 1295
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1296
a=0;//     iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     instance-of v3, p1, Landroid/support/v4/view/ViewPager$Decor;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     .line 1297
a=0;//     iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1298
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1299
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot add pager decor view during layout"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1301
a=0;//     :cond_0
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     .line 1302
a=0;//     invoke-virtual {p0, p1, p2, v1}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     .line 1314
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 1304
a=0;//     :cond_1
a=0;//     invoke-super {p0, p1, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v1, p3
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public arrowScroll(I)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v8, 0x42
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v7, 0x11
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 2500
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 2501
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-ne v2, p0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 2528
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/FocusFinder;);
a=0;//     invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2530
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     if-eq v1, v0, :cond_7
a=0;// 
a=0;//     .line 2531
a=0;//     if-ne p1, v7, :cond_5
a=0;// 
a=0;//     .line 2534
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v2, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2535
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-direct {p0, v3, v0}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2536
a=0;//     #v3=(Integer);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-lt v2, v3, :cond_4
a=0;// 
a=0;//     .line 2537
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2559
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2560
a=0;//     invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 2562
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2503
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Landroid/view/View;);v3=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     .line 2505
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);v5=(Conflicted);
a=0;//     instance-of v5, v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_d
a=0;// 
a=0;//     .line 2507
a=0;//     if-ne v0, p0, :cond_2
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 2512
a=0;//     :goto_3
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     .line 2514
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 2515
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 2516
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v6=(Conflicted);
a=0;//     instance-of v2, v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 2518
a=0;//     const-string v2, " => "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 2517
a=0;//     invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 2506
a=0;//     :cond_2
a=0;//     #v5=(Boolean);v6=(Uninit);
a=0;//     invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2520
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v5=(Reference,Ljava/lang/StringBuilder;);v6=(Conflicted);
a=0;//     const-string v0, "ViewPager"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "arrowScroll tried to find focus based on non-child current focused view "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 2522
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 2539
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Reference,Landroid/view/View;);v2=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2541
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Reference,Ujava/lang/Object;);v3=(Null);
a=0;//     if-ne p1, v8, :cond_b
a=0;// 
a=0;//     .line 2544
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v2, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2545
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-direct {p0, v3, v0}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2546
a=0;//     #v3=(Integer);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     if-gt v2, v3, :cond_6
a=0;// 
a=0;//     .line 2547
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2549
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2552
a=0;//     :cond_7
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Reference,Ujava/lang/Object;);v3=(Null);
a=0;//     if-eq p1, v7, :cond_8
a=0;// 
a=0;//     if-ne p1, v4, :cond_9
a=0;// 
a=0;//     .line 2554
a=0;//     :cond_8
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2555
a=0;//     :cond_9
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eq p1, v8, :cond_a
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_b
a=0;// 
a=0;//     .line 2557
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v1=(Null);v6=(Uninit);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_d
a=0;//     #v5=(Boolean);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public beginFakeDrag()Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2259
a=0;//     #v5=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2275
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 2262
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     iput-boolean v8, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     .line 2263
a=0;//     invoke-direct {p0, v8}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 2264
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     .line 2265
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 2266
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2270
a=0;//     :goto_1
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v7, v4
a=0;// 
a=0;//     .line 2271
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 2272
a=0;//     #v2=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v3, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2273
a=0;//     invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 2274
a=0;//     iput-wide v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J
a=0;// 
a=0;//     move v4, v8
a=0;// 
a=0;//     .line 2275
a=0;//     #v4=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2268
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected canScroll(Landroid/view/View;ZIII)Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 2437
a=0;//     #v2=(One);
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move-object v6, p1
a=0;// 
a=0;//     .line 2438
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 2439
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 2440
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 2441
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2443
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v7, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     if-ltz v7, :cond_2
a=0;// 
a=0;//     .line 2446
a=0;//     invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2447
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
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move v3, p3
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 2456
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2443
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/view/View;);v2=(One);v3=(Integer);v6=(Reference,Landroid/view/ViewGroup;);v7=(Integer);v8=(Integer);v9=(Integer);
a=0;//     add-int/lit8 v0, v7, -0x1
a=0;// 
a=0;//     move v7, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2456
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
a=0;// .method public canScrollHorizontally(I)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 2410
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 2421
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 2414
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Null);v2=(Reference,Landroid/support/v4/view/PagerAdapter;);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2415
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2416
a=0;//     #v3=(Integer);
a=0;//     if-gez p1, :cond_3
a=0;// 
a=0;//     .line 2417
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v2, v4
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v3, v2, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2418
a=0;//     :cond_3
a=0;//     #v0=(One);v4=(Uninit);
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     .line 2419
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v2, v4
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v3, v2, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2738
a=0;//     instance-of v0, p1, Landroid/support/v4/view/ViewPager$LayoutParams;
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
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1607
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1608
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1609
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1610
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1611
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1613
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     .line 1614
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1615
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1616
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1617
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1622
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1628
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1627
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dataSetChanged()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 845
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 846
a=0;//     #v8=(Integer);
a=0;//     iput v8, p0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     .line 847
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v8, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 849
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, v0
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 852
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Boolean);v7=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_5
a=0;// 
a=0;//     .line 853
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 854
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v9, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v7, v9}, Landroid/support/v4/view/PagerAdapter;->getItemPosition(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 856
a=0;//     #v7=(Integer);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-ne v7, v9, :cond_1
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 852
a=0;//     :goto_2
a=0;//     #v5=(Boolean);v6=(Integer);v9=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 847
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 860
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Boolean);v5=(Integer);v6=(Boolean);v7=(Integer);v9=(Byte);
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     if-ne v7, v9, :cond_3
a=0;// 
a=0;//     .line 861
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 862
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 864
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 865
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     move v4, v1
a=0;// 
a=0;//     .line 869
a=0;//     :cond_2
a=0;//     #v4=(Boolean);
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget v7, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget-object v9, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v6, p0, v7, v9}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 872
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v6, v0, :cond_b
a=0;// 
a=0;//     .line 874
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v5, v8, -0x1
a=0;// 
a=0;//     invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v1
a=0;// 
a=0;//     .line 875
a=0;//     #v5=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 880
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(Integer);v4=(Boolean);v5=(Integer);v6=(Boolean);v9=(Byte);
a=0;//     iget v9, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eq v9, v7, :cond_a
a=0;// 
a=0;//     .line 881
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v9, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-ne v6, v9, :cond_4
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 886
a=0;//     :cond_4
a=0;//     iput v7, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v1
a=0;// 
a=0;//     .line 887
a=0;//     #v5=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 891
a=0;//     :cond_5
a=0;//     #v3=(Integer);v4=(Boolean);v5=(Integer);v6=(Boolean);v7=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 892
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 895
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v3, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Comparator;);
a=0;//     invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 897
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     .line 899
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 900
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     if-ge v3, v4, :cond_8
a=0;// 
a=0;//     .line 901
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 902
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 903
a=0;//     iget-boolean v6, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 904
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput v6, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     .line 900
a=0;//     :cond_7
a=0;//     #v6=(Boolean);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 908
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v5, v2, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 909
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     .line 911
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(Integer);v4=(Boolean);v7=(Integer);v9=(Integer);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v6
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v3=(Integer);v4=(Boolean);v5=(Integer);v6=(Integer);v9=(Reference,Ljava/lang/Object;);
a=0;//     move v0, v3
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v1
a=0;// 
a=0;//     #v5=(One);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2462
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2706
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 2707
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2723
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2711
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(PosShort);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 2712
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 2713
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 2714
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 2715
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2716
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget v4, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 2718
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2712
a=0;//     :cond_2
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method distanceInfluenceForSnapDuration(F)F
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 766
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v0, p1, v0
a=0;// 
a=0;//     .line 767
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x3fde28c7460698c7L    # 0.4712389167638204
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     .line 768
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 2157
a=0;//     #v2=(One);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2158
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2160
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2161
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-ne v1, v2, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v2, :cond_4
a=0;// 
a=0;//     .line 2164
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 2165
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2166
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     .line 2167
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2169
a=0;//     const/high16 v4, 0x43870000    # 270.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V
a=0;// 
a=0;//     .line 2170
a=0;//     neg-int v4, v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     int-to-float v6, v3
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 2171
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v4, v2, v3}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V
a=0;// 
a=0;//     .line 2172
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     or-int/2addr v0, v2
a=0;// 
a=0;//     .line 2173
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 2175
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 2176
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2177
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2178
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     .line 2180
a=0;//     const/high16 v4, 0x42b40000    # 90.0f
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V
a=0;// 
a=0;//     .line 2181
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     neg-int v4, v4
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     neg-float v5, v5
a=0;// 
a=0;//     int-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 2182
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v4, v3, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V
a=0;// 
a=0;//     .line 2183
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     or-int/2addr v0, v2
a=0;// 
a=0;//     .line 2184
a=0;//     invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 2191
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 2193
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 2195
a=0;//     :cond_3
a=0;//     return-void
a=0;// 
a=0;//     .line 2187
a=0;//     :cond_4
a=0;//     #v0=(Null);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V
a=0;// 
a=0;//     .line 2188
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V
a=0;// 
a=0;//     .line 755
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 756
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 757
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 759
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endFakeDrag()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 2285
a=0;//     #v5=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 2286
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No fake drag in progress. Call beginFakeDrag first."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 2289
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2290
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 2291
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 2293
a=0;//     #v0=(Integer);
a=0;//     iput-boolean v5, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 2294
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2295
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2296
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 2297
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v4, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2298
a=0;//     #v4=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float v1, v2, v1
a=0;// 
a=0;//     iget v2, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     iget v2, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     .line 2299
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 2300
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v4, v1, v0, v2}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2302
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, v5, v5, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 2303
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2305
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     .line 2306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 2474
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2475
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 2476
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 2496
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2478
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const/16 v0, 0x11
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2481
a=0;//     :sswitch_1
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x42
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2484
a=0;//     :sswitch_2
a=0;//     #v0=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 2487
a=0;//     invoke-static {p1}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 2488
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2489
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/KeyEventCompat;->hasModifiers(Landroid/view/KeyEvent;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 2490
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2476
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x15 -> :sswitch_0
a=0;//         0x16 -> :sswitch_1
a=0;//         0x3d -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public fakeDragBy(F)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 2316
a=0;//     #v7=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 2317
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No fake drag in progress. Call beginFakeDrag first."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 2320
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2322
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     .line 2323
a=0;//     #v0=(Float);
a=0;//     sub-float v3, v0, p1
a=0;// 
a=0;//     .line 2324
a=0;//     #v3=(Float);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 2326
a=0;//     #v5=(Integer);
a=0;//     int-to-float v0, v5
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float v2, v0, v1
a=0;// 
a=0;//     .line 2327
a=0;//     #v2=(Float);
a=0;//     int-to-float v0, v5
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     mul-float v4, v0, v1
a=0;// 
a=0;//     .line 2329
a=0;//     #v4=(Float);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2330
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2331
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 2332
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v5
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     .line 2334
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     iget v2, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v6}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     if-eq v2, v6, :cond_3
a=0;// 
a=0;//     .line 2335
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v5
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     .line 2338
a=0;//     :goto_1
a=0;//     #v1=(Float);v2=(Integer);
a=0;//     cmpg-float v2, v3, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     .line 2344
a=0;//     :goto_2
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float v2, v0, v2
a=0;// 
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2345
a=0;//     float-to-int v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 2346
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     .line 2349
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 2350
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2352
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2353
a=0;//     invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 2354
a=0;//     return-void
a=0;// 
a=0;//     .line 2340
a=0;//     :cond_1
a=0;//     #v0=(Float);v1=(Float);v2=(Byte);v3=(Float);v4=(Float);v6=(Integer);
a=0;//     cmpl-float v0, v3, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2341
a=0;//     #v0=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v2=(Integer);
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Float);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v2=(Float);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2728
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 2743
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2733
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getChildDrawingOrder(II)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 642
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     sub-int p2, v0, p2
a=0;// 
a=0;//     .line 643
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I
a=0;// 
a=0;//     .line 644
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentItem()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 505
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOffscreenPageLimit()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPageMargin()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 723
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1337
a=0;//     :goto_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eq v0, p0, :cond_2
a=0;// 
a=0;//     .line 1338
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Landroid/view/View;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1339
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1343
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1341
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1343
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1326
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1327
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1328
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v3, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, p1, v3}, Landroid/support/v4/view/PagerAdapter;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1332
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1326
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/Object;);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1332
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1347
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1348
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1349
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p1, :cond_0
a=0;// 
a=0;//     .line 1353
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1347
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1353
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method initViewPager()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 354
a=0;//     #v4=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 355
a=0;//     const/high16 v0, 0x40000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setDescendantFocusability(I)V
a=0;// 
a=0;//     .line 356
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/view/ViewPager;->setFocusable(Z)V
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 358
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/Scroller;);
a=0;//     sget-object v2, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-direct {v1, v0, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 359
a=0;//     invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 360
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 362
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewConfigurationCompat;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     .line 363
a=0;//     const/high16 v3, 0x43c80000    # 400.0f
a=0;// 
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I
a=0;// 
a=0;//     .line 364
a=0;//     invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     .line 365
a=0;//     new-instance v1, Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v1, Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     .line 368
a=0;//     const/high16 v0, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I
a=0;// 
a=0;//     .line 369
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I
a=0;// 
a=0;//     .line 370
a=0;//     const/high16 v0, 0x41800000    # 16.0f
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I
a=0;// 
a=0;//     .line 372
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 374
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     invoke-static {p0, v4}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 379
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isFakeDragging()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2366
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1358
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 1359
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 1360
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 384
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 385
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 2199
a=0;//     invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2202
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 2203
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 2204
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 2206
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v2, v7
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v8, v1, v2
a=0;// 
a=0;//     .line 2207
a=0;//     #v8=(Float);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2208
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2209
a=0;//     iget v4, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2210
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 2211
a=0;//     #v9=(Integer);
a=0;//     iget v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2212
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     add-int/lit8 v10, v9, -0x1
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     iget v10, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 2213
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-ge v5, v10, :cond_2
a=0;// 
a=0;//     .line 2214
a=0;//     :goto_1
a=0;//     iget v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v5, v3, :cond_0
a=0;// 
a=0;//     if-ge v2, v9, :cond_0
a=0;// 
a=0;//     .line 2215
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2219
a=0;//     :cond_0
a=0;//     iget v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ne v5, v3, :cond_3
a=0;// 
a=0;//     .line 2220
a=0;//     iget v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v4, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v4, v7
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     .line 2221
a=0;//     iget v4, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v11, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-float/2addr v4, v11
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v4, v8
a=0;// 
a=0;//     .line 2228
a=0;//     :goto_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v11, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     add-float/2addr v11, v3
a=0;// 
a=0;//     int-to-float v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     cmpl-float v11, v11, v12
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-lez v11, :cond_1
a=0;// 
a=0;//     .line 2229
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     float-to-int v12, v3
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v14, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     int-to-float v14, v14
a=0;// 
a=0;//     #v14=(Float);
a=0;//     add-float/2addr v14, v3
a=0;// 
a=0;//     const/high16 v15, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-float/2addr v14, v15
a=0;// 
a=0;//     float-to-int v14, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I
a=0;// 
a=0;//     invoke-virtual {v11, v12, v13, v14, v15}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 2231
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2234
a=0;//     :cond_1
a=0;//     #v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     add-int v11, v6, v7
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     cmpl-float v3, v3, v11
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     .line 2239
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 2223
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Float);v9=(Integer);v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v3, v5}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 2224
a=0;//     #v11=(Float);
a=0;//     add-float v3, v4, v11
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v12, v7
a=0;// 
a=0;//     #v12=(Float);
a=0;//     mul-float/2addr v3, v12
a=0;// 
a=0;//     .line 2225
a=0;//     add-float/2addr v11, v8
a=0;// 
a=0;//     add-float/2addr v4, v11
a=0;// 
a=0;//     #v4=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2213
a=0;//     :cond_4
a=0;//     #v3=(Byte);v12=(Integer);
a=0;//     add-int/lit8 v3, v5, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v5, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1787
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     .line 1790
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     if-ne v0, v6, :cond_2
a=0;// 
a=0;//     .line 1793
a=0;//     :cond_0
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1794
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1795
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1796
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1797
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 1798
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1918
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1805
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Null);v3=(Byte);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1806
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 1808
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1810
a=0;//     :cond_3
a=0;//     #v2=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1816
a=0;//     :cond_4
a=0;//     #v1=(PosByte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 1909
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 1910
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1912
a=0;//     :cond_6
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1918
a=0;//     iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1827
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Null);v3=(Byte);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1828
a=0;//     if-eq v0, v3, :cond_5
a=0;// 
a=0;//     .line 1833
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1834
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1835
a=0;//     #v7=(Float);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float v8, v7, v1
a=0;// 
a=0;//     .line 1836
a=0;//     #v8=(Float);
a=0;//     invoke-static {v8}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1837
a=0;//     #v9=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1838
a=0;//     #v10=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F
a=0;// 
a=0;//     sub-float v0, v10, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1841
a=0;//     #v11=(Float);
a=0;//     cmpl-float v0, v8, v12
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, v8}, Landroid/support/v4/view/ViewPager;->isGutterDrag(FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v7
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-int v5, v10
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 1844
a=0;//     iput v7, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1845
a=0;//     iput v10, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1846
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1849
a=0;//     :cond_7
a=0;//     #v0=(Byte);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v9, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, v9
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v0, v11
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     .line 1851
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1852
a=0;//     invoke-direct {p0, v6}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1853
a=0;//     cmpl-float v0, v8, v12
a=0;// 
a=0;//     if-lez v0, :cond_9
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1855
a=0;//     iput v10, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1856
a=0;//     invoke-direct {p0, v6}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1865
a=0;//     :cond_8
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1867
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1868
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1853
a=0;//     :cond_9
a=0;//     #v0=(Byte);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1857
a=0;//     :cond_a
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v11, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     .line 1863
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1879
a=0;//     :sswitch_1
a=0;//     #v0=(Integer);v1=(PosByte);v3=(Byte);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1880
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1881
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1882
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1884
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     .line 1885
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I
a=0;// 
a=0;//     if-le v0, v1, :cond_b
a=0;// 
a=0;//     .line 1888
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1889
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1890
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1891
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1892
a=0;//     invoke-direct {p0, v6}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1894
a=0;//     :cond_b
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 1895
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1905
a=0;//     :sswitch_2
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1816
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x2 -> :sswitch_0
a=0;//         0x6 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 1498
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1499
a=0;//     #v9=(Integer);
a=0;//     sub-int v10, p4, p2
a=0;// 
a=0;//     .line 1500
a=0;//     #v10=(Integer);
a=0;//     sub-int v11, p5, p3
a=0;// 
a=0;//     .line 1501
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1502
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1503
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1504
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1505
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1507
a=0;//     #v12=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1511
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v8, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Integer);v7=(Conflicted);v8=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     if-ge v8, v9, :cond_0
a=0;// 
a=0;//     .line 1512
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 1513
a=0;//     #v13=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v1, v7, :cond_5
a=0;// 
a=0;//     .line 1514
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1517
a=0;//     iget-boolean v7, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 1518
a=0;//     iget v7, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     and-int/lit8 v7, v7, 0x7
a=0;// 
a=0;//     .line 1519
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v14, v1, 0x70
a=0;// 
a=0;//     .line 1520
a=0;//     #v14=(Integer);
a=0;//     packed-switch v7, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     move v7, v6
a=0;// 
a=0;//     .line 1537
a=0;//     :goto_1
a=0;//     sparse-switch v14, :sswitch_data_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     move/from16 v16, v3
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     .line 1554
a=0;//     :goto_2
a=0;//     add-int/2addr v7, v12
a=0;// 
a=0;//     .line 1555
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     add-int/2addr v14, v7
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int/2addr v15, v1
a=0;// 
a=0;//     invoke-virtual {v13, v7, v1, v14, v15}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1558
a=0;//     add-int/lit8 v1, v4, 0x1
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 1511
a=0;//     :goto_3
a=0;//     #v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     add-int/lit8 v6, v8, 0x1
a=0;// 
a=0;//     move v8, v6
a=0;// 
a=0;//     move v6, v5
a=0;// 
a=0;//     move v5, v2
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     move v4, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1526
a=0;//     :pswitch_1
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/2addr v1, v6
a=0;// 
a=0;//     move v7, v6
a=0;// 
a=0;//     move v6, v1
a=0;// 
a=0;//     .line 1527
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1529
a=0;//     :pswitch_2
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v1, v10, v1
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     .line 1531
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1533
a=0;//     :pswitch_3
a=0;//     sub-int v1, v10, v5
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     sub-int/2addr v1, v7
a=0;// 
a=0;//     .line 1534
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     add-int/2addr v5, v7
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1543
a=0;//     :sswitch_0
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     move/from16 v16, v2
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     .line 1544
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1546
a=0;//     :sswitch_1
a=0;//     #v16=(Conflicted);
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v1, v11, v1
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     move/from16 v16, v3
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     .line 1548
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1550
a=0;//     :sswitch_2
a=0;//     #v16=(Conflicted);
a=0;//     sub-int v1, v11, v3
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     sub-int/2addr v1, v14
a=0;// 
a=0;//     .line 1551
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     add-int/2addr v3, v14
a=0;// 
a=0;//     move/from16 v16, v3
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1563
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     sub-int v1, v10, v6
a=0;// 
a=0;//     sub-int v7, v1, v5
a=0;// 
a=0;//     .line 1565
a=0;//     #v7=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v5, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);v8=(Conflicted);v10=(Conflicted);
a=0;//     if-ge v5, v9, :cond_3
a=0;// 
a=0;//     .line 1566
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1567
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v10, 0x8
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     if-eq v1, v10, :cond_2
a=0;// 
a=0;//     .line 1568
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1570
a=0;//     iget-boolean v10, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 1571
a=0;//     int-to-float v12, v7
a=0;// 
a=0;//     #v12=(Float);
a=0;//     iget v10, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     mul-float/2addr v10, v12
a=0;// 
a=0;//     #v10=(Float);
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     .line 1572
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v10, v6
a=0;// 
a=0;//     .line 1574
a=0;//     iget-boolean v12, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     .line 1577
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     iput-boolean v12, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     .line 1578
a=0;//     int-to-float v12, v7
a=0;// 
a=0;//     #v12=(Float);
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, v12
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v12, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1581
a=0;//     sub-int v12, v11, v2
a=0;// 
a=0;//     sub-int/2addr v12, v3
a=0;// 
a=0;//     const/high16 v13, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1584
a=0;//     invoke-virtual {v8, v1, v12}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1589
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v10
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     add-int/2addr v12, v2
a=0;// 
a=0;//     invoke-virtual {v8, v10, v2, v1, v12}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1565
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v10=(Conflicted);
a=0;//     add-int/lit8 v1, v5, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v5, v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1595
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v2, v0, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I
a=0;// 
a=0;//     .line 1596
a=0;//     sub-int v1, v11, v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I
a=0;// 
a=0;//     .line 1597
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I
a=0;// 
a=0;//     .line 1599
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1600
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     .line 1602
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Integer);v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 1603
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v7=(PosByte);v8=(Integer);v10=(Integer);v13=(Reference,Landroid/view/View;);
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 1520
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1537
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_1
a=0;//         0x30 -> :sswitch_0
a=0;//         0x50 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 1369
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1, p2}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 1372
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1373
a=0;//     div-int/lit8 v1, v0, 0xa
a=0;// 
a=0;//     .line 1374
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     .line 1377
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v3, v0, v1
a=0;// 
a=0;//     .line 1378
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v5, v0, v1
a=0;// 
a=0;//     .line 1385
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1386
a=0;//     #v9=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v8, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-ge v8, v9, :cond_8
a=0;// 
a=0;//     .line 1387
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1388
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1389
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1390
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1391
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v6, v1, 0x7
a=0;// 
a=0;//     .line 1392
a=0;//     #v6=(Integer);
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     and-int/lit8 v4, v1, 0x70
a=0;// 
a=0;//     .line 1393
a=0;//     #v4=(Integer);
a=0;//     const/high16 v2, -0x80000000
a=0;// 
a=0;//     .line 1394
a=0;//     const/high16 v1, -0x80000000
a=0;// 
a=0;//     .line 1395
a=0;//     const/16 v7, 0x30
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v4, v7, :cond_0
a=0;// 
a=0;//     const/16 v7, 0x50
a=0;// 
a=0;//     if-ne v4, v7, :cond_4
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move v7, v4
a=0;// 
a=0;//     .line 1396
a=0;//     :goto_1
a=0;//     #v4=(Boolean);v7=(Boolean);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v6, v4, :cond_1
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     if-ne v6, v4, :cond_5
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move v6, v4
a=0;// 
a=0;//     .line 1398
a=0;//     :goto_2
a=0;//     #v4=(Boolean);v6=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 1399
a=0;//     const/high16 v2, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1406
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     iget v4, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v11, -0x2
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-eq v4, v11, :cond_e
a=0;// 
a=0;//     .line 1407
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1408
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     if-eq v2, v11, :cond_d
a=0;// 
a=0;//     .line 1409
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     .line 1412
a=0;//     :goto_4
a=0;//     iget v11, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v12, -0x2
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-eq v11, v12, :cond_c
a=0;// 
a=0;//     .line 1413
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1414
a=0;//     iget v11, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     if-eq v11, v12, :cond_c
a=0;// 
a=0;//     .line 1415
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     .line 1418
a=0;//     :goto_5
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1419
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1420
a=0;//     invoke-virtual {v10, v2, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1422
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 1423
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int/2addr v5, v0
a=0;// 
a=0;//     .line 1386
a=0;//     :cond_3
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     add-int/lit8 v0, v8, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v8, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1395
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v4=(Integer);v6=(Integer);v7=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v7, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1396
a=0;//     :cond_5
a=0;//     #v4=(PosByte);v7=(Boolean);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1400
a=0;//     :cond_6
a=0;//     #v4=(Boolean);v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 1401
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1424
a=0;//     :cond_7
a=0;//     #v0=(Integer);v4=(Integer);v11=(Integer);v12=(Byte);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 1425
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int/2addr v3, v0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1431
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mChildWidthMeasureSpec:I
a=0;// 
a=0;//     .line 1432
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I
a=0;// 
a=0;//     .line 1435
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1436
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1437
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1440
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1441
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v2, :cond_b
a=0;// 
a=0;//     .line 1442
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1443
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v0, v5, :cond_a
a=0;// 
a=0;//     .line 1447
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1448
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_a
a=0;// 
a=0;//     .line 1449
a=0;//     :cond_9
a=0;//     #v5=(PosByte);
a=0;//     int-to-float v5, v3
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1451
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I
a=0;// 
a=0;//     invoke-virtual {v4, v0, v5}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1441
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 1455
a=0;//     :cond_b
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v4=(Integer);v6=(Boolean);v7=(Boolean);v10=(Reference,Landroid/view/View;);v11=(Integer);v12=(Byte);
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v11=(Byte);v12=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_e
a=0;//     move v4, v2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method protected onPageScrolled(IFI)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1672
a=0;//     #v3=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 1673
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1674
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1675
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1676
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1677
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 1678
a=0;//     :goto_0
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-ge v4, v7, :cond_2
a=0;// 
a=0;//     .line 1679
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1680
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1681
a=0;//     iget-boolean v9, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_1
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v10
a=0;// 
a=0;//     .line 1678
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v9=(Integer);
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     move v10, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     move v2, v10
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1683
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v9=(Boolean);v10=(Conflicted);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     .line 1685
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     move v0, v1
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v10
a=0;// 
a=0;//     .line 1702
a=0;//     :goto_2
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v0, v5
a=0;// 
a=0;//     .line 1704
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     sub-int/2addr v0, v9
a=0;// 
a=0;//     .line 1705
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1706
a=0;//     invoke-virtual {v8, v0}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1691
a=0;//     :pswitch_1
a=0;//     #v9=(Boolean);v10=(Conflicted);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     move v10, v1
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 1692
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1694
a=0;//     :pswitch_2
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int v0, v6, v0
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v10
a=0;// 
a=0;//     .line 1696
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1698
a=0;//     :pswitch_3
a=0;//     #v10=(Conflicted);
a=0;//     sub-int v0, v6, v2
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-int/2addr v0, v9
a=0;// 
a=0;//     .line 1699
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     add-int/2addr v2, v9
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v10
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1711
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1712
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1714
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1715
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1718
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 1719
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1720
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 1721
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Reference,Landroid/view/View;);
a=0;//     if-ge v1, v4, :cond_6
a=0;// 
a=0;//     .line 1722
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1723
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1725
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1721
a=0;//     :goto_4
a=0;//     #v0=(Float);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1727
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v0, v5
a=0;// 
a=0;//     .line 1728
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     invoke-interface {v5, v3, v0}, Landroid/support/v4/view/ViewPager$PageTransformer;->transformPage(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1732
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1733
a=0;//     return-void
a=0;// 
a=0;//     .line 1685
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 2679
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2680
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v3, p1, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 2689
a=0;//     :goto_0
a=0;//     #v1=(Byte);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eq v3, v0, :cond_2
a=0;// 
a=0;//     .line 2690
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 2691
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 2692
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 2693
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget v6, v6, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v6, v7, :cond_1
a=0;// 
a=0;//     .line 2694
a=0;//     invoke-virtual {v5, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 2700
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2685
a=0;//     :cond_0
a=0;//     #v2=(One);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2687
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2689
a=0;//     :cond_1
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 2700
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1272
a=0;//     instance-of v0, p1, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1273
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1288
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1277
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     check-cast p1, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     .line 1278
a=0;//     invoke-virtual {p1}, Landroid/support/v4/view/ViewPager$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1280
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1281
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     iget-object v2, p1, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 1282
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1284
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 1285
a=0;//     iget-object v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1286
a=0;//     iget-object v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1261
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1262
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v1, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/view/ViewPager$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1263
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     .line 1264
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1265
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->saveState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1267
a=0;//     :cond_0
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1459
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 1462
a=0;//     if-eq p1, p3, :cond_0
a=0;// 
a=0;//     .line 1463
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, p3, v0, v1}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V
a=0;// 
a=0;//     .line 1465
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1923
a=0;//     #v1=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2039
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1930
a=0;//     :cond_0
a=0;//     #v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1933
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1936
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1938
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1941
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1942
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1944
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1946
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1949
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 2036
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 2037
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_6
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2039
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1951
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1952
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1953
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1954
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1955
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1958
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1959
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1960
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1964
a=0;//     :pswitch_2
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 1965
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1966
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1967
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float v4, v3, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1968
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1969
a=0;//     #v5=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     sub-float v0, v5, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1971
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     cmpl-float v6, v4, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_7
a=0;// 
a=0;//     cmpl-float v0, v4, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     .line 1973
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1974
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v0, v3, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v0, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1976
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1977
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1978
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1982
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1984
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1986
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1987
a=0;//     #v0=(Float);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v2, v0
a=0;// 
a=0;//     .line 1988
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1974
a=0;//     :cond_8
a=0;//     #v0=(Byte);v2=(Null);v3=(Null);v4=(Float);v5=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1991
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1992
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1993
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 1994
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 1996
a=0;//     #v0=(Integer);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1997
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1998
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1999
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2000
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v5, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2001
a=0;//     #v5=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v2, v3, v2
a=0;// 
a=0;//     iget v3, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     iget v3, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     .line 2002
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2004
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2005
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 2006
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v5, v2, v0, v3}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2008
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2, v1, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 2010
a=0;//     iput v6, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2011
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2012
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     or-int/2addr v2, v0
a=0;// 
a=0;//     .line 2013
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2016
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 2017
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, v1, v2, v2}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     .line 2018
a=0;//     iput v6, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2019
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2020
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     or-int/2addr v2, v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2024
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v2=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2025
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2026
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2027
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2031
a=0;//     :pswitch_6
a=0;//     #v3=(Uninit);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2032
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1949
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method pageLeft()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2592
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 2593
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 2596
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method pageRight()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2600
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 2601
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 2604
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method populate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 914
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->populate(I)V
a=0;// 
a=0;//     .line 915
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method populate(I)V
a=0;//     .locals 18
a=0;// 
a=0;//     .prologue
a=0;//     .line 918
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 919
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 920
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v4, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v4, v0, :cond_23
a=0;// 
a=0;//     .line 921
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     const/16 v2, 0x42
a=0;// 
a=0;//     .line 922
a=0;//     :goto_0
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v3, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 923
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 926
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 927
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->sortChildDrawingOrder()V
a=0;// 
a=0;//     .line 1103
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 921
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);v3=(Null);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 935
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);v1=(Conflicted);v2=(Reference,Landroid/support/v4/view/PagerAdapter;);v3=(PosByte);v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 937
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->sortChildDrawingOrder()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 944
a=0;//     :cond_3
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/IBinder;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 948
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 950
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 951
a=0;//     #v2=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, v2
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 952
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 953
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v5, v12, -0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/2addr v2, v6
a=0;// 
a=0;//     invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 955
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     if-eq v12, v2, :cond_4
a=0;// 
a=0;//     .line 958
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 962
a=0;//     :goto_3
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", found: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " Pager id: "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, " Pager class: "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, " Problematic adapter: "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 959
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Integer);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 960
a=0;//     #v2=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 972
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 973
a=0;//     #v6=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v5, v2
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v5, v2, :cond_22
a=0;// 
a=0;//     .line 974
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 975
a=0;//     iget v7, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v7, v8, :cond_9
a=0;// 
a=0;//     .line 976
a=0;//     iget v7, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-ne v7, v8, :cond_22
a=0;// 
a=0;//     .line 981
a=0;//     :goto_5
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     if-nez v2, :cond_21
a=0;// 
a=0;//     if-lez v12, :cond_21
a=0;// 
a=0;//     .line 982
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v5}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move-object v10, v2
a=0;// 
a=0;//     .line 988
a=0;//     :goto_6
a=0;//     #v10=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     .line 989
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 990
a=0;//     #v9=(Null);
a=0;//     add-int/lit8 v8, v5, -0x1
a=0;// 
a=0;//     .line 991
a=0;//     #v8=(Integer);
a=0;//     if-ltz v8, :cond_a
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 992
a=0;//     :goto_7
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 993
a=0;//     #v14=(Integer);
a=0;//     if-gtz v14, :cond_b
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 995
a=0;//     :goto_8
a=0;//     #v6=(Float);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     move/from16 v16, v7
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move v7, v9
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move/from16 v9, v16
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move/from16 v17, v8
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move v8, v5
a=0;// 
a=0;//     move/from16 v5, v17
a=0;// 
a=0;//     :goto_9
a=0;//     #v7=(Float);
a=0;//     if-ltz v9, :cond_5
a=0;// 
a=0;//     .line 996
a=0;//     cmpl-float v15, v7, v6
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-ltz v15, :cond_f
a=0;// 
a=0;//     if-ge v9, v11, :cond_f
a=0;// 
a=0;//     .line 997
a=0;//     if-nez v2, :cond_c
a=0;// 
a=0;//     .line 1023
a=0;//     :cond_5
a=0;//     #v15=(Conflicted);
a=0;//     iget v6, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 1024
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v9, v8, 0x1
a=0;// 
a=0;//     .line 1025
a=0;//     const/high16 v2, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v6, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_6
a=0;// 
a=0;//     .line 1026
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v9, v2, :cond_13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object v7, v2
a=0;// 
a=0;//     .line 1027
a=0;//     :goto_a
a=0;//     #v2=(Conflicted);v7=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-gtz v14, :cond_14
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v5, v2
a=0;// 
a=0;//     .line 1029
a=0;//     :goto_b
a=0;//     #v2=(Float);v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     move/from16 v16, v2
a=0;// 
a=0;//     move-object v2, v7
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move v7, v9
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move/from16 v9, v16
a=0;// 
a=0;//     :goto_c
a=0;//     #v11=(Conflicted);
a=0;//     if-ge v9, v12, :cond_6
a=0;// 
a=0;//     .line 1030
a=0;//     cmpl-float v11, v6, v5
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-ltz v11, :cond_17
a=0;// 
a=0;//     if-le v9, v13, :cond_17
a=0;// 
a=0;//     .line 1031
a=0;//     if-nez v2, :cond_15
a=0;// 
a=0;//     .line 1056
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v5=(Integer);v11=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v10, v8, v4}, Landroid/support/v4/view/ViewPager;->calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-eqz v10, :cond_1b
a=0;// 
a=0;//     iget-object v2, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_d
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v4, v0, v5, v2}, Landroid/support/v4/view/PagerAdapter;->setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1068
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 1072
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1073
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_e
a=0;//     #v2=(Integer);v4=(Integer);v6=(Conflicted);
a=0;//     if-ge v4, v5, :cond_1c
a=0;// 
a=0;//     .line 1074
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1075
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1076
a=0;//     iput v4, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I
a=0;// 
a=0;//     .line 1077
a=0;//     iget-boolean v7, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     iget v7, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     cmpl-float v7, v7, v8
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 1079
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1080
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 1081
a=0;//     iget v7, v6, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     .line 1082
a=0;//     iget v6, v6, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     .line 1073
a=0;//     :cond_8
a=0;//     #v6=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 973
a=0;//     :cond_9
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v6=(Null);v8=(Integer);v9=(Uninit);v10=(Uninit);v11=(Integer);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     add-int/lit8 v2, v5, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v5, v2
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 991
a=0;//     :cond_a
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v7=(Conflicted);v9=(Null);v10=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 993
a=0;//     :cond_b
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v14=(Integer);
a=0;//     const/high16 v6, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     int-to-float v15, v14
a=0;// 
a=0;//     #v15=(Float);
a=0;//     div-float/2addr v7, v15
a=0;// 
a=0;//     add-float/2addr v6, v7
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 1000
a=0;//     :cond_c
a=0;//     #v9=(Integer);v15=(Byte);v16=(Integer);v17=(Integer);
a=0;//     iget v15, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ne v9, v15, :cond_d
a=0;// 
a=0;//     iget-boolean v15, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_d
a=0;// 
a=0;//     .line 1001
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1002
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v15, v0, v9, v2}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1007
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 1008
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     .line 1009
a=0;//     if-ltz v5, :cond_e
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 995
a=0;//     :cond_d
a=0;//     :goto_f
a=0;//     #v15=(Conflicted);
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 1009
a=0;//     :cond_e
a=0;//     #v15=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 1011
a=0;//     :cond_f
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v15=(Byte);
a=0;//     if-eqz v2, :cond_11
a=0;// 
a=0;//     iget v15, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ne v9, v15, :cond_11
a=0;// 
a=0;//     .line 1012
a=0;//     iget v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v7, v2
a=0;// 
a=0;//     .line 1013
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 1014
a=0;//     if-ltz v5, :cond_10
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     :cond_10
a=0;//     #v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_11
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     add-int/lit8 v2, v5, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v9, v2}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1017
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v7, v2
a=0;// 
a=0;//     .line 1018
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     .line 1019
a=0;//     if-ltz v5, :cond_12
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     :cond_12
a=0;//     #v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 1026
a=0;//     :cond_13
a=0;//     #v2=(Integer);v6=(Integer);v15=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 1027
a=0;//     :cond_14
a=0;//     #v2=(Conflicted);v7=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v5, v14
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v2, v5
a=0;// 
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v2, v5
a=0;// 
a=0;//     move v5, v2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_15
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v7=(Integer);v11=(Byte);
a=0;//     iget v11, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-ne v9, v11, :cond_20
a=0;// 
a=0;//     iget-boolean v11, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_20
a=0;// 
a=0;//     .line 1035
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1036
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v11, v0, v9, v2}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1041
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v7, v2, :cond_16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     :goto_10
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     .line 1029
a=0;//     :goto_11
a=0;//     #v2=(Integer);v11=(Conflicted);
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     move/from16 v16, v2
a=0;// 
a=0;//     move-object v2, v6
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v6, v16
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     .line 1041
a=0;//     :cond_16
a=0;//     #v2=(Integer);v11=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_10
a=0;// 
a=0;//     .line 1043
a=0;//     :cond_17
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v11=(Byte);
a=0;//     if-eqz v2, :cond_19
a=0;// 
a=0;//     iget v11, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-ne v9, v11, :cond_19
a=0;// 
a=0;//     .line 1044
a=0;//     iget v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v6, v2
a=0;// 
a=0;//     .line 1045
a=0;//     #v6=(Float);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     .line 1046
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v7, v2, :cond_18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     :goto_12
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     #v16=(Float);
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     #v2=(Float);
a=0;//     goto :goto_11
a=0;// 
a=0;//     :cond_18
a=0;//     #v2=(Integer);v6=(Float);v16=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_12
a=0;// 
a=0;//     .line 1048
a=0;//     :cond_19
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v6=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v9, v7}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1049
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     .line 1050
a=0;//     iget v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v6, v2
a=0;// 
a=0;//     .line 1051
a=0;//     #v6=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v7, v2, :cond_1a
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     :goto_13
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     #v16=(Float);
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     #v2=(Float);
a=0;//     goto :goto_11
a=0;// 
a=0;//     :cond_1a
a=0;//     #v2=(Integer);v6=(Float);v16=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_13
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_1b
a=0;//     #v2=(Conflicted);v5=(Integer);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     .line 1086
a=0;//     :cond_1c
a=0;//     #v2=(Integer);v4=(Integer);v6=(Conflicted);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->sortChildDrawingOrder()V
a=0;// 
a=0;//     .line 1088
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->hasFocus()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1089
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1090
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_1f
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1091
a=0;//     :goto_14
a=0;//     if-eqz v2, :cond_1d
a=0;// 
a=0;//     iget v2, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-eq v2, v4, :cond_0
a=0;// 
a=0;//     .line 1092
a=0;//     :cond_1d
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_15
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     .line 1093
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1094
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1095
a=0;//     #v5=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v5, :cond_1e
a=0;// 
a=0;//     iget v5, v5, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v5, v6, :cond_1e
a=0;// 
a=0;//     .line 1096
a=0;//     invoke-virtual {v4, v3}, Landroid/view/View;->requestFocus(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 1092
a=0;//     :cond_1e
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_15
a=0;// 
a=0;//     .line 1090
a=0;//     :cond_1f
a=0;//     #v2=(Reference,Landroid/view/View;);v4=(Integer);v5=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_14
a=0;// 
a=0;//     :cond_20
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Float);v6=(Integer);v7=(Integer);v8=(Integer);v9=(Integer);v11=(Integer);v14=(Integer);v16=(Integer);v17=(Integer);
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     :cond_21
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Integer);v6=(Null);v7=(Conflicted);v8=(Conflicted);v9=(Uninit);v10=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     move-object v10, v2
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_22
a=0;//     #v2=(Conflicted);v10=(Uninit);
a=0;//     move-object v2, v6
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_23
a=0;//     #v0=(Integer);v1=(Uninit);v2=(PosByte);v3=(Null);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1318
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1319
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->removeViewInLayout(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1323
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1321
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 408
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 411
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v4, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3, p0, v4, v0}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 411
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 415
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 416
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 417
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->removeNonDecorViews()V
a=0;// 
a=0;//     .line 418
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 419
a=0;//     invoke-virtual {p0, v2, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 422
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 423
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 424
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 428
a=0;//     new-instance v1, Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-direct {v1, p0, v5}, Landroid/support/v4/view/ViewPager$PagerObserver;-><init>(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/ViewPager$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     .line 430
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 431
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 432
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 433
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     .line 435
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     if-ltz v3, :cond_5
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Parcelable;);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 437
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, v2, v6}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 438
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 439
a=0;//     iput-object v5, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 440
a=0;//     iput-object v5, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 448
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-eq v0, p1, :cond_4
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     invoke-interface {v1, v0, p1}, Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;->onAdapterChanged(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 451
a=0;//     :cond_4
a=0;//     return-void
a=0;// 
a=0;//     .line 441
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v3=(Integer);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 442
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 444
a=0;//     :cond_6
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setChildrenDrawingOrderEnabledCompat(Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 623
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 624
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 626
a=0;//     :try_start_0
a=0;//     const-class v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     const-string v1, "setChildrenDrawingOrderEnabled"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 633
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 638
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 628
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 629
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Can\'t find setChildrenDrawingOrderEnabled"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 634
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 635
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Error changing children drawing order"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 489
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 490
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 491
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 490
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(IZ)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 500
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 501
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 502
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZ)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 510
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZI)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 513
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 553
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 517
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-ne v0, p1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 518
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 522
a=0;//     :cond_2
a=0;//     if-gez p1, :cond_5
a=0;// 
a=0;//     move p1, v1
a=0;// 
a=0;//     .line 527
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 528
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     if-gt p1, v2, :cond_4
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     sub-int v0, v2, v0
a=0;// 
a=0;//     if-ge p1, v0, :cond_6
a=0;// 
a=0;//     :cond_4
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 532
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_6
a=0;// 
a=0;//     .line 533
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     iput-boolean v3, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     .line 532
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 524
a=0;//     :cond_5
a=0;//     #v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt p1, v0, :cond_3
a=0;// 
a=0;//     .line 525
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 p1, v0, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 536
a=0;//     :cond_6
a=0;//     #v2=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-eq v0, p1, :cond_7
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 538
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 541
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 542
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 543
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 545
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 546
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 548
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 550
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->populate(I)V
a=0;// 
a=0;//     .line 551
a=0;//     invoke-direct {p0, p1, p2, p4, v1}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 655
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 656
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setOffscreenPageLimit(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 688
a=0;//     #v0=(One);
a=0;//     if-ge p1, v0, :cond_0
a=0;// 
a=0;//     .line 689
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Requested offscreen page limit "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " too small; defaulting to "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move p1, v0
a=0;// 
a=0;//     .line 693
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 694
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 695
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 697
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     .line 475
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 592
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 593
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMargin(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 708
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     .line 709
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     .line 711
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 712
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, v1, p1, v0}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V
a=0;// 
a=0;//     .line 714
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     .line 715
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMarginDrawable(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 744
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 745
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 732
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 733
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->refreshDrawableState()V
a=0;// 
a=0;//     .line 734
a=0;//     :cond_0
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 735
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->invalidate()V
a=0;// 
a=0;//     .line 736
a=0;//     return-void
a=0;// 
a=0;//     .line 734
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 608
a=0;//     #v2=(Null);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     .line 609
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 610
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     if-eq v0, v3, :cond_4
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     .line 611
a=0;//     :goto_2
a=0;//     iput-object p2, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     .line 612
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setChildrenDrawingOrderEnabledCompat(Z)V
a=0;// 
a=0;//     .line 613
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 614
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     .line 618
a=0;//     :goto_3
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 620
a=0;//     :cond_1
a=0;//     #v0=(Integer);v3=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 609
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 610
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 616
a=0;//     :cond_5
a=0;//     #v3=(Boolean);
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 778
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 779
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(III)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/high16 v8, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 789
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 791
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 827
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 794
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 795
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 796
a=0;//     #v2=(Integer);
a=0;//     sub-int v3, p1, v1
a=0;// 
a=0;//     .line 797
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, p2, v2
a=0;// 
a=0;//     .line 798
a=0;//     #v4=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 799
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 800
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 801
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 805
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 806
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 808
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 809
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v5, v0, 0x2
a=0;// 
a=0;//     .line 810
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v8
a=0;// 
a=0;//     int-to-float v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     invoke-static {v8, v6}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 811
a=0;//     int-to-float v7, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v4/view/ViewPager;->distanceInfluenceForSnapDuration(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     add-float/2addr v5, v7
a=0;// 
a=0;//     .line 815
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 816
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_2
a=0;// 
a=0;//     .line 817
a=0;//     const/high16 v0, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     mul-float/2addr v0, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     .line 823
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     const/16 v5, 0x258
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 825
a=0;//     #v5=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 826
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 819
a=0;//     :cond_2
a=0;//     #v0=(Integer);v5=(Float);v6=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v0, v5
a=0;// 
a=0;//     .line 820
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     add-float/2addr v0, v6
a=0;// 
a=0;//     div-float v0, v5, v0
a=0;// 
a=0;//     .line 821
a=0;//     add-float/2addr v0, v8
a=0;// 
a=0;//     const/high16 v5, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v0, v5
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 749
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
