package com.kingroot.kinguser; class adk { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/adk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic Fm:Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;// .field final synthetic Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/adj;Lcom/kingroot/kinguser/adl;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adk;->Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/adk;->Fm:Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adk;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adk;->Fm:Lcom/kingroot/kinguser/adl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adl;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/adl;->Fq:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 478
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gt()V
a=0;// 
a=0;//     .line 479
a=0;//     const v0, 0x18747
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 482
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bQ()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adk;->Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adj;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/adj;->a(Lcom/kingroot/kinguser/adj;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 484
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adk;->Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/adj;->a(Lcom/kingroot/kinguser/adj;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adf;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ff;->m(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 513
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 487
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(PosByte);v2=(Uninit);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 488
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v0, 0x200000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 489
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/KmUpdateActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adk;->Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/adj;->a(Lcom/kingroot/kinguser/adj;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adk;->Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/adj;->a(Lcom/kingroot/kinguser/adj;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adf;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 494
a=0;//     :cond_2
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/lh;->af(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 496
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 501
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bX()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 502
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/kingroot/kinguser/vb;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adk;->Fn:Lcom/kingroot/kinguser/adj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adj;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adj;->nf()Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 505
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 506
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/adf;->a(Lcom/kingroot/kinguser/adf;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
