package com.kingroot.kinguser.view; class PinnedHeaderListView { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// .super Lcom/kingroot/kinguser/baseui/TransparentListView;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Ev:Lcom/kingroot/kinguser/acd;
a=0;// 
a=0;// .field private Ew:Z
a=0;// 
a=0;// .field private Ex:I
a=0;// 
a=0;// .field private Ey:I
a=0;// 
a=0;// .field private Ez:Z
a=0;// 
a=0;// .field private eW:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/baseui/TransparentListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 258
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/baseui/TransparentListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 258
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/kinguser/baseui/TransparentListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 258
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cj(I)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0xff
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p1, v1, :cond_1
a=0;// 
a=0;//     .line 243
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(PosShort);v1=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ev:Lcom/kingroot/kinguser/acd;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/acd;);
a=0;//     invoke-interface {v1, p1}, Lcom/kingroot/kinguser/acd;->r(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 207
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     :pswitch_0
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ew:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :pswitch_1
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ev:Lcom/kingroot/kinguser/acd;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/acd;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v1, v3, p1, v0}, Lcom/kingroot/kinguser/acd;->a(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ey:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v2, v1, v3}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 218
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iput-boolean v5, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ew:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     :pswitch_2
a=0;//     #v0=(PosShort);v1=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 224
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 225
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 228
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_4
a=0;// 
a=0;//     .line 229
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     .line 230
a=0;//     add-int v0, v3, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     div-int/2addr v0, v3
a=0;// 
a=0;//     .line 235
a=0;//     :goto_1
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ev:Lcom/kingroot/kinguser/acd;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/acd;);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v3, v4, p1, v0}, Lcom/kingroot/kinguser/acd;->a(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ey:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1, v3, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 239
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iput-boolean v5, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ew:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosShort);v3=(Integer);v4=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 233
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 207
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/baseui/TransparentListView;->dispatchDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 248
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ew:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->getDrawingTime()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, p1, v0, v1, v2}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 256
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 252
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public l(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setFadingEdgeLength(I)V
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->requestLayout()V
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     #v3=(Null);
a=0;//     invoke-super/range {p0 .. p5}, Lcom/kingroot/kinguser/baseui/TransparentListView;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ey:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->cj(I)V
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-super {p0, p1, p2}, Lcom/kingroot/kinguser/baseui/TransparentListView;->onMeasure(II)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0, p1, p2}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->measureChild(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ex:I
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ey:I
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 278
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 279
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-ne v1, v0, :cond_1
a=0;// 
a=0;//     .line 281
a=0;//     :cond_0
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ew:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 284
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 285
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 286
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5, v4}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 287
a=0;//     invoke-virtual {v4, v2, v3}, Landroid/graphics/Rect;->contains(II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 288
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 289
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/baseui/TransparentListView;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_3
a=0;//     #v0=(One);v2=(Boolean);v3=(Integer);v4=(Reference,Landroid/graphics/Rect;);v5=(Reference,Landroid/view/View;);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->performClick()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 297
a=0;//     :cond_4
a=0;//     iput-boolean v6, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 300
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     iput-boolean v6, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ez:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     check-cast p1, Landroid/widget/ListAdapter;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/baseui/TransparentListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 110
a=0;//     check-cast p1, Lcom/kingroot/kinguser/acd;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->Ev:Lcom/kingroot/kinguser/acd;
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
}}
