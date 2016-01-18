package com.kingroot.kinguser; class fj { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/fj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final fX:Ljava/lang/String;
a=0;// 
a=0;// .field private static volatile fY:Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v1, "6B752E636F6E66"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/wd;->cj(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fj;->fX:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fj;->fY:Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fj;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bZ()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fj;->fX:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fj;->fY:Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fl;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     const-class v1, Lcom/kingroot/kinguser/fj;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 42
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fj;->fY:Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/fl;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/fl;-><init>(Lcom/kingroot/kinguser/fk;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fl;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fj;->fY:Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fj;->fY:Lcom/kingroot/kinguser/fl;
a=0;// 
a=0;//     invoke-static {v0, p0}, Lcom/kingroot/kinguser/fl;->a(Lcom/kingroot/kinguser/fl;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 45
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
