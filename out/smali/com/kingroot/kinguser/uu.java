package com.kingroot.kinguser; class uu { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/uu;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(ILjava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p0, p1}, Lcom/kingroot/kinguser/uv;->a(Landroid/content/Context;ILjava/io/File;)V
a=0;// 
a=0;//     .line 170
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(ILjava/io/File;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/uu;->b(ILjava/io/File;)V
a=0;// 
a=0;//     .line 132
a=0;//     const-string v1, "sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "chmod 0764 "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
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
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/gr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(ILjava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p0, p1}, Lcom/kingroot/kinguser/uv;->b(Landroid/content/Context;ILjava/io/File;)V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p0, p1}, Lcom/kingroot/kinguser/uv;->c(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/uu;->c(Ljava/lang/String;Ljava/io/File;)V
a=0;// 
a=0;//     .line 158
a=0;//     const-string v1, "sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "chmod 0764 "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
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
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/gr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b([BLjava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/uv;->b([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static bQ(Ljava/lang/String;)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p0}, Lcom/kingroot/kinguser/uv;->q(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static bR(Ljava/lang/String;)[B
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, p0, v1}, Lcom/kingroot/kinguser/uv;->a(Landroid/content/Context;Ljava/lang/String;Z)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static bS(Ljava/lang/String;)[B
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, p0, v1}, Lcom/kingroot/kinguser/uv;->a(Landroid/content/Context;Ljava/lang/String;Z)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static bT(Ljava/lang/String;)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/uv;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static bU(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 419
a=0;//     .line 422
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
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 423
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
a=0;//     .line 424
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 426
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v2, v4, :cond_3
a=0;// 
a=0;//     .line 427
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
a=0;//     .line 431
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 432
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     .line 436
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 438
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
a=0;// 
a=0;//     .line 444
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_7
a=0;// 
a=0;//     .line 453
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     return-object v0
a=0;// 
a=0;//     .line 429
a=0;//     :cond_3
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
a=0;//     .line 436
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 438
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_9
a=0;// 
a=0;//     .line 444
a=0;//     :cond_4
a=0;//     :goto_5
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 446
a=0;//     :try_start_8
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 447
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 433
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 434
a=0;//     :goto_6
a=0;//     :try_start_9
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_2
a=0;// 
a=0;//     .line 436
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 438
a=0;//     :try_start_a
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8
a=0;// 
a=0;//     .line 444
a=0;//     :cond_5
a=0;//     :goto_7
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 447
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 448
a=0;//     :goto_8
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 436
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_9
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 438
a=0;//     :try_start_c
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4
a=0;// 
a=0;//     .line 444
a=0;//     :cond_6
a=0;//     :goto_a
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 446
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
a=0;// 
a=0;//     .line 436
a=0;//     :cond_7
a=0;//     :goto_b
a=0;//     throw v0
a=0;// 
a=0;//     .line 439
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 440
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 447
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 439
a=0;//     :catch_6
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 440
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 447
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 439
a=0;//     :catch_8
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 440
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 439
a=0;//     :catch_9
a=0;//     #v2=(Reference,[B);v4=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 440
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 436
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 433
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
a=0;//     .line 431
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
a=0;// .method public static c(Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p0, p1}, Lcom/kingroot/kinguser/uv;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
a=0;// 
a=0;//     .line 201
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 334
a=0;//     #v1=(Null);
a=0;//     const-class v4, Lcom/kingroot/kinguser/uu;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 338
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 344
a=0;//     :try_start_1
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 345
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_9
a=0;// 
a=0;//     .line 346
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/uu;->p(Ljava/io/File;)V
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, p1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 349
a=0;//     :try_start_2
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     .line 351
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v5, 0x2000
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(PosShort);
a=0;//     new-array v5, v5, [B
a=0;// 
a=0;//     .line 354
a=0;//     :goto_0
a=0;//     #v5=(Reference,[B);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_5
a=0;// 
a=0;//     .line 355
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v5, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 360
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 363
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 365
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 369
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 371
a=0;//     :try_start_5
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 376
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 357
a=0;//     :cond_5
a=0;//     :try_start_6
a=0;//     #v1=(Null);v3=(Reference,Ljava/io/InputStream;);v5=(Reference,[B);v6=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v6}, Ljava/nio/channels/FileChannel;->force(Z)V
a=0;// 
a=0;//     .line 358
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_3
a=0;// 
a=0;//     .line 363
a=0;//     :goto_5
a=0;//     #v6=(Conflicted);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 365
a=0;//     :try_start_7
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 369
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 371
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 372
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 363
a=0;//     :catchall_0
a=0;//     #v1=(Null);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/InputStream;);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 365
a=0;//     :try_start_9
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     .line 369
a=0;//     :cond_7
a=0;//     :goto_8
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 371
a=0;//     :try_start_a
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     .line 363
a=0;//     :cond_8
a=0;//     :goto_9
a=0;//     :try_start_b
a=0;//     throw v0
a=0;//     :try_end_b
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_1
a=0;// 
a=0;//     .line 334
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 366
a=0;//     :catch_2
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 372
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 366
a=0;//     :catch_4
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 372
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 366
a=0;//     :catch_6
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v5=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 363
a=0;//     :catchall_2
a=0;//     #v1=(Null);v2=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 360
a=0;//     :catch_7
a=0;//     #v1=(Null);v2=(Conflicted);v3=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Reference,Ljava/io/InputStream;);v5=(Reference,Ljava/io/File;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(Uninit);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public static kV()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 520
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 522
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 524
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
a=0;// 
a=0;// .method public static n(Ljava/io/File;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/uv;->n(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 38
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static o(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/uv;->o(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static p(Ljava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 321
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static q(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 529
a=0;//     .line 532
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 533
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ux;->d(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 536
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ux;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 539
a=0;//     return-object v0
a=0;// 
a=0;//     .line 536
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ux;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 534
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static r(ILjava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->bb()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, v0, p1}, Lcom/kingroot/kinguser/uu;->a(ILjava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static r(Ljava/lang/String;I)[B
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 466
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 467
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 510
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 473
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 474
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-array v1, p1, [B
a=0;// 
a=0;//     .line 477
a=0;//     :cond_2
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     sub-int v4, p1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v1, v0, v4}, Ljava/io/FileInputStream;->read([BII)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_8
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_8
a=0;// 
a=0;//     .line 478
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     .line 479
a=0;//     if-lt v0, p1, :cond_2
a=0;// 
a=0;//     move v4, v0
a=0;// 
a=0;//     .line 484
a=0;//     :goto_1
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 500
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_2
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 485
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 488
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     if-ge v4, p1, :cond_7
a=0;// 
a=0;//     .line 489
a=0;//     :try_start_3
a=0;//     new-array v0, v4, [B
a=0;// 
a=0;//     .line 490
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v1, v5, v0, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_8
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 500
a=0;//     :goto_3
a=0;//     #v5=(Byte);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 503
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 495
a=0;//     :catch_1
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 496
a=0;//     :goto_4
a=0;//     :try_start_5
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     .line 500
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 510
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 497
a=0;//     :catch_2
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 498
a=0;//     :goto_6
a=0;//     :try_start_7
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 500
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_8
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 503
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 504
a=0;//     :goto_7
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 500
a=0;//     :catchall_0
a=0;//     #v0=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_8
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_9
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
a=0;// 
a=0;//     .line 500
a=0;//     :cond_6
a=0;//     :goto_9
a=0;//     throw v0
a=0;// 
a=0;//     .line 503
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 503
a=0;//     :catch_5
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Integer);v3=(Reference,Ljava/io/FileInputStream;);v4=(Integer);v5=(Byte);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 504
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 500
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_2
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 497
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 495
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v4=(Integer);v5=(Byte);v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
