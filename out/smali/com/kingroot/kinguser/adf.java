package com.kingroot.kinguser; class adf { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/adf;
a=0;// .super Lcom/kingroot/kinguser/ef;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/kl;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mEmptyView:Landroid/view/View;
a=0;// 
a=0;// .field private pJ:Landroid/app/Dialog;
a=0;// 
a=0;// .field private pQ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/ef;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 294
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adf;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adi;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/adi;-><init>(Lcom/kingroot/kinguser/adf;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adi;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adf;->pQ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/adf;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/adf;->ja()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private iW()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ja()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 274
a=0;//     new-instance v0, Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Dialog;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const v2, 0x7f0b0005
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     const v1, 0x7f030003
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     .line 283
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     const v1, 0x7f090039
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     const v2, 0x7f090038
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 286
a=0;//     const v2, 0x7f0a00cb
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 287
a=0;//     const v0, 0x7f020044
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const v2, 0x7f040003
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pQ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private o(IZ)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adf;->aR()Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/du;->aT()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 179
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     .line 180
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {v0, p2}, Lcom/kingroot/kinguser/adb;->aI(Z)V
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 221
a=0;//     #v0=(One);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/ef;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 225
a=0;//     :pswitch_0
a=0;//     #v0=(One);v3=(Uninit);
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 226
a=0;//     iget v3, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v2, v0}, Lcom/kingroot/kinguser/adf;->o(IZ)V
a=0;// 
a=0;//     .line 230
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 232
a=0;//     const v0, 0x186de
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 226
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 235
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const v0, 0x186df
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     :pswitch_1
a=0;//     #v0=(One);v3=(Uninit);
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     if-ne v2, v0, :cond_3
a=0;// 
a=0;//     .line 241
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 242
a=0;//     const v0, 0x7f0a00cc
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->E(I)V
a=0;// 
a=0;//     .line 247
a=0;//     :goto_3
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->pJ:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 250
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ff;->l(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 240
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 244
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const v0, 0x7f0a00cd
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->E(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 223
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
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
a=0;//     .line 125
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/ef;->aI()V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adf;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v1, 0x7f030028
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/adf;->eL:Lcom/kingroot/kinguser/ea;
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
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adf;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     const v1, 0x7f090090
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 130
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     const v1, 0x7f0a005c
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 132
a=0;//     const-wide/32 v1, 0x7f020028
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/adf;->j(J)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const-wide/32 v2, 0x7f08004f
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/adf;->h(J)F
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
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/kingroot/kinguser/adf;->h(J)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v6, v6, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v0, v5, v1, v5, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adf;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v5}, Lcom/kingroot/kinguser/ea;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/adh;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/adh;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/adh;-><init>(Lcom/kingroot/kinguser/adf;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adh;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "AutoStartDataCollector"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p0}, Lcom/kingroot/kinguser/kh;->a(Ljava/lang/String;Lcom/kingroot/kinguser/kl;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/adf;->c(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f07001d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/adc;->ne()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     const-string v1, "AutoStartDataCollector"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/kh;->bb(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ed;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ed;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adf;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/baseui/BaseActivity;);
a=0;//     const-wide/32 v2, 0x7f0a0045
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/adf;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/ed;-><init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ed;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aQ()Lcom/kingroot/kinguser/du;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adj;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adf;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/baseui/BaseActivity;);
a=0;//     const v2, 0x7f090018
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/adg;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/adg;);
a=0;//     invoke-direct {v3, p0}, Lcom/kingroot/kinguser/adg;-><init>(Lcom/kingroot/kinguser/adf;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/adg;);
a=0;//     invoke-direct {v0, v1, v2, v3, p0}, Lcom/kingroot/kinguser/adj;-><init>(Landroid/content/Context;ILandroid/widget/CompoundButton$OnCheckedChangeListener;Lcom/kingroot/kinguser/adf;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adj;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aS()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     const v0, 0x7f03001b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/ef;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adf;->aR()Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/du;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f07001d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 117
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adf;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public e(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 267
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/adf;->c(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/adf;->iW()V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     const-string v1, "AutoStartDataCollector"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p0}, Lcom/kingroot/kinguser/kh;->b(Ljava/lang/String;Lcom/kingroot/kinguser/kl;)V
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/adc;->nd()V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aea;->nk()V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/ef;->onDestroy()V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
}}
