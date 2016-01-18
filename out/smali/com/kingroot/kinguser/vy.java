package com.kingroot.kinguser; class vy { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/vy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final NAME:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     const-string v0, "a1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fj;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/vy;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b([B[B)[B
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v0=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/vy;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/vy;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c([B[B)[B
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     new-instance v0, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v0=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/vy;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     #v0=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/vy;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static l([B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/vk;->j([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
