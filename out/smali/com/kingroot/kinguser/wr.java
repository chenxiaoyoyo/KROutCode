package com.kingroot.kinguser; class wr { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/wr;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static a([I[I)[I
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     #v11=(Null);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     .line 108
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-gt v3, v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(PosByte);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 112
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Reference,[I);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v11, v0, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x34
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     div-int/2addr v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x6
a=0;// 
a=0;//     .line 123
a=0;//     const v1, 0x363c7cbf
a=0;// 
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 124
a=0;//     const v2, 0x67fafcfa
a=0;// 
a=0;//     sub-int/2addr v2, v0
a=0;// 
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v2, v4
a=0;// 
a=0;//     add-int v4, v1, v2
a=0;// 
a=0;//     .line 126
a=0;//     mul-int/2addr v0, v4
a=0;// 
a=0;//     .line 127
a=0;//     aget v1, p0, v11
a=0;// 
a=0;//     .line 130
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     ushr-int/lit8 v2, v0, 0x2
a=0;// 
a=0;//     and-int/lit8 v5, v2, 0x3
a=0;// 
a=0;//     .line 131
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v2, v3, -0x1
a=0;// 
a=0;//     move v12, v2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v12
a=0;// 
a=0;//     :goto_1
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 132
a=0;//     add-int/lit8 v6, v1, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v6, p0, v6
a=0;// 
a=0;//     .line 133
a=0;//     aget v7, p0, v1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     ushr-int/lit8 v8, v6, 0x5
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     shl-int/lit8 v9, v2, 0x2
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     xor-int/2addr v8, v9
a=0;// 
a=0;//     ushr-int/lit8 v9, v2, 0x3
a=0;// 
a=0;//     shl-int/lit8 v10, v6, 0x4
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     xor-int/2addr v9, v10
a=0;// 
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     xor-int/2addr v2, v0
a=0;// 
a=0;//     and-int/lit8 v9, v1, 0x3
a=0;// 
a=0;//     xor-int/2addr v9, v5
a=0;// 
a=0;//     aget v9, p1, v9
a=0;// 
a=0;//     xor-int/2addr v6, v9
a=0;// 
a=0;//     add-int/2addr v2, v6
a=0;// 
a=0;//     xor-int/2addr v2, v8
a=0;// 
a=0;//     sub-int v2, v7, v2
a=0;// 
a=0;//     aput v2, p0, v1
a=0;// 
a=0;//     .line 131
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     add-int/lit8 v6, v3, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v6, p0, v6
a=0;// 
a=0;//     .line 136
a=0;//     aget v7, p0, v11
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     ushr-int/lit8 v8, v6, 0x5
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     shl-int/lit8 v9, v2, 0x2
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     xor-int/2addr v8, v9
a=0;// 
a=0;//     ushr-int/lit8 v9, v2, 0x3
a=0;// 
a=0;//     shl-int/lit8 v10, v6, 0x4
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     xor-int/2addr v9, v10
a=0;// 
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     xor-int/2addr v2, v0
a=0;// 
a=0;//     and-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     xor-int/2addr v1, v5
a=0;// 
a=0;//     aget v1, p1, v1
a=0;// 
a=0;//     xor-int/2addr v1, v6
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     xor-int/2addr v1, v8
a=0;// 
a=0;//     sub-int v1, v7, v1
a=0;// 
a=0;//     aput v1, p0, v11
a=0;// 
a=0;//     .line 137
a=0;//     sub-int/2addr v0, v4
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b([I[I)[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/wr;->a([I[I)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
}}
