package com.kingroot.kinguser; class rx { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/rx;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static B(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/rx;->bp(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 38
a=0;//     :cond_2
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Landroid/net/LocalSocketAddress$Namespace;->FILESYSTEM:Landroid/net/LocalSocketAddress$Namespace;
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Landroid/net/LocalSocketAddress$Namespace;);
a=0;//     new-instance v2, Landroid/net/LocalSocketAddress;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/net/LocalSocketAddress;);
a=0;//     invoke-direct {v2, p0, v0}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V
a=0;// 
a=0;//     .line 43
a=0;//     #v2=(Reference,Landroid/net/LocalSocketAddress;);
a=0;//     new-instance v0, Landroid/net/LocalSocket;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/net/LocalSocket;);
a=0;//     invoke-direct {v0}, Landroid/net/LocalSocket;-><init>()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 44
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);
a=0;//     invoke-virtual {v0, v2}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V
a=0;// 
a=0;//     .line 46
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fc()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 60
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/net/LocalSocket;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 115
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0}, Landroid/net/LocalSocket;->close()V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fc()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0}, Landroid/net/LocalSocket;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;ZLandroid/net/LocalSocket;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 192
a=0;//     #v0=(One);
a=0;//     invoke-static {p2, p3}, Lcom/kingroot/kinguser/rx;->a(Landroid/net/LocalSocket;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     const-string v1, "s2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eq p3, v1, :cond_0
a=0;// 
a=0;//     const-string v1, "s1"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-ne p3, v1, :cond_3
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 211
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     invoke-static {p0, v1, v0}, Lcom/kingroot/kinguser/st;->a(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 206
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 207
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 216
a=0;//     #v0=(One);
a=0;//     invoke-static {p2, p3}, Lcom/kingroot/kinguser/rx;->B(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 221
a=0;//     const-string v1, "s2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eq p3, v1, :cond_0
a=0;// 
a=0;//     const-string v1, "s1"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-ne p3, v1, :cond_3
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 225
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 227
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 235
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     invoke-static {p0, v1, v0}, Lcom/kingroot/kinguser/st;->a(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 236
a=0;//     return-void
a=0;// 
a=0;//     .line 229
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 230
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 231
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bo(Ljava/lang/String;)Landroid/net/LocalSocket;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 103
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Uninit);
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/rx;->bp(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 87
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/net/LocalSocketAddress$Namespace;->FILESYSTEM:Landroid/net/LocalSocketAddress$Namespace;
a=0;// 
a=0;//     .line 88
a=0;//     #v0=(Reference,Landroid/net/LocalSocketAddress$Namespace;);
a=0;//     new-instance v2, Landroid/net/LocalSocketAddress;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/net/LocalSocketAddress;);
a=0;//     invoke-direct {v2, p0, v0}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Reference,Landroid/net/LocalSocketAddress;);
a=0;//     new-instance v0, Landroid/net/LocalSocket;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/net/LocalSocket;);
a=0;//     invoke-direct {v0}, Landroid/net/LocalSocket;-><init>()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);
a=0;//     invoke-virtual {v0, v2}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 93
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 95
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     :catch_1
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 92
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static bp(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 141
a=0;//     #v0=(One);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->canWrite()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 145
a=0;//     :cond_1
a=0;//     #v0=(One);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 146
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "chown "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v2, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v2, v2, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "/data/data/com.kingroot.kinguser/cache"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 149
a=0;//     const-string v2, "chmod 0771 /data/data/com.kingroot.kinguser/cache"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 152
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->canWrite()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
