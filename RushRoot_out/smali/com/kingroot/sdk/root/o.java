package com.kingroot.sdk.root; class o { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/o;
a=0;// .super Landroid/content/ContextWrapper;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Landroid/content/res/AssetManager;
a=0;// 
a=0;// .field private c:Landroid/content/res/Resources;
a=0;// 
a=0;// .field private d:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/o;);
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/root/o;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 21
a=0;//     :try_start_0
a=0;//     const-class v0, Landroid/content/res/AssetManager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/res/AssetManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     const-string v2, "addAssetPath"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/o;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/o;->b:Landroid/content/res/AssetManager;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/content/res/Resources;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/res/Resources;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/o;->b:Landroid/content/res/AssetManager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v0}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     iput-object v1, p0, Lcom/kingroot/sdk/root/o;->c:Landroid/content/res/Resources;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/o;->c:Landroid/content/res/Resources;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/o;->d:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/o;->d:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     invoke-super {p0}, Landroid/content/ContextWrapper;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// 
a=0;//     .line 21
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final getAssets()Landroid/content/res/AssetManager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/o;->b:Landroid/content/res/AssetManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/AssetManager;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getResources()Landroid/content/res/Resources;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/o;->c:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     return-object v0
a=0;// .end method
}}
