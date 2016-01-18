package com.kingroot.kinguser; class fu { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/fu;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static ck()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v0, "a3"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fj;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uu;->bR(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v2, Ljava/util/Properties;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v2}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #v2=(Reference,Ljava/util/Properties;);
a=0;//     const-string v3, "a2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/fj;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/wq;->c([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v3, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 48
a=0;//     #v3=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayInputStream;->close()V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "a3"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fj;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     .line 53
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
