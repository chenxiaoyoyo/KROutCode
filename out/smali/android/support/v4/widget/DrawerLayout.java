package android.support.v4.widget; class DrawerLayout { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/DrawerLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ALLOW_EDGE_LOCK:Z = false
a=0;// 
a=0;// .field private static final CHILDREN_DISALLOW_INTERCEPT:Z = true
a=0;// 
a=0;// .field private static final DEFAULT_SCRIM_COLOR:I = -0x67000000
a=0;// 
a=0;// .field private static final LAYOUT_ATTRS:[I
a=0;// 
a=0;// .field public static final LOCK_MODE_LOCKED_CLOSED:I = 0x1
a=0;// 
a=0;// .field public static final LOCK_MODE_LOCKED_OPEN:I = 0x2
a=0;// 
a=0;// .field public static final LOCK_MODE_UNLOCKED:I = 0x0
a=0;// 
a=0;// .field private static final MIN_DRAWER_MARGIN:I = 0x40
a=0;// 
a=0;// .field private static final MIN_FLING_VELOCITY:I = 0x190
a=0;// 
a=0;// .field private static final PEEK_DELAY:I = 0xa0
a=0;// 
a=0;// .field public static final STATE_DRAGGING:I = 0x1
a=0;// 
a=0;// .field public static final STATE_IDLE:I = 0x0
a=0;// 
a=0;// .field public static final STATE_SETTLING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "DrawerLayout"
a=0;// 
a=0;// .field private static final TOUCH_SLOP_SENSITIVITY:F = 1.0f
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mChildrenCanceledTouch:Z
a=0;// 
a=0;// .field private mDisallowInterceptRequested:Z
a=0;// 
a=0;// .field private mDrawerState:I
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mInLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private final mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;// .field private final mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;// .field private mLockModeLeft:I
a=0;// 
a=0;// .field private mLockModeRight:I
a=0;// 
a=0;// .field private mMinDrawerMargin:I
a=0;// 
a=0;// .field private final mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;// .field private final mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private mScrimColor:I
a=0;// 
a=0;// .field private mScrimOpacity:F
a=0;// 
a=0;// .field private mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
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
a=0;//     sput-object v0, Landroid/support/v4/widget/DrawerLayout;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 218
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 222
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 225
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 135
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/high16 v0, -0x67000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 145
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x42800000    # 64.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/widget/DrawerLayout;->mMinDrawerMargin:I
a=0;// 
a=0;//     .line 229
a=0;//     const/high16 v1, 0x43c80000    # 400.0f
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Float);
a=0;//     new-instance v1, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;-><init>(Landroid/support/v4/widget/DrawerLayout;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     .line 232
a=0;//     new-instance v1, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;-><init>(Landroid/support/v4/widget/DrawerLayout;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-static {p0, v4, v1}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-static {p0, v4, v1}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 247
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;-><init>(Landroid/support/v4/widget/DrawerLayout;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/view/ViewGroupCompat;->setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100()[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     sget-object v0, Landroid/support/v4/widget/DrawerLayout;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private findVisibleDrawer()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1190
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1191
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 1192
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1193
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1197
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1191
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1197
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static gravityToString(I)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 566
a=0;//     and-int/lit8 v0, p0, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 567
a=0;//     const-string v0, "LEFT"
a=0;// 
a=0;//     .line 572
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 569
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, p0, 0x5
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 570
a=0;//     const-string v0, "RIGHT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 572
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static hasOpaqueBackground(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 770
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 771
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 772
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 774
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private hasPeekingDrawer()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1151
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 1152
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 1153
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1154
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1155
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1158
a=0;//     :goto_1
a=0;//     return v0
a=0;// 
a=0;//     .line 1152
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1158
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private hasVisibleDrawer()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1186
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method cancelChildViewTouch()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1202
a=0;//     #v5=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1203
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 1204
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1206
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1207
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v7=(Integer);
a=0;//     if-ge v7, v1, :cond_0
a=0;// 
a=0;//     .line 1208
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 1207
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1210
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 1211
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     .line 1213
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 520
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 521
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p2
a=0;// 
a=0;//     if-ne v0, p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1177
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
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
a=0;// .method public closeDrawer(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1074
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1076
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1078
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1079
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "No drawer view found with absolute gravity "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1082
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1083
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeDrawer(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1048
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1049
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a sliding drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1052
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1053
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1054
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 1055
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 1064
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1065
a=0;//     return-void
a=0;// 
a=0;//     .line 1057
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1058
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1061
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public closeDrawers()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 964
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 965
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method closeDrawers(Z)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 968
a=0;//     .line 969
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 970
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v2, v4, :cond_3
a=0;// 
a=0;//     .line 971
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 972
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 974
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 970
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 978
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v5=(Reference,Landroid/view/View;);v6=(Boolean);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 980
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {p0, v5, v7}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 981
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     neg-int v6, v6
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v5, v6, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     .line 988
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iput-boolean v3, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 984
a=0;//     :cond_2
a=0;//     #v5=(Reference,Landroid/view/View;);v6=(Integer);v7=(Boolean);v8=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v5, v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 991
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     .line 992
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     .line 994
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 995
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 997
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 755
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 756
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 757
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Float);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 758
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 759
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 757
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 761
a=0;//     :cond_0
a=0;//     iput v2, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     .line 764
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 765
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 767
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnDrawerClosed(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 473
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 474
a=0;//     iget-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 475
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 479
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 481
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnDrawerOpened(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 484
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 485
a=0;//     iget-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 486
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 488
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 490
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 492
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnDrawerSlide(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$DrawerListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 496
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerSlide(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 498
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 779
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 780
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 781
a=0;//     #v5=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 783
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 784
a=0;//     #v6=(Integer);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 785
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 786
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Integer);v8=(Conflicted);
a=0;//     if-ge v3, v7, :cond_4
a=0;// 
a=0;//     .line 787
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 788
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eq v0, p2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/DrawerLayout;->hasOpaqueBackground(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ge v8, v4, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 786
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Integer);v8=(Conflicted);
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 794
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v8=(Integer);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {p0, v0, v8}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 795
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 796
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_9
a=0;// 
a=0;//     :goto_2
a=0;//     move v1, v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 797
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 798
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 799
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 802
a=0;//     :cond_4
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 804
a=0;//     #v0=(Integer);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 805
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 807
a=0;//     iget v2, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_7
a=0;// 
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 808
a=0;//     iget v2, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     ushr-int/lit8 v2, v2, 0x18
a=0;// 
a=0;//     .line 809
a=0;//     #v2=(Char);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 810
a=0;//     #v2=(Integer);
a=0;//     shl-int/lit8 v2, v2, 0x18
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     const v4, 0xffffff
a=0;// 
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     .line 811
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 813
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 836
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Float);v3=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 814
a=0;//     :cond_7
a=0;//     #v0=(Integer);v2=(Byte);v3=(Null);v5=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p2, v0}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 815
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 816
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 817
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 818
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v2, v4, v2
a=0;// 
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 820
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v1, v4, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 822
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/high16 v1, 0x437f0000    # 255.0f
a=0;// 
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
a=0;// 
a=0;//     .line 823
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 824
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Byte);v3=(Null);v5=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p2, v0}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 825
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 826
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 827
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v2, v1
a=0;// 
a=0;//     .line 828
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 829
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 831
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v0, v4, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 833
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/high16 v1, 0x437f0000    # 255.0f
a=0;// 
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
a=0;// 
a=0;//     .line 834
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);v2=(Integer);v3=(Integer);v5=(Boolean);v7=(Integer);v8=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method findDrawerWithGravity(I)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 548
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 549
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 550
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 551
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x7
a=0;// 
a=0;//     and-int/lit8 v4, p1, 0x7
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 556
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 548
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method findOpenDrawer()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 526
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 527
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 528
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 532
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 526
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/view/View;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 1163
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1182
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1168
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/support/v4/widget/DrawerLayout$LayoutParams;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDrawerLockMode(I)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 409
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 411
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     .line 416
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 413
a=0;//     :cond_0
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 414
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 416
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDrawerLockMode(Landroid/view/View;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 428
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 429
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     .line 434
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 430
a=0;//     :cond_0
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 431
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 434
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getDrawerViewGravity(Landroid/view/View;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 516
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getDrawerViewOffset(Landroid/view/View;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isContentView(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 840
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerOpen(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1112
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1113
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1114
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1116
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerOpen(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1096
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1097
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1099
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isDrawerView(Landroid/view/View;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 845
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 847
a=0;//     and-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerVisible(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1143
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1144
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1145
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1147
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerVisible(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1128
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1129
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1131
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method moveDrawerToOffset(Landroid/view/View;F)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 537
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 538
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 539
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, p2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     .line 540
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     .line 542
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 543
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 544
a=0;//     return-void
a=0;// 
a=0;//     .line 542
a=0;//     :cond_0
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 583
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 584
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 585
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 577
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 578
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 579
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 852
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 855
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v3, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     or-int/2addr v3, v4
a=0;// 
a=0;//     .line 860
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 892
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->hasPeekingDrawer()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 862
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v2=(Null);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 863
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 864
a=0;//     #v4=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 865
a=0;//     iput v4, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
a=0;// 
a=0;//     .line 866
a=0;//     iget v5, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     cmpl-float v5, v5, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_3
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 870
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 871
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 877
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 878
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     .line 879
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 886
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v4=(Boolean);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 887
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 888
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Float);v4=(Integer);v5=(Conflicted);v6=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 860
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1217
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->hasVisibleDrawer()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1218
a=0;//     invoke-static {p2}, Landroid/support/v4/view/KeyEventCompat;->startTracking(Landroid/view/KeyEvent;)V
a=0;// 
a=0;//     .line 1219
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1221
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1226
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 1227
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1228
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1229
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers()V
a=0;// 
a=0;//     .line 1231
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1233
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 1231
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1233
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 665
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
a=0;// 
a=0;//     .line 666
a=0;//     sub-int v6, p4, p2
a=0;// 
a=0;//     .line 667
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 668
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v5, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v5, v7, :cond_9
a=0;// 
a=0;//     .line 669
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 671
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 668
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v5, 0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 675
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 677
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 678
a=0;//     iget v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     invoke-virtual {v8, v1, v2, v3, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 682
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 683
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 687
a=0;//     #v10=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v8, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 688
a=0;//     neg-int v1, v9
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v9
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     .line 689
a=0;//     add-int v1, v9, v2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     .line 695
a=0;//     :goto_2
a=0;//     iget v3, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     cmpl-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 697
a=0;//     :goto_3
a=0;//     #v3=(Boolean);
a=0;//     iget v4, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x70
a=0;// 
a=0;//     .line 699
a=0;//     sparse-switch v4, :sswitch_data_0
a=0;// 
a=0;//     .line 702
a=0;//     iget v4, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     add-int/2addr v9, v2
a=0;// 
a=0;//     invoke-virtual {v8, v2, v4, v9, v10}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 732
a=0;//     :goto_4
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 733
a=0;//     invoke-virtual {p0, v8, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 736
a=0;//     :cond_3
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 737
a=0;//     :goto_5
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     .line 738
a=0;//     invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 691
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     int-to-float v1, v9
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v2, v6, v1
a=0;// 
a=0;//     .line 692
a=0;//     sub-int v1, v6, v2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 695
a=0;//     :cond_5
a=0;//     #v3=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 707
a=0;//     :sswitch_0
a=0;//     #v3=(Boolean);v4=(Integer);
a=0;//     sub-int v4, p5, p3
a=0;// 
a=0;//     .line 708
a=0;//     iget v10, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     sub-int v10, v4, v10
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int/2addr v10, v11
a=0;// 
a=0;//     add-int/2addr v9, v2
a=0;// 
a=0;//     iget v11, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     sub-int/2addr v4, v11
a=0;// 
a=0;//     invoke-virtual {v8, v2, v10, v9, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 716
a=0;//     :sswitch_1
a=0;//     #v11=(Conflicted);
a=0;//     sub-int v11, p5, p3
a=0;// 
a=0;//     .line 717
a=0;//     #v11=(Integer);
a=0;//     sub-int v4, v11, v10
a=0;// 
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     .line 721
a=0;//     iget v12, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v4, v12, :cond_7
a=0;// 
a=0;//     .line 722
a=0;//     iget v4, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 726
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     add-int/2addr v9, v2
a=0;// 
a=0;//     add-int/2addr v10, v4
a=0;// 
a=0;//     invoke-virtual {v8, v2, v4, v9, v10}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 723
a=0;//     :cond_7
a=0;//     add-int v12, v4, v10
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     sub-int v13, v11, v13
a=0;// 
a=0;//     if-le v12, v13, :cond_6
a=0;// 
a=0;//     .line 724
a=0;//     iget v4, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     sub-int v4, v11, v4
a=0;// 
a=0;//     sub-int/2addr v4, v10
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 736
a=0;//     :cond_8
a=0;//     #v0=(Byte);v1=(Null);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 742
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
a=0;// 
a=0;//     .line 743
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 744
a=0;//     return-void
a=0;// 
a=0;//     .line 699
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_1
a=0;//         0x50 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v7, -0x80000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/high16 v10, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 589
a=0;//     #v10=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 590
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 591
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 592
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 594
a=0;//     #v0=(Integer);
a=0;//     if-ne v3, v10, :cond_0
a=0;// 
a=0;//     if-eq v5, v10, :cond_5
a=0;// 
a=0;//     .line 595
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 600
a=0;//     if-ne v3, v7, :cond_3
a=0;// 
a=0;//     .line 606
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     if-ne v5, v7, :cond_4
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 619
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v2, v1}, Landroid/support/v4/widget/DrawerLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 623
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 624
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v3, v5, :cond_b
a=0;// 
a=0;//     .line 625
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 627
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v0, v7, :cond_7
a=0;// 
a=0;//     .line 624
a=0;//     :goto_3
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 602
a=0;//     :cond_3
a=0;//     #v1=(PosShort);v6=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 604
a=0;//     #v2=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 609
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 614
a=0;//     :cond_6
a=0;//     #v1=(PosShort);v6=(Boolean);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "DrawerLayout must be measured with MeasureSpec.EXACTLY."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 631
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Integer);v6=(Reference,Landroid/view/View;);v7=(PosByte);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 633
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 635
a=0;//     iget v7, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v7, v2, v7
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int/2addr v7, v8
a=0;// 
a=0;//     invoke-static {v7, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 637
a=0;//     iget v8, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     sub-int v8, v1, v8
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v8, v0
a=0;// 
a=0;//     invoke-static {v0, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 639
a=0;//     invoke-virtual {v6, v7, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 640
a=0;//     :cond_8
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v7=(Boolean);v8=(Conflicted);
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     and-int/lit8 v7, v7, 0x7
a=0;// 
a=0;//     .line 643
a=0;//     and-int v8, v4, v7
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 644
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Child drawer has absolute gravity "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v7}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " but this "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "DrawerLayout"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " already has a "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "drawer view along that edge"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 648
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/widget/DrawerLayout;->mMinDrawerMargin:I
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->width:I
a=0;// 
a=0;//     invoke-static {p1, v7, v8}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 651
a=0;//     iget v8, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v8, v0}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 654
a=0;//     invoke-virtual {v6, v7, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 656
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Child "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " at index "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " does not have a valid layout_gravity - must be Gravity.LEFT, "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "Gravity.RIGHT or Gravity.NO_GRAVITY"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 661
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v6=(Conflicted);v7=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1238
a=0;//     check-cast p1, Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;// 
a=0;//     .line 1239
a=0;//     invoke-virtual {p1}, Landroid/support/v4/widget/DrawerLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1241
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1242
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1243
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1244
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1248
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeLeft:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 1249
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeRight:I
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 1250
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1254
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1256
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v2, Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/DrawerLayout$SavedState;);
a=0;//     invoke-direct {v2, v0}, Landroid/support/v4/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1258
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$SavedState;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1259
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     .line 1260
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1261
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1259
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1265
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1266
a=0;//     iget-boolean v4, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1267
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
a=0;// 
a=0;//     .line 1273
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     iput v0, v2, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeLeft:I
a=0;// 
a=0;//     .line 1274
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     iput v0, v2, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeRight:I
a=0;// 
a=0;//     .line 1276
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 897
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 898
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 900
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 903
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 944
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 905
a=0;//     :pswitch_1
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 906
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 907
a=0;//     #v3=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 908
a=0;//     iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
a=0;// 
a=0;//     .line 909
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 910
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 915
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 916
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 918
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     float-to-int v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     float-to-int v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 919
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 920
a=0;//     iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v0, v4
a=0;// 
a=0;//     .line 921
a=0;//     iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
a=0;// 
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     .line 922
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 923
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v0, v0
a=0;// 
a=0;//     mul-float/2addr v3, v3
a=0;// 
a=0;//     add-float/2addr v0, v3
a=0;// 
a=0;//     mul-int v3, v4, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 925
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->findOpenDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 926
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 927
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 931
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Float);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 932
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v3=(PosByte);v4=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 927
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 937
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 938
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 939
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Float);v4=(Conflicted);v5=(Integer);v6=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 903
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public openDrawer(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1031
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1033
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1035
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1036
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "No drawer view found with absolute gravity "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1039
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1040
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openDrawer(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1005
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1006
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a sliding drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1009
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1010
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1011
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 1012
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 1021
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1022
a=0;//     return-void
a=0;// 
a=0;//     .line 1014
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1015
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1017
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestDisallowInterceptTouchEvent(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 952
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 954
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 955
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 956
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 958
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public requestLayout()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 748
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 749
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
a=0;// 
a=0;//     .line 751
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerListener(Landroid/support/v4/widget/DrawerLayout$DrawerListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 305
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerLockMode(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 323
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 324
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerLockMode(II)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     .line 346
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 348
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     .line 349
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     .line 353
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 355
a=0;//     if-ne v1, v2, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 356
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 358
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 373
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     .line 350
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     .line 351
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 360
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 361
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 362
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 366
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 367
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 368
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 358
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerLockMode(ILandroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 395
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "drawer with appropriate layout_gravity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 398
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 399
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerShadow(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 267
a=0;//     and-int/lit8 v1, v0, 0x3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 271
a=0;//     :cond_0
a=0;//     and-int/lit8 v0, v0, 0x5
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 272
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 273
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 275
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setDrawerViewOffset(Landroid/view/View;F)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 502
a=0;//     iget v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, p2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 508
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 506
a=0;//     :cond_0
a=0;//     iput p2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 507
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerSlide(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setScrimColor(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     .line 295
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 296
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateDrawerState(IILandroid/view/View;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 442
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 443
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 446
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v1, :cond_0
a=0;// 
a=0;//     if-ne v3, v1, :cond_3
a=0;// 
a=0;//     .line 454
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 455
a=0;//     invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 456
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 457
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 463
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawerState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v1, v0, :cond_2
a=0;// 
a=0;//     .line 464
a=0;//     iput v1, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawerState:I
a=0;// 
a=0;//     .line 466
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$DrawerListener;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerStateChanged(I)V
a=0;// 
a=0;//     .line 470
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 448
a=0;//     :cond_3
a=0;//     #v0=(PosByte);v1=(One);
a=0;//     if-eq v2, v0, :cond_4
a=0;// 
a=0;//     if-ne v3, v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 449
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 451
a=0;//     :cond_5
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 458
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v1=(PosByte);v2=(Byte);v3=(Null);
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 459
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerOpened(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
