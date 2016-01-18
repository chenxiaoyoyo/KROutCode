package com.kingroot.RushRoot.statics; class b { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/statics/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/bj;
a=0;// 
a=0;// .field final synthetic b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/statics/a;Lcom/kingroot/RushRoot/bj;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/statics/b;->b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/RushRoot/statics/b;->a:Lcom/kingroot/RushRoot/bj;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/statics/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/statics/b;->a:Lcom/kingroot/RushRoot/bj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bj;);
a=0;//     const-string v1, "\t"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v0, Lcom/kingroot/RushRoot/bj;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v3, v0, Lcom/kingroot/RushRoot/bj;->b:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/RushRoot/bj;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/bj;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 467
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "add "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/statics/b;->b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/statics/b;->a:Lcom/kingroot/RushRoot/bj;
a=0;// 
a=0;//     iget v2, v2, Lcom/kingroot/RushRoot/bj;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/statics/a;->b(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " : "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 468
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/bn;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 469
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 471
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v3, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileWriter;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/statics/b;->b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/statics/a;->a(Lcom/kingroot/RushRoot/statics/a;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileWriter;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 472
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 474
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
a=0;// 
a=0;//     .line 475
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const-string v2, "kr_has_action_stats"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v0, v2, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 480
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/statics/b;->b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/statics/a;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 481
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 475
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/io/FileWriter;);v4=(Reference,Ljava/io/File;);v5=(One);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrApplication;->a()Landroid/content/Context;
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 476
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 477
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "add stat_point failed:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/statics/b;->a:Lcom/kingroot/RushRoot/bj;
a=0;// 
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/bj;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 478
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 480
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/statics/b;->b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/statics/a;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/statics/b;->b:Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/statics/a;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 481
a=0;//     throw v0
a=0;// 
a=0;//     .line 480
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 476
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/io/File;);v5=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// .end method
}}
