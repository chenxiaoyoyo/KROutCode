package com.android.RushRoot.view.animation; class AccelerateDecelerateInterpolator { void a() { int a;
a=0;// .class public Lcom/android/RushRoot/view/animation/AccelerateDecelerateInterpolator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/RushRoot/view/animation/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/android/RushRoot/view/animation/AccelerateDecelerateInterpolator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/android/RushRoot/view/animation/AccelerateDecelerateInterpolator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(F)F
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x400921fb54442d18L    # Math.PI
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     const-wide/high16 v2, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     div-double/2addr v0, v2
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
}}
