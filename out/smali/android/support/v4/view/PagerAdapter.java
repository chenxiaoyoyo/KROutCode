package android.support.v4.view; class PagerAdapter { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/view/PagerAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final POSITION_NONE:I = -0x2
a=0;// 
a=0;// .field public static final POSITION_UNCHANGED:I = -0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mObservable:Landroid/database/DataSetObservable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     new-instance v0, Landroid/database/DataSetObservable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/database/DataSetObservable;);
a=0;//     invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObservable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public destroyItem(Landroid/view/View;ILjava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Required method destroyItem was not overridden"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/View;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public finishUpdate(Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public finishUpdate(Landroid/view/ViewGroup;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/View;)V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract getCount()I
a=0;// .end method
a=0;// 
a=0;// .method public getItemPosition(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPageTitle(I)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPageWidth(I)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Required method instantiateItem was not overridden"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObservable;);
a=0;//     invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V
a=0;// 
a=0;//     .line 277
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObservable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public saveState()Landroid/os/Parcelable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/PagerAdapter;->setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startUpdate(Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startUpdate(Landroid/view/ViewGroup;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/View;)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObservable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 295
a=0;//     return-void
a=0;// .end method
}}
