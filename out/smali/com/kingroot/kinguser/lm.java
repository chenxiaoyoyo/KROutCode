package com.kingroot.kinguser; class lm { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/lm;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic mE:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/lk;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/lm;->mE:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/lm;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/ks;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 126
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/lo;->b(Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/ks;->lR:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     .line 136
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lo;->b(Lcom/kingroot/kinguser/kr;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 138
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fW()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1, v0, v1}, Lcom/kingroot/kinguser/lk;->b(Lcom/kingroot/kinguser/ks;Lcom/kingroot/kinguser/kr;Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public ad(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hm()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
}}
