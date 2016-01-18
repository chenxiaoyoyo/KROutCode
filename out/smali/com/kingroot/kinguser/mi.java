package com.kingroot.kinguser; class mi { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/mi;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic nN:Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/yb;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/mi;->nN:Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/mi;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/mh;->hZ()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/mi;->nN:Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/yb;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/mi;->nN:Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/yb;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/yb;);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mh;->c(Lcom/kingroot/kinguser/yb;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/yb;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 54
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 55
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/mh;->u(Ljava/util/List;)V
a=0;// 
a=0;//     .line 66
a=0;//     :cond_5
a=0;//     return-void
a=0;// .end method
}}
