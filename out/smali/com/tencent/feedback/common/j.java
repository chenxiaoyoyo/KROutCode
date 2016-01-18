package com.tencent.feedback.common; class j { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/common/j;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/proguard/s;
a=0;// .implements Lcom/tencent/feedback/proguard/x;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Z
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private g:Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;// .field private h:Lcom/tencent/feedback/upload/e;
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;IIILcom/tencent/feedback/upload/f;Lcom/tencent/feedback/upload/e;Lcom/tencent/feedback/upload/UploadHandleListener;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x12e
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     .line 68
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/j;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/feedback/common/j;->i:I
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "unknown"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, v1}, Lcom/tencent/feedback/common/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput v2, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     .line 82
a=0;//     const/16 v0, 0xca
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/tencent/feedback/common/j;->c:I
a=0;// 
a=0;//     .line 83
a=0;//     iput v3, p0, Lcom/tencent/feedback/common/j;->d:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p6, p0, Lcom/tencent/feedback/common/j;->g:Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p7, p0, Lcom/tencent/feedback/common/j;->h:Lcom/tencent/feedback/upload/e;
a=0;// 
a=0;//     .line 86
a=0;//     if-eqz p6, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     invoke-interface {p6, v3, p7}, Lcom/tencent/feedback/upload/f;->a(ILcom/tencent/feedback/upload/e;)Z
a=0;// 
a=0;//     .line 91
a=0;//     invoke-interface {p6, p8}, Lcom/tencent/feedback/upload/f;->a(Lcom/tencent/feedback/upload/UploadHandleListener;)Z
a=0;// 
a=0;//     .line 93
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/feedback/proguard/t;->a(Lcom/tencent/feedback/proguard/s;)V
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/feedback/proguard/t;->a(Lcom/tencent/feedback/proguard/x;)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v0, v2, p6}, Lcom/tencent/feedback/proguard/t;->a(ILcom/tencent/feedback/upload/f;)V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-string v0, "10000"
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     invoke-virtual {v0, p2}, Lcom/tencent/feedback/common/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput p1, p0, Lcom/tencent/feedback/common/j;->i:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 510
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 509
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized c(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/feedback/common/j;->f:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 155
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 154
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized k()Lcom/tencent/feedback/upload/e;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/j;->h:Lcom/tencent/feedback/upload/e;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/e;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized l()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/tencent/feedback/common/j;->i:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/tencent/feedback/proguard/w;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     #v2=(Null);
a=0;//     const-string v0, "rqdp{  com strateyg changed }%s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 462
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 464
a=0;//     iget v0, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Lcom/tencent/feedback/proguard/w;->e(I)Lcom/tencent/feedback/proguard/w$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 465
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/w$a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 467
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/w$a;->c()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/w$a;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 468
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eq v3, v0, :cond_0
a=0;// 
a=0;//     .line 470
a=0;//     const-string v3, "rqdp{  module} %d rqdp{  able changed }%b"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget v5, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v2, v4, v1
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->f(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 471
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/feedback/common/j;->b(Z)V
a=0;// 
a=0;//     .line 476
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Null);v3=(Boolean);v5=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 467
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 108
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/tencent/feedback/proguard/w;->e(I)Lcom/tencent/feedback/proguard/w$a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 111
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/w$a;->b()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eq v3, p1, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     const-string v3, "rqdp{  mid:}%d rqdp{  change user switch} %b"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget v5, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v0
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v2, p1}, Lcom/tencent/feedback/proguard/w$a;->a(Z)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/w$a;->b()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/feedback/proguard/w$a;->c()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/feedback/common/j;->b(Z)V
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Null);v3=(Boolean);v4=(Reference,[Ljava/lang/Object;);v5=(Reference,Ljava/lang/Boolean;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/common/j;->e:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-boolean p1, p0, Lcom/tencent/feedback/common/j;->e:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 140
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/common/j;->f:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized c()Lcom/tencent/feedback/upload/f;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/j;->g:Lcom/tencent/feedback/upload/f;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     const-string v0, "rqdp{  com query start }%s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 265
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/j;->l()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/feedback/common/j;->a(I)V
a=0;// 
a=0;//     .line 266
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public e()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 271
a=0;//     #v2=(Null);
a=0;//     const-string v0, "rqdp{  com query end }%s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 273
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 275
a=0;//     const-string v0, "rqdp{  step after query}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/feedback/common/j;->c(Z)V
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 281
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 336
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 286
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/w;);v1=(One);v3=(Reference,[Ljava/lang/Object;);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget v3, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/feedback/proguard/w;->e(I)Lcom/tencent/feedback/proguard/w$a;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 288
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     .line 290
a=0;//     const-string v3, "rqdp{  isable}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v5}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v4}, Lcom/tencent/feedback/proguard/w$a;->d()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/w;->k()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     .line 293
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v5, "rqdp{  needDetail} %b rqdp{  allQ:}%b rqdp{  result:}%b"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4}, Lcom/tencent/feedback/proguard/w$a;->d()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v6, v7
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/w;->k()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v0, v6, v4
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v6, v0
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->g()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 296
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 298
a=0;//     const-string v0, "rqdp{  asyn up module} %d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget v5, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 300
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Lcom/tencent/feedback/common/j$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/feedback/common/j$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/tencent/feedback/common/j$1;-><init>(Lcom/tencent/feedback/common/j;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/common/j$1;);
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/feedback/common/b;->a(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 333
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 334
a=0;//     const-string v3, "rqdp{  common query end error} %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v1, v2
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 292
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v1=(One);v3=(Boolean);v4=(Reference,Lcom/tencent/feedback/proguard/w$a;);v5=(Boolean);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->i()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget v5, p0, Lcom/tencent/feedback/common/j;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v3, v5}, Lcom/tencent/feedback/proguard/a;->a(Landroid/content/Context;I)Lcom/tencent/feedback/proguard/z;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/common/j;->k()Lcom/tencent/feedback/upload/e;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/feedback/upload/e;);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     const-string v3, "rqdp{  imposiable eup reshandler not ready}"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v5}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Reference,Lcom/tencent/feedback/proguard/z;);v5=(Reference,Lcom/tencent/feedback/upload/e;);v6=(Uninit);v7=(Uninit);
a=0;//     iget v6, p0, Lcom/tencent/feedback/common/j;->d:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/z;->c()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-interface {v5, v6, v3, v7}, Lcom/tencent/feedback/upload/e;->a(I[BZ)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->i()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v3=(Boolean);v5=(Reference,Ljava/lang/String;);v6=(Reference,[Ljava/lang/Object;);v7=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 294
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 310
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     const-string v0, "rqdp{  asyn query module }%d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget v5, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 315
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/b;->b()Lcom/tencent/feedback/common/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Lcom/tencent/feedback/common/j$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/feedback/common/j$2;);
a=0;//     invoke-direct {v3, p0}, Lcom/tencent/feedback/common/j$2;-><init>(Lcom/tencent/feedback/common/j;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/common/j$2;);
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/feedback/common/b;->a(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 328
a=0;//     :cond_9
a=0;//     #v3=(Boolean);v4=(Reference,Lcom/tencent/feedback/proguard/w$a;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "rqdp{  disable}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public f()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     const-string v0, "rqdp{  app first start} %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->h(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 342
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public g()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 395
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 396
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public h()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 406
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 408
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public i()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final j()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 424
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 434
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 427
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/feedback/common/j;->c()Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 428
a=0;//     #v1=(Reference,Lcom/tencent/feedback/upload/f;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 430
a=0;//     new-instance v0, Lcom/tencent/feedback/upload/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/upload/a;);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/common/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget v3, p0, Lcom/tencent/feedback/common/j;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/tencent/feedback/common/j;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v0, v2, v3, v4}, Lcom/tencent/feedback/upload/a;-><init>(Landroid/content/Context;II)V
a=0;// 
a=0;//     .line 431
a=0;//     #v0=(Reference,Lcom/tencent/feedback/upload/a;);
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/feedback/upload/f;->a(Lcom/tencent/feedback/upload/AbstractUploadDatas;)V
a=0;// 
a=0;//     .line 432
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
