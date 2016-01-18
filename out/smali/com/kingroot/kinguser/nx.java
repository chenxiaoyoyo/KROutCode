package com.kingroot.kinguser; class nx { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nx;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final pb:[S
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private hM:Ljava/lang/String;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;// .field private oX:I
a=0;// 
a=0;// .field private volatile oY:Z
a=0;// 
a=0;// .field private oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;// .field private final pa:Ljava/lang/Object;
a=0;// 
a=0;// .field private pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x8s
a=0;//         0x40s
a=0;//         0x80s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     const v0, 0x4b000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/nx;->oX:I
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     .line 36
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 86
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     .line 87
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/nx;->hM:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/nx;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nx;->iG()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/FileOutputStream;)V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 248
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-short v0, v0, v2
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     .line 250
a=0;//     #v2=(Reference,[B);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;//     :try_end_0
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 251
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v4, v4, Lcom/kingroot/kinguser/nz;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/kingroot/kinguser/lf;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-eq v0, v4, :cond_2
a=0;// 
a=0;//     .line 257
a=0;//     new-instance v0, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->getResponseCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit16 v2, v2, -0xbb8
a=0;// 
a=0;//     const-string v4, "error: response code is not 200."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v4}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 261
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/InputStream;);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 333
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 334
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v0
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 345
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 347
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
a=0;// 
a=0;//     .line 345
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     throw v0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_2
a=0;//     :try_start_5
a=0;//     #v0=(Integer);v1=(Null);v2=(Reference,[B);v3=(Reference,Ljava/lang/Object;);v4=(PosShort);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 261
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     monitor-exit v3
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 265
a=0;//     :try_start_6
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 267
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v7, v0, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     .line 268
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v13, v0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move v2, v13
a=0;// 
a=0;//     .line 270
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v3, v3, v9
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v9, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     cmp-long v3, v3, v9
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_6
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 272
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_5
a=0;// 
a=0;//     .line 345
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 347
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
a=0;// 
a=0;//     .line 355
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     return-void
a=0;// 
a=0;//     .line 276
a=0;//     :cond_5
a=0;//     :try_start_8
a=0;//     #v0=(Reference,[B);v3=(Integer);v4=(Byte);v9=(LongLo);v10=(LongHi);
a=0;//     iget-boolean v4, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 281
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v0, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 282
a=0;//     invoke-virtual {p1}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v4, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     int-to-long v11, v3
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     iput-wide v9, v4, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     .line 285
a=0;//     add-int v4, v2, v3
a=0;// 
a=0;//     .line 288
a=0;//     #v4=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v9, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     cmp-long v2, v2, v9
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/nz;->ph:F
a=0;// 
a=0;//     .line 290
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;//     :try_end_8
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_8 .. :try_end_8} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 335
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 336
a=0;//     :try_start_9
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v3, -0x3b
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "unbreakable download unsupported encoding: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     .line 295
a=0;//     :cond_6
a=0;//     :try_start_a
a=0;//     #v2=(Byte);v3=(LongHi);v4=(Integer);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);v9=(LongLo);v10=(LongHi);v11=(LongLo);v12=(LongHi);v13=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     cmp-long v2, v2, v9
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_7
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v3, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     long-to-float v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v9, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     long-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     div-float/2addr v3, v9
a=0;// 
a=0;//     iput v3, v2, Lcom/kingroot/kinguser/nz;->ph:F
a=0;// 
a=0;//     .line 297
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 301
a=0;//     :cond_7
a=0;//     #v2=(Byte);v3=(Conflicted);v9=(Conflicted);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/nx;->oX:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v4, v2, :cond_d
a=0;// 
a=0;//     .line 302
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v2, v5
a=0;// 
a=0;//     .line 303
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     cmp-long v9, v2, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gtz v9, :cond_8
a=0;// 
a=0;//     .line 304
a=0;//     const-wide/16 v2, 0x1
a=0;// 
a=0;//     .line 307
a=0;//     :cond_8
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v9, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     sub-long/2addr v9, v7
a=0;// 
a=0;//     div-long v2, v9, v2
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     .line 308
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget v3, v3, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iput v2, v3, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     .line 314
a=0;//     :goto_4
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     const/16 v3, 0x21
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v2, v3, :cond_b
a=0;// 
a=0;//     .line 316
a=0;//     array-length v2, v0
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v3=(Reference,[S);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aget-short v3, v3, v9
a=0;// 
a=0;//     #v3=(Short);
a=0;//     shl-int/lit8 v3, v3, 0xa
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_9
a=0;// 
a=0;//     .line 317
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-short v0, v0, v2
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_5
a=0;//     #v0=(Reference,[B);v2=(Integer);v9=(PosByte);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 330
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 311
a=0;//     :cond_a
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget v9, v9, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v10=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget v10, v10, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     div-int/lit8 v9, v9, 0x2
a=0;// 
a=0;//     iput v9, v3, Lcom/kingroot/kinguser/nz;->pi:I
a=0;//     :try_end_a
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_a .. :try_end_a} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_a .. :try_end_a} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 338
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 339
a=0;//     :try_start_b
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v3, -0x1b90
a=0;// 
a=0;//     #v3=(Short);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "unbreakable download IOException: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;//     :try_end_b
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_1
a=0;// 
a=0;//     .line 319
a=0;//     :cond_b
a=0;//     #v2=(Integer);v3=(PosByte);v4=(Integer);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);v11=(LongLo);v12=(LongHi);v13=(Null);
a=0;//     const/16 v3, 0x41
a=0;// 
a=0;//     if-ge v2, v3, :cond_c
a=0;// 
a=0;//     .line 321
a=0;//     :try_start_c
a=0;//     array-length v2, v0
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v3=(Reference,[S);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aget-short v3, v3, v9
a=0;// 
a=0;//     #v3=(Short);
a=0;//     shl-int/lit8 v3, v3, 0xa
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_9
a=0;// 
a=0;//     .line 322
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-short v0, v0, v2
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 326
a=0;//     :cond_c
a=0;//     #v2=(Integer);v3=(PosByte);v9=(Conflicted);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v3=(Reference,[S);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aget-short v3, v3, v9
a=0;// 
a=0;//     #v3=(Short);
a=0;//     shl-int/lit8 v3, v3, 0xa
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_9
a=0;// 
a=0;//     .line 327
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-short v0, v0, v2
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;//     :try_end_c
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_c .. :try_end_c} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_c .. :try_end_c} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 341
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 342
a=0;//     :try_start_d
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "unbreakable download IOException: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v2
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_1
a=0;// 
a=0;//     .line 348
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 349
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 348
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);v13=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 349
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v4=(Integer);v10=(LongHi);v11=(LongLo);v12=(LongHi);
a=0;//     move v2, v4
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private ar(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iput p1, v0, Lcom/kingroot/kinguser/nz;->pj:I
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/io/FileOutputStream;)V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 365
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 367
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 368
a=0;//     :try_start_0
a=0;//     #v3=(One);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-short v0, v0, v1
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [B
a=0;//     :try_end_0
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 374
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v4, v0
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 375
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v2=(PosByte);v3=(Boolean);v4=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v5, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v3, v5, v7
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_e
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v5, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v7, v3, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     cmp-long v3, v5, v7
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_e
a=0;// 
a=0;//     .line 378
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v6, v3, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     .line 379
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v8, 0x1
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/nx;->oX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v10, v3
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     mul-long/2addr v8, v10
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-long/2addr v2, v8
a=0;// 
a=0;//     add-long/2addr v2, v6
a=0;// 
a=0;//     const-wide/16 v8, 0x1
a=0;// 
a=0;//     sub-long/2addr v2, v8
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v8, v5, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     cmp-long v5, v2, v8
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     const-wide/16 v8, 0x1
a=0;// 
a=0;//     sub-long/2addr v2, v8
a=0;// 
a=0;//     .line 385
a=0;//     :cond_0
a=0;//     new-instance v5, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 386
a=0;//     #v5=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v8, "bytes="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/16 v9, 0x2d
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v8, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v8
a=0;//     :try_end_1
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_9
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_2
a=0;// 
a=0;//     .line 389
a=0;//     :try_start_2
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/nz;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/lf;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     const-string v3, "Range"
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/kingroot/kinguser/lf;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     .line 401
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     #v3=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->getResponseCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v4, 0xce
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-eq v2, v4, :cond_4
a=0;// 
a=0;//     .line 406
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v2, "response code is not 206 error."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 409
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v8
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :try_start_3
a=0;//     throw v0
a=0;//     :try_end_3
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_9
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 478
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 479
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/InputStream;);
a=0;//     throw v0
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 491
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 493
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
a=0;// 
a=0;//     .line 491
a=0;//     :cond_2
a=0;//     :goto_5
a=0;//     throw v0
a=0;// 
a=0;//     .line 393
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v3=(LongHi);v4=(Boolean);v5=(Reference,Ljava/lang/StringBuffer;);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/lang/Object;);v9=(PosByte);v10=(LongLo);v11=(LongHi);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 395
a=0;//     :try_start_6
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/lf;->a(Landroid/content/Context;Lcom/kingroot/kinguser/lf;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 397
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     const-string v3, "Range"
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/kingroot/kinguser/lf;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 408
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Null);v4=(PosShort);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 409
a=0;//     :try_start_7
a=0;//     monitor-exit v8
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_3
a=0;// 
a=0;//     .line 412
a=0;//     :try_start_8
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 415
a=0;//     :cond_5
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v4=(LongLo);v5=(LongHi);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v8, v1, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v10, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v10=(LongLo);
a=0;//     cmp-long v1, v8, v10
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     .line 416
a=0;//     invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 417
a=0;//     #v1=(Integer);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v1, v8, :cond_9
a=0;// 
a=0;//     .line 446
a=0;//     :cond_6
a=0;//     :goto_7
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long v4, v8, v4
a=0;// 
a=0;//     .line 447
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     cmp-long v1, v4, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_7
a=0;// 
a=0;//     .line 448
a=0;//     const-wide/16 v4, 0x1
a=0;// 
a=0;//     .line 451
a=0;//     :cond_7
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v8, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     sub-long v6, v8, v6
a=0;// 
a=0;//     div-long v4, v6, v4
a=0;// 
a=0;//     long-to-int v1, v4
a=0;// 
a=0;//     .line 452
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget v4, v4, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_b
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iput v1, v4, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     .line 458
a=0;//     :goto_8
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     const/16 v4, 0x21
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge v1, v4, :cond_c
a=0;// 
a=0;//     .line 460
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 461
a=0;//     #v1=(One);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v5=(Reference,[S);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget-short v5, v5, v6
a=0;// 
a=0;//     #v5=(Short);
a=0;//     shl-int/lit8 v5, v5, 0xa
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v4, v5, :cond_8
a=0;// 
a=0;//     .line 462
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-short v0, v0, v4
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_9
a=0;//     #v0=(Reference,[B);v1=(PosByte);v4=(Integer);v6=(PosByte);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v13, v1
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     move v2, v13
a=0;// 
a=0;//     .line 477
a=0;//     #v2=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Reference,Ljava/io/InputStream;);v4=(LongLo);v5=(LongHi);v6=(LongLo);v8=(Byte);v10=(LongLo);v13=(Conflicted);
a=0;//     iget-boolean v8, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 426
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p1, v0, v8, v1}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 427
a=0;//     invoke-virtual {p1}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v8, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v8=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v8, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     int-to-long v11, v1
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     iput-wide v9, v8, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     .line 432
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v8, v1, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v10, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v1, v8, v10
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_a
a=0;// 
a=0;//     .line 433
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/high16 v8, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iput v8, v1, Lcom/kingroot/kinguser/nz;->ph:F
a=0;// 
a=0;//     .line 434
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 478
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 439
a=0;//     :cond_a
a=0;//     #v1=(Byte);v3=(Null);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);v8=(LongLo);v9=(LongHi);v10=(LongLo);v11=(LongHi);v12=(LongHi);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v8, v1, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     cmp-long v1, v8, v10
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     .line 440
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v8, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v8=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v8, v8, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     long-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v9, v9, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     long-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     div-float/2addr v8, v9
a=0;// 
a=0;//     iput v8, v1, Lcom/kingroot/kinguser/nz;->ph:F
a=0;// 
a=0;//     .line 441
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;//     :try_end_8
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_8 .. :try_end_8} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 480
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 481
a=0;//     :goto_a
a=0;//     :try_start_9
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);v3=(Conflicted);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v3, -0x3b
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "unbreakable download unsupported encoding: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v3, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     .line 455
a=0;//     :cond_b
a=0;//     :try_start_a
a=0;//     #v1=(Integer);v3=(Null);v4=(Integer);v5=(LongHi);v6=(LongLo);v7=(LongHi);v8=(LongLo);v9=(LongHi);v11=(LongHi);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget v5, v5, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget v6, v6, Lcom/kingroot/kinguser/nz;->pi:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     div-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     iput v5, v4, Lcom/kingroot/kinguser/nz;->pi:I
a=0;//     :try_end_a
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_a .. :try_end_a} :catch_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_a .. :try_end_a} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 483
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 484
a=0;//     :goto_b
a=0;//     :try_start_b
a=0;//     #v0=(Reference,Ljava/io/IOException;);v3=(Conflicted);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/16 v3, -0x1b90
a=0;// 
a=0;//     #v3=(Short);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "unbreakable download IOException: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v3, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;//     :try_end_b
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_1
a=0;// 
a=0;//     .line 464
a=0;//     :cond_c
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);v5=(Conflicted);v7=(LongHi);v8=(LongLo);v9=(LongHi);v11=(LongHi);
a=0;//     const/16 v4, 0x41
a=0;// 
a=0;//     if-ge v1, v4, :cond_d
a=0;// 
a=0;//     .line 466
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 467
a=0;//     :try_start_c
a=0;//     #v1=(PosByte);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v5=(Reference,[S);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget-short v5, v5, v6
a=0;// 
a=0;//     #v5=(Short);
a=0;//     shl-int/lit8 v5, v5, 0xa
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v4, v5, :cond_8
a=0;// 
a=0;//     .line 468
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-short v0, v0, v4
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 472
a=0;//     :cond_d
a=0;//     #v1=(Integer);v4=(PosByte);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     .line 473
a=0;//     #v1=(PosByte);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     #v5=(Reference,[S);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     aget-short v5, v5, v6
a=0;// 
a=0;//     #v5=(Short);
a=0;//     shl-int/lit8 v5, v5, 0xa
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v4, v5, :cond_8
a=0;// 
a=0;//     .line 474
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nx;->pb:[S
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget-short v0, v0, v4
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;//     :try_end_c
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_c .. :try_end_c} :catch_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_c .. :try_end_c} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 487
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 488
a=0;//     :goto_c
a=0;//     :try_start_d
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v3=(Conflicted);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/lx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/lx;);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "unbreakable download IOException: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v3, v0}, Lcom/kingroot/kinguser/lx;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     throw v1
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_1
a=0;// 
a=0;//     .line 491
a=0;//     :cond_e
a=0;//     #v2=(PosByte);v4=(Boolean);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     .line 493
a=0;//     :try_start_e
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6
a=0;// 
a=0;//     .line 500
a=0;//     :cond_f
a=0;//     :goto_d
a=0;//     return-void
a=0;// 
a=0;//     .line 494
a=0;//     :catch_5
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/InputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 495
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 494
a=0;//     :catch_6
a=0;//     #v2=(PosByte);v3=(Byte);v4=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 495
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 491
a=0;//     :catchall_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 487
a=0;//     :catch_7
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 483
a=0;//     :catch_8
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     .line 480
a=0;//     :catch_9
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 409
a=0;//     :catchall_3
a=0;//     #v3=(Null);v4=(PosShort);v5=(Reference,Ljava/lang/StringBuffer;);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/lang/Object;);v9=(PosByte);v10=(LongLo);v11=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private iG()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     #v6=(Null);
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p0, v6}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 117
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v4, v4, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Lcom/kingroot/kinguser/nz;->ph:F
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_e
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v4, v4, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_1
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_6
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_2
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_a
a=0;// 
a=0;//     .line 185
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v10=(Conflicted);
a=0;//     iput-boolean v6, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Null);v1=(Null);v2=(Byte);v3=(LongHi);v4=(LongLo);v5=(LongHi);v10=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 128
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nx;->iH()V
a=0;// 
a=0;//     .line 131
a=0;//     :cond_4
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->hM:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_e
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_3 .. :try_end_3} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 132
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/FileChannel;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/kinguser/nz;->pe:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 136
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nx;->b(Ljava/io/FileOutputStream;)V
a=0;// 
a=0;//     .line 141
a=0;//     :goto_1
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_d
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_4 .. :try_end_4} :catch_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_b
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_8
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v0, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v4, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v0, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     cmp-long v0, v2, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_5
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_5
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_6
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v2
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_7
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_7
a=0;//     :try_start_7
a=0;//     #v0=(Boolean);v2=(LongLo);v4=(LongHi);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nx;->a(Ljava/io/FileOutputStream;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_d
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_7 .. :try_end_7} :catch_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_b
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 144
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 145
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v1, -0x1b59
a=0;// 
a=0;//     :try_start_8
a=0;//     #v1=(Short);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_9
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmp-long v1, v1, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_8
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_8
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_9
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_9
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v1
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_2
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_a
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     :catch_3
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 148
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);v1=(Reference,Ujava/lang/Object;);
a=0;//     const/16 v1, -0x1b90
a=0;// 
a=0;//     :try_start_b
a=0;//     #v1=(Short);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;//     :try_end_b
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_9
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_a
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmp-long v1, v1, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_a
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_c
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_b
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v1
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_3
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_d
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :catch_5
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     move-object v10, v1
a=0;// 
a=0;//     #v10=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 151
a=0;//     :goto_4
a=0;//     :try_start_e
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);v1=(Reference,Ljava/io/FileOutputStream;);v10=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lx;->hL()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;//     :try_end_e
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_8
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v0, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-wide v4, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v0, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     cmp-long v0, v2, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_c
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_c
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_f
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_d
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v2
a=0;//     :try_end_f
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_4
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_10
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 153
a=0;//     :catch_7
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v10=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 159
a=0;//     :goto_5
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);v1=(Reference,Ujava/lang/Object;);
a=0;//     const/16 v1, -0x138e
a=0;// 
a=0;//     :try_start_11
a=0;//     #v1=(Short);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;//     :try_end_11
a=0;//     .catchall {:try_start_11 .. :try_end_11} :catchall_9
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v1, v1, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmp-long v1, v1, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_e
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_e
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_12
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v2, :cond_f
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_f
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v1
a=0;//     :try_end_12
a=0;//     .catchall {:try_start_12 .. :try_end_12} :catchall_5
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_13
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_13
a=0;//     .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_8
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_8
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v10, v1
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v10
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/FileOutputStream;);v10=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v4, v4, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_10
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v2, Lcom/kingroot/kinguser/nz;->pg:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_10
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, v7}, Lcom/kingroot/kinguser/nx;->aq(I)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_10
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_14
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v3, :cond_11
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_11
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     monitor-exit v2
a=0;//     :try_end_14
a=0;//     .catchall {:try_start_14 .. :try_end_14} :catchall_1
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v1, :cond_12
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_15
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_15
a=0;//     .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_9
a=0;// 
a=0;//     .line 185
a=0;//     :cond_12
a=0;//     :goto_7
a=0;//     iput-boolean v6, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     .line 163
a=0;//     throw v0
a=0;// 
a=0;//     .line 173
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_16
a=0;//     monitor-exit v2
a=0;//     :try_end_16
a=0;//     .catchall {:try_start_16 .. :try_end_16} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_9
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 173
a=0;//     :catchall_2
a=0;//     #v2=(Conflicted);v3=(LongLo);v4=(LongHi);v5=(Conflicted);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_17
a=0;//     monitor-exit v1
a=0;//     :try_end_17
a=0;//     .catchall {:try_start_17 .. :try_end_17} :catchall_2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_3
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_18
a=0;//     monitor-exit v1
a=0;//     :try_end_18
a=0;//     .catchall {:try_start_18 .. :try_end_18} :catchall_3
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_4
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/Object;);v3=(LongHi);v4=(LongLo);v5=(LongHi);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_19
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_19
a=0;//     .catchall {:try_start_19 .. :try_end_19} :catchall_4
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_5
a=0;//     #v2=(Conflicted);v3=(LongLo);v4=(LongHi);v5=(Conflicted);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1a
a=0;//     monitor-exit v1
a=0;//     :try_end_1a
a=0;//     .catchall {:try_start_1a .. :try_end_1a} :catchall_5
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_6
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(LongLo);v5=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1b
a=0;//     monitor-exit v2
a=0;//     :try_end_1b
a=0;//     .catchall {:try_start_1b .. :try_end_1b} :catchall_6
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_a
a=0;//     #v0=(Null);v3=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :catchall_7
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/FileOutputStream;);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1c
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1c
a=0;//     .catchall {:try_start_1c .. :try_end_1c} :catchall_7
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 163
a=0;//     :catchall_8
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_9
a=0;//     #v1=(Short);v10=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v10, v1
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 153
a=0;//     :catch_b
a=0;//     #v0=(Conflicted);v4=(LongHi);v5=(LongHi);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 150
a=0;//     :catch_c
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lx;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 147
a=0;//     :catch_d
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 144
a=0;//     :catch_e
a=0;//     #v0=(Null);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private iH()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0xce
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 206
a=0;//     #v4=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 207
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/nz;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/lf;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 208
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "bytes=0-"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/nx;->oX:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     const-string v3, "Range"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v0}, Lcom/kingroot/kinguser/lf;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v5, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/nz;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/lf;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 219
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v5, :cond_3
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v0, Lcom/kingroot/kinguser/nz;->pe:Z
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->hq()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     .line 234
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v2, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 235
a=0;//     const/16 v0, -0x1b59
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;// 
a=0;//     .line 237
a=0;//     :cond_2
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 238
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Reference,Ujava/lang/Object;);v3=(Reference,Ljava/lang/String;);v4=(One);v5=(PosShort);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     const-string v2, "Content-Type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/lf;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget v2, v2, Lcom/kingroot/kinguser/nz;->lc:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v4, :cond_4
a=0;// 
a=0;//     const-string v2, "text/html"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 226
a=0;//     const/16 v0, -0x1b5f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;// 
a=0;//     .line 227
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 237
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(One);v5=(PosShort);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v0, Lcom/kingroot/kinguser/nz;->pe:Z
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/lf;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aq(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Null);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     :pswitch_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/nz;->mState:I
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/oa;->e(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 55
a=0;//     :pswitch_1
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/nz;->mState:I
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/oa;->c(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     :pswitch_2
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/nz;->mState:I
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/oa;->a(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :pswitch_3
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/nz;->mState:I
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/oa;->b(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcom/kingroot/kinguser/oa;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nx;->pc:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public iI()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nx;->oY:Z
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nx;->interrupt()V
a=0;// 
a=0;//     .line 505
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 506
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->close()V
a=0;// 
a=0;//     .line 509
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 515
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 516
a=0;//     return-void
a=0;// 
a=0;//     .line 515
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 511
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public iJ()J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 523
a=0;//     #v3=(One);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nx;->pa:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 524
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/nz;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lf;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 525
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/nz;->mi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lf;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     .line 526
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->hp()I
a=0;// 
a=0;//     .line 528
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lf;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 529
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xce
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 530
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/kinguser/nz;->pe:Z
a=0;// 
a=0;//     .line 531
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/lf;->hq()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     .line 544
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v0, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 545
a=0;//     const/16 v0, -0x1b59
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;// 
a=0;//     .line 548
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v0, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosShort);v3=(One);v4=(Uninit);
a=0;//     const/16 v1, 0xc8
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 533
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/lf;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 534
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/nz;->lc:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v3, :cond_3
a=0;// 
a=0;//     const-string v1, "text/html"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 536
a=0;//     const/16 v0, -0x1b5f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nx;->ar(I)V
a=0;// 
a=0;//     .line 537
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-wide v0, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 549
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 540
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v3=(One);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/kinguser/nz;->pe:Z
a=0;// 
a=0;//     .line 541
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nx;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nx;->oZ:Lcom/kingroot/kinguser/lf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lf;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/lf;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, v0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ny;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ny;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ny;-><init>(Lcom/kingroot/kinguser/nx;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ny;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
}}
