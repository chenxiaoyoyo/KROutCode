package com.kingroot.kinguser; class fr { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/fr;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic ge:Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/fn;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 632
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/fr;->ge:Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fr;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 635
a=0;//     #v2=(Null);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 636
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 637
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 638
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/fs;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/fs;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/kingroot/kinguser/fs;-><init>(Lcom/kingroot/kinguser/fr;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/fs;);
a=0;//     new-array v0, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 649
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
