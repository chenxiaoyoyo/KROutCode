package com.kingroot.kinguser; class cc { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/cc;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Comparator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 2778
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/cc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public compare(Landroid/view/View;Landroid/view/View;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 2781
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;
a=0;// 
a=0;//     .line 2782
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;
a=0;// 
a=0;//     .line 2783
a=0;//     iget-boolean v2, v0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v3, v1, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 2784
a=0;//     iget-boolean v0, v0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2786
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2784
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2786
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;);
a=0;//     iget v0, v0, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, v1, Lcom/kingcore/uilib/VerticalViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2778
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     check-cast p2, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/kinguser/cc;->compare(Landroid/view/View;Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
