package com.kingroot.loader.sdk; class KPApplication { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/loader/sdk/KPApplication;
a=0;// .super Ljava/lang/Object;
a=0;// # done
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/loader/lpinterface/IBridgePluginEnd;
a=0;// .implements Lcom/kingroot/loader/sdk/IKPApplication;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mIsRunning:Z
a=0;// 
a=0;// .field private mKPContext:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;// .field private mRunningReadWriteLock:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mIsRunning:Z
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mRunningReadWriteLock:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final getClassLoader()Ljava/lang/ClassLoader;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mKPContext:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/loader/sdk/KPContext;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getPluginContext()Lcom/kingroot/loader/sdk/KPContext;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mKPContext:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final initInternal(Lcom/kingroot/loader/sdk/KPContext;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/kingroot/loader/sdk/KPApplication;->mKPContext:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final isRunning()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPApplication;->mRunningReadWriteLock:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mIsRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Lcom/kingroot/loader/sdk/KPContext;Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPApplication;->mRunningReadWriteLock:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mIsRunning:Z
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mKPContext:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mKPContext:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/kingroot/loader/sdk/KPContext;->putMetaData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
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
a=0;// .method public onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPApplication;->mRunningReadWriteLock:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/loader/sdk/KPApplication;->mIsRunning:Z
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onLoaderCall(Landroid/os/Bundle;Z)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onUninstall()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
