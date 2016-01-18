package com.kingroot.kinguser; class sh { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/sh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/sg;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private kl:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/os/IBinder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 12
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sh;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/sh;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 13
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sh;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bu(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 22
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 25
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "com.tencent.tmsecurelite.IRootService"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 26
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sh;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 30
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// 
a=0;//     .line 30
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 30
a=0;//     throw v0
a=0;// .end method
}}
