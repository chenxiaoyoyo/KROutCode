package com.kingroot.kinguser; class kx { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/kx;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final lX:Ljava/lang/String;
a=0;// 
a=0;// .field private static volatile mc:Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;// .field private static final md:Ljava/lang/String;
a=0;// 
a=0;// .field private static final me:Ljava/lang/String;
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
a=0;//     const-string v0, "clm1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kx;->md:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     const-string v0, "clm2"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kx;->me:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     const-string v0, "clm3"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kx;->lX:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/kx;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ky;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ky;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ky;-><init>(Lcom/kingroot/kinguser/kx;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ky;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->lY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 277
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kz;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/kz;-><init>(Lcom/kingroot/kinguser/kx;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kz;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     .line 313
a=0;//     new-instance v0, Lcom/kingroot/kinguser/la;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/la;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/la;-><init>(Lcom/kingroot/kinguser/kx;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/la;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->ma:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/kx;Lcom/kingroot/kinguser/nv;)Lcom/kingroot/kinguser/nv;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/kx;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/kx;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kx;->hl()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private hk()Lcom/kingroot/kinguser/yv;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kx;->hl()V
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lV:Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private hl()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kx;->lU:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/kx;->me:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 222
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kx;->me:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/uu;->b(Ljava/lang/String;Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 233
a=0;//     :try_start_1
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 234
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     .line 235
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 236
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     #v0=(Null);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/uq;->b(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 247
a=0;//     new-instance v1, Lcom/kingroot/kinguser/xq;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/xq;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/xq;-><init>()V
a=0;// 
a=0;//     .line 248
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/xq;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/xq;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/xq;->p([B)V
a=0;// 
a=0;//     .line 251
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kx;->lX:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/yv;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/yv;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/kingroot/kinguser/xq;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kx;->lV:Lcom/kingroot/kinguser/yv;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 271
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 225
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/io/File;);v2=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 226
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 267
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 268
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static hn()Lcom/kingroot/kinguser/kx;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kx;->mc:Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kx;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     const-class v1, Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 78
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kx;->mc:Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kx;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/kx;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kx;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kx;->mc:Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kx;->mc:Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 81
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public ap(Z)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 125
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/jc;->eI()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 126
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0x36ee800
a=0;// 
a=0;//     .line 127
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long v6, v2, v4
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v6, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lY:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bf(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kx;->hk()Lcom/kingroot/kinguser/yv;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yv;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/yv;->yW:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yw;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yw;->mp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 96
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yw;->mq()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :pswitch_0
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 115
a=0;//     :goto_1
a=0;//     #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 101
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 103
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 107
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 109
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 97
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected bg(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nu;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/kx;->me:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p1}, Lcom/kingroot/kinguser/nu;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nu;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/nv;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/nv;-><init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nv;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/kx;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kx;->lU:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/nv;->bm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kx;->ma:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/nv;->b(Lcom/kingroot/kinguser/oa;)V
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nv;->iD()V
a=0;// 
a=0;//     .line 308
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected hj()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lg;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
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
a=0;//     sget-object v2, Lcom/kingroot/kinguser/kx;->md:Ljava/lang/String;
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
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/kx;->hk()Lcom/kingroot/kinguser/yv;
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
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/kx;->mContext:Landroid/content/Context;
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
a=0;//     .line 183
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
a=0;//     .line 184
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v3, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/kr;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/kr;-><init>()V
a=0;// 
a=0;//     .line 186
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/kr;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yf;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/kr;->lF:Ljava/lang/String;
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yf;->ml()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/kr;->lG:Ljava/lang/String;
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v0, v2, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Lcom/kingroot/kinguser/ks;->lQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 201
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Lcom/kingroot/kinguser/lg;->a(Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     .line 204
a=0;//     :cond_5
a=0;//     return-void
a=0;// 
a=0;//     .line 196
a=0;//     :cond_6
a=0;//     #v1=(Integer);v3=(Reference,Landroid/content/Context;);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kx;->lZ:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/kingroot/kinguser/lg;->ad(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
