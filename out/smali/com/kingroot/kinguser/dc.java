package com.kingroot.kinguser; class dc { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/dc;
a=0;// .super Lcom/kingroot/kinguser/du;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dY:I
a=0;// 
a=0;// .field private dZ:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private ea:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private eb:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/du;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dc;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/dc;->dY:I
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private w(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v1, 0x7f0a0011
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v1, 0x7f0a0012
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     .line 59
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v1, Lcom/kingroot/kinguser/dd;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/dd;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/dd;-><init>(Lcom/kingroot/kinguser/dc;)V
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/dd;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/dc;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v2, 0x7f03001b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 62
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/dc;->eY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/dd;->ed:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dc;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     .line 70
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ed:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ed:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->fb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     return-object p2
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dd;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/dd;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/dc;->dZ:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/dc;->ea:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/dc;->eb:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aw()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/dc;->dY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     .line 84
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dc;->eX:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/km;
a=0;// 
a=0;//     .line 87
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v2, Lcom/kingroot/kinguser/dd;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/dd;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/dd;-><init>(Lcom/kingroot/kinguser/dc;)V
a=0;// 
a=0;//     .line 89
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/dd;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/dc;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v3, 0x7f03000c
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 90
a=0;//     const v1, 0x7f09005e
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 91
a=0;//     const v1, 0x7f09002f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ed:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 92
a=0;//     const v1, 0x7f09004c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 93
a=0;//     const v1, 0x7f090064
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 94
a=0;//     const v1, 0x7f09005c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->eg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 95
a=0;//     const v1, 0x7f090065
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->eh:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 96
a=0;//     const v1, 0x7f090066
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ei:Landroid/view/View;
a=0;// 
a=0;//     .line 97
a=0;//     const v1, 0x7f090067
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ej:Landroid/view/View;
a=0;// 
a=0;//     .line 98
a=0;//     const v1, 0x7f090068
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, v2, Lcom/kingroot/kinguser/dd;->ek:Landroid/view/View;
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 104
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/dc;->dY:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, p1, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->eh:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->eg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f020001
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 126
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ed:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/km;->kY:Lcom/kingroot/kinguser/ke;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ke;);
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/ke;->ha()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/km;->kY:Lcom/kingroot/kinguser/ke;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/ke;->hb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/kinguser/dc;->w(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 132
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/km;->kZ:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f0a000a
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f070031
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 143
a=0;//     :goto_2
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aea;->nj()Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/km;->kY:Lcom/kingroot/kinguser/ke;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ke;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/dd;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     const v3, 0x7f020022
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1, v3}, Lcom/kingroot/kinguser/adu;->a(Ljava/lang/String;Landroid/widget/ImageView;I)V
a=0;// 
a=0;//     .line 152
a=0;//     return-object p2
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/kingroot/kinguser/dd;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->eh:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->eg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f020005
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ei:Landroid/view/View;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/dc;->dZ:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ej:Landroid/view/View;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/dc;->ea:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ek:Landroid/view/View;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/dc;->eb:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/widget/TextView;->setSingleLine(Z)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ef:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Reference,Ljava/lang/String;);
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/km;->kZ:I
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_3
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f0a000b
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f070033
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 139
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(One);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f0a000c
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/dd;->ee:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f070032
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public q(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/dc;->dY:I
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
}}
