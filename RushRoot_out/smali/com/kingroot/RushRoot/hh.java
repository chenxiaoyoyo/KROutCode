package com.kingroot.RushRoot; class hh { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/hh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;-><init>(I)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hh;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 379
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hh;);
a=0;//     const-string v0, "GBK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hh;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 22
a=0;//     invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(FI)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, p1, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 45
a=0;//     invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->position()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(ZI)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(BI)V
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(BI)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     shl-int/lit8 v0, p2, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/2addr v0, p1
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Byte);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 62
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ge p2, v0, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     or-int/lit16 v0, p1, 0xf0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     .line 60
a=0;//     #v0=(Byte);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     int-to-byte v1, p2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     #v0=(PosShort);v1=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/he;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/he;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "tag is too large: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/he;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/he;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/hh;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 382
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a()Ljava/nio/ByteBuffer;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(BI)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 76
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 82
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(DI)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     invoke-direct {p0, v0, p3}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 98
a=0;//     const/16 v0, -0x8000
a=0;// 
a=0;//     #v0=(Short);
a=0;//     if-lt p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x7fff
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-gt p1, v0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     int-to-short v0, p1
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(SI)V
a=0;// 
a=0;//     .line 104
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Short);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(JI)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 109
a=0;//     const-wide/32 v0, -0x80000000
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     const-wide/32 v0, 0x7fffffff
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     long-to-int v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, p3}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     .line 115
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p3}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/hi;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 289
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 290
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {p1, p0}, Lcom/kingroot/RushRoot/hi;->a(Lcom/kingroot/RushRoot/hh;)V
a=0;// 
a=0;//     .line 292
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 293
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/Object;I)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 333
a=0;//     #v1=(Null);
a=0;//     instance-of v0, p1, Ljava/lang/Byte;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 334
a=0;//     check-cast p1, Ljava/lang/Byte;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(BI)V
a=0;// 
a=0;//     .line 373
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 335
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     instance-of v0, p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 336
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(ZI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     :cond_2
a=0;//     instance-of v0, p1, Ljava/lang/Short;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 338
a=0;//     check-cast p1, Ljava/lang/Short;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(SI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 340
a=0;//     check-cast p1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 341
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 342
a=0;//     check-cast p1, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, p2}, Lcom/kingroot/RushRoot/hh;->a(JI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 343
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     instance-of v0, p1, Ljava/lang/Float;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 344
a=0;//     check-cast p1, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(FI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 345
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Double;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 346
a=0;//     check-cast p1, Ljava/lang/Double;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-virtual {p0, v0, v1, p2}, Lcom/kingroot/RushRoot/hh;->a(DI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 347
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     instance-of v0, p1, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 348
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 349
a=0;//     :cond_8
a=0;//     instance-of v0, p1, Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 350
a=0;//     check-cast p1, Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/RushRoot/hh;->a(Ljava/util/Map;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 351
a=0;//     :cond_9
a=0;//     instance-of v0, p1, Ljava/util/List;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 352
a=0;//     check-cast p1, Ljava/util/List;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/RushRoot/hh;->a(Ljava/util/Collection;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 353
a=0;//     :cond_a
a=0;//     instance-of v0, p1, Lcom/kingroot/RushRoot/hi;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 354
a=0;//     check-cast p1, Lcom/kingroot/RushRoot/hi;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/RushRoot/hh;->a(Lcom/kingroot/RushRoot/hi;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     :cond_b
a=0;//     instance-of v0, p1, [B
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 356
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/RushRoot/hh;->a([BI)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 357
a=0;//     :cond_c
a=0;//     instance-of v0, p1, [Z
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 358
a=0;//     check-cast p1, [Z
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-boolean v3, p1, v0
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-direct {p0, v3, v1}, Lcom/kingroot/RushRoot/hh;->a(ZI)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 359
a=0;//     :cond_d
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);
a=0;//     instance-of v0, p1, [S
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     .line 360
a=0;//     check-cast p1, [S
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Short);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-short v3, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0, v3, v1}, Lcom/kingroot/RushRoot/hh;->a(SI)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 361
a=0;//     :cond_e
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);
a=0;//     instance-of v0, p1, [I
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 362
a=0;//     check-cast p1, [I
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget v3, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0, v3, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 363
a=0;//     :cond_f
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);
a=0;//     instance-of v0, p1, [J
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     .line 364
a=0;//     check-cast p1, [J
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-wide v3, p1, v0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0, v3, v4, v1}, Lcom/kingroot/RushRoot/hh;->a(JI)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 365
a=0;//     :cond_10
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     instance-of v0, p1, [F
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     .line 366
a=0;//     check-cast p1, [F
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget v3, p1, v0
a=0;// 
a=0;//     invoke-direct {p0, v3, v1}, Lcom/kingroot/RushRoot/hh;->a(FI)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 367
a=0;//     :cond_11
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);
a=0;//     instance-of v0, p1, [D
a=0;// 
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     .line 368
a=0;//     check-cast p1, [D
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_6
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-wide v3, p1, v0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0, v3, v4, v1}, Lcom/kingroot/RushRoot/hh;->a(DI)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 369
a=0;//     :cond_12
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     .line 370
a=0;//     check-cast p1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     invoke-direct {p0, v3, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_7
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3, v1}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/Object;I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 371
a=0;//     :cond_13
a=0;//     #v0=(Boolean);v2=(PosByte);v3=(PosByte);
a=0;//     instance-of v0, p1, Ljava/util/Collection;
a=0;// 
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     .line 372
a=0;//     check-cast p1, Ljava/util/Collection;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/RushRoot/hh;->a(Ljava/util/Collection;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 374
a=0;//     :cond_14
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/he;
a=0;// 
a=0;//     .line 375
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/he;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "write object error: unsupport type. "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 374
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/he;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/he;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     :goto_0
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0xa
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 175
a=0;//     array-length v1, v0
a=0;// 
a=0;//     const/16 v2, 0xff
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 184
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 172
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(PosShort);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/util/Collection;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     #v1=(Null);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 279
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 280
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     .line 281
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 285
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 280
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v2=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 282
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Object;
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/Object;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/util/Map;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 188
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 190
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     .line 191
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 197
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 193
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v3, v1}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v0, v3}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/Object;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(SI)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 87
a=0;//     const/16 v0, -0x80
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lt p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x7f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-gt p1, v0, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     int-to-byte v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->a(BI)V
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a([BI)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 210
a=0;//     #v1=(Null);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hh;->a(I)V
a=0;// 
a=0;//     .line 211
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 212
a=0;//     invoke-direct {p0, v1, v1}, Lcom/kingroot/RushRoot/hh;->b(BI)V
a=0;// 
a=0;//     .line 213
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(II)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 215
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/hh;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 38
a=0;//     return-object v0
a=0;// .end method
}}
