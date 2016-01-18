package com.kingroot.kinguser; class cz { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/cz;
a=0;// .super Lcom/kingroot/kinguser/du;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/du;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/cz;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     if-nez p2, :cond_3
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v1, Lcom/kingroot/kinguser/db;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/db;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/db;-><init>(Lcom/kingroot/kinguser/cz;)V
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/db;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/cz;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v2, 0x7f03000f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 92
a=0;//     const v0, 0x7f09005e
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/db;->dV:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 93
a=0;//     const v0, 0x7f09002f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/db;->dS:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 94
a=0;//     const v0, 0x7f09006a
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/db;->dW:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 95
a=0;//     const v0, 0x7f090064
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/db;->dT:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 96
a=0;//     const v0, 0x7f09005c
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/db;->dX:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 103
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dV:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/ko;->lj:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 107
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v3, 0x7f020022
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/db;->dV:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dX:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x40
a=0;// 
a=0;//     .line 115
a=0;//     if-gtz v2, :cond_4
a=0;// 
a=0;//     const v2, 0x7f020005
a=0;// 
a=0;//     .line 116
a=0;//     :goto_1
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/db;->dX:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v4, v2}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dS:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dW:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f0a008f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget v7, v0, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     iget v7, v0, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/kingroot/kinguser/vc;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/db;->dT:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 125
a=0;//     return-object p2
a=0;// 
a=0;//     .line 100
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/db;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/db;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     const v2, 0x7f020001
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/view/View;II)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const v6, 0x7f090001
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v5, 0x7f090000
a=0;// 
a=0;//     .line 23
a=0;//     #v5=(Integer);
a=0;//     if-ltz p2, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p2, v0, :cond_3
a=0;// 
a=0;//     .line 27
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {p1, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 30
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt p2, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     move v1, p2
a=0;// 
a=0;//     .line 32
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 34
a=0;//     iget-boolean v0, v0, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move p2, v1
a=0;// 
a=0;//     .line 41
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 42
a=0;//     iget-boolean v1, v0, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 82
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Uninit);v4=(Uninit);v6=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_5
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ko;);v1=(Boolean);
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/ko;->dv:Ljava/lang/String;
a=0;// 
a=0;//     .line 47
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p1, v5, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p1, v6, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/kingroot/kinguser/db;
a=0;// 
a=0;//     .line 53
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v2, Lcom/kingroot/kinguser/db;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/db;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/db;-><init>(Lcom/kingroot/kinguser/cz;)V
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/db;);
a=0;//     const v1, 0x7f09005e
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/db;->dV:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 56
a=0;//     const v1, 0x7f09005c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/db;->dX:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 57
a=0;//     const v1, 0x7f09002f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/db;->dS:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 58
a=0;//     const v1, 0x7f09006a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/db;->dW:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 59
a=0;//     const v1, 0x7f090064
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/db;->dT:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 63
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dV:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/ko;->lj:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 65
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 66
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v5, 0x7f020022
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 68
a=0;//     :cond_7
a=0;//     iget-object v5, v1, Lcom/kingroot/kinguser/db;->dV:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_8
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dX:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 72
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x40
a=0;// 
a=0;//     .line 73
a=0;//     if-gtz v2, :cond_a
a=0;// 
a=0;//     const v2, 0x7f020005
a=0;// 
a=0;//     .line 74
a=0;//     :goto_2
a=0;//     iget-object v5, v1, Lcom/kingroot/kinguser/db;->dX:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v6, v2}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_9
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dS:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/db;->dT:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/db;->dW:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v3, 0x7f0a008f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget v6, v0, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 73
a=0;//     :cond_a
a=0;//     #v2=(Integer);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Integer);
a=0;//     const v2, 0x7f020001
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v1, Lcom/kingroot/kinguser/da;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/da;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/da;-><init>(Lcom/kingroot/kinguser/cz;)V
a=0;// 
a=0;//     .line 134
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/da;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/cz;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v2, 0x7f03000e
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 135
a=0;//     const v0, 0x7f09002f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/da;->dS:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 136
a=0;//     const v0, 0x7f090064
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/da;->dT:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 138
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 143
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cz;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/da;->dS:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/ko;->lf:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/ko;->lg:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/da;->dT:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 148
a=0;//     return-object p2
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/da;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/da;);
a=0;//     goto :goto_0
a=0;// .end method
}}
