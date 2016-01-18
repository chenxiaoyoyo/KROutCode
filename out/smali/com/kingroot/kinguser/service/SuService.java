package com.kingroot.kinguser.service; class SuService { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/service/SuService;
a=0;// .super Landroid/app/Service;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;// .field private sh:Lcom/kingroot/kinguser/vw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/service/SuService;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static jI()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     const-class v1, Lcom/kingroot/kinguser/service/SuService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 78
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 80
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/kingroot/kinguser/service/SuService;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 84
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// 
a=0;//     .line 84
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 82
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static jJ()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/kingroot/kinguser/service/SuService;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-super {p0}, Landroid/app/Service;->onCreate()V
a=0;// 
a=0;//     .line 23
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/tt;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/sr;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/sr;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/sr;-><init>(Lcom/kingroot/kinguser/service/SuService;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/sr;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/tt;-><init>(Landroid/content/Context;Lcom/kingroot/kinguser/tu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/tt;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/tt;->ky()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/vw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/vw;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/vw;-><init>(Landroid/app/Service;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vw;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sh:Lcom/kingroot/kinguser/vw;
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sh:Lcom/kingroot/kinguser/vw;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vw;->lN()V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sh:Lcom/kingroot/kinguser/vw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vw;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vw;->lO()V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/tt;->kz()V
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/SuService;->sg:Lcom/kingroot/kinguser/tt;
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/tt;);
a=0;//     invoke-super {p0}, Landroid/app/Service;->onDestroy()V
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart(Landroid/content/Intent;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUnbind(Landroid/content/Intent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
