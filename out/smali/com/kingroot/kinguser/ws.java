package com.kingroot.kinguser; class ws { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ws;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static c([I[I)[I
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Null);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     .line 56
a=0;//     #v5=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-gt v5, v0, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(PosByte);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Reference,[I);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x34
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     div-int/2addr v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x6
a=0;// 
a=0;//     .line 71
a=0;//     add-int/lit8 v1, v5, -0x1
a=0;// 
a=0;//     aget v1, p0, v1
a=0;// 
a=0;//     .line 74
a=0;//     const v3, 0x363c7cbf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v0
a=0;// 
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     .line 75
a=0;//     const v4, 0x67fafcfa
a=0;// 
a=0;//     sub-int/2addr v4, v0
a=0;// 
a=0;//     array-length v6, p1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v4, v6
a=0;// 
a=0;//     add-int v6, v3, v4
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 78
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     add-int/2addr v1, v6
a=0;// 
a=0;//     .line 79
a=0;//     ushr-int/lit8 v4, v1, 0x2
a=0;// 
a=0;//     and-int/lit8 v7, v4, 0x3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 80
a=0;//     :goto_1
a=0;//     add-int/lit8 v8, v5, -0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ge v3, v8, :cond_3
a=0;// 
a=0;//     .line 81
a=0;//     add-int/lit8 v8, v3, 0x1
a=0;// 
a=0;//     aget v8, p0, v8
a=0;// 
a=0;//     .line 82
a=0;//     aget v9, p0, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     ushr-int/lit8 v10, v4, 0x5
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     shl-int/lit8 v11, v8, 0x2
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     xor-int/2addr v10, v11
a=0;// 
a=0;//     ushr-int/lit8 v11, v8, 0x3
a=0;// 
a=0;//     shl-int/lit8 v12, v4, 0x4
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     xor-int/2addr v11, v12
a=0;// 
a=0;//     add-int/2addr v10, v11
a=0;// 
a=0;//     xor-int/2addr v8, v1
a=0;// 
a=0;//     and-int/lit8 v11, v3, 0x3
a=0;// 
a=0;//     xor-int/2addr v11, v7
a=0;// 
a=0;//     aget v11, p1, v11
a=0;// 
a=0;//     xor-int/2addr v4, v11
a=0;// 
a=0;//     add-int/2addr v4, v8
a=0;// 
a=0;//     xor-int/2addr v4, v10
a=0;// 
a=0;//     add-int/2addr v4, v9
a=0;// 
a=0;//     aput v4, p0, v3
a=0;// 
a=0;//     .line 80
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 84
a=0;//     :cond_3
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     aget v8, p0, v2
a=0;// 
a=0;//     .line 85
a=0;//     add-int/lit8 v9, v5, -0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget v10, p0, v9
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     ushr-int/lit8 v11, v4, 0x5
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     shl-int/lit8 v12, v8, 0x2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     xor-int/2addr v11, v12
a=0;// 
a=0;//     ushr-int/lit8 v12, v8, 0x3
a=0;// 
a=0;//     shl-int/lit8 v13, v4, 0x4
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     xor-int/2addr v12, v13
a=0;// 
a=0;//     add-int/2addr v11, v12
a=0;// 
a=0;//     xor-int/2addr v8, v1
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0x3
a=0;// 
a=0;//     xor-int/2addr v3, v7
a=0;// 
a=0;//     aget v3, p1, v3
a=0;// 
a=0;//     xor-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v3, v8
a=0;// 
a=0;//     xor-int/2addr v3, v11
a=0;// 
a=0;//     add-int/2addr v3, v10
a=0;// 
a=0;//     aput v3, p0, v9
a=0;// 
a=0;//     .line 86
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d([I[I)[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/ws;->c([I[I)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
}}
