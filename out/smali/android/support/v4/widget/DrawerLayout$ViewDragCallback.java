package android.support.v4.widget; class DrawerLayout$ViewDragCallback { void a() { int a;
a=0;// .class Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// .super Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private final mGravity:I
a=0;// 
a=0;// .field private final mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/widget/DrawerLayout;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1326
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V
a=0;// 
a=0;//     .line 1320
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;-><init>(Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 1327
a=0;//     iput p2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mGravity:I
a=0;// 
a=0;//     .line 1328
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1316
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->peekDrawer()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private closeOtherDrawer()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 1377
a=0;//     #v0=(PosByte);
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     .line 1378
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1379
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1380
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1382
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private peekDrawer()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1411
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1412
a=0;//     #v2=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v5, :cond_4
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 1413
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 1414
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1, v5}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1415
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     :cond_0
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 1421
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-le v0, v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1424
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1425
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v2, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     .line 1426
a=0;//     iput-boolean v4, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     .line 1427
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1429
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V
a=0;// 
a=0;//     .line 1431
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->cancelChildViewTouch()V
a=0;// 
a=0;//     .line 1433
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);v2=(Integer);v3=(Uninit);v5=(PosByte);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 1412
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1417
a=0;//     :cond_5
a=0;//     #v3=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1418
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clampViewPositionHorizontal(Landroid/view/View;II)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1468
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1469
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1472
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 1471
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(PosByte);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1472
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clampViewPositionVertical(Landroid/view/View;II)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1478
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewHorizontalDragRange(Landroid/view/View;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1463
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeDragStarted(II)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1450
a=0;//     and-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 1451
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1456
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1457
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1, v0, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1459
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1453
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeLock(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1444
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeTouched(II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1405
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     const-wide/16 v2, 0xa0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 1406
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCaptured(Landroid/view/View;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1370
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1371
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     .line 1373
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V
a=0;// 
a=0;//     .line 1374
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewDragStateChanged(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1348
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getCapturedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->updateDrawerState(IILandroid/view/View;)V
a=0;// 
a=0;//     .line 1349
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewPositionChanged(Landroid/view/View;IIII)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1354
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1357
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1358
a=0;//     add-int v1, v0, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     .line 1363
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 1364
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1365
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1366
a=0;//     return-void
a=0;// 
a=0;//     .line 1360
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1361
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v1, p2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1364
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onViewReleased(Landroid/view/View;FF)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1388
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1389
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1392
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, p1, v3}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1393
a=0;//     cmpl-float v0, p2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     cmpl-float v0, p2, v4
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     cmpl-float v0, v1, v5
a=0;// 
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1399
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Byte);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
a=0;// 
a=0;//     .line 1400
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1401
a=0;//     return-void
a=0;// 
a=0;//     .line 1393
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Float);v3=(PosByte);
a=0;//     neg-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1395
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1396
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v3, p2, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     cmpl-float v3, p2, v4
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     cmpg-float v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Float);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeCallbacks()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1335
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1336
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1331
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 1332
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tryCaptureView(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1342
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
