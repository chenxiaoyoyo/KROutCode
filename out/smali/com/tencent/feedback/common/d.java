package com.tencent.feedback.common; class d { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/common/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/feedback/common/d;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/d;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const-class v1, Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/feedback/common/d;->a:Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/d;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/common/d;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/feedback/common/d;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/d;);
a=0;//     sput-object v0, Lcom/tencent/feedback/common/d;->a:Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/common/d;->a:Lcom/tencent/feedback/common/d;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 54
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
a=0;// .method public static a()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 88
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "rqdp{  getDeviceName error}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 93
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 102
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "rqdp{  getVersion error}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 107
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v3=(Null);
a=0;//     const-string v1, "fail"
a=0;// 
a=0;//     .line 132
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     const-string v0, "rqdp{  getImei but context == null!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 157
a=0;//     :goto_0
a=0;//     #v3=(Reference,[Ljava/lang/Object;);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 142
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     const-string v0, "null"
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 150
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "rqdp{  IMEI:}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 154
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v4=(Conflicted);
a=0;//     const-string v2, "rqdp{  getImei error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 152
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v4
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static c()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 121
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 116
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "rqdp{  getApiLevel error}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 121
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     #v3=(Null);
a=0;//     const-string v1, "fail"
a=0;// 
a=0;//     .line 164
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     const-string v0, "rqdp{  getImsi but context == null!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 187
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Reference,[Ljava/lang/Object;);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 173
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_1
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 184
a=0;//     const-string v2, "rqdp{  getImsi error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     :try_start_0
a=0;//     const-string v0, "os.arch"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 344
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 339
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 341
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "rqdp{  ge cuabi fa!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 344
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     #v3=(Null);
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     .line 194
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     const-string v1, "rqdp{  getAndroidId but context == null!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 217
a=0;//     :goto_0
a=0;//     #v3=(Reference,[Ljava/lang/Object;);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 202
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v2, "android_id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 203
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 205
a=0;//     :try_start_1
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     :cond_1
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 214
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v4=(Conflicted);
a=0;//     const-string v2, "rqdp{  getAndroidId error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :catch_1
a=0;//     #v3=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static e(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 246
a=0;//     #v2=(Null);
a=0;//     const-string v1, "fail"
a=0;// 
a=0;//     .line 247
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     const-string v0, "rqdp{  getMacAddress but context == null!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 257
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 258
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 260
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_1
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 267
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 270
a=0;//     const-string v1, "rqdp{  getMacAddress error!}"
a=0;// 
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e()[B
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 353
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, "/proc/cpuinfo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 354
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 356
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 357
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 358
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-array v5, v3, [B
a=0;// 
a=0;//     .line 360
a=0;//     #v5=(Reference,[B);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 361
a=0;//     :goto_0
a=0;//     #v3=(LongLo);v4=(LongHi);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2, v5}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 364
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v0, v5, v7, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     .line 366
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v3, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_0
a=0;//     #v6=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 370
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     .line 371
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-string v7, "cpuInfo read:%d write:%d"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v8, v3
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 382
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 394
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/IOException;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 388
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/FileInputStream;);v3=(One);v4=(Reference,Ljava/lang/Long;);v5=(LongLo);v6=(LongHi);v7=(Reference,Ljava/lang/String;);v8=(Reference,[Ljava/lang/Object;);v9=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 386
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 377
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const-string v3, "rqdp{  ge cuabi fa!}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 378
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 382
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 394
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 388
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/FileInputStream;);v3=(Reference,Ljava/lang/String;);v4=(Reference,[Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 390
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 382
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     .line 391
a=0;//     :cond_2
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 388
a=0;//     :catch_3
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 382
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 386
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static f()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     :try_start_0
a=0;//     const-class v0, Landroid/os/Build;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "HARDWARE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 403
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 404
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 411
a=0;//     :goto_0
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 407
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 409
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v0, "rqdp{getCpuProductorName error!}"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 411
a=0;//     :cond_0
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static f(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 277
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     const-string v0, "rqdp{  getMacAddress but context == null!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 280
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     .line 294
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Null);
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 287
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 289
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 291
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 292
a=0;//     const-string v0, "rqdp{  getMacAddress error!}"
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 294
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static g(Landroid/content/Context;)Landroid/util/DisplayMetrics;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 310
a=0;//     #v3=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 312
a=0;//     const-string v0, "rqdp{  getDisplayMetrics but context == null!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 328
a=0;//     :goto_0
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 318
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Null);
a=0;//     new-instance v2, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 319
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     .line 320
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 321
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 323
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 325
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  getDisplayMetrics error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 326
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 328
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static g()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 416
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     .line 419
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 420
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Landroid/os/StatFs;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v2, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 421
a=0;//     #v2=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v3, v1
a=0;// 
a=0;//     .line 422
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     .line 423
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     mul-long/2addr v1, v3
a=0;// 
a=0;//     const-wide/16 v3, 0x400
a=0;// 
a=0;//     div-long/2addr v1, v3
a=0;// 
a=0;//     const-wide/16 v3, 0x400
a=0;// 
a=0;//     div-long/2addr v1, v3
a=0;// 
a=0;//     invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 430
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 425
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 427
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  getDisplayMetrics error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 428
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static h(Landroid/content/Context;)J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, -0x2
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 435
a=0;//     #v4=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 437
a=0;//     const-string v0, "rqdp{  getFreeMem but context == null!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-wide v0, v1
a=0;// 
a=0;//     .line 452
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Reference,[Ljava/lang/Object;);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 442
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(LongLo);v3=(Uninit);v4=(Null);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 443
a=0;//     new-instance v3, Landroid/app/ActivityManager$MemoryInfo;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/ActivityManager$MemoryInfo;);
a=0;//     invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V
a=0;// 
a=0;//     .line 444
a=0;//     #v3=(Reference,Landroid/app/ActivityManager$MemoryInfo;);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
a=0;// 
a=0;//     .line 445
a=0;//     iget-wide v0, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 447
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(LongLo);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 449
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "rqdp{  getFreeMem error!}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 450
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move-wide v0, v1
a=0;// 
a=0;//     .line 452
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static h()Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 468
a=0;//     #v8=(Null);
a=0;//     const-string v0, "/proc/meminfo"
a=0;// 
a=0;//     .line 473
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/FileReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 474
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileReader;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     const/16 v0, 0x2000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {v1, v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 475
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 476
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ":\\s+"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 477
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 478
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "kb"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 479
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x400
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     div-long/2addr v4, v6
a=0;// 
a=0;//     .line 480
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 492
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     .line 496
a=0;//     invoke-virtual {v3}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     .line 507
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 501
a=0;//     :catch_0
a=0;//     #v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 503
a=0;//     const-string v2, "rqdp{  getFreeMem error!}"
a=0;// 
a=0;//     new-array v3, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 482
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 484
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Reference,Ljava/io/FileReader;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v3, "rqdp{  getFreeMem error!}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 485
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     .line 492
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 494
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     .line 496
a=0;//     :cond_0
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 498
a=0;//     invoke-virtual {v2}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 507
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     const-string v0, "-2"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 501
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 503
a=0;//     const-string v1, "rqdp{  getFreeMem error!}"
a=0;// 
a=0;//     new-array v2, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 490
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 492
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);v3=(Reference,Ljava/io/FileReader;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 494
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     .line 496
a=0;//     :cond_2
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 498
a=0;//     invoke-virtual {v3}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     .line 505
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 501
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 503
a=0;//     const-string v2, "rqdp{  getFreeMem error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 490
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Ljava/io/FileReader;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileReader;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 482
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileReader;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileReader;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static i()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/os/StatFs;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/StatFs;);
a=0;//     const-string v1, "/data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 515
a=0;//     #v0=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 516
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     .line 517
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     int-to-long v0, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     .line 524
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 519
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 521
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "rqdp{  getFreeStorage error!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 522
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 524
a=0;//     const-wide/16 v0, -0x2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static i(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 831
a=0;//     const-string v1, "unknown"
a=0;// 
a=0;//     .line 834
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 835
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 836
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 904
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 838
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 840
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 904
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 842
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(One);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 844
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 845
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 847
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 895
a=0;//     const-string v0, "unknown"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 850
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "GPRS"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 853
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "EDGE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 856
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "UMTS"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 859
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "HSDPA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 862
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "HSUPA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 865
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "HSPA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 868
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "CDMA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 871
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "EVDO_0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 874
a=0;//     :pswitch_8
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "EVDO_A"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 877
a=0;//     :pswitch_9
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "1xRTT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 880
a=0;//     :pswitch_a
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "iDen"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 883
a=0;//     :pswitch_b
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "EVDO_B"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 886
a=0;//     :pswitch_c
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "LTE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 889
a=0;//     :pswitch_d
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "eHRPD"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 892
a=0;//     :pswitch_e
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "HSPA+"
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 900
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 902
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 847
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_a
a=0;//         :pswitch_b
a=0;//         :pswitch_c
a=0;//         :pswitch_d
a=0;//         :pswitch_e
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static k()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     .line 572
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 579
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 574
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 576
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  getCountry error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 577
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static l()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 584
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     .line 587
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 594
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 589
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 591
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  getLanguage error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 592
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static m()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 705
a=0;//     const-string v0, "fail"
a=0;// 
a=0;//     .line 708
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 715
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 710
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 712
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  getBrand error!}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 713
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final j()J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 547
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "mounted"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 549
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 564
a=0;//     :goto_1
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 547
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 554
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/os/StatFs;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 555
a=0;//     #v0=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 556
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     .line 557
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     int-to-long v2, v3
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 559
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(One);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 561
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "rqdp{  get free sd error %s}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v1, v2
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 562
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 564
a=0;//     const-wide/16 v0, -0x2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// .end method
}}
