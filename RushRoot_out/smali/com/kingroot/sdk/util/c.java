package com.kingroot.sdk.util; class c { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/util/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
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
a=0;//     .line 61
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/d;->a(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 63
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
a=0;// .method private static a(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     :try_start_0
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 540
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 541
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 545
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/o;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 549
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 542
a=0;//     :cond_0
a=0;//     #v1=(Reference,[B);v2=(Integer);v3=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v2}, Ljava/security/MessageDigest;->update([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 547
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;// 
a=0;//     .line 549
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 627
a=0;//     .line 630
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 631
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 632
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     .line 634
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 635
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 637
a=0;//     return-void
a=0;// 
a=0;//     .line 633
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 634
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Reference,Ljava/io/InputStream;);v3=(Conflicted);
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 635
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 636
a=0;//     throw v0
a=0;// 
a=0;//     .line 633
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Null);v3=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a([BLjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v0, p0}, Ljava/io/FileOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 307
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 311
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
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 881
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 882
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 883
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_1
a=0;// 
a=0;//     .line 893
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 884
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,[Ljava/lang/String;);v3=(Integer);
a=0;//     aget-object v3, v2, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 885
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "existAssetFile "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 886
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 883
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 891
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 408
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 410
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/c;->b(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 411
a=0;//     invoke-static {p0, p2}, Lcom/kingroot/sdk/util/c;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 412
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 419
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 415
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 419
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/io/File;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 692
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 696
a=0;//     :try_start_0
a=0;//     new-instance v4, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 697
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 698
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 711
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v3=(Reference,[B);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     .line 724
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 725
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 718
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 722
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 712
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v0=(Null);v3=(Integer);v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-array v5, v3, [B
a=0;// 
a=0;//     .line 713
a=0;//     #v5=(Reference,[B);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v1, v6, v5, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 715
a=0;//     invoke-static {v5}, Lcom/kingroot/sdk/util/Cryptor;->z([B)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 716
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     array-length v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v3, v5, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 719
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 720
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 721
a=0;//     const/16 v4, 0x1b8e
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "srcFile = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", destFile = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     .line 724
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 725
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 723
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 724
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/FileInputStream;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 725
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 726
a=0;//     throw v0
a=0;// 
a=0;//     .line 723
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Conflicted);v3=(Null);v4=(Reference,Ljava/io/FileInputStream;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/Throwable;);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 719
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Uninit);v2=(Conflicted);v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 493
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/InputStream;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 495
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 493
a=0;//     return v1
a=0;// 
a=0;//     .line 494
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 495
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 496
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v4, 0x1b5f
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 333
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 334
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 335
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 337
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 338
a=0;//     invoke-static {p2, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Lcom/kingroot/sdk/util/Posix;->chmod(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 339
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " chmod fail rc = "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v4, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 388
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 347
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/File;);v2=(Integer);v3=(Null);v4=(PosShort);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v4, Ljava/util/zip/ZipInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/zip/ZipInputStream;);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v4, v2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_2
a=0;// 
a=0;//     .line 349
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/util/zip/ZipInputStream;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 390
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 384
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 350
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->isDirectory()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 352
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v5, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 353
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->mkdir()Z
a=0;// 
a=0;//     .line 354
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "mkDir : "
a=0;// 
a=0;//     invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 386
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 387
a=0;//     :goto_2
a=0;//     #v3=(Reference,Ljava/util/zip/ZipInputStream;);v4=(Conflicted);
a=0;//     const/16 v2, 0x1b5f
a=0;// 
a=0;//     :try_start_3
a=0;//     #v2=(PosShort);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, " upzip exception"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v2, v4, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_3
a=0;// 
a=0;//     .line 390
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     :cond_2
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Ljava/util/zip/ZipEntry;);v3=(Null);v5=(Boolean);
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v5, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 359
a=0;//     :try_start_5
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 360
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_4
a=0;// 
a=0;//     .line 361
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v6, 0x400
a=0;// 
a=0;//     :try_start_6
a=0;//     #v6=(PosShort);
a=0;//     new-array v6, v6, [B
a=0;// 
a=0;//     .line 363
a=0;//     :goto_3
a=0;//     #v6=(Reference,[B);
a=0;//     invoke-virtual {v4, v6}, Ljava/util/zip/ZipInputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v7, v8, :cond_3
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 368
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 373
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     .line 374
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 375
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {p2, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v2, v6}, Lcom/kingroot/sdk/util/Posix;->chmod(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 376
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 377
a=0;//     const/16 v1, 0x1b5f
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " chmod fail rc = "
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 390
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/io/File;);v3=(Null);v6=(Reference,[B);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_8
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v2, v6, v8, v7}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 367
a=0;//     :catchall_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 368
a=0;//     :goto_4
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 369
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 371
a=0;//     :cond_4
a=0;//     throw v1
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_0
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     .line 389
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 390
a=0;//     :goto_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 391
a=0;//     throw v0
a=0;// 
a=0;//     .line 381
a=0;//     :cond_5
a=0;//     :try_start_a
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/File;);v2=(Reference,Ujava/lang/Object;);v3=(Null);v5=(Reference,Ljava/io/File;);v7=(Integer);v8=(Byte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "extract "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_0
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 389
a=0;//     :catchall_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v2=(PosShort);v3=(Reference,Ljava/util/zip/ZipInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/zip/ZipInputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 386
a=0;//     :catch_1
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 367
a=0;//     :catchall_4
a=0;//     #v4=(Reference,Ljava/util/zip/ZipInputStream;);v5=(Reference,Ljava/io/File;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/InputStream;Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 430
a=0;//     #v0=(One);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 431
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 432
a=0;//     new-instance v2, Ljava/util/zip/ZipInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/ZipInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 434
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/zip/ZipInputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/zip/ZipEntry;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 462
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 435
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v4, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 437
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 438
a=0;//     const-string v1, "kingroot-sdk"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "xxx"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " need update"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 442
a=0;//     :cond_2
a=0;//     #v4=(Boolean);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v4, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 443
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 444
a=0;//     const-string v3, "ku-config"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 445
a=0;//     const-string v3, "kingroot-sdk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "xxx ku-config no check."
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 448
a=0;//     :cond_3
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/util/c;->b(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 449
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 450
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 451
a=0;//     const-string v3, "kingroot-sdk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "xxx"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " no changed."
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 453
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v6=(Conflicted);
a=0;//     const-string v1, "kingroot-sdk"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "xxx"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " need update"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 457
a=0;//     :cond_5
a=0;//     #v3=(Boolean);v5=(Conflicted);
a=0;//     const-string v1, "kingroot-sdk"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "xxx"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " need update"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 842
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 843
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-char v2, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "su2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 844
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/util/c;->b(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 845
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 846
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-char v3, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "su3"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 847
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/c;->c(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 848
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-char v3, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 849
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "oldSuPath = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 850
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 851
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 852
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, " exists!"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 853
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 855
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 856
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 857
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 858
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 859
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 870
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 861
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 862
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 863
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 864
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 867
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 868
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/d;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 524
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 526
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 524
a=0;//     return-object v1
a=0;// 
a=0;//     .line 525
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 526
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 527
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 510
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 508
a=0;//     return-object v1
a=0;// 
a=0;//     .line 509
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 510
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 511
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 263
a=0;//     .line 266
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
a=0;//     .line 267
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
a=0;//     .line 268
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 270
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v2, v4, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_b
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     .line 280
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 286
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 297
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 271
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v0, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_b
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_6
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_3
a=0;// 
a=0;//     .line 280
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 282
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;// 
a=0;//     .line 286
a=0;//     :cond_1
a=0;//     :goto_4
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
a=0;// 
a=0;//     .line 297
a=0;//     :cond_2
a=0;//     :goto_5
a=0;//     #v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 284
a=0;//     :catch_1
a=0;//     #v2=(Reference,[B);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 292
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 284
a=0;//     :catch_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 292
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 277
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
a=0;//     .line 280
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 282
a=0;//     :try_start_a
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7
a=0;// 
a=0;//     .line 286
a=0;//     :cond_3
a=0;//     :goto_7
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 292
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 284
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 279
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
a=0;//     .line 280
a=0;//     :goto_8
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/BufferedInputStream;);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 282
a=0;//     :try_start_c
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
a=0;// 
a=0;//     .line 286
a=0;//     :cond_4
a=0;//     :goto_9
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_9
a=0;// 
a=0;//     .line 294
a=0;//     :cond_5
a=0;//     :goto_a
a=0;//     throw v0
a=0;// 
a=0;//     .line 284
a=0;//     :catch_8
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 292
a=0;//     :catch_9
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 279
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
a=0;//     .line 277
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
a=0;//     .line 275
a=0;//     :catch_c
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
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
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 563
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/sdk/util/c;->b(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 565
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 567
a=0;//     return-void
a=0;// 
a=0;//     .line 564
a=0;//     :catchall_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 565
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 566
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 586
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 587
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 588
a=0;//     new-instance v3, Ljava/util/zip/ZipInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/zip/ZipInputStream;);
a=0;//     invoke-direct {v3, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 591
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/zip/ZipInputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/zip/ZipEntry;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 617
a=0;//     return-void
a=0;// 
a=0;//     .line 592
a=0;//     :cond_0
a=0;//     const-string v2, "KRSLOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "entry = "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 593
a=0;//     invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->isDirectory()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 594
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 595
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 596
a=0;//     const-string v1, "KRSLOG"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "mkDir : "
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 598
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 599
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 600
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 601
a=0;//     const-string v2, "KRSLOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "parent : "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 602
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 603
a=0;//     const-string v2, "KRSLOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "mkDir2 : "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 604
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 606
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 608
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 609
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 610
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
a=0;// 
a=0;//     .line 611
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 613
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 612
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 613
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 614
a=0;//     throw v0
a=0;// 
a=0;//     .line 612
a=0;//     :catchall_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 647
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 651
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 652
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 653
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 666
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v3=(Reference,[B);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     .line 679
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 680
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 673
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 677
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 667
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v0=(Null);v3=(Integer);v4=(Reference,Ljava/io/InputStream;);
a=0;//     new-array v5, v3, [B
a=0;// 
a=0;//     .line 668
a=0;//     #v5=(Reference,[B);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v1, v6, v5, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 670
a=0;//     invoke-static {v5}, Lcom/kingroot/sdk/util/Cryptor;->z([B)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 671
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     array-length v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v3, v5, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 674
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 675
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 676
a=0;//     const/16 v4, 0x1b90
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "assetFile = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", destFile = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     .line 679
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 680
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 678
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 679
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 680
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 681
a=0;//     throw v0
a=0;// 
a=0;//     .line 678
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Reference,Landroid/content/res/AssetManager;);v2=(Conflicted);v3=(Null);v4=(Reference,Ljava/io/InputStream;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/Throwable;);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 674
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 746
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "extractSu srcPath = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", dstPath = "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 756
a=0;//     :try_start_0
a=0;//     new-instance v4, Ljava/util/zip/ZipFile;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/zip/ZipFile;);
a=0;//     invoke-direct {v4, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_a
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 757
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/util/zip/ZipFile;);
a=0;//     invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 758
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "res"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-char v5, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "raw"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 759
a=0;//     sget-char v5, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "su"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 758
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 760
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_b
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 783
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
a=0;// 
a=0;//     .line 791
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 793
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
a=0;// 
a=0;//     .line 798
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 800
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_9
a=0;// 
a=0;//     .line 806
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "extractSu result = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 807
a=0;//     return v0
a=0;// 
a=0;//     .line 761
a=0;//     :cond_3
a=0;//     :try_start_5
a=0;//     #v1=(Null);v3=(Null);v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     .line 762
a=0;//     invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 763
a=0;//     invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 767
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 768
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_b
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 769
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v5, 0x2000
a=0;// 
a=0;//     :try_start_6
a=0;//     #v5=(PosShort);
a=0;//     new-array v5, v5, [B
a=0;// 
a=0;//     .line 771
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 772
a=0;//     :goto_4
a=0;//     :try_start_7
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_4
a=0;// 
a=0;//     .line 776
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 777
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 773
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v2, v5, v6, v0}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_3
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 781
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_5
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_3
a=0;// 
a=0;//     .line 783
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 785
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
a=0;// 
a=0;//     .line 791
a=0;//     :cond_5
a=0;//     :goto_6
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 793
a=0;//     :try_start_a
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
a=0;// 
a=0;//     .line 798
a=0;//     :cond_6
a=0;//     :goto_7
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     .line 800
a=0;//     :try_start_b
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 801
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 787
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 795
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 802
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 782
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 783
a=0;//     :goto_8
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Reference,Ljava/util/zip/ZipFile;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 785
a=0;//     :try_start_c
a=0;//     invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4
a=0;// 
a=0;//     .line 791
a=0;//     :cond_7
a=0;//     :goto_9
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 793
a=0;//     :try_start_d
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
a=0;// 
a=0;//     .line 798
a=0;//     :cond_8
a=0;//     :goto_a
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 800
a=0;//     :try_start_e
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6
a=0;// 
a=0;//     .line 805
a=0;//     :cond_9
a=0;//     :goto_b
a=0;//     throw v0
a=0;// 
a=0;//     .line 787
a=0;//     :catch_4
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 795
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 802
a=0;//     :catch_6
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 787
a=0;//     :catch_7
a=0;//     #v0=(Boolean);v1=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v5=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 795
a=0;//     :catch_8
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 802
a=0;//     :catch_9
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 782
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Null);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_2
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v6=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 781
a=0;//     :catch_a
a=0;//     #v1=(Null);v3=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/zip/ZipFile;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/InputStream;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private static c(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 811
a=0;//     .line 812
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unzipSu srcPath = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", dstPath = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 813
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 815
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v1, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 816
a=0;//     #v1=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 817
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v3, 0x400
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     .line 819
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/zip/GZIPInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     .line 822
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 823
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 829
a=0;//     :try_start_2
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
a=0;// 
a=0;//     .line 837
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unzipSu srcPath = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", dstPath = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", result = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 838
a=0;//     return v0
a=0;// 
a=0;//     .line 820
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Reference,[B);v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v5, v4}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 825
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 829
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 831
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 833
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 826
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_6
a=0;//     #v1=(Reference,Ljava/lang/Exception;);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 829
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 831
a=0;//     :try_start_7
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 833
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 828
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 829
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 831
a=0;//     :try_start_8
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
a=0;// 
a=0;//     .line 836
a=0;//     :cond_2
a=0;//     :goto_5
a=0;//     throw v0
a=0;// 
a=0;//     .line 833
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(One);v2=(Reference,Ljava/io/FileOutputStream;);v4=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 828
a=0;//     :catchall_1
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 826
a=0;//     :catch_6
a=0;//     #v0=(Null);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 825
a=0;//     :catch_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
}}
