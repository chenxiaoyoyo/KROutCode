package com.kingroot.kinguser; class do { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/do;
a=0;// .super Lcom/kingroot/kinguser/dp;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected eI:Landroid/widget/ListView;
a=0;// 
a=0;// .field protected eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/dp;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/do;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected abstract aD()Landroid/widget/BaseAdapter;
a=0;// .end method
a=0;// 
a=0;// .method public aE()Landroid/widget/BaseAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->aF()Landroid/view/View;
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Lcom/kingroot/kinguser/baseui/TransparentListView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/baseui/TransparentListView;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/do;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/baseui/TransparentListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/baseui/TransparentListView;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/do;->aD()Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/do;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/do;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     const v1, 0x7f090017
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setId(I)V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     const-wide/32 v1, 0x7f020081
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/do;->j(J)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setCacheColorHint(I)V
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     const v1, 0x7f07001d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dp;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ListView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/do;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
