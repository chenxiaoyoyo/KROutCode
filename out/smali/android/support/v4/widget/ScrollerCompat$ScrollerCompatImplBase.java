package android.support.v4.widget; class ScrollerCompat$ScrollerCompatImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abortAnimation(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScrollOffset(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public createScroller(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public fling(Ljava/lang/Object;IIIIIIII)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move/from16 v6, p7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move/from16 v7, p8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move/from16 v8, p9
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fling(Ljava/lang/Object;IIIIIIIIII)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move/from16 v6, p7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move/from16 v7, p8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move/from16 v8, p9
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCurrVelocity(Ljava/lang/Object;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrX(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrY(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getFinalX(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getFinalY(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isFinished(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOverScrolled(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public notifyHorizontalEdgeReached(Ljava/lang/Object;III)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public notifyVerticalEdgeReached(Ljava/lang/Object;III)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startScroll(Ljava/lang/Object;IIII)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     check-cast p1, Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/Scroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startScroll(Ljava/lang/Object;IIIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
}}
