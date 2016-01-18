package com.kingroot.kinguser; class dt { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/dt;
a=0;// .super Lcom/kingroot/kinguser/dp;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;// .field protected eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;// .field protected eV:I
a=0;// 
a=0;// .field protected eW:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/dp;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dt;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/dt;->aS()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/dt;->eV:I
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/dp;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dt;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/dt;->aS()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/dt;->eV:I
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/dt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     const v1, 0x7f090017
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setId(I)V
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/dt;->aQ()Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dt;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/dt;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 61
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/dt;->eV:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/dt;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/dt;->eV:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dt;->eW:Landroid/view/View;
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/dt;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->l(Landroid/view/View;)V
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     const-wide/32 v1, 0x7f020081
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/dt;->j(J)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setCacheColorHint(I)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     const v1, 0x7f07001d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract aQ()Lcom/kingroot/kinguser/du;
a=0;// .end method
a=0;// 
a=0;// .method public aR()Lcom/kingroot/kinguser/du;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract aS()I
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dp;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v0, v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     check-cast p1, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/du;->b(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/du;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected c(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eW:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eW:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/widget/AbsListView;III)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     invoke-virtual {v0, p2}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->cj(I)V
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dt;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
}}
