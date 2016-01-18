package com.kingroot.kinguser.activitys; class SuRequestActivity { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/activitys/SuRequestActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/acv;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;// .field private dK:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/activitys/SuRequestActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dK:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 96
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rn:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lC:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 97
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->ro:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 98
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rp:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 99
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rq:Ljava/lang/String;
a=0;// 
a=0;//     iget v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 100
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rr:Ljava/lang/String;
a=0;// 
a=0;//     iget v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lx:I
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 101
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rt:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 102
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->ru:Ljava/lang/String;
a=0;// 
a=0;//     iget v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 103
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rv:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->ly:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 105
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public av()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dK:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dK:Z
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->finish()V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/model/SuRequestCmdModel;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 32
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rn:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lC:I
a=0;// 
a=0;//     .line 34
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->ro:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rq:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     .line 37
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rr:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lx:I
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rt:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->ru:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     .line 40
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rw;->rv:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->ly:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lJ()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lH()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lI()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->a(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dK:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dK:Z
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->finish()V
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 55
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ack;);
a=0;//     const v2, 0x7f0b0004
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/kingroot/kinguser/ack;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Lcom/kingroot/kinguser/ack;->a(Lcom/kingroot/kinguser/acv;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/ack;->f(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ack;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/SuRequestActivity;->dJ:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ack;->dismiss()V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
}}
