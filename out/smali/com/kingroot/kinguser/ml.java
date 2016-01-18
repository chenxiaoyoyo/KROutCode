package com.kingroot.kinguser; class ml { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ml;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field nV:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 161
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ml;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ml;->nV:Ljava/util/List;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static d(Lcom/kingroot/kinguser/yb;)Lcom/kingroot/kinguser/ml;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ml;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ml;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ml;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/ml;-><init>()V
a=0;// 
a=0;//     .line 169
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ml;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 170
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/ml;->nV:Ljava/util/List;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mk;->a(Lcom/kingroot/kinguser/ya;)Lcom/kingroot/kinguser/mk;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 176
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/ml;->nV:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ml;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method ic()Lcom/kingroot/kinguser/yb;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     new-instance v1, Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/yb;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/yb;-><init>()V
a=0;// 
a=0;//     .line 186
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/yb;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ml;->nV:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ml;->nV:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/mk;
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/mk;->ib()Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
}}
