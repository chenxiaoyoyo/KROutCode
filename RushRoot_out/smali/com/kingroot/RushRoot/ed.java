package com.kingroot.RushRoot; class ed { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ed;
a=0;// .super Lcom/kingroot/RushRoot/dg;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/view/View;
a=0;// 
a=0;// .field private b:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private e:Landroid/graphics/drawable/ClipDrawable;
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/dg;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ed;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ed;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const v1, 0x7f05002d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const v2, 0x7f080020
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/RushRoot/ed;->d(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ck;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ed;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f05002c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ed;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ed;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/ClipDrawable;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ed;->e:Landroid/graphics/drawable/ClipDrawable;
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ee;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ee;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/ee;-><init>(Lcom/kingroot/RushRoot/ed;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ee;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ed;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ed;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ed;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ed;I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ed;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ed;->c:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/ed;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ed;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1b
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ed;->f:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/ed;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ed;->c:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/RushRoot/ed;)Landroid/graphics/drawable/ClipDrawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ed;->e:Landroid/graphics/drawable/ClipDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/ClipDrawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/kingroot/RushRoot/ed;)Landroid/widget/ImageView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ed;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final a()Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 85
a=0;//     #v2=(Byte);
a=0;//     new-instance v0, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ed;->g()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 88
a=0;//     const v1, 0x7f03000a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/RushRoot/ed;->b(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/ed;->a:Landroid/view/View;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ed;->a:Landroid/view/View;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ed;->a:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 93
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ed;->a:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/cm;->a(Landroid/view/View;)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ed;->h()V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final h()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ed;->c:I
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ed;->f:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ed;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ed;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
}}
