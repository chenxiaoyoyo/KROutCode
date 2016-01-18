package com.kingroot.RushRoot.activities; class n { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/activities/n;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:I
a=0;// 
a=0;// .field final synthetic b:Lcom/kingroot/RushRoot/activities/MainFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/activities/MainFragment;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/activities/n;->b:Lcom/kingroot/RushRoot/activities/MainFragment;
a=0;// 
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/activities/n;->a:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/activities/n;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 584
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.settings.SETTINGS"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 586
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/activities/n;->b:Lcom/kingroot/RushRoot/activities/MainFragment;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/RushRoot/activities/MainFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 587
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/n;->b:Lcom/kingroot/RushRoot/activities/MainFragment;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/activities/MainFragment;->b(Lcom/kingroot/RushRoot/activities/MainFragment;)Z
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/n;->b:Lcom/kingroot/RushRoot/activities/MainFragment;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/activities/n;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/activities/MainFragment;->a(Lcom/kingroot/RushRoot/activities/MainFragment;I)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 592
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 589
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
