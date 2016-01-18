package com.kingroot.RushRoot; class dc { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/dc;
a=0;// .super Lcom/kingroot/RushRoot/de;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/de;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/dc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final a()Landroid/view/View;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     .line 30
a=0;//     #v5=(Byte);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->g()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-super {p0}, Lcom/kingroot/RushRoot/de;->a()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v2, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->g()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 36
a=0;//     #v2=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->g()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->c()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v1, v3, v4}, Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 40
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/CircleWithBottomGap;);
a=0;//     new-instance v3, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v3, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->j()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 45
a=0;//     #v1=(Integer);
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 46
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->d()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 49
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 52
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 53
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final b()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->j()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dc;->g()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/high16 v4, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/kingroot/RushRoot/au;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v0
a=0;// 
a=0;//     invoke-direct {v2, v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract c()I
a=0;// .end method
a=0;// 
a=0;// .method protected abstract d()Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method protected final e()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/dc;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
