package com.kingroot.kinguser; class to { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/to;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public content:[B
a=0;// 
a=0;// .field private index:I
a=0;// 
a=0;// .field public length:I
a=0;// 
a=0;// .field public tj:I
a=0;// 
a=0;// .field public tk:[B
a=0;// 
a=0;// .field public tl:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 10
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/to;);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->length:I
a=0;// 
a=0;//     .line 19
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     .line 21
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->tj:I
a=0;// 
a=0;//     .line 23
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/to;->tk:[B
a=0;// 
a=0;//     .line 24
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->tl:I
a=0;// 
a=0;//     .line 26
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/InputStream;[BII)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 288
a=0;//     #v1=(Byte);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-ltz p2, :cond_0
a=0;// 
a=0;//     if-gtz p3, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 300
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 293
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     if-ge v0, p3, :cond_1
a=0;// 
a=0;//     if-eq v2, v1, :cond_1
a=0;// 
a=0;//     .line 294
a=0;//     sub-int v2, p3, v0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, v2}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 295
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     .line 296
a=0;//     add-int/2addr p2, v2
a=0;// 
a=0;//     .line 297
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/OutputStream;[BII)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x2000
a=0;// 
a=0;//     .line 304
a=0;//     #v1=(PosShort);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-ltz p2, :cond_0
a=0;// 
a=0;//     if-gtz p3, :cond_2
a=0;// 
a=0;//     .line 305
a=0;//     :cond_0
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 321
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 308
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, p3
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 311
a=0;//     if-le v2, v1, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 316
a=0;//     :goto_1
a=0;//     invoke-virtual {p0, p1, p2, v0}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 318
a=0;//     add-int/2addr p2, v0
a=0;// 
a=0;//     .line 319
a=0;//     sub-int/2addr v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 314
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/io/InputStream;)[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     .line 241
a=0;//     #v5=(PosByte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 284
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Reference,Ljava/lang/StringBuilder;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(PosByte);
a=0;//     new-array v2, v5, [B
a=0;// 
a=0;//     .line 250
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {p0, v2, v3, v4}, Lcom/kingroot/kinguser/to;->a(Ljava/io/InputStream;[BII)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 255
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "readRawPacket "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/fd;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     if-ge v0, v5, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 259
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     :catch_0
a=0;//     #v3=(Null);v4=(PosByte);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 252
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 262
a=0;//     :cond_1
a=0;//     #v0=(Integer);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/tp;->f([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 264
a=0;//     #v3=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "read length "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fd;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     if-le v3, v5, :cond_2
a=0;// 
a=0;//     const/high16 v2, 0x200000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v3, v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     add-int/lit8 v2, v3, -0x4
a=0;// 
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     .line 273
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     add-int/lit8 v5, v3, -0x4
a=0;// 
a=0;//     :try_start_1
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p0, v2, v4, v5}, Lcom/kingroot/kinguser/to;->a(Ljava/io/InputStream;[BII)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 278
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     add-int/lit8 v3, v3, -0x4
a=0;// 
a=0;//     if-ge v0, v3, :cond_4
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 279
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 274
a=0;//     :catch_1
a=0;//     #v0=(Integer);v4=(Null);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 275
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 282
a=0;//     :cond_4
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "real read length "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fd;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 284
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e([B)Lcom/kingroot/kinguser/to;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     new-instance v0, Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/to;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/to;-><init>()V
a=0;// 
a=0;//     .line 230
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/to;);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/to;->length:I
a=0;// 
a=0;//     .line 231
a=0;//     iput-object p0, v0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     .line 234
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/to;->kq()V
a=0;// 
a=0;//     .line 236
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private kq()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     .line 48
a=0;//     #v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/tp;->f([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->tj:I
a=0;// 
a=0;//     .line 50
a=0;//     new-array v0, v3, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/to;->tk:[B
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/to;->tk:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v3, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/to;->tj:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/to;->kr()V
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 58
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/to;->tj:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 60
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private kr()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->tl:I
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/to;->tl:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/to;->tl:I
a=0;// 
a=0;//     .line 74
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     add-int/lit8 v1, v0, 0x4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v1, v2, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/tp;->c([BI)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 80
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ks()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/to;->tl:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public kt()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/tp;->c([BI)I
a=0;// 
a=0;//     .line 113
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/tp;->c([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 115
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     .line 116
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ku()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/tp;->c([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 165
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/to;->content:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/kinguser/tp;->a([BII)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 167
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/to;->index:I
a=0;// 
a=0;//     .line 168
a=0;//     return-object v1
a=0;// .end method
}}
