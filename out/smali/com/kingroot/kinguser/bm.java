package com.kingroot.kinguser; class bm { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/bm;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic bD:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;// .field final synthetic bE:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingcore/uilib/VerticalViewPager;Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/bm;->bD:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/bm;->bE:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/bm;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onGlobalLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bm;->bD:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-virtual {v0}, Lcom/kingcore/uilib/VerticalViewPager;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bm;->bE:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
}}
