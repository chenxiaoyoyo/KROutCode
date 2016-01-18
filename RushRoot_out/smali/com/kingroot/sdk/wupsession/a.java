package com.kingroot.sdk.wupsession; class a { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/wupsession/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;// .field private e:[B
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Ljava/util/Hashtable;
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// .field private j:B
a=0;// 
a=0;// .field private k:B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     .line 61
a=0;//     iput-boolean v1, p0, Lcom/kingroot/sdk/wupsession/a;->h:Z
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/wupsession/a;->i:Z
a=0;// 
a=0;//     .line 63
a=0;//     iput-byte v1, p0, Lcom/kingroot/sdk/wupsession/a;->j:B
a=0;// 
a=0;//     .line 64
a=0;//     iput-byte v1, p0, Lcom/kingroot/sdk/wupsession/a;->k:B
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 75
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/sdk/wupsession/a;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     const-class v1, Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/sdk/wupsession/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 88
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x41c
a=0;// 
a=0;//     #v2=(Short);
a=0;//     const-string v3, "no connecition!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 86
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Byte);v3=(Byte);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     invoke-direct {v0, v3, v2}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/net/URL;B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 100
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 96
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_2
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v3, -0x41d
a=0;// 
a=0;//     #v3=(Short);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "malformed url: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/net/URL;B)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v0, p2, :cond_2
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v0, p2, :cond_5
a=0;// 
a=0;//     .line 143
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/net/Proxy;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/Proxy$Type;);
a=0;//     new-instance v4, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 144
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {v4, v1, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 143
a=0;//     #v4=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     .line 145
a=0;//     #v2=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {p1, v2}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/wupsession/a;->h:Z
a=0;// 
a=0;//     .line 151
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v2=(UninitRef,Ljava/net/Proxy;);v3=(Reference,Ljava/net/Proxy$Type;);v4=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_5
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 149
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/wupsession/a;->h:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 154
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x421
a=0;// 
a=0;//     #v2=(Short);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "arg error: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 157
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x422
a=0;// 
a=0;//     #v2=(Short);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "security error: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 160
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x423
a=0;// 
a=0;//     #v2=(Short);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "unsupported operation error: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/UnsupportedOperationException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 163
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 164
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x420
a=0;// 
a=0;//     #v2=(Short);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "IOException : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/Hashtable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 212
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 214
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/InputStream;)[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, -0x38
a=0;// 
a=0;//     .line 470
a=0;//     #v5=(Byte);
a=0;//     new-instance v0, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 471
a=0;//     #v0=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v1, 0x800
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 472
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 475
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 482
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 484
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
a=0;// 
a=0;//     .line 485
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 491
a=0;//     return-object v1
a=0;// 
a=0;//     .line 476
a=0;//     :cond_0
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 478
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 479
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get Bytes from inputStream when read buffer: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 480
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 479
a=0;//     invoke-direct {v1, v5, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 487
a=0;//     :catch_1
a=0;//     #v3=(Integer);v4=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 489
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get Bytes from inputStream: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v5, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 552
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 553
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get header field: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private g()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 620
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v1, "Location"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 621
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 622
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get redirect url: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0xc8
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     .line 269
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v1, "Cookie"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept"
a=0;// 
a=0;//     const-string v3, "*/*"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept-Charset"
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     const-string v3, "application/octet-stream"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
a=0;// 
a=0;//     .line 277
a=0;//     const-string v0, "http.keepAlive"
a=0;// 
a=0;//     const-string v1, "false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 279
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_12
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_6
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_0 .. :try_end_0} :catch_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 280
a=0;//     const/16 v1, -0xbb8
a=0;// 
a=0;//     .line 281
a=0;//     :try_start_1
a=0;//     #v1=(Short);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "GET"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     .line 299
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "mResponseCode = "
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 300
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0x12d
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-lt v0, v3, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     const/16 v3, 0x131
a=0;// 
a=0;//     if-gt v0, v3, :cond_5
a=0;// 
a=0;//     .line 302
a=0;//     iget-byte v0, p0, Lcom/kingroot/sdk/wupsession/a;->j:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput-byte v3, p0, Lcom/kingroot/sdk/wupsession/a;->j:B
a=0;// 
a=0;//     if-ge v0, v6, :cond_9
a=0;// 
a=0;//     .line 303
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/wupsession/a;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 305
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 307
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     .line 308
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 311
a=0;//     invoke-virtual {p0}, Lcom/kingroot/sdk/wupsession/a;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 383
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(PosShort);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 283
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, -0x7d0
a=0;// 
a=0;//     .line 284
a=0;//     #v1=(Short);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "POST"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v3, "Content-length"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_1 .. :try_end_1} :catch_11
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_10
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_f
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_e
a=0;//     .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_d
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_c
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_1 .. :try_end_1} :catch_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 331
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 332
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/sdk/wupsession/a;->i:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 333
a=0;//     iput-boolean v2, p0, Lcom/kingroot/sdk/wupsession/a;->i:Z
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 336
a=0;//     :try_start_2
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v6, v3, :cond_7
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/kingroot/sdk/wupsession/a;->h:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 337
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/net/URL;B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 345
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 346
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     .line 347
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v0=(Integer);v1=(Short);v3=(PosShort);
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     if-ne v0, v7, :cond_9
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {p0}, Lcom/kingroot/sdk/wupsession/a;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 316
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v6, v3, :cond_9
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "vnd.wap.wml"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v0, v3, :cond_9
a=0;// 
a=0;//     .line 318
a=0;//     iget-byte v0, p0, Lcom/kingroot/sdk/wupsession/a;->k:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput-byte v3, p0, Lcom/kingroot/sdk/wupsession/a;->k:B
a=0;// 
a=0;//     if-gtz v0, :cond_9
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 321
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 323
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     .line 324
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p0}, Lcom/kingroot/sdk/wupsession/a;->a()I
a=0;//     :try_end_3
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_3 .. :try_end_3} :catch_11
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_10
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_3 .. :try_end_3} :catch_f
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_e
a=0;//     .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_d
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_c
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_3 .. :try_end_3} :catch_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_a
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 338
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);v3=(Byte);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/wupsession/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/i;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v6, v3, :cond_3
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/kingroot/sdk/wupsession/a;->h:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 339
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/net/URL;B)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 342
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/MalformedURLException;);
a=0;//     add-int/lit8 v1, v1, -0x35
a=0;// 
a=0;//     .line 343
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "malformed url: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/wupsession/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 352
a=0;//     :cond_8
a=0;//     #v1=(Short);v2=(Null);v3=(Boolean);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x3e
a=0;// 
a=0;//     .line 353
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest UnknownHostException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 354
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessError;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 355
a=0;//     :goto_5
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x3c
a=0;// 
a=0;//     .line 356
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest IllegalAccessError: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessError;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 357
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 358
a=0;//     :goto_6
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x3d
a=0;// 
a=0;//     .line 359
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest IllegalStateException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 360
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ProtocolException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 361
a=0;//     :goto_7
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x33
a=0;// 
a=0;//     .line 362
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest ProtocolException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 363
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 364
a=0;//     :goto_8
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x33
a=0;// 
a=0;//     .line 365
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest ClientProtocolException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 366
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 367
a=0;//     :goto_9
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x36
a=0;// 
a=0;//     .line 368
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest SocketException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/net/SocketException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 369
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 370
a=0;//     :goto_a
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x37
a=0;// 
a=0;//     .line 371
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest SocketTimeoutException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 372
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 373
a=0;//     :goto_b
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x38
a=0;// 
a=0;//     .line 374
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest NetWorkException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/wupsession/b;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 375
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 376
a=0;//     :goto_c
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 377
a=0;//     new-instance v2, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest Exception: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 379
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Short);v4=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v0, v2, :cond_a
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     if-eq v0, v7, :cond_a
a=0;// 
a=0;//     .line 380
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 381
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "response code is unnormal: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 383
a=0;//     :cond_a
a=0;//     #v1=(Short);v2=(PosShort);v3=(Short);
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 375
a=0;//     :catch_a
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 372
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 369
a=0;//     :catch_c
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 366
a=0;//     :catch_d
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 363
a=0;//     :catch_e
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 360
a=0;//     :catch_f
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ProtocolException;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 357
a=0;//     :catch_10
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 354
a=0;//     :catch_11
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessError;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 331
a=0;//     :catch_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 397
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 399
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/16 v0, -0xfa0
a=0;// 
a=0;//     .line 414
a=0;//     :goto_1
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// 
a=0;//     .line 397
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(PosShort);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 401
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 405
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/wupsession/a;->a(Ljava/io/InputStream;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 412
a=0;//     invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 406
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 408
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0xfa2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get response exception : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 227
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 229
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a([B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/wupsession/a;->e:[B
a=0;// 
a=0;//     .line 250
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()Ljava/io/InputStream;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 503
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 504
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get inputStream: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final c()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     iget v0, p0, Lcom/kingroot/sdk/wupsession/a;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 533
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 538
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 540
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     return-void
a=0;// 
a=0;//     .line 534
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 536
a=0;//     const-string v1, "HttpConnection.close() throw e"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final e()J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 586
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "content-length"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/sdk/wupsession/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 587
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 594
a=0;//     :cond_0
a=0;//     #v0=(LongLo);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 590
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 591
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get content length: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final f()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/a;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 607
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 608
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/sdk/wupsession/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get content type: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/sdk/wupsession/b;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     throw v1
a=0;// .end method
}}
