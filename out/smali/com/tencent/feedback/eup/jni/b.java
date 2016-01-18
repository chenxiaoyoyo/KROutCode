package com.tencent.feedback.eup.jni; class b { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/eup/jni/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcom/tencent/feedback/eup/jni/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/tencent/feedback/eup/jni/b;);
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/eup/jni/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     const-class v1, Lcom/tencent/feedback/eup/jni/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/eup/jni/b;->b:Lcom/tencent/feedback/eup/jni/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/jni/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Lcom/tencent/feedback/eup/jni/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/eup/jni/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/feedback/eup/jni/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/jni/b;);
a=0;//     sput-object v0, Lcom/tencent/feedback/eup/jni/b;->b:Lcom/tencent/feedback/eup/jni/b;
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/feedback/eup/jni/b;->b:Lcom/tencent/feedback/eup/jni/b;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 55
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 18
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const v11, -0x499602d2
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const-string v12, ""
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     const/4 v15, -0x1
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     const-string v16, ""
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v17, "unknown"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/jni/b;);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-wide/from16 v3, p3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-wide/from16 v5, p5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move-object/from16 v7, p7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v8, p8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v9, p9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v10, p10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v17}, Lcom/tencent/feedback/eup/jni/b;->handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     const-string v1, "rqdp{  na eup p:} %d , t:%d , exT:%d ,exTMS: %d, exTP:%s ,exADD:%s ,parsed exSTA:%s, TMB:%s , si_code:%d , si_CodeType:%s , sPid:%d ,sUid:%d,siErr:%d,siErrMsg:%s,naVersion:%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xf
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     aput-object p7, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     aput-object p8, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     aput-object p9, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     aput-object p10, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     aput-object p12, v2, v3
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     invoke-static/range {p13 .. p13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     invoke-static/range {p14 .. p14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     invoke-static/range {p15 .. p15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     aput-object p16, v2, v3
a=0;// 
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     aput-object p17, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 145
a=0;//     const-string v1, "eup"
a=0;// 
a=0;//     const-string v2, "native crash happen"
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 146
a=0;//     const-string v1, "eup"
a=0;// 
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 148
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 149
a=0;//     #v11=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 152
a=0;//     #v10=(Null);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "rqdp{  instance == null}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v12, v1
a=0;// 
a=0;//     .line 153
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);v12=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);
a=0;//     if-eqz v12, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     :try_start_0
a=0;//     const-string v1, "set exdata"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 159
a=0;//     invoke-interface {v12}, Lcom/tencent/feedback/eup/CrashHandleListener;->getCrashExtraData()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 169
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v11=(Reference,[B);
a=0;//     const-string v1, "set exMsg"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 170
a=0;//     invoke-interface {v12}, Lcom/tencent/feedback/eup/CrashHandleListener;->getCrashExtraMessage()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     if-nez p9, :cond_3
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/eup/jni/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/common/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/eup/jni/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long v4, v4, p3
a=0;// 
a=0;//     const-wide/16 v8, 0x3e8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     div-long v8, p5, v8
a=0;// 
a=0;//     add-long/2addr v8, v4
a=0;// 
a=0;//     move-object/from16 v4, p8
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v5, p7
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v6, p7
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v1 .. v11}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 182
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "rqdp{  cr eup msg fail!}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 210
a=0;//     :cond_1
a=0;//     :goto_5
a=0;//     return-void
a=0;// 
a=0;//     .line 152
a=0;//     :cond_2
a=0;//     #v3=(PosByte);v4=(Reference,Ljava/lang/Integer;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Null);v12=(Uninit);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/e;->p()Lcom/tencent/feedback/eup/CrashHandleListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v12, v1
a=0;// 
a=0;//     #v12=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 163
a=0;//     const-string v2, "get extra data error %s"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 172
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Reference,Ljava/lang/Integer;);v5=(Conflicted);v11=(Reference,[B);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 174
a=0;//     const-string v2, "get extra msg error %s"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Reference,Ljava/lang/Integer;);v5=(Conflicted);v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "java.lang.Thread.getStackTrace"
a=0;// 
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gez v1, :cond_4
a=0;// 
a=0;//     move-object/from16 v7, p9
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v7=(Uninit);
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_5
a=0;// 
a=0;//     move-object/from16 v7, p9
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v7=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
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
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v8=(LongLo);v9=(LongHi);
a=0;//     if-lez p11, :cond_7
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "("
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p12
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ")"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "kernel"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->p(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);
a=0;//     const-string v2, "etype:%s,sType:%s,sPN:%s"
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->G()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->F()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->a(Z)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->c(Z)V
a=0;// 
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/feedback/eup/d;->h(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object/from16 v0, p17
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/feedback/eup/d;->q(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p12
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/feedback/eup/d;->p(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/jni/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     move/from16 v0, p13
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v2, v0}, Lcom/tencent/feedback/common/a;->a(Landroid/content/Context;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->o(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 189
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/jni/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 190
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/feedback/eup/b;->a(Lcom/tencent/feedback/eup/d;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 193
a=0;//     #v1=(Boolean);
a=0;//     const-string v2, "rqdp{  handle na eup} %b"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v1, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 197
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     const-string v1, "rqdp{  start your handler to native crash}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 202
a=0;//     :try_start_2
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-interface {v12, p1, p2, v0}, Lcom/tencent/feedback/eup/CrashHandleListener;->onNativeCrash(IILjava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 204
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 206
a=0;//     const-string v2, "your crash handle happen error %s"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// .end method
}}
