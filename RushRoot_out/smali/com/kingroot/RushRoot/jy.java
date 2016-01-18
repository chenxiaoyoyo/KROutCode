package com.kingroot.RushRoot; class jy { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:[B
a=0;// 
a=0;// .field private static final b:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/jy;->b:[C
a=0;// 
a=0;//     .line 17
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/jy;->a:[B
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 12
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x41s
a=0;//         0x42s
a=0;//         0x43s
a=0;//         0x44s
a=0;//         0x45s
a=0;//         0x46s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     new-array v1, v0, [C
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Reference,[C);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     .line 62
a=0;//     #v2=(Byte);
a=0;//     mul-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     sget-object v4, Lcom/kingroot/RushRoot/jy;->b:[C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     and-int/lit8 v5, v2, 0xf
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-char v4, v4, v5
a=0;// 
a=0;//     #v4=(Char);
a=0;//     aput-char v4, v1, v3
a=0;// 
a=0;//     .line 63
a=0;//     ushr-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(Byte);
a=0;//     mul-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x0
a=0;// 
a=0;//     sget-object v4, Lcom/kingroot/RushRoot/jy;->b:[C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-char v2, v4, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, v1, v3
a=0;// 
a=0;//     .line 59
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 66
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
