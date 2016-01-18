package com.kingroot.RushRoot; class ah { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/ah;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/ae;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     .line 344
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 345
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ah;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ae;->a(Lcom/kingroot/RushRoot/ae;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/ae;->a(Lcom/kingroot/RushRoot/ae;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 351
a=0;//     const-string v0, "RootExecutor init FAIL."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 386
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 354
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.RootHandler.handleMessage("
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 355
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 361
a=0;//     :pswitch_1
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ae;->b(Lcom/kingroot/RushRoot/ae;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     :pswitch_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ae;->c(Lcom/kingroot/RushRoot/ae;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 367
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/ae;->a(Lcom/kingroot/RushRoot/ae;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ae;->d(Lcom/kingroot/RushRoot/ae;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 373
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ae;->e(Lcom/kingroot/RushRoot/ae;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 376
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ah;->a:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ae;->f(Lcom/kingroot/RushRoot/ae;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 379
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lkrsdk/g;->c()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x15f91
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_6
a=0;//         :pswitch_4
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// .end method
}}
