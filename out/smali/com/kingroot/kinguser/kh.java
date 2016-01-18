package com.kingroot.kinguser; class kh { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/kh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile kO:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private kP:Ljava/util/HashMap;
a=0;// 
a=0;// .field private kQ:Ljava/util/HashMap;
a=0;// 
a=0;// .field private kR:Ljava/util/HashMap;
a=0;// 
a=0;// .field private kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;// .field private final kT:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kh;->kP:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kh;->kQ:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kh;->kR:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kj;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/kj;-><init>(Lcom/kingroot/kinguser/kh;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kh;->kT:Ljava/lang/Object;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static hc()Lcom/kingroot/kinguser/kh;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kh;->kO:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     const-class v1, Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 56
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kh;->kO:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kh;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/kh;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/kh;->kO:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/kh;->kO:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 59
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
a=0;// .method public a(Ljava/lang/String;Lcom/kingroot/kinguser/ki;)Lcom/kingroot/kinguser/ki;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kh;->kT:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 181
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kQ:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ki;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 182
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
a=0;// .method public declared-synchronized a(Ljava/lang/String;Lcom/kingroot/kinguser/kl;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kR:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 95
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 97
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 98
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/kingroot/kinguser/kl;
a=0;// 
a=0;//     .line 101
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 94
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);v2=(Reference,Lcom/kingroot/kinguser/kl;);v3=(Null);v4=(Reference,Ljava/util/ArrayList;);v5=(Reference,Ljava/util/Iterator;);
a=0;//     if-ne v2, p2, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 111
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     invoke-interface {v0, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 113
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 122
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kP:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kh;->kR:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Null);v4=(Reference,Ljava/util/ArrayList;);v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized aY(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kP:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized aZ(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kP:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b(Ljava/lang/String;Lcom/kingroot/kinguser/kl;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kR:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 157
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 159
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/kingroot/kinguser/kl;
a=0;// 
a=0;//     .line 162
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);v2=(Reference,Lcom/kingroot/kinguser/kl;);v3=(Reference,Ljava/util/ArrayList;);v4=(Reference,Ljava/util/Iterator;);
a=0;//     if-ne v2, p2, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_1
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 173
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 175
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ba(Ljava/lang/String;)Lcom/kingroot/kinguser/ki;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kh;->kT:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 194
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kQ:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ki;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 195
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
a=0;// .method public bb(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/kj;->be(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/kh;->bc(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bc(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/kj;->bd(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/kj;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     const-string v1, "DataCacheCenter"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/kj;->ch(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kR:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 67
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/kingroot/kinguser/kl;
a=0;// 
a=0;//     .line 72
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);v2=(Reference,Lcom/kingroot/kinguser/kl;);v3=(Reference,Ljava/util/ArrayList;);v4=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2, p2}, Lcom/kingroot/kinguser/kl;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 82
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kP:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hd()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/kh;->kQ:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/kj;->a(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/kj;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kh;->kS:Lcom/kingroot/kinguser/kj;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     const-string v1, "DataCacheCenter"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/kj;->ch(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public he()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 301
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ada;->cn(I)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 303
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     .line 304
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adb;->nc()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 305
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 307
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 309
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public hf()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ada;->cn(I)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 319
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     .line 320
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adb;->nc()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 321
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 325
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
