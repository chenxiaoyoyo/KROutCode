package com.kingroot.kinguser; class afd { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/afd;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic GM:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic GN:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic GO:Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;
a=0;// 
a=0;// .field final synthetic GP:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/afb;Ljava/lang/String;Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/afd;->GP:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/afd;->GM:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/afd;->GN:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/kingroot/kinguser/afd;->GO:Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/afd;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afd;->GP:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afb;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afd;->GM:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     instance-of v1, v0, Lcom/kingroot/loader/lpinterface/IBridgePluginEnd;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afd;->GN:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/kingroot/loader/lpinterface/IBridgePluginEnd;->onLoaderCall(Landroid/os/Bundle;Z)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afd;->GO:Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afd;->GO:Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;->onCallback(Landroid/os/Bundle;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
