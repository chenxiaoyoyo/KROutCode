package com.kingroot.RushRoot; class jk { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:I
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// .field public c:Ljava/lang/String;
a=0;// 
a=0;// .field public d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 264
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 265
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/jk;);
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/jk;->a:I
a=0;// 
a=0;//     .line 266
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/jk;->b:I
a=0;// 
a=0;//     .line 267
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jk;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 268
a=0;//     iput v1, p0, Lcom/kingroot/RushRoot/jk;->d:I
a=0;// 
a=0;//     .line 269
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IILjava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 272
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/jk;);
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/jk;->a:I
a=0;// 
a=0;//     .line 273
a=0;//     iput p2, p0, Lcom/kingroot/RushRoot/jk;->b:I
a=0;// 
a=0;//     .line 274
a=0;//     iput-object p3, p0, Lcom/kingroot/RushRoot/jk;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 275
a=0;//     iput p4, p0, Lcom/kingroot/RushRoot/jk;->d:I
a=0;// 
a=0;//     .line 276
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "PID="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/jk;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " PPID="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/jk;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " NAME="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jk;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " UID="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 281
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/jk;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
