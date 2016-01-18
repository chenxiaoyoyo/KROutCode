package com.android.util; class ViewServer { void a() { int a;
a=0;// .class public Lcom/android/util/ViewServer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BUILD_TYPE_USER:Ljava/lang/String; = "user"
a=0;// 
a=0;// .field private static final COMMAND_PROTOCOL_VERSION:Ljava/lang/String; = "PROTOCOL"
a=0;// 
a=0;// .field private static final COMMAND_SERVER_VERSION:Ljava/lang/String; = "SERVER"
a=0;// 
a=0;// .field private static final COMMAND_WINDOW_MANAGER_AUTOLIST:Ljava/lang/String; = "AUTOLIST"
a=0;// 
a=0;// .field private static final COMMAND_WINDOW_MANAGER_GET_FOCUS:Ljava/lang/String; = "GET_FOCUS"
a=0;// 
a=0;// .field private static final COMMAND_WINDOW_MANAGER_LIST:Ljava/lang/String; = "LIST"
a=0;// 
a=0;// .field private static final ENABLE:Z = false
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "ViewServer"
a=0;// 
a=0;// .field private static final VALUE_PROTOCOL_VERSION:Ljava/lang/String; = "4"
a=0;// 
a=0;// .field private static final VALUE_SERVER_VERSION:Ljava/lang/String; = "4"
a=0;// 
a=0;// .field private static final VIEW_SERVER_DEFAULT_PORT:I = 0x134b
a=0;// 
a=0;// .field private static final VIEW_SERVER_MAX_CONNECTIONS:I = 0xa
a=0;// 
a=0;// .field private static sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;// .field private mFocusedWindow:Landroid/view/View;
a=0;// 
a=0;// .field private final mListeners:Ljava/util/List;
a=0;// 
a=0;// .field private final mPort:I
a=0;// 
a=0;// .field private mServer:Ljava/net/ServerSocket;
a=0;// 
a=0;// .field private mThread:Ljava/lang/Thread;
a=0;// 
a=0;// .field private mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// .field private final mWindows:Ljava/util/HashMap;
a=0;// 
a=0;// .field private final mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 143
a=0;//     #p0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mWindows:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 190
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/android/util/ViewServer;->mPort:I
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 143
a=0;//     #p0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mWindows:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 202
a=0;//     iput p1, p0, Lcom/android/util/ViewServer;->mPort:I
a=0;// 
a=0;//     .line 203
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/android/util/ViewServer$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-direct {p0}, Lcom/android/util/ViewServer;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Ljava/net/Socket;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-static {p0, p1}, Lcom/android/util/ViewServer;->writeValue(Ljava/net/Socket;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lcom/android/util/ViewServer;)Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Lcom/android/util/ViewServer;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mFocusedWindow:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Lcom/android/util/ViewServer;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindows:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Lcom/android/util/ViewServer;)Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Lcom/android/util/ViewServer;Lcom/android/util/ViewServer$WindowListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-direct {p0, p1}, Lcom/android/util/ViewServer;->addWindowListener(Lcom/android/util/ViewServer$WindowListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Lcom/android/util/ViewServer;Lcom/android/util/ViewServer$WindowListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-direct {p0, p1}, Lcom/android/util/ViewServer;->removeWindowListener(Lcom/android/util/ViewServer$WindowListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addWindowListener(Lcom/android/util/ViewServer$WindowListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 451
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private fireFocusChangedEvent()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/util/ViewServer$WindowListener;
a=0;// 
a=0;//     .line 443
a=0;//     invoke-interface {v0}, Lcom/android/util/ViewServer$WindowListener;->focusChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 445
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private fireWindowsChangedEvent()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/util/ViewServer$WindowListener;
a=0;// 
a=0;//     .line 437
a=0;//     invoke-interface {v0}, Lcom/android/util/ViewServer$WindowListener;->windowsChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 439
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static get(Landroid/content/Context;)Lcom/android/util/ViewServer;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 169
a=0;//     #v0=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     const-string v1, "user"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Landroid/os/Build;->TYPE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 171
a=0;//     sget-object v0, Lcom/android/util/ViewServer;->sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     new-instance v0, Lcom/android/util/ViewServer;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/util/ViewServer;);
a=0;//     const/16 v1, 0x134b
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Lcom/android/util/ViewServer;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     sput-object v0, Lcom/android/util/ViewServer;->sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/android/util/ViewServer;->sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/util/ViewServer;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/android/util/ViewServer;->sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     invoke-virtual {v0}, Lcom/android/util/ViewServer;->start()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/android/util/ViewServer;->sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/ViewServer;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 183
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     new-instance v0, Lcom/android/util/ViewServer$NoopViewServer;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/util/ViewServer$NoopViewServer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Lcom/android/util/ViewServer$NoopViewServer;-><init>(Lcom/android/util/ViewServer$1;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/ViewServer$NoopViewServer;);
a=0;//     sput-object v0, Lcom/android/util/ViewServer;->sServer:Lcom/android/util/ViewServer;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private removeWindowListener(Lcom/android/util/ViewServer$WindowListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 455
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeValue(Ljava/net/Socket;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 413
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 415
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 416
a=0;//     #v3=(Reference,Ljava/io/OutputStream;);
a=0;//     new-instance v2, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v4, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     const/16 v3, 0x2000
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v2, v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 417
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/BufferedWriter;);
a=0;//     invoke-virtual {v2, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 418
a=0;//     const-string v0, "\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 419
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 420
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 424
a=0;//     #v0=(One);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 426
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 432
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 427
a=0;//     :catch_0
a=0;//     #v0=(One);v3=(PosShort);v4=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 429
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 424
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/io/BufferedWriter;);v2=(Reference,Ujava/lang/Object;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 426
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 429
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 427
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/io/BufferedWriter;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 429
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 424
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/BufferedWriter;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 426
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     .line 429
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     throw v0
a=0;// 
a=0;//     .line 427
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 424
a=0;//     :catchall_1
a=0;//     #v1=(Null);v3=(PosShort);v4=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 421
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addWindow(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 300
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/0x"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 306
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/android/util/ViewServer;->addWindow(Landroid/view/View;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// 
a=0;//     .line 304
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "("
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addWindow(Landroid/view/View;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 332
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindows:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 336
a=0;//     invoke-direct {p0}, Lcom/android/util/ViewServer;->fireWindowsChangedEvent()V
a=0;// 
a=0;//     .line 337
a=0;//     return-void
a=0;// 
a=0;//     .line 334
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public isRunning()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeWindow(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/util/ViewServer;->removeWindow(Landroid/view/View;)V
a=0;// 
a=0;//     .line 319
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeWindow(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 349
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindows:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 353
a=0;//     invoke-direct {p0}, Lcom/android/util/ViewServer;->fireWindowsChangedEvent()V
a=0;// 
a=0;//     .line 354
a=0;//     return-void
a=0;// 
a=0;//     .line 351
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/net/ServerSocket;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/ServerSocket;);
a=0;//     iget v1, p0, Lcom/android/util/ViewServer;->mPort:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/InetAddress;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Ljava/net/ServerSocket;-><init>(IILjava/net/InetAddress;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ServerSocket;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mServer:Ljava/net/ServerSocket;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 392
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mServer:Ljava/net/ServerSocket;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 395
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mServer:Ljava/net/ServerSocket;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     new-instance v2, Lcom/android/util/ViewServer$ViewServerWorker;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/util/ViewServer$ViewServerWorker;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/android/util/ViewServer$ViewServerWorker;-><init>(Lcom/android/util/ViewServer;Ljava/net/Socket;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/util/ViewServer$ViewServerWorker;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 405
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 400
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/net/Socket;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 401
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 409
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 388
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setFocusedWindow(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 363
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/android/util/ViewServer;->setFocusedWindow(Landroid/view/View;)V
a=0;// 
a=0;//     .line 364
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFocusedWindow(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 375
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mFocusedWindow:Landroid/view/View;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 377
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 379
a=0;//     invoke-direct {p0}, Lcom/android/util/ViewServer;->fireFocusChangedEvent()V
a=0;// 
a=0;//     .line 380
a=0;//     return-void
a=0;// 
a=0;//     .line 375
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 377
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public start()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 224
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Thread;);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Local View Server [port="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Lcom/android/util/ViewServer;->mPort:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "]"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 221
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public stop()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 238
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 248
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     iput-object v1, p0, Lcom/android/util/ViewServer;->mThreadPool:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 249
a=0;//     iput-object v1, p0, Lcom/android/util/ViewServer;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 252
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mServer:Ljava/net/ServerSocket;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
a=0;// 
a=0;//     .line 253
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mServer:Ljava/net/ServerSocket;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 254
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 274
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 255
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 262
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindows:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/util/ViewServer;->mFocusedWindow:Landroid/view/View;
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 274
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 264
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mWindowsLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 271
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/android/util/ViewServer;->mFocusLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 243
a=0;//     :catch_1
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
