package com.kingroot.kinguser; class bs { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/bs;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public cA:I
a=0;// 
a=0;// .field public ct:Ljava/lang/String;
a=0;// 
a=0;// .field public cu:Ljava/lang/String;
a=0;// 
a=0;// .field public cv:I
a=0;// 
a=0;// .field public cw:I
a=0;// 
a=0;// .field public cx:I
a=0;// 
a=0;// .field public cy:I
a=0;// 
a=0;// .field public cz:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 655
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 659
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/bs;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/bs;->ct:Ljava/lang/String;
a=0;// 
a=0;//     .line 660
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/bs;->cu:Ljava/lang/String;
a=0;// 
a=0;//     .line 661
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/bs;->cv:I
a=0;// 
a=0;//     .line 662
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/bs;->cw:I
a=0;// 
a=0;//     .line 664
a=0;//     const/high16 v0, -0x60000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/bs;->cy:I
a=0;// 
a=0;//     .line 665
a=0;//     const v0, -0x832071
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/bs;->cz:I
a=0;// 
a=0;//     .line 666
a=0;//     const v0, -0x322d2c
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/bs;->cA:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/kingroot/kinguser/bs;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const v3, 0x7f020063
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 670
a=0;//     #v5=(Byte);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bs;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/bs;-><init>()V
a=0;// 
a=0;//     .line 672
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bs;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/ce;->dd:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 674
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/bs;->cx:I
a=0;// 
a=0;//     .line 676
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/bs;->cx:I
a=0;// 
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 677
a=0;//     iput v3, v0, Lcom/kingroot/kinguser/bs;->cx:I
a=0;// 
a=0;//     .line 681
a=0;//     :cond_0
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 683
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 685
a=0;//     #v3=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 686
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/bs;->ct:Ljava/lang/String;
a=0;// 
a=0;//     .line 690
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 691
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/bs;->cu:Ljava/lang/String;
a=0;// 
a=0;//     .line 695
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/bs;->cv:I
a=0;// 
a=0;//     .line 697
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/bs;->cw:I
a=0;// 
a=0;//     .line 699
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/high16 v3, -0x60000000
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/bs;->cy:I
a=0;// 
a=0;//     .line 701
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const v3, -0x832071
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/bs;->cz:I
a=0;// 
a=0;//     .line 703
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const v3, -0x322d2c
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/bs;->cA:I
a=0;// 
a=0;//     .line 705
a=0;//     invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 707
a=0;//     return-object v0
a=0;// .end method
}}
