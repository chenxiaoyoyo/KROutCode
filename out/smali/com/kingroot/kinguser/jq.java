package com.kingroot.kinguser; class jq { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/jq;
a=0;// .super Landroid/os/Binder;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/jo;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private km:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/os/IBinder;Ljava/lang/String;)Lcom/kingroot/kinguser/jo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jo;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-interface {p0, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 116
a=0;//     #v0=(Reference,Landroid/os/IInterface;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     instance-of v1, v0, Lcom/kingroot/kinguser/jo;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     check-cast v0, Lcom/kingroot/kinguser/jo;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/jp;->a(Landroid/os/IBinder;Ljava/lang/String;)Lcom/kingroot/kinguser/jo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 172
a=0;//     .line 174
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/jq;->km:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 231
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 178
a=0;//     :pswitch_0
a=0;//     #v0=(Null);v1=(One);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/jq;->ag(Z)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jq;->gT()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 190
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 191
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 192
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v2, v3}, Lcom/kingroot/kinguser/jq;->a(IILjava/lang/String;)V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     :pswitch_3
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readByte()B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/jq;->ai(Z)V
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :pswitch_4
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/jq;->aN(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     :pswitch_5
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 210
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/jq;->aO(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :pswitch_6
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 216
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/jq;->aS(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :pswitch_7
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 222
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v1, :cond_6
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 223
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v2, v0}, Lcom/kingroot/kinguser/jq;->j(IZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getInterfaceDescriptor()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jq;->km:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0x1332d92
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/kingroot/kinguser/jq;->a(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 159
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->setDataPosition(I)V
a=0;// 
a=0;//     .line 159
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
