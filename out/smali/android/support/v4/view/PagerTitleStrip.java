package android.support.v4.view; class PagerTitleStrip { void a() { int a;
a=0;// .class public Landroid/support/v4/view/PagerTitleStrip;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$Decor;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTRS:[I
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;// .field private static final SIDE_ALPHA:F = 0.6f
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "PagerTitleStrip"
a=0;// 
a=0;// .field private static final TEXT_ATTRS:[I
a=0;// 
a=0;// .field private static final TEXT_SPACING:I = 0x10
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mGravity:I
a=0;// 
a=0;// .field private mLastKnownCurrentPage:I
a=0;// 
a=0;// .field private mLastKnownPositionOffset:F
a=0;// 
a=0;// .field mNextText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mNonPrimaryAlpha:I
a=0;// 
a=0;// .field private final mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;// .field mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// .field mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mScaledTextSpacing:I
a=0;// 
a=0;// .field mTextColor:I
a=0;// 
a=0;// .field private mUpdatingPositions:Z
a=0;// 
a=0;// .field private mUpdatingText:Z
a=0;// 
a=0;// .field private mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->ATTRS:[I
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x101038c
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->TEXT_ATTRS:[I
a=0;// 
a=0;//     .line 100
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;);
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1010034
a=0;//         0x1010095
a=0;//         0x1010098
a=0;//         0x10100af
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 113
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     .line 54
a=0;//     const/high16 v1, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v1, Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v4/view/PagerTitleStrip$PageListener;-><init>(Landroid/support/v4/view/PagerTitleStrip;Landroid/support/v4/view/PagerTitleStrip$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 122
a=0;//     sget-object v1, Landroid/support/v4/view/PagerTitleStrip;->ATTRS:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 124
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v3, p1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, p1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, p1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 130
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p0, v0, v3}, Landroid/support/v4/view/PagerTitleStrip;->setTextSize(IF)V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v1, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 135
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v4, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v4, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 139
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0x50
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     .line 143
a=0;//     const v1, 0x3f19999a    # 0.6f
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/PagerTitleStrip;->setNonPrimaryAlpha(F)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/TextUtils$TruncateAt;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 150
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 151
a=0;//     sget-object v1, Landroid/support/v4/view/PagerTitleStrip;->TEXT_ATTRS:[I
a=0;// 
a=0;//     invoke-virtual {p1, v2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 153
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_3
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {v0}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
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
a=0;//     .line 167
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/view/PagerTitleStrip;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getMinHeight()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 463
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 464
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 467
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTextSpacing()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 245
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     instance-of v1, v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "PagerTitleStrip must be a direct child of a ViewPager."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 253
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;// 
a=0;//     .line 255
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 257
a=0;//     return-void
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;// 
a=0;//     .line 266
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 455
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 456
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, v1, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 457
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v1, v0, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 459
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     .line 422
a=0;//     #v8=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 423
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 424
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 425
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 427
a=0;//     #v3=(Integer);
a=0;//     if-eq v0, v9, :cond_0
a=0;// 
a=0;//     .line 428
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Must measure with an exact width"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 432
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 434
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     .line 435
a=0;//     sub-int v5, v3, v4
a=0;// 
a=0;//     .line 437
a=0;//     int-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     const v7, 0x3f4ccccd    # 0.8f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 439
a=0;//     invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v7, v6, v5}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, v6, v5}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, v6, v5}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 445
a=0;//     if-ne v1, v9, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 451
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 448
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 449
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v4
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0, v2, v0}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestLayout()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 311
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGravity(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNonPrimaryAlpha(F)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     const/high16 v0, 0x437f0000    # 255.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
a=0;// 
a=0;//     .line 194
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
a=0;// 
a=0;//     shl-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0xffffff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextColor(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 208
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shl-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0xffffff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 211
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextSize(IF)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextSpacing(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 318
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 320
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 322
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 324
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 325
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     .line 326
a=0;//     const/high16 v0, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, p2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
a=0;// 
a=0;//     .line 330
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/high16 v5, -0x80000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 271
a=0;//     #v1=(Null);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
a=0;// 
a=0;//     .line 275
a=0;//     if-lt p1, v2, :cond_4
a=0;// 
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 276
a=0;//     add-int/lit8 v2, p1, -0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2, v2}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 278
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v4, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     if-ge p1, v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 284
a=0;//     add-int/lit8 v2, p1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 285
a=0;//     add-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     .line 292
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const v3, 0x3f4ccccd    # 0.8f
a=0;// 
a=0;//     mul-float/2addr v0, v3
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 294
a=0;//     invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 299
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     .line 301
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(One);v3=(Null);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/CharSequence;);v4=(Reference,Landroid/widget/TextView;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 280
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(One);v4=(Uninit);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method updateTextPositions(IFZ)V
a=0;//     .locals 18
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_2
a=0;// 
a=0;//     .line 334
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
a=0;// 
a=0;//     .line 341
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 342
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 343
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 344
a=0;//     #v6=(Integer);
a=0;//     div-int/lit8 v2, v3, 0x2
a=0;// 
a=0;//     .line 346
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 347
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 348
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 349
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 350
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 351
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 352
a=0;//     #v11=(Integer);
a=0;//     add-int v12, v8, v2
a=0;// 
a=0;//     .line 353
a=0;//     #v12=(Integer);
a=0;//     add-int v13, v9, v2
a=0;// 
a=0;//     .line 354
a=0;//     #v13=(Integer);
a=0;//     sub-int v2, v7, v12
a=0;// 
a=0;//     sub-int v12, v2, v13
a=0;// 
a=0;//     .line 356
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     add-float v2, v2, p2
a=0;// 
a=0;//     .line 357
a=0;//     #v2=(Float);
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     cmpl-float v14, v2, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-lez v14, :cond_1
a=0;// 
a=0;//     .line 358
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float/2addr v2, v14
a=0;// 
a=0;//     .line 360
a=0;//     :cond_1
a=0;//     sub-int v13, v7, v13
a=0;// 
a=0;//     int-to-float v12, v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     mul-float/2addr v2, v12
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v13, v2
a=0;// 
a=0;//     .line 361
a=0;//     div-int/lit8 v12, v3, 0x2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     sub-int v12, v2, v12
a=0;// 
a=0;//     .line 362
a=0;//     add-int v13, v12, v3
a=0;// 
a=0;//     .line 364
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2}, Landroid/widget/TextView;->getBaseline()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 365
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v3}, Landroid/widget/TextView;->getBaseline()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 366
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v14=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v14}, Landroid/widget/TextView;->getBaseline()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 367
a=0;//     #v14=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 368
a=0;//     sub-int v2, v15, v2
a=0;// 
a=0;//     .line 369
a=0;//     sub-int v3, v15, v3
a=0;// 
a=0;//     .line 370
a=0;//     sub-int v14, v15, v14
a=0;// 
a=0;//     .line 371
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int/2addr v15, v2
a=0;// 
a=0;//     .line 372
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v16 .. v16}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v16, v16, v3
a=0;// 
a=0;//     .line 373
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v17 .. v17}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     add-int v17, v17, v14
a=0;// 
a=0;//     .line 374
a=0;//     invoke-static/range {v15 .. v16}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 377
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     and-int/lit8 v16, v16, 0x70
a=0;// 
a=0;//     .line 382
a=0;//     sparse-switch v16, :sswitch_data_0
a=0;// 
a=0;//     .line 385
a=0;//     add-int v4, v10, v2
a=0;// 
a=0;//     .line 386
a=0;//     add-int/2addr v3, v10
a=0;// 
a=0;//     .line 387
a=0;//     add-int v2, v10, v14
a=0;// 
a=0;//     .line 404
a=0;//     :goto_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v10, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v11}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v11, v3
a=0;// 
a=0;//     invoke-virtual {v10, v12, v3, v13, v11}, Landroid/widget/TextView;->layout(IIII)V
a=0;// 
a=0;//     .line 407
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     sub-int v3, v12, v3
a=0;// 
a=0;//     sub-int/2addr v3, v5
a=0;// 
a=0;//     invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 408
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/TextView;);
a=0;//     add-int/2addr v5, v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v10, v4
a=0;// 
a=0;//     invoke-virtual {v8, v3, v4, v5, v10}, Landroid/widget/TextView;->layout(IIII)V
a=0;// 
a=0;//     .line 411
a=0;//     sub-int v3, v7, v9
a=0;// 
a=0;//     sub-int/2addr v3, v6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     add-int/2addr v4, v13
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 413
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     add-int v5, v3, v6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v6}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v6, v2
a=0;// 
a=0;//     invoke-virtual {v4, v3, v2, v5, v6}, Landroid/widget/TextView;->layout(IIII)V
a=0;// 
a=0;//     .line 416
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iput v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 417
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
a=0;// 
a=0;//     .line 418
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Byte);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 335
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget v2, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     cmpl-float v2, p2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 390
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Integer);v9=(Integer);v10=(Integer);v11=(Integer);v12=(Integer);v13=(Integer);v14=(Integer);v15=(Integer);v16=(Integer);v17=(Integer);
a=0;//     sub-int/2addr v4, v10
a=0;// 
a=0;//     sub-int/2addr v4, v11
a=0;// 
a=0;//     .line 391
a=0;//     sub-int/2addr v4, v15
a=0;// 
a=0;//     div-int/lit8 v10, v4, 0x2
a=0;// 
a=0;//     .line 392
a=0;//     add-int v4, v10, v2
a=0;// 
a=0;//     .line 393
a=0;//     add-int/2addr v3, v10
a=0;// 
a=0;//     .line 394
a=0;//     add-int v2, v10, v14
a=0;// 
a=0;//     .line 395
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 397
a=0;//     :sswitch_1
a=0;//     sub-int/2addr v4, v11
a=0;// 
a=0;//     sub-int v10, v4, v15
a=0;// 
a=0;//     .line 398
a=0;//     add-int v4, v10, v2
a=0;// 
a=0;//     .line 399
a=0;//     add-int/2addr v3, v10
a=0;// 
a=0;//     .line 400
a=0;//     add-int v2, v10, v14
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_0
a=0;//         0x50 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
