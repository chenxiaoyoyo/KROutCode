package com.kingroot.kinguser.activitys; class SuNotifyActivity { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/activitys/SuNotifyActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static TAG:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dH:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     const-string v0, "SuNotifyActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/activitys/SuNotifyActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/activitys/SuNotifyActivity;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ct;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ct;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ct;-><init>(Lcom/kingroot/kinguser/activitys/SuNotifyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ct;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/SuNotifyActivity;->dH:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private au()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/SuNotifyActivity;->dH:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/SuNotifyActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dJ()V
a=0;// 
a=0;//     .line 28
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->dg()V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/activitys/SuNotifyActivity;->au()V
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/service/SuService;->jI()V
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/SuNotifyActivity;->finish()V
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
}}
