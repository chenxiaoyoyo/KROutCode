package com.kingroot.kinguser; class vi { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/vi;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile um:Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/vi;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static le()Lcom/kingroot/kinguser/vi;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vi;->um:Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vi;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 25
a=0;//     const-class v1, Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 26
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vi;->um:Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/vi;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/vi;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vi;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/vi;->um:Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vi;->um:Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public lf()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.category.HOME"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/high16 v2, 0x10000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/kingroot/kinguser/vb;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 64
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public lg()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "activity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/vi;->lf()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 117
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 120
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
