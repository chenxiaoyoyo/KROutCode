package com.kingroot.kinguser; class pc { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/pc;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 605
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/pc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     .line 608
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 609
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 702
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 613
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Integer;);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->i(Lcom/kingroot/kinguser/ow;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/acz;
a=0;// 
a=0;//     .line 621
a=0;//     :try_start_0
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/acz;->id:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 623
a=0;//     :pswitch_1
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 625
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const v1, 0x186d5
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 626
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->j(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/ztool/uninstall/SoftwareUninstallActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 627
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->k(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 688
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 693
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
a=0;//     .line 694
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
a=0;//     .line 695
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 696
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ow;->g(Lcom/kingroot/kinguser/ow;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 698
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 631
a=0;//     :pswitch_2
a=0;//     :try_start_2
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/ArrayList;);v2=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 633
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const v1, 0x186dd
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 634
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->l(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/ztool/autostartmgr/AutoStartMgrActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 635
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->m(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 648
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v2=(Uninit);
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
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 649
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ow;->n(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ff;->m(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 658
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gt()V
a=0;// 
a=0;//     .line 659
a=0;//     const v0, 0x18746
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 651
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/ArrayList;);v2=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 652
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->o(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/KmUpdateActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 653
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->p(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 655
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/lh;->af(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 663
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/ArrayList;);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ow;->q(Lcom/kingroot/kinguser/ow;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 664
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 665
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 666
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->r(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/RootMgrActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 667
a=0;//     const v1, 0x1873c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 668
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->s(Lcom/kingroot/kinguser/ow;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 670
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 671
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->d(Lcom/kingroot/kinguser/ow;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_5
a=0;// 
a=0;//     .line 672
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00db
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 679
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ow;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 673
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pc;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ow;->d(Lcom/kingroot/kinguser/ow;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v3, :cond_6
a=0;// 
a=0;//     .line 674
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00da
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 675
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->eB()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 676
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00dc
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 621
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
