package com.kingroot.kinguser; class rb { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/rb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/qx;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 877
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/rb;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/rb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/ks;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 903
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rb;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/qx;->g(Lcom/kingroot/kinguser/qx;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 940
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 908
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v3=(Boolean);v4=(Uninit);v6=(Uninit);
a=0;//     iget v3, p1, Lcom/kingroot/kinguser/ks;->lR:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 914
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_6
a=0;// 
a=0;//     .line 916
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     .line 917
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/kr;->lF:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/kr;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     move-object v3, v6
a=0;// 
a=0;//     .line 920
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 922
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/lo;->b(Lcom/kingroot/kinguser/kr;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 923
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 924
a=0;//     :goto_2
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 925
a=0;//     invoke-virtual {p1, v1}, Lcom/kingroot/kinguser/ks;->an(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 926
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 927
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/kr;->lI:Ljava/lang/String;
a=0;// 
a=0;//     .line 928
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 929
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rb;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->h(Lcom/kingroot/kinguser/qx;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a0027
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     .line 932
a=0;//     :cond_2
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v5, v3, p1, v0}, Lcom/kingroot/kinguser/lk;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 936
a=0;//     :goto_3
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rb;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->jc()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 923
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 934
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v0, v5, v3, p1}, Lcom/kingroot/kinguser/lo;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 938
a=0;//     :cond_5
a=0;//     #v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rb;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/dr;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Null);v1=(One);v3=(Conflicted);v6=(Uninit);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public ad(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 886
a=0;//     const v0, 0x7f0a001e
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->E(I)V
a=0;// 
a=0;//     .line 888
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hm()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 881
a=0;//     const v0, 0x7f0a001d
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fx;->E(I)V
a=0;// 
a=0;//     .line 882
a=0;//     return-void
a=0;// .end method
}}
