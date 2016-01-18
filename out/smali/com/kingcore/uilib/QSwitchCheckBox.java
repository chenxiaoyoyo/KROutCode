package com.kingcore.uilib; class QSwitchCheckBox { void a() { int a;
a=0;// .class public Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// .super Lcom/kingcore/uilib/QCompoundButton;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bN:F
a=0;// 
a=0;// .field private bO:I
a=0;// 
a=0;// .field private bP:Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;// .field private bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private bR:I
a=0;// 
a=0;// .field private bS:I
a=0;// 
a=0;// .field private bT:I
a=0;// 
a=0;// .field private bU:F
a=0;// 
a=0;// .field private bV:F
a=0;// 
a=0;// .field private bW:F
a=0;// 
a=0;// .field private bX:I
a=0;// 
a=0;// .field private bY:I
a=0;// 
a=0;// .field private bZ:F
a=0;// 
a=0;// .field private ca:F
a=0;// 
a=0;// .field private cb:F
a=0;// 
a=0;// .field private cc:F
a=0;// 
a=0;// .field private cd:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private ce:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private cf:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private cg:I
a=0;// 
a=0;// .field private ch:F
a=0;// 
a=0;// .field private ci:F
a=0;// 
a=0;// .field private cj:I
a=0;// 
a=0;// .field private ck:F
a=0;// 
a=0;// .field private cl:F
a=0;// 
a=0;// .field private cm:Z
a=0;// 
a=0;// .field private cn:I
a=0;// 
a=0;// .field private co:Lcom/kingroot/kinguser/br;
a=0;// 
a=0;// .field private cp:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// .field private mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     const-class v0, Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingcore/uilib/QSwitchCheckBox;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 118
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 128
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cm:Z
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bo;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/bo;-><init>(Lcom/kingcore/uilib/QSwitchCheckBox;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bo;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bs;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/bs;-><init>()V
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bs;);
a=0;//     iput p2, v0, Lcom/kingroot/kinguser/bs;->cx:I
a=0;// 
a=0;//     .line 162
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingcore/uilib/QSwitchCheckBox;->a(Landroid/content/Context;Lcom/kingroot/kinguser/bs;)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingcore/uilib/QCompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 118
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 128
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cm:Z
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bo;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/bo;-><init>(Lcom/kingcore/uilib/QSwitchCheckBox;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bo;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 185
a=0;//     invoke-static {p1, p2}, Lcom/kingroot/kinguser/bs;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingcore/uilib/QSwitchCheckBox;->a(Landroid/content/Context;Lcom/kingroot/kinguser/bs;)V
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/kingroot/kinguser/bs;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 118
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 128
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cm:Z
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bo;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/bo;-><init>(Lcom/kingcore/uilib/QSwitchCheckBox;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bo;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingcore/uilib/QSwitchCheckBox;->a(Landroid/content/Context;Lcom/kingroot/kinguser/bs;)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lcom/kingroot/kinguser/bs;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 191
a=0;//     #v8=(Integer);
a=0;//     iput-object p2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bP:Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;//     .line 200
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cf:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cf:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cf:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p2, Lcom/kingroot/kinguser/bs;->cA:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cj:I
a=0;// 
a=0;//     .line 216
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     iget v1, p2, Lcom/kingroot/kinguser/bs;->cx:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bS:I
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bT:I
a=0;// 
a=0;//     .line 221
a=0;//     const/high16 v0, 0x42180000    # 38.0f
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/kinguser/wg;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     .line 222
a=0;//     const/high16 v0, 0x41600000    # 14.0f
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/kinguser/wg;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 223
a=0;//     const/high16 v1, 0x41700000    # 15.0f
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcom/kingroot/kinguser/wg;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bO:I
a=0;// 
a=0;//     .line 225
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v1, v8
a=0;// 
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bZ:F
a=0;// 
a=0;//     .line 227
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v1, v8
a=0;// 
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ca:F
a=0;// 
a=0;//     .line 228
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ca:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cb:F
a=0;// 
a=0;//     .line 229
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cb:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ca:F
a=0;// 
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v1, v8
a=0;// 
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cc:F
a=0;// 
a=0;//     .line 235
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bU:F
a=0;// 
a=0;//     .line 236
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 237
a=0;//     #v1=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bX:I
a=0;// 
a=0;//     .line 238
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bY:I
a=0;// 
a=0;//     .line 240
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bT:I
a=0;// 
a=0;//     sub-int/2addr v2, v0
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v2, v8
a=0;// 
a=0;//     .line 241
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v3, v2
a=0;// 
a=0;//     iput v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bV:F
a=0;// 
a=0;//     .line 242
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bV:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bW:F
a=0;// 
a=0;//     .line 245
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bU:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bS:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 246
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bS:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v3
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v5, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget v6, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bX:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bY:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5, v3, v6, v4, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 250
a=0;//     new-instance v3, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/RectF;);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bU:F
a=0;// 
a=0;//     add-float/2addr v4, v2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bV:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     add-float/2addr v6, v2
a=0;// 
a=0;//     iget v7, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bW:F
a=0;// 
a=0;//     invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cd:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 252
a=0;//     new-instance v3, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/RectF;);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v0, v4, v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bV:F
a=0;// 
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bW:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v3, v0, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ce:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 258
a=0;//     iget v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const v1, 0x3fb8e38e
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     .line 260
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bS:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v0
a=0;// 
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     div-float/2addr v1, v8
a=0;// 
a=0;//     .line 261
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float v2, v0, v2
a=0;// 
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ck:F
a=0;// 
a=0;//     .line 263
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     .line 274
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/view/MotionEvent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 467
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V
a=0;// 
a=0;//     .line 468
a=0;//     invoke-super {p0, v0}, Lcom/kingcore/uilib/QCompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 470
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(FF)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 380
a=0;//     iget v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     .line 381
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bU:F
a=0;// 
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     .line 382
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bS:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float/2addr v2, v1
a=0;// 
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     .line 383
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     .line 384
a=0;//     #v3=(Float);
a=0;//     cmpl-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     cmpg-float v1, p1, v2
a=0;// 
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     cmpl-float v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     cmpg-float v0, p2, v3
a=0;// 
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Float);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private af()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ck:F
a=0;// 
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/view/MotionEvent;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cg:I
a=0;// 
a=0;//     .line 481
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 483
a=0;//     :goto_0
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/QSwitchCheckBox;->a(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 484
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 486
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V
a=0;// 
a=0;//     .line 488
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 489
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cj:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_3
a=0;// 
a=0;//     .line 490
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     cmpl-float v0, v0, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 495
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-direct {p0, v0}, Lcom/kingcore/uilib/QSwitchCheckBox;->h(Z)V
a=0;// 
a=0;//     .line 502
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     .line 503
a=0;//     invoke-virtual {p0, v1}, Lcom/kingcore/uilib/QSwitchCheckBox;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cp:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 505
a=0;//     invoke-virtual {p0, v2}, Lcom/kingcore/uilib/QSwitchCheckBox;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 506
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cp:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
a=0;// 
a=0;//     .line 509
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 481
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v3=(Boolean);v4=(Null);v5=(Float);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 490
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 492
a=0;//     :cond_3
a=0;//     #v0=(Float);v4=(Byte);
a=0;//     invoke-direct {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->af()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     move v0, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private h(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 526
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ck:F
a=0;// 
a=0;//     .line 529
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cm:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 530
a=0;//     iput-boolean v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cm:Z
a=0;// 
a=0;//     .line 531
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     .line 535
a=0;//     invoke-virtual {p0, v2}, Lcom/kingcore/uilib/QSwitchCheckBox;->setEnabled(Z)V
a=0;// 
a=0;//     .line 536
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->co:Lcom/kingroot/kinguser/br;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/br;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 537
a=0;//     new-instance v1, Lcom/kingroot/kinguser/bp;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/bp;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/kingroot/kinguser/bp;-><init>(Lcom/kingcore/uilib/QSwitchCheckBox;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/bp;);
a=0;//     iput-object v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->co:Lcom/kingroot/kinguser/br;
a=0;// 
a=0;//     .line 560
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     .line 561
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->invalidate()V
a=0;// 
a=0;//     .line 562
a=0;//     return-void
a=0;// 
a=0;//     .line 526
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     .line 557
a=0;//     invoke-virtual {p0, p1}, Lcom/kingcore/uilib/QSwitchCheckBox;->i(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 587
a=0;//     invoke-super {p0}, Lcom/kingcore/uilib/QCompoundButton;->drawableStateChanged()V
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 591
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->invalidate()V
a=0;// 
a=0;//     .line 592
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public i(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     invoke-super {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 575
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     invoke-super/range {p0 .. p1}, Lcom/kingcore/uilib/QCompoundButton;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 311
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     iget v4, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bZ:F
a=0;// 
a=0;//     .line 312
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bV:F
a=0;// 
a=0;//     .line 313
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bW:F
a=0;// 
a=0;//     .line 314
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->ca:F
a=0;// 
a=0;//     .line 315
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cb:F
a=0;// 
a=0;//     .line 316
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cf:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 317
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->ck:F
a=0;// 
a=0;//     .line 318
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     .line 322
a=0;//     #v13=(Integer);
a=0;//     if-gez v13, :cond_3
a=0;// 
a=0;//     .line 323
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-float/2addr v7, v8
a=0;// 
a=0;//     #v7=(Float);
a=0;//     sub-float/2addr v1, v7
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move v14, v1
a=0;// 
a=0;//     .line 330
a=0;//     :goto_0
a=0;//     #v7=(Integer);v14=(Float);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 331
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bO:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bN:F
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v7}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 334
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bP:Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/bs;);
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/bs;->cz:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 335
a=0;//     add-float/2addr v4, v14
a=0;// 
a=0;//     .line 336
a=0;//     #v4=(Float);
a=0;//     cmpg-float v1, v2, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     .line 337
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 338
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cd:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/RectF;);
a=0;//     const/high16 v9, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/high16 v10, 0x43340000    # 180.0f
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move-object/from16 v7, p1
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Canvas;);
a=0;//     move-object v12, v6
a=0;// 
a=0;//     #v12=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bP:Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/bs;);
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/bs;->cA:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 343
a=0;//     cmpg-float v1, v4, v15
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     move-object/from16 v7, p1
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Canvas;);
a=0;//     move v8, v4
a=0;// 
a=0;//     #v8=(Float);
a=0;//     move v9, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v10, v15
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v11, v5
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-object v12, v6
a=0;// 
a=0;//     .line 344
a=0;//     #v12=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 345
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->ce:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/RectF;);
a=0;//     const/high16 v3, 0x43870000    # 270.0f
a=0;// 
a=0;//     const/high16 v4, 0x43340000    # 180.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 356
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v1}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 362
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->bQ:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 363
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 366
a=0;//     if-lez v13, :cond_5
a=0;// 
a=0;//     .line 367
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-wide/16 v3, 0x14
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     .line 374
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 325
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Integer);v3=(Integer);v4=(Integer);v7=(Integer);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     cmpl-float v1, v1, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     move v1, v13
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, v7
a=0;// 
a=0;//     const/high16 v8, 0x40a00000    # 5.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-float/2addr v1, v8
a=0;// 
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     div-float/2addr v7, v8
a=0;// 
a=0;//     #v7=(Float);
a=0;//     sub-float/2addr v1, v7
a=0;// 
a=0;//     .line 326
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v7, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->cn:I
a=0;// 
a=0;//     move v14, v1
a=0;// 
a=0;//     #v14=(Float);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     :cond_4
a=0;//     #v1=(Byte);v8=(Null);v14=(Uninit);
a=0;//     rsub-int/lit8 v1, v13, 0x5
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 369
a=0;//     :cond_5
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->co:Lcom/kingroot/kinguser/br;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 370
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->co:Lcom/kingroot/kinguser/br;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/kingroot/kinguser/br;->onAnimationEnd()V
a=0;// 
a=0;//     .line 371
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingcore/uilib/QSwitchCheckBox;->co:Lcom/kingroot/kinguser/br;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     invoke-super/range {p0 .. p5}, Lcom/kingcore/uilib/QCompoundButton;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 305
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMeasure(II)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 283
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1, p2}, Lcom/kingcore/uilib/QCompoundButton;->onMeasure(II)V
a=0;// 
a=0;//     .line 285
a=0;//     iget v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bR:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bO:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 286
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 288
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v1, v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bN:F
a=0;// 
a=0;//     .line 289
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bN:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     iput v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bN:F
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingcore/uilib/QSwitchCheckBox;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 393
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->isEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 394
a=0;//     invoke-super {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 396
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->ae()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 398
a=0;//     invoke-super {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 400
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 401
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     .line 402
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 404
a=0;//     :pswitch_1
a=0;//     #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 405
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 406
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->isEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-direct {p0, v1, v2}, Lcom/kingcore/uilib/QSwitchCheckBox;->a(FF)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 407
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cg:I
a=0;// 
a=0;//     .line 408
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ch:F
a=0;// 
a=0;//     .line 409
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ci:F
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 415
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cg:I
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 421
a=0;//     :pswitch_3
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 422
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 423
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ch:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_4
a=0;// 
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ci:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v2, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mTouchSlop:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 425
a=0;//     :cond_4
a=0;//     iput v5, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cg:I
a=0;// 
a=0;//     .line 426
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewParent;);
a=0;//     invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 427
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ch:F
a=0;// 
a=0;//     .line 428
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ci:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 435
a=0;//     :pswitch_4
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 436
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ch:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float v2, v1, v2
a=0;// 
a=0;//     .line 437
a=0;//     #v2=(Float);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-float/2addr v2, v4
a=0;// 
a=0;//     iget v4, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ck:F
a=0;// 
a=0;//     invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 439
a=0;//     iget v3, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     cmpl-float v3, v2, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     iput v2, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cl:F
a=0;// 
a=0;//     .line 441
a=0;//     iput v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->ch:F
a=0;// 
a=0;//     .line 442
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->invalidate()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 452
a=0;//     :pswitch_5
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget v1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cg:I
a=0;// 
a=0;//     if-ne v1, v5, :cond_5
a=0;// 
a=0;//     .line 453
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/QSwitchCheckBox;->b(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 456
a=0;//     :cond_5
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cg:I
a=0;// 
a=0;//     .line 457
a=0;//     iget-object v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 402
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_2
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 415
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     invoke-virtual {p0}, Lcom/kingcore/uilib/QSwitchCheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 569
a=0;//     invoke-direct {p0, p1}, Lcom/kingcore/uilib/QSwitchCheckBox;->h(Z)V
a=0;// 
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     invoke-super {p0, p1}, Lcom/kingcore/uilib/QCompoundButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 516
a=0;//     iput-object p1, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cp:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 517
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toggle()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 641
a=0;//     iget-boolean v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->bM:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 642
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QSwitchCheckBox;->cm:Z
a=0;// 
a=0;//     .line 643
a=0;//     invoke-super {p0}, Lcom/kingcore/uilib/QCompoundButton;->toggle()V
a=0;// 
a=0;//     .line 645
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
}}
