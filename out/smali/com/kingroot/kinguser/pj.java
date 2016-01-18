package com.kingroot.kinguser; class pj { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/pj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/pj;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/pj;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     const v0, 0x18759
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 368
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 369
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pj;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ow;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/LogActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 370
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pj;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ow;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 371
a=0;//     return-void
a=0;// .end method
}}
