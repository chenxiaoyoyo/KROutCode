package com.kingroot.kinguser; class wh { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/wh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static lX()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 29
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 32
a=0;//     iget v1, v1, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     mul-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     .line 37
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
}}
