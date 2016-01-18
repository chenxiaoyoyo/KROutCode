package com.kingroot.kinguser; class pi { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/pi;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic pV:Lcom/kingroot/kinguser/ph;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ph;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/pi;->pV:Lcom/kingroot/kinguser/ph;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/pi;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 300
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pi;->pV:Lcom/kingroot/kinguser/ph;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ph;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ph;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/KUSettingActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 301
a=0;//     const-string v1, "main_pahe_state"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/pi;->pV:Lcom/kingroot/kinguser/ph;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/ph;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ow;->d(Lcom/kingroot/kinguser/ow;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pi;->pV:Lcom/kingroot/kinguser/ph;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ph;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// .end method
}}
