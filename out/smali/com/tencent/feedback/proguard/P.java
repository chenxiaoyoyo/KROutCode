package com.tencent.feedback.proguard; class P { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/P;
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
a=0;//     .line 9
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/P;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a([B)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v1, Ljava/util/zip/ZipOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/zip/ZipOutputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 17
a=0;//     #v1=(Reference,Ljava/util/zip/ZipOutputStream;);
a=0;//     new-instance v2, Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/ZipEntry;);
a=0;//     const-string v3, "zip"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 18
a=0;//     #v2=(Reference,Ljava/util/zip/ZipEntry;);
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/util/zip/ZipEntry;->setSize(J)V
a=0;// 
a=0;//     .line 19
a=0;//     invoke-virtual {v1, v2}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V
a=0;// 
a=0;//     .line 20
a=0;//     invoke-virtual {v1, p1}, Ljava/util/zip/ZipOutputStream;->write([B)V
a=0;// 
a=0;//     .line 21
a=0;//     invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->close()V
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 25
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final b([B)[B
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     #v6=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 32
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v2, Ljava/util/zip/ZipInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/ZipInputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 33
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Reference,Ljava/util/zip/ZipInputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/zip/ZipEntry;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
a=0;// 
a=0;//     .line 48
a=0;//     return-object v0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v0, v6, v4}, Ljava/util/zip/ZipInputStream;->read([BII)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_1
a=0;//     invoke-virtual {v3, v0, v6, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
