package com.kingroot.RushRoot.activities; class g { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/activities/g;
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
a=0;// .field final synthetic b:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/activities/MainActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/activities/g;->b:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/activities/g;->a:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/activities/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 478
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.settings.SETTINGS"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 480
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/activities/g;->b:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/RushRoot/activities/MainActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 481
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/g;->b:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/activities/MainActivity;->e(Lcom/kingroot/RushRoot/activities/MainActivity;)Z
a=0;// 
a=0;//     .line 482
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/g;->b:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/activities/g;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/activities/MainActivity;->a(Lcom/kingroot/RushRoot/activities/MainActivity;I)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 486
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 483
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
