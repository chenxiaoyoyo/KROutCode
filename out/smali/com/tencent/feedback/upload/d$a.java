package com.tencent.feedback.upload; class d$a { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/upload/d$a;
a=0;// .super Lcom/tencent/feedback/upload/d;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/upload/d;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/tencent/feedback/upload/d$a;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/upload/d$a;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;[BLjava/lang/String;)Lorg/apache/http/HttpResponse;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     const-string v1, "rqdp{  no destUrl!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v1, p2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 198
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);v2=(Reference,[B);
a=0;//     invoke-direct {p0, p3}, Lcom/tencent/feedback/upload/d$a;->a(Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 199
a=0;//     #v3=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 201
a=0;//     const-string v1, "rqdp{  no httpClient!}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 216
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 218
a=0;//     :goto_2
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 219
a=0;//     const-string v3, "rqdp{  execute error }%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 224
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpPost;->abort()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 224
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpPost;->abort()V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     #v0=(Null);v3=(Reference,Lorg/apache/http/client/HttpClient;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v2, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 207
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v4, "wup_version"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "3.0"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v2, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 209
a=0;//     new-instance v4, Lorg/apache/http/protocol/BasicHttpContext;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     invoke-direct {v4}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V
a=0;// 
a=0;//     .line 212
a=0;//     #v4=(Reference,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     invoke-interface {v3, v2, v4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 213
a=0;//     :try_start_5
a=0;//     const-string v0, "http.request"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/apache/http/HttpRequest;
a=0;// 
a=0;//     .line 214
a=0;//     const-string v3, "rqdp{  execute request:\n} %s"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpPost;->abort()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 216
a=0;//     :catch_1
a=0;//     #v0=(Null);v3=(Reference,Lorg/apache/http/client/HttpClient;);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/Object;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 305
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     new-instance v1, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 306
a=0;//     #v1=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 307
a=0;//     const/16 v0, 0x2710
a=0;// 
a=0;//     invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 308
a=0;//     const/16 v0, 0x7d0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 311
a=0;//     const-string v0, "http.protocol.handle-redirects"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/apache/http/params/BasicHttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 313
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     .line 316
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v1, Lcom/tencent/feedback/upload/d$a$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/upload/d$a$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/feedback/upload/d$a$1;-><init>(Lcom/tencent/feedback/upload/d$a;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/upload/d$a$1;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V
a=0;// 
a=0;//     .line 327
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "wap"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     const-string v1, "rqdp{  use proxy} %s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 331
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 332
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/HttpHost;);
a=0;//     invoke-direct {v3, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 333
a=0;//     #v3=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "http.route.default-proxy"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 349
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 337
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const-string v2, "http.route.default-proxy"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Lorg/apache/http/params/HttpParams;->removeParameter(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 343
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 345
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 346
a=0;//     const-string v0, "rqdp{  httpclient error!}"
a=0;// 
a=0;//     new-array v1, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 349
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lorg/apache/http/HttpResponse;)[B
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 244
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 245
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v1, v2, :cond_2
a=0;// 
a=0;//     .line 247
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 248
a=0;//     #v2=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     const-string v3, "rqdp{  request failure code:}%d rqdp{  , line:}%s "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(PosShort);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 253
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 255
a=0;//     const-string v1, "rqdp{  no response datas!}"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v2=(PosShort);
a=0;//     new-instance v2, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v3, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/DataInputStream;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 264
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 266
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->read()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_4
a=0;// 
a=0;//     .line 268
a=0;//     invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 273
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 275
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 276
a=0;//     const-string v3, "rqdp{  read error} %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 282
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     :try_start_3
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 287
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v3=(Integer);v4=(Byte);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 282
a=0;//     :try_start_5
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 287
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 280
a=0;//     :catchall_0
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 282
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v2=(Reference,Ljava/io/BufferedInputStream;);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 284
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     .line 290
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 287
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 289
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 280
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 273
a=0;//     :catch_4
a=0;//     #v0=(Null);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;[BLcom/tencent/feedback/upload/c;)[B
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     const-string v0, "rqdp{  no destUrl!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 170
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_4
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     :goto_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "rqdp{  start req} %s rqdp{  sz:}%d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object p1, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v2, v5}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     :goto_2
a=0;//     #v2=(Boolean);v3=(Integer);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ge v4, v6, :cond_f
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge v3, v4, :cond_f
a=0;// 
a=0;//     .line 92
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/tencent/feedback/upload/d$a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, Lcom/tencent/feedback/common/g;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 108
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {p3, p1, v0, v1, v4}, Lcom/tencent/feedback/upload/c;->a(Ljava/lang/String;JLjava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     :cond_2
a=0;//     invoke-direct {p0, p1, p2, v4}, Lcom/tencent/feedback/upload/d$a;->a(Ljava/lang/String;[BLjava/lang/String;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 115
a=0;//     #v6=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     if-eqz v6, :cond_d
a=0;// 
a=0;//     .line 117
a=0;//     invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 118
a=0;//     #v7=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 120
a=0;//     #v8=(Integer);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ne v8, v4, :cond_7
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {v6}, Lcom/tencent/feedback/upload/d$a;->a(Lorg/apache/http/HttpResponse;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 124
a=0;//     #v2=(Reference,[B);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 125
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     invoke-virtual {p3, v0, v1}, Lcom/tencent/feedback/upload/c;->a(J)V
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     array-length v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 96
a=0;//     :cond_5
a=0;//     #v2=(Boolean);v3=(Integer);v4=(PosByte);v5=(Integer);v6=(PosByte);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-le v5, v4, :cond_1
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "rqdp{  try time} "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v4, v6}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 101
a=0;//     const-wide/16 v6, 0x2710
a=0;// 
a=0;//     :try_start_0
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 125
a=0;//     :cond_6
a=0;//     #v2=(Reference,[B);v4=(PosShort);v6=(Reference,Lorg/apache/http/HttpResponse;);v7=(Reference,Lorg/apache/http/HttpEntity;);v8=(Integer);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 128
a=0;//     :cond_7
a=0;//     #v2=(Boolean);
a=0;//     const/16 v4, 0x12d
a=0;// 
a=0;//     if-eq v8, v4, :cond_8
a=0;// 
a=0;//     const/16 v4, 0x12e
a=0;// 
a=0;//     if-eq v8, v4, :cond_8
a=0;// 
a=0;//     const/16 v4, 0x12f
a=0;// 
a=0;//     if-eq v8, v4, :cond_8
a=0;// 
a=0;//     const/16 v4, 0x133
a=0;// 
a=0;//     if-ne v8, v4, :cond_9
a=0;// 
a=0;//     :cond_8
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 131
a=0;//     #v4=(One);
a=0;//     const-string v2, "Location"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, v2}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 132
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "rqdp{  redirect code:}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "rqdp{   Location is null! return}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 136
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_9
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Boolean);v4=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 141
a=0;//     :cond_a
a=0;//     #v2=(Reference,Lorg/apache/http/Header;);v4=(One);
a=0;//     add-int/lit8 v5, v3, 0x1
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 144
a=0;//     const-string v2, "rqdp{  redirect code:}%d rqdp{  , to:}%s"
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v3, v9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aput-object p1, v3, v8
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 150
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Integer);v8=(Integer);v9=(Conflicted);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 151
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     .line 153
a=0;//     invoke-interface {v7}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 154
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v7, v2, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gez v7, :cond_b
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_b
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz p3, :cond_c
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {p3, v2, v3}, Lcom/tencent/feedback/upload/c;->a(J)V
a=0;// 
a=0;//     :cond_c
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     move v3, v5
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v6
a=0;// 
a=0;//     .line 160
a=0;//     #v4=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 164
a=0;//     :cond_d
a=0;//     #v4=(Reference,Ljava/lang/String;);v6=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     if-eqz p3, :cond_e
a=0;// 
a=0;//     .line 165
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {p3, v6, v7}, Lcom/tencent/feedback/upload/c;->a(J)V
a=0;// 
a=0;//     :cond_e
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 167
a=0;//     #v4=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 170
a=0;//     :cond_f
a=0;//     #v6=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(LongLo);v4=(Boolean);v6=(Reference,Lorg/apache/http/HttpResponse;);v7=(Reference,Lorg/apache/http/HttpEntity;);v8=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v5, v3
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
}}
