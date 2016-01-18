package android.support.v4.graphics.drawable; class DrawableCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/graphics/drawable/DrawableCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;);
a=0;//     sput-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     .line 63
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;);
a=0;//     sput-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
}}
