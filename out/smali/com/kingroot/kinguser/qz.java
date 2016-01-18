package com.kingroot.kinguser; class qz { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/qz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/qx;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/qz;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 563
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->d(Lcom/kingroot/kinguser/qx;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kp;
a=0;// 
a=0;//     .line 565
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/kp;->ll:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 791
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 568
a=0;//     :pswitch_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kp;);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->e(Lcom/kingroot/kinguser/qx;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 573
a=0;//     :pswitch_2
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 575
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lo;->hG()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 578
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lo;->hF()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 581
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lo;->hE()Lcom/kingroot/kinguser/ks;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 582
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/ks;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 583
a=0;//     #v0=(Null);
a=0;//     if-eqz v5, :cond_1d
a=0;// 
a=0;//     iget-object v1, v5, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_1d
a=0;// 
a=0;//     iget-object v1, v5, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1d
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v0, v5, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 588
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/kr;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 592
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lo;->hH()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 593
a=0;//     const v0, 0x7f0a0022
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->E(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 608
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 595
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/kingroot/kinguser/kr;);v2=(Reference,Lcom/kingroot/kinguser/lo;);v3=(Boolean);v4=(Boolean);v5=(Reference,Lcom/kingroot/kinguser/ks;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2, v1, v5}, Lcom/kingroot/kinguser/lo;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 597
a=0;//     :cond_1
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 598
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hJ()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 599
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 600
a=0;//     :goto_2
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 601
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v5, v2}, Lcom/kingroot/kinguser/lk;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 599
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 603
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2, v1, v5}, Lcom/kingroot/kinguser/lo;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 606
a=0;//     :cond_4
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->e(Lcom/kingroot/kinguser/qx;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 617
a=0;//     :pswitch_3
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 618
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/qx;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/RootMgrSettingActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 619
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/qx;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_b
a=0;// 
a=0;//     .line 624
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const v0, 0x1873a
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :pswitch_4
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kp;);v1=(Integer);v2=(Uninit);
a=0;//     new-instance v11, Lcom/kingroot/kinguser/wk;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/kingroot/kinguser/wk;);
a=0;//     invoke-direct {v11}, Lcom/kingroot/kinguser/wk;-><init>()V
a=0;// 
a=0;//     .line 629
a=0;//     #v11=(Reference,Lcom/kingroot/kinguser/wk;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 630
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     .line 631
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     .line 632
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 633
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     .line 634
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     .line 635
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     .line 637
a=0;//     :try_start_2
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "UTF-8"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 641
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 642
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :cond_5
a=0;//     move-object v10, v0
a=0;// 
a=0;//     .line 646
a=0;//     :goto_4
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v8=(Conflicted);v10=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/kingroot/kinguser/wk;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 650
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 651
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :cond_6
a=0;//     move-object v9, v0
a=0;// 
a=0;//     .line 655
a=0;//     :goto_5
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v9=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 659
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 660
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :cond_7
a=0;//     move-object v8, v0
a=0;// 
a=0;//     .line 664
a=0;//     :goto_6
a=0;//     :try_start_5
a=0;//     #v1=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/kingroot/kinguser/wk;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 668
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 669
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :cond_8
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 673
a=0;//     :goto_7
a=0;//     :try_start_6
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->ev()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x2e
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 674
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1c
a=0;// 
a=0;//     .line 675
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/um;->ev()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/kingroot/kinguser/wk;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_4
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 680
a=0;//     :goto_8
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 681
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :cond_9
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 685
a=0;//     :goto_9
a=0;//     :try_start_7
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vs;->I(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/kingroot/kinguser/wk;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_5
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 689
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 690
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :cond_a
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 694
a=0;//     :goto_a
a=0;//     :try_start_8
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/kingroot/kinguser/wk;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_6
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 698
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_b
a=0;// 
a=0;//     .line 699
a=0;//     const-string v0, " "
a=0;// 
a=0;//     .line 702
a=0;//     :cond_b
a=0;//     :goto_b
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Locale;);
a=0;//     const-string v5, "http://www.kingroot.net/feedback/kinguser/%s/%s/%s/%s/%s/%d/%s/%s"
a=0;// 
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v10, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aput-object v9, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     aput-object v3, v6, v7
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aput-object v2, v6, v3
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v3, 0xdc
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v6, v2
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     aput-object v1, v6, v2
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aput-object v0, v6, v1
a=0;// 
a=0;//     invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 720
a=0;//     :try_start_9
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 721
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/vb;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 724
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_c
a=0;// 
a=0;//     .line 726
a=0;//     const/high16 v0, 0x14000000
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 727
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_a
a=0;// 
a=0;//     .line 733
a=0;//     :cond_c
a=0;//     :goto_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const v0, 0x18745
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 638
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 641
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1b
a=0;// 
a=0;//     .line 642
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :goto_d
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v10, v0
a=0;// 
a=0;//     .line 644
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 641
a=0;//     :catchall_0
a=0;//     #v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 642
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 641
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 647
a=0;//     :catch_2
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 650
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1a
a=0;// 
a=0;//     .line 651
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :goto_e
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v9, v0
a=0;// 
a=0;//     .line 653
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 650
a=0;//     :catchall_1
a=0;//     #v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     .line 651
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 650
a=0;//     :cond_e
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 656
a=0;//     :catch_3
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 659
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_19
a=0;// 
a=0;//     .line 660
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :goto_f
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v8, v0
a=0;// 
a=0;//     .line 662
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 659
a=0;//     :catchall_2
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     .line 660
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 659
a=0;//     :cond_f
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 665
a=0;//     :catch_4
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 668
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     .line 669
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :goto_10
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 671
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 668
a=0;//     :catchall_3
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_10
a=0;// 
a=0;//     .line 669
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 668
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 677
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 680
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     .line 681
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :goto_11
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 683
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 680
a=0;//     :catchall_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_11
a=0;// 
a=0;//     .line 681
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 680
a=0;//     :cond_11
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 686
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 689
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     .line 690
a=0;//     const-string v0, " "
a=0;// 
a=0;//     :goto_12
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 692
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 689
a=0;//     :catchall_5
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_12
a=0;// 
a=0;//     .line 690
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 689
a=0;//     :cond_12
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 698
a=0;//     :catchall_6
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_13
a=0;// 
a=0;//     .line 699
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 698
a=0;//     :cond_13
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 738
a=0;//     :pswitch_5
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     const v0, 0x1875e
a=0;// 
a=0;//     :try_start_a
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 740
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 741
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/WiFiSettingActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 742
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 743
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 750
a=0;//     :pswitch_6
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     const/16 v1, 0x22
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/kp;->ll:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v1, v0, :cond_14
a=0;// 
a=0;//     .line 751
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/jc;->af(Z)V
a=0;// 
a=0;//     .line 752
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->jc()V
a=0;// 
a=0;//     .line 755
a=0;//     :cond_14
a=0;//     :try_start_b
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 756
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/SoftwareHelpActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 757
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_9
a=0;// 
a=0;//     .line 761
a=0;//     :goto_13
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const v0, 0x18744
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 765
a=0;//     :pswitch_7
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kp;);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->f(Lcom/kingroot/kinguser/qx;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 769
a=0;//     :pswitch_8
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/jt;->a(Landroid/app/Activity;)Z
a=0;// 
a=0;//     .line 770
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ra;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ra;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/ra;-><init>(Lcom/kingroot/kinguser/qz;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ra;);
a=0;//     const-wide/16 v2, 0x5dc
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/kinguser/dr;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 781
a=0;//     :pswitch_9
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/jt;->b(Landroid/app/Activity;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 785
a=0;//     :pswitch_a
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qz;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/jt;->c(Landroid/app/Activity;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 695
a=0;//     :catch_8
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Reference,Lcom/kingroot/kinguser/wk;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 698
a=0;//     invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     .line 699
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     .line 758
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_13
a=0;// 
a=0;//     .line 729
a=0;//     :catch_a
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/Integer;);v4=(Reference,Ljava/util/Locale;);v5=(Reference,Ljava/lang/String;);v6=(Reference,[Ljava/lang/Object;);v7=(PosByte);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Reference,Lcom/kingroot/kinguser/wk;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     .line 620
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Reference,Lcom/kingroot/kinguser/wk;);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :cond_16
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_12
a=0;// 
a=0;//     :cond_17
a=0;//     #v0=(Boolean);
a=0;//     move-object v0, v5
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     :cond_18
a=0;//     #v0=(Boolean);
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :cond_19
a=0;//     #v0=(Boolean);v8=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :cond_1a
a=0;//     #v0=(Boolean);v9=(Uninit);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :cond_1b
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v10=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :cond_1c
a=0;//     #v0=(Integer);v1=(PosByte);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v5
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :cond_1d
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Boolean);v4=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 565
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0xc
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_6
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
}}
