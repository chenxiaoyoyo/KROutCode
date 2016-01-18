package com.kingroot.kinguser; class ux { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ux;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/Reader;Ljava/io/Writer;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/ux;->b(Ljava/io/Reader;Ljava/io/Writer;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v2, 0x7fffffff
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 37
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/Closeable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/io/Closeable;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 24
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/InputStream;Ljava/io/Writer;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     new-instance v0, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 30
a=0;//     #v0=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/kinguser/ux;->a(Ljava/io/Reader;Ljava/io/Writer;)I
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/io/Reader;Ljava/io/Writer;)J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v2, v0, [C
a=0;// 
a=0;//     .line 42
a=0;//     #v2=(Reference,[C);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {p0, v2}, Ljava/io/Reader;->read([C)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v2, v3, v4}, Ljava/io/Writer;->write([CII)V
a=0;// 
a=0;//     .line 46
a=0;//     int-to-long v3, v4
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v0, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v3=(Byte);v4=(Integer);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Ljava/io/StringWriter;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/ux;->a(Ljava/io/InputStream;Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
