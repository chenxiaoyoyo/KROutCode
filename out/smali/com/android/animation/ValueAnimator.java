package com.android.animation; class ValueAnimator { void a() { int a;
a=0;// .class public Lcom/android/animation/ValueAnimator;
a=0;// .super Lcom/android/animation/Animator;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ANIMATION_FRAME:I = 0x1
a=0;// 
a=0;// .field static final ANIMATION_START:I = 0x0
a=0;// 
a=0;// .field private static final DEFAULT_FRAME_DELAY:J = 0xaL
a=0;// 
a=0;// .field public static final INFINITE:I = -0x1
a=0;// 
a=0;// .field public static final RESTART:I = 0x1
a=0;// 
a=0;// .field public static final REVERSE:I = 0x2
a=0;// 
a=0;// .field static final RUNNING:I = 0x1
a=0;// 
a=0;// .field static final SEEKED:I = 0x2
a=0;// 
a=0;// .field static final STOPPED:I
a=0;// 
a=0;// .field private static sAnimationHandler:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// .field private static final sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// .field private static final sDefaultInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private static final sDelayedAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// .field private static final sEndingAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// .field private static final sFloatEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// .field private static sFrameDelay:J
a=0;// 
a=0;// .field private static final sIntEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// .field private static final sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// .field private static final sReadyAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCurrentFraction:F
a=0;// 
a=0;// .field private mCurrentIteration:I
a=0;// 
a=0;// .field private mDelayStartTime:J
a=0;// 
a=0;// .field private mDuration:J
a=0;// 
a=0;// .field mInitialized:Z
a=0;// 
a=0;// .field private mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mPlayingBackwards:Z
a=0;// 
a=0;// .field mPlayingState:I
a=0;// 
a=0;// .field private mRepeatCount:I
a=0;// 
a=0;// .field private mRepeatMode:I
a=0;// 
a=0;// .field private mRunning:Z
a=0;// 
a=0;// .field mSeekTime:J
a=0;// 
a=0;// .field private mStartDelay:J
a=0;// 
a=0;// .field mStartTime:J
a=0;// 
a=0;// .field private mStarted:Z
a=0;// 
a=0;// .field private mStartedDelay:Z
a=0;// 
a=0;// .field private mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;// .field mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;// .field mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     new-instance v0, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sAnimationHandler:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator$1;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator$1;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator$2;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator$2;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator$2;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator$3;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator$3;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator$3;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sDelayedAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator$4;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator$4;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator$4;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sEndingAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator$5;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator$5;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator$5;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sReadyAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateDecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateDecelerateInterpolator;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sDefaultInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v0, Lcom/android/animation/IntEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/IntEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/IntEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/IntEvaluator;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sIntEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v0, Lcom/android/animation/FloatEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/FloatEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/FloatEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/FloatEvaluator;);
a=0;//     sput-object v0, Lcom/android/animation/ValueAnimator;->sFloatEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 222
a=0;//     const-wide/16 v0, 0xa
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/android/animation/ValueAnimator;->sFrameDelay:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 283
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Lcom/android/animation/Animator;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     #p0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/android/animation/ValueAnimator;->mSeekTime:J
a=0;// 
a=0;//     .line 155
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     .line 161
a=0;//     iput v2, p0, Lcom/android/animation/ValueAnimator;->mCurrentIteration:I
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/android/animation/ValueAnimator;->mCurrentFraction:F
a=0;// 
a=0;//     .line 171
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mStartedDelay:Z
a=0;// 
a=0;//     .line 187
a=0;//     iput v2, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 197
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     .line 203
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mStarted:Z
a=0;// 
a=0;//     .line 209
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 216
a=0;//     const-wide/16 v0, 0x12c
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     .line 219
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     .line 226
a=0;//     iput v2, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     .line 233
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatMode:I
a=0;// 
a=0;//     .line 240
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sDefaultInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 245
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 284
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Ljava/lang/ThreadLocal;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100()Ljava/lang/ThreadLocal;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sDelayedAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-wide v0, Lcom/android/animation/ValueAnimator;->sFrameDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200()Ljava/lang/ThreadLocal;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lcom/android/animation/ValueAnimator;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-wide v0, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Lcom/android/animation/ValueAnimator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;->startAnimation()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500()Ljava/lang/ThreadLocal;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sReadyAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600()Ljava/lang/ThreadLocal;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sEndingAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Lcom/android/animation/ValueAnimator;J)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0, p1, p2}, Lcom/android/animation/ValueAnimator;->delayedAnimationFrame(J)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$802(Lcom/android/animation/ValueAnimator;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iput-boolean p1, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(Lcom/android/animation/ValueAnimator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;->endAnimation()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clearAllAnimations()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1249
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1250
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1251
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sDelayedAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private delayedAnimationFrame(J)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1071
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Lcom/android/animation/ValueAnimator;->mStartedDelay:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1072
a=0;//     iput-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mStartedDelay:Z
a=0;// 
a=0;//     .line 1073
a=0;//     iput-wide p1, p0, Lcom/android/animation/ValueAnimator;->mDelayStartTime:J
a=0;// 
a=0;//     .line 1084
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 1075
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-wide v1, p0, Lcom/android/animation/ValueAnimator;->mDelayStartTime:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long v1, p1, v1
a=0;// 
a=0;//     .line 1076
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 1079
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     sub-long v1, p1, v1
a=0;// 
a=0;//     iput-wide v1, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 1080
a=0;//     iput v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private endAnimation()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1025
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1026
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1027
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sDelayedAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1028
a=0;//     iput v3, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 1029
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1030
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1032
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 1033
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     .line 1034
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 1033
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1037
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iput-boolean v3, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     .line 1038
a=0;//     iput-boolean v3, p0, Lcom/android/animation/ValueAnimator;->mStarted:Z
a=0;// 
a=0;//     .line 1039
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getCurrentAnimationsCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1239
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFrameDelay()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 715
a=0;//     sget-wide v0, Lcom/android/animation/ValueAnimator;->sFrameDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat([F)Lcom/android/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 316
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0, p0}, Lcom/android/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 317
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt([I)Lcom/android/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 299
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0, p0}, Lcom/android/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     .line 300
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 353
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {v0, p0}, Lcom/android/animation/ValueAnimator;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 355
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofPropertyValuesHolder([Lcom/android/animation/PropertyValuesHolder;)Lcom/android/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 330
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0, p0}, Lcom/android/animation/ValueAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 331
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static setFrameDelay(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 728
a=0;//     sput-wide p0, Lcom/android/animation/ValueAnimator;->sFrameDelay:J
a=0;// 
a=0;//     .line 729
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private start(Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 917
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 918
a=0;//     new-instance v0, Landroid/util/AndroidRuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/AndroidRuntimeException;);
a=0;//     const-string v1, "Animators may only be run on Looper threads"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/AndroidRuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 920
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-boolean p1, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     .line 921
a=0;//     iput v3, p0, Lcom/android/animation/ValueAnimator;->mCurrentIteration:I
a=0;// 
a=0;//     .line 922
a=0;//     iput v3, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 923
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mStarted:Z
a=0;// 
a=0;//     .line 924
a=0;//     iput-boolean v3, p0, Lcom/android/animation/ValueAnimator;->mStartedDelay:Z
a=0;// 
a=0;//     .line 925
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 926
a=0;//     iget-wide v0, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v0, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 928
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ValueAnimator;->getCurrentPlayTime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/android/animation/ValueAnimator;->setCurrentPlayTime(J)V
a=0;// 
a=0;//     .line 929
a=0;//     iput v3, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 930
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     .line 932
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 933
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 935
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 936
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v4, :cond_1
a=0;// 
a=0;//     .line 937
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationStart(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 936
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 941
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimationHandler:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/ValueAnimator$AnimationHandler;
a=0;// 
a=0;//     .line 942
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 943
a=0;//     new-instance v0, Lcom/android/animation/ValueAnimator$AnimationHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ValueAnimator$AnimationHandler;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Lcom/android/animation/ValueAnimator$AnimationHandler;-><init>(Lcom/android/animation/ValueAnimator$1;)V
a=0;// 
a=0;//     .line 944
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator$AnimationHandler;);
a=0;//     sget-object v1, Lcom/android/animation/ValueAnimator;->sAnimationHandler:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 946
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0, v3}, Lcom/android/animation/ValueAnimator$AnimationHandler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 947
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private startAnimation()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1046
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ValueAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 1047
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1048
a=0;//     iget-wide v0, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1051
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1053
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1054
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     .line 1055
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationStart(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 1054
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1058
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addUpdateListener(Lcom/android/animation/ValueAnimator$AnimatorUpdateListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 820
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 821
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 823
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 824
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method animateValue(F)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1169
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/android/animation/ValueAnimator;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1170
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lcom/android/animation/ValueAnimator;->mCurrentFraction:F
a=0;// 
a=0;//     .line 1171
a=0;//     iget-object v1, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 1172
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 1173
a=0;//     iget-object v4, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v4=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v4, v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4, v2}, Lcom/android/animation/PropertyValuesHolder;->calculateValue(F)V
a=0;// 
a=0;//     .line 1172
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1175
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1176
a=0;//     iget-object v1, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 1177
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 1178
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/ValueAnimator$AnimatorUpdateListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/android/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Lcom/android/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 1177
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1181
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method animationFrame(J)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v5, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 1100
a=0;//     .line 1102
a=0;//     #v5=(Integer);
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1103
a=0;//     iput v2, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 1104
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mSeekTime:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v0, v3, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 1105
a=0;//     iput-wide p1, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 1112
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1143
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v2=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 1107
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);v2=(One);v3=(LongLo);v4=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mSeekTime:J
a=0;// 
a=0;//     sub-long v3, p1, v3
a=0;// 
a=0;//     iput-wide v3, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 1109
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     iput-wide v3, p0, Lcom/android/animation/ValueAnimator;->mSeekTime:J
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1115
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v0, v3, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     sub-long v3, p1, v3
a=0;// 
a=0;//     long-to-float v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-wide v3, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     long-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float v3, v0, v3
a=0;// 
a=0;//     .line 1116
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     cmpl-float v0, v3, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_9
a=0;// 
a=0;//     .line 1117
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mCurrentIteration:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v4, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v0, v4, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v0, v4, :cond_8
a=0;// 
a=0;//     .line 1119
a=0;//     :cond_2
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1120
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v4, v1
a=0;// 
a=0;//     .line 1121
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     if-ge v4, v6, :cond_4
a=0;// 
a=0;//     .line 1122
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationRepeat(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     .line 1121
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v3=(LongLo);v4=(LongHi);v6=(LongLo);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 1115
a=0;//     #v3=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1125
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v4=(Integer);v6=(Conflicted);
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v0, v4, :cond_5
a=0;// 
a=0;//     .line 1126
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     iput-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     .line 1128
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mCurrentIteration:I
a=0;// 
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     iput v0, p0, Lcom/android/animation/ValueAnimator;->mCurrentIteration:I
a=0;// 
a=0;//     .line 1129
a=0;//     rem-float v0, v3, v5
a=0;// 
a=0;//     .line 1130
a=0;//     #v0=(Float);
a=0;//     iget-wide v2, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v6, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     add-long/2addr v2, v6
a=0;// 
a=0;//     iput-wide v2, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 1136
a=0;//     :goto_5
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 1137
a=0;//     sub-float v0, v5, v0
a=0;// 
a=0;//     .line 1139
a=0;//     :cond_6
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ValueAnimator;->animateValue(F)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Null);v2=(One);v3=(Integer);v4=(PosByte);v6=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1126
a=0;//     #v0=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1133
a=0;//     :cond_8
a=0;//     #v0=(Integer);v4=(Byte);v6=(LongLo);
a=0;//     invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Byte);v1=(Null);v4=(LongHi);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1112
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public cancel()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 958
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sDelayedAnims:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 961
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 962
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 964
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 965
a=0;//     invoke-interface {v0, p0}, Lcom/android/animation/Animator$AnimatorListener;->onAnimationCancel(Lcom/android/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 968
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;->endAnimation()V
a=0;// 
a=0;//     .line 970
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/android/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ValueAnimator;->clone()Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/android/animation/ValueAnimator;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1185
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Lcom/android/animation/Animator;->clone()Lcom/android/animation/Animator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Animator;);
a=0;//     check-cast v0, Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 1186
a=0;//     iget-object v2, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1187
a=0;//     iget-object v3, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1188
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, v0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1189
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 1190
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     .line 1191
a=0;//     iget-object v5, v0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1190
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1194
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/android/animation/ValueAnimator;->mSeekTime:J
a=0;// 
a=0;//     .line 1195
a=0;//     iput-boolean v1, v0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     .line 1196
a=0;//     iput v1, v0, Lcom/android/animation/ValueAnimator;->mCurrentIteration:I
a=0;// 
a=0;//     .line 1197
a=0;//     iput-boolean v1, v0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 1198
a=0;//     iput v1, v0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 1199
a=0;//     iput-boolean v1, v0, Lcom/android/animation/ValueAnimator;->mStartedDelay:Z
a=0;// 
a=0;//     .line 1200
a=0;//     iget-object v2, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 1201
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1202
a=0;//     array-length v3, v2
a=0;// 
a=0;//     .line 1203
a=0;//     #v3=(Integer);
a=0;//     new-array v4, v3, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v4=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     iput-object v4, v0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 1204
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4, v3}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v4, v0, Lcom/android/animation/ValueAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 1205
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 1206
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Lcom/android/animation/PropertyValuesHolder;->clone()Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1207
a=0;//     #v4=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     iget-object v5, v0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v5=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aput-object v4, v5, v1
a=0;// 
a=0;//     .line 1208
a=0;//     iget-object v5, v0, Lcom/android/animation/ValueAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/android/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1205
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1211
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ValueAnimator;->clone()Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public end()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 974
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/android/animation/ValueAnimator;->sPendingAnimations:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 976
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mStartedDelay:Z
a=0;// 
a=0;//     .line 977
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;->startAnimation()V
a=0;// 
a=0;//     .line 983
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 984
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ValueAnimator;->animateValue(F)V
a=0;// 
a=0;//     .line 988
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;->endAnimation()V
a=0;// 
a=0;//     .line 989
a=0;//     return-void
a=0;// 
a=0;//     .line 978
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 979
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ValueAnimator;->initAnimation()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 986
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ValueAnimator;->animateValue(F)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getAnimatedFraction()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1153
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mCurrentFraction:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 744
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 745
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 748
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 762
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 763
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 764
a=0;//     invoke-virtual {v0}, Lcom/android/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 767
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentPlayTime()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 557
a=0;//     :cond_0
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 559
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 524
a=0;//     iget-wide v0, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterpolator()Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 878
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRepeatCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 789
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRepeatMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 809
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mRepeatMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getStartDelay()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     iget-wide v0, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getValues()[Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method initAnimation()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 492
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v2, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Lcom/android/animation/PropertyValuesHolder;->init()V
a=0;// 
a=0;//     .line 492
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 495
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 497
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isRunning()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 993
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/android/animation/ValueAnimator;->mRunning:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isStarted()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 998
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public removeAllUpdateListeners()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 830
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 835
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 833
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 834
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeUpdateListener(Lcom/android/animation/ValueAnimator$AnimatorUpdateListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 851
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 847
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 848
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 849
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mUpdateListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public reverse()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1009
a=0;//     #v1=(One);
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingBackwards:Z
a=0;// 
a=0;//     .line 1010
a=0;//     iget v0, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 1011
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 1012
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v2, v0, v2
a=0;// 
a=0;//     .line 1013
a=0;//     iget-wide v4, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v2, v4, v2
a=0;// 
a=0;//     .line 1014
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 1018
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1009
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/android/animation/ValueAnimator;->start(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentPlayTime(J)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ValueAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 539
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 540
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget v2, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     .line 541
a=0;//     iput-wide p1, p0, Lcom/android/animation/ValueAnimator;->mSeekTime:J
a=0;// 
a=0;//     .line 542
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, p0, Lcom/android/animation/ValueAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 544
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     sub-long v2, v0, p1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/android/animation/ValueAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 545
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/android/animation/ValueAnimator;->animationFrame(J)Z
a=0;// 
a=0;//     .line 546
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/android/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/android/animation/ValueAnimator;->setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 511
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Animators cannot have negative duration: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
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
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);
a=0;//     iput-wide p1, p0, Lcom/android/animation/ValueAnimator;->mDuration:J
a=0;// 
a=0;//     .line 515
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 898
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 899
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 901
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 401
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 412
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 404
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 405
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p1}, Lcom/android/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ValueAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 411
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 407
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     .line 408
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setFloatValues([F)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 373
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 384
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 376
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 377
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p1}, Lcom/android/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ValueAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 383
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iput-boolean v2, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 379
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     .line 380
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setIntValues([I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 865
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 866
a=0;//     iput-object p1, p0, Lcom/android/animation/ValueAnimator;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 870
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 868
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setObjectValues([Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 433
a=0;//     #v3=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 445
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 436
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 437
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v1, v0, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     invoke-static {v2, v0, p1}, Lcom/android/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v1, v3
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/android/animation/ValueAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 444
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean v3, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 440
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     .line 441
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setRepeatCount(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 780
a=0;//     iput p1, p0, Lcom/android/animation/ValueAnimator;->mRepeatCount:I
a=0;// 
a=0;//     .line 781
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRepeatMode(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 800
a=0;//     iput p1, p0, Lcom/android/animation/ValueAnimator;->mRepeatMode:I
a=0;// 
a=0;//     .line 801
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStartDelay(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 702
a=0;//     iput-wide p1, p0, Lcom/android/animation/ValueAnimator;->mStartDelay:J
a=0;// 
a=0;//     .line 703
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 456
a=0;//     #v1=(Null);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     .line 457
a=0;//     #v2=(Integer);
a=0;//     iput-object p1, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 458
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/animation/ValueAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 459
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 460
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     .line 461
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/android/animation/ValueAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 459
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 464
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-boolean v1, p0, Lcom/android/animation/ValueAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 465
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 951
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/android/animation/ValueAnimator;->start(Z)V
a=0;// 
a=0;//     .line 952
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1256
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "ValueAnimator@"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1257
a=0;//     iget-object v0, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1258
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 1259
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\n    "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/animation/ValueAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Lcom/android/animation/PropertyValuesHolder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1258
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1262
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
}}
