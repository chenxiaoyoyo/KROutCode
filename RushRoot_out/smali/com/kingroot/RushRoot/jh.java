package com.kingroot.RushRoot; class jh { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     .line 27
a=0;//     #v2=(Reference,[B);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 30
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 34
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v0, v3
a=0;// 
a=0;//     .line 28
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Byte);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/Closeable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/io/Closeable;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 50
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
}}
