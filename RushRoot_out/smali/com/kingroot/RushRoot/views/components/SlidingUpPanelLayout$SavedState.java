package com.kingroot.RushRoot.views.components; class SlidingUpPanelLayout$SavedState { void a() { int a;
a=0;// .class Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1493
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/views/components/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/views/components/h;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/views/components/h;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/h;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1479
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 1481
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;);
a=0;//     const-class v0, Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1485
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1483
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/views/components/i;->b:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1470
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1475
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1476
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1489
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 1490
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/SlidingUpPanelLayout$SavedState;->a:Lcom/kingroot/RushRoot/views/components/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/i;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/i;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1491
a=0;//     return-void
a=0;// .end method
}}
