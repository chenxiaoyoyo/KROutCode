package com.kingroot.RushRoot.views.components; class f { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/views/components/f;
a=0;// .super Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1308
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1308
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/views/components/f;-><init>(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final clampViewPositionVertical(Landroid/view/View;II)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1413
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->h(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1414
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1415
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 1421
a=0;//     :goto_0
a=0;//     invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 1417
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1418
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getViewVerticalDragRange(Landroid/view/View;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1405
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final onViewCaptured(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1353
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e()V
a=0;// 
a=0;//     .line 1354
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onViewDragStateChanged(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1324
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 1327
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1328
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpl-float v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1329
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/i;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 1330
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d()V
a=0;// 
a=0;//     .line 1331
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/i;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;Lcom/kingroot/RushRoot/views/components/i;)Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     .line 1332
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a()V
a=0;// 
a=0;//     .line 1346
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1334
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Byte);v2=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     cmpl-float v0, v1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1336
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/i;->c:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 1337
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d()V
a=0;// 
a=0;//     .line 1338
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/i;->c:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;Lcom/kingroot/RushRoot/views/components/i;)Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     .line 1339
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1341
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Float);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->f(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/i;->b:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 1342
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/views/components/i;->b:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;Lcom/kingroot/RushRoot/views/components/i;)Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     .line 1343
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->g(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final onViewPositionChanged(Landroid/view/View;IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1360
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0, p3}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;I)V
a=0;// 
a=0;//     .line 1361
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->invalidate()V
a=0;// 
a=0;//     .line 1362
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onViewReleased(Landroid/view/View;FF)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1368
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->h(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1372
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 1375
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->h(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1376
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     .line 1377
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     .line 1385
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     cmpl-float v2, p3, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     cmpl-float v2, p3, v4
a=0;// 
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v3, v6, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, v5
a=0;// 
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_4
a=0;// 
a=0;//     .line 1387
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 1398
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->d(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
a=0;// 
a=0;//     .line 1399
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->invalidate()V
a=0;// 
a=0;//     .line 1400
a=0;//     return-void
a=0;// 
a=0;//     .line 1368
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->i(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1379
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     .line 1381
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->j(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v1, v2, v1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1388
a=0;//     :cond_4
a=0;//     #v2=(Byte);v3=(Conflicted);
a=0;//     cmpl-float v2, p3, v4
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v3, v6, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, v5
a=0;// 
a=0;//     cmpg-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v5
a=0;// 
a=0;//     cmpl-float v1, v2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 1390
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->b(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1393
a=0;//     :cond_5
a=0;//     #v1=(Byte);v2=(Uninit);v3=(Uninit);
a=0;//     cmpl-float v1, p3, v4
a=0;// 
a=0;//     if-gtz v1, :cond_6
a=0;// 
a=0;//     cmpl-float v1, p3, v4
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->e(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 1394
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->c(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final tryCaptureView(Landroid/view/View;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1314
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/f;->a:Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;->a(Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1315
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1318
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$LayoutParams;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
