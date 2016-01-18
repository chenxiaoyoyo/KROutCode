package com.kingroot.kinguser; class kj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/kj;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private kU:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;// .field private kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;// .field private kW:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/kh;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     .line 228
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/kj;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kj;->kU:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kj;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 239
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kj;->kW:Ljava/lang/String;
a=0;// 
a=0;//     .line 231
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/kj;->kU:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     .line 232
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/kj;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kW:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/kj;)Lcom/kingroot/kinguser/kh;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kU:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bd(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public be(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kW:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kU:Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 254
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kk;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/kk;-><init>(Lcom/kingroot/kinguser/kj;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kk;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 251
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kV:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kj;->kW:Ljava/lang/String;
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kj;->kW:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "DCCEXIT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 276
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
}}
