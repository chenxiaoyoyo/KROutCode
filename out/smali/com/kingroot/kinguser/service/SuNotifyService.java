package com.kingroot.kinguser.service; class SuNotifyService { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/service/SuNotifyService;
a=0;// .super Landroid/app/Service;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private se:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/service/SuNotifyService;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sq;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/sq;-><init>(Lcom/kingroot/kinguser/service/SuNotifyService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sq;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/SuNotifyService;->se:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private au()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/SuNotifyService;->se:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/kingroot/kinguser/service/SuNotifyService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 65
a=0;//     const-string v1, "su_cmd"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onStartCommand(Landroid/content/Intent;II)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     const-string v0, "su_cmd"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 32
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     instance-of v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 33
a=0;//     check-cast v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     .line 34
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/im;->dR()Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/im;->au(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0, p3}, Lcom/kingroot/kinguser/service/SuNotifyService;->stopSelf(I)V
a=0;// 
a=0;//     .line 57
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);v1=(Integer);v2=(PosByte);
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 39
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/im;->dR()Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/im;->b(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 41
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/rz;->jy()Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/rz;->c(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dJ()V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/service/SuNotifyService;->au()V
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/service/SuService;->jI()V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fn;->cc()Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fn;->ce()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
