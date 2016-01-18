package com.kingroot.kinguser.baseui; class TransparentListView { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/baseui/TransparentListView;
a=0;// .super Landroid/widget/ListView;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/baseui/TransparentListView;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/baseui/TransparentListView;->aY()V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/baseui/TransparentListView;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/baseui/TransparentListView;->aY()V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/baseui/TransparentListView;);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/baseui/TransparentListView;->aY()V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aY()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 18
a=0;//     :try_start_0
a=0;//     const-class v0, Lcom/kingroot/kinguser/baseui/TransparentListView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "setOverscrollFooter"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 20
a=0;//     const-class v1, Lcom/kingroot/kinguser/baseui/TransparentListView;
a=0;// 
a=0;//     const-string v2, "setOverscrollHeader"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 24
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 25
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     aput-object v3, v0, v2
a=0;// 
a=0;//     invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 26
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);v3=(Reference,[Ljava/lang/Class;);v4=(Null);v5=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 27
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 33
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 34
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 28
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/reflect/Method;);v3=(Reference,[Ljava/lang/Class;);v4=(Null);v5=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 29
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 35
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 30
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/reflect/Method;);v3=(Reference,[Ljava/lang/Class;);v4=(Null);v5=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 31
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
