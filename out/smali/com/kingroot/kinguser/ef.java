package com.kingroot.kinguser; class ef { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/ef;
a=0;// .super Lcom/kingroot/kinguser/dt;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/dt;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ef;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const v5, 0x7f03002b
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 26
a=0;//     #v2=(Byte);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dt;->aF()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ef;->eM:Landroid/view/View;
a=0;// 
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     new-instance v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 31
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 33
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ef;->eM:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ef;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 43
a=0;//     const v0, 0x7f09000b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setId(I)V
a=0;// 
a=0;//     .line 44
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/ef;->eM:Landroid/view/View;
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/view/PinnedHeaderListView;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->eM:Landroid/view/View;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Byte);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ef;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ef;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ef;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ea;->getContainer()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ef;->eT:Lcom/kingroot/kinguser/view/PinnedHeaderListView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/view/PinnedHeaderListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dt;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
}}
