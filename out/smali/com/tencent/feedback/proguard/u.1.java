package com.tencent.feedback.proguard; class u.1 { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/u;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/feedback/proguard/u;->a:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/u;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static declared-synchronized a()J
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const-class v0, Lcom/tencent/feedback/proguard/u;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-wide v1, Lcom/tencent/feedback/proguard/u;->a:J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-wide v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const-class v0, Lcom/tencent/feedback/proguard/u;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     sput-wide p0, Lcom/tencent/feedback/proguard/u;->a:J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 48
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :catchall_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private a(JJ)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 151
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/t;->a()Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 153
a=0;//     #v2=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     iget-object v4, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     invoke-static {v4, v5, v2}, Lcom/tencent/feedback/proguard/y;->a(Landroid/content/Context;Lcom/tencent/feedback/common/b;Lcom/tencent/feedback/upload/f;)Lcom/tencent/feedback/proguard/y;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 154
a=0;//     #v6=(Reference,Lcom/tencent/feedback/proguard/y;);
a=0;//     invoke-virtual {v6}, Lcom/tencent/feedback/proguard/y;->b()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 155
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     const-wide/32 v4, 0xea60
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v6, v4, v5}, Lcom/tencent/feedback/proguard/y;->a(J)Z
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v4, Ljava/util/Date;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v4}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v4}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long v8, p1, p3
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_2
a=0;// 
a=0;//     .line 160
a=0;//     const-string v1, "lastUpdate:%d ,return not query"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v3
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 229
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Null);v2=(Reference,Lcom/tencent/feedback/upload/f;);v4=(Byte);v5=(LongHi);v6=(Reference,Lcom/tencent/feedback/proguard/y;);v8=(LongLo);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 166
a=0;//     :goto_1
a=0;//     #v2=(Integer);v5=(Conflicted);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     add-int/lit8 v5, v2, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v5, v2, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     const-wide/16 v8, 0xc8
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 177
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/t;->a()Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 172
a=0;//     :catch_0
a=0;//     #v2=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 174
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     #v2=(Integer);v5=(Conflicted);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 185
a=0;//     :try_start_1
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v2, v6, v0}, Lcom/tencent/feedback/proguard/A;->a(Landroid/content/Context;Lcom/tencent/feedback/proguard/y;B)Lcom/tencent/feedback/proguard/Z;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 187
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 191
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     const/16 v0, 0x6e
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/Z;->a()[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/B;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/B;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/proguard/B;-><init>()V
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/B;);
a=0;//     iput-object v5, v0, Lcom/tencent/feedback/proguard/B;->a:Ljava/util/Map;
a=0;// 
a=0;//     .line 194
a=0;//     const-string v5, "rqdp{ common query add uin} %d"
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, v2, Lcom/tencent/feedback/proguard/Z;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 203
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);
a=0;//     new-instance v1, Lcom/tencent/feedback/proguard/v;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/proguard/v;);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/16 v5, 0x457
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/16 v6, 0xc8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v1, v2, v5, v6, v0}, Lcom/tencent/feedback/proguard/v;-><init>(Landroid/content/Context;IILcom/tencent/feedback/proguard/B;)V
a=0;// 
a=0;//     .line 204
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/v;);
a=0;//     invoke-interface {v4, v1}, Lcom/tencent/feedback/upload/f;->a(Lcom/tencent/feedback/upload/AbstractUploadDatas;)V
a=0;// 
a=0;//     .line 212
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "GEN_QIMEI"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/feedback/common/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 215
a=0;//     new-instance v0, Lcom/tencent/feedback/upload/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/upload/b;);
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/feedback/upload/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 216
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/b;);
a=0;//     invoke-interface {v4, v0}, Lcom/tencent/feedback/upload/f;->a(Lcom/tencent/feedback/upload/AbstractUploadDatas;)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "GEN_QIMEI"
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/feedback/common/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 222
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v0, "rqdp{  save GEN_QIMEI flag failed! }"
a=0;// 
a=0;//     new-array v1, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v1=(Null);v5=(Reference,Ljava/lang/String;);v6=(Reference,[Ljava/lang/Object;);v7=(Null);v8=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, v2, Lcom/tencent/feedback/proguard/Z;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 197
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 199
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 200
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 227
a=0;//     :cond_6
a=0;//     #v0=(One);v2=(Integer);v6=(Reference,Lcom/tencent/feedback/proguard/y;);v8=(LongLo);
a=0;//     const-string v0, "rqdp{  no uphandler ,no upload!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(PosByte);v1=(Null);v2=(Reference,Lcom/tencent/feedback/proguard/Z;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private b()J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x12c
a=0;// 
a=0;//     .line 58
a=0;//     #v2=(PosShort);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/feedback/proguard/a;->a(Landroid/content/Context;I)Lcom/tencent/feedback/proguard/z;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/z;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/z;->c()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/t;->c()Lcom/tencent/feedback/upload/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 64
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     const/16 v2, 0x12c
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/z;->c()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v1, v2, v3, v4}, Lcom/tencent/feedback/upload/e;->a(I[BZ)V
a=0;// 
a=0;//     .line 67
a=0;//     const-string v1, "rqdp{  common strategy setted by history}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/z;->d()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 77
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 71
a=0;//     :catch_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/z;);v1=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/tencent/feedback/proguard/u;->b()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 266
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/u;);
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 267
a=0;//     #v13=(Reference,Lcom/tencent/feedback/proguard/t;);
a=0;//     invoke-virtual {v13}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 268
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-wide v9, v1
a=0;// 
a=0;//     .line 271
a=0;//     :goto_0
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-virtual {v13}, Lcom/tencent/feedback/proguard/t;->e()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 273
a=0;//     const-string v1, "rqdp{  stepCheckApp}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 275
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v13, v1}, Lcom/tencent/feedback/proguard/t;->a(I)V
a=0;// 
a=0;//     .line 276
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/common/a;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v14, 0xa
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-static {v1, v3, v2, v14}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;Ljava/lang/String;II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/List;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz v14, :cond_d
a=0;// 
a=0;//     invoke-interface {v14}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_d
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/tencent/feedback/proguard/o;
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Reference,Lcom/tencent/feedback/proguard/o;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->b()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     cmp-long v1, v4, v15
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->c()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     cmp-long v1, v6, v15
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/proguard/w;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     :goto_2
a=0;//     #v1=(Boolean);v4=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     const-string v2, "rqdp{  isAppFirstRun } %b"
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
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 279
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 280
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/common/c;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/common/c;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_6
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v13}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/proguard/w;);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/w;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/tencent/feedback/common/c;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 283
a=0;//     const-string v3, "rqdp{  uuid } %s"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/common/c;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 290
a=0;//     :goto_3
a=0;//     #v5=(Reference,Ljava/lang/Boolean;);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 293
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide v5, 0x7fffffffffffffffL
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     invoke-static/range {v1 .. v8}, Lcom/tencent/feedback/proguard/l;->a(Landroid/content/Context;[IJJII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 294
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "rqdp{  clear all ao} %d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 299
a=0;//     monitor-enter v13
a=0;// 
a=0;//     .line 301
a=0;//     :try_start_0
a=0;//     const-string v1, "rqdp{  appfirstRun}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v13}, Lcom/tencent/feedback/proguard/t;->d()[Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 304
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v13, v1}, Lcom/tencent/feedback/proguard/t;->a(Z)V
a=0;// 
a=0;//     .line 305
a=0;//     monitor-exit v13
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 307
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 309
a=0;//     const-string v1, "rqdp{  notify listener first run}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 310
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_8
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     .line 312
a=0;//     invoke-interface {v4}, Lcom/tencent/feedback/proguard/s;->f()V
a=0;// 
a=0;//     .line 310
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 268
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/w;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/w;->c()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit16 v1, v1, 0xe10
a=0;// 
a=0;//     mul-int/lit16 v1, v1, 0x3e8
a=0;// 
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-wide v9, v1
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 276
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Reference,Lcom/tencent/feedback/proguard/o;);v3=(Reference,Ljava/lang/String;);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/lang/String;);v14=(Reference,Ljava/util/List;);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/common/a;->g(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     if-nez v15, :cond_3
a=0;// 
a=0;//     const-string v1, "rqdp{  apkid get error!return false}"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v16, "rqdp{  local apk record is outday,should remove} %s"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v0, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     const-string v1, "null"
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v17, v18
a=0;// 
a=0;//     invoke-static/range {v16 .. v17}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v14}, Lcom/tencent/feedback/proguard/l;->d(Landroid/content/Context;Ljava/util/List;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "rqdp{  deleted old apkids} %d"
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     new-array v14, v14, [Ljava/lang/Object;
a=0;// 
a=0;//     #v14=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v14, v16
a=0;// 
a=0;//     invoke-static {v2, v14}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Lcom/tencent/feedback/proguard/o;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/proguard/o;);
a=0;//     invoke-direct {v2}, Lcom/tencent/feedback/proguard/o;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/proguard/o;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v2, v14}, Lcom/tencent/feedback/proguard/o;->a(I)V
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/tencent/feedback/proguard/o;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v15}, Lcom/tencent/feedback/proguard/o;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Lcom/tencent/feedback/proguard/o;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/tencent/feedback/proguard/o;->b(J)V
a=0;// 
a=0;//     invoke-virtual {v2, v6, v7}, Lcom/tencent/feedback/proguard/o;->c(J)V
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/tencent/feedback/proguard/l;->c(Landroid/content/Context;Ljava/util/List;)I
a=0;// 
a=0;//     const-string v1, "rqdp{  insert new app record:} %s "
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
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v3, v4
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v15}, Lcom/tencent/feedback/proguard/w;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(LongLo);v14=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/o;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 287
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v3=(Conflicted);v4=(Null);v5=(Reference,Ljava/lang/Boolean;);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     const-string v2, "rqdp{ use user uuid}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 305
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v5=(LongLo);v6=(LongHi);v7=(Byte);v8=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v13
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 319
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v4=(Reference,[Ljava/lang/Object;);v5=(Reference,Ljava/lang/Boolean;);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/u;->a()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 320
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_8
a=0;// 
a=0;//     .line 322
a=0;//     const-string v3, "rqdp{  sleep %d}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 323
a=0;//     :try_start_1
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 330
a=0;//     :cond_8
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v14=(Conflicted);
a=0;//     monitor-enter v13
a=0;// 
a=0;//     .line 332
a=0;//     :try_start_2
a=0;//     const-string v1, "rqdp{  stepStartQuery}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 334
a=0;//     invoke-virtual {v13}, Lcom/tencent/feedback/proguard/t;->d()[Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 335
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v13, v1}, Lcom/tencent/feedback/proguard/t;->a(I)V
a=0;// 
a=0;//     .line 336
a=0;//     monitor-exit v13
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 338
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 340
a=0;//     const-string v1, "rqdp{  notify listener query start}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 341
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_9
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     .line 343
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v4}, Lcom/tencent/feedback/proguard/s;->d()V
a=0;// 
a=0;//     .line 341
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 323
a=0;//     :catch_0
a=0;//     #v1=(LongLo);v2=(LongHi);v3=(Reference,Ljava/lang/String;);v4=(Reference,[Ljava/lang/Object;);v5=(Null);v6=(Reference,Ljava/lang/Long;);v7=(LongHi);v8=(Reference,Ljava/lang/String;);v14=(Reference,Ljava/util/List;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 336
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v13
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 347
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Reference,[Lcom/tencent/feedback/proguard/s;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v11, v12, v9, v10}, Lcom/tencent/feedback/proguard/u;->a(JJ)V
a=0;// 
a=0;//     .line 349
a=0;//     const-string v1, "rqdp{  common query end!}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 350
a=0;//     monitor-enter v13
a=0;// 
a=0;//     .line 353
a=0;//     :try_start_3
a=0;//     invoke-virtual {v13}, Lcom/tencent/feedback/proguard/t;->d()[Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 354
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v13, v1}, Lcom/tencent/feedback/proguard/t;->a(I)V
a=0;// 
a=0;//     .line 355
a=0;//     monitor-exit v13
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 357
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     .line 359
a=0;//     const-string v1, "rqdp{  notify listener query end}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 360
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_a
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     .line 362
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v4}, Lcom/tencent/feedback/proguard/s;->e()V
a=0;// 
a=0;//     .line 360
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 355
a=0;//     :catchall_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v13
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 366
a=0;//     :cond_a
a=0;//     #v1=(Integer);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v9, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_b
a=0;// 
a=0;//     const-string v1, "periodLimit %d return"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 368
a=0;//     :goto_9
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 366
a=0;//     :cond_b
a=0;//     #v1=(Byte);v2=(LongHi);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmp-long v1, v9, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_c
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/b;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v1, v0, v9, v10}, Lcom/tencent/feedback/common/b;->a(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     const-string v1, "rqdp{  next time} %d"
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
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/feedback/proguard/u;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/proguard/t;->a(I)V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Byte);v2=(LongHi);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v1, "rqdp{  stop loop query}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Null);v2=(Integer);v3=(Reference,Ljava/lang/String;);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/lang/String;);v14=(Reference,Ljava/util/List;);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
}}
