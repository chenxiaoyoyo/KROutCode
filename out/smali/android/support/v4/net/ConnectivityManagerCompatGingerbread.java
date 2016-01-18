package android.support.v4.net; class ConnectivityManagerCompatGingerbread { void a() { int a;
a=0;// .class Landroid/support/v4/net/ConnectivityManagerCompatGingerbread;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompatGingerbread;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 36
a=0;//     #v1=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Reference,Landroid/net/NetworkInfo;);
a=0;//     invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 42
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :pswitch_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 42
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
