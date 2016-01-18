package android.support.v4.app; class ActionBarDrawerToggle { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ActionBarDrawerToggle;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ID_HOME:I = 0x102002c
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActivity:Landroid/app/Activity;
a=0;// 
a=0;// .field private final mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;// .field private final mCloseDrawerContentDescRes:I
a=0;// 
a=0;// .field private mDrawerImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private final mDrawerImageResource:I
a=0;// 
a=0;// .field private mDrawerIndicatorEnabled:Z
a=0;// 
a=0;// .field private final mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;// .field private final mOpenDrawerContentDescRes:I
a=0;// 
a=0;// .field private mSetIndicatorInfo:Ljava/lang/Object;
a=0;// 
a=0;// .field private mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;// .field private mThemeImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v2=(Null);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v0, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;);
a=0;//     invoke-direct {v0, v2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;);
a=0;//     sput-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
a=0;// 
a=0;//     .line 150
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;);
a=0;//     invoke-direct {v0, v2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;III)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 158
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     .line 190
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 191
a=0;//     iput-object p2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     .line 192
a=0;//     iput p3, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImageResource:I
a=0;// 
a=0;//     .line 193
a=0;//     iput p4, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
a=0;// 
a=0;//     .line 194
a=0;//     iput p5, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mThemeImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;-><init>(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     const v1, 0x3eaaaaab
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffsetBy(F)V
a=0;// 
a=0;//     .line 202
a=0;//     instance-of v0, p1, Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     check-cast p1, Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;->getDrawerToggleDelegate()Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 360
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->getThemeUpIndicator(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerIndicatorEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mThemeImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImageResource:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 272
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->syncState()V
a=0;// 
a=0;//     .line 273
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDrawerClosed(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffset(F)V
a=0;// 
a=0;//     .line 340
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 341
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarDescription(I)V
a=0;// 
a=0;//     .line 343
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDrawerOpened(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffset(F)V
a=0;// 
a=0;//     .line 325
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarDescription(I)V
a=0;// 
a=0;//     .line 328
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDrawerSlide(Landroid/view/View;F)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     .line 306
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->getOffset()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 307
a=0;//     #v0=(Float);
a=0;//     cmpl-float v1, p2, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 308
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sub-float v2, p2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 312
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffset(F)V
a=0;// 
a=0;//     .line 313
a=0;//     return-void
a=0;// 
a=0;//     .line 310
a=0;//     :cond_0
a=0;//     #v1=(Byte);
a=0;//     mul-float v1, p2, v3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDrawerStateChanged(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 354
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const v2, 0x800003
a=0;// 
a=0;//     .line 285
a=0;//     #v2=(Integer);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0x102002c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(I)V
a=0;// 
a=0;//     .line 291
a=0;//     :goto_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 293
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 293
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setActionBarDescription(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->setActionBarDescription(I)V
a=0;// 
a=0;//     .line 379
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-interface {v0, v1, v2, p1}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->setActionBarDescription(Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 365
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 370
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 368
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-interface {v0, v1, v2, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->setActionBarUpIndicator(Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerIndicatorEnabled(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const v2, 0x800003
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 249
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     .line 251
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 244
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);v2=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 247
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mThemeImage:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public syncState()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const v2, 0x800003
a=0;// 
a=0;//     .line 219
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffset(F)V
a=0;// 
a=0;//     .line 225
a=0;//     :goto_0
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffset(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 226
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
}}
