package android.support.v4.view; class GestureDetectorCompat$GestureDetectorCompatImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DOUBLE_TAP_TIMEOUT:I
a=0;// 
a=0;// .field private static final LONGPRESS_TIMEOUT:I
a=0;// 
a=0;// .field private static final LONG_PRESS:I = 0x2
a=0;// 
a=0;// .field private static final SHOW_PRESS:I = 0x1
a=0;// 
a=0;// .field private static final TAP:I = 0x3
a=0;// 
a=0;// .field private static final TAP_TIMEOUT:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAlwaysInBiggerTapRegion:Z
a=0;// 
a=0;// .field private mAlwaysInTapRegion:Z
a=0;// 
a=0;// .field private mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;// .field private mDeferConfirmSingleTap:Z
a=0;// 
a=0;// .field private mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;// .field private mDoubleTapSlopSquare:I
a=0;// 
a=0;// .field private mDownFocusX:F
a=0;// 
a=0;// .field private mDownFocusY:F
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mInLongPress:Z
a=0;// 
a=0;// .field private mIsDoubleTapping:Z
a=0;// 
a=0;// .field private mIsLongpressEnabled:Z
a=0;// 
a=0;// .field private mLastFocusX:F
a=0;// 
a=0;// .field private mLastFocusY:F
a=0;// 
a=0;// .field private final mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;// .field private mMaximumFlingVelocity:I
a=0;// 
a=0;// .field private mMinimumFlingVelocity:I
a=0;// 
a=0;// .field private mPreviousUpEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;// .field private mStillDown:Z
a=0;// 
a=0;// .field private mTouchSlopSquare:I
a=0;// 
a=0;// .field private mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->LONGPRESS_TIMEOUT:I
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sput v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->TAP_TIMEOUT:I
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sput v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->DOUBLE_TAP_TIMEOUT:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 153
a=0;//     #p0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;);
a=0;//     invoke-direct {v0, p0, p3}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;-><init>(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     iput-object p2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     .line 159
a=0;//     instance-of v0, p2, Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     check-cast p2, Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// 
a=0;//     .line 156
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;-><init>(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/MotionEvent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnGestureListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->dispatchLongPress()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnDoubleTapListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$502(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iput-boolean p1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private cancel()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 409
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 413
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 414
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z
a=0;// 
a=0;//     .line 415
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z
a=0;// 
a=0;//     .line 416
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z
a=0;// 
a=0;//     .line 417
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z
a=0;// 
a=0;//     .line 418
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     .line 419
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 420
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     .line 422
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private cancelTaps()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 425
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 428
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z
a=0;// 
a=0;//     .line 429
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z
a=0;// 
a=0;//     .line 430
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z
a=0;// 
a=0;//     .line 431
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     .line 432
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 433
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     .line 435
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private dispatchLongPress()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 454
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     .line 455
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 457
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Context must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "OnGestureListener must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z
a=0;// 
a=0;//     .line 174
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 176
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledDoubleTapSlop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 177
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMinimumFlingVelocity:I
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMaximumFlingVelocity:I
a=0;// 
a=0;//     .line 180
a=0;//     mul-int v0, v1, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mTouchSlopSquare:I
a=0;// 
a=0;//     .line 181
a=0;//     mul-int v0, v2, v2
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapSlopSquare:I
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isConsideredDoubleTap(Landroid/view/MotionEvent;Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 439
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 449
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 443
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p3}, Landroid/view/MotionEvent;->getEventTime()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     sget v3, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->DOUBLE_TAP_TIMEOUT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     .line 449
a=0;//     mul-int/2addr v1, v1
a=0;// 
a=0;//     mul-int/2addr v2, v2
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapSlopSquare:I
a=0;// 
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isLongpressEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 224
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 226
a=0;//     #v9=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 231
a=0;//     and-int/lit16 v0, v9, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 233
a=0;//     :goto_0
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 237
a=0;//     :goto_1
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v1, v6
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 238
a=0;//     :goto_2
a=0;//     #v1=(Float);v2=(Float);v5=(Integer);v10=(Conflicted);
a=0;//     if-ge v5, v4, :cond_4
a=0;// 
a=0;//     .line 239
a=0;//     if-ne v0, v5, :cond_3
a=0;// 
a=0;//     .line 238
a=0;//     :goto_3
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(PosByte);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v10=(Uninit);
a=0;//     move v7, v3
a=0;// 
a=0;//     .line 231
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 233
a=0;//     :cond_2
a=0;//     #v7=(Boolean);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 240
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Float);v2=(Float);v4=(Integer);v5=(Integer);v10=(Conflicted);
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     add-float/2addr v2, v10
a=0;// 
a=0;//     .line 241
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     add-float/2addr v1, v10
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 243
a=0;//     :cond_4
a=0;//     #v10=(Conflicted);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     add-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     .line 244
a=0;//     :goto_4
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v2, v5
a=0;// 
a=0;//     .line 245
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v1, v0
a=0;// 
a=0;//     .line 249
a=0;//     and-int/lit16 v0, v9, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 405
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Float);v9=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Float);v2=(Float);v3=(Null);v4=(Integer);v5=(Integer);v6=(Null);v7=(Boolean);v8=(One);v9=(Integer);
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 243
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 251
a=0;//     :pswitch_1
a=0;//     #v5=(Float);
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F
a=0;// 
a=0;//     .line 252
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F
a=0;// 
a=0;//     .line 254
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->cancelTaps()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 258
a=0;//     :pswitch_2
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F
a=0;// 
a=0;//     .line 259
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iget v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMaximumFlingVelocity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 264
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 265
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 266
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {v2, v0}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 267
a=0;//     #v2=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {v5, v0}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 268
a=0;//     :goto_6
a=0;//     #v7=(Byte);v8=(Float);v9=(Conflicted);
a=0;//     if-ge v0, v4, :cond_5
a=0;// 
a=0;//     .line 269
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 268
a=0;//     :cond_7
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 271
a=0;//     :cond_8
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 272
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {v8, v7}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     mul-float/2addr v8, v2
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v9, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {v9, v7}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v7, v5
a=0;// 
a=0;//     .line 275
a=0;//     add-float/2addr v7, v8
a=0;// 
a=0;//     .line 276
a=0;//     cmpg-float v7, v7, v6
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gez v7, :cond_7
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 284
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Float);v7=(Boolean);v8=(One);v9=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnDoubleTapListener;);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/os/Handler;->hasMessages(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 286
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v4, v11}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 287
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/MotionEvent;);
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     invoke-direct {p0, v0, v4, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->isConsideredDoubleTap(Landroid/view/MotionEvent;Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 290
a=0;//     iput-boolean v8, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnDoubleTapListener;);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     invoke-interface {v0, v4}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTap(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v0, v3
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     invoke-interface {v4, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     or-int/2addr v0, v4
a=0;// 
a=0;//     .line 301
a=0;//     :goto_7
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F
a=0;// 
a=0;//     .line 302
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 306
a=0;//     :cond_a
a=0;//     invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     .line 307
a=0;//     iput-boolean v8, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z
a=0;// 
a=0;//     .line 308
a=0;//     iput-boolean v8, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z
a=0;// 
a=0;//     .line 309
a=0;//     iput-boolean v8, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z
a=0;// 
a=0;//     .line 310
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     .line 311
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     .line 313
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v12}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {v2}, Landroid/view/MotionEvent;->getDownTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget v4, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->TAP_TIMEOUT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     sget v4, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->LONGPRESS_TIMEOUT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v1, v12, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z
a=0;// 
a=0;//     .line 318
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {v2}, Landroid/view/MotionEvent;->getDownTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget v4, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->TAP_TIMEOUT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v1, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Landroid/view/GestureDetector$OnGestureListener;->onDown(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int v3, v0, v1
a=0;// 
a=0;//     .line 320
a=0;//     #v3=(Boolean);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 297
a=0;//     :cond_c
a=0;//     #v1=(Float);v2=(Float);v3=(Null);v4=(Reference,Landroid/view/MotionEvent;);v5=(Float);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     sget v4, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->DOUBLE_TAP_TIMEOUT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0, v11, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     :cond_d
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 323
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v4=(Integer);v5=(Float);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 326
a=0;//     iget v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     .line 327
a=0;//     #v0=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F
a=0;// 
a=0;//     sub-float/2addr v4, v1
a=0;// 
a=0;//     .line 328
a=0;//     #v4=(Float);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnDoubleTapListener;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v3, v0
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 331
a=0;//     :cond_e
a=0;//     #v0=(Float);v3=(Null);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z
a=0;// 
a=0;//     if-eqz v5, :cond_10
a=0;// 
a=0;//     .line 332
a=0;//     iget v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float v5, v2, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     .line 333
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float v6, v1, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     .line 334
a=0;//     #v6=(Integer);
a=0;//     mul-int/2addr v5, v5
a=0;// 
a=0;//     mul-int/2addr v6, v6
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     .line 335
a=0;//     iget v6, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mTouchSlopSquare:I
a=0;// 
a=0;//     if-le v5, v6, :cond_1a
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v6, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-interface {v6, v7, p1, v0, v4}, Landroid/view/GestureDetector$OnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 337
a=0;//     #v0=(Boolean);
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F
a=0;// 
a=0;//     .line 338
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F
a=0;// 
a=0;//     .line 339
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v11}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 344
a=0;//     :goto_8
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mTouchSlopSquare:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v5, v1, :cond_f
a=0;// 
a=0;//     .line 345
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z
a=0;// 
a=0;//     :cond_f
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 347
a=0;//     #v3=(Boolean);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Float);v1=(Float);v3=(Null);v5=(Boolean);v6=(Null);v7=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     cmpl-float v5, v5, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_11
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     cmpl-float v5, v5, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_5
a=0;// 
a=0;//     .line 348
a=0;//     :cond_11
a=0;//     iget-object v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-interface {v3, v5, p1, v0, v4}, Landroid/view/GestureDetector$OnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 349
a=0;//     #v3=(Boolean);
a=0;//     iput v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F
a=0;// 
a=0;//     .line 350
a=0;//     iput v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 355
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v3=(Null);v4=(Integer);v5=(Float);v6=(Null);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z
a=0;// 
a=0;//     .line 356
a=0;//     invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 357
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnDoubleTapListener;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v0, v3
a=0;// 
a=0;//     .line 383
a=0;//     :cond_12
a=0;//     :goto_9
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MotionEvent;);
a=0;//     if-eqz v2, :cond_13
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 387
a=0;//     :cond_13
a=0;//     iput-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     if-eqz v1, :cond_14
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 392
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 394
a=0;//     :cond_14
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z
a=0;// 
a=0;//     .line 395
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 398
a=0;//     #v3=(Boolean);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 360
a=0;//     :cond_15
a=0;//     #v2=(Float);v3=(Null);v5=(Float);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     .line 361
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v11}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 362
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 363
a=0;//     :cond_16
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z
a=0;// 
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 365
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDeferConfirmSingleTap:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_12
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/GestureDetector$OnDoubleTapListener;);
a=0;//     if-eqz v2, :cond_12
a=0;// 
a=0;//     .line 366
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 370
a=0;//     :cond_17
a=0;//     #v2=(Float);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 371
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 372
a=0;//     #v2=(Integer);
a=0;//     const/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     iget v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMaximumFlingVelocity:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 373
a=0;//     invoke-static {v0, v2}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 375
a=0;//     #v4=(Float);
a=0;//     invoke-static {v0, v2}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 378
a=0;//     #v0=(Float);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMinimumFlingVelocity:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_18
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMinimumFlingVelocity:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_19
a=0;// 
a=0;//     .line 380
a=0;//     :cond_18
a=0;//     iget-object v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-interface {v2, v5, p1, v0, v4}, Landroid/view/GestureDetector$OnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 401
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);v1=(Float);v2=(Float);v4=(Integer);v5=(Float);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->cancel()V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_19
a=0;//     #v0=(Float);v1=(Reference,Landroid/view/MotionEvent;);v2=(Byte);v4=(Float);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :cond_1a
a=0;//     #v0=(Float);v1=(Float);v2=(Float);v5=(Integer);v6=(Integer);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 249
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_4
a=0;//         :pswitch_6
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setIsLongpressEnabled(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iput-boolean p1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iput-object p1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     .line 193
a=0;//     return-void
a=0;// .end method
}}
