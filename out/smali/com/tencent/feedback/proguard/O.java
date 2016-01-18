package com.tencent.feedback.proguard; class O { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/O;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/proguard/N;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 8
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/O;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a([B)[B
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v1, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 16
a=0;//     #v1=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/zip/GZIPOutputStream;->write([B)V
a=0;// 
a=0;//     .line 17
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->finish()V
a=0;// 
a=0;//     .line 18
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;// 
a=0;//     .line 19
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 20
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 21
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final b([B)[B
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 26
a=0;//     #v6=(Null);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 28
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v1, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 29
a=0;//     #v1=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     .line 31
a=0;//     #v2=(Reference,[B);
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v6, v4}, Ljava/util/zip/GZIPInputStream;->read([BII)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
a=0;// 
a=0;//     .line 41
a=0;//     return-object v2
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v2, v6, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
