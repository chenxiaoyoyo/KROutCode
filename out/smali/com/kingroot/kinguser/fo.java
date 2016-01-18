package com.kingroot.kinguser; class fo { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/fo;
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
a=0;//     .line 151
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/fo;->ge:Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/wb;->lS()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 155
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 157
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 159
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/fo;->ge:Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/fn;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/kingroot/kinguser/fn;->a(Lcom/kingroot/kinguser/fn;Ljava/io/File;I)I
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
