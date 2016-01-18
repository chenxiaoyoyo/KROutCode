package com.kingroot.kinguser; class ot { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ot;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/os;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ot;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ot;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ot;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/os;->aR()Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/du;->aT()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 140
a=0;//     if-ltz p3, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge p3, v1, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 142
a=0;//     iget-boolean v1, v0, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ko;);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x40
a=0;// 
a=0;//     .line 147
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 148
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     .line 151
a=0;//     const v0, 0x186c5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 156
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ot;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/os;->a(Lcom/kingroot/kinguser/os;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ot;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/os;->b(Lcom/kingroot/kinguser/os;)Lcom/kingroot/kinguser/view/PinnedHeaderListView;
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
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ot;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/os;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-wide/16 v2, 0x64
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/kinguser/dr;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     const/16 v1, 0x41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
