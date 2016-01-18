package com.kingroot.kinguser; class ut { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ut;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public tZ:I
a=0;// 
a=0;// .field public ua:I
a=0;// 
a=0;// .field public ub:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ut;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/io/InputStream;)Lcom/kingroot/kinguser/ut;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ut;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ut;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/ut;-><init>()V
a=0;// 
a=0;//     .line 120
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ut;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/up;->g([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/ut;->tZ:I
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/up;->g([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/ut;->ua:I
a=0;// 
a=0;//     .line 125
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 127
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/ut;->ub:[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 132
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 128
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 129
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static m(Ljava/io/File;)Lcom/kingroot/kinguser/ut;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ut;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 89
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ut;->c(Ljava/io/InputStream;)Lcom/kingroot/kinguser/ut;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ut;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 98
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 91
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 94
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     .line 94
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 97
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 98
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 90
a=0;//     :catch_4
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
}}
