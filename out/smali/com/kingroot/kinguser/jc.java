package com.kingroot.kinguser; class jc { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jc;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile jA:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//	   # done
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 246
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 247
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "RootManagerSetting"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     .line 248
a=0;//     new-instance v0, Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/jd;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/jd;-><init>(Lcom/kingroot/kinguser/jc;Landroid/content/SharedPreferences$Editor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private L(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 553
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KWorkStatus"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 554
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static eA()Lcom/kingroot/kinguser/jc;
a=0;// 	   # done eA == getInstance()s
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jc;->jA:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 253
a=0;//     const-class v1, Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 254
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jc;->jA:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     new-instance v0, Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/jc;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jc;->jA:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 259
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jc;->jA:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 257
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public A(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 787
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastIRM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 788
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public A(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "NeedEnterGuideView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 408
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public B(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 796
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastIReportM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 797
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public B(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsKU"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 416
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public C(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 840
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuUpdateNotifyTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 841
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public C(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "CanGetRoot"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 425
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public D(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 878
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "CloudCmdCheckInterverTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 879
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public D(Z)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const v3, 0x186ce
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v2, 0x186cd
a=0;// 
a=0;//     .line 474
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SuBackup"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 476
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 478
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/st;->aH(I)V
a=0;// 
a=0;//     .line 479
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/st;->aI(I)V
a=0;// 
a=0;//     .line 488
a=0;//     :goto_0
a=0;//     const v0, 0x186cf
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 489
a=0;//     return-void
a=0;// 
a=0;//     .line 483
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/st;->aH(I)V
a=0;// 
a=0;//     .line 484
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/st;->aI(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public E(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 951
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "NotifyInstallKmTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 952
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public E(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 496
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsFirstTimeAddShell"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 497
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public F(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1021
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KmDownLoadCheckInterverTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1022
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public F(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 520
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v2, "SuCanRep"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 521
a=0;//     return-void
a=0;// 
a=0;//     .line 520
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public G(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1054
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "ScreenOffActionExpired"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1055
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public G(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsSurvivalMode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 608
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public H(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1111
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "RDULastTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public H(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 632
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KForbidKnoxAskFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 633
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public I(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "PermissionDialogTimeout"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 301
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public I(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1245
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "ApkLastUpdateTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 1246
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public I(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 676
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsDrInjectExceedMaxFCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 677
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public J(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "PermissionTimeoutResponse"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 309
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public J(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1337
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KdStartupReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1338
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public J(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 688
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsDrCauReb"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 689
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public K(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LogLimitTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 342
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public K(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 740
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KCloudInjectSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 741
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public L(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsReportProfile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 768
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public M(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KWorkStatusMCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 581
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public M(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 810
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "WiFiAutoDownload"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 811
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public N(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KStatusReportSuReplaceCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 599
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public N(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 820
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuIsNewVersion"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 821
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public O(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 666
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KSuMode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 668
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jh;->gK()Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/jh;->Y(I)V
a=0;// 
a=0;//     .line 669
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public O(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 860
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuUpdateNotifyFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 861
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public P(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 850
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuUpdateTryCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 851
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public P(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 969
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KCloudShowKmInMainPageSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 970
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public Q(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 870
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuInstallNotifyCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 871
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public Q(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 979
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KCloudCleanRedundantNoticeTipsSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 980
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public R(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 914
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kmDownloadTryCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 915
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public R(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 989
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KCloudShowKmInAutoStartMgrSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 990
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public S(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 959
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "NotifyInstallKmCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 960
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public S(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 997
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SwitcherAttProDis"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 998
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public T(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1038
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KuSilentUpdateCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1039
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public T(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1005
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SwitcherAttProDel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1006
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public U(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1091
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KuCurrentBuildNo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1092
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public U(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1013
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SwitcherAttNoPro"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1014
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public V(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1219
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KuUpdate2SystemAppCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public V(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1030
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "ChannelCloudDefense"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1031
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public W(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1354
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KuRootingType"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1355
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public W(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1046
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "isKuSilentUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1047
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public X(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1063
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SwitcherAutoSilentUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1064
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public Y(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1072
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "WiFiAutoUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1073
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public Z(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1081
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SwitcherUninstallInterfaceFor3Dr"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1082
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aG(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 505
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastMTipId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 506
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aH(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "VcFtShow"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 529
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aI(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "VcFileCreate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 537
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 830
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuUpdateApkName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 831
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aK(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 924
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuUpdateVersionName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 925
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aL(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 934
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "kuUpdateBuildNo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 935
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aa(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1120
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "RDULastResultIsSuccess"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ab(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1150
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "ShouldEnterKrPlugin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1151
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ac(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1159
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "ShouldActiveKrPlugin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1160
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ad(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1234
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "HasKuUpdate2SystemAppt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1235
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ae(Z)V
a=0;//	   # done ae == putAutoReplacementFlag()
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1310
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v2, "AutoReplacementFlag"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1312
a=0;//     return-void
a=0;// 
a=0;//     .line 1310
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public af(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1361
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "NeedShowHelpNewTag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1362
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ag(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 749
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "InstallRecoveryLocation"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 750
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dw()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 744
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "InstallRecoveryLocation"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "/system/etc/install-recovery.sh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public eB()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 264
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "SettingMode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 265
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public eC()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "PermissionDialogTimeout"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eD()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 305
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "PermissionTimeoutResponse"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eE()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LogEnable"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eF()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LogLimitTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eG()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LogLimit"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x1f4
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eH()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 355
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "CouDef"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eI()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastReCouLsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eJ()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastSotLsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eK()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "NeedEnterGuideView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eL()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsKU"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eM()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "CanGetRoot"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eN()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "ExpiredEevenDays"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eO()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "CouExpiredOneDay"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eP()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 446
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SAExpiredOneDay"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eQ()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "CouNTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eR()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SuBackup"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eS()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 493
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsFirstTimeAddShell"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eT()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastMTipId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public eU()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 510
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "SuCanRep"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 511
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public eV()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 515
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "SuCanRep"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 516
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public eW()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "VcFtShow"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public eX()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "VcFileCreate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public eY()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 541
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastStaticsReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public eZ()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 549
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KWorkStatus"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fA()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 835
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuUpdateNotifyTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fB()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuUpdateTryCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fC()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 855
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuUpdateNotifyFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fD()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 865
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuInstallNotifyCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fE()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 875
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "CloudCmdCheckInterverTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/32 v2, 0x6ddd00
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fF()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 887
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "AttCheckFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 888
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/em;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fG()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 892
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "AttCheckFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 893
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     const-string v2, "AttCheckFlag"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/em;->f(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 894
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fH()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 898
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "AttCheckFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 899
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/em;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fI()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 903
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "AttCheckFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 904
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     const-string v2, "AttCheckFlag"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/em;->f(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 905
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fJ()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 909
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kmDownloadTryCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fK()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 919
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuUpdateVersionName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0.0.0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public fL()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 929
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuUpdateBuildNo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public fM()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 948
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "NotifyInstallKmTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fN()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 956
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "NotifyInstallKmCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fO()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 964
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KCloudShowKmInMainPageSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fP()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 974
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KCloudCleanRedundantNoticeTipsSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fQ()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 984
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KCloudShowKmInAutoStartMgrSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fR()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 994
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SwitcherAttProDis"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fS()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1002
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SwitcherAttProDel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fT()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1010
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SwitcherAttNoPro"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fU()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1018
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KmDownLoadCheckInterverTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fV()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1026
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "ChannelCloudDefense"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fW()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1035
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KuSilentUpdateCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fX()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1043
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "isKuSilentUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fY()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1051
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "ScreenOffActionExpired"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fZ()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1059
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SwitcherAutoSilentUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fa()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jc;->eZ()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public fb()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jc;->eZ()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 563
a=0;//     #v0=(Integer);
a=0;//     or-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 564
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/jc;->L(I)V
a=0;// 
a=0;//     .line 565
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fc()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jc;->eZ()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 570
a=0;//     #v0=(Integer);
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 571
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/jc;->L(I)V
a=0;// 
a=0;//     .line 572
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fd()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KWorkStatusMCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fe()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KStatusReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public ff()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KStatusReportSuReplaceCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fg()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsSurvivalMode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fh()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 617
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastCheckRootPowerTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 618
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     const-wide/32 v2, 0x1ee62800
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     .line 620
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/jc;->t(J)V
a=0;// 
a=0;//     .line 622
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fi()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 627
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KForbidKnoxAskFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fj()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 637
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastPermitStaticsReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fk()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x1ed
a=0;// 
a=0;//     .line 645
a=0;//     #v0=(PosShort);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "KSuMode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 646
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 647
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 660
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/jc;->O(I)V
a=0;// 
a=0;//     .line 662
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 650
a=0;//     :cond_1
a=0;//     #v0=(PosShort);v2=(PosByte);
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     .line 651
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Coolpad 8720L"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 653
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gp;->cW()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 656
a=0;//     const/16 v0, 0xded
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public fl()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 680
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsDrInjectExceedMaxFCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fm()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsDrCauReb"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fn()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 702
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "NetworkTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fo()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastCheckReportProfileTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fp()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastPresentVerifyKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fq()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 730
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastCCouLsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fr()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 735
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KCloudInjectSwitch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fs()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 758
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "RepackageCheckTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public ft()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 762
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsReportProfile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fu()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 777
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastCheckRootEnvTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 778
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 779
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     const-wide/32 v2, 0xa4cb800
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     .line 780
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/jc;->z(J)V
a=0;// 
a=0;//     .line 782
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fv()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastIRM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fw()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 800
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "LastIReportM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public fx()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 806
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "WiFiAutoDownload"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fy()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 815
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuIsNewVersion"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fz()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 825
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "kuUpdateApkName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gA()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 1296
a=0;//     #v3=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "AutoReplacementFlag"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1297
a=0;//     #v1=(Integer);
a=0;//     if-ne v3, v1, :cond_0
a=0;// 
a=0;//     .line 1298
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jc;->gz()V
a=0;// 
a=0;//     .line 1299
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "AutoReplacementFlag"
a=0;// 
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1303
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public gB()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1321
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "need_to_show_root_obtained_tip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gC()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1328
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "need_to_show_root_obtained_tip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gD()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1333
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KdStartupReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public gE()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1347
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KuRootingType"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gF()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1368
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "NeedShowHelpNewTag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ga()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1068
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "WiFiAutoUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gb()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1077
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "SwitcherUninstallInterfaceFor3Dr"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gd()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1086
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KuCurrentBuildNo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ge()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1098
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "RDUIsFirstTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gf()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1102
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "RDUIsFirstTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gg()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1107
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "RDULastTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public gh()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1116
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "RDULastResultIsSuccess"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gi()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1127
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsFirstReportDFGI"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gj()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1131
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsFirstReportDFGI"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gk()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1136
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "IsKmInstalledWithKu"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gl()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1141
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "IsKmInstalledWithKu"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1142
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gm()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1146
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "ShouldEnterKrPlugin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gn()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1155
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "ShouldActiveKrPlugin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public go()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1167
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "HasShowMainOnekeyPurify"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gp()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1174
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "HasShowMainOnekeyPurify"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gq()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1182
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "HasShowOtherStateOnMain"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gr()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1189
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "HasShowOtherStateOnMain"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1190
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gs()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1197
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "HasOnClickKmPage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gt()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1204
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "HasOnClickKmPage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1205
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gu()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1212
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "KuUpdate2SystemAppCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gv()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1227
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "HasKuUpdate2SystemAppt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gw()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1241
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "ApkLastUpdateTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public gx()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1253
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "is_need_show_update_guide_view"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1254
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/um;->kL()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1255
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jc;->eW()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1257
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     if-le v1, v0, :cond_0
a=0;// 
a=0;//     .line 1258
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1260
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public gy()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1264
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "is_need_show_update_guide_view"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/um;->kL()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1265
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gz()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 1275
a=0;//     #v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jy:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "AutoReplacementFlag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1276
a=0;//     #v0=(Integer);
a=0;//     if-ne v2, v0, :cond_0
a=0;// 
a=0;//     .line 1279
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jc;->eW()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1281
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "AutoReplacementFlag"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 1289
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 1285
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "AutoReplacementFlag"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public l(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 380
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastReCouLsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 381
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public m(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastSotLsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 389
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public n(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "ExpiredEevenDays"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 434
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public o(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 441
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "CouExpiredOneDay"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 442
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public p(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "SAExpiredOneDay"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 450
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public q(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "CouNTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 458
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public r(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 544
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastStaticsReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 545
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public s(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 589
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "KStatusReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 590
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public t(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 612
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastCheckRootPowerTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 613
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public u(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastPermitStaticsReportTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 641
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public v(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 697
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "NetworkTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 698
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public w(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 707
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastCheckReportProfileTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 708
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public x(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastCCouLsTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 727
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public y(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "RepackageCheckTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 755
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public y(Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const v4, 0x186c8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const v3, 0x186c7
a=0;// 
a=0;//     .line 269
a=0;//     #v3=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 270
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v2, "SettingMode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/jd;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 272
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 274
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/st;->aH(I)V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/st;->aI(I)V
a=0;// 
a=0;//     .line 284
a=0;//     :goto_1
a=0;//     const v0, 0x186c9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 285
a=0;//     return-void
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);v1=(Reference,Lcom/kingroot/kinguser/jd;);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/st;->aH(I)V
a=0;// 
a=0;//     .line 280
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/st;->aI(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public z(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 772
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "LastCheckRootEnvTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/kingroot/kinguser/jd;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 773
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public z(Z)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const v3, 0x186cb
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v2, 0x186ca
a=0;// 
a=0;//     .line 358
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jc;->jz:Lcom/kingroot/kinguser/jd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const-string v1, "CouDef"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/kingroot/kinguser/jd;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 360
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 362
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/st;->aH(I)V
a=0;// 
a=0;//     .line 363
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/st;->aI(I)V
a=0;// 
a=0;//     .line 372
a=0;//     :goto_0
a=0;//     const v0, 0x186cc
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 373
a=0;//     return-void
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/st;->aH(I)V
a=0;// 
a=0;//     .line 368
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/st;->aI(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
