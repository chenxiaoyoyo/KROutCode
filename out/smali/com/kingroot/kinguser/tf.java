package com.kingroot.kinguser; class tf { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tf;
a=0;// .super Lcom/kingroot/kinguser/sz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ta:I
a=0;// 
a=0;// .field private tb:I
a=0;// 
a=0;// .field private tc:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 20
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/sz;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/tf;);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->ta:I
a=0;// 
a=0;//     .line 12
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->tb:I
a=0;// 
a=0;//     .line 13
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->tc:I
a=0;// 
a=0;//     .line 21
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/tf;->bD(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private bD(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/tf;->bC(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/tf;->ta:I
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/tf;->tb:I
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->tc:I
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public km()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/tf;->ta:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 42
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/tf;->tb:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 43
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/tf;->tc:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/tf;->H(Ljava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public n(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 51
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/tf;->ta:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p2
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->ta:I
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 52
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 53
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/tf;->tb:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p2
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->tb:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/tf;->tc:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p2
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/tf;->tc:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
