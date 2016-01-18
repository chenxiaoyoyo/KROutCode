package com.kingroot.kinguser; class tp { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tp;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final tm:[B
a=0;// 
a=0;// .field public static final tn:[B
a=0;// 
a=0;// .field public static final to:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 6
a=0;//     #v1=(PosByte);
a=0;//     new-array v0, v1, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/tp;->tm:[B
a=0;// 
a=0;//     .line 7
a=0;//     new-array v0, v1, [B
a=0;// 
a=0;//     fill-array-data v0, :array_1
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/tp;->tn:[B
a=0;// 
a=0;//     .line 8
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_2
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/tp;->to:[B
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 6
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x20t
a=0;//     .end array-data
a=0;// 
a=0;//     .line 7
a=0;//     :array_1
a=0;//     .array-data 1
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//     .end array-data
a=0;// 
a=0;//     .line 8
a=0;//     :array_2
a=0;//     .array-data 1
a=0;//         -0x1t
a=0;//         -0x2t
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a([BII)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     add-int/lit8 v0, p1, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget-byte v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     aget-byte v0, p0, p1
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget-byte v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, p1, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget-byte v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 137
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 135
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a([B[B)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 176
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v0, v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 178
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 179
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aget-byte v3, p1, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 183
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aU(I)[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     .line 35
a=0;//     #v3=(PosByte);
a=0;//     new-array v1, v3, [B
a=0;// 
a=0;//     .line 36
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     mul-int/lit8 v2, v0, 0x8
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rsub-int/lit8 v2, v2, 0x18
a=0;// 
a=0;//     ushr-int v2, p0, v2
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v0
a=0;// 
a=0;//     .line 36
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static c([BI)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const/16 v2, 0xff
a=0;// 
a=0;//     .line 25
a=0;//     #v2=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v0, p1
a=0;// 
a=0;//     .line 26
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);
a=0;//     add-int/lit8 v3, p1, 0x4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     .line 28
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/2addr v3, v2
a=0;// 
a=0;//     .line 29
a=0;//     #v3=(Integer);
a=0;//     or-int/2addr v1, v3
a=0;// 
a=0;//     .line 26
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static f([B)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 11
a=0;//     #v0=(Null);
a=0;//     const/16 v2, 0xff
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 14
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 15
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     .line 16
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/2addr v3, v2
a=0;// 
a=0;//     .line 17
a=0;//     #v3=(Integer);
a=0;//     or-int/2addr v1, v3
a=0;// 
a=0;//     .line 14
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 19
a=0;//     :cond_0
a=0;//     #v3=(PosByte);
a=0;//     return v1
a=0;// .end method
}}
