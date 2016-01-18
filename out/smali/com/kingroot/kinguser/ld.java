package com.kingroot.kinguser; class ld { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ld;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic jE:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic mh:Lcom/kingroot/kinguser/lc;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/lc;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ld;->mh:Lcom/kingroot/kinguser/lc;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/ld;->jE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ld;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v7, 0x64
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v6=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zq;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zq;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ld;->jE:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/zq;->Ac:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ld;->mh:Lcom/kingroot/kinguser/lc;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lc;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/lc;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v0, v1}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/zq;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/zi;
a=0;// 
a=0;//     .line 50
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ld;->mh:Lcom/kingroot/kinguser/lc;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/lc;->mg:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/kingroot/kinguser/le;
a=0;// 
a=0;//     .line 52
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-wide v2, v0, Lcom/kingroot/kinguser/zi;->Ad:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, v0, Lcom/kingroot/kinguser/zi;->Af:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     iget-wide v4, v0, Lcom/kingroot/kinguser/zi;->Ae:J
a=0;// 
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     .line 55
a=0;//     cmp-long v4, v2, v7
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     iget-wide v4, v0, Lcom/kingroot/kinguser/zi;->Ad:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     mul-long/2addr v4, v7
a=0;// 
a=0;//     div-long v2, v4, v2
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ld;->jE:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v0, v4, v2}, Lcom/kingroot/kinguser/le;->a(Ljava/lang/String;ZI)V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v2=(LongLo);v3=(LongHi);v4=(Byte);v5=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ld;->jE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0, v6, v6}, Lcom/kingroot/kinguser/le;->a(Ljava/lang/String;ZI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Reference,Landroid/content/Context;);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ld;->mh:Lcom/kingroot/kinguser/lc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lc;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lc;->mg:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/le;
a=0;// 
a=0;//     .line 65
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ld;->jE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, v6, v6}, Lcom/kingroot/kinguser/le;->a(Ljava/lang/String;ZI)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
