package com.android.animation; class FloatEvaluator { void a() { int a;
a=0;// .class public Lcom/android/animation/FloatEvaluator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/animation/FloatEvaluator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public evaluate(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v1, v0
a=0;// 
a=0;//     mul-float/2addr v1, p1
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     check-cast p2, Ljava/lang/Number;
a=0;// 
a=0;//     check-cast p3, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/android/animation/FloatEvaluator;->evaluate(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     return-object v0
a=0;// .end method
}}
