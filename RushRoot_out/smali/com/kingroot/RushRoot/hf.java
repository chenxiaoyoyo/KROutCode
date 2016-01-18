package com.kingroot.RushRoot; class hf { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/hf;
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
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 991
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hf;);
a=0;//     const-string v0, "GBK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hf;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 991
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hf;);
a=0;//     const-string v0, "GBK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hf;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([BB)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 991
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hf;);
a=0;//     const-string v0, "GBK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hf;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(FIZ)F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 299
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 300
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 301
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 309
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 303
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 314
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     .line 306
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 311
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 312
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 301
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x4 -> :sswitch_1
a=0;//         0xc -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/RushRoot/hg;Ljava/nio/ByteBuffer;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 74
a=0;//     #v0=(Byte);
a=0;//     and-int/lit8 v1, v0, 0xf
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput-byte v1, p0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     .line 75
a=0;//     and-int/lit16 v0, v0, 0xf0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shr-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/hg;->b:I
a=0;// 
a=0;//     .line 76
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/hg;->b:I
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/hg;->b:I
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 80
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/Map;Ljava/util/Map;IZ)Ljava/util/Map;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 493
a=0;//     #v1=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 495
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance p1, Ljava/util/HashMap;
a=0;// 
a=0;//     #p1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {p1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 526
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);p1=(Reference,Ujava/lang/Object;);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 500
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 501
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 502
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 503
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 505
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {p0, p3}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 506
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 507
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 508
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 521
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 510
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     invoke-virtual {p0, v1, v1, v7}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 511
a=0;//     #v4=(Integer);
a=0;//     if-gez v4, :cond_3
a=0;// 
a=0;//     .line 512
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 513
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     .line 514
a=0;//     invoke-virtual {p0, v2, v1, v7}, Lcom/kingroot/RushRoot/hf;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 515
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v3, v7, v7}, Lcom/kingroot/RushRoot/hf;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 516
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 513
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 523
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 524
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 508
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x8
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-byte v1, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hf;->a(B)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-byte v1, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(B)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Null);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "invalid type."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 133
a=0;//     :pswitch_0
a=0;//     #v0=(Null);v1=(PosByte);
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 136
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v1=(PosByte);v2=(PosByte);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :pswitch_3
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :pswitch_4
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 145
a=0;//     :pswitch_5
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :pswitch_6
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :pswitch_7
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 153
a=0;//     add-int/lit16 v0, v0, 0x100
a=0;// 
a=0;//     .line 154
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :pswitch_8
a=0;//     #v0=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 162
a=0;//     :pswitch_9
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, v0, v3}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 163
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);
a=0;//     mul-int/lit8 v2, v1, 0x2
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hf;->b()V
a=0;// 
a=0;//     .line 163
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 168
a=0;//     :pswitch_a
a=0;//     #v0=(Null);v1=(PosByte);v2=(PosByte);
a=0;//     invoke-virtual {p0, v0, v0, v3}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 169
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hf;->b()V
a=0;// 
a=0;//     .line 169
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 174
a=0;//     :pswitch_b
a=0;//     #v0=(Null);v1=(PosByte);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 175
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-byte v2, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "skipField with invalid type, type value: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-byte v1, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Byte);v3=(One);
a=0;//     invoke-virtual {p0, v0, v0, v3}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :pswitch_c
a=0;//     #v0=(Null);v1=(PosByte);v2=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hf;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_c
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_b
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/RushRoot/hg;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;Ljava/nio/ByteBuffer;)I
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a([Ljava/lang/Object;IZ)[Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 797
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 798
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "unable to get type of key and value."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 799
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-direct {p0, v0, p2, p3}, Lcom/kingroot/RushRoot/hf;->b(Ljava/lang/Object;IZ)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(B)V
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(I)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hg;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v2}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;Ljava/nio/ByteBuffer;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 103
a=0;//     #v2=(Integer);
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/hg;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le p1, v3, :cond_0
a=0;// 
a=0;//     iget-byte v3, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/hg;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Reference,Lcom/kingroot/RushRoot/hg;);v2=(Integer);v3=(Byte);v4=(PosByte);
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hf;->a(I)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-byte v2, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/hf;->a(B)V
a=0;//     :try_end_0
a=0;//     .catch Lcom/kingroot/RushRoot/hd; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/BufferUnderflowException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/Object;IZ)[Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 818
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 819
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 820
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 821
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 834
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 823
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 824
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 825
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 826
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Uninit);v2=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 827
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_1
a=0;// 
a=0;//     .line 839
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 828
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(Integer);
a=0;//     invoke-virtual {p0, p1, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 829
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v4, v0, v1
a=0;// 
a=0;//     .line 827
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 836
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 837
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 839
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 821
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private c(IZ)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, p1, p2}, Lcom/kingroot/RushRoot/hf;->a(BIZ)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 196
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private d(IZ)[Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 615
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 616
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 617
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 618
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 619
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 630
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 621
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 622
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 623
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 624
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Null);
a=0;//     new-array v0, v3, [Z
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 625
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 635
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 626
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v2, v5}, Lcom/kingroot/RushRoot/hf;->c(IZ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     aput-boolean v4, v0, v1
a=0;// 
a=0;//     .line 625
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 632
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 633
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 619
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private e(IZ)[S
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 676
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 677
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 678
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 679
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 680
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 691
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 682
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 683
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 684
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 685
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Null);
a=0;//     new-array v0, v3, [S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 686
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 696
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 687
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     aget-short v4, v0, v2
a=0;// 
a=0;//     #v4=(Short);
a=0;//     invoke-virtual {p0, v4, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(SIZ)S
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     aput-short v4, v0, v1
a=0;// 
a=0;//     .line 686
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 693
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 694
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 680
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private f(IZ)[I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 700
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 701
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 702
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 703
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 704
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 715
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 706
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 707
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 708
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 709
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Null);
a=0;//     new-array v0, v3, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 710
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 720
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 711
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     aget v4, v0, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     aput v4, v0, v1
a=0;// 
a=0;//     .line 710
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 717
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 718
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 704
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private g(IZ)[J
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 724
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 725
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 726
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 727
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 728
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 739
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 730
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-virtual {p0, v2, v2, v6}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 731
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 732
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 733
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Null);
a=0;//     new-array v0, v3, [J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 734
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 744
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 735
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     aget-wide v4, v0, v2
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {p0, v4, v5, v2, v6}, Lcom/kingroot/RushRoot/hf;->a(JIZ)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     aput-wide v4, v0, v1
a=0;// 
a=0;//     .line 734
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 741
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 742
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 728
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private h(IZ)[F
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 748
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 749
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 750
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 751
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 752
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 763
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 754
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 755
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 756
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 757
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Null);
a=0;//     new-array v0, v3, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 758
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 768
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 759
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     aget v4, v0, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, v4, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(FIZ)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     aput v4, v0, v1
a=0;// 
a=0;//     .line 758
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 765
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 766
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 752
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private i(IZ)[D
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 772
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 773
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 774
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 775
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 776
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 787
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 778
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-virtual {p0, v2, v2, v6}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 779
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 780
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 781
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Null);
a=0;//     new-array v0, v3, [D
a=0;// 
a=0;//     #v0=(Reference,[D);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 782
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 792
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 783
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     aget-wide v4, v0, v2
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {p0, v4, v5, v2, v6}, Lcom/kingroot/RushRoot/hf;->a(DIZ)D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     aput-wide v4, v0, v1
a=0;// 
a=0;//     .line 782
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 789
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 790
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 776
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x9
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(BIZ)B
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 202
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 211
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 205
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     .line 208
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 213
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 203
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0xc -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(DIZ)D
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     invoke-direct {p0, p3}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 319
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 320
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 321
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 323
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const-wide/16 p1, 0x0
a=0;// 
a=0;//     .line 337
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);p1=(LongLo);p2=(LongHi);
a=0;//     return-wide p1
a=0;// 
a=0;//     .line 326
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);p1=(DoubleLo);p2=(DoubleHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double p1, v0
a=0;// 
a=0;//     .line 327
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 329
a=0;//     :sswitch_2
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getDouble()D
a=0;// 
a=0;//     move-result-wide p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 334
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 321
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x4 -> :sswitch_1
a=0;//         0x5 -> :sswitch_2
a=0;//         0xc -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(IIZ)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 244
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 245
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 246
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 260
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 248
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 265
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     .line 251
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     #p1=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     :sswitch_2
a=0;//     #v0=(Byte);p1=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     #p1=(Short);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :sswitch_3
a=0;//     #v0=(Byte);p1=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 246
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x1 -> :sswitch_2
a=0;//         0x2 -> :sswitch_3
a=0;//         0xc -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 993
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/hf;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 994
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(JIZ)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     invoke-direct {p0, p3}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 272
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 289
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 274
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const-wide/16 p1, 0x0
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-wide p1
a=0;// 
a=0;//     .line 277
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-long p1, v0
a=0;// 
a=0;//     .line 278
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 280
a=0;//     :sswitch_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     int-to-long p1, v0
a=0;// 
a=0;//     .line 281
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     :sswitch_3
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long p1, v0
a=0;// 
a=0;//     .line 284
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :sswitch_4
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J
a=0;// 
a=0;//     move-result-wide p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 272
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x1 -> :sswitch_2
a=0;//         0x2 -> :sswitch_3
a=0;//         0x3 -> :sswitch_4
a=0;//         0xc -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/hi;IZ)Lcom/kingroot/RushRoot/hi;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 919
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 920
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 922
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/hi;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 927
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 928
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 929
a=0;//     iget-byte v1, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 930
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 923
a=0;//     :catch_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 924
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 931
a=0;//     :cond_0
a=0;//     #v1=(Byte);v2=(PosByte);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/RushRoot/hi;->a(Lcom/kingroot/RushRoot/hf;)V
a=0;// 
a=0;//     .line 932
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hf;->a()V
a=0;// 
a=0;//     .line 936
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 933
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 934
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 945
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/lang/Byte;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 946
a=0;//     invoke-virtual {p0, v0, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(BIZ)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 984
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 947
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v1, p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 948
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->c(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 949
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/lang/Short;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 950
a=0;//     invoke-virtual {p0, v0, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(SIZ)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Short;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 951
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 952
a=0;//     invoke-virtual {p0, v0, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 953
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 954
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 955
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(JIZ)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 956
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     instance-of v1, p1, Ljava/lang/Float;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 957
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     invoke-direct {p0, v0, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(FIZ)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 958
a=0;//     :cond_5
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/lang/Double;
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 959
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(DIZ)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Double;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 960
a=0;//     :cond_6
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     instance-of v1, p1, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 961
a=0;//     invoke-virtual {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(IZ)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 962
a=0;//     :cond_7
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 963
a=0;//     check-cast p1, Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 964
a=0;//     :cond_8
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/util/List;
a=0;// 
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 965
a=0;//     check-cast p1, Ljava/util/List;
a=0;// 
a=0;//     if-eqz p1, :cond_9
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     :cond_9
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v1, p2, p3}, Lcom/kingroot/RushRoot/hf;->b(Ljava/lang/Object;IZ)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     if-nez v2, :cond_b
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/ArrayList;);v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_c
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Integer);
a=0;//     aget-object v3, v2, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 966
a=0;//     :cond_d
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, Lcom/kingroot/RushRoot/hi;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     .line 967
a=0;//     check-cast p1, Lcom/kingroot/RushRoot/hi;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hi;IZ)Lcom/kingroot/RushRoot/hi;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hi;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 968
a=0;//     :cond_e
a=0;//     #v0=(Boolean);
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
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     .line 969
a=0;//     instance-of v0, p1, [B
a=0;// 
a=0;//     if-nez v0, :cond_f
a=0;// 
a=0;//     instance-of v0, p1, [Ljava/lang/Byte;
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     .line 970
a=0;//     :cond_f
a=0;//     invoke-virtual {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->b(IZ)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 971
a=0;//     :cond_10
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, [Z
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     .line 972
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->d(IZ)[Z
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 973
a=0;//     :cond_11
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, [S
a=0;// 
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     .line 974
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->e(IZ)[S
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 975
a=0;//     :cond_12
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, [I
a=0;// 
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     .line 976
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->f(IZ)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 977
a=0;//     :cond_13
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, [J
a=0;// 
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     .line 978
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->g(IZ)[J
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 979
a=0;//     :cond_14
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, [F
a=0;// 
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     .line 980
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->h(IZ)[F
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 981
a=0;//     :cond_15
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, [D
a=0;// 
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     .line 982
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/RushRoot/hf;->i(IZ)[D
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[D);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 984
a=0;//     :cond_16
a=0;//     #v0=(Boolean);
a=0;//     check-cast p1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/RushRoot/hf;->a([Ljava/lang/Object;IZ)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 987
a=0;//     :cond_17
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "read object error: unsupport type."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(IZ)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 416
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 417
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 418
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 419
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 449
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 421
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 422
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 423
a=0;//     add-int/lit16 v0, v0, 0x100
a=0;// 
a=0;//     .line 424
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     .line 425
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 427
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/hf;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 454
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 430
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Reference,[B);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 435
a=0;//     :pswitch_1
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 436
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x6400000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v0, v1, :cond_2
a=0;// 
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     .line 437
a=0;//     :cond_2
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "String too long: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 438
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     .line 439
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 441
a=0;//     :try_start_1
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/hf;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 444
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 451
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 452
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 419
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x6
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/util/Map;IZ)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-direct {p0, v0, p1, p2, p3}, Lcom/kingroot/RushRoot/hf;->a(Ljava/util/Map;Ljava/util/Map;IZ)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(SIZ)S
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 221
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 222
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 225
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     .line 228
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-short p1, v0
a=0;// 
a=0;//     .line 229
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :sswitch_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 223
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x1 -> :sswitch_2
a=0;//         0xc -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a([B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(IZ)[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 639
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 640
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/hf;->b(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 641
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 642
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 643
a=0;//     iget-byte v1, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 667
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "type mismatch."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 645
a=0;//     :sswitch_0
a=0;//     #v1=(Byte);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hg;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/hg;-><init>()V
a=0;// 
a=0;//     .line 646
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hg;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/RushRoot/hf;->a(Lcom/kingroot/RushRoot/hg;)V
a=0;// 
a=0;//     .line 647
a=0;//     iget-byte v3, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 648
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "type mismatch, tag: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", type: "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ", "
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-byte v1, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 650
a=0;//     :cond_0
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hg;);v2=(Null);v3=(Byte);v4=(Uninit);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 651
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     .line 652
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "invalid size, tag: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", type: "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-byte v0, v0, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, ", "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-byte v1, v1, Lcom/kingroot/RushRoot/hg;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", size: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 653
a=0;//     :cond_1
a=0;//     #v3=(Byte);v4=(Uninit);v5=(One);
a=0;//     new-array v0, v2, [B
a=0;// 
a=0;//     .line 654
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hf;->b:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 672
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 658
a=0;//     :sswitch_1
a=0;//     #v1=(Byte);v2=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0, v2, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(IIZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 659
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 660
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "size invalid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 661
a=0;//     :cond_3
a=0;//     #v1=(Byte);v2=(Null);
a=0;//     new-array v0, v3, [B
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 662
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     .line 663
a=0;//     aget-byte v4, v0, v2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {p0, v4, v2, v5}, Lcom/kingroot/RushRoot/hf;->a(BIZ)B
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     aput-byte v4, v0, v1
a=0;// 
a=0;//     .line 662
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 669
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 670
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hd;);
a=0;//     const-string v1, "require field not exist."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/hd;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hd;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 643
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x9 -> :sswitch_1
a=0;//         0xd -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
