package com.kingroot.kinguser.receiver; class ConnectionChangeReceiver { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static ri:Z
a=0;// 
a=0;// .field private static rj:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;->ri:Z
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Lcom/kingroot/kinguser/rq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/rq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/rq;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rq;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;->rj:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic av(Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     sput-boolean p0, Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;->ri:Z
a=0;// 
a=0;//     return p0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic jr()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;->ri:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 24
a=0;//     sget-object v1, Lcom/kingroot/kinguser/receiver/ConnectionChangeReceiver;->rj:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/vz;->C(Ljava/util/List;)Z
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
}}
