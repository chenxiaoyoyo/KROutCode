package com.kingroot.sdk.wupsession; class NetworkBroadcastReceiver { void a() { int a;
a=0;// .class public Lcom/kingroot/sdk/wupsession/NetworkBroadcastReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 29
a=0;//     :try_start_0
a=0;//     #v1=(One);
a=0;//     const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     sget-boolean v0, Lkrsdk/g;->e:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "NetworkBroadcastReceiver Not inited."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(One);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/net/NetworkInfo;);
a=0;//     invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 43
a=0;//     sget-object v4, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     #v4=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     if-ne v4, v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 54
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/NetworkBroadcastReceiver;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/sdk/wupsession/c;->c(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "\u83b7\u53d6\u7f51\u7edc\u72b6\u6001\u51fa\u9519"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_2
a=0;//     #v1=(One);v3=(Reference,Landroid/net/NetworkInfo$State;);v4=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 49
a=0;//     sget-object v3, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     #v3=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     if-ne v3, v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 50
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
