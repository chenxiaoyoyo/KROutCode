package android.support.v4.view; class ViewGroupCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewGroupCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     .line 73
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 80
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewGroupCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
}}
