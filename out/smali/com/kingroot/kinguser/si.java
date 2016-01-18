package com.kingroot.kinguser; class si { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/si;
a=0;// .super Landroid/os/Binder;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/sg;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static b(Landroid/os/IBinder;)Lcom/kingroot/kinguser/sg;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 21
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "com.tencent.tmsecurelite.IRootService"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 25
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     instance-of v1, v0, Lcom/kingroot/kinguser/sg;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 26
a=0;//     check-cast v0, Lcom/kingroot/kinguser/sg;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sh;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sh;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/sh;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sh;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     .line 36
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "com.tencent.tmsecurelite.IRootService"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/si;->bu(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 34
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
