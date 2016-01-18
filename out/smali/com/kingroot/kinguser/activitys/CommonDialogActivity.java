package com.kingroot.kinguser.activitys; class CommonDialogActivity { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/activitys/CommonDialogActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private de:Landroid/widget/TextView;
a=0;// 
a=0;// .field private df:Landroid/widget/TextView;
a=0;// 
a=0;// .field private dg:Landroid/widget/Button;
a=0;// 
a=0;// .field private dh:Landroid/widget/Button;
a=0;// 
a=0;// .field private di:Landroid/view/View;
a=0;// 
a=0;// .field private dj:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private dk:Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 223
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/activitys/CommonDialogActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic a(Lcom/kingroot/kinguser/activitys/CommonDialogActivity;)Lcom/kingroot/kinguser/ci;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dk:Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ci;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static synthetic b(Lcom/kingroot/kinguser/activitys/CommonDialogActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/String;I)Lcom/kingroot/kinguser/ci;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     new-instance v0, Lcom/kingroot/kinguser/cg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/cg;);
a=0;//     invoke-direct {v0, p0, p2, p1}, Lcom/kingroot/kinguser/cg;-><init>(Lcom/kingroot/kinguser/activitys/CommonDialogActivity;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/cg;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private o(I)Lcom/kingroot/kinguser/ci;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     new-instance v0, Lcom/kingroot/kinguser/cf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/cf;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/kinguser/cf;-><init>(Lcom/kingroot/kinguser/activitys/CommonDialogActivity;I)V
a=0;// 
a=0;//     .line 149
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/cf;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBackPressed()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dk:Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ci;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dk:Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, v1}, Lcom/kingroot/kinguser/ci;->p(I)V
a=0;// 
a=0;//     .line 203
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->finish()V
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const v10, 0x7f0a003e
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v8=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0, v9}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 62
a=0;//     const/high16 v0, 0x7f030000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "Title"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 66
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "Content"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 67
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "LeftBtn"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 68
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "RightBtn"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 70
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "Type"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 71
a=0;//     #v6=(Integer);
a=0;//     const-string v0, "WhereFrom"
a=0;// 
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v1, v0, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 73
a=0;//     #v7=(Integer);
a=0;//     const v0, 0x7f09002f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->de:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 74
a=0;//     const v0, 0x7f090031
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->df:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 75
a=0;//     const v0, 0x7f090033
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     .line 76
a=0;//     const v0, 0x7f090035
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     .line 77
a=0;//     const v0, 0x7f090034
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->di:Landroid/view/View;
a=0;// 
a=0;//     .line 78
a=0;//     const v0, 0x7f090030
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 80
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->de:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->df:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x12
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v0, v2, :cond_4
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->df:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->df:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ch;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ch;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/ch;-><init>(Lcom/kingroot/kinguser/activitys/CommonDialogActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ch;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 95
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ch;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ch;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/ch;-><init>(Lcom/kingroot/kinguser/activitys/CommonDialogActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ch;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 104
a=0;//     :cond_3
a=0;//     if-ne v9, v6, :cond_5
a=0;// 
a=0;//     .line 105
a=0;//     invoke-direct {p0, v7}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->o(I)Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dk:Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     const v1, 0x7f0a001a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/widget/Button;->setText(I)V
a=0;// 
a=0;//     .line 128
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Reference,Landroid/content/Intent;);v2=(PosByte);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->df:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_5
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ch;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v0, v6, :cond_7
a=0;// 
a=0;//     .line 110
a=0;//     const-string v0, "UpdatePath"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0, v0, v7}, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->d(Ljava/lang/String;I)Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dk:Lcom/kingroot/kinguser/ci;
a=0;// 
a=0;//     .line 112
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a002f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 114
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 116
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v0, v2, :cond_6
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v2, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 118
a=0;//     #v2=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     const/high16 v4, -0x10000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     const/16 v4, 0x21
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v3, v0, v1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->df:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dh:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const v1, 0x7f0a001c
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dg:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/widget/Button;->setText(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 126
a=0;//     :cond_7
a=0;//     #v0=(PosByte);v1=(Reference,Landroid/content/Intent;);v2=(Reference,Lcom/kingroot/kinguser/ch;);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;->dj:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
