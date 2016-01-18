package com.kingroot.kinguser; class gr { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/gr;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static Z(Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 27
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 28
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "sh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " -v"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/kinguser/gr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "kinguser_su"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     .line 178
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wm;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/wm;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 179
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vo;->add(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     const-string v2, "export LD_LIBRARY_PATH=/vendor/lib:/system/lib"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/kingroot/kinguser/wm;->a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/wm;->b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 187
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 193
a=0;//     :goto_0
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wo;);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Run Cmd Exception"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/wo;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 184
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 187
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 189
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Lcom/kingroot/kinguser/wm;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     .line 189
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     .line 187
a=0;//     :catchall_1
a=0;//     #v1=(Null);v5=(Uninit);
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
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 184
a=0;//     :catch_1
a=0;//     #v1=(Null);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);v1=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 249
a=0;//     .line 252
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wm;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/wm;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     .line 254
a=0;//     const-string v2, "export LD_LIBRARY_PATH=/vendor/lib:/system/lib"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/kingroot/kinguser/wm;->a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 256
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/wm;->L(Ljava/util/List;)Ljava/util/List;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 260
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 266
a=0;//     :goto_0
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 270
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 257
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 260
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 262
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Lcom/kingroot/kinguser/wm;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     .line 262
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     .line 260
a=0;//     :catchall_1
a=0;//     #v1=(Null);v5=(Uninit);
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
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 257
a=0;//     :catch_1
a=0;//     #v1=(Null);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);v1=(Reference,Ljava/util/List;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aa(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     const-string v1, "sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " -v"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/gr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "kinguser_su"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, ":"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     aget-object v0, v1, v0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ab(Ljava/lang/String;)Lcom/kingroot/kinguser/wm;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wm;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/wm;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 68
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     const-string v2, "id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/kingroot/kinguser/wm;->a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "uid=0"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     const-string v2, "export LD_LIBRARY_PATH=/vendor/lib:/system/lib"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/kingroot/kinguser/wm;->a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 85
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     #v4=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 80
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 79
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static ac(Ljava/lang/String;)Lcom/kingroot/kinguser/wm;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 93
a=0;//     .line 95
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wm;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/wm;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     const-string v2, "export LD_LIBRARY_PATH=/vendor/lib:/system/lib"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/kingroot/kinguser/wm;->a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 101
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 102
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static ad(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/gr;->ab(Ljava/lang/String;)Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 142
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-wide/32 v0, 0x1d4c0
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-direct {v2, p1, p1, v0, v1}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-static {p0, v2}, Lcom/kingroot/kinguser/gr;->a(Ljava/lang/String;Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Lcom/kingroot/kinguser/wm;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x7530
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Lcom/kingroot/kinguser/wm;->a(Ljava/lang/String;J)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "uid=0"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Lcom/kingroot/kinguser/gr;->b(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     return-object v0
a=0;// .end method
}}
