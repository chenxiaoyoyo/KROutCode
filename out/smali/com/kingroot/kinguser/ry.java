package com.kingroot.kinguser; class ry { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ry;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rA:Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;
a=0;// 
a=0;// .field final synthetic rd:Landroid/content/Intent;
a=0;// 
a=0;// .field final synthetic rz:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;Landroid/content/Intent;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ry;->rA:Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/ry;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/ry;->rz:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ry;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ry;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;->bL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ry;->rA:Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ry;->rz:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;->a(Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;->bZ()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;->dD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ry;->rA:Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ry;->rz:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;->b(Lcom/kingroot/kinguser/receiver/ScreenEventReceiver;Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
