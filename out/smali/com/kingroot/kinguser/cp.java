package com.kingroot.kinguser; class cp { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/cp;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dA:Ljava/util/HashSet;
a=0;// 
a=0;// .field private dp:Ljava/util/List;
a=0;// 
a=0;// .field private mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 225
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/cp;);
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/cp;->dA:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/cp;->dp:Ljava/util/List;
a=0;// 
a=0;//     .line 229
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/cp;->mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 230
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/cp;->dp:Ljava/util/List;
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->dp:Ljava/util/List;
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/cn;
a=0;// 
a=0;//     .line 233
a=0;//     iget-boolean v2, v0, Lcom/kingroot/kinguser/cn;->dw:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/cp;->dA:Ljava/util/HashSet;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashSet;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/cn;->du:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/cp;)Ljava/util/HashSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->dA:Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aq()Ljava/util/HashSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->dA:Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->dp:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->dp:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
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
a=0;//     .line 251
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     #v4=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     new-instance v1, Lcom/kingroot/kinguser/co;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/co;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/co;-><init>()V
a=0;// 
a=0;//     .line 263
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/co;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v2, 0x7f030011
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 264
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/co;->dx:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 265
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/co;->dy:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 266
a=0;//     const v0, 0x7f09006c
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/co;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, v1, Lcom/kingroot/kinguser/co;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setClickable(Z)V
a=0;// 
a=0;//     .line 273
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cp;->dp:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/cn;
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/co;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/co;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/kinguser/cq;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/cq;);
a=0;//     invoke-direct {v3, p0, v0}, Lcom/kingroot/kinguser/cq;-><init>(Lcom/kingroot/kinguser/cp;Lcom/kingroot/kinguser/cn;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/cq;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/co;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     iget-boolean v3, v0, Lcom/kingroot/kinguser/cn;->dw:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/co;->dy:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/cn;->dv:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aea;->nj()Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/cn;->du:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/co;->dx:Landroid/widget/ImageView;
a=0;// 
a=0;//     const v4, 0x7f020022
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v0, v3, v4}, Lcom/kingroot/kinguser/adu;->a(Ljava/lang/String;Landroid/widget/ImageView;I)V
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 298
a=0;//     return-object p2
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/co;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/co;);
a=0;//     goto :goto_0
a=0;// .end method
}}
