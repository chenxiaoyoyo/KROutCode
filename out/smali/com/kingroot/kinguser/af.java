package com.kingroot.kinguser; class af { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/af;
a=0;// .super Lcom/kingroot/kinguser/ab;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/ab;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/af;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected Z()Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/af;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 21
a=0;//     const v1, 0x7f030021
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 23
a=0;//     const v1, 0x7f090084
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 25
a=0;//     const v2, 0x7f02000b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 27
a=0;//     return-object v0
a=0;// .end method
}}
