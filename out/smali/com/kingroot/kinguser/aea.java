package com.kingroot.kinguser; class aea { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aea;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static FY:Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static declared-synchronized nj()Lcom/kingroot/kinguser/adu;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     const-class v1, Lcom/kingroot/kinguser/aea;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/aea;->FY:Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adu;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 18
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ady;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ady;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/ady;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ady;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "activity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 25
a=0;//     #v0=(Integer);
a=0;//     const/high16 v3, 0x100000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/2addr v0, v3
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     iput v0, v2, Lcom/kingroot/kinguser/ady;->FN:I
a=0;// 
a=0;//     .line 26
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v2, Lcom/kingroot/kinguser/ady;->FP:I
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adu;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/adu;-><init>(Lcom/kingroot/kinguser/ady;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adu;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/aea;->FY:Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/aea;->FY:Lcom/kingroot/kinguser/adu;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 17
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
a=0;// .method public static declared-synchronized nk()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     const-class v1, Lcom/kingroot/kinguser/aea;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/aea;->FY:Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adu;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     sget-object v0, Lcom/kingroot/kinguser/aea;->FY:Lcom/kingroot/kinguser/adu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adu;->close()V
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/aea;->FY:Lcom/kingroot/kinguser/adu;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adu;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 34
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
