package com.kingroot.kinguser; class vz { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/vz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile vzRunnable done"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static uO:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private volatile uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;// .field private final uQ:Ljava/lang/Object;
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
a=0;//     sput-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
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
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     .line 22
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vz;->uQ:Ljava/lang/Object;
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/vz;Lcom/kingroot/kinguser/wc;)Lcom/kingroot/kinguser/wc;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/vz;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uQ:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/vz;)Lcom/kingroot/kinguser/wc;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static lQ()Z
a=0;//	   #done lQ==lQRemoveAllUnAliveTd
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 191
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Thread;
a=0;// 
a=0;//     .line 192
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method static synthetic lR()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public C(Ljava/util/List;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v0, v1, p1, v2}, Lcom/kingroot/kinguser/vz;->a(Ljava/lang/String;ILjava/util/List;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/vz;->run()V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;ILjava/util/List;Z)Z
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
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/vz;->uQ:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wa;);
a=0;//     invoke-direct {v0, p0, p3, p4}, Lcom/kingroot/kinguser/wa;-><init>(Lcom/kingroot/kinguser/vz;Ljava/util/List;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wa;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string p1, "SingleThread"
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/wc;->setName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/kingroot/kinguser/wc;->setPriority(I)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/wc;->setDaemon(Z)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wc;->start()V
a=0;// 
a=0;//     .line 122
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     sget-object v0, Lcom/kingroot/kinguser/vz;->uO:Ljava/util/List;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 127
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 129
a=0;//     :cond_3
a=0;//     return v0
a=0;// 
a=0;//     .line 127
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public aA(Z)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v1, v0, v1, p1}, Lcom/kingroot/kinguser/vz;->a(Ljava/lang/String;ILjava/util/List;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ch(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, p1, v0, v1, v2}, Lcom/kingroot/kinguser/vz;->a(Ljava/lang/String;ILjava/util/List;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getThread()Ljava/lang/Thread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isRunning()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 167
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/vz;->uQ:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 169
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/vz;->uP:Lcom/kingroot/kinguser/wc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wc;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 174
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 172
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
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
a=0;// .method public lP()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v2, v0, v2, v1}, Lcom/kingroot/kinguser/vz;->a(Ljava/lang/String;ILjava/util/List;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
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
