package com.kingroot.RushRoot; class dd { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/RushRoot/dd;
a=0;// .super Lcom/kingroot/RushRoot/cv;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/widget/TextView;
a=0;// 
a=0;// .field private c:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/cv;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/dd;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/dd;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const v1, 0x7f050021
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/16 v1, 0x30
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 28
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dd;->a:Landroid/widget/Button;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dd;->a:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 33
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Landroid/text/SpannableString;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     new-instance v0, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {v0, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 81
a=0;//     #v0=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v1, Landroid/text/style/RelativeSizeSpan;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/style/RelativeSizeSpan;);
a=0;//     const v2, 0x3ef0a3d7    # 0.47f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, v2}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/style/RelativeSizeSpan;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Landroid/text/SpannableString;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x21
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 83
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(II)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x270f
a=0;// 
a=0;//     .line 46
a=0;//     #v5=(PosShort);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/dd;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     div-int/lit8 v1, p1, 0x3c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     rem-int/lit8 v2, p1, 0x3c
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     const v1, 0x7f08002d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/RushRoot/dd;->d(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/dd;->a(Ljava/lang/String;)Landroid/text/SpannableString;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     const v1, 0x7f08002e
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/RushRoot/dd;->d(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/dd;->a(Ljava/lang/String;)Landroid/text/SpannableString;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/dd;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     if-le p2, v5, :cond_0
a=0;// 
a=0;//     const-string v0, "9999"
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     if-le p2, v5, :cond_1
a=0;// 
a=0;//     const-string v0, "+"
a=0;// 
a=0;//     :goto_1
a=0;//     new-instance v3, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/dd;->a(Ljava/lang/String;)Landroid/text/SpannableString;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const v0, 0x7f08002f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/dd;->d(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected final c()Landroid/view/View;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     const v0, 0x7f030011
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/dd;->b(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 39
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const v0, 0x7f050038
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/dd;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 40
a=0;//     const v0, 0x7f050039
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/dd;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 42
a=0;//     return-object v1
a=0;// .end method
}}
