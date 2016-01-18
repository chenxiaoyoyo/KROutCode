package com.kingroot.kinguser; class um { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/um;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile tS:Lcom/kingroot/kinguser/um;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jq:Ljava/lang/String;
a=0;// 
a=0;// .field private kC:Ljava/lang/String;
a=0;// 
a=0;// .field private tN:Ljava/lang/String;
a=0;// 
a=0;// .field private tO:Ljava/lang/String;
a=0;// 
a=0;// .field private tP:Ljava/lang/String;
a=0;// 
a=0;// .field private tQ:J
a=0;// 
a=0;// .field private tR:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/um;->tS:Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     const-string v0, "0000000000000000"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tO:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "0.0.0"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tP:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->jq:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/um;->tQ:J
a=0;// 
a=0;//     .line 39
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tR:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 61
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 64
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v3, "config.properties"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 67
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v1, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 94
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/kingroot/kinguser/vb;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->jq:Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     .line 106
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->tP:Ljava/lang/String;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {v1}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/um;->tQ:J
a=0;//     :try_end_3
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tR:Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     .line 120
a=0;//     :goto_3
a=0;//     return-void
a=0;// 
a=0;//     .line 71
a=0;//     :cond_2
a=0;//     :try_start_5
a=0;//     #v1=(Reference,[B);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-lez v4, :cond_3
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/kinguser/uq;->b(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 74
a=0;//     :cond_3
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v3, Ljava/util/Properties;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v3}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #v3=(Reference,Ljava/util/Properties;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v4, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v4, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 80
a=0;//     const-string v1, "build"
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;// 
a=0;//     .line 81
a=0;//     const-string v1, "channel"
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 82
a=0;//     const-string v1, "lc"
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->tO:Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/um;->kC:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 86
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     :cond_5
a=0;//     const/16 v1, 0xdc
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v1, "A42581DD4F60F342"
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/um;->tO:Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 94
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_6
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 97
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     .line 94
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     throw v0
a=0;// 
a=0;//     .line 97
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 117
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 111
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_1
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static kJ()Lcom/kingroot/kinguser/um;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sget-object v0, Lcom/kingroot/kinguser/um;->tS:Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 49
a=0;//     const-class v1, Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 50
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/um;->tS:Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/um;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/um;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/um;->tS:Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/um;->tS:Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 53
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ev()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->jq:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gR()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->tO:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     const-string v0, "A42581DD4F60F342"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tO:Ljava/lang/String;
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->tO:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gS()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->kC:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public kK()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     const/16 v0, 0xdc
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 126
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public kL()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/um;->tN:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 136
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public kM()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/um;->tP:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public kN()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/um;->jq:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/um;->tP:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public kO()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/um;->jq:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public kP()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/um;->tQ:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
}}
