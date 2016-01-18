package com.kingroot.RushRoot; class ak { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ak;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// .field public static final b:Ljava/lang/String;
a=0;// 
a=0;// .field private static c:Ljava/lang/String;
a=0;// 
a=0;// .field private static d:I
a=0;// 
a=0;// .field private static e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     sget-boolean v0, Lcom/kingroot/RushRoot/ak;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "http://wuptest.cs0309.3g.qq.com"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ak;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "http://www.kingroot.net/proxy.php"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ak;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 70
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     const-string v2, "config.properties"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 73
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 75
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     sput-object v1, Lcom/kingroot/RushRoot/ak;->c:Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 94
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     sput-object v1, Lcom/kingroot/RushRoot/ak;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/kingroot/RushRoot/ak;->d:I
a=0;// 
a=0;//     .line 106
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     sput-object p2, Lcom/kingroot/RushRoot/ak;->e:Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 80
a=0;//     :cond_2
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/io/InputStream;);v2=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/util/Cryptor;->y(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v2, Ljava/util/Properties;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v2}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #v2=(Reference,Ljava/util/Properties;);
a=0;//     new-instance v3, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 86
a=0;//     const-string v1, "channel"
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/kingroot/RushRoot/ak;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 88
a=0;//     sput-object p1, Lcom/kingroot/RushRoot/ak;->c:Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 94
a=0;//     :cond_3
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_6
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_0
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v5
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/InputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
a=0;// 
a=0;//     .line 98
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 110
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v0, "1.0.0"
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ak;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 111
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/RushRoot/ak;->d:I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 98
a=0;//     :catch_3
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_4
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ak;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
