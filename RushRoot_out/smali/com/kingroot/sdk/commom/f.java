package com.kingroot.sdk.commom; class f { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/commom/f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     const-string v0, "/proc/version"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 22
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "linuxVersion = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 26
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 111
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v2, "sh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 112
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v1, "export PATH=/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:$PATH"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "getprop "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-wide/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;J)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 115
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 125
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 118
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fn;);v1=(Reference,Ljava/lang/Exception;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 121
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 125
a=0;//     :cond_1
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 121
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Lcom/kingroot/RushRoot/fn;);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 124
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     .line 120
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v1
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v4
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 118
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b()Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const-string v0, "getPrevSuVersion() end"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 62
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "/system/bin/su"
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     const-string v0, "/system/xbin/su"
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     const-string v0, "getPrevSuVersion() end notExists"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/ProcessBuilder;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const-string v5, "-v"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v4, v0
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/ProcessBuilder;->command([Ljava/lang/String;)Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 79
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/Process;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 81
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v4, 0x400
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     new-array v4, v4, [B
a=0;// 
a=0;//     .line 86
a=0;//     :goto_2
a=0;//     #v4=(Reference,[B);v6=(Conflicted);
a=0;//     invoke-virtual {v0, v4}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-gtz v5, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v0, v4, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 96
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     .line 99
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 100
a=0;//     const-string v0, "getPrevSuVersion() end"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Null);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/lang/Process;);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Reference,[B);v5=(Integer);v6=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v3, v4, v6, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 94
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 95
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 96
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     .line 97
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
