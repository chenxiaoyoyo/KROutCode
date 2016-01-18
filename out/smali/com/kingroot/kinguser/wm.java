package com.kingroot.kinguser; class wm { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/wm;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final vc:Ljava/lang/String;
a=0;// 
a=0;// .field private static final vd:Ljava/lang/String;
a=0;// 
a=0;// .field private static final ve:Ljava/lang/String;
a=0;// 
a=0;// .field private static final vf:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final vg:Ljava/lang/Object;
a=0;// 
a=0;// .field private final vh:Ljava/lang/Object;
a=0;// 
a=0;// .field private vi:Ljava/lang/Process;
a=0;// 
a=0;// .field private vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;// .field private vk:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;// .field private vl:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;// .field private vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;// .field private vn:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     const-string v0, "vt1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/wm;->vc:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     const-string v0, "vt2"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/wm;->vd:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     const-string v0, "vt3"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/wm;->ve:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     const-string v0, "vt4"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/wm;->vf:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vh:Ljava/lang/Object;
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vn:Ljava/io/ByteArrayOutputStream;
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
a=0;//     .line 75
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
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 79
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v2, 0xa
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 80
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 84
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v0}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 80
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 86
a=0;//     :catch_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 94
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wn;);
a=0;//     const-string v1, "StrReader"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Process;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/wm;->vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/kingroot/kinguser/wn;-><init>(Lcom/kingroot/kinguser/wm;Ljava/lang/String;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wn;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vk:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wn;);
a=0;//     const-string v1, "ErrReader"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/wm;->vn:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/kingroot/kinguser/wn;-><init>(Lcom/kingroot/kinguser/wm;Ljava/lang/String;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wn;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/wm;->vl:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 101
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v2, 0xa
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 102
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vk:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wn;->start()V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vl:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wn;->start()V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// 
a=0;//     .line 102
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/wp;J)Lcom/kingroot/kinguser/wo;
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
a=0;//     .line 260
a=0;//     #v6=(Byte);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 262
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/wm;->vh:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 263
a=0;//     :try_start_1
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/wm;->vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 264
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v4}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 265
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/kingroot/kinguser/wm;->vd:Ljava/lang/String;
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
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 268
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 270
a=0;//     :try_start_2
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p2, p3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 272
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wm;->vh:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 275
a=0;//     :try_start_3
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/wm;->vn:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 278
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 279
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v3}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 281
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/wm;->vd:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_5
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vn:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 284
a=0;//     sget-object v1, Lcom/kingroot/kinguser/wm;->ve:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_2
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/wm;->vd:Ljava/lang/String;
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
a=0;//     .line 286
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wo;);
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
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
a=0;//     invoke-direct {v0, v3, v4, v1, v5}, Lcom/kingroot/kinguser/wo;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 300
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v6=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 266
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :try_start_5
a=0;//     throw v0
a=0;// 
a=0;//     .line 272
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_2
a=0;//     :try_start_6
a=0;//     #v0=(One);v1=(Integer);v3=(Reference,[B);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/wm;->vf:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_3
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/kinguser/wm;->vf:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_4
a=0;// 
a=0;//     .line 290
a=0;//     :cond_3
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 294
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/wm;->vd:Ljava/lang/String;
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
a=0;//     .line 295
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wo;);
a=0;//     iget-object v4, p1, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {v0, v4, v1, v3, v5}, Lcom/kingroot/kinguser/wo;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v1=(Integer);v3=(Reference,[B);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Byte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 292
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 298
a=0;//     :cond_5
a=0;//     :try_start_7
a=0;//     #v1=(Integer);
a=0;//     monitor-exit v2
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     .line 300
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bM()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     sget-object v0, Lcom/kingroot/kinguser/wm;->vf:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/kinguser/wm;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vh:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/kingroot/kinguser/wm;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private ma()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 329
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     const-string v1, "exit\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     const-wide/16 v1, 0x64
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 336
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vk:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vk:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wn;->interrupt()V
a=0;// 
a=0;//     .line 338
a=0;//     iput-object v3, p0, Lcom/kingroot/kinguser/wm;->vk:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     .line 340
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vl:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vl:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wn;->interrupt()V
a=0;// 
a=0;//     .line 342
a=0;//     iput-object v3, p0, Lcom/kingroot/kinguser/wm;->vl:Lcom/kingroot/kinguser/wn;
a=0;// 
a=0;//     .line 344
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 347
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 351
a=0;//     :goto_1
a=0;//     iput-object v3, p0, Lcom/kingroot/kinguser/wm;->vi:Ljava/lang/Process;
a=0;// 
a=0;//     .line 353
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 348
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 332
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized L(Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 153
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/wm;->b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 153
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 152
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
a=0;// .method public declared-synchronized Y(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/wm;->d(Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-direct {v0, p1, p1, p2, p3}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/wm;->b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
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
a=0;// .method public declared-synchronized b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 208
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/wp;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p1, Lcom/kingroot/kinguser/wp;->vw:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 209
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
a=0;//     .line 208
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vh:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 213
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vm:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vn:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 215
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 219
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p1, Lcom/kingroot/kinguser/wp;->vv:Ljava/lang/String;
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
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 224
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vg:Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v4, 0xa
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 225
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 228
a=0;//     :try_start_5
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/kinguser/wm;->vc:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wm;->vj:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 231
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 235
a=0;//     :cond_2
a=0;//     #v0=(LongLo);v1=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-wide v6, p1, Lcom/kingroot/kinguser/wp;->vw:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v6, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 236
a=0;//     iget-wide v0, p1, Lcom/kingroot/kinguser/wp;->vw:J
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
a=0;//     .line 237
a=0;//     cmp-long v6, v0, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_3
a=0;// 
a=0;//     .line 248
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
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 215
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :try_start_7
a=0;//     throw v0
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     .line 225
a=0;//     :catchall_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_8
a=0;//     monitor-exit v1
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_2
a=0;// 
a=0;//     :try_start_9
a=0;//     throw v0
a=0;// 
a=0;//     .line 242
a=0;//     :cond_3
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Byte);v7=(LongHi);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/kingroot/kinguser/wm;->a(Lcom/kingroot/kinguser/wp;J)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 243
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 244
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v6
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b(Ljava/util/List;Z)Ljava/util/List;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 137
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/kinguser/wm;->d(Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 137
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 136
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
a=0;// .method public declared-synchronized d(Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-wide/32 v0, 0x1d4c0
a=0;// 
a=0;//     .line 182
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-direct {v2, p1, p1, v0, v1}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/wm;->b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected finalize()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-super {p0}, Ljava/lang/Object;->finalize()V
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shutdown()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/wm;->ma()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 322
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 320
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
