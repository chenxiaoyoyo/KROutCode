package com.kingroot.sdk.root; class e { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/e;
a=0;// .super Lcom/kingroot/sdk/root/b;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private g:Ljava/lang/Process;
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/kingroot/sdk/root/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/e;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/e;->i:Z
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/krcfg.txt"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/sdk/root/e;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/e;->i:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/sdk/root/y;)I
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 116
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 119
a=0;//     #v3=(Null);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 124
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/e;);
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/e;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v6, "play"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const-string v6, "krmain"
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 139
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/ProcessBuilder;);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v2, v6, v7
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v7, "-k"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v7, v6, v2
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/ProcessBuilder;->directory(Ljava/io/File;)Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/sdk/root/e;->g:Ljava/lang/Process;
a=0;// 
a=0;//     .line 141
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/e;->g:Ljava/lang/Process;
a=0;// 
a=0;//     new-instance v4, Lcom/kingroot/sdk/root/f;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/sdk/root/f;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v4, v0, v2}, Lcom/kingroot/sdk/root/f;-><init>(Lcom/kingroot/sdk/root/e;Ljava/lang/Process;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/f;);
a=0;//     invoke-virtual {v4}, Lcom/kingroot/sdk/root/f;->start()V
a=0;// 
a=0;//     .line 143
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/e;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget v8, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     sget-object v7, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     const-string v7, "0"
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     const-string v7, "1"
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     .line 143
a=0;//     invoke-static {v2, v4, v5}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "onRoot() start sid = "
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/e;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/e;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, ".stdout : "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 149
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/e;->g:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v13, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 210
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v13=(Reference,Ljava/io/BufferedReader;);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-virtual {v13}, Ljava/io/BufferedReader;->ready()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v4, v0, Lcom/kingroot/sdk/root/e;->i:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     move v9, v1
a=0;// 
a=0;//     .line 215
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v9=(Boolean);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long/2addr v1, v11
a=0;// 
a=0;//     const-wide/32 v3, 0xf4240
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long v11, v1, v3
a=0;// 
a=0;//     .line 217
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onRoot() end sid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/e;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", catchResult = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", exploitRet = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", childDuingTime = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 218
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u6267\u884c\u5b8c\u62101\uff01 catchResult = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 232
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/root/p;->e(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 233
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 234
a=0;//     array-length v1, v13
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 235
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x30d67
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v9, :cond_8
a=0;// 
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "catchResult="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", errCode="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 236
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/e;->b:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v7, 0x6
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     aget-object v15, v13, v15
a=0;// 
a=0;//     aput-object v15, v7, v14
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     aget-object v15, v13, v15
a=0;// 
a=0;//     #v15=(Null);
a=0;//     aput-object v15, v7, v14
a=0;// 
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     aget-object v15, v13, v15
a=0;// 
a=0;//     #v15=(Null);
a=0;//     aput-object v15, v7, v14
a=0;// 
a=0;//     const/4 v14, 0x3
a=0;// 
a=0;//     const/4 v15, 0x3
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     aget-object v13, v13, v15
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aput-object v13, v7, v14
a=0;// 
a=0;//     const/4 v13, 0x4
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v11, v7, v13
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v12, v7, v11
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 237
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/e;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 240
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     .line 241
a=0;//     if-nez v8, :cond_9
a=0;// 
a=0;//     .line 243
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 258
a=0;//     :goto_3
a=0;//     #v1=(Boolean);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 154
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Boolean);v7=(Reference,Ljava/lang/Object;);v9=(Reference,Ljava/lang/String;);v11=(LongLo);v12=(LongHi);v13=(Reference,Ljava/io/BufferedReader;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 155
a=0;//     const-wide/16 v4, 0x1f4
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v13}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 159
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 160
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     const-string v2, "[et] KRS|FT PARAMS:"
a=0;// 
a=0;//     invoke-static {v5, v2}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 173
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v6, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x6
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/kingroot/sdk/root/e;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v14=(Reference,Lcom/kingroot/sdk/commom/d;);
a=0;//     iget-object v14, v14, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v14, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget v15, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     aput-object v14, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     aput-object v2, v7, v8
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v14, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v7, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     const-string v8, "0"
a=0;// 
a=0;//     aput-object v8, v7, v2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     const-string v8, "1"
a=0;// 
a=0;//     aput-object v8, v7, v2
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {v4, v6, v7}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     const-string v2, "KRS|STAT|KD:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 180
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\u771f\u5b9e\u7684KD\u8def\u5f84\uff1a"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 181
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v6, "REAL_KD_PATH"
a=0;// 
a=0;//     invoke-static {v4, v6, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     const-string v2, "krerrcode:"
a=0;// 
a=0;//     invoke-static {v5, v2}, Lcom/kingroot/sdk/util/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 190
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 191
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v1, v2
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v1, v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 196
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, v3, v4}, Lcom/kingroot/sdk/root/g;->a(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 198
a=0;//     #v8=(One);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "catch ::: errCodes = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 199
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "CATCH_SOLUTION_RESULT"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/e;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/kingroot/sdk/root/e;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v15=(Reference,Lcom/kingroot/sdk/commom/d;);
a=0;//     iget-object v15, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v15, v7, v14
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 200
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/e;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 201
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     move v1, v8
a=0;// 
a=0;//     .line 202
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v6=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 235
a=0;//     :cond_8
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ga;);v2=(Integer);v3=(LongLo);v4=(LongHi);v5=(Conflicted);v8=(Boolean);v9=(Boolean);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 245
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     :goto_5
a=0;//     const-string v1, "\u6267\u884c\u5b8c\u6210\uff01"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 252
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 248
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);
a=0;//     const/16 v1, 0x1b62
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "Exe fail, EOF"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 249
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onRoot() not catchResult : "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 254
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 255
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 256
a=0;//     const/16 v2, 0x1b63
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 257
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onRoot() exception : "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Reference,Landroid/content/Context;);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/os/Handler;);v7=(Reference,[Ljava/lang/Object;);v8=(One);v9=(Reference,Ljava/lang/String;);v11=(LongLo);v12=(LongHi);v13=(Reference,Ljava/io/BufferedReader;);v14=(Null);v15=(Reference,Ljava/lang/String;);
a=0;//     move v9, v8
a=0;// 
a=0;//     #v9=(One);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/sdk/root/b;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/root/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v4=(Null);
a=0;//     const-string v5, "ver:00001"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "c:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/root/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "krcert.jar"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     .line 73
a=0;//     #v4=(PosByte);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "mydir:"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/root/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "rmode:"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v6, p0, Lcom/kingroot/sdk/root/e;->f:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "kddir:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/root/e;->c:Lkrsdk/d;
a=0;// 
a=0;//     iget-object v6, v6, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "apkdir:"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/root/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     .line 71
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/File;[Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 75
a=0;//     :catch_0
a=0;//     #v0=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v2, "\u751f\u6210\u65b9\u6848\u914d\u7f6e\u6587\u4ef6\u51fa\u9519"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/e;->g:Ljava/lang/Process;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Process;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 298
a=0;//     :try_start_0
a=0;//     const-string v0, "ExeRootSolution.destroy() start"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 300
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/e;->i:Z
a=0;// 
a=0;//     .line 301
a=0;//     const-string v0, "ExeRootSolution.destroy() done"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 306
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 302
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 303
a=0;//     const-string v1, "ExeRootSolution.destroy() throw e"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
