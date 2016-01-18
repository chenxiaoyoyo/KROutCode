package com.kingroot.kinguser; class ms { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ms;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic oa:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/mn;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 361
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ms;->oa:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ms;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public synthetic e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 361
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/ms;->w(Ljava/util/List;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public w(Ljava/util/List;)Ljava/util/ArrayList;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 365
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 366
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ms;->oa:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mn;->b(Lcom/kingroot/kinguser/mn;)Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xz;
a=0;// 
a=0;//     .line 368
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ms;->oa:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/kinguser/mn;->a(Lcom/kingroot/kinguser/mn;Lcom/kingroot/kinguser/xz;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 369
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 372
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 376
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ms;->oa:Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mn;->b(Lcom/kingroot/kinguser/mn;)Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
a=0;// 
a=0;//     .line 377
a=0;//     return-object v1
a=0;// .end method
}}
