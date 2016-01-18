package com.kingroot.kinguser; class ek { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ek;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile fr:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private fs:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private ft:Landroid/app/Notification;
a=0;// 
a=0;// .field private fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;// .field fv:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ek;->fr:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     .line 64
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 382
a=0;//     new-instance v0, Lcom/kingroot/kinguser/el;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/el;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/el;-><init>(Lcom/kingroot/kinguser/ek;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/el;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->fv:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 67
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private C(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 367
a=0;//     new-instance v0, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 379
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/text/SpannableStringBuilder;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 370
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 372
a=0;//     #v0=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a002f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 373
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 374
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 375
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     const/high16 v4, -0x10000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     const/16 v4, 0x21
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v3, v1, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ek;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/ek;->b(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 293
a=0;//     .line 294
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 299
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 300
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 301
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v3, :cond_3
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     .line 303
a=0;//     #v4=(Null);
a=0;//     const-string v5, "contentView="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     const-string v5, "contentView=null"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 304
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 301
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 308
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 313
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(ILjava/lang/String;)Landroid/app/PendingIntent;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, p2, p1}, Lcom/kingroot/kinguser/activitys/KuInstallNotifyActivity;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v2, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 159
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static bd()Lcom/kingroot/kinguser/ek;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ek;->fr:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     const-class v1, Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 74
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ek;->fr:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ek;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ek;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ek;->fr:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ek;->fr:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 77
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
a=0;// 
a=0;// .method private bj()Landroid/widget/RemoteViews;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     .line 424
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lE()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lF()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 425
a=0;//     :cond_0
a=0;//     new-instance v0, Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RemoteViews;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f03001d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 432
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/RemoteViews;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 428
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RemoteViews;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f03001c
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RemoteViews;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e(Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     new-instance v0, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 414
a=0;//     #v0=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     new-instance v1, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-direct {v1, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x21
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 416
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/high16 v10, -0x1000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const v8, 0x7f09007a
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 92
a=0;//     #v3=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 94
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 95
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ek;->bj()Landroid/widget/RemoteViews;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 99
a=0;//     #v4=(Reference,Landroid/widget/RemoteViews;);
a=0;//     if-eqz p4, :cond_5
a=0;// 
a=0;//     .line 100
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a001c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 104
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v2, v0}, Lcom/kingroot/kinguser/ek;->b(ILjava/lang/String;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     :goto_1
a=0;//     new-instance v5, Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const v6, 0x7f020021
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v7, 0x7f0a0025
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v5}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 122
a=0;//     sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x10
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-le v6, v7, :cond_6
a=0;// 
a=0;//     .line 123
a=0;//     iput-object v4, v5, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     const v6, 0x7f090077
a=0;// 
a=0;//     const v7, 0x7f020021
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v6, v7}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
a=0;// 
a=0;//     .line 129
a=0;//     const v6, 0x7f090078
a=0;// 
a=0;//     invoke-virtual {v4, v6, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 130
a=0;//     const v6, 0x7f090079
a=0;// 
a=0;//     invoke-direct {p0, p3}, Lcom/kingroot/kinguser/ek;->C(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-virtual {v4, v6, v7}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v4, v8, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lE()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lF()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 134
a=0;//     :cond_2
a=0;//     invoke-direct {p0, v1, v10}, Lcom/kingroot/kinguser/ek;->e(Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4, v8, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lF()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 136
a=0;//     const v1, 0x7f090078
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p2, v10}, Lcom/kingroot/kinguser/ek;->e(Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-virtual {v4, v1, v6}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 140
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v4, v8, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 141
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v6, 0xb
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ge v1, v6, :cond_4
a=0;// 
a=0;//     .line 142
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v4, v8, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
a=0;// 
a=0;//     .line 143
a=0;//     iput-object v0, v5, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 146
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v0, v3, v5}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 147
a=0;//     if-eqz p4, :cond_7
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v3, v0, v9, v9, v9}, Lcom/kingroot/kinguser/st;->a(IIIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a001a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 108
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-direct {p0, v3, v0}, Lcom/kingroot/kinguser/ek;->b(ILjava/lang/String;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_6
a=0;//     #v5=(Reference,Landroid/app/Notification;);v6=(Integer);v7=(PosByte);
a=0;//     sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     if-gt v6, v7, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     iput-object v4, v5, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Integer);v6=(PosByte);v7=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 147
a=0;//     #v0=(One);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;IIZ)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const v5, 0x7f020021
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0, v4}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 166
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a0025
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 171
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {v1, v3, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 179
a=0;//     new-instance v0, Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RemoteViews;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f03001e
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RemoteViews;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     const v1, 0x7f090077
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     const v1, 0x7f090078
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RemoteViews;);
a=0;//     iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 186
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     const v1, 0x7f09007c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p2, p3, p4}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     invoke-virtual {v0, v4, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public be()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bf()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 202
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 203
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 204
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     .line 205
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bg()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 237
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bh()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bR()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fv:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bi()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 363
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public w(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RemoteViews;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fu:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     const v1, 0x7f09007c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, p1, v3}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ek;->ft:Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public x(I)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const v5, 0x7f0a00ba
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     .line 211
a=0;//     #v4=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0, v4}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 213
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 214
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "main_pahe_state"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v3, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v1, Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f020021
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v2, v5}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v4, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public y(I)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const v4, 0x7f020021
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v10, 0x9
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const v8, 0x7f09007a
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 317
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0, v10}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 319
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ek;->bj()Landroid/widget/RemoteViews;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 320
a=0;//     new-instance v1, Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a00a3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 330
a=0;//     const v2, 0x7f090077
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, v4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
a=0;// 
a=0;//     .line 331
a=0;//     const v2, 0x7f090078
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f0a00a4
a=0;// 
a=0;//     new-array v5, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v7
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/kingroot/kinguser/vc;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 332
a=0;//     const v2, 0x7f090079
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f0a00a6
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 333
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a00a7
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v8, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 335
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lE()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lF()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 336
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a00a7
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     invoke-direct {p0, v2, v3}, Lcom/kingroot/kinguser/ek;->e(Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v8, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 338
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lF()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 339
a=0;//     const v2, 0x7f090078
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f0a00a5
a=0;// 
a=0;//     new-array v5, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v5, v7
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/kingroot/kinguser/vc;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 343
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-class v4, Lcom/kingroot/kinguser/view/KmUpdateWithNotifyActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 346
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ek;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3, v7, v2, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {v0, v8, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 349
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     .line 350
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v8, v3}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
a=0;// 
a=0;//     .line 351
a=0;//     iput-object v2, v1, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 353
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     iput-object v0, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ek;->fs:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v0, v10, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 356
a=0;//     return-void
a=0;// .end method
}}
