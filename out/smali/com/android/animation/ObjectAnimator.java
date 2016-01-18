package com.android.animation; class ObjectAnimator { void a() { int a;
a=0;// .class public final Lcom/android/animation/ObjectAnimator;
a=0;// .super Lcom/android/animation/ValueAnimator;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DBG:Z
a=0;// 
a=0;// .field private static final PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mProperty:Lcom/android/util/Property;
a=0;// 
a=0;// .field private mPropertyName:Ljava/lang/String;
a=0;// 
a=0;// .field private mTarget:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     .line 50
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "alpha"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vQ:Lcom/android/util/Property;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/util/Property;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 51
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "pivotX"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vR:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "pivotY"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vS:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 53
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "translationX"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vT:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "translationY"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vU:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 55
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "rotation"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vV:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 56
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "rotationX"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vW:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "rotationY"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vX:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 58
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scaleX"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vY:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 59
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scaleY"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->vZ:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 60
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scrollX"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->wa:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 61
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scrollY"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->wb:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 62
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "x"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->wc:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 63
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "y"
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/wy;->wd:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 149
a=0;//     #p0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Object;Lcom/android/util/Property;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 172
a=0;//     #p0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     iput-object p1, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {p0, p2}, Lcom/android/animation/ObjectAnimator;->setProperty(Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     invoke-direct {p0}, Lcom/android/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 161
a=0;//     #p0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     iput-object p1, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {p0, p2}, Lcom/android/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/Object;Lcom/android/util/Property;[F)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 249
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/ObjectAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 250
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 230
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/ObjectAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 231
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/Object;Lcom/android/util/Property;[I)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 210
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/ObjectAnimator;->setIntValues([I)V
a=0;// 
a=0;//     .line 211
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 192
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/ObjectAnimator;->setIntValues([I)V
a=0;// 
a=0;//     .line 193
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/Object;Lcom/android/util/Property;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 296
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p3}, Lcom/android/animation/ObjectAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/ObjectAnimator;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 298
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/Object;Ljava/lang/String;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 273
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p3}, Lcom/android/animation/ObjectAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/ObjectAnimator;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 275
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofPropertyValuesHolder(Ljava/lang/Object;[Lcom/android/animation/PropertyValuesHolder;)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     new-instance v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/ObjectAnimator;-><init>()V
a=0;// 
a=0;//     .line 321
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     iput-object p0, v0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 322
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 323
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method animateValue(F)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     invoke-super {p0, p1}, Lcom/android/animation/ValueAnimator;->animateValue(F)V
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 491
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/android/animation/PropertyValuesHolder;->setAnimatedValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 491
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 494
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/android/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ObjectAnimator;->clone()Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     invoke-super {p0}, Lcom/android/animation/ValueAnimator;->clone()Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ValueAnimator;);
a=0;//     check-cast v0, Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 499
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/android/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ObjectAnimator;->clone()Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ObjectAnimator;->clone()Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPropertyName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTarget()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method initAnimation()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iget-boolean v0, p0, Lcom/android/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/wu;->vx:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 404
a=0;//     sget-object v0, Lcom/android/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ObjectAnimator;->setProperty(Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 407
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/android/animation/PropertyValuesHolder;->setupSetterAndGetter(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 407
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 410
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-super {p0}, Lcom/android/animation/ValueAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 412
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/android/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/android/animation/ObjectAnimator;->setDuration(J)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/android/animation/ObjectAnimator;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     invoke-super {p0, p1, p2}, Lcom/android/animation/ValueAnimator;->setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;// 
a=0;//     .line 426
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/android/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/android/animation/ObjectAnimator;->setDuration(J)Lcom/android/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 343
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 346
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 347
a=0;//     new-array v0, v1, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/util/Property;);
a=0;//     invoke-static {v1, p1}, Lcom/android/animation/PropertyValuesHolder;->ofFloat(Lcom/android/util/Property;[F)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 354
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 349
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/android/util/Property;);v1=(One);
a=0;//     new-array v0, v1, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p1}, Lcom/android/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-super {p0, p1}, Lcom/android/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 328
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     new-array v0, v1, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/util/Property;);
a=0;//     invoke-static {v1, p1}, Lcom/android/animation/PropertyValuesHolder;->ofInt(Lcom/android/util/Property;[I)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 339
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 334
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/android/util/Property;);v1=(One);
a=0;//     new-array v0, v1, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p1}, Lcom/android/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-super {p0, p1}, Lcom/android/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setObjectValues([Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 358
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 361
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/util/Property;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 362
a=0;//     new-array v1, v2, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/util/Property;);
a=0;//     check-cast v0, Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     invoke-static {v2, v0, p1}, Lcom/android/animation/PropertyValuesHolder;->ofObject(Lcom/android/util/Property;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v1, v3
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 369
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 364
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Lcom/android/util/Property;);v2=(One);
a=0;//     new-array v1, v2, [Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     check-cast v0, Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     invoke-static {v2, v0, p1}, Lcom/android/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v1, v3
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/android/animation/ObjectAnimator;->setValues([Lcom/android/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 367
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Integer);v2=(One);
a=0;//     invoke-super {p0, p1}, Lcom/android/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setProperty(Lcom/android/util/Property;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 119
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setProperty(Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {p1}, Lcom/android/util/Property;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     iput-object p1, p0, Lcom/android/animation/ObjectAnimator;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     .line 128
a=0;//     iput-boolean v3, p0, Lcom/android/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPropertyName(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     .line 96
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 97
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/android/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 103
a=0;//     iput-boolean v3, p0, Lcom/android/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTarget(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 446
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 448
a=0;//     iput-object p1, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 449
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 455
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 453
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupEndValues()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ObjectAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 469
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 470
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/android/animation/PropertyValuesHolder;->setupEndValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 470
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 473
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setupStartValues()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     invoke-virtual {p0}, Lcom/android/animation/ObjectAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 461
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/android/animation/PropertyValuesHolder;->setupStartValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 461
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 464
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     invoke-super {p0}, Lcom/android/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     .line 384
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 504
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "ObjectAnimator@"
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
a=0;//     const-string v1, ", target "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 506
a=0;//     iget-object v0, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 507
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/PropertyValuesHolder;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 508
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
a=0;//     iget-object v2, p0, Lcom/android/animation/ObjectAnimator;->mValues:[Lcom/android/animation/PropertyValuesHolder;
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
a=0;//     .line 507
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 511
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
}}
