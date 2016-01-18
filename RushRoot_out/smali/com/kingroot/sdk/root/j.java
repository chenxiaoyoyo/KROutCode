package com.kingroot.sdk.root; class j { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/j;
a=0;// .super Lcom/kingroot/sdk/root/b;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static g:Ljava/lang/Class;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private h:Ljava/lang/Object;
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/kingroot/sdk/root/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/j;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     .line 88
a=0;//     const-string v0, "JavaRootSolution.<init>()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/k;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/sdk/root/k;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized d()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "/vroot.jar"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v3, v3, Lcom/kingroot/sdk/root/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/kingroot/sdk/util/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 116
a=0;//     sput-object v1, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     const/16 v1, 0x1b67
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "jsolution fail load "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     :try_start_2
a=0;//     sget-object v1, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u5b9e\u4f8b\u5316\u65b9\u6848\u7c7b\u6210\u529f! delegate = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 126
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "\u5b9e\u4f8b\u5316\u65b9\u6848\u7c7b\u5f02\u5e38!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 127
a=0;//     const/16 v2, 0x1b67
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "jsolution fail newInstance "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private e()Lcom/kingroot/sdk/root/a;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 279
a=0;//     const-string v1, "JavaRootSolution.getSolutionShell()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 280
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 281
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/j;->d()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/i;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 286
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v1, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v2, v2, Lcom/kingroot/sdk/root/k;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v3, v3, Lcom/kingroot/sdk/root/k;->i:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 288
a=0;//     new-instance v1, Lcom/kingroot/sdk/root/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/root/i;);
a=0;//     sget-object v3, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     invoke-direct {v1, v3, v4, v2, v5}, Lcom/kingroot/sdk/root/i;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Lcom/kingroot/sdk/root/k;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/i;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 289
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/i;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 290
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 291
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "\u8c03\u7528JavaShell\u7684getShell()\u65b9\u6cd5\u5f02\u5e38!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 292
a=0;//     const/16 v2, 0x1b66
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-string v3, "jsolution getShell exception"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/16 v1, 0x1b65
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "jsolution getShell unroot"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/sdk/root/y;)I
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 185
a=0;//     const-string v0, "JavaRootSolution.onRoot()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/j;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 262
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 192
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/commom/d;);
a=0;//     iget-object v4, v4, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget v5, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v5, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     .line 192
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 198
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "onRoot() start sid = "
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/sdk/root/k;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/sdk/root/k;->e:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "CATCH_SOLUTION_RESULT"
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v4, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->b:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     iget-object v10, p0, Lcom/kingroot/sdk/root/j;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v10=(Reference,Lcom/kingroot/sdk/commom/d;);
a=0;//     iget-object v10, v10, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v10, v6, v9
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/sdk/root/g;->a(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/p;->e(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 209
a=0;//     #v9=(Reference,[Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long/2addr v0, v7
a=0;// 
a=0;//     const-wide/32 v2, 0xf4240
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-long v7, v0, v2
a=0;// 
a=0;//     .line 211
a=0;//     array-length v0, v9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x30d67
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "result="
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aget-object v11, v9, v11
a=0;// 
a=0;//     aput-object v11, v6, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aget-object v11, v9, v11
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v11, v6, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aget-object v11, v9, v11
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v11, v6, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aget-object v9, v9, v11
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object v9, v6, v10
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v10, v6, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v6, v9
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "onRoot() end sid = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", result = "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", childDuingTime = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 221
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/j;->e()Lcom/kingroot/sdk/root/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 222
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/d;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "kd"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 230
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;Lkrsdk/h;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Boolean);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Vroot.startSuc.ret = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->c:Lkrsdk/d;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "play"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "su"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->c:Lkrsdk/d;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "play"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "Kinguser.apk"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v4=(Reference,Lkrsdk/d;);
a=0;//     iget-object v4, v4, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/supolicy"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 236
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/j;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-ne v0, v5, :cond_5
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/RushRoot/fz;->a(Landroid/content/Context;Lkrsdk/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 238
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Vroot.installKu.ret = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ", rmode = "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/j;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 252
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     .line 253
a=0;//     const-string v0, "onRoot() suc"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     :goto_4
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Reference,Ljava/lang/String;);v2=(Integer);v3=(Null);v5=(Reference,Ljava/lang/String;);v6=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 212
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Integer);v3=(LongHi);v6=(Reference,[Ljava/lang/Object;);v9=(Reference,[Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 239
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Reference,Lcom/kingroot/sdk/root/a;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v5=(One);v9=(Conflicted);v11=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/j;->f:I
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v0, v5, :cond_2
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/RushRoot/fz;->a(Landroid/content/Context;Lkrsdk/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 241
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Vroot.installKu.ret = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ", rmode = "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/j;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 259
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 260
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/16 v1, 0x1b63
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "jsolution onRoot exception"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 261
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "onRoot() exception : "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 262
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 244
a=0;//     :cond_6
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/os/Handler;);v6=(Reference,[Ljava/lang/Object;);v10=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     .line 245
a=0;//     const/16 v0, 0x1b62
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "no tmpshell, result = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/kingroot/sdk/root/j;->i:I
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
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 248
a=0;//     :cond_7
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/j;->i:I
a=0;// 
a=0;//     .line 249
a=0;//     const/16 v0, 0x1b62
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "root fail, result = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/kingroot/sdk/root/j;->i:I
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
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 255
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "onRoot() fail : "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/sdk/root/b;->a()Z
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/root/j;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/vroot.jar"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 141
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v5, "sh"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v5}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 144
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v3, "export PATH=/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:$PATH"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 145
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "cat "
a=0;// 
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, " > "
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 155
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 156
a=0;//     const-string v2, "JavaRootSolution.init()"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/j;->d()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 146
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(One);v3=(Null);v4=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 147
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/fn;);v3=(Conflicted);
a=0;//     const-string v3, "\u590d\u5236KU\u5f02\u5e38"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 150
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     :catchall_0
a=0;//     #v1=(One);v2=(Conflicted);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 150
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Reference,Lcom/kingroot/RushRoot/fn;);v3=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     throw v0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 166
a=0;//     :try_start_4
a=0;//     sget-object v3, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/kingroot/sdk/root/k;->n:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/sdk/root/k;->o:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v5, "workDir"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/root/j;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 169
a=0;//     const-string v5, "safeMode"
a=0;// 
a=0;//     sget-object v6, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     iget-boolean v6, v6, Lkrsdk/d;->c:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aput-object v2, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aput-object v4, v6, v7
a=0;// 
a=0;//     invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :catch_1
a=0;//     #v0=(Null);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     :try_start_5
a=0;//     sget-object v3, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v4, v4, Lcom/kingroot/sdk/root/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/sdk/root/k;->c:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     iget-object v7, p0, Lcom/kingroot/sdk/root/j;->e:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     aput-object v2, v5, v6
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 176
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 177
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const/16 v2, 0x1b61
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-string v3, "jsolution init exception"
a=0;// 
a=0;//     invoke-static {v2, v3, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Reference,Lcom/kingroot/RushRoot/fn;);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 146
a=0;//     :catch_3
a=0;//     #v0=(Null);v1=(One);v5=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     const-string v0, "JavaRootSolution.destroy()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 305
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/j;->g:Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v1, v1, Lcom/kingroot/sdk/root/k;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/j;->j:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v2, v2, Lcom/kingroot/sdk/root/k;->g:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/j;->h:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 307
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 308
a=0;//     const-string v1, "\u8c03\u7528\u65b9\u6848\u7c7bdestroy()\u65b9\u6cd5\u5f02\u5e38!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
