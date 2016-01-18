package com.kingroot.kinguser; class mk { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/mk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field action:I
a=0;// 
a=0;// .field nP:I
a=0;// 
a=0;// .field nQ:Ljava/lang/String;
a=0;// 
a=0;// .field nR:Ljava/util/List;
a=0;// 
a=0;// .field nS:I
a=0;// 
a=0;// .field nT:I
a=0;// 
a=0;// .field nU:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 205
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/mk;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mk;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 206
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/mk;->action:I
a=0;// 
a=0;//     .line 207
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/mk;->nP:I
a=0;// 
a=0;//     .line 208
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mk;->nR:Ljava/util/List;
a=0;// 
a=0;//     .line 209
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/mk;->nS:I
a=0;// 
a=0;//     .line 210
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/mk;->nT:I
a=0;// 
a=0;//     .line 211
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/mk;->nU:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Lcom/kingroot/kinguser/ya;)Lcom/kingroot/kinguser/mk;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mk;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/mk;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/mk;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/mk;-><init>()V
a=0;// 
a=0;//     .line 219
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/mk;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ya;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/mk;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 220
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ya;->action:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/mk;->action:I
a=0;// 
a=0;//     .line 221
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ya;->nP:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/mk;->nP:I
a=0;// 
a=0;//     .line 222
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ya;->nS:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/mk;->nS:I
a=0;// 
a=0;//     .line 223
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ya;->nT:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/mk;->nT:I
a=0;// 
a=0;//     .line 224
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ya;->nU:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/mk;->nU:I
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ya;->wN:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 227
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/mk;->nR:Ljava/util/List;
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ya;->wN:Ljava/util/ArrayList;
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xy;
a=0;// 
a=0;//     .line 232
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mj;->a(Lcom/kingroot/kinguser/xy;)Lcom/kingroot/kinguser/mj;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 234
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/mk;->nR:Ljava/util/List;
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
a=0;//     .line 239
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mk;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method ib()Lcom/kingroot/kinguser/ya;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ya;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/ya;-><init>()V
a=0;// 
a=0;//     .line 244
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ya;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mk;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/ya;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 245
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/mk;->action:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/ya;->action:I
a=0;// 
a=0;//     .line 246
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/mk;->nP:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/ya;->nP:I
a=0;// 
a=0;//     .line 247
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/mk;->nS:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/ya;->nS:I
a=0;// 
a=0;//     .line 248
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/mk;->nT:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/ya;->nT:I
a=0;// 
a=0;//     .line 249
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/mk;->nU:I
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/ya;->nU:I
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mk;->nR:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/ya;->wN:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mk;->nR:Ljava/util/List;
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/mj;
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v3, v1, Lcom/kingroot/kinguser/ya;->wN:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/mj;->ia()Lcom/kingroot/kinguser/xy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
}}
