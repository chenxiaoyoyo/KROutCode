package com.kingroot.RushRoot; class bt { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/bt;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private volatile b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;// .field private final c:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/bt;->a:Ljava/util/List;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/bt;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     .line 22
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bt;->c:Ljava/lang/Object;
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/bt;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bt;->c:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/bt;)Lcom/kingroot/RushRoot/bw;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bw;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/bt;)Lcom/kingroot/RushRoot/bw;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/bt;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 90
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/bw;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/bt;->c:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/bw;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bu;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/bu;-><init>(Lcom/kingroot/RushRoot/bt;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bu;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     const-string v3, "SingleThread"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/RushRoot/bw;->setName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/RushRoot/bw;->setPriority(I)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/RushRoot/bw;->setDaemon(Z)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/bt;->b:Lcom/kingroot/RushRoot/bw;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/bw;->start()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     return v0
a=0;// 
a=0;//     .line 127
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/bt;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/bt;->run()V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
}}
