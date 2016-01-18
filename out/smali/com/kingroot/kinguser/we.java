package com.kingroot.kinguser; class we { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/we;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static uV:Ljava/lang/Class;
a=0;// 
a=0;// .field private static uW:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private static uX:I
a=0;// 
a=0;// .field private static uY:I
a=0;// 
a=0;// .field private static final uZ:Ljava/lang/Object;
a=0;// 
a=0;// .field private static va:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 14
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/kinguser/we;->uX:I
a=0;// 
a=0;//     .line 15
a=0;//     sput v0, Lcom/kingroot/kinguser/we;->uY:I
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->uZ:Ljava/lang/Object;
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/we;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/we;->lT()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/we;->lU()Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p0, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     instance-of v1, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     check-cast v0, Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 71
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/we;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     move-object p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static lT()Ljava/lang/Class;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uV:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 19
a=0;//     const-class v1, Lcom/kingroot/kinguser/we;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 20
a=0;//     :try_start_0
a=0;//     sget v0, Lcom/kingroot/kinguser/we;->uX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 21
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uV:Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     :try_start_1
a=0;//     const-string v0, "android.os.SystemProperties"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->uV:Ljava/lang/Class;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 27
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     sget v0, Lcom/kingroot/kinguser/we;->uX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     sput v0, Lcom/kingroot/kinguser/we;->uX:I
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uV:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 31
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 24
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static lU()Ljava/lang/reflect/Method;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/we;->lT()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uW:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 44
a=0;//     const-class v1, Lcom/kingroot/kinguser/we;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 45
a=0;//     :try_start_0
a=0;//     sget v0, Lcom/kingroot/kinguser/we;->uY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uW:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_1
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uV:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v2, "get"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->uW:Ljava/lang/reflect/Method;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 52
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget v0, Lcom/kingroot/kinguser/we;->uY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     sput v0, Lcom/kingroot/kinguser/we;->uY:I
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->uW:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 49
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static lV()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 96
a=0;//     sget-object v1, Lcom/kingroot/kinguser/we;->uZ:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     .line 99
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "unknown"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     const-string v0, "ro.build.description"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/we;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/we;->va:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 106
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Object;);
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
