package com.kingroot.kinguser.app; class KUApplication { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/app/KUApplication;
a=0;// .super Lcom/kingroot/kinguser/app/AbsApplication;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private eD:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/app/AbsApplication;-><init>()V
a=0;// 
a=0;//     .line 137
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/app/KUApplication;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dl;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/dl;-><init>(Lcom/kingroot/kinguser/app/KUApplication;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dl;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/app/KUApplication;->eD:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aA()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;->z(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/service/SuService;->jI()V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/app/KUApplication;->eD:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/dm;->aB()V
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 101
a=0;//     #v3=(One);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/app/KUApplication;->aA()V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/app/KUApplication;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const-wide/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/util/Encode;->kQ()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/app/AbsApplication;->onCreate()V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ax()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "service"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/sj;->initCrashReport(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/sj;->C(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-wide/16 v0, 0x10
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/android/animation/ObjectAnimator;->setFrameDelay(J)V
a=0;// 
a=0;//     .line 59
a=0;//     :try_start_1
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/sj;->initCrashReport(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/sj;->C(Landroid/content/Context;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 74
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->aZ()V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ft;->cj()V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cV()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 85
a=0;//     :goto_2
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bk()V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "SoftwareUninstallDataCollector"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/aed;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/aed;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/aed;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/aed;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/kh;->a(Ljava/lang/String;Lcom/kingroot/kinguser/ki;)Lcom/kingroot/kinguser/ki;
a=0;// 
a=0;//     .line 89
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "AutoStartDataCollector"
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/kinguser/adc;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/adc;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/adc;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/adc;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/kh;->a(Ljava/lang/String;Lcom/kingroot/kinguser/ki;)Lcom/kingroot/kinguser/ki;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gz()V
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/app/KUApplication;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 80
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
