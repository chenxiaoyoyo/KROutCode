package com.kingroot.kinguser; class hu { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/hu;
a=0;// .super Lcom/kingroot/kinguser/gy;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static ij:[B
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ib:Z
a=0;// 
a=0;// .field private ic:Z
a=0;// 
a=0;// .field private ie:Z
a=0;// 
a=0;// .field private if:Z
a=0;// 
a=0;// .field private ig:Z
a=0;// 
a=0;// .field private ih:Z
a=0;// 
a=0;// .field private ii:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/hu;->ij:[B
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x7ft
a=0;//         0x45t
a=0;//         0x4ct
a=0;//         0x46t
a=0;//         0x1t
a=0;//         0x1t
a=0;//         0x1t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/gy;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/hu;);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ib:Z
a=0;// 
a=0;//     .line 35
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ic:Z
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ie:Z
a=0;// 
a=0;//     .line 41
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->if:Z
a=0;// 
a=0;//     .line 44
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     .line 45
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     .line 46
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 153
a=0;//     .line 155
a=0;//     #v4=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 166
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     array-length v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v4, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     aget-object v0, v5, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 160
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Null);v3=(Reference,Ljava/lang/Object;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v5=(Reference,[Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v1
a=0;// 
a=0;//     .line 173
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(Integer);v3=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_4
a=0;// 
a=0;//     .line 174
a=0;//     aget-object v6, v5, v0
a=0;// 
a=0;//     .line 176
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 181
a=0;//     :cond_2
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 173
a=0;//     :cond_3
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 186
a=0;//     :cond_4
a=0;//     #v6=(Integer);v7=(Conflicted);
a=0;//     if-eq v2, v4, :cond_5
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     :cond_5
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static ai(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     #v0=(Null);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 255
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(One);v4=(Reference,Ljava/io/File;);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     #v2=(Null);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v5, v1, [B
a=0;// 
a=0;//     .line 263
a=0;//     :try_start_0
a=0;//     #v5=(Reference,[B);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 264
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     const/16 v4, 0x3ff
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v1, v5, v2, v4}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 265
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v2, v4, :cond_2
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v5}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 267
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "#!/system/bin/sh"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 296
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     :try_start_2
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Boolean);v3=(One);v4=(Reference,Ljava/lang/String;);v6=(Uninit);
a=0;//     move v4, v0
a=0;// 
a=0;//     .line 272
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v2=(Integer);v4=(Integer);v6=(Conflicted);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/hu;->ij:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v4, v2, :cond_7
a=0;// 
a=0;//     .line 273
a=0;//     sget-object v2, Lcom/kingroot/kinguser/hu;->ij:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aget-byte v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aget-byte v6, v5, v4
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v2, v6, :cond_5
a=0;// 
a=0;//     .line 272
a=0;//     :cond_4
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 276
a=0;//     :cond_5
a=0;//     #v2=(Byte);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v4, v2, :cond_4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 287
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     #v2=(Boolean);v6=(Conflicted);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/hu;->ij:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     array-length v3, v3
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v4, v3, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 292
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Null);v3=(One);v4=(Reference,Ljava/io/File;);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 296
a=0;//     :goto_4
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 295
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Null);v3=(One);v4=(Reference,Ljava/io/File;);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 296
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 297
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     .line 301
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     throw v0
a=0;// 
a=0;//     .line 299
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 295
a=0;//     :catchall_1
a=0;//     #v0=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 292
a=0;//     :catch_4
a=0;//     #v0=(Null);v3=(One);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Null);v2=(Integer);v3=(One);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private aj(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 356
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "/system/bin/ddexereal"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 357
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 359
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/system/bin/ddexe_real"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/hu;->c(Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/hu;->ak(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 362
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Boolean);v2=(Uninit);
a=0;//     const-string v0, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/hu;->ai(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 363
a=0;//     const-string v0, "/system/bin/ddexe"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "/system/bin/ddexe_real"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/hu;->c(Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private ak(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 616
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 618
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/system/bin/ddexe"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 619
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     const-string v4, "/system/bin/ddexe_real"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 620
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 621
a=0;//     :cond_0
a=0;//     const-string v2, "#!/system/bin/sh\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 622
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\n\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 623
a=0;//     const-string v2, "/system/usr/ikm/ikmsu -d &\n\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 624
a=0;//     const-string v2, "/system/bin/ddexe_real\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 627
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "sh.tmp"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 628
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/uu;->b([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 629
a=0;//     const-string v1, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/kinguser/hu;->k(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 631
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 637
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 632
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     .line 106
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     .line 107
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     .line 111
a=0;//     invoke-static {p1, p2, p3, v0}, Lcom/kingroot/kinguser/hu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     .line 114
a=0;//     const-string v2, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v2, v3, v1}, Lcom/kingroot/kinguser/hu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     .line 118
a=0;//     const-string v2, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, p2, p3, v0}, Lcom/kingroot/kinguser/hu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     .line 122
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 123
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SM-N9002"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static c(Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hw;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/kingroot/kinguser/hw;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hw;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 607
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 373
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 374
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     const-string v1, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/hu;->m(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 410
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 382
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);v2=(Uninit);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 383
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SM-N9002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {p1, p3}, Lcom/kingroot/kinguser/hu;->l(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 394
a=0;//     invoke-static {p1, p2, p3, v0}, Lcom/kingroot/kinguser/hu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     .line 395
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ig:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 396
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 397
a=0;//     const-string v1, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/hu;->m(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 404
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 405
a=0;//     const-string v1, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p3}, Lcom/kingroot/kinguser/hu;->l(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 406
a=0;//     const-string v1, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     invoke-static {v1, p2, p3, v0}, Lcom/kingroot/kinguser/hu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     .line 410
a=0;//     :cond_4
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ih:Z
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->ii:Z
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :cond_5
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private j(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 207
a=0;//     .line 208
a=0;//     #v0=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 210
a=0;//     #v3=(Null);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v4, "/system/bin/ddexe_real"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(Boolean);v3=(Null);v4=(Conflicted);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v4, "/system/bin/ddexereal"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 217
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 218
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/hu;->ai(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 223
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 226
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 227
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 229
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 234
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     .line 235
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 236
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, v0, :cond_4
a=0;// 
a=0;//     .line 237
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     :catch_0
a=0;//     #v0=(One);v3=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static k(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hv;);
a=0;//     invoke-direct {v0, p1, p0}, Lcom/kingroot/kinguser/hv;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hv;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 454
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static l(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 464
a=0;//     #v2=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 465
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 468
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 469
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 471
a=0;//     :try_start_0
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 472
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 480
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v4=(Conflicted);
a=0;//     const-string v1, "#!/system/bin/sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 481
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\n"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 483
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 484
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 485
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 487
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_2
a=0;// 
a=0;//     .line 488
a=0;//     aget-object v4, v1, v0
a=0;// 
a=0;//     .line 489
a=0;//     #v4=(Null);
a=0;//     const-string v5, "#!/system/bin/sh"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     sget-object v5, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 490
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 487
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 473
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 496
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v1=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "install-recovery-2.sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 497
a=0;//     const-string v0, "\n/system/etc/install-recovery-2.sh\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 502
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "sh.tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 503
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/uu;->b([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 504
a=0;//     invoke-static {v0, p0}, Lcom/kingroot/kinguser/hu;->k(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 506
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 511
a=0;//     :goto_2
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     .line 507
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Null);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static m(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 521
a=0;//     .line 523
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 524
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 527
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 528
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 530
a=0;//     :try_start_0
a=0;//     new-instance v6, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v6, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 531
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move v4, v0
a=0;// 
a=0;//     .line 540
a=0;//     :goto_0
a=0;//     #v4=(Byte);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_3
a=0;// 
a=0;//     .line 541
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 542
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     array-length v1, v6
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 543
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Boolean);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     array-length v7, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v0, v7, :cond_1
a=0;// 
a=0;//     .line 544
a=0;//     aget-object v7, v6, v0
a=0;// 
a=0;//     .line 545
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 547
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 543
a=0;//     :goto_2
a=0;//     #v1=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 532
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v4=(Null);v6=(Conflicted);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 534
a=0;//     #v4=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 549
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Boolean);v6=(Reference,[Ljava/lang/String;);v7=(Null);v8=(Boolean);v9=(Conflicted);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v7=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 554
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 556
a=0;//     :try_start_1
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "sh.tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 557
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/uu;->b([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 558
a=0;//     invoke-static {v0, p0}, Lcom/kingroot/kinguser/hu;->k(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 568
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Byte);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 561
a=0;//     :catch_1
a=0;//     #v2=(One);v6=(Reference,[Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 563
a=0;//     #v2=(Byte);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(One);v6=(Conflicted);
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/File;);v2=(One);v4=(Null);v6=(Boolean);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 646
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ep()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 648
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " -d"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 650
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " -d &"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 653
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4, v0}, Lcom/kingroot/kinguser/hx;->o(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 658
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     const-string v4, "/system/bin/ddexe"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 659
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/hu;->ai(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 660
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 661
a=0;//     invoke-direct {p0, v0, v3}, Lcom/kingroot/kinguser/hu;->j(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 671
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 672
a=0;//     iget v1, v6, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v6, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v6, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-wide v4, v6, Lcom/kingroot/kinguser/hz;->ip:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-object v6, v6, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v8}, Lcom/kingroot/kinguser/ja;->a(IIIJLjava/lang/String;ZZ)V
a=0;// 
a=0;//     .line 678
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 663
a=0;//     :cond_1
a=0;//     #v1=(Byte);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Uninit);v7=(Null);v8=(One);
a=0;//     const-string v4, "/system/bin/ddexe_real"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     const-string v4, "/system/bin/ddexereal"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move v8, v7
a=0;// 
a=0;//     .line 665
a=0;//     #v8=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 668
a=0;//     :cond_3
a=0;//     #v8=(One);
a=0;//     invoke-static {v0, v2, v3, v8}, Lcom/kingroot/kinguser/hu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 675
a=0;//     :cond_4
a=0;//     #v8=(Boolean);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual/range {v0 .. v8}, Lcom/kingroot/kinguser/ja;->a(IIIJLjava/lang/String;ZZ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public db()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x1ed
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ib:Z
a=0;// 
a=0;//     .line 55
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ic:Z
a=0;// 
a=0;//     .line 57
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->ie:Z
a=0;// 
a=0;//     .line 58
a=0;//     iput-boolean v2, p0, Lcom/kingroot/kinguser/hu;->if:Z
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " -d"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, " -d &"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 66
a=0;//     const-string v0, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-direct {p0, v0, v4}, Lcom/kingroot/kinguser/hu;->j(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ib:Z
a=0;// 
a=0;//     .line 69
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ib:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 71
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     .line 72
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     .line 73
a=0;//     iput v6, v0, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     .line 74
a=0;//     const-string v5, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, v0, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     const-string v5, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/kingroot/kinguser/hx;->a(Ljava/lang/String;Lcom/kingroot/kinguser/hz;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v0, v5, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ie:Z
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ho;->dw()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v3, v4}, Lcom/kingroot/kinguser/hu;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v3, p0, Lcom/kingroot/kinguser/hu;->ic:Z
a=0;// 
a=0;//     .line 87
a=0;//     iget-boolean v3, p0, Lcom/kingroot/kinguser/hu;->ic:Z
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v3, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 89
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     iput v2, v3, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     .line 90
a=0;//     iput v2, v3, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     .line 91
a=0;//     iput v6, v3, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     .line 92
a=0;//     const-string v4, "u:object_r:system_file:s0"
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 95
a=0;//     const-string v0, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {v4, v3}, Lcom/kingroot/kinguser/hx;->a(Ljava/util/List;Lcom/kingroot/kinguser/hz;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hu;->if:Z
a=0;// 
a=0;//     .line 99
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ib:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ic:Z
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/hu;->ie:Z
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/hu;->if:Z
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v3=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v5=(Byte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 77
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Conflicted);v5=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 99
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public dc()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x1ed
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 309
a=0;//     #v5=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 312
a=0;//     #v0=(One);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " -d"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 314
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " -d &"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 317
a=0;//     iget-boolean v3, p0, Lcom/kingroot/kinguser/hu;->ib:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 320
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/hu;->aj(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 333
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ho;->dw()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 334
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v4, p0, Lcom/kingroot/kinguser/hu;->ic:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 337
a=0;//     invoke-direct {p0, v3, v1, v2}, Lcom/kingroot/kinguser/hu;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 351
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Uninit);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/kinguser/hu;->ie:Z
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 323
a=0;//     new-instance v3, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 324
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     iput v5, v3, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     .line 325
a=0;//     iput v5, v3, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     .line 326
a=0;//     iput v6, v3, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     .line 327
a=0;//     const-string v4, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 328
a=0;//     const-string v4, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-static {v4, v3}, Lcom/kingroot/kinguser/hx;->b(Ljava/lang/String;Lcom/kingroot/kinguser/hz;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 338
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v4=(Boolean);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hu;->if:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 340
a=0;//     new-instance v1, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 341
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     iput v5, v1, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     .line 342
a=0;//     iput v5, v1, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     .line 343
a=0;//     iput v6, v1, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     .line 344
a=0;//     const-string v2, "u:object_r:system_file:s0"
a=0;// 
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 345
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 346
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 347
a=0;//     const-string v3, "/system/etc/install-recovery-2.sh"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 348
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/kinguser/hx;->b(Ljava/util/List;Lcom/kingroot/kinguser/hz;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public dt()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 642
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
