package com.kingroot.kinguser.view; class KmUpdateWithNotifyActivity { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field public mHandler:Landroid/os/Handler;
a=0;// 
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
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pv:Z
a=0;// 
a=0;//     .line 38
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pw:J
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Lcom/kingroot/kinguser/abl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/abl;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/abl;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abl;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v0, Lcom/kingroot/kinguser/abm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/abm;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/abm;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abm;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->my:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;J)J
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iput-wide p1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pw:J
a=0;// 
a=0;//     return-wide p1
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->iT()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;ILjava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->d(ILjava/lang/String;)V
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
a=0;//     .line 91
a=0;//     #v2=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hz()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
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
a=0;//     .line 94
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->as(I)V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->iS()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pv:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private as(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic b(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic b(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->as(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic c(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pv:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic d(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d(ILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingcore/uilib/TextProgressBar;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingcore/uilib/TextProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingcore/uilib/TextProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/kingcore/uilib/TextProgressBar;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 250
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private iS()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->as(I)V
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v0, Lcom/kingroot/kinguser/abn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/abn;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/abn;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abn;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abn;->lP()Z
a=0;// 
a=0;//     .line 235
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
a=0;//     .line 256
a=0;//     #v2=(Byte);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/jc;->R(I)V
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ly;->r(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 260
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->iU()V
a=0;// 
a=0;//     .line 280
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gt()V
a=0;// 
a=0;//     .line 281
a=0;//     const v0, 0x18743
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 282
a=0;//     return-void
a=0;// 
a=0;//     .line 263
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "kmPlugins.zip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "http://mmgr.myapp.com/myapp/Kingroot/webapp_kingroot/image/KingMaster.apk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 265
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Byte);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 268
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ff;->l(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->finish()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 271
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 274
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 275
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->iS()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 277
a=0;//     :cond_4
a=0;//     iput v2, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private iU()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     new-instance v0, Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/abc;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/abc;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->show()V
a=0;// 
a=0;//     .line 291
a=0;//     :try_start_0
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pw:J
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
a=0;//     .line 292
a=0;//     const-wide/high16 v0, 0x400c000000000000L    # 3.5
a=0;// 
a=0;//     .line 296
a=0;//     :goto_0
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a00a0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
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
a=0;//     .line 302
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a009f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/abc;->dm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/abc;->dn(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f0a00a1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->do(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f0a00a2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->dp(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/abo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/abo;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/abo;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abo;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->a(Lcom/kingroot/kinguser/abh;)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/abp;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/abp;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/abp;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abp;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/abc;->b(Lcom/kingroot/kinguser/abh;)V
a=0;// 
a=0;//     .line 322
a=0;//     return-void
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);v4=(Uninit);
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pw:J
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
a=0;//     .line 298
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 299
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 44
a=0;//     const v0, 0x7f030009
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 47
a=0;//     const v0, 0x7f090042
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pu:Lcom/kingcore/uilib/TextProgressBar;
a=0;// 
a=0;//     .line 49
a=0;//     const v0, 0x7f090048
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->pt:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/abj;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/abj;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/abj;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abj;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ek;->bd()Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ek;->bi()V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bV()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->my:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/lh;->a(Lcom/kingroot/kinguser/oa;)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/lh;->hw()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     .line 62
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ff;->bQ()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/lh;->hv()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/lh;->bi(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->iS()V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->as(I)V
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/kingroot/kinguser/abk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/abk;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/abk;-><init>(Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abk;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abk;->lP()Z
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/lh;->af(I)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->dismiss()V
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;->ps:Lcom/kingroot/kinguser/abc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/abc;->dismiss()V
a=0;// 
a=0;//     .line 335
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 336
a=0;//     return-void
a=0;// .end method
}}
