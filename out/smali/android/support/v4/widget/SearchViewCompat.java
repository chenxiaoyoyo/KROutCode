package android.support.v4.widget; class SearchViewCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SearchViewCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     new-instance v0, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     .line 262
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 258
a=0;//     new-instance v0, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 266
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SearchViewCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getQuery(Landroid/view/View;)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->getQuery(Landroid/view/View;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isIconified(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->isIconified(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isQueryRefinementEnabled(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->isQueryRefinementEnabled(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isSubmitButtonEnabled(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->isSubmitButtonEnabled(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static newSearchView(Landroid/content/Context;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->newSearchView(Landroid/content/Context;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static setIconified(Landroid/view/View;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setIconified(Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setImeOptions(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setImeOptions(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 304
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setInputType(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setInputType(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 317
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setMaxWidth(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setMaxWidth(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 518
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setOnCloseListener(Landroid/view/View;Landroid/support/v4/widget/SearchViewCompat$OnCloseListenerCompat;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     iget-object v1, p1, Landroid/support/v4/widget/SearchViewCompat$OnCloseListenerCompat;->mListener:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, p0, v1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setOnCloseListener(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setOnQueryTextListener(Landroid/view/View;Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     iget-object v1, p1, Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;->mListener:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, p0, v1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setOnQueryTextListener(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 328
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setQuery(Landroid/view/View;Ljava/lang/CharSequence;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setQuery(Landroid/view/View;Ljava/lang/CharSequence;Z)V
a=0;// 
a=0;//     .line 422
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setQueryHint(Landroid/view/View;Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setQueryHint(Landroid/view/View;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 433
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setQueryRefinementEnabled(Landroid/view/View;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setQueryRefinementEnabled(Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 501
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setSearchableInfo(Landroid/view/View;Landroid/content/ComponentName;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setSearchableInfo(Landroid/view/View;Landroid/content/ComponentName;)V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setSubmitButtonEnabled(Landroid/view/View;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setSubmitButtonEnabled(Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 472
a=0;//     return-void
a=0;// .end method
}}
