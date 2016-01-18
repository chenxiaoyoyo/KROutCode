package com.kingroot.kinguser; class os { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/os;
a=0;// .super Lcom/kingroot/kinguser/dt;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gi;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mEmptyView:Landroid/view/View;
a=0;// 
a=0;// .field private final pA:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private pB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private py:Ljava/util/List;
a=0;// 
a=0;// .field private final pz:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const-string v0, "log_page"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/dt;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/os;->py:Ljava/util/List;
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ot;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ot;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ot;-><init>(Lcom/kingroot/kinguser/os;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ot;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/os;->pz:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 169
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ou;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ou;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ou;-><init>(Lcom/kingroot/kinguser/os;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ou;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/os;->pA:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ov;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ov;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ov;-><init>(Lcom/kingroot/kinguser/os;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ov;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/os;->pB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/os;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/os;->j(Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/util/List;Lcom/kingroot/kinguser/ko;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 335
a=0;//     #v0=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 336
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput p1, p3, Lcom/kingroot/kinguser/ko;->index:I
a=0;// 
a=0;//     .line 337
a=0;//     iput-object p2, p3, Lcom/kingroot/kinguser/ko;->lk:Ljava/util/List;
a=0;// 
a=0;//     .line 340
a=0;//     iput v0, p3, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     .line 341
a=0;//     iput v0, p3, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     .line 342
a=0;//     invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 343
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/ko;->lf:Ljava/lang/String;
a=0;// 
a=0;//     .line 346
a=0;//     :cond_0
a=0;//     iget v3, p3, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p3, Lcom/kingroot/kinguser/ko;->lh:I
a=0;// 
a=0;//     .line 347
a=0;//     iget v3, p3, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     iput v0, p3, Lcom/kingroot/kinguser/ko;->li:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 349
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     iput-object v1, p3, Lcom/kingroot/kinguser/ko;->le:Ljava/lang/String;
a=0;// 
a=0;//     .line 350
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/os;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/os;->iV()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/os;ILjava/util/List;Lcom/kingroot/kinguser/ko;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/kinguser/os;->a(ILjava/util/List;Lcom/kingroot/kinguser/ko;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/os;)Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/kinguser/os;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->py:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lcom/kingroot/kinguser/os;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private iV()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 314
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/os;->aR()Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/du;->aT()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 315
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 316
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v1, v4, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 318
a=0;//     iget-boolean v5, v0, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 319
a=0;//     new-instance v5, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct {v5, v0, v6, v7}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 322
a=0;//     iget v5, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/lit8 v5, v5, 0x40
a=0;// 
a=0;//     .line 323
a=0;//     if-gtz v5, :cond_0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/kinguser/ko;->lk:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/ko;->lk:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 325
a=0;//     new-instance v6, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v0, v7}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/os;->c(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 332
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private j(Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 355
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v0}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     .line 356
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v2, "MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     .line 357
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 358
a=0;//     invoke-virtual {v0, v4, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 359
a=0;//     invoke-virtual {p1, v4, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const v1, 0x7f0a0094
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 364
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 362
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v4, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dt;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 371
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 374
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/os;->eU:Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/du;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/du;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->smoothScrollToPosition(II)V
a=0;// 
a=0;//     .line 379
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
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
a=0;//     .line 94
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dt;->aI()V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/gg;->a(Lcom/kingroot/kinguser/gi;)V
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/os;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f030028
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/os;->eL:Lcom/kingroot/kinguser/ea;
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
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/os;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     const v1, 0x7f090090
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 101
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     const v1, 0x7f0a008b
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 103
a=0;//     const-wide/32 v1, 0x7f020027
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/os;->j(J)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 104
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const-wide/32 v2, 0x7f080051
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/os;->h(J)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-wide/32 v3, 0x7f080052
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/kingroot/kinguser/os;->h(J)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v6, v6, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {v0, v5, v1, v5, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/os;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v5}, Lcom/kingroot/kinguser/ea;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->pz:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/os;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->pA:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/os;->c(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->pB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     new-instance v0, Lcom/kingroot/kinguser/tw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/tw;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/os;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/baseui/BaseActivity;);
a=0;//     const-wide/32 v2, 0x7f0a0087
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/os;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/tw;-><init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/tw;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aQ()Lcom/kingroot/kinguser/du;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     new-instance v0, Lcom/kingroot/kinguser/cz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/cz;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/os;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/cz;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/cz;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aS()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
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
a=0;//     .line 69
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dt;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/os;->aR()Lcom/kingroot/kinguser/du;
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
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eL:Lcom/kingroot/kinguser/ea;
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
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 84
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 76
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
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 81
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->eL:Lcom/kingroot/kinguser/ea;
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
a=0;// .method public cH()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/os;->pB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/gg;->b(Lcom/kingroot/kinguser/gi;)V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dt;->onDestroy()V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
}}
