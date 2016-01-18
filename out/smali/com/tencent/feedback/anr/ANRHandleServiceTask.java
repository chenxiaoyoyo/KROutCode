package com.tencent.feedback.anr; class ANRHandleServiceTask { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/anr/ANRHandleServiceTask;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// .implements Lcom/tencent/feedback/common/service/RQDServiceTask;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;// .field protected static final PROCESS_ERROR_STATE_WAITING_PERIOD:J = 0x1f4L
a=0;// 
a=0;// .field protected static final PROCESS_ERROR_STATE_WAITING_TIMEOUT:J = 0x2710L
a=0;// 
a=0;// .field protected static final PROCESS_KILL_WAITING_TIMEOUT:J = 0x2710L
a=0;// 
a=0;// .field protected static final TRACE_FILE_DIR:Ljava/lang/String; = "/data/anr/"
a=0;// 
a=0;// .field protected static final TRACE_FILE_PATH:Ljava/lang/String; = "/data/anr/traces.txt"
a=0;// 
a=0;// .field public static isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field public static lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final isUseMerge:Z
a=0;// 
a=0;// .field private final pluginList:Ljava/util/Map;
a=0;// 
a=0;// .field private final serverTimeGap:J
a=0;// 
a=0;// .field private final userId:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/anr/ANRHandleServiceTask$1;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/ANRHandleServiceTask$1;);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Lcom/tencent/feedback/anr/ANRHandleServiceTask;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isUseMerge:Z
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->userId:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->serverTimeGap:J
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 77
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v2, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     .line 80
a=0;//     :goto_1
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v2, Lcom/tencent/feedback/common/PlugInInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/common/PlugInInfo;);
a=0;//     invoke-direct {v2, p1}, Lcom/tencent/feedback/common/PlugInInfo;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 83
a=0;//     #v2=(Reference,Lcom/tencent/feedback/common/PlugInInfo;);
a=0;//     iget-object v3, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     iget-object v4, v2, Lcom/tencent/feedback/common/PlugInInfo;->plugInId:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 80
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 73
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(ZLjava/lang/String;JLjava/util/Map;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/tencent/feedback/anr/ANRHandleServiceTask;);
a=0;//     iput-boolean p1, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isUseMerge:Z
a=0;// 
a=0;//     .line 66
a=0;//     iput-object p2, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->userId:Ljava/lang/String;
a=0;// 
a=0;//     .line 67
a=0;//     iput-wide p3, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->serverTimeGap:J
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p5, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPluginList()Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRunningProcessSameUid()Landroid/util/SparseArray;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     invoke-static {}, Landroid/os/Process;->myUid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/a;->a(I)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getServerTimeGap()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     iget-wide v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->serverTimeGap:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getTaskId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     const/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTaskName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     const-string v0, "2000"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUploadThreadsDump(Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 351
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 357
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 362
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 364
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v0, "held by tid=\\d+"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 365
a=0;//     #v5=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 368
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/String;
a=0;// 
a=0;//     aget-object v1, v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v3, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 370
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/String;
a=0;// 
a=0;//     aget-object v1, v1, v10
a=0;// 
a=0;//     .line 372
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 373
a=0;//     #v1=(Reference,Ljava/util/regex/Matcher;);
a=0;//     invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 376
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     aget-object v0, v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 377
a=0;//     invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 378
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 379
a=0;//     invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/regex/Matcher;);
a=0;//     const-string v1, "main"
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 385
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     aget-object v0, v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 390
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 392
a=0;//     #v5=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_1
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 394
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 395
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 396
a=0;//     invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, [Ljava/lang/String;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v7, v2, v7
a=0;// 
a=0;//     .line 397
a=0;//     invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, [Ljava/lang/String;
a=0;// 
a=0;//     aget-object v2, v2, v10
a=0;// 
a=0;//     .line 398
a=0;//     #v2=(Null);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\""
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v8, "\" tid="
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " :\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 401
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 404
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(PosByte);v9=(Uninit);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public getUserId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->userId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public handleANRInfo(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 340
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 333
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/feedback/anr/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/anr/a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/anr/a;-><init>()V
a=0;// 
a=0;//     .line 334
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/a;);
a=0;//     invoke-virtual {v0, p3}, Lcom/tencent/feedback/anr/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {v0, p5, p6}, Lcom/tencent/feedback/anr/a;->a(J)V
a=0;// 
a=0;//     .line 337
a=0;//     if-nez p4, :cond_2
a=0;// 
a=0;//     const-string p4, "unvisiable ANR"
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v0, p4}, Lcom/tencent/feedback/anr/a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 339
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->handleANRInfo(Landroid/content/Context;Lcom/tencent/feedback/anr/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public handleANRInfo(Landroid/content/Context;Lcom/tencent/feedback/anr/a;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 415
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 420
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p2}, Lcom/tencent/feedback/anr/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "/data/anr/traces.txt"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 421
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 423
a=0;//     iget-object v0, v0, Lcom/tencent/feedback/anr/e;->d:Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->getUploadThreadsDump(Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 424
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const-string v0, "dump traces fail!"
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {p2, v0}, Lcom/tencent/feedback/anr/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 426
a=0;//     :cond_5
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->recordANR(Landroid/content/Context;Lcom/tencent/feedback/anr/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 420
a=0;//     :cond_6
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/anr/e;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/anr/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     new-instance v3, Lcom/tencent/feedback/anr/c;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/feedback/anr/c;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v3, v0, v4}, Lcom/tencent/feedback/anr/c;-><init>(Lcom/tencent/feedback/anr/e;Z)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/anr/c;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/anr/a;->a(Ljava/lang/String;Lcom/tencent/feedback/anr/f;)V
a=0;// 
a=0;//     iget-wide v2, v0, Lcom/tencent/feedback/anr/e;->a:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_7
a=0;// 
a=0;//     iget-wide v2, v0, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_7
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isUseMerge()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isUseMerge:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public readTraceDumpInfo()Lcom/tencent/feedback/anr/e;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 264
a=0;//     #v0=(Null);
a=0;//     const-string v2, "/data/anr/traces.txt"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v1, "path:%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/e;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(LongLo);
a=0;//     new-instance v1, Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/anr/e;);
a=0;//     invoke-direct {v1}, Lcom/tencent/feedback/anr/e;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     new-instance v3, Lcom/tencent/feedback/anr/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/feedback/anr/d;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v3, v1, v4}, Lcom/tencent/feedback/anr/d;-><init>(Lcom/tencent/feedback/anr/e;Z)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/anr/d;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/anr/a;->a(Ljava/lang/String;Lcom/tencent/feedback/anr/f;)V
a=0;// 
a=0;//     iget-wide v2, v1, Lcom/tencent/feedback/anr/e;->a:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     iget-wide v2, v1, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, v1, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Conflicted);
a=0;//     const-string v2, "first dump error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v4, v1, Lcom/tencent/feedback/anr/e;->a:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-wide v4, v1, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v1, v1, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public recordANR(Landroid/content/Context;Lcom/tencent/feedback/anr/a;)V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     new-instance v16, Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     #v16=(UninitRef,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     invoke-direct/range {v16 .. v16}, Lcom/tencent/feedback/eup/CrashStrategyBean;-><init>()V
a=0;// 
a=0;//     .line 438
a=0;//     #v16=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/ANRHandleServiceTask;);
a=0;//     iget-boolean v1, v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isUseMerge:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/eup/CrashStrategyBean;->setMerged(Z)V
a=0;// 
a=0;//     .line 439
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->userId:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v3, v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->serverTimeGap:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Map;);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/anr/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "main"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "ANR_RQD_EXCEPTION"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/anr/a;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/anr/a;->b()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/tencent/feedback/anr/a;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static/range {v1 .. v15}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;[B)Lcom/tencent/feedback/eup/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 440
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/feedback/eup/d;->e(Z)V
a=0;// 
a=0;//     .line 441
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/feedback/eup/b;->a(Landroid/content/Context;)Lcom/tencent/feedback/eup/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/eup/b;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Lcom/tencent/feedback/eup/b;->a(Lcom/tencent/feedback/eup/d;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 442
a=0;//     #v2=(Boolean);
a=0;//     const-string v3, "sha1:%s %d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/eup/d;->t()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
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
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 443
a=0;//     const-string v1, "handle anr %b"
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
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v2, v3, v4
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 444
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public runInService(Lcom/tencent/feedback/common/service/RQDService;Landroid/content/Intent;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     #v7=(Null);
a=0;//     invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->getCrashRuntimeStrategy()Lcom/tencent/feedback/eup/CrashStrategyBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/eup/CrashStrategyBean;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     const-string v0, "rqdp{ init service eup}"
a=0;// 
a=0;//     new-array v1, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {p1}, Lcom/tencent/feedback/common/service/RQDService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v7}, Lcom/tencent/feedback/eup/CrashReport;->initCrashReport(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     const-string v0, "handling task already exist!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 254
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 172
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->getRunningProcessSameUid()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 174
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     .line 176
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "impossible not pid in same app"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->readTraceDumpInfo()Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 183
a=0;//     const-string v0, "read dump info fail"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     sget-object v2, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iget-wide v2, v2, Lcom/tencent/feedback/anr/e;->a:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, v0, Lcom/tencent/feedback/anr/e;->a:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     iget-object v2, v2, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     iget-wide v2, v2, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, v0, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     .line 190
a=0;//     const-string v0, "same trace file same anr ,has handled! %s %d"
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/anr/e;);
a=0;//     iget-object v3, v3, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     sget-object v3, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iget-wide v3, v3, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sput-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->lastHandledANRFirstDump:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iget-wide v5, v0, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     .line 202
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->waitForANRProcessErrorSate(Landroid/content/Context;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     .line 206
a=0;//     invoke-static {}, Landroid/os/Process;->myUid()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 207
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/feedback/anr/a;
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/anr/a;->c()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v1, v3, :cond_6
a=0;// 
a=0;//     .line 211
a=0;//     const-string v1, "has anr in process %s handle it and leave"
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
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/anr/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/tencent/feedback/anr/a;->a(J)V
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->handleANRInfo(Landroid/content/Context;Lcom/tencent/feedback/anr/a;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 218
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "not my anr ignorl ,leave"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     :try_start_5
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 224
a=0;//     :goto_1
a=0;//     :try_start_6
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->getRunningProcessSameUid()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 226
a=0;//     #v3=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_a
a=0;// 
a=0;//     .line 228
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "impossible not pid in same app"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     :catch_0
a=0;//     #v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 245
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 247
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "task throw upload by catch"
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
a=0;//     .line 248
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v0, v2, v3}, Lcom/tencent/feedback/eup/CrashReport;->handleCatchException(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[B)Z
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v2=(LongLo);v3=(Reference,Landroid/util/SparseArray;);v5=(LongLo);v6=(LongHi);v8=(Uninit);
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 232
a=0;//     :goto_2
a=0;//     :try_start_9
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_c
a=0;// 
a=0;//     .line 234
a=0;//     invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v4, :cond_b
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 238
a=0;//     const-string v0, "found process been kill pid:%d pn:%s , it should be anr proc ,handle it and leave"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v1, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 239
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->handleANRInfo(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;J)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 232
a=0;//     :cond_b
a=0;//     #v0=(Integer);v4=(Reference,Ljava/lang/Object;);v8=(Uninit);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 253
a=0;//     :cond_c
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isHandling:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public waitForANRProcessErrorSate(Landroid/content/Context;)Ljava/util/List;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     .line 286
a=0;//     #v11=(PosByte);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/ArrayList;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 288
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 292
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     add-int/lit8 v6, v1, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v7, 0x14
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v1, v1, v7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getProcessesInErrorState()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 295
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 297
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 298
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v7=(Reference,Ljava/util/Iterator;);v8=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;
a=0;// 
a=0;//     .line 300
a=0;//     iget v2, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v11, :cond_2
a=0;// 
a=0;//     .line 301
a=0;//     const-string v2, "anr error found in %s \n lMsg:%s\n sMsg:%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v9, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v8, v5
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     iget-object v10, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->longMsg:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     iget-object v9, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->shortMsg:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v8, v11
a=0;// 
a=0;//     invoke-static {v2, v8}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 304
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget v2, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v11, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 305
a=0;//     :goto_3
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 304
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     new-instance v2, Lcom/tencent/feedback/anr/a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/anr/a;);
a=0;//     invoke-direct {v2}, Lcom/tencent/feedback/anr/a;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/anr/a;);
a=0;//     iget-object v8, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Lcom/tencent/feedback/anr/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v8, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->pid:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget-object v8, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->longMsg:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lcom/tencent/feedback/anr/a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v1, v1, Landroid/app/ActivityManager$ProcessErrorStateInfo;->uid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/feedback/anr/a;->a(I)V
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/anr/a;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 308
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 309
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v3=(Null);v4=(Conflicted);v7=(Conflicted);
a=0;//     const-wide/16 v1, 0x1f4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move v1, v6
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(LongLo);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 314
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->isUseMerge:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->userId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-wide v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->serverTimeGap:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/anr/ANRHandleServiceTask;->pluginList:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Parcelable;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v3}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(LongHi);
a=0;//     invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
