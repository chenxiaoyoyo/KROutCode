package com.kingroot.kinguser; class bk { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/bk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;ZLandroid/view/View$OnClickListener;)Lcom/kingcore/uilib/VerticalViewPager;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const v2, 0x7f020016
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const v3, 0x7f020015
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const v9, 0x7f020010
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     #v8=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "_"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 38
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 47
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     .line 48
a=0;//     const-string v0, "zh_CN"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "zh_TW"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "zh_HK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     const v4, 0x7f020017
a=0;// 
a=0;//     .line 50
a=0;//     #v4=(Integer);
a=0;//     const v2, 0x7f020018
a=0;// 
a=0;//     .line 53
a=0;//     const v1, 0x7f020011
a=0;// 
a=0;//     .line 54
a=0;//     #v1=(Integer);
a=0;//     const v0, 0x7f020012
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v11, v3
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v11
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v6, Lcom/kingroot/kinguser/ba;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/kingroot/kinguser/ba;);
a=0;//     invoke-direct {v6, p0}, Lcom/kingroot/kinguser/ba;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 84
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/ba;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v7, v1}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v6, v1}, Lcom/kingroot/kinguser/ba;->b(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v6, v4}, Lcom/kingroot/kinguser/ba;->j(I)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ba;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ba;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/ba;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ba;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/ba;->b(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v1, v3}, Lcom/kingroot/kinguser/ba;->j(I)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ba;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ba;);
a=0;//     invoke-direct {v0, p0, v10}, Lcom/kingroot/kinguser/ba;-><init>(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ba;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Lcom/kingroot/kinguser/vc;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/ba;->b(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v0, p2}, Lcom/kingroot/kinguser/ba;->b(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/ba;->k(I)V
a=0;// 
a=0;//     .line 97
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {v0, v8}, Lcom/kingroot/kinguser/ba;->f(Z)V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_1
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bn;);
a=0;//     invoke-direct {v0, p0, v5}, Lcom/kingroot/kinguser/bn;-><init>(Landroid/content/Context;Ljava/util/List;)V
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bn;);
a=0;//     new-instance v1, Lcom/kingcore/uilib/VerticalViewPager;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingcore/uilib/VerticalViewPager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 106
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/VerticalViewPager;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingcore/uilib/VerticalViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v1, v8}, Lcom/kingcore/uilib/VerticalViewPager;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {v1, v8, v10}, Lcom/kingcore/uilib/VerticalViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Lcom/kingroot/kinguser/bl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/bl;);
a=0;//     invoke-direct {v0, v5}, Lcom/kingroot/kinguser/bl;-><init>(Ljava/util/List;)V
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/bl;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingcore/uilib/VerticalViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v1}, Lcom/kingcore/uilib/VerticalViewPager;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/bm;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/bm;);
a=0;//     invoke-direct {v3, v1, v0}, Lcom/kingroot/kinguser/bm;-><init>(Lcom/kingcore/uilib/VerticalViewPager;Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/bm;);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 140
a=0;//     return-object v1
a=0;// 
a=0;//     .line 57
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v11=(Uninit);
a=0;//     const v4, 0x7f020019
a=0;// 
a=0;//     .line 58
a=0;//     #v4=(Integer);
a=0;//     const v3, 0x7f02001a
a=0;// 
a=0;//     .line 61
a=0;//     const v1, 0x7f020013
a=0;// 
a=0;//     .line 62
a=0;//     #v1=(Integer);
a=0;//     const v0, 0x7f020014
a=0;// 
a=0;//     .line 63
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v1=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     const v1, 0x7f02000e
a=0;// 
a=0;//     .line 67
a=0;//     #v1=(Integer);
a=0;//     const v0, 0x7f02000f
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Integer);
a=0;//     const-string v5, "zh_CN"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     const-string v5, "zh_TW"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     const-string v5, "zh_HK"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 71
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const v4, 0x7f02001d
a=0;// 
a=0;//     .line 72
a=0;//     #v4=(Integer);
a=0;//     const v2, 0x7f02001f
a=0;// 
a=0;//     move v11, v3
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v11
a=0;// 
a=0;//     .line 73
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_5
a=0;//     #v4=(Boolean);v5=(Reference,Ljava/lang/String;);v11=(Uninit);
a=0;//     const v4, 0x7f02001e
a=0;// 
a=0;//     .line 76
a=0;//     #v4=(Integer);
a=0;//     const v3, 0x7f020020
a=0;// 
a=0;//     .line 77
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
