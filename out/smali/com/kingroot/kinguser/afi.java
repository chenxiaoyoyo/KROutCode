package com.kingroot.kinguser; class afi { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/afi;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v1, 0x1000
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v3=(Integer);v5=(Conflicted);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v1, v5, v3}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v3=(Integer);v4=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v4}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v4=(Reference,Ljava/io/InputStream;);v5=(Conflicted);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v4}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_7
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_8
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,[B);v3=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Null);v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Null);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Integer);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/IOException;);v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_8
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/io/File;Ljava/io/File;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     new-instance v4, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v1, 0x1000
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v3=(Integer);v5=(Conflicted);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v1, v5, v3}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v3=(Integer);v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Null);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v4=(Reference,Ljava/io/FileInputStream;);v5=(Conflicted);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_7
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_8
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,[B);v3=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Null);v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Conflicted);v3=(Null);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Integer);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/IOException;);v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Null);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Boolean);v2=(Conflicted);v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/io/File;Ljava/io/File;)Z
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     new-instance v7, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v7, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(Reference,Ljava/io/FileOutputStream;);
a=0;//     new-instance v6, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v6, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_d
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v7}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_e
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(Reference,Ljava/nio/channels/FileChannel;);
a=0;//     invoke-virtual {v6}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_f
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/nio/channels/FileChannel;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_10
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_4
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     move-wide v3, v8
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_4
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_9
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_a
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v5}, Ljava/nio/channels/FileChannel;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_b
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_c
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/nio/channels/FileChannel;);v1=(Byte);v2=(LongHi);v3=(LongLo);v4=(LongHi);v6=(Reference,Ljava/io/FileInputStream;);v7=(Reference,Ljava/io/FileOutputStream;);v8=(LongLo);v9=(LongHi);v10=(Uninit);
a=0;//     sub-long v1, v8, v3
a=0;// 
a=0;//     :try_start_9
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_10
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_4
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     sub-long/2addr v3, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Conflicted);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     :goto_6
a=0;//     :try_start_a
a=0;//     #v1=(Reference,Ljava/nio/channels/FileChannel;);v2=(Reference,Ljava/io/FileInputStream;);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v5=(Reference,Ljava/nio/channels/FileChannel;);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->delete()Z
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_5
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_7
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_8
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {v5}, Ljava/nio/channels/FileChannel;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_9
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_8
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_a
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, v1
a=0;// 
a=0;//     :goto_b
a=0;//     #v1=(Reference,Ljava/nio/channels/FileChannel;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/nio/channels/FileChannel;);v6=(Reference,Ljava/io/FileInputStream;);v7=(Reference,Ljava/io/FileOutputStream;);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_c
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     :try_start_10
a=0;//     invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_2
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_d
a=0;//     if-eqz v5, :cond_b
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-virtual {v5}, Ljava/nio/channels/FileChannel;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_3
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_e
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     :try_start_12
a=0;//     invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->close()V
a=0;//     :try_end_12
a=0;//     .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_4
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_f
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_e
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Reference,Ljava/io/FileOutputStream;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_8
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catch_9
a=0;//     #v1=(One);v2=(LongHi);v3=(LongLo);v4=(LongHi);v6=(Reference,Ljava/io/FileInputStream;);v7=(Reference,Ljava/io/FileOutputStream;);v8=(LongLo);v9=(LongHi);v10=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_a
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_b
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_c
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Conflicted);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Uninit);v5=(Uninit);v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Uninit);v5=(Reference,Ljava/nio/channels/FileChannel;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catchall_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v10, v1
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catchall_5
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Reference,Ljava/io/FileOutputStream;);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-object v7, v3
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catch_d
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Conflicted);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v7
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_e
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v2, v6
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-object v3, v7
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_f
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Reference,Ljava/nio/channels/FileChannel;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v6
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-object v3, v7
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_10
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v6
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-object v3, v7
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v10, v1
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public static dD(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Ljava/io/File;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Boolean);v6=(Conflicted);
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_4
a=0;// 
a=0;//     aget-object v2, v5, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     aget-object v2, v5, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/afi;->deleteFile(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     aget-object v2, v5, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/afi;->dD(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :cond_6
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static deleteFile(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static n(Ljava/io/File;)J
a=0;//     .locals 7
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     new-instance v2, Ljava/util/zip/CRC32;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/CRC32;);
a=0;//     invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/zip/CRC32;);
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v4, 0x2000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(PosShort);
a=0;//     new-array v4, v4, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,[B);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3, v4}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eq v5, v6, :cond_1
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v2, v4, v6, v5}, Ljava/util/zip/CRC32;->update([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_4
a=0;//     #v4=(Reference,[B);v5=(Integer);v6=(Byte);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(LongLo);v2=(Conflicted);v3=(Conflicted);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
