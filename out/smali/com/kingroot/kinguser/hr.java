package com.kingroot.kinguser; class hr { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/hr;
a=0;// .super Lcom/kingroot/kinguser/gy;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final hU:Ljava/lang/String;
a=0;// 
a=0;// .field private static final hV:Ljava/lang/String;
a=0;// 
a=0;// .field private static final hW:Ljava/lang/String;
a=0;// 
a=0;// .field private static final hX:Ljava/lang/String;
a=0;// 
a=0;// .field private static hZ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private hY:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const-string v0, "cdpm1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/hr;->hU:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     const-string v0, "cdpm2"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/hr;->hV:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     const-string v0, "cdpm3"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/hr;->hW:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     const-string v0, "cdpm4"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/hr;->hX:Ljava/lang/String;
a=0;// 
a=0;//     .line 302
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hs;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/hs;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hs;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/hr;->hZ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/gy;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/hr;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/hr;->hY:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/kinguser/aaj;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/hr;->dA()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/tm;->a(Ljava/lang/Object;Ljava/io/File;)V
a=0;// 
a=0;//     .line 293
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static ah(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 193
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "tmp_"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 198
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 199
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 200
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 201
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v3, v6}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 202
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "rm -r "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 213
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_d
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 214
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_e
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 215
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     :try_start_2
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [B
a=0;// 
a=0;//     .line 216
a=0;//     #v6=(Reference,[B);
a=0;//     invoke-virtual {v3, v6}, Ljava/io/FileInputStream;->read([B)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eq v7, v8, :cond_4
a=0;// 
a=0;//     .line 247
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 254
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 219
a=0;//     :cond_4
a=0;//     :try_start_5
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/up;->g([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 221
a=0;//     #v6=(Integer);
a=0;//     new-array v7, v6, [B
a=0;// 
a=0;//     .line 222
a=0;//     #v7=(Reference,[B);
a=0;//     invoke-virtual {v3, v7}, Ljava/io/FileInputStream;->read([B)I
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eq v8, v6, :cond_6
a=0;// 
a=0;//     .line 247
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     .line 254
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 226
a=0;//     :cond_6
a=0;//     :try_start_8
a=0;//     invoke-static {v4, v7}, Lcom/kingroot/kinguser/uq;->b(Landroid/content/Context;[B)[B
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_2
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 227
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     .line 247
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_9
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
a=0;// 
a=0;//     .line 254
a=0;//     :cond_7
a=0;//     :goto_3
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 232
a=0;//     :cond_8
a=0;//     :try_start_b
a=0;//     invoke-virtual {v2, v4}, Ljava/io/FileOutputStream;->write([B)V
a=0;// 
a=0;//     .line 235
a=0;//     const/16 v4, 0x400
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     new-array v4, v4, [B
a=0;// 
a=0;//     .line 237
a=0;//     :goto_4
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v3, v4}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lez v6, :cond_a
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v4, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_2
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 244
a=0;//     :catch_6
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 247
a=0;//     :goto_5
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_c
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_a
a=0;// 
a=0;//     .line 254
a=0;//     :cond_9
a=0;//     :goto_6
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_d
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :catch_7
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 242
a=0;//     :cond_a
a=0;//     :try_start_e
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);v4=(Reference,[B);v6=(Integer);v7=(Reference,[B);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "chmod 500 "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/gq;->Y(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_2
a=0;// 
a=0;//     .line 247
a=0;//     if-eqz v3, :cond_b
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_f
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8
a=0;// 
a=0;//     .line 254
a=0;//     :cond_b
a=0;//     :goto_7
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_10
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_8
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 259
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_8
a=0;//     #v0=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 257
a=0;//     :catch_9
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 250
a=0;//     :catch_a
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 247
a=0;//     :catchall_0
a=0;//     #v4=(Reference,Landroid/content/Context;);v8=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_9
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/FileInputStream;);v4=(Conflicted);v8=(Integer);
a=0;//     if-eqz v3, :cond_d
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_11
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_b
a=0;// 
a=0;//     .line 254
a=0;//     :cond_d
a=0;//     :goto_a
a=0;//     if-eqz v2, :cond_e
a=0;// 
a=0;//     .line 256
a=0;//     :try_start_12
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_12
a=0;//     .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_c
a=0;// 
a=0;//     .line 259
a=0;//     :cond_e
a=0;//     :goto_b
a=0;//     throw v0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_b
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 257
a=0;//     :catch_c
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 247
a=0;//     :catchall_1
a=0;//     #v0=(Null);v2=(Conflicted);v4=(Reference,Landroid/content/Context;);v8=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v8=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 244
a=0;//     :catch_d
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Reference,Landroid/content/Context;);v8=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_e
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/aaj;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/hr;->a(Lcom/kingroot/kinguser/aaj;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bL()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-object v0, Lcom/kingroot/kinguser/hr;->hX:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static dA()Ljava/io/File;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/dstat.dat"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static dB()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     sget-object v0, Lcom/kingroot/kinguser/hr;->hZ:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 300
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic dC()Lcom/kingroot/kinguser/aaj;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/hr;->dz()Lcom/kingroot/kinguser/aaj;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aaj;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic dD()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/hr;->dy()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static dy()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->bb()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "iscan"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     new-instance v1, Lcom/kingroot/kinguser/uh;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/uh;);
a=0;//     const/high16 v2, 0x7f050000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v1, v0, v2, v3}, Lcom/kingroot/kinguser/uh;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/uf;->a(Lcom/kingroot/kinguser/uk;)Z
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/hr;->ah(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static dz()Lcom/kingroot/kinguser/aaj;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/hr;->dA()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/tm;->k(Ljava/io/File;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 273
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Lcom/kingroot/kinguser/aaj;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 274
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aaj;
a=0;// 
a=0;//     .line 276
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public db()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 63
a=0;//     #v6=(One);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 74
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fv()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 76
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     iput v6, p0, Lcom/kingroot/kinguser/hr;->hY:I
a=0;// 
a=0;//     .line 80
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dc()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     .line 89
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/hr;->dy()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/hr;->hY:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 149
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/hr;->hV:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/kingroot/kinguser/hr;->hV:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 122
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/kingroot/kinguser/jc;->A(J)V
a=0;// 
a=0;//     .line 130
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/kinguser/hr;->hW:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->lM()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const-string v1, "/system/bin/debuggerd"
a=0;// 
a=0;//     .line 132
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lcom/kingroot/kinguser/hr;->hW:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 131
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v3=(PosByte);v4=(Conflicted);v5=(Uninit);
a=0;//     const-string v1, "/system/bin/debuggerd64"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 94
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public dt()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
