package com.kingroot.RushRoot; class en { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/en;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/security/interfaces/RSAPublicKey;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljava/util/Properties;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v2=(Null);
a=0;//     const-string v0, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDCTrqGfyNYDKZEFfvXuYOu9mSCNu6ri10PMG2xJ5sBuUN2OFBT1W5n/dyUkR+Xgnd6w9arSFnU/8fpiP4DRZPL7pkmgzJvjoPqrreXO4nGRQtVbp6sD/gWCKsTlJ9bk01W32gfSOrCNch8BQJO8nE01ffnWmyRiqVTbuh9KEGgcwIDAQAB"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v1, Ljava/security/spec/X509EncodedKeySpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/security/spec/X509EncodedKeySpec;);
a=0;//     invoke-direct {v1, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
a=0;// 
a=0;//     .line 47
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/security/spec/X509EncodedKeySpec;);
a=0;//     const-string v0, "RSA"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/security/interfaces/RSAPublicKey;
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/en;->a:Ljava/security/interfaces/RSAPublicKey;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 49
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/security/spec/InvalidKeySpecException;->printStackTrace()V
a=0;// 
a=0;//     .line 50
a=0;//     sput-object v2, Lcom/kingroot/RushRoot/en;->a:Ljava/security/interfaces/RSAPublicKey;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;// 
a=0;//     .line 53
a=0;//     sput-object v2, Lcom/kingroot/RushRoot/en;->a:Ljava/security/interfaces/RSAPublicKey;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/util/Properties;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/en;);
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/en;->b:Ljava/util/Properties;
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/InputStream;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/res/AssetManager;Ljava/lang/String;)Lcom/kingroot/RushRoot/en;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     const-string v0, "KRSDKCertificate loadFromAsset >>>>>>>>>>"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 66
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/en;->a(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v2, 0x5443524b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Ljava/util/zip/DataFormatException;
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(UninitRef,Ljava/util/zip/DataFormatException;);
a=0;//     const-string v2, "Not a kingroot sdk certification file"
a=0;// 
a=0;//     .line 67
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/util/zip/DataFormatException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/DataFormatException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 93
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 95
a=0;//     throw v0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/en;->a(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/en;->a(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 72
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     .line 73
a=0;//     #v2=(Reference,[B);
a=0;//     new-array v3, v0, [B
a=0;// 
a=0;//     .line 74
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v4, Ljava/util/zip/Inflater;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/zip/Inflater;);
a=0;//     invoke-direct {v4}, Ljava/util/zip/Inflater;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     #v4=(Reference,Ljava/util/zip/Inflater;);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/zip/Inflater;->setInput([B)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {v4, v3}, Ljava/util/zip/Inflater;->inflate([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v0, v5, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v0, Ljava/util/zip/DataFormatException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/DataFormatException;);
a=0;//     const-string v2, "Unexpected data length"
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/util/zip/DataFormatException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/DataFormatException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v0}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     new-instance v4, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Properties;->loadFromXML(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/en;->a(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 84
a=0;//     #v3=(Integer);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     .line 85
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 86
a=0;//     const-string v4, "SHA1WithRSA"
a=0;// 
a=0;//     invoke-static {v4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 87
a=0;//     sget-object v5, Lcom/kingroot/RushRoot/en;->a:Ljava/security/interfaces/RSAPublicKey;
a=0;// 
a=0;//     #v5=(Reference,Ljava/security/interfaces/RSAPublicKey;);
a=0;//     invoke-virtual {v4, v5}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {v4, v2}, Ljava/security/Signature;->update([B)V
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {v4, v3}, Ljava/security/Signature;->verify([B)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Ljava/security/SignatureException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/security/SignatureException;);
a=0;//     const-string v2, "Bad signature"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/SignatureException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/en;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/en;);
a=0;//     invoke-direct {v2, v0}, Lcom/kingroot/RushRoot/en;-><init>(Ljava/util/Properties;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 94
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/en;);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 92
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 147
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/RushRoot/eo;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 149
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 153
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v0, "X.509"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/security/cert/X509Certificate;
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getEncoded()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/h;->b([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 155
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 162
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 157
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/ByteArrayInputStream;);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/security/cert/CertificateException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/security/cert/CertificateException;);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/security/cert/CertificateException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :catch_1
a=0;//     #v1=(Null);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/io/IOException;);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Null);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 157
a=0;//     :catch_3
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/security/cert/CertificateException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/en;->b:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     const-string v1, "channel_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/en;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 126
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/en;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 127
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     const-string v1, "Certifacate Fail, PackageName wrong."
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/en;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 132
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 133
a=0;//     const-string v1, "Certifacate Fail, PackageMD5 wrong."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     const-string v0, "Certifacate Succeed."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/en;->b:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     const-string v1, "package_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/en;->b:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     const-string v1, "cert_md5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
