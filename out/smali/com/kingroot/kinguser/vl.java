package com.kingroot.kinguser; class vl { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/vl;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile vlHandler done"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile un:Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//	   #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/vl;->un:Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Looper;)V
a=0;//	   #done
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/vl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static lh()Lcom/kingroot/kinguser/vl;
a=0;//	   #done lh == getInstance();
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vl;->un:Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vl;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 25
a=0;//     const-class v1, Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 26
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vl;->un:Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/vl;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/vl;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vl;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/vl;->un:Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vl;->un:Lcom/kingroot/kinguser/vl;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 46
a=0;//     :pswitch_0
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     instance-of v0, v0, Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
