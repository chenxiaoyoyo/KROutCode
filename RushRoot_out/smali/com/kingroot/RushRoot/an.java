package com.kingroot.RushRoot; class an { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/an;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 35
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v2, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     .line 36
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 38
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     .line 44
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
