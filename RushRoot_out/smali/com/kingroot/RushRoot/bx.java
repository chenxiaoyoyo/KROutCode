package com.kingroot.RushRoot; class bx { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/bx;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Ljava/lang/Object;
a=0;// 
a=0;// .field private final b:Ljava/lang/Object;
a=0;// 
a=0;// .field private c:Ljava/lang/Process;
a=0;// 
a=0;// .field private d:Ljava/io/DataOutputStream;
a=0;// 
a=0;// .field private e:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;// .field private f:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;// .field private g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;// .field private h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/bx;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->b:Ljava/lang/Object;
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     .line 64
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v1, Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/ProcessBuilder;-><init>(Ljava/util/List;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 84
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v2, 0xa
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 85
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 87
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v0}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 85
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 92
a=0;//     :catch_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/by;);
a=0;//     const-string v1, "KR.StrReader"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Process;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/bx;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/kingroot/RushRoot/by;-><init>(Lcom/kingroot/RushRoot/bx;Ljava/lang/String;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/by;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->e:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/by;);
a=0;//     const-string v1, "KR.ErrReader"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/bx;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/kingroot/RushRoot/by;-><init>(Lcom/kingroot/RushRoot/bx;Ljava/lang/String;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/by;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->f:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v2, 0xa
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 109
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->e:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/by;->start()V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->f:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/by;->start()V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// 
a=0;//     .line 109
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(Lcom/kingroot/RushRoot/ca;)Lcom/kingroot/RushRoot/bz;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 248
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/ca;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/ca;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/ca;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/ca;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-wide v0, p1, Lcom/kingroot/RushRoot/ca;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     .line 249
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Cmd Argument Invalid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 248
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/bx;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 255
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 258
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p1, Lcom/kingroot/RushRoot/ca;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, "\n"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 263
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v4, 0xa
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 264
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 267
a=0;//     :try_start_5
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     const-string v1, "echo :RET=$?\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 270
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 274
a=0;//     :cond_4
a=0;//     #v0=(LongLo);v1=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-wide v6, p1, Lcom/kingroot/RushRoot/ca;->c:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v6, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 275
a=0;//     iget-wide v0, p1, Lcom/kingroot/RushRoot/ca;->c:J
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     sub-long/2addr v6, v4
a=0;// 
a=0;//     const-wide/32 v8, 0xf4240
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     div-long/2addr v6, v8
a=0;// 
a=0;//     sub-long/2addr v0, v6
a=0;// 
a=0;//     .line 277
a=0;//     cmp-long v6, v0, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_6
a=0;// 
a=0;//     .line 278
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/kingroot/RushRoot/bx;->a(Lcom/kingroot/RushRoot/ca;J)Lcom/kingroot/RushRoot/bz;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 283
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/bz;);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 284
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v6
a=0;// 
a=0;//     .line 255
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Object;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 264
a=0;//     :catchall_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 288
a=0;//     :cond_6
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Byte);v7=(LongHi);v8=(LongLo);v9=(LongHi);
a=0;//     new-instance v0, Ljava/util/concurrent/TimeoutException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/TimeoutException;);
a=0;//     const-string v1, "Exec Timeout"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/TimeoutException;);
a=0;//     throw v0
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/RushRoot/ca;J)Lcom/kingroot/RushRoot/bz;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 304
a=0;//     #v2=(Null);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     .line 306
a=0;//     :try_start_0
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/bx;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 307
a=0;//     :try_start_1
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/bx;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v6, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v3}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 309
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ":RET="
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v9, :cond_1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     monitor-exit v5
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 312
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     :try_start_2
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, p2, p3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/bx;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 329
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     :try_start_3
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/StringBuilder;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     .line 330
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/io/ByteArrayOutputStream;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Lcom/kingroot/RushRoot/bx;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     iget-object v7, p0, Lcom/kingroot/RushRoot/bx;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     .line 331
a=0;//     :goto_1
a=0;//     #v2=(Integer);v6=(Boolean);v8=(Conflicted);
a=0;//     if-ge v2, v1, :cond_2
a=0;// 
a=0;//     .line 332
a=0;//     aget-object v6, v4, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     aget-object v8, v5, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,[B);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 331
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Null);v3=(Integer);v6=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 309
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 316
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 334
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v5=(Reference,[Ljava/io/ByteArrayOutputStream;);v6=(Boolean);v7=(Reference,Ujava/lang/Object;);v8=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v4, v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 335
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 337
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ":RET="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v9, :cond_6
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/bx;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/bx;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 340
a=0;//     const-string v5, ":RET=0"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v9, :cond_3
a=0;// 
a=0;//     .line 341
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v5, ":RET="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 343
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bz;);
a=0;//     iget-object v2, p1, Lcom/kingroot/RushRoot/ca;->a:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {v0, v2, v5, v1, v4}, Lcom/kingroot/RushRoot/bz;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bz;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     .line 361
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 347
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(PosByte);v5=(Integer);v6=(Boolean);
a=0;//     const-string v5, ":RET=EOF"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v9, :cond_4
a=0;// 
a=0;//     const-string v5, ":RET=EOF"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v9, :cond_5
a=0;// 
a=0;//     .line 353
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v6, ":RET="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 355
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bz;);
a=0;//     iget-object v2, p1, Lcom/kingroot/RushRoot/ca;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {v0, v2, v1, v5, v4}, Lcom/kingroot/RushRoot/bz;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bz;);
a=0;//     monitor-exit v3
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 359
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(One);v1=(PosByte);v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Integer);v6=(Boolean);v7=(Reference,Ujava/lang/Object;);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 351
a=0;//     #v1=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 359
a=0;//     :cond_6
a=0;//     #v1=(PosByte);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     .line 361
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/bx;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/bx;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a(Ljava/lang/String;)Lcom/kingroot/RushRoot/bz;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ca;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ca;);
a=0;//     invoke-direct {v0, p1, p1}, Lcom/kingroot/RushRoot/ca;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ca;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/bx;->a(Lcom/kingroot/RushRoot/ca;)Lcom/kingroot/RushRoot/bz;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->e:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/by;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->e:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/by;->interrupt()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->e:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/by;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->f:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->f:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/by;->interrupt()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->f:Lcom/kingroot/RushRoot/by;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/by;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bx;->c:Ljava/lang/Process;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 386
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final finalize()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/bx;->a()V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-super {p0}, Ljava/lang/Object;->finalize()V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
}}
