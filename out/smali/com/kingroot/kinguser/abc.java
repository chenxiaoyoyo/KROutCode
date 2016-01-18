package com.kingroot.kinguser; class abc { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/abc;
a=0;// .super Landroid/app/Dialog;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Di:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;// .field private Dj:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;// .field private Dr:Landroid/widget/TextView;
a=0;// 
a=0;// .field private Ds:Lcom/kingroot/kinguser/abg;
a=0;// 
a=0;// .field private Dt:Lcom/kingroot/kinguser/abi;
a=0;// 
a=0;// .field private de:Landroid/widget/TextView;
a=0;// 
a=0;// .field private dg:Landroid/widget/Button;
a=0;// 
a=0;// .field private dh:Landroid/widget/Button;
a=0;// 
a=0;// .field private di:Landroid/view/View;
a=0;// 
a=0;// .field private dj:Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     const v0, 0x7f0b0005
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/abc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/abc;)Lcom/kingroot/kinguser/abh;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Di:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abh;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/abc;)Lcom/kingroot/kinguser/abh;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dj:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abh;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/abf;Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v1, 0x7f070041
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 174
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     const v2, 0x7f070040
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 175
a=0;//     #v1=(Integer);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/abf;->Dv:Lcom/kingroot/kinguser/abf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/abf;);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/abf;->Dw:Lcom/kingroot/kinguser/abf;
a=0;// 
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/abg;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/abc;->Ds:Lcom/kingroot/kinguser/abg;
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/abh;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/abc;->Di:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/abi;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/abc;->Dt:Lcom/kingroot/kinguser/abi;
a=0;// 
a=0;//     .line 126
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setLineSpacing(FF)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcom/kingroot/kinguser/abh;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/abc;->Dj:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public cf(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public cg(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/abc;->mX()V
a=0;// 
a=0;//     .line 189
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const v1, 0x7f020057
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 194
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const v1, 0x7f020058
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public ch(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/abc;->mX()V
a=0;// 
a=0;//     .line 206
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const v1, 0x7f020057
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 211
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 209
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const v1, 0x7f020056
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dismiss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 52
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dm(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->de:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dn(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x12
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 140
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public do(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dp(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public k(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(Byte);
a=0;//     const v0, 0x7f090037
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public mW()Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method mX()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->di:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 219
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->di:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 76
a=0;//     const v0, 0x7f030002
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->setContentView(I)V
a=0;// 
a=0;//     .line 83
a=0;//     const v0, 0x7f09002f
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/abc;->de:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 84
a=0;//     const v0, 0x7f090031
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/abc;->Dr:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 85
a=0;//     const v0, 0x7f090033
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     .line 86
a=0;//     const v0, 0x7f090035
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     .line 87
a=0;//     const v0, 0x7f090034
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/abc;->di:Landroid/view/View;
a=0;// 
a=0;//     .line 88
a=0;//     const v0, 0x7f090030
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/abc;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/abc;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/abd;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/abd;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/abd;-><init>(Lcom/kingroot/kinguser/abc;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abd;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/abe;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/abe;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/abe;-><init>(Lcom/kingroot/kinguser/abc;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abe;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 225
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/abc;->Ds:Lcom/kingroot/kinguser/abg;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abg;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/abc;->Ds:Lcom/kingroot/kinguser/abg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abg;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/kingroot/kinguser/abg;->a(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/abc;->dismiss()V
a=0;// 
a=0;//     .line 239
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 234
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/abc;->Dt:Lcom/kingroot/kinguser/abi;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abi;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/abc;->Dt:Lcom/kingroot/kinguser/abi;
a=0;// 
a=0;//     invoke-interface {v1, p1, p2}, Lcom/kingroot/kinguser/abi;->b(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Landroid/app/Dialog;->show()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 45
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 42
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
