package com.kingroot.kinguser; class gq { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/gq;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/gq;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static Y(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/gq;->d(Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/gn;->cQ()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/gn;->a(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_1
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gq;->cP()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 91
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/wo;);v2=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wo;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Run Root Cmd Exception"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/wo;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gq;->cX()Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/wm;->b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 88
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v1=(Reference,Lcom/kingroot/kinguser/wo;);v5=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gq;->b(Ljava/lang/Exception;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :catch_1
a=0;//     #v1=(Null);v2=(Boolean);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/lang/Exception;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     instance-of v0, p0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p0, Ljava/lang/InterruptedException;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gq;->cP()V
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static cP()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 35
a=0;//     const-class v1, Lcom/kingroot/kinguser/gq;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 36
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static cX()Lcom/kingroot/kinguser/wm;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wm;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 24
a=0;//     const-class v1, Lcom/kingroot/kinguser/gq;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 25
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     const-string v0, "sh"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gr;->ac(Ljava/lang/String;)Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     .line 28
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 30
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/gq;->hb:Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 28
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;Z)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-wide/32 v0, 0x1d4c0
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-direct {v2, p0, p0, v0, v1}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/gq;->b(Lcom/kingroot/kinguser/wp;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
}}
