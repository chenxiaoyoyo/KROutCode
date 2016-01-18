package com.kingroot.RushRoot; class eg { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/eg;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/RushRoot/views/components/g;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/ef;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/eg;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     const-string v0, "onStartPanelCollapse"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(F)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 101
a=0;//     #v2=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "onPanelSlide:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     iget-boolean v1, v1, Lcom/kingroot/RushRoot/ef;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     iget-boolean v1, v1, Lcom/kingroot/RushRoot/ef;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/ef;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/RushRoot/ef;->a:Z
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/ef;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ei;->a:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ei;->a:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/eg;->b()V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 152
a=0;//     #v4=(Null);
a=0;//     const-string v0, "onPanelCollapsed"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/kingroot/RushRoot/ef;->a:Z
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->a(Lcom/kingroot/RushRoot/ef;)Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->start()V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->m(Lcom/kingroot/RushRoot/ef;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->b(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->b(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->n(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ef;->o(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/RushRoot/ck;->a(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->e(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->e(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f020039
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->f(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->f(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->p(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 173
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->h(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->q(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ef;->r(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/eh;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/eh;);
a=0;//     invoke-direct {v3, p0}, Lcom/kingroot/RushRoot/eh;-><init>(Lcom/kingroot/RushRoot/eg;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/eh;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/RushRoot/ck;->a(Landroid/view/View;IILcom/kingroot/RushRoot/d;)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->k(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->s(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->k(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f08001b
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->l(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f020021
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v0, v4}, Lcom/kingroot/RushRoot/ef;->a(Lcom/kingroot/RushRoot/ef;Z)Z
a=0;// 
a=0;//     .line 218
a=0;//     return-void
a=0;// 
a=0;//     .line 209
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(One);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/ef;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 210
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ei;->a:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 211
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ei;->a:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     const-string v0, "onStartPanelExpand"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 121
a=0;//     #v1=(One);
a=0;//     const-string v0, "onPanelExpanded"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/ef;->a(Lcom/kingroot/RushRoot/ef;Z)Z
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/kingroot/RushRoot/ef;->a:Z
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->a(Lcom/kingroot/RushRoot/ef;)Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->cancel()V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->b(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->b(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->c(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ef;->d(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/RushRoot/ck;->a(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->e(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->e(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f02003a
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->f(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->f(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->g(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->h(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ef;->i(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ef;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ef;->j(Lcom/kingroot/RushRoot/ef;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/RushRoot/ck;->a(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->k(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->k(Lcom/kingroot/RushRoot/ef;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f08001c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/eg;->a:Lcom/kingroot/RushRoot/ef;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ef;->l(Lcom/kingroot/RushRoot/ef;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f020020
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
}}
