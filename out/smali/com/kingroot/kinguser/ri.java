package com.kingroot.kinguser; class ri { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ri;
a=0;// .super Lcom/kingroot/kinguser/ps;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static rb:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/ri;->rb:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/kingroot/kinguser/ps;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ri;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/ps;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ri;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v1, 0x7f030022
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 71
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const v0, 0x7f090085
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 73
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "V"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/um;->kO()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/ps;->aI()V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/kh;->hd()V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     new-instance v0, Lcom/kingroot/kinguser/eg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/eg;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ri;->mContext:Landroid/content/Context;
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
a=0;//     .line 87
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
a=0;//     .line 92
a=0;//     const-wide/16 v0, 0x4b0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public iQ()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ri;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/activitys/RootCheckActivity;->k(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ri;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->finish()V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/ps;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jt;->gm()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/ri;->rb:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 51
a=0;//     sput-boolean v1, Lcom/kingroot/kinguser/ri;->rb:Z
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/gj;->r(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/ri;->l(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 55
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     .line 57
a=0;//     :cond_2
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ri;->au(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/ps;->onStop()V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
}}
