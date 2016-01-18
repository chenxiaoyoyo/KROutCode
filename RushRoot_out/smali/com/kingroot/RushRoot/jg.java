package com.kingroot.RushRoot; class jg { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jg;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/File;)J
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 371
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 372
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/util/zip/CRC32;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/zip/CRC32;);
a=0;//     invoke-direct {v4}, Ljava/util/zip/CRC32;-><init>()V
a=0;// 
a=0;//     .line 375
a=0;//     #v4=(Reference,Ljava/util/zip/CRC32;);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 376
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v3, 0x2000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     .line 378
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 381
a=0;//     invoke-virtual {v4}, Ljava/util/zip/CRC32;->getValue()J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 385
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 391
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 379
a=0;//     :cond_1
a=0;//     #v4=(Reference,Ljava/util/zip/CRC32;);v5=(Integer);v6=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v3, v6, v5}, Ljava/util/zip/CRC32;->update([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 385
a=0;//     :goto_2
a=0;//     #v3=(Reference,Ljava/lang/Exception;);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 388
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 383
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 385
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 390
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
a=0;//     :catch_3
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Reference,[B);v4=(Reference,Ljava/util/zip/CRC32;);v5=(Integer);v6=(Byte);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 383
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 382
a=0;//     :catch_4
a=0;//     #v0=(LongLo);v2=(Conflicted);v3=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static a([B)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 458
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 465
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 460
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 461
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     .line 463
a=0;//     #v2=(Byte);
a=0;//     const-string v3, "0123456789abcdef"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     shr-int/lit8 v4, v2, 0x4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit8 v4, v4, 0xf
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "0123456789abcdef"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 461
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 402
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     const-string v1, "MD5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 405
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 406
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v3, 0x2000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     .line 408
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/jg;->a([B)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 416
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 422
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 409
a=0;//     :cond_1
a=0;//     #v3=(Reference,[B);v4=(Integer);v5=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v3, v5, v4}, Ljava/security/MessageDigest;->update([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 416
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 417
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 419
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 414
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 416
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 417
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     .line 421
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v3=(Reference,[B);v4=(Integer);v5=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 414
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 413
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/io/File;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 490
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "File must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 492
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
