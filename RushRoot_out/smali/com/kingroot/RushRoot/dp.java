package com.kingroot.RushRoot; class dp { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/dp;
a=0;// .super Lcom/kingroot/RushRoot/cq;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/widget/TextView;
a=0;// 
a=0;// .field private b:Landroid/view/View;
a=0;// 
a=0;// .field private c:Landroid/os/Handler;
a=0;// 
a=0;// .field private d:[Ljava/lang/String;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/cq;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/dp;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dp;->g()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/high16 v1, 0x7f090000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/dp;->d:[Ljava/lang/String;
a=0;// 
a=0;//     .line 23
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/dp;->e:I
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dp;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const v1, 0x7f050027
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/dp;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 30
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dp;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f050026
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/dp;->b:Landroid/view/View;
a=0;// 
a=0;//     .line 31
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/dp;->c:Landroid/os/Handler;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/dp;Ljava/lang/String;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     :try_start_0
a=0;//     new-instance v10, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v10, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     const-wide/16 v0, 0x1f4
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v10, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v10, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     new-instance v11, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v11, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     const-wide/16 v0, 0x1f4
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v11, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v11, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/high16 v8, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     const-wide/16 v1, 0x1f4
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     new-instance v1, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     new-instance v2, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v2, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     invoke-virtual {v2, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     invoke-direct {v0, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/dr;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/dr;);
a=0;//     invoke-direct {v1, p0, p1, v0}, Lcom/kingroot/RushRoot/dr;-><init>(Lcom/kingroot/RushRoot/dp;Ljava/lang/String;Landroid/view/animation/AnimationSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/dr;);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->b:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/dp;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/dp;)[Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->d:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/dp;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/dp;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/dp;->e:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/dq;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/dq;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/RushRoot/dq;-><init>(Lcom/kingroot/RushRoot/dp;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/dq;);
a=0;//     const-wide/16 v2, 0x3a98
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/dp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/dp;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/RushRoot/dp;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/kingroot/RushRoot/dp;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->b:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final a()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     const v0, 0x7f030008
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/dp;->b(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final h()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-super {p0}, Lcom/kingroot/RushRoot/cq;->h()V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/dp;->b()V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final i()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-super {p0}, Lcom/kingroot/RushRoot/cq;->i()V
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dp;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
