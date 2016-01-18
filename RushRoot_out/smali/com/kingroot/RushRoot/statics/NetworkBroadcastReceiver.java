package com.kingroot.RushRoot.statics; class NetworkBroadcastReceiver { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract a()V
a=0;// .end method
a=0;// 
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 28
a=0;//     #v2=(One);
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 42
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v2, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     const-string v4, "android.net.wifi.STATE_CHANGE"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     #v3=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     if-ne v0, v3, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 56
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;->a()V
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 34
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/net/ConnectivityManager;);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 36
a=0;//     const-string v3, "conn.getActiveNetworkInfo() throw e"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);v4=(Integer);
a=0;//     const-string v4, "android.net.conn.CONNECTIVITY_CHANGE"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     #v3=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     if-ne v0, v3, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);v3=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
