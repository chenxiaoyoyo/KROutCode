package com.kingroot.kinguser; class dn { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/dn;
a=0;// .super Lcom/kingroot/kinguser/dp;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/ec;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected eH:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/dp;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dn;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dn;->eH:Ljava/util/List;
a=0;// 
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dn;->eH:Ljava/util/List;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/dn;->c(Ljava/util/List;)V
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aC()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->aC()V
a=0;// 
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dn;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->aC()V
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/dp;->a(Lcom/kingroot/kinguser/ec;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract c(Ljava/util/List;)V
a=0;// .end method
}}
