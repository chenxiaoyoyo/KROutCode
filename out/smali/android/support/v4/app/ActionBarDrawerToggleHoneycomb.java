package android.support.v4.app; class ActionBarDrawerToggleHoneycomb { void a() { int a;
a=0;// .class Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;// .field private static final THEME_ATTRS:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x101030b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;->THEME_ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 92
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getThemeUpIndicator(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;->THEME_ATTRS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 89
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static setActionBarDescription(Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v1, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;);
a=0;//     invoke-direct {v1, p1}, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 73
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v2, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 78
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 79
a=0;//     const-string v2, "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;//     const-string v3, "Couldn\'t set content description via JB-MR2 API"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setActionBarUpIndicator(Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v1, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;);
a=0;//     invoke-direct {v1, p1}, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v2, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v3, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p2, v4, v5
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 65
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 57
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 58
a=0;//     const-string v2, "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;//     const-string v3, "Couldn\'t set home-as-up indicator via JB-MR2 API"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     const-string v0, "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;//     const-string v2, "Couldn\'t set home-as-up indicator"
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
}}
