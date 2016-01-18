package com.kingroot.kinguser; class js { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/js;
a=0;// .super Lcom/kingroot/kinguser/afa;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/afa;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/js;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {p2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, p1, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_d
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 45
a=0;//     const/16 v6, 0x10
a=0;// 
a=0;//     :try_start_1
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [B
a=0;// 
a=0;//     .line 46
a=0;//     #v6=(Reference,[B);
a=0;//     invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/uv;->h([B)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_e
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 48
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-ne v6, v7, :cond_4
a=0;// 
a=0;//     .line 65
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_2
a=0;//     invoke-virtual {v4}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 70
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_3
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     .line 75
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
a=0;// 
a=0;//     .line 82
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/zip/GZIPInputStream;);v3=(Reference,Ljava/lang/Object;);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 51
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(One);v2=(Null);v3=(Null);v4=(Null);v5=(Reference,Ljava/io/InputStream;);v6=(Integer);v7=(Byte);
a=0;//     shl-int/lit8 v2, v6, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v6, v2
a=0;// 
a=0;//     :try_start_5
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/io/InputStream;->skip(J)J
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v2, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v2, v5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_e
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 54
a=0;//     :try_start_6
a=0;//     #v2=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_f
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     .line 56
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v3, 0x1000
a=0;// 
a=0;//     :try_start_7
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     .line 57
a=0;//     :goto_3
a=0;//     #v3=(Reference,[B);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/zip/GZIPInputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ltz v6, :cond_7
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v3, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_3
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 60
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 61
a=0;//     :goto_4
a=0;//     :try_start_8
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p2}, Ljava/io/File;->delete()Z
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_4
a=0;// 
a=0;//     .line 65
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8
a=0;// 
a=0;//     .line 70
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_a
a=0;//     invoke-virtual {v4}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9
a=0;// 
a=0;//     .line 75
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 78
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 65
a=0;//     :cond_7
a=0;//     #v1=(One);v5=(Reference,Ljava/io/InputStream;);v6=(Integer);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_c
a=0;//     invoke-virtual {v2}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5
a=0;// 
a=0;//     .line 70
a=0;//     :cond_8
a=0;//     :goto_7
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v5, :cond_9
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_d
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
a=0;// 
a=0;//     .line 75
a=0;//     :cond_9
a=0;//     :goto_8
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_e
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_9
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 65
a=0;//     :catchall_0
a=0;//     #v0=(Null);v2=(Null);v3=(Null);v4=(Null);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     move-object v5, v3
a=0;// 
a=0;//     :goto_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/zip/GZIPInputStream;);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Reference,Ljava/io/InputStream;);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_b
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_f
a=0;//     invoke-virtual {v3}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a
a=0;// 
a=0;//     .line 70
a=0;//     :cond_b
a=0;//     :goto_b
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_10
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b
a=0;// 
a=0;//     .line 75
a=0;//     :cond_c
a=0;//     :goto_c
a=0;//     if-eqz v4, :cond_d
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_11
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_c
a=0;// 
a=0;//     .line 78
a=0;//     :cond_d
a=0;//     :goto_d
a=0;//     throw v0
a=0;// 
a=0;//     .line 68
a=0;//     :catch_2
a=0;//     #v0=(Null);v1=(One);v2=(Null);v3=(Null);v4=(Null);v6=(Integer);v7=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 78
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 68
a=0;//     :catch_5
a=0;//     #v1=(One);v2=(Reference,Ljava/util/zip/GZIPInputStream;);v3=(Reference,[B);v4=(Reference,Ljava/io/FileOutputStream;);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 73
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 78
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 68
a=0;//     :catch_8
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/IOException;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 73
a=0;//     :catch_9
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 68
a=0;//     :catch_a
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v2=(Conflicted);v5=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 73
a=0;//     :catch_b
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 78
a=0;//     :catch_c
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 65
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(One);v3=(Null);v4=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v2=(Reference,Ljava/util/zip/GZIPInputStream;);v4=(Conflicted);v6=(LongLo);v7=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Reference,Ljava/io/FileOutputStream;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_4
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/IOException;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 60
a=0;//     :catch_d
a=0;//     #v0=(Null);v1=(One);v2=(Null);v3=(Null);v4=(Null);v5=(Conflicted);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_e
a=0;//     #v1=(One);v2=(Conflicted);v5=(Reference,Ljava/io/InputStream;);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_f
a=0;//     #v1=(One);v2=(Reference,Ljava/util/zip/GZIPInputStream;);v4=(Conflicted);v6=(LongLo);v7=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 23
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     add-int/lit8 v1, v0, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     invoke-static {p1, p2, p3}, Lcom/kingroot/kinguser/js;->b(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 26
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 30
a=0;//     :goto_1
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
