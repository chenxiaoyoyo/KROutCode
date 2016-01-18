package com.kingroot.sdk.root; class v { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/v;
a=0;// .super Lcom/kingroot/sdk/root/x;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lkrsdk/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/kingroot/RushRoot/fn;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/x;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/x;->d:Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     .line 24
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/x;->a:I
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(II)Lcom/kingroot/sdk/root/v;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 46
a=0;//     :try_start_0
a=0;//     const-string v1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v1, "su"
a=0;// 
a=0;//     invoke-direct {v2, v1}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     int-to-long v3, p0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v1, v3, v4}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;J)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/root/a;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "VirtualTerminal runCommand ret : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, v1, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", stdout : "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v1, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", stderr : "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v1, Lcom/kingroot/sdk/root/v;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/root/v;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/root/v;->d()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/kingroot/sdk/root/v;-><init>(Lcom/kingroot/RushRoot/fn;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 76
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/v;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Reference,Lcom/kingroot/RushRoot/fn;);v3=(Integer);v4=(LongHi);
a=0;//     const/16 v2, 0x1b6c
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ret="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, v1, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",stdout="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v1, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",stderr="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 67
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     if-ge v0, p1, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u518d\u6b21\u5c1d\u8bd5\u8fdesu: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     const-wide/16 v1, 0x3e8
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 64
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const/16 v2, 0x1b6d
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 76
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static d()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v3, "sh"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 88
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v2, "export PATH=/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:$PATH"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 89
a=0;//     const-string v2, "su -v"
a=0;// 
a=0;//     const-wide/16 v3, 0x1388
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;J)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "checkIfKuSu : ret = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, v2, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", stdout = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v2, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", stderr = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v2, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/fp;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, v2, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "kinguser"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 101
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 97
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 99
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/Exception;);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 99
a=0;//     :goto_2
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/fn;);v2=(Reference,Ujava/lang/Object;);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 100
a=0;//     throw v0
a=0;// 
a=0;//     .line 98
a=0;//     :catchall_1
a=0;//     #v0=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 97
a=0;//     :catch_1
a=0;//     #v0=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
