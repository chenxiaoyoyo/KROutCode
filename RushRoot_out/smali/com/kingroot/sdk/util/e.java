package com.kingroot.sdk.util; class e { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/util/e;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     .line 38
a=0;//     #v2=(Reference,[B);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 41
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 45
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v0, v3
a=0;// 
a=0;//     .line 39
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Byte);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;)Ljava/util/List;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 127
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v0, Ljava/io/FileReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileReader;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 135
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 136
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 138
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 143
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 145
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 146
a=0;//     :goto_4
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 147
a=0;//     throw v0
a=0;// 
a=0;//     .line 145
a=0;//     :catchall_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 143
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 142
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/Closeable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/io/Closeable;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v2, 0x19000
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 111
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v0, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileWriter;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, p0, v3}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 113
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v3}, Landroid/util/Base64;->encode([BI)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 117
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 121
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 122
a=0;//     throw v0
a=0;// 
a=0;//     .line 120
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 118
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v3=(PosByte);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 117
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static varargs a(Ljava/io/File;[Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v0, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileWriter;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 73
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     .line 74
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 73
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 78
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 79
a=0;//     throw v0
a=0;// 
a=0;//     .line 77
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
}}
