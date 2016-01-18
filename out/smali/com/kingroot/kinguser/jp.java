package com.kingroot.kinguser; class jp { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jp;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/jo;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private kk:Ljava/lang/String;
a=0;// 
a=0;// .field private kl:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/os/IBinder;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 259
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jp;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 260
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     .line 261
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/os/IBinder;Ljava/lang/String;)Lcom/kingroot/kinguser/jo;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 247
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/jp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/jp;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/kinguser/jp;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 255
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jp;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(IILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 310
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 312
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const v0, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 321
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 323
a=0;//     return-void
a=0;// 
a=0;//     .line 320
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 321
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public aN(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 344
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 345
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 349
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const v4, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 351
a=0;//     invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v5, v2, v3, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 353
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v0, :cond_0
a=0;// 
a=0;//     .line 356
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 359
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 354
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     :catchall_0
a=0;//     #v0=(One);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public aO(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 364
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 365
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 369
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const v4, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 370
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v5, v2, v3, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 373
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 374
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v0, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 377
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 379
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 374
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 376
a=0;//     :catchall_0
a=0;//     #v0=(One);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 377
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public aS(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 385
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 389
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const v4, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 391
a=0;//     invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v5, v2, v3, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 393
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 394
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v0, :cond_0
a=0;// 
a=0;//     .line 396
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 397
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 399
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 394
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 396
a=0;//     :catchall_0
a=0;//     #v0=(One);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 397
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public ag(Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 274
a=0;//     #v0=(One);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 275
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 277
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const v3, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// 
a=0;//     .line 279
a=0;//     :cond_0
a=0;//     #v0=(One);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public ai(Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 327
a=0;//     #v0=(One);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 328
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 330
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const v3, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 332
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeByte(B)V
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 334
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 336
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 339
a=0;//     return-void
a=0;// 
a=0;//     .line 332
a=0;//     :cond_0
a=0;//     #v0=(One);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 336
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gT()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 290
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 291
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 295
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const v4, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v5, v2, v3, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 298
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v0, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 304
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 299
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 301
a=0;//     :catchall_0
a=0;//     #v0=(One);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public j(IZ)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 405
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 409
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const v3, 0x1332d92
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/jp;->kk:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 412
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jp;->kl:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 414
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 415
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 417
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 418
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 420
a=0;//     return v0
a=0;// 
a=0;//     .line 417
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 418
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
