package com.kingroot.kinguser; class jj { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/jj;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jj;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 244
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 246
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v3, v3, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 247
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 252
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v3, v2}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     #v1=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/me;->fr()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 260
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 266
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ji;->gL()Lcom/kingroot/kinguser/ji;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 267
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ji;);
a=0;//     sget-object v4, Lcom/kingroot/kinguser/aan;->Cz:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     .line 268
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3, v1}, Lcom/kingroot/kinguser/ji;->Z(I)Z
a=0;// 
a=0;//     .line 269
a=0;//     monitor-exit v4
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/ji;->gN()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {v3, v0}, Lcom/kingroot/kinguser/ji;->aN(Ljava/lang/String;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 261
a=0;//     :catch_0
a=0;//     #v0=(Boolean);v1=(Null);v3=(LongLo);v4=(LongHi);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 262
a=0;//     #v3=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 268
a=0;//     #v1=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 269
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Null);v3=(Integer);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
