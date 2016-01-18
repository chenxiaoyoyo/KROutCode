package com.kingroot.kinguser; class de { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/de;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private em:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private en:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// .field private eo:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/de;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/de;->em:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/de;->em:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemViewType(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/de;->em:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kp;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/kp;->lc:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const v5, 0x7f09006e
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/de;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 89
a=0;//     #v4=(Integer);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v3, Lcom/kingroot/kinguser/di;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/di;);
a=0;//     invoke-direct {v3, p0}, Lcom/kingroot/kinguser/di;-><init>(Lcom/kingroot/kinguser/de;)V
a=0;// 
a=0;//     .line 92
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/di;);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     .line 166
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/view/View;);v5=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object p2, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 172
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->em:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/kingroot/kinguser/kp;
a=0;// 
a=0;//     .line 174
a=0;//     packed-switch v4, :pswitch_data_1
a=0;// 
a=0;//     .line 285
a=0;//     :goto_2
a=0;//     :pswitch_0
a=0;//     #v4=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     .line 94
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference,Lcom/kingroot/kinguser/di;);v4=(Integer);v5=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f03001b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 95
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 100
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f03001a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f030014
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 107
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 108
a=0;//     const v1, 0x7f090071
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->et:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
a=0;//     const v1, 0x7f09005c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 110
a=0;//     const v1, 0x7f090030
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->ey:Landroid/view/View;
a=0;// 
a=0;//     .line 111
a=0;//     if-ne v8, v4, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     const v1, 0x7f090070
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->es:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v1, v3, Lcom/kingroot/kinguser/di;->es:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     :pswitch_4
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f030013
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 120
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 121
a=0;//     const v1, 0x7f09006f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :pswitch_5
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f030012
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 136
a=0;//     const v1, 0x7f090061
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 138
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     .line 143
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 140
a=0;//     #v1=(Reference,Ljava/lang/ClassCastException;);
a=0;//     instance-of v1, v2, Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     check-cast v2, Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     iput-object v2, v3, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     :cond_1
a=0;//     move-object v2, p2
a=0;// 
a=0;//     .line 145
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :pswitch_6
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f030015
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 149
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     const v1, 0x7f09003b
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->ew:Landroid/widget/Button;
a=0;// 
a=0;//     .line 150
a=0;//     const v1, 0x7f090042
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/di;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     iget-object v5, v3, Lcom/kingroot/kinguser/di;->ew:Landroid/widget/Button;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Button;);
a=0;//     invoke-direct {v1, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/de;->en:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     iget-object v5, v3, Lcom/kingroot/kinguser/di;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-direct {v1, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/de;->eo:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :pswitch_7
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/de;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f030019
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/kingroot/kinguser/di;
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/di;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 176
a=0;//     :pswitch_8
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 181
a=0;//     :pswitch_9
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v5, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->et:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v5, v1, Lcom/kingroot/kinguser/kp;->lo:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 184
a=0;//     iget v3, v1, Lcom/kingroot/kinguser/kp;->ll:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v5, 0x13
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v3, v5, :cond_3
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/kinguser/kp;->ll:I
a=0;// 
a=0;//     const/16 v5, 0x22
a=0;// 
a=0;//     if-ne v3, v5, :cond_5
a=0;// 
a=0;//     .line 186
a=0;//     :cond_3
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ey:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 190
a=0;//     :goto_3
a=0;//     if-ne v8, v4, :cond_4
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/di;->es:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/kp;->ln:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 193
a=0;//     :cond_4
a=0;//     invoke-virtual {p2, v7}, Landroid/view/View;->setClickable(Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 188
a=0;//     :cond_5
a=0;//     #v3=(Integer);
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ey:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 198
a=0;//     :pswitch_a
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v4, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->et:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/kp;->lo:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v1, v2, Lcom/kingroot/kinguser/di;->ev:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, v2, Lcom/kingroot/kinguser/di;->ey:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {p2, v9}, Landroid/view/View;->setClickable(Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 207
a=0;//     :pswitch_b
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 212
a=0;//     :pswitch_c
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->er:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v4, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     iget-boolean v4, v1, Lcom/kingroot/kinguser/kp;->lt:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingcore/uilib/QSwitchCheckBox;->setEnabled(Z)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     iget-boolean v4, v1, Lcom/kingroot/kinguser/kp;->lt:Z
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingcore/uilib/QSwitchCheckBox;->setFocusable(Z)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     iget-boolean v4, v1, Lcom/kingroot/kinguser/kp;->lt:Z
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingcore/uilib/QSwitchCheckBox;->setClickable(Z)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-boolean v3, v1, Lcom/kingroot/kinguser/kp;->lt:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-virtual {v3, v6}, Lcom/kingcore/uilib/QSwitchCheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-boolean v3, v1, Lcom/kingroot/kinguser/kp;->ls:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-virtual {v3, v9}, Lcom/kingcore/uilib/QSwitchCheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 225
a=0;//     :goto_4
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/kinguser/df;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/df;);
a=0;//     invoke-direct {v3, p0, v1}, Lcom/kingroot/kinguser/df;-><init>(Lcom/kingroot/kinguser/de;Lcom/kingroot/kinguser/kp;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/df;);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingcore/uilib/QSwitchCheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 222
a=0;//     :cond_6
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingcore/uilib/QSwitchCheckBox;);
a=0;//     invoke-virtual {v3, v7}, Lcom/kingcore/uilib/QSwitchCheckBox;->setChecked(Z)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 236
a=0;//     :cond_7
a=0;//     #v3=(Boolean);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/di;->eu:Lcom/kingcore/uilib/QSwitchCheckBox;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingcore/uilib/QSwitchCheckBox;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/view/ViewGroup;
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/kinguser/dg;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/dg;);
a=0;//     invoke-direct {v3, p0, v1}, Lcom/kingroot/kinguser/dg;-><init>(Lcom/kingroot/kinguser/de;Lcom/kingroot/kinguser/kp;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/dg;);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 248
a=0;//     :pswitch_d
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ew:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     iget-object v4, v1, Lcom/kingroot/kinguser/kp;->lv:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 249
a=0;//     iget v3, v1, Lcom/kingroot/kinguser/kp;->mProgress:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_8
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ew:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v1, v2, Lcom/kingroot/kinguser/di;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 254
a=0;//     :cond_8
a=0;//     #v3=(Integer);
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ew:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, v1, Lcom/kingroot/kinguser/kp;->lm:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "("
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v1, Lcom/kingroot/kinguser/kp;->mProgress:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "%)"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v3, v2, Lcom/kingroot/kinguser/di;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/kp;->mProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v1, v2, Lcom/kingroot/kinguser/di;->ex:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v1, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 92
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 174
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_8
a=0;//         :pswitch_b
a=0;//         :pswitch_9
a=0;//         :pswitch_c
a=0;//         :pswitch_a
a=0;//         :pswitch_d
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_9
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getViewTypeCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
}}
