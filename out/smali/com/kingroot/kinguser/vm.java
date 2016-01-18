package com.kingroot.kinguser; class vm { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/vm;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile vmSendMessage done"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static b(Ljava/lang/Runnable;)V
a=0;//     #done b == SendMessage
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 25
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vl;->lh()Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vl;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, p0}, Lcom/kingroot/kinguser/vl;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/Runnable;J)V
a=0;//	   #done b == SendMessage
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vl;->lh()Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vl;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 43
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
