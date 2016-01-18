package android.support.v4.app; class FragmentActivity { void a() { int a;
a=0;// .class public Landroid/support/v4/app/FragmentActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final FRAGMENTS_TAG:Ljava/lang/String; = "android:support:fragments"
a=0;// 
a=0;// .field private static final HONEYCOMB:I = 0xb
a=0;// 
a=0;// .field static final MSG_REALLY_STOPPED:I = 0x1
a=0;// 
a=0;// .field static final MSG_RESUME_PENDING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "FragmentActivity"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;// .field mCheckedForLoaderManager:Z
a=0;// 
a=0;// .field final mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;// .field mCreated:Z
a=0;// 
a=0;// .field final mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;// .field final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;// .field mLoadersStarted:Z
a=0;// 
a=0;// .field mOptionsMenuInvalidated:Z
a=0;// 
a=0;// .field mReallyStopped:Z
a=0;// 
a=0;// .field mResumed:Z
a=0;// 
a=0;// .field mRetaining:Z
a=0;// 
a=0;// .field mStopped:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 86
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentActivity$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$1;-><init>(Landroid/support/v4/app/FragmentActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentActivity$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentActivity$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$2;-><init>(Landroid/support/v4/app/FragmentActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 746
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 747
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 748
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 764
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 751
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p3}, Landroid/support/v4/app/FragmentActivity;->viewToString(Landroid/view/View;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 752
a=0;//     instance-of v0, p3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 755
a=0;//     check-cast p3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 756
a=0;//     invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 757
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 760
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 761
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 762
a=0;//     invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v2, p2, v3}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
a=0;// 
a=0;//     .line 761
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static viewToString(Landroid/view/View;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x56
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v1, 0x46
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v6, 0x2c
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v5, 0x20
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v2, 0x2e
a=0;// 
a=0;//     .line 680
a=0;//     #v2=(PosByte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 681
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 682
a=0;//     const/16 v0, 0x7b
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 683
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 684
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 685
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 689
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 691
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 692
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/16 v0, 0x45
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 693
a=0;//     invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 694
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/16 v0, 0x48
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 695
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 696
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isClickable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const/16 v0, 0x43
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 697
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     const/16 v0, 0x4c
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 698
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 699
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isFocused()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     :goto_8
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 700
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isSelected()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     const/16 v0, 0x53
a=0;// 
a=0;//     :goto_9
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 701
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isPressed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/16 v2, 0x50
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 702
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 703
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 704
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 705
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 706
a=0;//     const/16 v0, 0x2d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 707
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 708
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 709
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 710
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 711
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v1, v0, :cond_1
a=0;// 
a=0;//     .line 712
a=0;//     const-string v0, " #"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 713
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 714
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 715
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 718
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     sparse-switch v0, :sswitch_data_1
a=0;// 
a=0;//     .line 726
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 729
a=0;//     :goto_a
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 730
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 731
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 732
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 733
a=0;//     const-string v0, ":"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 734
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 735
a=0;//     const-string v0, "/"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 736
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 741
a=0;//     :cond_1
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 742
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 686
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(PosByte);v2=(PosByte);v3=(PosByte);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 687
a=0;//     :sswitch_1
a=0;//     const/16 v0, 0x49
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 688
a=0;//     :sswitch_2
a=0;//     #v0=(Integer);
a=0;//     const/16 v0, 0x47
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 691
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 692
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 693
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const/16 v0, 0x44
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 694
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 695
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 696
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 697
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 699
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :cond_a
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 700
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 720
a=0;//     :sswitch_3
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v0, "app"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 723
a=0;//     :sswitch_4
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "android"
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 737
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 685
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_0
a=0;//         0x4 -> :sswitch_1
a=0;//         0x8 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 718
a=0;//     :sswitch_data_1
a=0;//     .sparse-switch
a=0;//         0x1000000 -> :sswitch_4
a=0;//         0x7f000000 -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method doReallyStop(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 767
a=0;//     #v1=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 768
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     .line 769
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
a=0;// 
a=0;//     .line 770
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 771
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onReallyStop()V
a=0;// 
a=0;//     .line 773
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 653
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 657
a=0;//     :cond_0
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Local FragmentActivity "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 658
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 659
a=0;//     const-string v0, " State:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 660
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "  "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 661
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "mCreated="
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 662
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v1, "mResumed="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 663
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v1, " mStopped="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 664
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v1, " mReallyStopped="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 665
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 666
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mLoadersStarted="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 667
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 668
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 669
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Loader Manager "
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 670
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 671
a=0;//     const-string v0, ":"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 672
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 674
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 675
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "View Hierarchy:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 676
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "  "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, p3, v1}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
a=0;// 
a=0;//     .line 677
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getLastCustomNonConfigurationInstance()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;// 
a=0;//     .line 619
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 870
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 871
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 873
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 874
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 875
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 876
a=0;//     new-instance v0, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-direct {v0, p1, p0, p2}, Landroid/support/v4/app/LoaderManagerImpl;-><init>(Ljava/lang/String;Landroid/support/v4/app/FragmentActivity;Z)V
a=0;// 
a=0;//     .line 877
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 882
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 880
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/LoaderManagerImpl;->updateActivity(Landroid/support/v4/app/FragmentActivity;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 812
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSupportLoaderManager()Landroid/support/v4/app/LoaderManager;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 861
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 862
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 866
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 864
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 865
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 866
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method invalidateSupportFragment(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 845
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 846
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 847
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 848
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 851
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 153
a=0;//     shr-int/lit8 v0, p1, 0x10
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Short);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 155
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 156
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "FragmentActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Activity result fragment index out of range: 0x"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 172
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 162
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 163
a=0;//     const-string v0, "FragmentActivity"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Activity result no fragment exists for index: 0x"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     const v1, 0xffff
a=0;// 
a=0;//     #v1=(Char);
a=0;//     and-int/2addr v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_3
a=0;//     #v0=(Short);v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAttachFragment(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 805
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackImmediate()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->finish()V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentContainer;);
a=0;//     invoke-virtual {v0, p0, v2, v1}, Landroid/support/v4/app/FragmentManagerImpl;->attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;// 
a=0;//     .line 208
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v2, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Ljava/util/HashMap;
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 211
a=0;//     :cond_1
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 212
a=0;//     const-string v2, "android:support:fragments"
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v3, v2, v0}, Landroid/support/v4/app/FragmentManagerImpl;->restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 215
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
a=0;// 
a=0;//     .line 216
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 213
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 224
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 225
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getMenuInflater()Landroid/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MenuInflater;);
a=0;//     invoke-virtual {v1, p2, v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 226
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 234
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 242
a=0;//     #v6=(Byte);
a=0;//     const-string v0, "fragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 317
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Reference,Landroid/support/v4/app/Fragment;);v2=(Conflicted);v3=(Reference,Landroid/view/View;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Byte);v7=(Uninit);
a=0;//     const-string v0, "class"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v1, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 247
a=0;//     sget-object v2, Landroid/support/v4/app/FragmentActivity$FragmentTag;->Fragment:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {p2, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 248
a=0;//     #v4=(Reference,Landroid/content/res/TypedArray;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     :cond_1
a=0;//     invoke-virtual {v4, v8, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 252
a=0;//     #v2=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 253
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 256
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 257
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v6, :cond_3
a=0;// 
a=0;//     if-ne v2, v6, :cond_3
a=0;// 
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 258
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ": Must specify unique android:id, android:tag, or have a parent with an id for "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 265
a=0;//     :cond_3
a=0;//     #v1=(Null);v2=(Integer);v3=(Integer);
a=0;//     if-eq v2, v6, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentById(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 266
a=0;//     :cond_4
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 269
a=0;//     :cond_5
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     if-eq v3, v6, :cond_6
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentById(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 273
a=0;//     :cond_6
a=0;//     sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     const-string v4, "FragmentActivity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "onCreateView: id=0x"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " fname="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " existing="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v4, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 276
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 277
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 278
a=0;//     #v4=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput-boolean v8, v4, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     iput v1, v4, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     .line 280
a=0;//     iput v3, v4, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     .line 281
a=0;//     iput-object v5, v4, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 282
a=0;//     iput-boolean v8, v4, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v1, v4, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v1, v4, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v4, p0, p3, v1}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, v4, v8}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 307
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, v1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-nez v3, :cond_c
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Fragment "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " did not create a view."
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Integer);v3=(Integer);v4=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 279
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_9
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);v4=(Conflicted);
a=0;//     iget-boolean v4, v1, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     .line 290
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, ": Duplicate id 0x"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, ", tag "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, ", or parent id 0x"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " with another fragment for "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 297
a=0;//     :cond_a
a=0;//     #v2=(Integer);v3=(Integer);v4=(Boolean);v6=(Conflicted);
a=0;//     iput-boolean v8, v1, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     .line 301
a=0;//     iget-boolean v3, v1, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v3, v1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v1, p0, p3, v3}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 304
a=0;//     :cond_b
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v3, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 311
a=0;//     :cond_c
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 314
a=0;//     :cond_d
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 317
a=0;//     :cond_e
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 327
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroy()V
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 333
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 340
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 345
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V
a=0;// 
a=0;//     .line 346
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 349
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onLowMemory()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchLowMemory()V
a=0;// 
a=0;//     .line 359
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 367
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 378
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 370
a=0;//     :cond_0
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 378
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 372
a=0;//     :sswitch_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 375
a=0;//     :sswitch_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchContextItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_0
a=0;//         0x6 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 423
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPanelClosed(ILandroid/view/Menu;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 392
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V
a=0;// 
a=0;//     .line 393
a=0;//     return-void
a=0;// 
a=0;//     .line 389
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsMenuClosed(Landroid/view/Menu;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 387
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 400
a=0;//     #v1=(PosByte);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 401
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 404
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPause()V
a=0;// 
a=0;//     .line 407
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPostResume()V
a=0;// 
a=0;//     .line 448
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
a=0;// 
a=0;//     .line 450
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 451
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 469
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 470
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
a=0;// 
a=0;//     .line 471
a=0;//     invoke-interface {p3}, Landroid/view/Menu;->clear()V
a=0;// 
a=0;//     .line 472
a=0;//     invoke-virtual {p0, p1, p3}, Landroid/support/v4/app/FragmentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     .line 474
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 475
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1, p3}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 478
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method onReallyStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 784
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 785
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 786
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 787
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStop()V
a=0;// 
a=0;//     .line 794
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchReallyStop()V
a=0;// 
a=0;//     .line 795
a=0;//     return-void
a=0;// 
a=0;//     .line 789
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doRetain()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 438
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 440
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResumeFragments()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
a=0;// 
a=0;//     .line 461
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 609
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 488
a=0;//     #v3=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 489
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
a=0;// 
a=0;//     .line 492
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 494
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->retainNonConfig()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 496
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 499
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v6, v1, [Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 500
a=0;//     #v6=(Reference,[Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 501
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 502
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Boolean);v7=(Conflicted);v8=(Conflicted);
a=0;//     array-length v7, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v0, v7, :cond_2
a=0;// 
a=0;//     .line 503
a=0;//     aget-object v7, v6, v0
a=0;// 
a=0;//     .line 504
a=0;//     #v7=(Null);
a=0;//     iget-boolean v8, v7, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 502
a=0;//     :goto_1
a=0;//     #v7=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 507
a=0;//     :cond_1
a=0;//     #v7=(Null);v8=(Boolean);
a=0;//     invoke-virtual {v7}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 508
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v7, v7, Landroid/support/v4/app/LoaderManagerImpl;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v7=(Integer);v8=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 513
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 523
a=0;//     :goto_2
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 517
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;-><init>()V
a=0;// 
a=0;//     .line 518
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;);
a=0;//     iput-object v3, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->activity:Ljava/lang/Object;
a=0;// 
a=0;//     .line 519
a=0;//     iput-object v4, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;
a=0;// 
a=0;//     .line 520
a=0;//     iput-object v3, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->children:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 521
a=0;//     iput-object v5, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 522
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Ljava/util/HashMap;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 532
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->saveAllState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 533
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     const-string v1, "android:support:fragments"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 536
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 544
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStart()V
a=0;// 
a=0;//     .line 546
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     .line 547
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     .line 548
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 550
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 551
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
a=0;// 
a=0;//     .line 552
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
a=0;// 
a=0;//     .line 555
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 558
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 559
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 560
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 561
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
a=0;// 
a=0;//     .line 569
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 573
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
a=0;// 
a=0;//     .line 574
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 576
a=0;//     #v1=(Reference,[Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 577
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 578
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_4
a=0;// 
a=0;//     .line 579
a=0;//     aget-object v2, v1, v0
a=0;// 
a=0;//     .line 580
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->finishRetain()V
a=0;// 
a=0;//     .line 581
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->doReportStart()V
a=0;// 
a=0;//     .line 578
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 562
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 563
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p0, v1, v2, v0}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 565
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-boolean v1, v1, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 566
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 585
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 592
a=0;//     #v1=(One);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 594
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     .line 595
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStop()V
a=0;// 
a=0;//     .line 598
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivityForResult(Landroid/content/Intent;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 821
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     const/high16 v0, -0x10000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p2
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 822
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Can only use lower 16 bits for requestCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 824
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 825
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 832
a=0;//     #v0=(Byte);
a=0;//     if-ne p3, v0, :cond_0
a=0;// 
a=0;//     .line 833
a=0;//     invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 840
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 836
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const/high16 v0, -0x10000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p3
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 837
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Can only use lower 16 bits for requestCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 839
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     shl-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     const v1, 0xffff
a=0;// 
a=0;//     #v1=(Char);
a=0;//     and-int/2addr v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public supportInvalidateOptionsMenu()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 630
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 633
a=0;//     invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 640
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 639
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
