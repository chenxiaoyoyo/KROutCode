package com.kingroot.kinguser; class sl { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/sl;
a=0;// .super Landroid/os/Binder;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/sk;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Landroid/os/Binder;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sl;);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p0, v0}, Lcom/kingroot/kinguser/sl;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 44
a=0;//     #v6=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 110
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 46
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 56
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 58
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/kingroot/kinguser/sl;->a(Ljava/lang/String;ILjava/lang/String;J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 60
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 71
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 73
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/kingroot/kinguser/sl;->b(Ljava/lang/String;ILjava/lang/String;J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 77
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     :sswitch_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/sl;->bv(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :sswitch_4
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/sl;->jD()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 93
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     :sswitch_5
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/sl;->jE()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :sswitch_6
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "com.kingroot.kinguser.service.IKingrootAppList"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/sl;->jF()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 107
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_2
a=0;//         0x3 -> :sswitch_3
a=0;//         0x4 -> :sswitch_4
a=0;//         0x5 -> :sswitch_5
a=0;//         0x6 -> :sswitch_6
a=0;//         0x5f4e5446 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
