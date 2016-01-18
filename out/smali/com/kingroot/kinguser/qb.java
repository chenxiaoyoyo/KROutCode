package com.kingroot.kinguser; class qb { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/qb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/qa;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/qb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->a(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eB()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->b(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dc;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dc;->aw()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p3, v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 112
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->c(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dc;
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Lcom/kingroot/kinguser/dc;->q(I)V
a=0;// 
a=0;//     .line 118
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->e(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/du;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->f(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p3, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->g(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3, p3}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->smoothScrollToPosition(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qb;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qa;->d(Lcom/kingroot/kinguser/qa;)Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dc;
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/dc;->q(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
