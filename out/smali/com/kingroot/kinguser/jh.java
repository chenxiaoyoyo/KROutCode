package com.kingroot.kinguser; class jh { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile jL:Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private gm:Ljava/util/Properties;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jh;->jL:Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jh;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/jh;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v0}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jh;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     .line 28
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jh;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "kinguser.cfg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 31
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jh;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 37
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 37
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 34
a=0;//     :catch_3
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 35
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/io/IOException;);v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 37
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 37
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     throw v0
a=0;// 
a=0;//     .line 40
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 37
a=0;//     :catchall_1
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_2
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 34
a=0;//     :catch_6
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static gK()Lcom/kingroot/kinguser/jh;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jh;->jL:Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jh;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 49
a=0;//     const-class v1, Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 50
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jh;->jL:Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/jh;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/jh;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jh;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jh;->jL:Lcom/kingroot/kinguser/jh;
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jh;->jL:Lcom/kingroot/kinguser/jh;
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
a=0;// .method public Y(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gs;->hd:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/jh;->t(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public t(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jh;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jh;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "kinguser.cfg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 77
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jh;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 81
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 84
a=0;//     :catch_0
a=0;//     #v2=(Null);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 79
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 81
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     throw v0
a=0;// 
a=0;//     .line 84
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
