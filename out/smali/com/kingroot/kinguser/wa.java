package com.kingroot.kinguser; class wa { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/wa;
a=0;// .super Lcom/kingroot/kinguser/wc;
a=0;// .source "SourceFile waThread done"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic uR:Z
a=0;// 
a=0;// .field final synthetic uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/vz;Ljava/util/List;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     iput-boolean p3, p0, Lcom/kingroot/kinguser/wa;->uR:Z
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/wc;-><init>(Lcom/kingroot/kinguser/vz;Ljava/util/List;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public b(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     monitor-enter v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_3
a=0;// 
a=0;//     .line 99
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/wb;)V
a=0;// 
a=0;//     .line 100
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 105
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/vz;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 107
a=0;//     :try_start_2
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/wa;->uR:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vz;->lR()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/vz;->b(Lcom/kingroot/kinguser/vz;)Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/vz;Lcom/kingroot/kinguser/wc;)Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     .line 111
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vz;);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v0
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     .line 101
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     .line 105
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/vz;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 107
a=0;//     :try_start_6
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/wa;->uR:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vz;->lR()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/vz;->b(Lcom/kingroot/kinguser/vz;)Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 110
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/vz;Lcom/kingroot/kinguser/wc;)Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     .line 111
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 105
a=0;//     :catchall_3
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->isRunning()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/vz;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 107
a=0;//     :try_start_8
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/wa;->uR:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vz;->lR()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vz;->b(Lcom/kingroot/kinguser/vz;)Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 110
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/wa;->uS:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/vz;->a(Lcom/kingroot/kinguser/vz;Lcom/kingroot/kinguser/wc;)Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     .line 111
a=0;//     monitor-exit v1
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_4
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_4
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_9
a=0;//     monitor-exit v1
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_4
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
