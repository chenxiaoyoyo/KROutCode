package com.kingroot.kinguser; class adt { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/adt;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static FA:I
a=0;// 
a=0;// .field private static FB:I
a=0;// 
a=0;// .field private static FD:Lcom/kingroot/kinguser/adt;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private FC:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     const/16 v0, 0x29
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/kinguser/adt;->FA:I
a=0;// 
a=0;//     .line 21
a=0;//     const/16 v0, 0x2b
a=0;// 
a=0;//     sput v0, Lcom/kingroot/kinguser/adt;->FB:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adt;);
a=0;//     const-string v0, "android.app.admin.IDevicePolicyManager$Stub"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fy;->R(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     const-string v0, "TRANSACTION_packageHasActiveAdmins"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x29
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/fy;->g(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/kingroot/kinguser/adt;->FA:I
a=0;// 
a=0;//     .line 31
a=0;//     const-string v0, "TRANSACTION_removeActiveAdmin"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x2b
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/fy;->g(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/kingroot/kinguser/adt;->FB:I
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "device_policy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vx;->cg(Ljava/lang/String;)Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adt;->FC:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static ng()Lcom/kingroot/kinguser/adt;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     sget-object v0, Lcom/kingroot/kinguser/adt;->FD:Lcom/kingroot/kinguser/adt;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adt;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     const-class v1, Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 43
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/adt;->FD:Lcom/kingroot/kinguser/adt;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adt;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/adt;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adt;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/adt;->FD:Lcom/kingroot/kinguser/adt;
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/adt;->FD:Lcom/kingroot/kinguser/adt;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 46
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
a=0;// .method public dr(Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adt;->FC:Landroid/os/IBinder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/IBinder;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 60
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 64
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v1, "android.app.admin.IDevicePolicyManager"
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adt;->FC:Landroid/os/IBinder;
a=0;// 
a=0;//     sget v4, Lcom/kingroot/kinguser/adt;->FA:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1, v4, v2, v3, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 71
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Ujava/lang/Object;);v2=(Reference,Landroid/os/Parcel;);v3=(Reference,Landroid/os/Parcel;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 74
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public ds(Ljava/lang/String;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adt;->FC:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.app.action.DEVICE_ADMIN_ENABLED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {v1, v0, v7}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-boolean v3, v3, Landroid/content/pm/ActivityInfo;->enabled:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 104
a=0;//     const-string v4, "service call %s %d i32 1 s16 %s s16 %s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v6, "device_policy"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v5, v7
a=0;// 
a=0;//     sget v6, Lcom/kingroot/kinguser/adt;->FB:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     aput-object v3, v5, v6
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aput-object v0, v5, v3
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 109
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0, v8}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/gn;->k(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     .line 119
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v7
a=0;// .end method
}}
