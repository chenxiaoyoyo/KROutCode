package com.kingroot.kinguser.view; class TextProgressBarView { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/view/TextProgressBarView;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private ER:Landroid/widget/TextView;
a=0;// 
a=0;// .field private ES:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field public ET:I
a=0;// 
a=0;// .field EU:Z
a=0;// 
a=0;// .field EV:Ljava/util/Timer;
a=0;// 
a=0;// .field EW:Ljava/util/TimerTask;
a=0;// 
a=0;// .field private lc:I
a=0;// 
a=0;// .field public mHandler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/TextProgressBarView;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->ER:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Lcom/kingroot/kinguser/acx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/acx;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/acx;-><init>(Lcom/kingroot/kinguser/view/TextProgressBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/acx;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 98
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EU:Z
a=0;// 
a=0;//     .line 99
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EV:Ljava/util/Timer;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Lcom/kingroot/kinguser/acy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/acy;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/acy;-><init>(Lcom/kingroot/kinguser/view/TextProgressBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/acy;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EW:Ljava/util/TimerTask;
a=0;// 
a=0;//     .line 32
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/view/TextProgressBarView;->P(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/view/TextProgressBarView;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->ER:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Lcom/kingroot/kinguser/acx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/acx;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/acx;-><init>(Lcom/kingroot/kinguser/view/TextProgressBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/acx;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 98
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EU:Z
a=0;// 
a=0;//     .line 99
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EV:Ljava/util/Timer;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Lcom/kingroot/kinguser/acy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/acy;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/acy;-><init>(Lcom/kingroot/kinguser/view/TextProgressBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/acy;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EW:Ljava/util/TimerTask;
a=0;// 
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/view/TextProgressBarView;->P(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private P(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v1, 0x7f03002e
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/kingroot/kinguser/view/TextProgressBarView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 47
a=0;//     const v0, 0x7f090042
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 49
a=0;//     const v0, 0x7f090092
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->ES:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 51
a=0;//     const v0, 0x7f090039
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->ER:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/view/TextProgressBarView;)Landroid/widget/ProgressBar;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cm(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     #v1=(Null);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->lc:I
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->ES:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->lc:I
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->EQ:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/view/TextProgressBarView;->ES:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
