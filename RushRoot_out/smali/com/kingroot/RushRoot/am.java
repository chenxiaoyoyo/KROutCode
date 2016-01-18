package com.kingroot.RushRoot; class am { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/am;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 251
a=0;//     .line 254
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_c
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 255
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_d
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 256
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 258
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v2, v4, :cond_2
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v0, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_b
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     .line 268
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 278
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     .line 285
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_4
a=0;//     return-object v0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_2
a=0;//     :try_start_6
a=0;//     #v2=(Integer);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Byte);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_b
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     .line 268
a=0;//     :try_start_7
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     .line 274
a=0;//     :goto_5
a=0;//     :try_start_8
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 279
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 271
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 279
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 265
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_6
a=0;//     :try_start_9
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_2
a=0;// 
a=0;//     .line 268
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 270
a=0;//     :try_start_a
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7
a=0;// 
a=0;//     .line 274
a=0;//     :cond_3
a=0;//     :goto_7
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 278
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 279
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 271
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 268
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 270
a=0;//     :try_start_c
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
a=0;// 
a=0;//     .line 274
a=0;//     :cond_4
a=0;//     :goto_9
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 278
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_9
a=0;// 
a=0;//     .line 282
a=0;//     :cond_5
a=0;//     :goto_a
a=0;//     throw v0
a=0;// 
a=0;//     .line 271
a=0;//     :catch_8
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 279
a=0;//     :catch_9
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 268
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 265
a=0;//     :catch_a
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 263
a=0;//     :catch_c
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_d
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 295
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 299
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
