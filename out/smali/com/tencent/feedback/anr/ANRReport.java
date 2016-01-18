package com.tencent.feedback.anr; class ANRReport { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/anr/ANRReport;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/anr/ANRReport;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static startANRMonitor(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/anr/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/b;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/anr/b;->startWatching()V
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static stopANRMonitor()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/anr/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/anr/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/anr/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/anr/b;->stopWatching()V
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static uploadANRInfo(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     const-string v0, "commonInfo is null not init ?"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->getCrashRuntimeStrategy()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 101
a=0;//     #v15=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     if-nez v15, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     const-string v0, "crash strategy null,not init?"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);v1=(Uninit);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->i()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/common/c;->n()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Map;);
a=0;//     const-string v6, "main"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "ANR_RQD_EXCEPTION"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, ""
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v10, p3
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-wide/from16 v11, p5
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-object/from16 v13, p4
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v14}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 108
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/feedback/eup/d;->e(Z)V
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static/range {p0 .. p0}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/b;);
a=0;//     invoke-virtual {v0, v1, v15}, Lcom/tencent/feedback/eup/b;->a(Lcom/tencent/feedback/eup/d;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 110
a=0;//     #v0=(Boolean);
a=0;//     const-string v2, "sha1:%s %d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->t()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->r()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 111
a=0;//     const-string v1, "handle anr %b"
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
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static uploadANRInfoAsync(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p5, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "anr args unright pid, procName ,anrTime should not be null"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     new-instance v0, Lcom/tencent/feedback/anr/ANRReport$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/anr/ANRReport$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-wide v6, p5
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/tencent/feedback/anr/ANRReport$1;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/ANRReport$1;);
a=0;//     invoke-virtual {v8, v0}, Lcom/tencent/feedback/common/b;->a(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
