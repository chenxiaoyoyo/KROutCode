package com.kingroot.kinguser; class lr { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/lr;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic mN:Landroid/app/Activity;
a=0;// 
a=0;// .field final synthetic mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/lo;Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/lr;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/lr;->mN:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/lr;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public g(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lr;->mN:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/KUSettingActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 303
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 305
a=0;//     const-string v1, "action"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lr;->mN:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// .end method
}}
