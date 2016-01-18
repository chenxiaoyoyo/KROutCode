package android.support.v4.media; class TransportMediatorJellybeanMR2$3 { void a() { int a;
a=0;// .class Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/media/TransportMediatorJellybeanMR2;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput-object p1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;->this$0:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     :try_start_0
a=0;//     const-string v0, "android.intent.extra.KEY_EVENT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/KeyEvent;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;->this$0:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     iget-object v1, v1, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Landroid/support/v4/media/TransportMediatorCallback;->handleKey(Landroid/view/KeyEvent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 67
a=0;//     #v0=(Reference,Ljava/lang/ClassCastException;);
a=0;//     const-string v1, "TransportController"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
