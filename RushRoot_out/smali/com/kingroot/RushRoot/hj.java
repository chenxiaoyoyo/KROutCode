package com.kingroot.RushRoot; class hj { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/hj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:[B
a=0;// 
a=0;// .field private static final b:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x100
a=0;// 
a=0;//     .line 370
a=0;//     #v5=(PosShort);
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     fill-array-data v1, :array_0
a=0;// 
a=0;//     .line 373
a=0;//     new-array v2, v5, [B
a=0;// 
a=0;//     .line 374
a=0;//     #v2=(Reference,[B);
a=0;//     new-array v3, v5, [B
a=0;// 
a=0;//     .line 376
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-lt v0, v5, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     sput-object v2, Lcom/kingroot/RushRoot/hj;->a:[B
a=0;// 
a=0;//     .line 382
a=0;//     sput-object v3, Lcom/kingroot/RushRoot/hj;->b:[B
a=0;// 
a=0;//     .line 383
a=0;//     return-void
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     ushr-int/lit8 v4, v0, 0x4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget-byte v4, v1, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v2, v0
a=0;// 
a=0;//     .line 378
a=0;//     and-int/lit8 v4, v0, 0xf
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget-byte v4, v1, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v3, v0
a=0;// 
a=0;//     .line 376
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x30t
a=0;//         0x31t
a=0;//         0x32t
a=0;//         0x33t
a=0;//         0x34t
a=0;//         0x35t
a=0;//         0x36t
a=0;//         0x37t
a=0;//         0x38t
a=0;//         0x39t
a=0;//         0x41t
a=0;//         0x42t
a=0;//         0x43t
a=0;//         0x44t
a=0;//         0x45t
a=0;//         0x46t
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(One);
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/nio/ByteBuffer;)[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 359
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 360
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 361
a=0;//     return-object v0
a=0;// .end method
}}
