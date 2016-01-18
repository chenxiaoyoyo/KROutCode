package android.support.v4.text; class TextDirectionHeuristicsCompat$AnyStrong { void a() { int a;
a=0;// .class Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INSTANCE_LTR:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;// .field public static final INSTANCE_RTL:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mLookForRtl:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->INSTANCE_RTL:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;//     .line 236
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->INSTANCE_LTR:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     #p0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;);
a=0;//     iput-boolean p1, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkRtl(Ljava/lang/CharSequence;II)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 206
a=0;//     .line 207
a=0;//     #v1=(One);
a=0;//     add-int v3, p2, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     if-ge p2, v3, :cond_2
a=0;// 
a=0;//     .line 208
a=0;//     invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-static {v4}, Ljava/lang/Character;->getDirectionality(C)B
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-static {v4}, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->access$200(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_1
a=0;//     add-int/lit8 p2, p2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :pswitch_0
a=0;//     iget-boolean v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v1=(PosByte);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 214
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 216
a=0;//     :pswitch_1
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 220
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 225
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 226
a=0;//     iget-boolean v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 228
a=0;//     :cond_3
a=0;//     #v1=(One);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 208
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
