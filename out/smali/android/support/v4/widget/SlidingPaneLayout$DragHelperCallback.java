package android.support.v4.widget; class SlidingPaneLayout$DragHelperCallback { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;
a=0;// .super Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1178
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1178
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clampViewPositionHorizontal(Landroid/view/View;II)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1233
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1234
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 1235
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     .line 1237
a=0;//     invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1239
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewHorizontalDragRange(Landroid/view/View;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1228
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
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
a=0;//     .line 1244
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1245
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCaptured(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1206
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V
a=0;// 
a=0;//     .line 1207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewDragStateChanged(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1191
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1192
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1193
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1194
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1195
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;// 
a=0;//     .line 1201
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1197
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1198
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onViewPositionChanged(Landroid/view/View;IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1211
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
a=0;// 
a=0;//     .line 1212
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
a=0;// 
a=0;//     .line 1213
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewReleased(Landroid/view/View;FF)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1217
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1218
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 1219
a=0;//     cmpl-float v1, p2, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     cmpl-float v1, p2, v2
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
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
a=0;//     .line 1220
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 1222
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
a=0;// 
a=0;//     .line 1223
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
a=0;// 
a=0;//     .line 1224
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tryCaptureView(Landroid/view/View;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1182
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1183
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1186
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
