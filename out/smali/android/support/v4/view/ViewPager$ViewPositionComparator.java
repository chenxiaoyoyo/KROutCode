package android.support.v4.view; class ViewPager$ViewPositionComparator { void a() { int a;
a=0;// .class Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Comparator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 2865
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public compare(Landroid/view/View;Landroid/view/View;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 2868
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 2869
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 2870
a=0;//     iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 2871
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2873
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2871
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2873
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2865
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     check-cast p2, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;->compare(Landroid/view/View;Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
