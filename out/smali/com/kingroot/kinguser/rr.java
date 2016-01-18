package com.kingroot.kinguser; class rr { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/rr;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rd:Landroid/content/Intent;
a=0;// 
a=0;// .field final synthetic rk:Lcom/kingroot/kinguser/receiver/InstallReceiver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/receiver/InstallReceiver;Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/rr;->rk:Lcom/kingroot/kinguser/receiver/InstallReceiver;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/rr;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/rr;);
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
a=0;//     .line 28
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ig;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dJ()V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/gz;->b(Lcom/kingroot/kinguser/hm;)V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cp()V
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->dh()V
a=0;// 
a=0;//     .line 33
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/service/SuService;->jI()V
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rr;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rr;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "package:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ir;->az(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 44
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/fz;->W(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/rs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/rs;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/rs;-><init>(Lcom/kingroot/kinguser/rr;)V
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rs;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 60
a=0;//     return-object v2
a=0;// .end method
}}
