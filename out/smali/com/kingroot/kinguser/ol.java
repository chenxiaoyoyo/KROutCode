package com.kingroot.kinguser; class ol { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ol;
a=0;// .super Lcom/kingroot/kinguser/dp;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mState:I
a=0;// 
a=0;// .field my:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;// .field private ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;// .field private pt:Landroid/widget/Button;
a=0;// 
a=0;// .field private pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;// .field private pv:Z
a=0;// 
a=0;// .field private pw:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const-string v0, "KmUpdatePage"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/dp;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ol;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/ol;->pv:Z
a=0;// 
a=0;//     .line 34
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ol;->pw:J
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v0, Lcom/kingroot/kinguser/op;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/op;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/op;-><init>(Lcom/kingroot/kinguser/ol;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/op;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ol;->my:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ol;J)J
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-wide p1, p0, Lcom/kingroot/kinguser/ol;->pw:J
a=0;// 
a=0;//     return-wide p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ol;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ol;->iT()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ol;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/ol;->as(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 185
a=0;//     #v2=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hz()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 186
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     invoke-virtual {v1, p1, v0, p2, p3}, Lcom/kingroot/kinguser/lh;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/ol;->as(I)V
a=0;// 
a=0;//     .line 196
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 191
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ol;->iS()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_2
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/ol;->as(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ol;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/kingroot/kinguser/ol;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ol;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/ol;->pv:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private as(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dr;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dr;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d(ILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/TextProgressBar;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingcore/uilib/TextProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingcore/uilib/TextProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/kingcore/uilib/TextProgressBar;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 275
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private iS()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/ol;->as(I)V
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v0, Lcom/kingroot/kinguser/oo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/oo;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/oo;-><init>(Lcom/kingroot/kinguser/ol;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oo;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/oo;->lP()Z
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private iT()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 281
a=0;//     #v2=(Byte);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 283
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/jc;->R(I)V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ly;->r(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 285
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ol;->iU()V
a=0;// 
a=0;//     .line 305
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const v0, 0x1873d
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// 
a=0;//     .line 288
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Byte);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "kmPlugins.zip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "http://mmgr.myapp.com/myapp/Kingroot/webapp_kingroot/image/KingMaster.apk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Lcom/kingroot/kinguser/ol;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 290
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Byte);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 293
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ff;->l(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 295
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->finish()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 300
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ol;->iS()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 302
a=0;//     :cond_4
a=0;//     iput v2, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private iU()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     new-instance v0, Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/abc;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/abc;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->show()V
a=0;// 
a=0;//     .line 315
a=0;//     :try_start_0
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ol;->pw:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     const-wide/high16 v0, 0x400c000000000000L    # 3.5
a=0;// 
a=0;//     .line 320
a=0;//     :goto_0
a=0;//     #v0=(LongLo);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const v3, 0x7f0a00a0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 326
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const v3, 0x7f0a009f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/abc;->dm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/abc;->dn(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const v2, 0x7f0a00a1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->do(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const v2, 0x7f0a00a2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->dp(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/oq;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/oq;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/oq;-><init>(Lcom/kingroot/kinguser/ol;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/oq;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->a(Lcom/kingroot/kinguser/abh;)V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/or;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/or;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/or;-><init>(Lcom/kingroot/kinguser/ol;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/or;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->b(Lcom/kingroot/kinguser/abh;)V
a=0;// 
a=0;//     .line 346
a=0;//     return-void
a=0;// 
a=0;//     .line 318
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);v4=(Uninit);
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ol;->pw:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     const-wide/32 v2, 0x100000
a=0;// 
a=0;//     div-long/2addr v0, v2
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     long-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 322
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 323
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/32 v5, 0x7f0a0097
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/16 v4, 0x64
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dp;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     .line 108
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 172
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-direct {p0, v3, v0}, Lcom/kingroot/kinguser/ol;->d(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(One);v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/ol;->pv:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 118
a=0;//     const-wide/32 v0, 0x7f0a009a
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v4, v0}, Lcom/kingroot/kinguser/ol;->d(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     const-wide/32 v1, 0x7f0a009a
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 127
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-wide/32 v1, 0x7f0a0099
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :pswitch_3
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(One);v2=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ff;->l(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->finish()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     const-wide/32 v1, 0x7f0a0096
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-wide/32 v1, 0x7f0a009b
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v1=(One);v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/nt;->ph:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v4, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     const/16 v0, 0x63
a=0;// 
a=0;//     .line 164
a=0;//     :cond_1
a=0;//     const-wide/32 v1, 0x7f0a0098
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/kinguser/ol;->d(ILjava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v1, 0x7f030030
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const v0, 0x7f090042
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ol;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     .line 91
a=0;//     const v0, 0x7f090048
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/kinguser/on;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/on;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/on;-><init>(Lcom/kingroot/kinguser/ol;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/on;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->aI()V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ed;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ed;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ol;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/baseui/BaseActivity;);
a=0;//     const-wide/32 v2, 0x7f0a0047
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/ol;->g(J)Ljava/lang/String;
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
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->dismiss()V
a=0;// 
a=0;//     .line 355
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ol;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->dismiss()V
a=0;// 
a=0;//     .line 359
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->onDestroy()V
a=0;// 
a=0;//     .line 360
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->onResume()V
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ol;->my:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/lh;->a(Lcom/kingroot/kinguser/oa;)V
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ff;->bV()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lh;->hw()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     .line 51
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/ff;->bQ()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lh;->hv()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/kinguser/lh;->bi(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/ol;->mState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/ol;->as(I)V
a=0;// 
a=0;//     .line 62
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ol;->iT()V
a=0;// 
a=0;//     .line 74
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/om;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/om;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/om;-><init>(Lcom/kingroot/kinguser/ol;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/om;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/om;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
