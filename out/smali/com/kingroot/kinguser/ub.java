package com.kingroot.kinguser; class ub { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/ub;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ub;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public M(Ljava/lang/String;)Ljava/util/Properties;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     new-instance v1, Ljava/util/Properties;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v1}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/Properties;);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/uu;->bQ(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ub;->cl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/vy;->l([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/kinguser/vy;->c([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v2, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 54
a=0;//     #v2=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 59
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 56
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/Properties;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v1}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ub;->cl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/vy;->l([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/vy;->b([B[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-static {v1, p1}, Lcom/kingroot/kinguser/uu;->b([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bK(Ljava/lang/String;)Ljava/util/Properties;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v0}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 27
a=0;//     #v1=(Reference,[B);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ub;->cl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/vy;->l([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/kinguser/vy;->c([B[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v2, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 34
a=0;//     #v2=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 36
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 37
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract cl()Ljava/lang/String;
a=0;// .end method
}}
