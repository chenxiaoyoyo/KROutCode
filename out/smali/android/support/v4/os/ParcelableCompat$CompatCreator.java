package android.support.v4.os; class ParcelableCompat$CompatCreator { void a() { int a;
a=0;// .class Landroid/support/v4/os/ParcelableCompat$CompatCreator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable$Creator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Landroid/support/v4/os/ParcelableCompat$CompatCreator;);
a=0;//     iput-object p1, p0, Landroid/support/v4/os/ParcelableCompat$CompatCreator;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Landroid/support/v4/os/ParcelableCompat$CompatCreator;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public newArray(I)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Landroid/support/v4/os/ParcelableCompat$CompatCreator;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->newArray(I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
