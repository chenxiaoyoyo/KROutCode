package com.kingroot.kinguser; class aaz { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aaz;
a=0;// .super Landroid/app/Dialog;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Dh:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field private Di:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;// .field private Dj:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;// .field private dg:Landroid/widget/Button;
a=0;// 
a=0;// .field private dh:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const v0, 0x7f0b0005
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aaz;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/aaz;)Lcom/kingroot/kinguser/abh;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aaz;->Di:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abh;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/aaz;)Landroid/widget/CheckBox;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aaz;->Dh:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/kinguser/aaz;)Lcom/kingroot/kinguser/abh;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aaz;->Dj:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/abh;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/abh;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/aaz;->Di:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcom/kingroot/kinguser/abh;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/aaz;->Dj:Lcom/kingroot/kinguser/abh;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 33
a=0;//     const v0, 0x7f030001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/aaz;->setContentView(I)V
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/aaz;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/wh;->lX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V
a=0;// 
a=0;//     .line 38
a=0;//     const v0, 0x7f090033
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/aaz;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aaz;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     .line 39
a=0;//     const v0, 0x7f090035
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/aaz;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aaz;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     .line 40
a=0;//     const v0, 0x7f090036
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/aaz;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aaz;->Dh:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aaz;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/aba;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/aba;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/aba;-><init>(Lcom/kingroot/kinguser/aaz;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/aba;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aaz;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/abb;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/abb;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/abb;-><init>(Lcom/kingroot/kinguser/aaz;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/abb;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 82
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
