package com.kingroot.kinguser.activitys; class RePackageWarningActivity { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dD:Z
a=0;// 
a=0;// .field private dE:Landroid/widget/Button;
a=0;// 
a=0;// .field private dF:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dD:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dD:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private as()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v2, 0x14000000
a=0;//
a=0;//     return-void
a=0;//
a=0;//     .line 68
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dD:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "http://www.kingroot.net"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/kingroot/kinguser/vb;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 81
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     const/high16 v1, 0x14000000
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/16 v0, 0x1388
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/su;->aQ(I)V
a=0;// 
a=0;//     .line 98
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Landroid/os/Process;->killProcess(I)V
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/System;->exit(I)V
a=0;// 
a=0;//     .line 100
a=0;//     return-void
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Integer);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.category.HOME"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 31
a=0;//     const v0, 0x7f030007
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 33
a=0;//     const v0, 0x7f090047
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dE:Landroid/widget/Button;
a=0;// 
a=0;//     .line 34
a=0;//     const v0, 0x7f090048
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dF:Landroid/widget/Button;
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dE:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/cr;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/cr;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/cr;-><init>(Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/cr;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->dF:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/cs;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/cs;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/cs;-><init>(Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/cs;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 62
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/activitys/RePackageWarningActivity;->as()V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
}}
