package com.kingroot.RushRoot; class i { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/i;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;// .field c:Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;// .field d:Lcom/kingroot/RushRoot/l;
a=0;// 
a=0;// .field e:Ljava/util/ArrayList;
a=0;// 
a=0;// .field f:Lcom/kingroot/RushRoot/m;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>([Lcom/kingroot/RushRoot/g;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/i;);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/i;->a:I
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/i;->b:Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/i;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/i;->c:Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/i;->c:Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/g;->b()Lcom/kingroot/RushRoot/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/i;->d:Lcom/kingroot/RushRoot/l;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Lcom/kingroot/RushRoot/i;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 145
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 146
a=0;//     #v3=(Integer);
a=0;//     new-array v4, v3, [Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     .line 147
a=0;//     #v4=(Reference,[Lcom/kingroot/RushRoot/g;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/g;->c()Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v4, v1
a=0;// 
a=0;//     .line 147
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/i;);
a=0;//     invoke-direct {v0, v4}, Lcom/kingroot/RushRoot/i;-><init>([Lcom/kingroot/RushRoot/g;)V
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/i;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/i;->a()Lcom/kingroot/RushRoot/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/i;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 222
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/i;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/i;->e:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/g;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/g;->a()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 222
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     return-object v0
a=0;// .end method
}}
