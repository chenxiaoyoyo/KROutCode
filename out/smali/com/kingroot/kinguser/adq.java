package com.kingroot.kinguser; class adq { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/adq;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic Ft:Lcom/kingroot/kinguser/adm;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/kingroot/kinguser/adm;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adq;->Ft:Lcom/kingroot/kinguser/adm;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 145
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adq;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/kingroot/kinguser/adm;Lcom/kingroot/kinguser/adn;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/adq;-><init>(Lcom/kingroot/kinguser/adm;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adq;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adq;->Ft:Lcom/kingroot/kinguser/adm;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adm;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
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
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adq;->Ft:Lcom/kingroot/kinguser/adm;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
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
a=0;//     .line 92
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
a=0;//     .line 97
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v1, Lcom/kingroot/kinguser/adr;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/adr;);
a=0;//     invoke-direct {v1, p0, v4}, Lcom/kingroot/kinguser/adr;-><init>(Lcom/kingroot/kinguser/adq;Lcom/kingroot/kinguser/adn;)V
a=0;// 
a=0;//     .line 105
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adr;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adq;->Ft:Lcom/kingroot/kinguser/adm;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adm;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adm;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v2, 0x7f030010
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 106
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adr;->dx:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 107
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adr;->dy:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 108
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adr;->Fx:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setClickable(Z)V
a=0;// 
a=0;//     .line 111
a=0;//     const v0, 0x7f09006d
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adr;->Fy:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adq;->Ft:Lcom/kingroot/kinguser/adm;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adm;->Fr:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-boolean v2, v0, Lcom/kingroot/kinguser/adp;->Fw:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->Fy:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     iget-boolean v3, v0, Lcom/kingroot/kinguser/adp;->dw:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 133
a=0;//     :goto_1
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->dy:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 136
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aea;->nj()Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, v1, Lcom/kingroot/kinguser/adr;->dx:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     const v5, 0x7f020022
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v5}, Lcom/kingroot/kinguser/adu;->a(Ljava/lang/String;Landroid/widget/ImageView;I)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->Fx:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adp;->Fv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 142
a=0;//     return-object p2
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Null);v5=(PosByte);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adr;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adr;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->Fy:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adr;->dz:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
