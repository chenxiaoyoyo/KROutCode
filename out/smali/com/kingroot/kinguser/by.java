package com.kingroot.kinguser; class by { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/by;
a=0;// .super Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingcore/uilib/VerticalViewPager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 2656
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/by;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private canScroll()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2710
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-static {v1}, Lcom/kingcore/uilib/VerticalViewPager;->a(Lcom/kingcore/uilib/VerticalViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingcore/uilib/VerticalViewPager;->a(Lcom/kingcore/uilib/VerticalViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 2660
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 2661
a=0;//     const-class v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 2662
a=0;//     invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->obtain()Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2663
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/by;->canScroll()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setScrollable(Z)V
a=0;// 
a=0;//     .line 2664
a=0;//     invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-static {v1}, Lcom/kingcore/uilib/VerticalViewPager;->a(Lcom/kingcore/uilib/VerticalViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 2666
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingcore/uilib/VerticalViewPager;->a(Lcom/kingcore/uilib/VerticalViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setItemCount(I)V
a=0;// 
a=0;//     .line 2667
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-static {v1}, Lcom/kingcore/uilib/VerticalViewPager;->b(Lcom/kingcore/uilib/VerticalViewPager;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V
a=0;// 
a=0;//     .line 2668
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-static {v1}, Lcom/kingcore/uilib/VerticalViewPager;->b(Lcom/kingcore/uilib/VerticalViewPager;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V
a=0;// 
a=0;//     .line 2670
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 2674
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 2675
a=0;//     const-class v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 2676
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/by;->canScroll()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setScrollable(Z)V
a=0;// 
a=0;//     .line 2677
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingcore/uilib/VerticalViewPager;->m(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2678
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     .line 2680
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingcore/uilib/VerticalViewPager;->m(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 2681
a=0;//     const/16 v0, 0x2000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     .line 2683
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2687
a=0;//     #v0=(One);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 2706
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);v2=(Integer);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2690
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2706
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2692
a=0;//     :sswitch_0
a=0;//     #v0=(One);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingcore/uilib/VerticalViewPager;->m(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 2693
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-static {v2}, Lcom/kingcore/uilib/VerticalViewPager;->b(Lcom/kingcore/uilib/VerticalViewPager;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingcore/uilib/VerticalViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2697
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2699
a=0;//     :sswitch_1
a=0;//     #v0=(One);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingcore/uilib/VerticalViewPager;->m(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 2700
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/by;->da:Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-static {v2}, Lcom/kingcore/uilib/VerticalViewPager;->b(Lcom/kingcore/uilib/VerticalViewPager;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingcore/uilib/VerticalViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2704
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2690
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1000 -> :sswitch_0
a=0;//         0x2000 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
