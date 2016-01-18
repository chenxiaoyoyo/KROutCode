package com.kingroot.kinguser; class nk { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile ou:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private ov:Ljava/util/HashMap;
a=0;// 
a=0;// .field private final ow:Ljava/lang/Object;
a=0;// 
a=0;// .field private ox:Ljava/util/Locale;
a=0;// 
a=0;// .field private volatile oy:Z
a=0;// 
a=0;// .field private oz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nk;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nk;->ow:Ljava/lang/Object;
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nk;->oy:Z
a=0;// 
a=0;//     .line 384
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nl;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/nl;-><init>(Lcom/kingroot/kinguser/nk;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nl;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nk;->oz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/aae;Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/xq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/xq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/xq;-><init>()V
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xq;);
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/xq;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {v0, p3, p1}, Lcom/kingroot/kinguser/xq;->put(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/xq;->me()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 236
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/uq;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nk;->ow:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 240
a=0;//     :try_start_1
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/uu;->b([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 241
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 245
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 241
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 242
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/io/File;Ljava/lang/String;)Lcom/kingroot/kinguser/aae;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 248
a=0;//     .line 250
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 253
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nk;->ow:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 257
a=0;//     :try_start_1
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 258
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-int v4, v4
a=0;// 
a=0;//     .line 259
a=0;//     #v4=(Integer);
a=0;//     new-array v5, v4, [B
a=0;// 
a=0;//     .line 263
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Reference,[B);v6=(Conflicted);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     .line 264
a=0;//     sub-int v6, v4, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v5, v0, v6}, Ljava/io/FileInputStream;->read([BII)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     add-int/2addr v0, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_3
a=0;// 
a=0;//     .line 270
a=0;//     if-ne v0, v4, :cond_5
a=0;// 
a=0;//     .line 271
a=0;//     :try_start_3
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v5}, Lcom/kingroot/kinguser/uq;->b(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 277
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 278
a=0;//     new-instance v3, Lcom/kingroot/kinguser/xq;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/xq;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/xq;-><init>()V
a=0;// 
a=0;//     .line 279
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/xq;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/xq;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/kinguser/xq;->p([B)V
a=0;// 
a=0;//     .line 282
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aae;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aae;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aae;);
a=0;//     invoke-virtual {v3, p2, v0}, Lcom/kingroot/kinguser/xq;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aae;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 287
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 289
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/io/IOException;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 297
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 266
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Null);v3=(Reference,Ljava/lang/Object;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit v3
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     :try_start_6
a=0;//     throw v0
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     .line 284
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 285
a=0;//     :goto_5
a=0;//     :try_start_7
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     .line 287
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 289
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_6
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 294
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 287
a=0;//     :catchall_1
a=0;//     #v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_7
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 289
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_4
a=0;//     :goto_8
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 290
a=0;//     :catch_1
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 291
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 290
a=0;//     :catch_2
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 290
a=0;//     :catch_3
a=0;//     #v3=(Reference,Ljava/lang/Object;);v5=(Reference,[B);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 291
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 287
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Null);v4=(Integer);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 289
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 290
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 291
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 287
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 284
a=0;//     :catch_5
a=0;//     #v0=(Null);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 266
a=0;//     :catchall_3
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/io/FileInputStream;);v3=(Reference,Ljava/lang/Object;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(Integer);v5=(Reference,[B);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static ip()Lcom/kingroot/kinguser/nk;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nk;->ou:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     const-class v1, Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nk;->ou:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nk;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/nk;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/nk;->ou:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nk;->ou:Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 70
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
a=0;// .method private is()Ljava/util/HashMap;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 330
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nk;->oy:Z
a=0;// 
a=0;//     .line 331
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 334
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/nk;->oy:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nk;->ir()Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 338
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 339
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/vc;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aaa;
a=0;// 
a=0;//     .line 341
a=0;//     new-instance v3, Lcom/kingroot/kinguser/nm;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/nm;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/nm;-><init>()V
a=0;// 
a=0;//     .line 342
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nm;);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/nm;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/aaa;->BL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/nm;->bk(Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/nm;->oB:Ljava/util/List;
a=0;// 
a=0;//     .line 348
a=0;//     sget-object v4, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/aaa;->L:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/nm;->bk(Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/nm;->oC:Ljava/util/List;
a=0;// 
a=0;//     .line 355
a=0;//     :goto_1
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/nm;->oC:Ljava/util/List;
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-static {v4, v5}, Lcom/kingroot/kinguser/nm;->b(Ljava/util/List;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/nm;->oD:Ljava/lang/String;
a=0;// 
a=0;//     .line 358
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/aaa;->BK:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v3, Lcom/kingroot/kinguser/nm;->oE:I
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/nm;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 350
a=0;//     :cond_1
a=0;//     #v4=(Boolean);v5=(Conflicted);
a=0;//     sget-object v4, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/aaa;->M:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/nm;->bk(Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/nm;->oC:Ljava/util/List;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 353
a=0;//     :cond_2
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/aaa;->N:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/nm;->bk(Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/nm;->oC:Ljava/util/List;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 364
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nk;->oy:Z
a=0;// 
a=0;//     .line 367
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private it()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 374
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 375
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/vc;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nk;->ox:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nk;->ox:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/nk;->ox:Ljava/util/Locale;
a=0;// 
a=0;//     .line 378
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 381
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private y(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/aae;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/b;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, p2, v0, v2}, Lcom/kingroot/kinguser/ns;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     .line 199
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v1, Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/aae;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/aae;-><init>()V
a=0;// 
a=0;//     .line 202
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/aae;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/a;
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v3, Lcom/kingroot/kinguser/aaa;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/aaa;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/aaa;-><init>()V
a=0;// 
a=0;//     .line 205
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/aaa;);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->J:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->K:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->BL:Ljava/lang/String;
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->L:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->L:Ljava/lang/String;
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->M:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->M:Ljava/lang/String;
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->N:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->N:Ljava/lang/String;
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->O:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->O:Ljava/lang/String;
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->P:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/aaa;->P:Ljava/lang/String;
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/a;->Q:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/aaa;->Q:Ljava/lang/String;
a=0;// 
a=0;//     .line 213
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, v3, Lcom/kingroot/kinguser/aaa;->BK:I
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, v1, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 218
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aae;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private z(Ljava/util/List;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const v7, 0x9d36
a=0;// 
a=0;//     #v7=(Char);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 135
a=0;//     #v3=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nk;->ir()Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 140
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/aae;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 144
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aaa;
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v6=(Conflicted);
a=0;//     iget-object v0, v4, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Iterator;);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aaa;
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/kingroot/kinguser/aaa;
a=0;// 
a=0;//     .line 151
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->BL:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->BL:Ljava/lang/String;
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->L:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->L:Ljava/lang/String;
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->M:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->M:Ljava/lang/String;
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->N:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->N:Ljava/lang/String;
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->O:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->O:Ljava/lang/String;
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->P:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->P:Ljava/lang/String;
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/aaa;->Q:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/aaa;->Q:Ljava/lang/String;
a=0;// 
a=0;//     .line 161
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/aaa;->BK:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/aaa;->BK:I
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aaa;->dv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 169
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 172
a=0;//     :cond_3
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Collection;);
a=0;//     invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aaa;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v2, v4, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 176
a=0;//     #v2=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 179
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".xdat"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 181
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 182
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     invoke-direct {p0, v4, v1, v0}, Lcom/kingroot/kinguser/nk;->a(Lcom/kingroot/kinguser/aae;Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 184
a=0;//     iput-boolean v3, p0, Lcom/kingroot/kinguser/nk;->oy:Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public iq()Ljava/util/HashMap;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nk;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 81
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nk;->it()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nk;->oy:Z
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nk;->is()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 85
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
a=0;// .method public ir()Lcom/kingroot/kinguser/aae;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const v3, 0x9d36
a=0;// 
a=0;//     .line 304
a=0;//     .line 307
a=0;//     #v3=(Char);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".xdat"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 309
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 310
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     invoke-direct {p0, v1, v2}, Lcom/kingroot/kinguser/nk;->b(Ljava/io/File;Ljava/lang/String;)Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_1
a=0;//     invoke-direct {p0, v0, v2}, Lcom/kingroot/kinguser/nk;->y(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 316
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/kingroot/kinguser/nk;->a(Lcom/kingroot/kinguser/aae;Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public iu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nk;->oz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 482
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public y(Ljava/util/List;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 126
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/zu;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/zu;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/zu;-><init>()V
a=0;// 
a=0;//     .line 97
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/zu;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/zu;->Bs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 98
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v5, Lcom/kingroot/kinguser/zz;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/zz;);
a=0;//     invoke-direct {v5}, Lcom/kingroot/kinguser/zz;-><init>()V
a=0;// 
a=0;//     .line 100
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/zz;);
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zz;->dv:Ljava/lang/String;
a=0;// 
a=0;//     .line 101
a=0;//     iput v2, v5, Lcom/kingroot/kinguser/zz;->BK:I
a=0;// 
a=0;//     .line 103
a=0;//     :try_start_0
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/nk;->ov:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/nm;
a=0;// 
a=0;//     .line 105
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 106
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/nm;->oE:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zz;->BK:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/zu;->Bs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 116
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v3, v0}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/zu;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 118
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aae;
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aae;->BW:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nk;->z(Ljava/util/List;)V
a=0;// 
a=0;//     :cond_4
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Reference,Lcom/kingroot/kinguser/zu;);v5=(Reference,Lcom/kingroot/kinguser/zz;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// .end method
}}
