package com.kingroot.RushRoot; class au { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/au;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// .field private static b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 19
a=0;//     #v0=(Byte);
a=0;//     sput v0, Lcom/kingroot/RushRoot/au;->a:I
a=0;// 
a=0;//     .line 20
a=0;//     sput v0, Lcom/kingroot/RushRoot/au;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     sget v0, Lcom/kingroot/RushRoot/au;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 24
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrApplication;->a()Landroid/content/Context;
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
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/kingroot/RushRoot/au;->a:I
a=0;// 
a=0;//     .line 27
a=0;//     :cond_0
a=0;//     sget v0, Lcom/kingroot/RushRoot/au;->a:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;F)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 15
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static b()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     sget v0, Lcom/kingroot/RushRoot/au;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrApplication;->a()Landroid/content/Context;
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
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/kingroot/RushRoot/au;->b:I
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     sget v0, Lcom/kingroot/RushRoot/au;->b:I
a=0;// 
a=0;//     return v0
a=0;// .end method
}}
