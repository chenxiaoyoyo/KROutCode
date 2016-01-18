package com.kingroot.kinguser; class oi { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/oi;
a=0;// .super Lcom/kingroot/kinguser/ps;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private pq:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/ps;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/oi;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ok;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ok;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ok;-><init>(Lcom/kingroot/kinguser/oi;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ok;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/oi;->pq:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/ps;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gx()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/kinguser/ps;->qi:I
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/oi;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/oj;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/oj;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/oj;-><init>(Lcom/kingroot/kinguser/oi;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/oj;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/bk;->a(Landroid/content/Context;ZLandroid/view/View$OnClickListener;)Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 70
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/ps;->aI()V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/oi;->pq:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     new-instance v0, Lcom/kingroot/kinguser/eg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/eg;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/oi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/eg;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/eg;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iO()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     const-wide/16 v0, 0x1388
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public iP()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     const-wide/16 v0, 0x4b0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public iQ()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public iR()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vg;->ld()V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/oi;->qj:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/oi;->qe:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/oi;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/activitys/RootCheckActivity;->k(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/oi;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->finish()V
a=0;// 
a=0;//     .line 121
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/oi;->qe:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/oi;->au(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/ps;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/oi;->qd:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/ps;->onStop()V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
}}
