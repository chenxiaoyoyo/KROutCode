package com.kingroot.kinguser; class bn { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/bn;
a=0;// .super Landroid/support/v4/view/PagerAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bF:Ljava/util/List;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V
a=0;// 
a=0;//     .line 148
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/bn;);
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/bn;->bF:Ljava/util/List;
a=0;// 
a=0;//     .line 149
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/bn;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bn;->bF:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bn;->bF:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bn;->bF:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bn;->bF:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 168
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/bn;->bF:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     if-ne p1, p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
