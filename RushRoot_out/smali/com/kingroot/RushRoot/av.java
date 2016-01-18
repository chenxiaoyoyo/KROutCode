package com.kingroot.RushRoot; class av { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/av;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// .field private static b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     .line 17
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 95
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/av;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const-class v1, Lcom/kingroot/RushRoot/av;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 58
a=0;//     :try_start_0
a=0;//     sget v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     sget v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     sput v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "WakeLockMgr|release, count:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v2, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     sget v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 69
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
a=0;// 
a=0;//     .line 70
a=0;//     const-string v0, "WakeLockMgr|release lock"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     .line 75
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const-class v1, Lcom/kingroot/RushRoot/av;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 25
a=0;//     :try_start_0
a=0;//     sget v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "WakeLockMgr|lock, count:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v2, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 30
a=0;//     sget v0, Lcom/kingroot/RushRoot/av;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-le v0, v2, :cond_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(One);v3=(Uninit);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     :try_start_1
a=0;//     const-string v0, "power"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/PowerManager;
a=0;// 
a=0;//     const v2, 0x20000001
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "wk_mgr"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/av;->b:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
a=0;// 
a=0;//     .line 45
a=0;//     const-string v0, "WakeLockMgr|acquire lock"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 37
a=0;//     :catch_0
a=0;//     #v2=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
}}
