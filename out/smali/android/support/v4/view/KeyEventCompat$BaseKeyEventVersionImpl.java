package android.support.v4.view; class KeyEventCompat$BaseKeyEventVersionImpl { void a() { int a;
a=0;// .class Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final META_ALL_MASK:I = 0xf7
a=0;// 
a=0;// .field private static final META_MODIFIER_MASK:I = 0xf7
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static metaStateFilterDirectionalModifiers(IIIII)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v1=(Null);
a=0;//     and-int v2, p1, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     or-int v3, p3, p4
a=0;// 
a=0;//     .line 57
a=0;//     #v3=(Integer);
a=0;//     and-int v4, p1, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 60
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "bad arguments"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Integer);v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 63
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     xor-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr p0, v0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     return p0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 65
a=0;//     xor-int/lit8 v0, p2, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr p0, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-virtual {p1, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isTracking(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public metaStateHasModifiers(II)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->normalizeMetaState(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xf7
a=0;// 
a=0;//     .line 85
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v1, p2, v0, v2, v3}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->metaStateFilterDirectionalModifiers(IIIII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v1, p2, v2, v3, v4}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->metaStateFilterDirectionalModifiers(IIIII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 89
a=0;//     if-ne v1, p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public metaStateHasNoModifiers(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->normalizeMetaState(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xf7
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public normalizeMetaState(I)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     and-int/lit16 v0, p1, 0xc0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     or-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     and-int/lit8 v1, v0, 0x30
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     and-int/lit16 v0, v0, 0xf7
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     move v0, p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startTracking(Landroid/view/KeyEvent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
}}
