package com.kingroot.RushRoot; class aj { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/aj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/app/Service;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Service;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/aj;);
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/aj;->a:Landroid/app/Service;
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v2}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/aj;->a:Landroid/app/Service;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Service;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v4}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v1, v3, v4, v5}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 27
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/aj;->a:Landroid/app/Service;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Service;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4, v5, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 29
a=0;//     const v1, 0x7fffffff
a=0;// 
a=0;//     .line 32
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/bs;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x12
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v3, v4, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/aj;->a:Landroid/app/Service;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Service;);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 39
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,Landroid/app/Notification;);v3=(Integer);v4=(PosByte);v5=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/aj;->a:Landroid/app/Service;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Service;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Service;->stopForeground(Z)V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
}}
