package com.kingroot.RushRoot; class jp { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jp;
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
a=0;// .field private e:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;// .field private f:Lcom/kingroot/RushRoot/jq;
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
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/jp;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->b:Ljava/lang/Object;
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     .line 58
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 59
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
a=0;//     .line 62
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
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runtime;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 73
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v2, 0xa
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 72
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 84
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v0}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 72
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 81
a=0;//     :catch_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jq;);
a=0;//     const-string v1, "StrReader"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Process;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/jp;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/kingroot/RushRoot/jq;-><init>(Lcom/kingroot/RushRoot/jp;Ljava/lang/String;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jq;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->e:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jq;);
a=0;//     const-string v1, "ErrReader"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/jp;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/kingroot/RushRoot/jq;-><init>(Lcom/kingroot/RushRoot/jp;Ljava/lang/String;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jq;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->f:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 95
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v2, 0xa
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 94
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->e:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/jq;->start()V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->f:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/jq;->start()V
a=0;// 
a=0;//     .line 100
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/RushRoot/js;J)Lcom/kingroot/RushRoot/jr;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 182
a=0;//     #v6=(Byte);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/jp;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 185
a=0;//     :try_start_1
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/jp;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v4}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 187
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ":RET="
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v6, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 190
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     :try_start_2
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p2, p3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/jp;->b:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 197
a=0;//     :try_start_3
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/jp;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 200
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 201
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v3}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 203
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ":RET="
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_5
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 206
a=0;//     const-string v1, ":RET=0"
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_2
a=0;// 
a=0;//     .line 207
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v3, ":RET="
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v4, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jr;);
a=0;//     iget-object v3, p1, Lcom/kingroot/RushRoot/js;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {v0, v3, v4, v1, v5}, Lcom/kingroot/RushRoot/jr;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jr;);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 222
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v6=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 184
a=0;//     :catchall_0
a=0;//     #v0=(One);v1=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 182
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_2
a=0;//     :try_start_5
a=0;//     #v0=(One);v1=(Integer);v3=(Reference,[B);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ":RET=EOF"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_3
a=0;// 
a=0;//     const-string v1, ":RET=EOF"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_4
a=0;// 
a=0;//     .line 212
a=0;//     :cond_3
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 216
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v6, ":RET="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 217
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jr;);
a=0;//     iget-object v4, p1, Lcom/kingroot/RushRoot/js;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {v0, v4, v1, v3, v5}, Lcom/kingroot/RushRoot/jr;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jr;);
a=0;//     monitor-exit v2
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 196
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v1=(Integer);v3=(Reference,[B);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Byte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 214
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 222
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/jp;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/jp;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a(Lcom/kingroot/RushRoot/js;)Lcom/kingroot/RushRoot/jr;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/js;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/js;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/js;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/js;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p1, Lcom/kingroot/RushRoot/js;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
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
a=0;//     .line 131
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 136
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->g:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->h:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 135
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 141
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p1, Lcom/kingroot/RushRoot/js;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->a:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v4, 0xa
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 145
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 150
a=0;//     :try_start_5
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     const-string v1, "echo :RET=$?\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 157
a=0;//     :cond_3
a=0;//     #v0=(LongLo);v1=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-wide v6, p1, Lcom/kingroot/RushRoot/js;->c:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v6, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 158
a=0;//     iget-wide v0, p1, Lcom/kingroot/RushRoot/js;->c:J
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
a=0;//     .line 159
a=0;//     cmp-long v6, v0, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_5
a=0;// 
a=0;//     .line 160
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/kingroot/RushRoot/jp;->a(Lcom/kingroot/RushRoot/js;J)Lcom/kingroot/RushRoot/jr;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 165
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/jr;);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 166
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v6
a=0;// 
a=0;//     .line 135
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
a=0;//     .line 145
a=0;//     :catchall_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_5
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
a=0;// .method public final declared-synchronized a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jr;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/js;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/js;);
a=0;//     const-wide/16 v1, 0x7530
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {v0, p1, p1, v1, v2}, Lcom/kingroot/RushRoot/js;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/js;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/jp;->a(Lcom/kingroot/RushRoot/js;)Lcom/kingroot/RushRoot/jr;
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
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     const-string v2, "exit\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->d:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     const-wide/16 v2, 0x64
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->e:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->e:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jq;->interrupt()V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/jp;->e:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jq;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->f:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->f:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jq;->interrupt()V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/jp;->f:Lcom/kingroot/RushRoot/jq;
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jq;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Process;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jp;->c:Ljava/lang/Process;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 244
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final finalize()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/jp;->a()V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-super {p0}, Ljava/lang/Object;->finalize()V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
}}
