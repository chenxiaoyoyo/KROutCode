package com.kingroot.common.reportroot.receiver; class RRScreenLockReceiver { void a() { int a;
a=0;// .class public Lcom/kingroot/common/reportroot/receiver/RRScreenLockReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/common/reportroot/receiver/RRScreenLockReceiver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 17
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-string v0, "android.intent.action.SCREEN_OFF"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 18
a=0;//     const-string v0, "Screen Off!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 21
a=0;//     const-wide/32 v0, 0x240c8400
a=0;// 
a=0;//     .line 22
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 23
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v6, "reportroot_name_timestamp"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p1, v6, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "reportroot_key_last_scan_su_time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, v7, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 22
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long/2addr v4, v6
a=0;// 
a=0;//     .line 21
a=0;//     sub-long/2addr v0, v4
a=0;// 
a=0;//     .line 24
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/ez;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     cmp-long v5, v0, v2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v4, v0, v1}, Lcom/kingroot/RushRoot/ez;->a(J)V
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Reference,Lcom/kingroot/RushRoot/ez;);v5=(Byte);v6=(LongLo);v7=(LongHi);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 24
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 26
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "android.intent.action.SCREEN_ON"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     const-string v0, "Screen On!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/ez;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ez;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/ez;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ez;->a()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
