package com.kingroot.kinguser; class ou { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ou;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
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
a=0;//     .line 169
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ou;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ou;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     const/high16 v0, 0x7f090000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 174
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Integer;);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ou;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/os;->aR()Lcom/kingroot/kinguser/du;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/du;->aT()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 180
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dw;->data:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ko;
a=0;// 
a=0;//     .line 182
a=0;//     iget-boolean v1, v0, Lcom/kingroot/kinguser/ko;->ld:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x40
a=0;// 
a=0;//     .line 188
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 189
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     .line 192
a=0;//     const v0, 0x186c5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 197
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ou;->pC:Lcom/kingroot/kinguser/os;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/os;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/os;->a(Lcom/kingroot/kinguser/os;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/16 v1, 0x41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/ko;->visible:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
