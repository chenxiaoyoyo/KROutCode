package com.kingroot.kinguser; class sm { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/sm;
a=0;// .super Lcom/kingroot/kinguser/sl;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/service/KingRootAppListService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/sl;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sm;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;ILjava/lang/String;J)I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 49
a=0;//     #v8=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/service/KingRootAppListService;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/service/KingRootAppListService;->a(Lcom/kingroot/kinguser/service/KingRootAppListService;)Lcom/kingroot/kinguser/sn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/sn;->jG()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-ne p2, v8, :cond_1
a=0;// 
a=0;//     move v5, v8
a=0;// 
a=0;//     .line 53
a=0;//     :goto_1
a=0;//     #v5=(Boolean);
a=0;//     cmp-long v0, p4, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     move-wide v1, p4
a=0;// 
a=0;//     .line 54
a=0;//     :goto_2
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     .line 55
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/kingroot/kinguser/fz;->a(JLjava/lang/String;Ljava/lang/String;IJ)V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move v5, v0
a=0;// 
a=0;//     .line 52
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 53
a=0;//     :cond_2
a=0;//     #v0=(Byte);v5=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/wf;->lW()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 54
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/service/KingRootAppListService;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/service/KingRootAppListService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/kinguser/ul;->p(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;ILjava/lang/String;J)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-virtual/range {p0 .. p5}, Lcom/kingroot/kinguser/sm;->a(Ljava/lang/String;ILjava/lang/String;J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bv(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/service/KingRootAppListService;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/service/KingRootAppListService;->a(Lcom/kingroot/kinguser/service/KingRootAppListService;)Lcom/kingroot/kinguser/sn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/sn;->jG()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/fz;->S(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public jD()Ljava/util/Map;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 75
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/service/KingRootAppListService;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/service/KingRootAppListService;->a(Lcom/kingroot/kinguser/service/KingRootAppListService;)Lcom/kingroot/kinguser/sn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/sn;->jG()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/HashMap;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cs()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v3, v1}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 82
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 83
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kf;
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v5, Lcom/kingroot/kinguser/service/KingrootAppItem;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/service/KingrootAppItem;);
a=0;//     invoke-direct {v5}, Lcom/kingroot/kinguser/service/KingrootAppItem;-><init>()V
a=0;// 
a=0;//     .line 86
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/service/KingrootAppItem;);
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->bx(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/kf;->mRule:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 89
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->aB(I)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kf;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->bw(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-wide v6, v0, Lcom/kingroot/kinguser/kf;->kK:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/kingroot/kinguser/service/KingrootAppItem;->setTime(J)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 96
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public jE()Ljava/util/Map;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 103
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/service/KingRootAppListService;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/service/KingRootAppListService;->a(Lcom/kingroot/kinguser/service/KingRootAppListService;)Lcom/kingroot/kinguser/sn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/sn;->jG()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/HashMap;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->ct()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v3, v1}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 110
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 111
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kf;
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v5, Lcom/kingroot/kinguser/service/KingrootAppItem;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/service/KingrootAppItem;);
a=0;//     invoke-direct {v5}, Lcom/kingroot/kinguser/service/KingrootAppItem;-><init>()V
a=0;// 
a=0;//     .line 114
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/service/KingrootAppItem;);
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->bx(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/kf;->mRule:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 117
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->aB(I)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kf;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->bw(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-wide v6, v0, Lcom/kingroot/kinguser/kf;->kK:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/kingroot/kinguser/service/KingrootAppItem;->setTime(J)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public jF()Ljava/util/Map;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 130
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sm;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/service/KingRootAppListService;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/service/KingRootAppListService;->a(Lcom/kingroot/kinguser/service/KingRootAppListService;)Lcom/kingroot/kinguser/sn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/sn;->jG()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/HashMap;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cu()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v3, v1}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     .line 137
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 138
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kf;
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v5, Lcom/kingroot/kinguser/service/KingrootAppItem;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/service/KingrootAppItem;);
a=0;//     invoke-direct {v5}, Lcom/kingroot/kinguser/service/KingrootAppItem;-><init>()V
a=0;// 
a=0;//     .line 141
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/service/KingrootAppItem;);
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->bx(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/kf;->mRule:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 144
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->aB(I)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kf;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lcom/kingroot/kinguser/service/KingrootAppItem;->bw(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-wide v6, v0, Lcom/kingroot/kinguser/kf;->kK:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/kingroot/kinguser/service/KingrootAppItem;->setTime(J)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 142
a=0;//     :cond_1
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 150
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// .end method
}}
