package com.kingroot.sdk.util; class h { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/util/h;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     const-string v0, "0123456789abcdef"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/sdk/util/h;->a:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 28
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/h;->c([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 29
a=0;//     #v2=(Reference,[B);
a=0;//     new-instance v3, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuffer;);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     aget-byte v4, v2, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit16 v4, v4, 0xff
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ge v5, v6, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b([B)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/util/h;->d([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     aget-byte v4, v1, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit16 v4, v4, 0xff
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Lcom/kingroot/sdk/util/h;->a:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     shr-int/lit8 v6, v4, 0x4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget-char v5, v5, v6
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     sget-object v5, Lcom/kingroot/sdk/util/h;->a:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     and-int/lit8 v4, v4, 0xf
a=0;// 
a=0;//     aget-char v4, v5, v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static c([B)[B
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v2, "4D4435"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/o;->b(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static d([B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     :try_start_0
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 67
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 64
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
