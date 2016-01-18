package com.kingroot.kinguser; class wp { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/wp;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final vr:Ljava/lang/String;
a=0;// 
a=0;// .field public final vv:Ljava/lang/String;
a=0;// 
a=0;// .field public final vw:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 488
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     .line 489
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/wp;->vv:Ljava/lang/String;
a=0;// 
a=0;//     .line 490
a=0;//     const-wide/32 v0, 0x1d4c0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/wp;->vw:J
a=0;// 
a=0;//     .line 491
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 500
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     .line 501
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/wp;->vv:Ljava/lang/String;
a=0;// 
a=0;//     .line 502
a=0;//     iput-wide p3, p0, Lcom/kingroot/kinguser/wp;->vw:J
a=0;// 
a=0;//     .line 503
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wp;->vr:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wp;->vv:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/wp;->vv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
