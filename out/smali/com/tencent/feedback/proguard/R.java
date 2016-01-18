package com.tencent.feedback.proguard; class R { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/R;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/proguard/S;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/R;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 11
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a([B)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 18
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 26
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 19
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "DES/CBC/PKCS5Padding"
a=0;// 
a=0;//     invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 21
a=0;//     new-instance v1, Ljavax/crypto/spec/DESKeySpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V
a=0;// 
a=0;//     .line 22
a=0;//     #v1=(Reference,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     const-string v2, "DES"
a=0;// 
a=0;//     invoke-static {v2}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 23
a=0;//     new-instance v2, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v2=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     iget-object v3, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     .line 24
a=0;//     #v2=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b([B)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "DES/CBC/PKCS5Padding"
a=0;// 
a=0;//     invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v1, Ljavax/crypto/spec/DESKeySpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V
a=0;// 
a=0;//     .line 36
a=0;//     #v1=(Reference,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     const-string v2, "DES"
a=0;// 
a=0;//     invoke-static {v2}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v2, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v2=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     iget-object v3, p0, Lcom/tencent/feedback/proguard/R;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     .line 38
a=0;//     #v2=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
