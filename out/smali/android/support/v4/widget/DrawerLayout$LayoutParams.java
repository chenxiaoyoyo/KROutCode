package android.support.v4.widget; class DrawerLayout$LayoutParams { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// .super Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public gravity:I
a=0;// 
a=0;// .field isPeeking:Z
a=0;// 
a=0;// .field knownOpen:Z
a=0;// 
a=0;// .field onScreen:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1498
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1484
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1499
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(III)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1502
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1503
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     iput p3, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1504
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1490
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1484
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     iput v1, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1492
a=0;//     invoke-static {}, Landroid/support/v4/widget/DrawerLayout;->access$100()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1493
a=0;//     invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1494
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 1495
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/widget/DrawerLayout$LayoutParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1507
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1484
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1508
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1509
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1512
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1484
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1513
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1516
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1484
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1517
a=0;//     return-void
a=0;// .end method
}}
