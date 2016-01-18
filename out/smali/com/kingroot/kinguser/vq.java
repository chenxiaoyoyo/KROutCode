package com.kingroot.kinguser; class vq { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/vq;
a=0;// .super Ljava/lang/ref/PhantomReference;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mName:Ljava/lang/String;
a=0;// 
a=0;// .field private ux:Ljava/lang/String;
a=0;// 
a=0;// .field private uy:I
a=0;// 
a=0;// .field private uz:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
a=0;// 
a=0;//     .line 269
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/vq;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/vq;->uz:J
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/vq;->mName:Ljava/lang/String;
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/vq;->uy:I
a=0;// 
a=0;//     .line 272
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/vq;->ux:Ljava/lang/String;
a=0;// 
a=0;//     .line 273
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ll()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/vq;->uy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
