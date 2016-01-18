package com.kingroot.kinguser; class vo { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/vo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile mAppContext:Landroid/content/Context;
a=0;// 
a=0;// .field private static volatile ur:Z
a=0;// 
a=0;// .field private static volatile us:Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private ut:Ljava/lang/ref/ReferenceQueue;
a=0;// 
a=0;// .field private uu:Landroid/util/SparseArray;
a=0;// 
a=0;// .field private final uv:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/vo;->ur:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/vo;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vo;->uv:Ljava/lang/Object;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/kingroot/kinguser/vp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/vp;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/vo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, p0, v1, p0}, Lcom/kingroot/kinguser/vp;-><init>(Lcom/kingroot/kinguser/vo;Landroid/content/Context;Lcom/kingroot/kinguser/vo;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vp;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vo;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Ljava/lang/ref/ReferenceQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/ReferenceQueue;);
a=0;//     invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/ReferenceQueue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vo;->ut:Ljava/lang/ref/ReferenceQueue;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vo;->uu:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/vo;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vo;->jp()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static add(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/vo;->c(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/vo;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vo;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/vo;->ur:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vo;->lk()Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/kinguser/vo;->d(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/vo;->uv:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 163
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 164
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vo;->uu:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/vq;
a=0;// 
a=0;//     .line 165
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vo;->uu:Landroid/util/SparseArray;
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/kinguser/vq;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/vq;);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/vo;->ut:Ljava/lang/ref/ReferenceQueue;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/ref/ReferenceQueue;);
a=0;//     invoke-direct {v3, p1, v4, p2}, Lcom/kingroot/kinguser/vq;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vq;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// 
a=0;//     .line 168
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private jp()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     invoke-static {}, Ljava/lang/System;->gc()V
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/vo;->uv:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 179
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vo;->uu:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vo;->uu:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/vq;
a=0;// 
a=0;//     .line 181
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_1
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 189
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vo;->ut:Ljava/lang/ref/ReferenceQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/ReferenceQueue;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/vq;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/vo;->uv:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 193
a=0;//     :try_start_1
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/vo;->uu:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vq;->ll()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/util/SparseArray;->remove(I)V
a=0;// 
a=0;//     .line 194
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 185
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 196
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static lk()Lcom/kingroot/kinguser/vo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vo;->us:Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vo;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     const-class v1, Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 71
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vo;->us:Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vo;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/vo;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/vo;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/vo;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vo;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/vo;->us:Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vo;->us:Lcom/kingroot/kinguser/vo;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 76
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
