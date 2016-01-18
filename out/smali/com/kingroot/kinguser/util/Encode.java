package com.kingroot.kinguser.util; class Encode { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/util/Encode;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static tT:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/util/Encode;->tT:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;[B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/util/Encode;->tT:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/util/Encode;->kQ()V
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/util/Encode;->x(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;[B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/util/Encode;->tT:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/util/Encode;->kQ()V
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/util/Encode;->y(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized kQ()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const-class v1, Lcom/kingroot/kinguser/util/Encode;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->lM()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const v0, 0x7f050002
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/ft;->gh:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/kinguser/vj;->s(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     sput-boolean v2, Lcom/kingroot/kinguser/util/Encode;->tT:Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 73
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     const v0, 0x7f050001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 69
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/ft;->gh:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/kinguser/vj;->s(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/util/Encode;->tT:Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 70
a=0;//     :catch_1
a=0;//     #v0=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 64
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static native x(Landroid/content/Context;[B)[B
a=0;// .end method
a=0;// 
a=0;// .method public static native y(Landroid/content/Context;[B)[B
a=0;// .end method
}}
