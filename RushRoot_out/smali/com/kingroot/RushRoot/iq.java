package com.kingroot.RushRoot; class iq { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/iq;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static a(Ljava/lang/String;Lcom/kingroot/RushRoot/js;)Lcom/kingroot/RushRoot/jr;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jp;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/jp;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 136
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jp;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     const-string v2, "export LD_LIBRARY_PATH=/vendor/lib:/system/lib"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/RushRoot/jp;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/RushRoot/jp;->a(Lcom/kingroot/RushRoot/js;)Lcom/kingroot/RushRoot/jr;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jr;);v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/jp;->a()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jr;);
a=0;//     iget-object v1, p1, Lcom/kingroot/RushRoot/js;->a:Ljava/lang/String;
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
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcom/kingroot/RushRoot/jr;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jr;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 143
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 143
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Lcom/kingroot/RushRoot/jp;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jp;->a()V
a=0;// 
a=0;//     .line 145
a=0;//     :cond_3
a=0;//     throw v0
a=0;// 
a=0;//     .line 142
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
a=0;//     :catch_1
a=0;//     #v1=(Null);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/RushRoot/jr;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/js;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/js;);
a=0;//     const-wide/32 v1, 0x1d4c0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {v0, p1, p1, v1, v2}, Lcom/kingroot/RushRoot/js;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/js;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/RushRoot/iq;->a(Ljava/lang/String;Lcom/kingroot/RushRoot/js;)Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     const-string v0, "sh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " --ping"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/iq;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/jr;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jr;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "kinguser_su"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
