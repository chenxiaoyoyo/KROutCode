package com.kingroot.kinguser; class lf { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/lf;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mi:Ljava/lang/String;
a=0;// 
a=0;// .field private mj:Ljava/lang/String;
a=0;// 
a=0;// .field private mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;// .field private ml:[B
a=0;// 
a=0;// .field private mm:I
a=0;// 
a=0;// .field private mn:Ljava/util/Hashtable;
a=0;// 
a=0;// .field private mo:Z
a=0;// 
a=0;// .field private mp:Z
a=0;// 
a=0;// .field private mq:B
a=0;// 
a=0;// .field private mr:B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mn:Ljava/util/Hashtable;
a=0;// 
a=0;//     .line 54
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/lf;->mp:Z
a=0;// 
a=0;//     .line 56
a=0;//     iput-byte v1, p0, Lcom/kingroot/kinguser/lf;->mq:B
a=0;// 
a=0;//     .line 57
a=0;//     iput-byte v1, p0, Lcom/kingroot/kinguser/lf;->mr:B
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;Lcom/kingroot/kinguser/lf;)Lcom/kingroot/kinguser/lf;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(PosByte);
a=0;//     const-class v2, Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 105
a=0;//     #v1=(Byte);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/lf;->hs()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, p0, v4}, Lcom/kingroot/kinguser/lf;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v4, v1, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     const/16 v0, -0x41c
a=0;// 
a=0;//     .line 109
a=0;//     #v0=(Short);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const-string v3, "no connection!"
a=0;// 
a=0;//     invoke-direct {v1, v0, v3}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 104
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(PosByte);v1=(Byte);v3=(Reference,Lcom/kingroot/kinguser/lf;);v4=(Byte);v5=(Uninit);v6=(Uninit);
a=0;//     iget-boolean v4, p1, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     if-eq v1, v0, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     new-instance v1, Ljava/net/URL;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/URL;);
a=0;//     invoke-direct {v3, v1, v0}, Lcom/kingroot/kinguser/lf;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/lf;->getRequestMethod()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/kinguser/lf;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/lf;->ho()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/kinguser/lf;->c([B)V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-direct {p1}, Lcom/kingroot/kinguser/lf;->ht()Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/kinguser/lf;->a(Ljava/util/Hashtable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 127
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(PosByte);v1=(Byte);v4=(Boolean);
a=0;//     iget-boolean v4, p1, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     if-ne v1, v0, :cond_2
a=0;// 
a=0;//     .line 116
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(Reference,Ljava/net/MalformedURLException;);
a=0;//     const/16 v1, -0x41d
a=0;// 
a=0;//     .line 124
a=0;//     :try_start_3
a=0;//     #v1=(Short);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "invalide url: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
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
a=0;//     invoke-direct {v4, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(Byte);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/net/URL;B)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     .line 133
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v0, p2, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v0, p2, :cond_1
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/net/Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/Proxy$Type;);
a=0;//     new-instance v2, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ly;->p(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/ly;->q(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {p1, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;// 
a=0;//     .line 142
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 140
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 145
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 146
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     const/16 v1, -0x421
a=0;// 
a=0;//     .line 147
a=0;//     #v1=(Short);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "arg error: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 148
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 149
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     const/16 v1, -0x422
a=0;// 
a=0;//     .line 150
a=0;//     #v1=(Short);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "security error: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 151
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     const/16 v1, -0x423
a=0;// 
a=0;//     .line 153
a=0;//     #v1=(Short);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "unsupported operation error: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 154
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const/16 v1, -0x420
a=0;// 
a=0;//     .line 156
a=0;//     #v1=(Short);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "IOException : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/InputStream;)[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, -0x38
a=0;// 
a=0;//     .line 415
a=0;//     #v5=(Byte);
a=0;//     new-instance v0, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 416
a=0;//     #v0=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v1, 0x800
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 417
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 420
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
a=0;//     .line 421
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 424
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get Bytes from inputStream when read buffer: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
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
a=0;//     invoke-direct {v1, v5, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Byte);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 429
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
a=0;// 
a=0;//     .line 431
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 436
a=0;//     return-object v1
a=0;// 
a=0;//     .line 433
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 434
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get Bytes from inputStream: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
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
a=0;//     invoke-direct {v1, v5, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     const-class v1, Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/kinguser/lf;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 82
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     const/16 v0, -0x41c
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Short);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const-string v3, "no connecition!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v3}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 79
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Byte);v3=(Byte);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     invoke-direct {v0, v3, v2}, Lcom/kingroot/kinguser/lf;->a(Ljava/net/URL;B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 93
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 89
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 90
a=0;//     const/16 v2, -0x41d
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_2
a=0;//     #v2=(Short);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "malformed url: "
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
a=0;//     invoke-direct {v3, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private ht()Ljava/util/Hashtable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mn:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private isConnected()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     const/16 v1, 0xce
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ZLjava/util/concurrent/atomic/AtomicReference;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     const/16 v0, -0xfa0
a=0;// 
a=0;//     .line 388
a=0;//     #v0=(Short);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/lf;->isConnected()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 404
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 394
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/util/zip/InflaterInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/InflaterInputStream;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 395
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lf;->a(Ljava/io/InputStream;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 396
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 402
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 394
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Short);v1=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 397
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 398
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/16 v1, -0xfa2
a=0;// 
a=0;//     .line 399
a=0;//     #v1=(Short);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get response exception : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/Hashtable;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/util/Iterator;);
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
a=0;//     .line 188
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
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/kingroot/kinguser/lf;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/util/Hashtable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 204
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 206
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
a=0;//     .line 207
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;// .method public c([B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     .line 242
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 478
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 480
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 539
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "content-length"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/lf;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 540
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 542
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
a=0;//     .line 548
a=0;//     :cond_0
a=0;//     #v0=(LongLo);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 543
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 544
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get content length: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getContentType()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;//     .line 561
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 562
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get content type: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getDate()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 488
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDate()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 490
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);v1=(Uninit);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;//     .line 503
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 504
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get header field: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getInputStream()Ljava/io/InputStream;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;//     .line 448
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 449
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get inputStream: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getRequestMethod()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getResponseCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ho()[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hp()I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0xc8
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 261
a=0;//     .line 264
a=0;//     :try_start_0
a=0;//     #v6=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept"
a=0;// 
a=0;//     const-string v3, "*/*"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept-Charset"
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     const-string v3, "application/octet-stream"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
a=0;// 
a=0;//     .line 269
a=0;//     const-string v0, "http.keepAlive"
a=0;// 
a=0;//     const-string v1, "false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 271
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
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
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_0 .. :try_end_0} :catch_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 272
a=0;//     const/16 v1, -0xbb8
a=0;// 
a=0;//     .line 273
a=0;//     :try_start_1
a=0;//     #v1=(Short);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "GET"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     .line 291
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     const/16 v3, 0x12d
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-lt v0, v3, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     const/16 v3, 0x131
a=0;// 
a=0;//     if-gt v0, v3, :cond_5
a=0;// 
a=0;//     .line 293
a=0;//     iget-byte v0, p0, Lcom/kingroot/kinguser/lf;->mq:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput-byte v3, p0, Lcom/kingroot/kinguser/lf;->mq:B
a=0;// 
a=0;//     if-ge v0, v7, :cond_9
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/lf;->hr()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 296
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/kinguser/lf;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->c([B)V
a=0;// 
a=0;//     .line 301
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mn:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->b(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 373
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 275
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     const/16 v1, -0x7d0
a=0;// 
a=0;//     .line 276
a=0;//     #v1=(Short);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "POST"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
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
a=0;//     .line 283
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 285
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_1 .. :try_end_1} :catch_11
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_10
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_f
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_e
a=0;//     .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_d
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_c
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_1 .. :try_end_1} :catch_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 322
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/kinguser/lf;->mp:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 323
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/lf;->mp:Z
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 326
a=0;//     :try_start_2
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v7, v2, :cond_7
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 327
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0, v2, v3}, Lcom/kingroot/kinguser/lf;->a(Ljava/net/URL;B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 335
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 336
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->c([B)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mn:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->b(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 304
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v1=(Short);v2=(Null);v3=(PosShort);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     if-ne v0, v8, :cond_9
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/lf;->getContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 307
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v7, v3, :cond_9
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
a=0;//     .line 308
a=0;//     iget-byte v0, p0, Lcom/kingroot/kinguser/lf;->mr:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput-byte v3, p0, Lcom/kingroot/kinguser/lf;->mr:B
a=0;// 
a=0;//     if-ge v0, v6, :cond_9
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 311
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/kinguser/lf;->a(Ljava/net/URL;B)V
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 313
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->ml:[B
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->c([B)V
a=0;// 
a=0;//     .line 316
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mn:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/lf;->b(Ljava/util/Hashtable;)V
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;//     :try_end_3
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessError; {:try_start_3 .. :try_end_3} :catch_11
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_10
a=0;//     .catch Ljava/net/ProtocolException; {:try_start_3 .. :try_end_3} :catch_f
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_e
a=0;//     .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_d
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_c
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_3 .. :try_end_3} :catch_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_a
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 328
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);v2=(Byte);v3=(Boolean);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/lf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v7, v2, :cond_3
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/lf;->mo:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 329
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {p0, v2, v3}, Lcom/kingroot/kinguser/lf;->a(Ljava/net/URL;B)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 331
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 332
a=0;//     #v2=(Reference,Ljava/net/MalformedURLException;);
a=0;//     add-int/lit8 v1, v1, -0x35
a=0;// 
a=0;//     .line 333
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "malformed url: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 342
a=0;//     :cond_8
a=0;//     #v1=(Short);v2=(Null);v3=(Boolean);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x3e
a=0;// 
a=0;//     .line 343
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest UnknownHostException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 344
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessError;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 345
a=0;//     :goto_4
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x3c
a=0;// 
a=0;//     .line 346
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest IllegalAccessError: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 347
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 348
a=0;//     :goto_5
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x3d
a=0;// 
a=0;//     .line 349
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest IllegalStateException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 350
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ProtocolException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 351
a=0;//     :goto_6
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x33
a=0;// 
a=0;//     .line 352
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest ProtocolException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 353
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 354
a=0;//     :goto_7
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x33
a=0;// 
a=0;//     .line 355
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest ClientProtocolException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 356
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 357
a=0;//     :goto_8
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x36
a=0;// 
a=0;//     .line 358
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest SocketException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 359
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 360
a=0;//     :goto_9
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x37
a=0;// 
a=0;//     .line 361
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest SocketTimeoutException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 362
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 363
a=0;//     :goto_a
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x38
a=0;// 
a=0;//     .line 364
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest NetWorkException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lx;->getMessage()Ljava/lang/String;
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 365
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 366
a=0;//     :goto_b
a=0;//     #v1=(Short);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendRequest Exception: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v2, v1, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 368
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Short);v4=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v0, v2, :cond_a
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     if-eq v0, v8, :cond_a
a=0;// 
a=0;//     .line 370
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 371
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "response code is unnormal: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/lf;->mm:I
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
a=0;//     invoke-direct {v1, v0, v2}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 373
a=0;//     :cond_a
a=0;//     #v1=(Short);v2=(PosShort);v3=(Short);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/lf;->mm:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 365
a=0;//     :catch_a
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 362
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 359
a=0;//     :catch_c
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 356
a=0;//     :catch_d
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 353
a=0;//     :catch_e
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 350
a=0;//     :catch_f
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/ProtocolException;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 347
a=0;//     :catch_10
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 344
a=0;//     :catch_11
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessError;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 321
a=0;//     :catch_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public hq()J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 518
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "Content-Range"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/lf;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 519
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 521
a=0;//     const/16 v0, 0x2f
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 522
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 528
a=0;//     :cond_0
a=0;//     #v0=(LongLo);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 523
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 524
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get breakpoint total size: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public hr()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
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
a=0;//     .line 576
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 577
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v2, -0x38
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "get redirect url: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
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
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public hs()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mi:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setRequestMethod(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     .line 219
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
a=0;//     .line 220
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 221
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
a=0;//     .line 222
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lf;->mj:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mk:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lf;->mn:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
