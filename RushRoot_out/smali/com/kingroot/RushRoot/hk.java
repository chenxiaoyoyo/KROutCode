package com.kingroot.RushRoot; class hk { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/hk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/RushRoot/hs;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 11
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hk;);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/hk;->a:Z
a=0;// 
a=0;//     .line 15
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/hk;->b:Z
a=0;// 
a=0;//     .line 11
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/hk;->b:Z
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
a=0;// .method public abstract a(Lcom/kingroot/RushRoot/jc;)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract b(Lcom/kingroot/RushRoot/jc;)Z
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized c(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 26
a=0;//     #v1=(One);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/RushRoot/hk;->a(Lcom/kingroot/RushRoot/jc;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/hk;->b:Z
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/hk;->a:Z
a=0;// 
a=0;//     .line 29
a=0;//     iget-boolean v2, p0, Lcom/kingroot/RushRoot/hk;->b:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 26
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 26
a=0;//     :catchall_0
a=0;//     #v0=(Null);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized d(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/hk;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/RushRoot/hk;->c(Lcom/kingroot/RushRoot/jc;)Z
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/hk;->b:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/RushRoot/hk;->b(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
