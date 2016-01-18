package com.kingroot.RushRoot; class cw { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/cw;
a=0;// .super Lcom/kingroot/RushRoot/cq;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Landroid/widget/Button;
a=0;// 
a=0;// .field protected b:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/cq;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/cw;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final a()Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const v0, 0x7f030005
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/cw;->c(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 24
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cw;->d()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 25
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     const v0, 0x7f050021
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cw;->d()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const v0, 0x7f050020
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/cw;->a:Landroid/widget/Button;
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->a:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cw;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 33
a=0;//     const v0, 0x7f050023
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/cw;->b:Landroid/widget/Button;
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->b:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/cw;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 36
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->a:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->a:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract b()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->b:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->b:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract c()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method protected abstract d()Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method public final e()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->a:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/cw;->a:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
