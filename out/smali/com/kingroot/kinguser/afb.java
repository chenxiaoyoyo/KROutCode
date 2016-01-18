package com.kingroot.kinguser; class afb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/afb;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/loader/lpinterface/ILoaderToPluginBridge;
a=0;// .implements Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile Gx:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private GA:Ljava/io/File;
a=0;// 
a=0;// .field private GB:Ljava/io/File;
a=0;// 
a=0;// .field private GC:Ljava/io/File;
a=0;// 
a=0;// .field private GD:Ljava/io/File;
a=0;// 
a=0;// .field private GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;// .field private GF:Ljava/util/HashMap;
a=0;// 
a=0;// .field private final GG:Ljava/util/HashMap;
a=0;// 
a=0;// .field private GH:Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;// .field private GI:Landroid/os/HandlerThread;
a=0;// 
a=0;// .field private GJ:Landroid/os/Handler;
a=0;// 
a=0;// .field private GK:Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;// .field private final GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;// .field private final Gy:Ljava/util/HashMap;
a=0;// 
a=0;// .field private final Gz:Ljava/util/HashMap;
a=0;// 
a=0;// .field private mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//	   # done
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/afb;->Gx:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/afb;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/afb;->GA:Ljava/io/File;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/afb;->GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GG:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/afa;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/afa;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afa;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GK:Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/afe;);
a=0;//     invoke-direct {v0, p1}, Lcom/kingroot/kinguser/afe;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afe;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/afj;->S(Landroid/content/Context;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GF:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v1, "AsyncBridgeHT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GI:Landroid/os/HandlerThread;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GI:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GI:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GJ:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/afb;->nB()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/afb;->nA()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static Q(Landroid/content/Context;)Lcom/kingroot/kinguser/afb;
a=0;//	   # done Q == getInstance
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/kinguser/afb;->Gx:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afb;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-class v1, Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/afb;->Gx:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/afb;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/afb;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afb;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/afb;->Gx:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/afb;->Gx:Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     return-object v0
a=0;// 
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
a=0;// .method private R(Ljava/util/List;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/kinguser/afb;->dx(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, v3}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v4
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     monitor-enter v5
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v6, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v5
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :try_start_3
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/afb;->GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Lcom/kingroot/kinguser/afe;->aM(Ljava/lang/String;)V
a=0;// 
a=0;//     monitor-exit v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/kinguser/afg;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/afg;);
a=0;//     invoke-direct {v3, v0}, Lcom/kingroot/kinguser/afg;-><init>(Lcom/kingroot/loader/sdk/KPInfo;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/afg;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v5, :cond_2
a=0;// 
a=0;//     aget-object v6, v4, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v5=(Reference,Ljava/util/HashMap;);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     monitor-exit v5
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :try_start_5
a=0;//     throw v0
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v5, :cond_3
a=0;// 
a=0;//     aget-object v6, v4, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v5, :cond_4
a=0;// 
a=0;//     aget-object v6, v4, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "shared_prefs"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     aget-object v5, v3, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/loader/sdk/KPInfo;Lcom/kingroot/loader/sdk/KPInfo;)I
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p1, Lcom/kingroot/loader/sdk/KPInfo;->rawPluginPath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/4 v0, -0x8
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p1, Lcom/kingroot/loader/sdk/KPInfo;->rawPluginPath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const/4 v0, -0x6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     iget-wide v5, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageCrc32:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-object v7, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v6, v7}, Lcom/kingroot/kinguser/afj;->a(Ljava/io/File;JLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/afi;->n(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v4, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     iget-wide v6, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageCrc32:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     cmp-long v4, v6, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-direct {p0, v2, v3}, Lcom/kingroot/kinguser/afb;->b(Ljava/io/File;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     const/16 v0, -0x9
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/kinguser/afg;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/afg;);
a=0;//     invoke-direct {v2, p2}, Lcom/kingroot/kinguser/afg;-><init>(Lcom/kingroot/loader/sdk/KPInfo;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/afg;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v4, :cond_5
a=0;// 
a=0;//     aget-object v5, v3, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/loader/sdk/KPPackage;)I
a=0;//	   #done
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginSourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x8
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->GA:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const-string v3, "data"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p1, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const/16 v0, -0xb
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "lib"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "lib"
a=0;// 
a=0;//     invoke-static {v1, v0, v3}, Lcom/kingroot/kinguser/afj;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "lib"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     const/16 v0, -0xa
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "lib"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_5
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/afb;)Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GH:Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/loader/sdk/KPInfo;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     iget-wide v2, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageCrc32:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/kingroot/kinguser/afj;->a(Ljava/io/File;JLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v1, v3, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/io/File;->setExecutable(ZZ)Z
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "lib"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "armeabi"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/loader/sdk/KPPackage;-><init>(Lcom/kingroot/loader/sdk/KPInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private final a(Ljava/lang/String;Ljava/lang/ClassLoader;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     new-instance v2, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
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
a=0;// .method private b(Ljava/lang/String;IJ)I
a=0;//     .locals 7
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(One);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, -0x6
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Byte);v2=(One);v3=(Reference,Ljava/io/File;);v4=(Uninit);v5=(LongLo);v6=(LongHi);
a=0;//     new-instance v4, Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     invoke-direct {v4, p1}, Lcom/kingroot/loader/sdk/KPInfo;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/afj;->d(Lcom/kingroot/loader/sdk/KPInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     cmp-long v0, p3, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/afi;->n(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide p3
a=0;// 
a=0;//     :cond_2
a=0;//     cmp-long v0, p3, v5
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const/16 v0, -0x10
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     iput-wide p3, v4, Lcom/kingroot/loader/sdk/KPInfo;->packageCrc32:J
a=0;// 
a=0;//     iget v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->minTargetLoaderVersion:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     iget v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->minTargetLoaderVersion:I
a=0;// 
a=0;//     if-ge v2, v0, :cond_4
a=0;// 
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->maxTargetLoaderVersion:I
a=0;// 
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     iget v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->maxTargetLoaderVersion:I
a=0;// 
a=0;//     if-le v2, v0, :cond_5
a=0;// 
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GF:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v3, v4, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget v3, v4, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_6
a=0;// 
a=0;//     const/16 v0, -0xe
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/afb;->dx(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const/16 v0, -0xd
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "KPPackageManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Err when install plugin "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " with flag "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/16 v0, -0xc
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);v1=(Byte);v2=(One);v4=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);v5=(LongLo);v6=(LongHi);
a=0;//     iget-object v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/afb;->dC(Ljava/lang/String;)Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     const/16 v0, -0x11
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/lang/ClassLoader;);
a=0;//     iget-object v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/afb;->dw(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     iget-object v0, v5, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/loader/sdk/KPInfo;->installState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_a
a=0;// 
a=0;//     iget v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     iget-object v6, v5, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     iget v6, v6, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_9
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p2, v0}, Lcom/kingroot/kinguser/afh;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     const/4 v0, -0x5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);
a=0;//     iget v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     iget-object v6, v5, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     iget v6, v6, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v0, v6, :cond_a
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p2, v0}, Lcom/kingroot/kinguser/afh;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     monitor-exit v3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v5, :cond_b
a=0;// 
a=0;//     iget-object v0, v5, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     invoke-direct {p0, v4, v0}, Lcom/kingroot/kinguser/afb;->a(Lcom/kingroot/loader/sdk/KPInfo;Lcom/kingroot/loader/sdk/KPInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v4}, Lcom/kingroot/kinguser/afb;->a(Lcom/kingroot/loader/sdk/KPInfo;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/afb;->a(Lcom/kingroot/loader/sdk/KPPackage;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_d
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, v4, Lcom/kingroot/loader/sdk/KPInfo;->installState:I
a=0;// 
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afe;);
a=0;//     iget-object v4, v1, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/kingroot/kinguser/afe;->c(Lcom/kingroot/loader/sdk/KPInfo;)V
a=0;// 
a=0;//     :goto_2
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     monitor-enter v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v5, v1, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v4
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :try_start_5
a=0;//     monitor-exit v3
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afe;);
a=0;//     iget-object v4, v1, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/kingroot/kinguser/afe;->b(Lcom/kingroot/loader/sdk/KPInfo;)V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_1
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     monitor-exit v4
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :try_start_7
a=0;//     throw v0
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/io/File;Ljava/io/File;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     invoke-static {p1, p2}, Lcom/kingroot/kinguser/afi;->d(Ljava/io/File;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcom/kingroot/kinguser/afi;->c(Ljava/io/File;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private final dB(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
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
a=0;// .method private final dC(Ljava/lang/String;)Ljava/lang/ClassLoader;
a=0;//	   #done
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/WeakHashMap;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/ClassLoader;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->GL:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private dx(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->GG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
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
a=0;// .method private nA()V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GE:Lcom/kingroot/kinguser/afe;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afe;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/afe;->nC()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GF:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v4, v0, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v4, v0, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v4, v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/kingroot/loader/sdk/KPInfo;->installState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/afb;->a(Lcom/kingroot/loader/sdk/KPInfo;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v0, v0, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v4
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/afb;->R(Ljava/util/List;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private nB()V
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "workspace"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GA:Ljava/io/File;
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GA:Ljava/io/File;
a=0;// 
a=0;//     const-string v2, "app"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v5, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GC:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v4, v3}, Ljava/io/File;->setExecutable(ZZ)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GA:Ljava/io/File;
a=0;// 
a=0;//     const-string v2, "data"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v5, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GB:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v4, v3}, Ljava/io/File;->setExecutable(ZZ)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GA:Ljava/io/File;
a=0;// 
a=0;//     const-string v2, "dalvik-cache"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v5, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GD:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v4, v3}, Ljava/io/File;->setExecutable(ZZ)Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;Landroid/os/Bundle;)I
a=0;//	   #done a==aCreateKPApplication
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPApplication;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPApplication;->getPluginContext()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v1, v0, p2}, Lcom/kingroot/loader/sdk/KPApplication;->onCreate(Lcom/kingroot/loader/sdk/KPContext;Landroid/os/Bundle;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(One);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "KPPackageManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Err when launch plugin "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPApplication;->onDestroy()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_5
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     const-string v2, "KPPackageManager"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Err when destroy plugin "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/kinguser/afa;)V
a=0;//	   #done a=aPutAfa
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GK:Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/afa;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/afb;->GK:Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
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
a=0;// .method public a(Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;)V
a=0;//	   #done a=aPutBridgeLoaderEnd
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/afb;->GH:Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/loader/lpinterface/OnPluginInstallListener;Z)V
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p2, :cond_9
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/afj;->T(Landroid/content/Context;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Reference,Lorg/json/JSONArray;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_8
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "name"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "pkg_name"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "v_code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const-string v7, "crc32"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v4=(Reference,Ljava/lang/String;);v6=(Integer);v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {p0, v5}, Lcom/kingroot/kinguser/afb;->dw(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v9, v2, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     iget-wide v9, v9, Lcom/kingroot/loader/sdk/KPInfo;->packageCrc32:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v9, v7, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     iget-object v9, v2, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     iget v9, v9, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v6, v9, :cond_2
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-static {v0, v9}, Lcom/kingroot/kinguser/afh;->e(II)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {p1, v5, v2}, Lcom/kingroot/loader/lpinterface/OnPluginInstallListener;->onPluginInstallEnd(Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v4, "KPPackageManager"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Err when parse buildin plugin conf"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v6=(Integer);v7=(LongLo);v8=(LongHi);v9=(Integer);v10=(LongHi);
a=0;//     iget-object v2, v2, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget v2, v2, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v6, v2, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/afh;->e(II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, -0x5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {p1, v5, v2}, Lcom/kingroot/loader/lpinterface/OnPluginInstallListener;->onPluginInstallEnd(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     const-string v9, "kpex"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v6, v9, v10}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v2, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/afb;->nz()Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v6, v9, v4, v2}, Lcom/kingroot/kinguser/afa;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v2, -0xf
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {p1, v5, v2}, Lcom/kingroot/loader/lpinterface/OnPluginInstallListener;->onPluginInstallEnd(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/afi;->n(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v4, v7, v9
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     invoke-interface {p1, v5, v4}, Lcom/kingroot/loader/lpinterface/OnPluginInstallListener;->onPluginInstallEnd(Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v4, v0, v7, v8}, Lcom/kingroot/kinguser/afb;->b(Ljava/lang/String;IJ)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz p1, :cond_7
a=0;// 
a=0;//     invoke-interface {p1, v5, v4}, Lcom/kingroot/loader/lpinterface/OnPluginInstallListener;->onPluginInstallEnd(Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_7
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dA(Ljava/lang/String;)Lcom/kingroot/kinguser/aez;
a=0;//	   #done dA=dAGetAezKPFragment
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/aez;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/aez;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/aez;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/aez;);
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aez;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/loader/sdk/KPApplication;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aez;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2}, Lcom/kingroot/loader/sdk/KPApplication;->getPluginContext()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v3}, Lcom/kingroot/loader/sdk/KPContext;->getPackage()Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     iget-object v4, v0, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     iget-object v4, v4, Lcom/kingroot/loader/sdk/KPInfo;->entryFragmentClass:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v3}, Lcom/kingroot/loader/sdk/KPContext;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/ClassLoader;);
a=0;//     iget-object v0, v0, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/loader/sdk/KPInfo;->entryFragmentClass:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/loader/sdk/KPFragment;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/loader/sdk/KPFragment;->initInternal(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_2
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->a(Lcom/kingroot/loader/sdk/KPFragment;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     const-string v3, "KPPackageManager"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Err when create fragment of plugin "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aez;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v3, "KPPackageManager"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Err when create fragment of plugin "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, -0x5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aez;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v3, "KPPackageManager"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Err when create fragment of plugin "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, -0x6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aez;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v5=(Uninit);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/aez;->setResult(I)V
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aez;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;//	   # done dv == getKPApplication
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
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
a=0;// .method public dw(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;//	   # done dv == getKPPackage
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->Gz:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
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
a=0;// .method public dy(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;//	   # done dv == getKPPackageInstalled
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dw(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPInfo;);
a=0;//     iget v1, v1, Lcom/kingroot/loader/sdk/KPInfo;->installState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dz(Ljava/lang/String;)I
a=0;//	   #done
a=0;//     .locals 9
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/afb;->dx(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dy(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/afb;->dC(Ljava/lang/String;)Ljava/lang/ClassLoader;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ClassLoader;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     new-instance v0, Ldalvik/system/DexClassLoader;
a=0;// 
a=0;//     #v0=(UninitRef,Ldalvik/system/DexClassLoader;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginSourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginDexOutPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginLibPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-class v8, Lcom/kingroot/loader/host/KPActivity;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v0, v3, v6, v7, v8}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ldalvik/system/DexClassLoader;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);v2=(Reference,Ljava/lang/ClassLoader;);v5=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "KPPackageManager"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Err when loading plugin "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " : create classloader"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v3, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/afb;->dB(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ClassLoader;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/afb;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v3, v6, v5, p0}, Lcom/kingroot/loader/sdk/KPContext;-><init>(Ljava/lang/ClassLoader;Landroid/content/Context;Lcom/kingroot/loader/sdk/KPPackage;Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Null);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v6, "KPPackageManager"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Err when loading plugin "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " : create context"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_6
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPContext;);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, v5, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/loader/sdk/KPInfo;->entryClass:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/loader/sdk/KPApplication;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     :goto_3
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     :try_start_7
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v3, "KPPackageManager"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Err when loading plugin "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " : instantiate application"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v3, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_8
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/loader/sdk/KPApplication;->initInternal(Lcom/kingroot/loader/sdk/KPContext;)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_3
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     :try_start_9
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     monitor-enter v1
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     :try_start_a
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_b
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);v2=(Reference,Lcom/kingroot/loader/sdk/KPContext;);v3=(Reference,Ujava/lang/Object;);v6=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "KPPackageManager"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Err when loading plugin "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " : initialize application"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, -0x5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     monitor-exit v4
a=0;//     :try_end_b
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_c
a=0;//     monitor-exit v1
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     :try_start_d
a=0;//     throw v0
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public i(Ljava/lang/String;Z)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/afb;->dx(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/loader/sdk/KPApplication;->onDestroy()V
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/afb;->Gy:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/loader/sdk/KPApplication;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/afb;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {}, Ljava/lang/System;->gc()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final nz()Lcom/kingroot/kinguser/afa;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/afb;->GK:Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/afa;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GK:Lcom/kingroot/kinguser/afa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afa;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
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
a=0;// .method public talkToLoader(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GH:Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GH:Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p1, p2, v1}, Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;->onPluginCall(Ljava/lang/String;Landroid/os/Bundle;Z)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public talkToLoader(Ljava/lang/String;Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GH:Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GJ:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/afc;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/afc;);
a=0;//     invoke-direct {v1, p0, p1, p2, p3}, Lcom/kingroot/kinguser/afc;-><init>(Lcom/kingroot/kinguser/afb;Ljava/lang/String;Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/afc;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public talkToPlugin(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/afb;->dv(Ljava/lang/String;)Lcom/kingroot/loader/sdk/KPApplication;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPApplication;);
a=0;//     instance-of v1, v0, Lcom/kingroot/loader/lpinterface/IBridgePluginEnd;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p2, v1}, Lcom/kingroot/loader/lpinterface/IBridgePluginEnd;->onLoaderCall(Landroid/os/Bundle;Z)Landroid/os/Bundle;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public talkToPlugin(Ljava/lang/String;Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/afb;->GJ:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/afd;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/afd;);
a=0;//     invoke-direct {v1, p0, p1, p2, p3}, Lcom/kingroot/kinguser/afd;-><init>(Lcom/kingroot/kinguser/afb;Ljava/lang/String;Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/afd;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
