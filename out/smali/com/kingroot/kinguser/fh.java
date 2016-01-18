package com.kingroot.kinguser; class fh { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/fh;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic fW:Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ff;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/fh;->fW:Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fh;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
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
a=0;//     .line 203
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 204
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/fh;->fW:Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/ff;->z(I)Z
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
