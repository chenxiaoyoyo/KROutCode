package com.kingroot.kinguser; class is { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/is;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/is;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 74
a=0;//     #v2=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ir;->dZ()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 80
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v4, v0, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 86
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 95
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     .line 96
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v2, :cond_6
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 97
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 98
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/np;->iz()Lcom/kingroot/kinguser/np;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/kingroot/kinguser/np;->ak(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 101
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 111
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ir;->ec()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     if-ne v5, v2, :cond_4
a=0;// 
a=0;//     .line 116
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fG()V
a=0;// 
a=0;//     .line 121
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :pswitch_0
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ir;->e(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     if-ne v5, v7, :cond_3
a=0;// 
a=0;//     .line 118
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fI()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 124
a=0;//     :pswitch_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {v0, v8}, Lcom/kingroot/kinguser/ir;->d(Ljava/util/List;Ljava/util/Map;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :pswitch_2
a=0;//     invoke-static {v0, v8}, Lcom/kingroot/kinguser/ir;->d(Ljava/util/List;Ljava/util/Map;)V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ir;->e(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v6=(Reference,Ljava/util/Iterator;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/List;);v6=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
