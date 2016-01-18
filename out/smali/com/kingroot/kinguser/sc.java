package com.kingroot.kinguser; class sc { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/sc;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rR:Lcom/kingroot/kinguser/receiver/SuRequestReceiver;
a=0;// 
a=0;// .field final synthetic rd:Landroid/content/Intent;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/receiver/SuRequestReceiver;Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/sc;->rR:Lcom/kingroot/kinguser/receiver/SuRequestReceiver;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/model/SuRequestCmdModel;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "srr1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "srr2"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lx:I
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "srr3"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->ly:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v2, "srr4"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v2, "srr5"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lA:I
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sc;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "srr6"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     .line 41
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 43
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/im;->dR()Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/im;->au(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);v1=(Integer);v2=(PosByte);
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/im;->dR()Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/im;->b(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/rz;->jy()Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/rz;->c(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
