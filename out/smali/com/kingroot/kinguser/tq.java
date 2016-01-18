package com.kingroot.kinguser; class tq { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tq;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private tp:I
a=0;// 
a=0;// .field private tq:Lcom/kingroot/kinguser/to;
a=0;// 
a=0;// .field private tr:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 11
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 6
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/tq;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tq;->tp:I
a=0;// 
a=0;//     .line 8
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/tq;->tq:Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     .line 9
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/tq;->tr:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 12
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aV(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/tq;->tp:I
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public kv()[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tq;->tq:Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/to;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 22
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tq;->tq:Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/to;->tk:[B
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public kw()Lcom/kingroot/kinguser/to;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tq;->tq:Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/to;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public kx()[B
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v10, 0x8
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     .line 45
a=0;//     #v3=(Null);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/tq;->tp:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/tp;->aU(I)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 48
a=0;//     #v5=(Reference,[B);
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/tq;->tr:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 49
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Integer);
a=0;//     if-ge v1, v7, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     .line 51
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     mul-int/lit8 v0, v7, 0x4
a=0;// 
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     .line 56
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     .line 57
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/tp;->aU(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v0, v3, v1, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/tp;->aU(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v3, v1, v8, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {v5, v3, v1, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 63
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Integer);
a=0;//     if-ge v2, v5, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 65
a=0;//     array-length v7, v0
a=0;// 
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/tp;->aU(I)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     invoke-static {v7, v3, v1, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 66
a=0;//     add-int/lit8 v4, v4, 0x4
a=0;// 
a=0;//     .line 67
a=0;//     array-length v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v0, v3, v1, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 68
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     .line 63
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 76
a=0;//     :goto_2
a=0;//     #v0=(Reference,[B);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(PosByte);v4=(Uninit);v5=(Reference,[B);v7=(Uninit);
a=0;//     new-array v0, v2, [B
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/tp;->aU(I)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1, v3, v0, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 73
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/tp;->aU(I)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v3, v0, v8, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-static {v5, v3, v0, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setData([B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/to;->e([B)Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/to;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tq;->tq:Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
}}
