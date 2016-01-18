package com.kingroot.kinguser; class hk { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/hk;
a=0;// .super Lcom/kingroot/kinguser/gy;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private hO:Z
a=0;// 
a=0;// .field private hP:Ljava/util/List;
a=0;// 
a=0;// .field private hQ:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/gy;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/hk;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hk;->hO:Z
a=0;// 
a=0;//     .line 12
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/hk;->hP:Ljava/util/List;
a=0;// 
a=0;//     .line 13
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hk;->hQ:Z
a=0;// 
a=0;//     .line 16
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/hk;->hO:Z
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public db()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ig;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dK()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/hk;->hP:Ljava/util/List;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dL()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/hk;->hQ:Z
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dc()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ig;);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/hk;->hO:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/hk;->hP:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/ig;->a(ZLjava/util/List;)V
a=0;// 
a=0;//     .line 60
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dt()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 21
a=0;//     #v1=(One);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/hk;->hQ:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 25
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hk;->hP:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hk;->hP:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hk;->hP:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     const-string v3, "/data"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     const-string v3, "/mnt"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     const-string v3, "/dev"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
