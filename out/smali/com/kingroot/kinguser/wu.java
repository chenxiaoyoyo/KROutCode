package com.kingroot.kinguser; class wu { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/wu;
a=0;// .super Landroid/view/animation/Animation;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final vx:Z
a=0;// 
a=0;// .field private static final vy:Ljava/util/WeakHashMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAlpha:F
a=0;// 
a=0;// .field private final vA:Landroid/graphics/Camera;
a=0;// 
a=0;// .field private vB:Z
a=0;// 
a=0;// .field private vC:F
a=0;// 
a=0;// .field private vD:F
a=0;// 
a=0;// .field private vE:F
a=0;// 
a=0;// .field private vF:F
a=0;// 
a=0;// .field private vG:F
a=0;// 
a=0;// .field private vH:F
a=0;// 
a=0;// .field private vI:F
a=0;// 
a=0;// .field private vJ:F
a=0;// 
a=0;// .field private vK:F
a=0;// 
a=0;// .field private final vL:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private final vM:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private final vN:Landroid/graphics/Matrix;
a=0;// 
a=0;// .field private final vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/wu;->vx:Z
a=0;// 
a=0;//     .line 23
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/wu;->vy:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 21
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wu;);
a=0;//     new-instance v0, Landroid/graphics/Camera;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Camera;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Camera;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wu;->vA:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 48
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/wu;->mAlpha:F
a=0;// 
a=0;//     .line 54
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/wu;->vH:F
a=0;// 
a=0;//     .line 55
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/wu;->vI:F
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wu;->vL:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wu;->vM:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wu;->vN:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 64
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/wu;->setDuration(J)V
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/wu;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v9, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 281
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     .line 282
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     .line 283
a=0;//     #v3=(Float);
a=0;//     iget-boolean v4, p0, Lcom/kingroot/kinguser/wu;->vB:Z
a=0;// 
a=0;//     .line 284
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vC:F
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 285
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vD:F
a=0;// 
a=0;//     .line 287
a=0;//     :goto_1
a=0;//     iget v4, p0, Lcom/kingroot/kinguser/wu;->vE:F
a=0;// 
a=0;//     .line 288
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/kingroot/kinguser/wu;->vF:F
a=0;// 
a=0;//     .line 289
a=0;//     iget v6, p0, Lcom/kingroot/kinguser/wu;->vG:F
a=0;// 
a=0;//     .line 290
a=0;//     #v6=(Integer);
a=0;//     cmpl-float v7, v4, v8
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     cmpl-float v7, v5, v8
a=0;// 
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     cmpl-float v7, v6, v8
a=0;// 
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     iget-object v7, p0, Lcom/kingroot/kinguser/wu;->vA:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 292
a=0;//     #v7=(Reference,Landroid/graphics/Camera;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/Camera;->save()V
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v7, v4}, Landroid/graphics/Camera;->rotateX(F)V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v7, v5}, Landroid/graphics/Camera;->rotateY(F)V
a=0;// 
a=0;//     .line 295
a=0;//     neg-float v4, v6
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v7, v4}, Landroid/graphics/Camera;->rotateZ(F)V
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v7, p1}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v7}, Landroid/graphics/Camera;->restore()V
a=0;// 
a=0;//     .line 298
a=0;//     neg-float v4, v1
a=0;// 
a=0;//     neg-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Matrix;->preTranslate(FF)Z
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 302
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Integer);v7=(Conflicted);
a=0;//     iget v4, p0, Lcom/kingroot/kinguser/wu;->vH:F
a=0;// 
a=0;//     .line 303
a=0;//     iget v5, p0, Lcom/kingroot/kinguser/wu;->vI:F
a=0;// 
a=0;//     .line 304
a=0;//     cmpl-float v6, v4, v9
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     cmpl-float v6, v5, v9
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 305
a=0;//     :cond_2
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 306
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     neg-float v1, v1
a=0;// 
a=0;//     mul-float/2addr v4, v2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float v2, v4, v2
a=0;// 
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     .line 307
a=0;//     div-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     neg-float v0, v0
a=0;// 
a=0;//     mul-float v2, v5, v3
a=0;// 
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     .line 308
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 311
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v4=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vJ:F
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/wu;->vK:F
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// 
a=0;//     .line 284
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);
a=0;//     div-float v0, v2, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     div-float v0, v3, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     .line 255
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 258
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vN:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 261
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V
a=0;// 
a=0;//     .line 262
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/kinguser/wu;->a(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vN:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
a=0;// 
a=0;//     .line 265
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/graphics/RectF;->offset(FF)V
a=0;// 
a=0;//     .line 268
a=0;//     iget v0, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpg-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     iget v0, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 270
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     iput v1, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 271
a=0;//     iput v0, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     .line 273
a=0;//     :cond_0
a=0;//     iget v0, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     iget v1, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     cmpg-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 274
a=0;//     iget v0, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 275
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     iput v1, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 276
a=0;//     iput v0, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     .line 278
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static h(Landroid/view/View;)Lcom/kingroot/kinguser/wu;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-object v0, Lcom/kingroot/kinguser/wu;->vy:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wu;
a=0;// 
a=0;//     .line 37
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wu;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/wu;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wu;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/wu;->vy:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 41
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private mc()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 231
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wu;->vL:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/kinguser/wu;->a(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private md()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 237
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 241
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wu;->vM:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 242
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/kinguser/wu;->a(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wu;->vL:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     iget v2, v1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     double-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     double-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, v1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-double v4, v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     double-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v1, v1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-double v5, v1
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     double-to-int v1, v5
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3, v4, v1}, Landroid/view/View;->invalidate(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 317
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/wu;->mAlpha:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/animation/Transformation;->setAlpha(F)V
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/kinguser/wu;->a(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAlpha()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->mAlpha:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPivotX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vC:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPivotY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vD:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRotation()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vG:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRotationX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vE:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRotationY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vF:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vH:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vI:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScrollX()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 157
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getScrollY()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 170
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vJ:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vK:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getX()F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 204
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v0=(Float);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/wu;->vJ:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getY()F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 217
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     :goto_0
a=0;//     #v0=(Float);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/wu;->vK:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAlpha(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->mAlpha:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->mAlpha:F
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 77
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {v0}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPivotX(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/wu;->vB:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vC:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/wu;->vB:Z
a=0;// 
a=0;//     .line 89
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vC:F
a=0;// 
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPivotY(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/wu;->vB:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vD:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/wu;->vB:Z
a=0;// 
a=0;//     .line 100
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vD:F
a=0;// 
a=0;//     .line 101
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotation(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vG:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 110
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vG:F
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotationX(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vE:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 120
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vE:F
a=0;// 
a=0;//     .line 121
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotationY(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vF:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 131
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vF:F
a=0;// 
a=0;//     .line 132
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleX(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vH:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 141
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vH:F
a=0;// 
a=0;//     .line 142
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleY(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vI:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 151
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vI:F
a=0;// 
a=0;//     .line 152
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollX(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 164
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollY(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 177
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationX(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vJ:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 188
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vJ:F
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationY(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/wu;->vK:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->mc()V
a=0;// 
a=0;//     .line 198
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/wu;->vK:F
a=0;// 
a=0;//     .line 199
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wu;->md()V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setX(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 211
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/wu;->setTranslationX(F)V
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setY(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wu;->vz:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 224
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/wu;->setTranslationY(F)V
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
