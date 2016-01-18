package com.kingroot.RushRoot; class fy { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/fy;
a=0;// .super Lcom/kingroot/RushRoot/jc;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lkrsdk/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lkrsdk/h;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/jc;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/fy;);
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/fy;->a:Lkrsdk/h;
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fy;->a:Lkrsdk/h;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/h;);
a=0;//     invoke-interface {v0, p1}, Lkrsdk/h;->a(Ljava/lang/String;)Lkrsdk/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/jb;);
a=0;//     iget v2, v0, Lkrsdk/i;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     iget-object v0, v0, Lkrsdk/i;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, p1, v2, v0, v3}, Lcom/kingroot/RushRoot/jb;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 28
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jb;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     return-object v1
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/fy;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fy;->a:Lkrsdk/h;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/h;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lkrsdk/h;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
