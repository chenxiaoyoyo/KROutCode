package com.kingroot.kinguser; class rf { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/rf;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dL:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/rf;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rf;->dL:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/rf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rf;->dL:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public az(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     #v2=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rf;->dL:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rf;->dL:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/rh;
a=0;// 
a=0;//     .line 91
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     iget-boolean v3, v0, Lcom/kingroot/kinguser/rh;->ra:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     iput-boolean v3, v0, Lcom/kingroot/kinguser/rh;->ra:Z
a=0;// 
a=0;//     .line 89
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rh;);v3=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 92
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iput-boolean v2, v0, Lcom/kingroot/kinguser/rh;->ra:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 97
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rf;->dL:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rf;->dL:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/rh;
a=0;// 
a=0;//     .line 105
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v2, Lcom/kingroot/kinguser/rg;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/rg;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/rg;-><init>()V
a=0;// 
a=0;//     .line 107
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/rg;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f030017
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 108
a=0;//     const v1, 0x7f090073
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/rg;->qV:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
a=0;//     const v1, 0x7f090075
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/rg;->qW:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 110
a=0;//     const v1, 0x7f090074
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/rg;->qX:Landroid/view/View;
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 116
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/rg;->qV:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/rh;->qY:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/rg;->qW:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/rh;->qZ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/rg;->qX:Landroid/view/View;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/kinguser/rh;->ra:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 120
a=0;//     return-object p2
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rh;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/kingroot/kinguser/rg;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Reference,Landroid/widget/TextView;);v3=(Reference,Landroid/text/Spanned;);v4=(Conflicted);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// .end method
}}
