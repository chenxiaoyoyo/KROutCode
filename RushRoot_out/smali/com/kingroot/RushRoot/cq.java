package com.kingroot.RushRoot; class cq { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/cq;
a=0;// .super Lcom/kingroot/RushRoot/dg;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/dg;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/cq;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/RushRoot/ct;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0xfa
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 25
a=0;//     #v1=(One);
a=0;//     new-instance v9, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-direct {v9, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     .line 27
a=0;//     #v9=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     const v6, 0x3f333333    # 0.7f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V
a=0;// 
a=0;//     .line 30
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {v0, v10, v11}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v3, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v2, v4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     .line 34
a=0;//     #v3=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-virtual {v3, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {v3, v10, v11}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v1, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v9, v1}, Landroid/view/animation/AnimationSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v9, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/cr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/cr;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/RushRoot/cr;-><init>(Lcom/kingroot/RushRoot/cq;Lcom/kingroot/RushRoot/ct;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/cr;);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cq;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/cu;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v9, 0x96
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const/high16 v8, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 58
a=0;//     #v1=(One);
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move v6, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {v0, v9, v10}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v3, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v3, v8, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     .line 65
a=0;//     #v3=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-virtual {v3, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {v3, v9, v10}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v2, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-direct {v2, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     .line 69
a=0;//     #v2=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v2, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/cs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/cs;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/RushRoot/cs;-><init>(Lcom/kingroot/RushRoot/cq;Lcom/kingroot/RushRoot/cu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/cs;);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cq;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
}}
