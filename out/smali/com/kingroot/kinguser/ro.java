package com.kingroot.kinguser; class ro { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ro;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rg:Landroid/content/Intent;
a=0;// 
a=0;// .field final synthetic rh:Lcom/kingroot/kinguser/receiver/BootReceiver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/receiver/BootReceiver;Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ro;->rh:Lcom/kingroot/kinguser/receiver/BootReceiver;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/ro;->rg:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ro;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ig;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dJ()V
a=0;// 
a=0;//     .line 27
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/gz;->b(Lcom/kingroot/kinguser/hm;)V
a=0;// 
a=0;//     .line 28
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->dh()V
a=0;// 
a=0;//     .line 29
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/service/SuService;->jI()V
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ro;->rg:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "android.intent.action.BOOT_COMPLETED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fm()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ji;->ah(Z)V
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/receiver/BootReceiver;->bt()Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 41
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
}}
