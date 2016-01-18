package com.kingroot.RushRoot; class ej { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ej;
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
a=0;//     .line 69
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ej;);
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     .line 57
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ej;->h:Z
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ej;->i:Z
a=0;// 
a=0;//     .line 59
a=0;//     iput-byte v1, p0, Lcom/kingroot/RushRoot/ej;->j:B
a=0;// 
a=0;//     .line 60
a=0;//     iput-byte v1, p0, Lcom/kingroot/RushRoot/ej;->k:B
a=0;// 
a=0;//     .line 70
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 71
a=0;//     iput-object p2, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/RushRoot/ej;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ej;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ej;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ej;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/RushRoot/ej;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ej;);
a=0;//     invoke-static {p0}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 84
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ek;);
a=0;//     const/16 v2, -0x41c
a=0;// 
a=0;//     #v2=(Short);
a=0;//     const-string v3, "no connecition!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 82
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Byte);v3=(Byte);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, v0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     invoke-direct {v0, v3, v2}, Lcom/kingroot/RushRoot/ej;->a(Ljava/net/URL;B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 96
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 92
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_2
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v3, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/net/URL;B)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v0, p2, :cond_2
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v0, p2, :cond_5
a=0;// 
a=0;//     .line 138
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
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
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
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
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
a=0;//     #v4=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     .line 139
a=0;//     #v2=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {p1, v2}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 140
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ej;->h:Z
a=0;// 
a=0;//     .line 145
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 138
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
a=0;//     .line 142
a=0;//     :cond_5
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 143
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ej;->h:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 148
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 149
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 151
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 154
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 157
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/Hashtable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 213
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 209
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
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
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
a=0;//     .line 418
a=0;//     #v5=(Byte);
a=0;//     new-instance v0, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 419
a=0;//     #v0=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v1, 0x800
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 420
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 423
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 424
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 426
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 427
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get Bytes from inputStream when read buffer: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
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
a=0;//     invoke-direct {v1, v5, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 430
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Byte);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 432
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
a=0;// 
a=0;//     .line 433
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 439
a=0;//     return-object v1
a=0;// 
a=0;//     .line 436
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 437
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v5, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private c()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
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
a=0;//     .line 553
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 554
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private d()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
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
a=0;//     .line 568
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 569
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     .line 264
a=0;//     .line 267
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
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
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept"
a=0;// 
a=0;//     const-string v3, "*/*"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept-Charset"
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     const-string v3, "application/octet-stream"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
a=0;// 
a=0;//     .line 272
a=0;//     const-string v0, "http.keepAlive"
a=0;// 
a=0;//     const-string v1, "false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 274
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
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
a=0;//     .catch Lcom/kingroot/RushRoot/ek; {:try_start_0 .. :try_end_0} :catch_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 275
a=0;//     const/16 v1, -0xbb8
a=0;// 
a=0;//     .line 276
a=0;//     :try_start_1
a=0;//     #v1=(Short);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "GET"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     .line 294
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     const/16 v3, 0x12d
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-lt v0, v3, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     const/16 v3, 0x131
a=0;// 
a=0;//     if-gt v0, v3, :cond_5
a=0;// 
a=0;//     .line 296
a=0;//     iget-byte v0, p0, Lcom/kingroot/RushRoot/ej;->j:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput-byte v3, p0, Lcom/kingroot/RushRoot/ej;->j:B
a=0;// 
a=0;//     if-ge v0, v6, :cond_9
a=0;// 
a=0;//     .line 297
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ej;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 299
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/RushRoot/ej;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/ej;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->e:[B
a=0;// 
a=0;//     .line 302
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/ej;->a(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 305
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ej;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 376
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(PosShort);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, -0x7d0
a=0;// 
a=0;//     .line 279
a=0;//     #v1=(Short);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "POST"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->e:[B
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
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
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/ej;->e:[B
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
a=0;//     .line 286
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->e:[B
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 288
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_1 .. :try_end_1} :catch_11
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_10
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_f
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_e
a=0;//     .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_d
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_c
a=0;//     .catch Lcom/kingroot/RushRoot/ek; {:try_start_1 .. :try_end_1} :catch_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 324
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 325
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/ej;->i:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 326
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ej;->i:Z
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 329
a=0;//     :try_start_2
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v6, v3, :cond_7
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/ej;->h:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 330
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/RushRoot/ej;->a(Ljava/net/URL;B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 338
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/ej;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 339
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->e:[B
a=0;// 
a=0;//     .line 340
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/ej;->a(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v0=(Integer);v1=(Short);v3=(PosShort);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     if-ne v0, v7, :cond_9
a=0;// 
a=0;//     .line 309
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ej;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 310
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v6, v3, :cond_9
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
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
a=0;//     .line 311
a=0;//     iget-byte v0, p0, Lcom/kingroot/RushRoot/ej;->k:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput-byte v3, p0, Lcom/kingroot/RushRoot/ej;->k:B
a=0;// 
a=0;//     if-gtz v0, :cond_9
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 314
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/RushRoot/ej;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/ej;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 316
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->e:[B
a=0;// 
a=0;//     .line 317
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->g:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/ej;->a(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ej;->a()I
a=0;//     :try_end_3
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_3 .. :try_end_3} :catch_11
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_10
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_3 .. :try_end_3} :catch_f
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_e
a=0;//     .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_d
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_c
a=0;//     .catch Lcom/kingroot/RushRoot/ek; {:try_start_3 .. :try_end_3} :catch_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_a
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 331
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);v3=(Byte);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ej;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/aq;->a(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v6, v3, :cond_3
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/ej;->h:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/RushRoot/ej;->a(Ljava/net/URL;B)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 335
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/MalformedURLException;);
a=0;//     add-int/lit8 v1, v1, -0x35
a=0;// 
a=0;//     .line 336
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "malformed url: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/ej;->b:Ljava/lang/String;
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 345
a=0;//     :cond_8
a=0;//     #v1=(Short);v2=(Null);v3=(Boolean);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x3e
a=0;// 
a=0;//     .line 346
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 347
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessError;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 348
a=0;//     :goto_5
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x3c
a=0;// 
a=0;//     .line 349
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 350
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 351
a=0;//     :goto_6
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x3d
a=0;// 
a=0;//     .line 352
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 353
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ProtocolException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 354
a=0;//     :goto_7
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x33
a=0;// 
a=0;//     .line 355
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 356
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 357
a=0;//     :goto_8
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x33
a=0;// 
a=0;//     .line 358
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 359
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 360
a=0;//     :goto_9
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x36
a=0;// 
a=0;//     .line 361
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 362
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 363
a=0;//     :goto_a
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x37
a=0;// 
a=0;//     .line 364
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 365
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 366
a=0;//     :goto_b
a=0;//     #v1=(Short);
a=0;//     add-int/lit8 v1, v1, -0x38
a=0;// 
a=0;//     .line 367
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest NetWorkException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ek;->getMessage()Ljava/lang/String;
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 368
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 369
a=0;//     :goto_c
a=0;//     #v1=(Short);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 371
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Short);v4=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v0, v2, :cond_a
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     if-eq v0, v7, :cond_a
a=0;// 
a=0;//     .line 373
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 374
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "response code is unnormal: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/kingroot/RushRoot/ej;->f:I
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
a=0;//     invoke-direct {v1, v0, v2}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 376
a=0;//     :cond_a
a=0;//     #v1=(Short);v2=(PosShort);v3=(Short);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 368
a=0;//     :catch_a
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 365
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 362
a=0;//     :catch_c
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 359
a=0;//     :catch_d
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 356
a=0;//     :catch_e
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 353
a=0;//     :catch_f
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ProtocolException;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 350
a=0;//     :catch_10
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 347
a=0;//     :catch_11
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessError;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 324
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
a=0;//     .line 390
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ej;->f:I
a=0;// 
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 392
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/16 v0, -0xfa0
a=0;// 
a=0;//     .line 407
a=0;//     :goto_1
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Integer);v2=(PosShort);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 394
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 398
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ej;->a(Ljava/io/InputStream;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 400
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 401
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ek;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ek;);
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/RushRoot/ek;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ek;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 222
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
a=0;//     .line 223
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 224
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
a=0;//     .line 225
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->c:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a([B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/ej;->e:[B
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 480
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 481
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ej;->d:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 483
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     return-void
a=0;// .end method
}}
