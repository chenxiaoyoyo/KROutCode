package com.kingroot.kinguser; class in { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/in;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic iQ:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/im;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/in;->iQ:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/in;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     .line 109
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/in;->iQ:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->ly:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v0}, Lcom/kingroot/kinguser/im;->e(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
