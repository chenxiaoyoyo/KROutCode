package com.kingroot.kinguser; class kt { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/kt;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile lT:Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;// .field private static final lX:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private lU:Ljava/lang/String;
a=0;// 
a=0;// .field private lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;// .field private lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;// .field private lY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private ma:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     const-string v0, "clm3"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kt;->lX:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/kt;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ku;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ku;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ku;-><init>(Lcom/kingroot/kinguser/kt;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ku;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->lY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 345
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kv;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/kv;-><init>(Lcom/kingroot/kinguser/kt;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kv;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     .line 381
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kw;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/kw;-><init>(Lcom/kingroot/kinguser/kt;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kw;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->ma:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/kt;Lcom/kingroot/kinguser/nv;)Lcom/kingroot/kinguser/nv;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/kt;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/kt;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kt;->hl()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static hi()Lcom/kingroot/kinguser/kt;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kt;->lT:Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kt;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     const-class v1, Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 74
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kt;->lT:Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kt;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/kt;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kt;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kt;->lT:Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kt;->lT:Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 77
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private hk()Lcom/kingroot/kinguser/yv;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kt;->hl()V
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private hl()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 217
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kt;->lU:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
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
a=0;//     const-string v1, "cl2.conf"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     :try_start_0
a=0;//     const-string v0, "cl2.conf"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/uu;->b(Ljava/lang/String;Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 231
a=0;//     :try_start_1
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 232
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     long-to-int v0, v3
a=0;// 
a=0;//     .line 233
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 234
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     .line 237
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/kinguser/uq;->b(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 242
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 243
a=0;//     new-instance v0, Lcom/kingroot/kinguser/xq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/xq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/xq;-><init>()V
a=0;// 
a=0;//     .line 244
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xq;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/xq;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/xq;->p([B)V
a=0;// 
a=0;//     .line 247
a=0;//     sget-object v2, Lcom/kingroot/kinguser/kt;->lX:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/yv;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/yv;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/kingroot/kinguser/xq;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kt;->lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     .line 250
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kt;->lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v0, v3}, Lcom/kingroot/kinguser/yv;->b(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fd;->write(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 259
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 261
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 268
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :catch_0
a=0;//     #v2=(Null);v3=(Reference,Ljava/io/File;);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 223
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     :catch_1
a=0;//     #v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 256
a=0;//     :catch_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Null);v3=(Reference,Ljava/io/File;);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 257
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 259
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 261
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 262
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 259
a=0;//     :catchall_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Null);v3=(Reference,Ljava/io/File;);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 261
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
a=0;// 
a=0;//     .line 264
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 262
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 259
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 256
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bf(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fe;->bO()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bl()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 113
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kt;->hk()Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/yv;->yW:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yw;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yw;->mp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 97
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yw;->mq()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 100
a=0;//     :sswitch_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     :sswitch_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bo()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     const/16 v0, 0x63
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x4 -> :sswitch_0
a=0;//         0x63 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected bg(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nu;);
a=0;//     const-string v1, "cl2.conf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p1}, Lcom/kingroot/kinguser/nu;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 370
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nu;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/nv;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/nv;-><init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nv;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/kt;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kt;->lU:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/nv;->bm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kt;->ma:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/nv;->b(Lcom/kingroot/kinguser/oa;)V
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nv;->iD()V
a=0;// 
a=0;//     .line 376
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected hj()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lg;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/kingroot/kinguser/lg;->hm()V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/yd;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/yd;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/yd;-><init>()V
a=0;// 
a=0;//     .line 152
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/yd;);
a=0;//     const-string v2, "kinguserbuildinconf.conf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/yd;->filename:Ljava/lang/String;
a=0;// 
a=0;//     .line 153
a=0;//     const-string v2, ""
a=0;// 
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/yd;->wV:Ljava/lang/String;
a=0;// 
a=0;//     .line 154
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/yd;->lH:I
a=0;// 
a=0;//     .line 157
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kt;->hk()Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 158
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/yv;->mo()Lcom/kingroot/kinguser/yg;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/yg;->wV:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v1, Lcom/kingroot/kinguser/yd;->wV:Ljava/lang/String;
a=0;// 
a=0;//     .line 162
a=0;//     iget v2, v2, Lcom/kingroot/kinguser/yg;->lH:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/yd;->lH:I
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ye;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ye;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/ye;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ye;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/ye;->wY:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 172
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ks;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ks;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/ks;-><init>()V
a=0;// 
a=0;//     .line 173
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ks;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v3, v2, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/kt;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3, v1, v0}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/ye;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 177
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 179
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/kingroot/kinguser/jc;->l(J)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yc;
a=0;// 
a=0;//     .line 181
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/yc;->wS:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/yc;->wS:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/yc;->wS:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yf;
a=0;// 
a=0;//     .line 183
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v3, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/kr;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/kr;-><init>()V
a=0;// 
a=0;//     .line 185
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/kr;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yf;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/kr;->lF:Ljava/lang/String;
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yf;->ml()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/kr;->lG:Ljava/lang/String;
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, v2, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Lcom/kingroot/kinguser/ks;->lQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 198
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Lcom/kingroot/kinguser/lg;->a(Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_5
a=0;//     return-void
a=0;// 
a=0;//     .line 193
a=0;//     :cond_6
a=0;//     #v1=(Integer);v3=(Reference,Landroid/content/Context;);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kt;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/kingroot/kinguser/lg;->ad(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
