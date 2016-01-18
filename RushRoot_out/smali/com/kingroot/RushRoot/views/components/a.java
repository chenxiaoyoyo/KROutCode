package com.kingroot.RushRoot.views.components; class a { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/views/components/a;
a=0;// .super Landroid/view/animation/Animation;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Z
a=0;// 
a=0;// .field private static final b:Ljava/util/WeakHashMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// .field private final d:Landroid/graphics/Camera;
a=0;// 
a=0;// .field private e:Z
a=0;// 
a=0;// .field private f:F
a=0;// 
a=0;// .field private g:F
a=0;// 
a=0;// .field private h:F
a=0;// 
a=0;// .field private i:F
a=0;// 
a=0;// .field private j:F
a=0;// 
a=0;// .field private k:F
a=0;// 
a=0;// .field private l:F
a=0;// 
a=0;// .field private m:F
a=0;// 
a=0;// .field private n:F
a=0;// 
a=0;// .field private o:F
a=0;// 
a=0;// .field private final p:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private final q:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private final r:Landroid/graphics/Matrix;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
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
a=0;//     sput-boolean v0, Lcom/kingroot/RushRoot/views/components/a;->a:Z
a=0;// 
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/views/components/a;->b:Ljava/util/WeakHashMap;
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
a=0;// .method private constructor <init>(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/a;);
a=0;//     new-instance v0, Landroid/graphics/Camera;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Camera;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Camera;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->d:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 50
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/views/components/a;->f:F
a=0;// 
a=0;//     .line 56
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/views/components/a;->l:F
a=0;// 
a=0;//     .line 57
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/views/components/a;->m:F
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->p:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->q:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->r:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 66
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/views/components/a;->setDuration(J)V
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/a;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/View;)Lcom/kingroot/RushRoot/views/components/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/views/components/a;->b:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/views/components/a;
a=0;// 
a=0;//     .line 39
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/a;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/views/components/a;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/a;);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/a;->b:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 43
a=0;//     :cond_1
a=0;//     return-object v0
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
a=0;//     .line 308
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     .line 309
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     .line 310
a=0;//     #v3=(Float);
a=0;//     iget-boolean v4, p0, Lcom/kingroot/RushRoot/views/components/a;->e:Z
a=0;// 
a=0;//     .line 311
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/a;->g:F
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 312
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/a;->h:F
a=0;// 
a=0;//     .line 314
a=0;//     :goto_1
a=0;//     iget v4, p0, Lcom/kingroot/RushRoot/views/components/a;->i:F
a=0;// 
a=0;//     .line 315
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/views/components/a;->j:F
a=0;// 
a=0;//     .line 316
a=0;//     iget v6, p0, Lcom/kingroot/RushRoot/views/components/a;->k:F
a=0;// 
a=0;//     .line 317
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
a=0;//     .line 318
a=0;//     :cond_0
a=0;//     iget-object v7, p0, Lcom/kingroot/RushRoot/views/components/a;->d:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 319
a=0;//     #v7=(Reference,Landroid/graphics/Camera;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/Camera;->save()V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v7, v4}, Landroid/graphics/Camera;->rotateX(F)V
a=0;// 
a=0;//     .line 321
a=0;//     invoke-virtual {v7, v5}, Landroid/graphics/Camera;->rotateY(F)V
a=0;// 
a=0;//     .line 322
a=0;//     neg-float v4, v6
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v7, v4}, Landroid/graphics/Camera;->rotateZ(F)V
a=0;// 
a=0;//     .line 323
a=0;//     invoke-virtual {v7, p1}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 324
a=0;//     invoke-virtual {v7}, Landroid/graphics/Camera;->restore()V
a=0;// 
a=0;//     .line 325
a=0;//     neg-float v4, v1
a=0;// 
a=0;//     neg-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Matrix;->preTranslate(FF)Z
a=0;// 
a=0;//     .line 326
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 329
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Integer);v7=(Conflicted);
a=0;//     iget v4, p0, Lcom/kingroot/RushRoot/views/components/a;->l:F
a=0;// 
a=0;//     .line 330
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/views/components/a;->m:F
a=0;// 
a=0;//     .line 331
a=0;//     cmpl-float v6, v4, v9
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     cmpl-float v6, v5, v9
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 332
a=0;//     :cond_2
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 333
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
a=0;//     .line 334
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
a=0;//     .line 335
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 338
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v4=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/a;->n:F
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/a;->o:F
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 339
a=0;//     return-void
a=0;// 
a=0;//     .line 311
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
a=0;//     .line 312
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
a=0;//     .line 280
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     .line 281
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 285
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->r:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 288
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V
a=0;// 
a=0;//     .line 289
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/views/components/a;->a(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->r:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
a=0;// 
a=0;//     .line 292
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
a=0;//     .line 295
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
a=0;//     .line 296
a=0;//     iget v0, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 297
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     iput v1, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 298
a=0;//     iput v0, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     .line 300
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
a=0;//     .line 301
a=0;//     iget v0, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 302
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     iput v1, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 303
a=0;//     iput v0, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(F)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/views/components/a;->o:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/a;->p:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/RushRoot/views/components/a;->a(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 221
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/views/components/a;->o:F
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 224
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Reference,Landroid/view/ViewParent;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/a;->q:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/RushRoot/views/components/a;->a(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/a;->p:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V
a=0;// 
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
a=0;// .method protected final applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/a;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 344
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 345
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/views/components/a;->f:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/animation/Transformation;->setAlpha(F)V
a=0;// 
a=0;//     .line 346
a=0;//     invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/RushRoot/views/components/a;->a(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
