package com.kingroot.sdk.root; class u { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/u;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:Landroid/os/Handler;
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// .field d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 827
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 828
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/u;);
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/u;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 829
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/root/u;->b:Landroid/os/Handler;
a=0;// 
a=0;//     .line 830
a=0;//     iput-object p3, p0, Lcom/kingroot/sdk/root/u;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 831
a=0;//     iput-object p4, p0, Lcom/kingroot/sdk/root/u;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 832
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v3, 0x7d0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 841
a=0;//     #v2=(One);
a=0;//     sget-object v0, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/d;);
a=0;//     iget-wide v0, v0, Lkrsdk/d;->j:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     div-long v3, v0, v3
a=0;// 
a=0;//     .line 843
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     cmp-long v5, v0, v3
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     .line 857
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/u;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/u;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v7, v0
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/kingroot/sdk/root/r;
a=0;// 
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 858
a=0;//     const-string v0, "Solution Timeout"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 859
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/u;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "SOLUTION_TIMEOUT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "7052"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/u;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     new-array v6, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iget-object v9, p0, Lcom/kingroot/sdk/root/u;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v6, v8
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 860
a=0;//     invoke-interface {v7}, Lcom/kingroot/sdk/root/r;->c()V
a=0;// 
a=0;//     .line 864
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 844
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(LongLo);v4=(LongHi);v5=(Byte);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\u6253\u70b9\uff1a"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 846
a=0;//     const-wide/16 v5, 0x7d0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 853
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/u;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v5}, Lcom/kingroot/sdk/root/g;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 843
a=0;//     const-wide/16 v5, 0x1
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     add-long/2addr v0, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 848
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     .line 849
a=0;//     const-string v0, "\u88ab\u6253\u65ad"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 850
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/u;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/root/g;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 862
a=0;//     :cond_1
a=0;//     #v5=(Byte);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v0, "Solution Timeout, no solution"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
