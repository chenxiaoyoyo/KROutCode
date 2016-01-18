package com.kingroot.kinguser; class np { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/np;
a=0;// .super Lcom/kingroot/kinguser/nf;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile oL:Lcom/kingroot/kinguser/np;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private oM:Lcom/kingroot/kinguser/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const v0, 0x9d2c
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nf;-><init>(I)V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/np;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/np;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private h(II)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     and-int v0, p1, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private i(II)Ljava/util/List;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/np;->iA()Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 92
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/a;
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/a;->J:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/a;->K:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/wd;->ck(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 96
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/a;->L:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ck(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     if-ne v4, p1, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/kinguser/np;->h(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private iA()Lcom/kingroot/kinguser/b;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/np;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 156
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/np;->oM:Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/np;->im()Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/np;->oM:Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/np;->oM:Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 166
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
a=0;// .method public static iz()Lcom/kingroot/kinguser/np;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     sget-object v0, Lcom/kingroot/kinguser/np;->oL:Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/np;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     const-class v1, Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 65
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/np;->oL:Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/np;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/np;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/np;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/np;->oL:Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/np;->oL:Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 68
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
a=0;// .method public ak(I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/np;->i(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public al(I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/np;->i(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public am(I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/np;->i(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public an(I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/np;->i(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public ao(I)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/np;->i(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected ik()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/np;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 172
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/np;->im()Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/np;->oM:Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     .line 173
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// 
a=0;//     .line 173
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
a=0;// .method protected il()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     return-void
a=0;// .end method
}}
