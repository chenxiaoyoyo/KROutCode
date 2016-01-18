package com.kingcore.uilib; class VerticalViewPager$LayoutParams { void a() { int a;
a=0;// .class public Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;
a=0;// .super Landroid/view/ViewGroup$LayoutParams;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field childIndex:I
a=0;// 
a=0;// .field db:F
a=0;// 
a=0;// .field public gravity:I
a=0;// 
a=0;// .field public isDecor:Z
a=0;// 
a=0;// .field needsMeasure:Z
a=0;// 
a=0;// .field public position:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 2766
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 2747
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->db:F
a=0;// 
a=0;//     .line 2767
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 2770
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 2747
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->db:F
a=0;// 
a=0;//     .line 2772
a=0;//     invoke-static {}, Lcom/kingcore/uilib/VerticalViewPager;->access$400()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2773
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x30
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 2774
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 2775
a=0;//     return-void
a=0;// .end method
}}
