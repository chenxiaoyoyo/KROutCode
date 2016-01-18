package com.tencent.feedback.eup; class CrashReport { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/eup/CrashReport;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/eup/CrashReport;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addPlugin(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const-string v0, "10000"
a=0;// 
a=0;//     const-string v1, "unknown"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/tencent/feedback/common/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     if-nez p3, :cond_3
a=0;// 
a=0;//     const-string p3, ""
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/feedback/common/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static clearSDKTotalConsume(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/f;->c(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 324
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static countExceptionDatas(Landroid/content/Context;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 247
a=0;//     #v0=(Byte);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->m()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/eup/e;);
a=0;//     if-nez v1, :cond_1
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
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/e;->g()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static countStoredRecord(Landroid/content/Context;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/eup/c;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static doUploadExceptionDatas()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->l()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getCrashRuntimeStrategy()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/e;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/e;->q()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 197
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 199
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 201
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSDKTotalConsume(Landroid/content/Context;Z)J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/f;->b(Landroid/content/Context;)Lcom/tencent/feedback/proguard/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/p;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 315
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-wide v0, v0, Lcom/tencent/feedback/proguard/p;->e:J
a=0;// 
a=0;//     .line 317
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/p;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-wide v1, v0, Lcom/tencent/feedback/proguard/p;->d:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, v0, Lcom/tencent/feedback/proguard/p;->e:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long v0, v1, v3
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 317
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/p;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static handleCatchException(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[B)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     invoke-static {p0, p1, p2, p3}, Lcom/tencent/feedback/eup/e;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[B)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static initCrashReport(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v1, v1, v0, v1}, Lcom/tencent/feedback/eup/CrashReport;->initCrashReport(Landroid/content/Context;Lcom/tencent/feedback/eup/CrashHandleListener;Lcom/tencent/feedback/upload/UploadHandleListener;ZLcom/tencent/feedback/eup/CrashStrategyBean;)V
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initCrashReport(Landroid/content/Context;Lcom/tencent/feedback/eup/CrashHandleListener;Lcom/tencent/feedback/upload/UploadHandleListener;ZLcom/tencent/feedback/eup/CrashStrategyBean;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const-string v1, "10000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, p3}, Lcom/tencent/feedback/eup/e;->a(Landroid/content/Context;Z)Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/feedback/upload/UploadHandleListener;);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/tencent/feedback/eup/e;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/feedback/upload/f;Lcom/tencent/feedback/upload/UploadHandleListener;Lcom/tencent/feedback/eup/CrashHandleListener;Lcom/tencent/feedback/eup/CrashStrategyBean;)Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initCrashReport(Landroid/content/Context;Lcom/tencent/feedback/eup/CrashHandleListener;Lcom/tencent/feedback/upload/UploadHandleListener;ZLcom/tencent/feedback/eup/CrashStrategyBean;J)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, 0x2710
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, p5, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     cmp-long v2, p5, v0
a=0;// 
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     move-wide p5, v0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     invoke-static {p5, p6}, Lcom/tencent/feedback/proguard/u;->a(J)V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     const-string v1, "10000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, p3}, Lcom/tencent/feedback/eup/e;->a(Landroid/content/Context;Z)Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/feedback/upload/UploadHandleListener;);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/feedback/eup/CrashHandleListener;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/tencent/feedback/eup/e;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/feedback/upload/f;Lcom/tencent/feedback/upload/UploadHandleListener;Lcom/tencent/feedback/eup/CrashHandleListener;Lcom/tencent/feedback/eup/CrashStrategyBean;)Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initCrashReport(Landroid/content/Context;Z)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v4=(Null);
a=0;//     const-string v1, "10000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, p1}, Lcom/tencent/feedback/eup/e;->a(Landroid/content/Context;Z)Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/tencent/feedback/eup/e;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/feedback/upload/f;Lcom/tencent/feedback/upload/UploadHandleListener;Lcom/tencent/feedback/eup/CrashHandleListener;Lcom/tencent/feedback/eup/CrashStrategyBean;)Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initNativeCrashReport(Landroid/content/Context;Ljava/lang/String;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, p2, v0, v0}, Lcom/tencent/feedback/eup/CrashReport;->initNativeCrashReport(Landroid/content/Context;Ljava/lang/String;ZLjava/util/List;Ljava/io/File;)V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initNativeCrashReport(Landroid/content/Context;Ljava/lang/String;ZLjava/util/List;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, p2, p3, v0}, Lcom/tencent/feedback/eup/CrashReport;->initNativeCrashReport(Landroid/content/Context;Ljava/lang/String;ZLjava/util/List;Ljava/io/File;)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initNativeCrashReport(Landroid/content/Context;Ljava/lang/String;ZLjava/util/List;Ljava/io/File;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v1=(Null);
a=0;//     if-eqz p4, :cond_5
a=0;// 
a=0;//     .line 133
a=0;//     invoke-static {p4}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->loadRQDNativeLib(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     const-string v0, "load lib fail %s close native return!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 184
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "load lib sucess from specify!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 162
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/eup/jni/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->setmHandler(Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;)V
a=0;// 
a=0;//     .line 164
a=0;//     if-eqz p4, :cond_3
a=0;// 
a=0;//     .line 167
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     new-instance p3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #p3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_2
a=0;//     #p3=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 173
a=0;//     :cond_3
a=0;//     if-eqz p0, :cond_4
a=0;// 
a=0;//     if-nez p1, :cond_8
a=0;// 
a=0;//     :cond_4
a=0;//     const-string v0, "rqdp{  nreg param!}"
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 174
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/d;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/d;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->registEUP(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {v5}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->enableNativeEUP(Z)V
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz p2, :cond_9
a=0;// 
a=0;//     .line 178
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->setNativeLogMode(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p3, :cond_a
a=0;// 
a=0;//     .line 145
a=0;//     invoke-static {p3}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->loadRQDNativeLib(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 146
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 147
a=0;//     const-string v2, "load lib sucess from list!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 152
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->loadRQDNativeLib()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 154
a=0;//     const-string v0, "load lib fail default close native return!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     const-string v0, "load lib sucess default!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 173
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/e;->q()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/a;->b()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getRecordOverDays()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v3, v3, 0x18
a=0;// 
a=0;//     mul-int/lit16 v3, v3, 0xe10
a=0;// 
a=0;//     mul-int/lit16 v3, v3, 0x3e8
a=0;// 
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/eup/CrashStrategyBean;->getMaxStoredNum()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     new-instance v4, Lcom/tencent/feedback/eup/jni/c;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/feedback/eup/jni/c;);
a=0;//     invoke-direct {v4, p1, v1, v2, v0}, Lcom/tencent/feedback/eup/jni/c;-><init>(Ljava/lang/String;JI)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/feedback/eup/jni/c;);
a=0;//     invoke-virtual {v3, v4}, Lcom/tencent/feedback/common/b;->a(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/data/data/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/lib/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/feedback/eup/jni/a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/eup/jni/a;);
a=0;//     invoke-direct {v2, p0, v0, p3}, Lcom/tencent/feedback/eup/jni/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/eup/jni/a;);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/common/b;->a(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 182
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->setNativeLogMode(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static removePlugin(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "10000"
a=0;// 
a=0;//     const-string v1, "unknown"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/tencent/feedback/common/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/feedback/common/c;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setCrashReportAble(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/e;->k()Lcom/tencent/feedback/eup/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 291
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/feedback/eup/e;->a(Z)V
a=0;// 
a=0;//     .line 295
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setLogAble(ZZ)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     sput-boolean p0, Lcom/tencent/feedback/common/e;->a:Z
a=0;// 
a=0;//     .line 337
a=0;//     sput-boolean p1, Lcom/tencent/feedback/common/e;->b:Z
a=0;// 
a=0;//     .line 338
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setNativeCrashReportAble(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->enableNativeEUP(Z)V
a=0;// 
a=0;//     .line 301
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setThreadPoolService(Ljava/util/concurrent/ScheduledExecutorService;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/common/b;->a(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/b;->a(Lcom/tencent/feedback/common/b;)V
a=0;// 
a=0;//     .line 348
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setUserId(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "unknown"
a=0;// 
a=0;//     invoke-static {p0, p1, v0}, Lcom/tencent/feedback/common/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     .line 214
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 213
a=0;//     :cond_0
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/feedback/common/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
