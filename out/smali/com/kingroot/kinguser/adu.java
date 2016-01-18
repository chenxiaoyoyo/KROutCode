package com.kingroot.kinguser; class adu { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/adu;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private FE:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private FF:I
a=0;// 
a=0;// .field private FG:Z
a=0;// 
a=0;// .field private FH:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;// .field private FI:I
a=0;// 
a=0;// .field private FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;// .field private FK:Z
a=0;// 
a=0;// .field private final FL:Lcom/kingroot/kinguser/adx;
a=0;// 
a=0;// .field private kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/ady;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adu;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/adu;->FE:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FK:Z
a=0;// 
a=0;//     .line 533
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adx;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/adx;-><init>(Lcom/kingroot/kinguser/adv;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adx;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adu;->FL:Lcom/kingroot/kinguser/adx;
a=0;// 
a=0;//     .line 81
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/adu;->ni()Lcom/kingroot/kinguser/ady;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/ady;->FN:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/adu;->FF:I
a=0;// 
a=0;//     .line 87
a=0;//     iget-boolean v0, p1, Lcom/kingroot/kinguser/ady;->FO:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FG:Z
a=0;// 
a=0;//     .line 88
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/ady;->FP:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/adu;->FI:I
a=0;// 
a=0;//     .line 91
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adv;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/adu;->FF:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/adv;-><init>(Lcom/kingroot/kinguser/adu;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adv;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adu;->FH:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ArrayBlockingQueue;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/adu;->FI:I
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ArrayBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ArrayBlockingQueue;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/adu;->FI:I
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ArrayBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 106
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/adu;->nh()V
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/adu;I)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/adu;->co(I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/adu;Lcom/kingroot/kinguser/adz;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/adu;->a(Lcom/kingroot/kinguser/adz;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/adu;Ljava/lang/String;II)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/kinguser/adu;->c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/adz;)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 418
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 419
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 422
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/adz;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vb;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 426
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 427
a=0;//     instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 428
a=0;//     check-cast v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 437
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     .line 423
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 424
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/adu;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 435
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adu;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 437
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/adu;)Ljava/util/concurrent/BlockingQueue;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/adu;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 599
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 600
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 603
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 606
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 608
a=0;//     new-instance v3, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 609
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p0, v4, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 611
a=0;//     invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 612
a=0;//     return-object v0
a=0;// 
a=0;//     .line 603
a=0;//     :cond_0
a=0;//     #v0=(Integer);v3=(Byte);
a=0;//     sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 456
a=0;//     #v0=(One);
a=0;//     new-instance v4, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 457
a=0;//     #v4=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/16 v1, 0x4000
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iput-object v1, v4, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B
a=0;// 
a=0;//     .line 458
a=0;//     iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z
a=0;// 
a=0;//     .line 459
a=0;//     iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z
a=0;// 
a=0;//     .line 463
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 465
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 467
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 468
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileDescriptor;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v1, v5, v4}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 471
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 473
a=0;//     iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v1, p2, :cond_3
a=0;// 
a=0;//     iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     if-gt v1, p3, :cond_3
a=0;// 
a=0;//     .line 491
a=0;//     :cond_0
a=0;//     #v0=(Integer);v5=(Float);v6=(Conflicted);v7=(Conflicted);
a=0;//     iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 495
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileDescriptor;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1, v4}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 499
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 501
a=0;//     :try_start_2
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 508
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 477
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(One);v1=(Integer);v3=(Reference,Ljava/io/FileInputStream;);v5=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 478
a=0;//     #v5=(Integer);
a=0;//     iget v6, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 479
a=0;//     #v6=(Integer);
a=0;//     int-to-float v0, v6
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, p3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 480
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v5
a=0;// 
a=0;//     int-to-float v7, p2
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v1, v7
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 481
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_4
a=0;// 
a=0;//     .line 482
a=0;//     :goto_1
a=0;//     mul-int v1, v5, v6
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 485
a=0;//     #v1=(Float);
a=0;//     mul-int v5, p2, p3
a=0;// 
a=0;//     mul-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     .line 487
a=0;//     :goto_2
a=0;//     #v5=(Float);
a=0;//     mul-int v6, v0, v0
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v6, v1, v6
a=0;// 
a=0;//     cmpl-float v6, v6, v5
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 488
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v5=(Integer);v6=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 481
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 496
a=0;//     :catch_0
a=0;//     #v0=(One);v1=(Reference,[B);v3=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 497
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 499
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 501
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 508
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 499
a=0;//     :catchall_0
a=0;//     #v0=(One);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/io/FileInputStream;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 501
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     .line 499
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     throw v0
a=0;// 
a=0;//     .line 502
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 503
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 502
a=0;//     :catch_2
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 503
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 502
a=0;//     :catch_3
a=0;//     #v1=(Null);v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 503
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 499
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 496
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/kinguser/adu;)Landroid/support/v4/util/LruCache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FH:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static c(Lcom/kingroot/kinguser/adz;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 536
a=0;//     #v1=(Null);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adz;->lc:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 546
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 538
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adz;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adz;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 540
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adz;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/adz;->FU:Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 542
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adz;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adz;->FT:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 536
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private co(I)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 443
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 450
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 447
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adu;->close()V
a=0;// 
a=0;//     .line 450
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/kinguser/adu;)Lcom/kingroot/kinguser/adx;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FL:Lcom/kingroot/kinguser/adx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adx;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/kinguser/adz;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/adu;->c(Lcom/kingroot/kinguser/adz;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private nh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FE:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FE:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->getThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adw;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/adw;-><init>(Lcom/kingroot/kinguser/adu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adw;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adu;->FE:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FE:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     const-string v1, "ImageFetcher"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vz;->ch(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 408
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ni()Lcom/kingroot/kinguser/ady;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 588
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ady;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ady;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ady;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ady;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;Landroid/widget/ImageView;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FH:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_1
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adz;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/adz;-><init>(Lcom/kingroot/kinguser/adv;)V
a=0;// 
a=0;//     .line 235
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adz;);
a=0;//     iput-object p1, v0, Lcom/kingroot/kinguser/adz;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 236
a=0;//     iput-object p2, v0, Lcom/kingroot/kinguser/adz;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 237
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/adz;->lc:I
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/adu;->b(Lcom/kingroot/kinguser/adz;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b(Lcom/kingroot/kinguser/adz;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/adu;->nh()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 514
a=0;//     :try_start_1
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FK:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 515
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/adu;->FI:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 516
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 530
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 521
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/adu;->FI:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 522
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     .line 525
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 527
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 528
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 512
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adz;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/adz;-><init>(Lcom/kingroot/kinguser/adv;)V
a=0;// 
a=0;//     .line 332
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adz;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/adz;->lc:I
a=0;// 
a=0;//     .line 333
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/adu;->b(Lcom/kingroot/kinguser/adz;)V
a=0;// 
a=0;//     .line 334
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized pause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FK:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FK:Z
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 110
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized resume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FK:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adu;->FK:Z
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adu;->FJ:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 120
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
