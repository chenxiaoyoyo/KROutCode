package com.kingroot.RushRoot; class iw { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/iw;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/iw;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/iw;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(I)Ljava/util/List;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/iw;->b:Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/b;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/iw;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "40236.dat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/je;->a(Ljava/io/InputStream;)Lcom/kingroot/RushRoot/je;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->d()Lcom/kingroot/RushRoot/ja;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ja;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/iw;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-interface {v2, v4, v0}, Lcom/kingroot/RushRoot/ja;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jw;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/jw;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jw;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lcom/kingroot/RushRoot/jw;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/RushRoot/jw;->a([B)V
a=0;// 
a=0;//     const-string v2, "40236"
a=0;// 
a=0;//     new-instance v4, Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/RushRoot/b;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/RushRoot/b;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/b;);
a=0;//     invoke-virtual {v0, v2, v4}, Lcom/kingroot/RushRoot/jw;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/iw;->b:Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/iw;->b:Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v0, v4}, Lcom/kingroot/RushRoot/b;->a(Ljava/lang/StringBuilder;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/iw;->b:Lcom/kingroot/RushRoot/b;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/b;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 95
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 82
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v2=(Reference,Ljava/lang/Object;);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v2=(Reference,Ljava/lang/Object;);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/a;
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v4, v0, Lcom/kingroot/RushRoot/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/jo;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 88
a=0;//     #v5=(Integer);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/jo;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Integer);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     if-ne v5, p1, :cond_3
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 82
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/iw;->a(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/iw;->a(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/iw;->a(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final d()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/iw;->a(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
}}
