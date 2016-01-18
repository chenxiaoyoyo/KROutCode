package com.kingroot.kinguser; class adj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/adj;
a=0;// .super Lcom/kingroot/kinguser/du;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Fj:Z
a=0;// 
a=0;// .field private Fk:Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;// .field private Fl:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;ILandroid/widget/CompoundButton$OnCheckedChangeListener;Lcom/kingroot/kinguser/adf;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/du;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 330
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adj;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adj;->Fj:Z
a=0;// 
a=0;//     .line 337
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/adj;->Fk:Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;//     .line 338
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adj;->Fl:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 339
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/me;->hU()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adj;->Fj:Z
a=0;// 
a=0;//     .line 340
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/adj;)Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adj;->Fl:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private n(Landroid/view/View;)Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 454
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adj;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v1, 0x7f03000a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 457
a=0;//     new-instance v1, Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/adl;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/adl;-><init>()V
a=0;// 
a=0;//     .line 458
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adl;);
a=0;//     const v0, 0x7f09005c
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 459
a=0;//     const v0, 0x7f09005b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->Fo:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 460
a=0;//     const v0, 0x7f09005d
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->Fq:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 461
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 464
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const v0, 0x7f02005b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     .line 466
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/adl;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const v2, 0x7f02002c
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 468
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/adl;->Fo:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a005d
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 469
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/adl;->Fq:Landroid/widget/ImageView;
a=0;// 
a=0;//     const v2, 0x7f020033
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/adl;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setClickable(Z)V
a=0;// 
a=0;//     .line 472
a=0;//     new-instance v1, Lcom/kingroot/kinguser/adk;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/adk;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/kingroot/kinguser/adk;-><init>(Lcom/kingroot/kinguser/adj;Lcom/kingroot/kinguser/adl;)V
a=0;// 
a=0;//     .line 515
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adk;);
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/adl;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 516
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 518
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ff;->bR()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 519
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adl;->Fq:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 525
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 521
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Reference,Landroid/widget/ImageView;);v3=(Integer);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adl;->Fq:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
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
a=0;//     .line 378
a=0;//     .line 381
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 382
a=0;//     new-instance v1, Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/adl;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/adl;-><init>()V
a=0;// 
a=0;//     .line 383
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adl;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adj;->getLayoutInflater()Landroid/view/LayoutInflater;
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
a=0;//     .line 384
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adj;->eY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->Fp:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 390
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adj;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     .line 392
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->Fp:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->Fp:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->fb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 397
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 399
a=0;//     return-object p2
a=0;// 
a=0;//     .line 387
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adl;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     .line 407
a=0;//     #v4=(Null);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 408
a=0;//     new-instance v1, Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/adl;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/adl;-><init>()V
a=0;// 
a=0;//     .line 409
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adl;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adj;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v2, 0x7f03000b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 410
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
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 411
a=0;//     const v0, 0x7f09005f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->dy:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 412
a=0;//     const v0, 0x7f090060
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->Fo:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 413
a=0;//     const v0, 0x7f090061
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/adl;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     .line 414
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 419
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 420
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adj;->eX:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     .line 424
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->dy:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adb;->ha()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/kingcore/uilib/QSwitchCheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 427
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adb;->getType()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 441
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Integer);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adb;->nb()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingcore/uilib/QSwitchCheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/adj;->Fk:Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/CompoundButton$OnCheckedChangeListener;);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingcore/uilib/QSwitchCheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     const v3, 0x7f0a005e
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/kingcore/uilib/QSwitchCheckBox;->setTag(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 446
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aea;->nj()Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adb;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/adl;->ec:Landroid/widget/ImageView;
a=0;// 
a=0;//     const v3, 0x7f020022
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1, v3}, Lcom/kingroot/kinguser/adu;->a(Ljava/lang/String;Landroid/widget/ImageView;I)V
a=0;// 
a=0;//     .line 449
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     .line 416
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/adl;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 429
a=0;//     :pswitch_0
a=0;//     #v2=(Integer);v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->Fo:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f0a0058
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 432
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);v4=(Null);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->Fo:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f0a0059
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 435
a=0;//     :pswitch_2
a=0;//     #v2=(Integer);v4=(Null);
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/adl;->Fo:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f0a005a
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 427
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/adj;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 367
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 368
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/kingroot/kinguser/adj;->a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 372
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(PosByte);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 370
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/adj;->n(Landroid/view/View;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 372
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/kingroot/kinguser/adj;->b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getViewTypeCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public nf()Lcom/kingroot/kinguser/adf;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adj;->Fl:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adj;->Fl:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     .line 347
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public r(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adj;->Fj:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 358
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 361
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/du;->r(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
