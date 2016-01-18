package com.kingroot.kinguser; class ts { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ts;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ts;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;Lcom/kingroot/kinguser/tq;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 23
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p2}, Lcom/kingroot/kinguser/tq;->kw()Lcom/kingroot/kinguser/to;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 24
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/to;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {p2, v3}, Lcom/kingroot/kinguser/tq;->aV(I)V
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->ks()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p2, v3}, Lcom/kingroot/kinguser/tq;->aV(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_1
a=0;//     new-instance v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/model/SuRequestCmdModel;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->kt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->kt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lx:I
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->ku()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->ly:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->ku()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->kt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lA:I
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/to;->kt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     .line 44
a=0;//     invoke-static {p1, v1}, Lcom/kingroot/kinguser/service/SuNotifyService;->c(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p2, v0}, Lcom/kingroot/kinguser/tq;->aV(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
