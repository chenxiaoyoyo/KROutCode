package com.kingroot.kinguser.service; class KuCommonService { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/service/KuCommonService;
a=0;// .super Landroid/app/Service;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private qG:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private sc:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/service/KuCommonService;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sp;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/sp;-><init>(Lcom/kingroot/kinguser/service/KuCommonService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sp;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->qG:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aD(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 88
a=0;//     :pswitch_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/service/KuCommonService;->jH()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "com.shuame.rootgenius"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "46C5914BCBC8BC0696E9E91CDCEC6FE8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "com.shuame.mobile"
a=0;// 
a=0;//     const-string v2, "46C5914BCBC8BC0696E9E91CDCEC6FE8"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "com.shuame.mobile.tv"
a=0;// 
a=0;//     const-string v2, "46C5914BCBC8BC0696E9E91CDCEC6FE8"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v1, "com.shuame.sprite"
a=0;// 
a=0;//     const-string v2, "46C5914BCBC8BC0696E9E91CDCEC6FE8"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private jH()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->qG:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private n(Ljava/lang/String;I)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     .line 101
a=0;//     #v1=(Null);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     .line 102
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/service/KuCommonService;->sc:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/vd;->bX(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0, p1, v3, p2}, Lcom/kingroot/kinguser/st;->a(ILjava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 118
a=0;//     return v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-super {p0}, Landroid/app/Service;->onCreate()V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/service/KuCommonService;->init()V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStartCommand(Landroid/content/Intent;II)I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 47
a=0;//     #v6=(Byte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->gb()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     const-string v1, "req_type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 54
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "req_CallerUid"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 56
a=0;//     #v3=(Integer);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     invoke-virtual {v4, v3}, Lcom/kingroot/kinguser/vb;->getPackagesForUid(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 58
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_3
a=0;// 
a=0;//     .line 59
a=0;//     aget-object v0, v4, v0
a=0;// 
a=0;//     .line 61
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     if-eq v3, v6, :cond_2
a=0;// 
a=0;//     if-eq v2, v6, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     invoke-direct {p0, v0, v2}, Lcom/kingroot/kinguser/service/KuCommonService;->n(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/service/KuCommonService;->aD(I)V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Integer);v3=(Integer);v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0, v3, v2}, Lcom/kingroot/kinguser/st;->a(ILjava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v3=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
}}
