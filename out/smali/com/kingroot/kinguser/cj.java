package com.kingroot.kinguser; class cj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/cj;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/cj;->dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/cj;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 53
a=0;//     :try_start_0
a=0;//     #v6=(One);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v1, v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 56
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v1, v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 62
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Boolean);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/cj;->dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;->a(Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 65
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/ir;->d(Ljava/util/List;Ljava/util/Map;)V
a=0;// 
a=0;//     .line 70
a=0;//     :goto_1
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 71
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v5=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 72
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 73
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 74
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 108
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Null);v3=(Reference,Ljava/util/HashMap;);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/ir;->b(Ljava/util/List;Ljava/util/Map;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 78
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Reference,Ljava/util/ArrayList;);v5=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v6, :cond_7
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cj;->dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;->b(Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/cn;
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/cn;->du:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/cn;->dv:Ljava/lang/String;
a=0;// 
a=0;//     :goto_4
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 84
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 85
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cj;->dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;->a(Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 87
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00e2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->Q(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_6
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00e5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->Q(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Null);v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cj;->dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;->b(Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/cn;
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/cn;->du:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/cn;->dv:Ljava/lang/String;
a=0;// 
a=0;//     :goto_6
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 98
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 99
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/cj;->dt:Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;->a(Lcom/kingroot/kinguser/activitys/DisablePkgActorActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00e1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->Q(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :cond_9
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a00e4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->Q(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/util/Iterator;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_b
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// .end method
}}
