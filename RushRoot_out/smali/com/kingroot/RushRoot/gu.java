package com.kingroot.RushRoot; class gu { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/gu;
a=0;// .super Lcom/kingroot/RushRoot/hi;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static e:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:J
a=0;// 
a=0;// .field public b:Ljava/util/ArrayList;
a=0;// 
a=0;// .field public c:Ljava/lang/String;
a=0;// 
a=0;// .field public d:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hi;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/gu;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/gu;->a:J
a=0;// 
a=0;//     .line 17
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/gu;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 18
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/gu;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 19
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/gu;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/RushRoot/hf;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v2=(Null);
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/gu;->a:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Lcom/kingroot/RushRoot/hf;->a(JIZ)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/gu;->a:J
a=0;// 
a=0;//     .line 39
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/gu;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/gu;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/go;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/go;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/go;);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/gu;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/gu;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v3, v3}, Lcom/kingroot/RushRoot/hf;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/gu;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0, v2}, Lcom/kingroot/RushRoot/hf;->a(IZ)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/gu;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0, v2}, Lcom/kingroot/RushRoot/hf;->a(IZ)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/gu;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/hh;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/gu;->a:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lcom/kingroot/RushRoot/hh;->a(JI)V
a=0;// 
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/gu;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(Ljava/util/Collection;I)V
a=0;// 
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/gu;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/gu;->c:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/gu;->d:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/gu;->d:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/kingroot/RushRoot/hh;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
}}
