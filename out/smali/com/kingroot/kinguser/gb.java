package com.kingroot.kinguser; class gb { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/gb;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic gw:Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/fz;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 686
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/gb;->gw:Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/gb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 689
a=0;//     #v2=(Null);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 691
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v1, v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 692
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 698
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 699
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 700
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nk;->ip()Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/kinguser/nk;->y(Ljava/util/List;)Z
a=0;// 
a=0;//     .line 703
a=0;//     new-instance v1, Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 704
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->clear()V
a=0;// 
a=0;//     .line 705
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nk;->ip()Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/nk;->iq()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 706
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 728
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 710
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/gb;->gw:Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/fz;->b(Lcom/kingroot/kinguser/fz;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 711
a=0;//     :try_start_0
a=0;//     new-instance v2, Lcom/kingroot/kinguser/gc;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/gc;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/gc;-><init>(Lcom/kingroot/kinguser/gb;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/gc;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 727
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
