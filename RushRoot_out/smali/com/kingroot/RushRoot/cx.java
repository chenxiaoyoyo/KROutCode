package com.kingroot.RushRoot; class cx { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/cx;
a=0;// .super Lcom/kingroot/RushRoot/dg;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/dg;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/cx;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cx;->b()V
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/RushRoot/da;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 33
a=0;//     const-wide/16 v1, 0xfa
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/cy;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/cy;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/kingroot/RushRoot/cy;-><init>(Lcom/kingroot/RushRoot/cx;Lcom/kingroot/RushRoot/da;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/cy;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cx;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/db;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 54
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/cz;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/cz;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/kingroot/RushRoot/cz;-><init>(Lcom/kingroot/RushRoot/cx;Lcom/kingroot/RushRoot/db;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/cz;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cx;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cx;->j()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cx;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
}}
