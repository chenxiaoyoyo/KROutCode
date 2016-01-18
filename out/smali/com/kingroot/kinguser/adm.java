package com.kingroot.kinguser; class adm { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/adm;
a=0;// .super Lcom/kingroot/kinguser/do;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected Fr:Ljava/util/List;
a=0;// 
a=0;// .field protected Fs:Lcom/kingroot/kinguser/ads;
a=0;// 
a=0;// .field private mEmptyView:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/do;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adm;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/adp;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/ads;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adm;->Fs:Lcom/kingroot/kinguser/ads;
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/HashSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected aD()Landroid/widget/BaseAdapter;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adq;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/adq;-><init>(Lcom/kingroot/kinguser/adm;Lcom/kingroot/kinguser/adn;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adq;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 216
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/do;->aI()V
a=0;// 
a=0;//     .line 219
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adn;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/adn;-><init>(Lcom/kingroot/kinguser/adm;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adn;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/adm;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 239
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adm;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f030028
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/adm;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adm;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     const v1, 0x7f090090
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 241
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     const v1, 0x7f0a0055
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 243
a=0;//     const-wide/32 v1, 0x7f020028
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/adm;->j(J)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 244
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const-wide/32 v2, 0x7f08004f
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/adm;->h(J)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-wide/32 v3, 0x7f080050
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/kingroot/kinguser/adm;->h(J)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v6, v6, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {v0, v5, v1, v5, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adm;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v5}, Lcom/kingroot/kinguser/ea;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ado;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ado;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/ado;-><init>(Lcom/kingroot/kinguser/adm;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ado;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f07001d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 265
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     new-instance v0, Lcom/kingroot/kinguser/eg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/eg;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adm;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/eg;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/eg;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public aJ(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     .line 163
a=0;//     iget-boolean v2, v0, Lcom/kingroot/kinguser/adp;->Fw:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     iput-boolean p1, v0, Lcom/kingroot/kinguser/adp;->dw:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/do;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adm;->aE()Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 49
a=0;//     #v1=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Ljava/util/List;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     check-cast p1, Ljava/util/List;
a=0;// 
a=0;//     .line 54
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     .line 57
a=0;//     iput-boolean v3, v0, Lcom/kingroot/kinguser/adp;->dw:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/widget/BaseAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v2, 0x7f07001d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 77
a=0;//     :goto_1
a=0;//     invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v0, v2, :cond_3
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 73
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eI:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 71
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adm;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aea;->nk()V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/do;->onDestroy()V
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
}}
