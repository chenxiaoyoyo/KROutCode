package android.support.v4.widget; class SlidingPaneLayout$AccessibilityDelegate { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;
a=0;// .super Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1395
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V
a=0;// 
a=0;//     .line 1396
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;);
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private copyNodeInfoNoChildren(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1454
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 1456
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 1457
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 1459
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInScreen(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 1460
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInScreen(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 1462
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isVisibleToUser()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setVisibleToUser(Z)V
a=0;// 
a=0;//     .line 1463
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getPackageName()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setPackageName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1464
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getClassName()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1465
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1467
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setEnabled(Z)V
a=0;// 
a=0;//     .line 1468
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isClickable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClickable(Z)V
a=0;// 
a=0;//     .line 1469
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocusable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setFocusable(Z)V
a=0;// 
a=0;//     .line 1470
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocused()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setFocused(Z)V
a=0;// 
a=0;//     .line 1471
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isAccessibilityFocused()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V
a=0;// 
a=0;//     .line 1472
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isSelected()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSelected(Z)V
a=0;// 
a=0;//     .line 1473
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isLongClickable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setLongClickable(Z)V
a=0;// 
a=0;//     .line 1475
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     .line 1477
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getMovementGranularities()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setMovementGranularities(I)V
a=0;// 
a=0;//     .line 1478
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public filter(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1444
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1429
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 1431
a=0;//     const-class v0, Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1432
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1400
a=0;//     invoke-static {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1401
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     invoke-super {p0, p1, v0}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 1402
a=0;//     invoke-direct {p0, p2, v0}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->copyNodeInfoNoChildren(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 1403
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->recycle()V
a=0;// 
a=0;//     .line 1405
a=0;//     const-class v0, Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1406
a=0;//     invoke-virtual {p2, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSource(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1408
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1409
a=0;//     instance-of v1, v0, Landroid/view/View;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1410
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1415
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1416
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 1417
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1418
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->filter(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 1420
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1422
a=0;//     invoke-virtual {p2, v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addChild(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1416
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1425
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1437
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->filter(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1438
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1440
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}