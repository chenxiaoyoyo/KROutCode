package com.kingroot.kinguser; class b { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/b;
a=0;// .super Lcom/kingroot/kinguser/afv;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static S:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public R:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/afv;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/aft;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/kingroot/kinguser/b;->S:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/b;->S:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Lcom/kingroot/kinguser/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/a;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/a;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/a;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/b;->S:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/b;->S:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lcom/kingroot/kinguser/aft;->d(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/StringBuilder;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     new-instance v0, Lcom/kingroot/kinguser/afr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/afr;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/kingroot/kinguser/afr;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afr;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v2, "vctCommList"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/afr;->c(Ljava/util/Collection;Ljava/lang/String;)Lcom/kingroot/kinguser/afr;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
}}
