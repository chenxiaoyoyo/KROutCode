package com.kingroot.kinguser; class rd { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/rd;
a=0;// .super Lcom/kingroot/kinguser/do;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/do;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/rd;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/rd;)Landroid/widget/BaseAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rd;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/rd;)Landroid/widget/BaseAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rd;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/kinguser/rd;)Landroid/widget/BaseAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rd;->eJ:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected aD()Landroid/widget/BaseAdapter;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/rd;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v2, 0x7f060007
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 33
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     .line 34
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v4, Lcom/kingroot/kinguser/rh;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/rh;);
a=0;//     mul-int/lit8 v5, v0, 0x2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-object v5, v2, v5
a=0;// 
a=0;//     #v5=(Null);
a=0;//     mul-int/lit8 v6, v0, 0x2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     aget-object v6, v2, v6
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {v4, v5, v6}, Lcom/kingroot/kinguser/rh;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/rh;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 34
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/rf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/rf;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/rd;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Lcom/kingroot/kinguser/rf;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rf;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/do;->aI()V
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Lcom/kingroot/kinguser/re;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/re;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/re;-><init>(Lcom/kingroot/kinguser/rd;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/re;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/rd;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aJ()Lcom/kingroot/kinguser/ea;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ed;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ed;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/rd;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/baseui/BaseActivity;);
a=0;//     const-wide/32 v2, 0x7f0a00e6
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/kingroot/kinguser/rd;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/ed;-><init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ed;);
a=0;//     return-object v0
a=0;// .end method
}}
