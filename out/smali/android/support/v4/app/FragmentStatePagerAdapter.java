package android.support.v4.app; class FragmentStatePagerAdapter { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/app/FragmentStatePagerAdapter;
a=0;// .super Landroid/support/v4/view/PagerAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "FragmentStatePagerAdapter"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;// .field private mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field private final mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;// .field private mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/app/FragmentManager;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 75
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentStatePagerAdapter;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 73
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 76
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 126
a=0;//     #v2=(Null);
a=0;//     check-cast p3, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, p2, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v1, p3}, Landroid/support/v4/app/FragmentManager;->saveFragmentInstanceState(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment$SavedState;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public finishUpdate(Landroid/view/ViewGroup;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
a=0;// 
a=0;//     .line 162
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract getItem(I)Landroid/support/v4/app/Fragment;
a=0;// .end method
a=0;// 
a=0;// .method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p2, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 96
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;->getItem(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p2, :cond_2
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment$SavedState;
a=0;// 
a=0;//     .line 109
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/app/Fragment;->setInitialSavedState(Landroid/support/v4/app/Fragment$SavedState;)V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, p2, :cond_3
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 116
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 121
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     check-cast p2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 196
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     .line 197
a=0;//     check-cast p1, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "states"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 200
a=0;//     #v3=(Reference,[Landroid/os/Parcelable;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 202
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 203
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment$SavedState;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment$SavedState;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 203
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 208
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 209
a=0;//     const-string v3, "f"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 211
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v4, p1, v0}, Landroid/support/v4/app/FragmentManager;->getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 212
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 213
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v3, :cond_2
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 216
a=0;//     :cond_2
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     invoke-virtual {v4, v2}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 219
a=0;//     :cond_3
a=0;//     const-string v3, "FragmentStatePagerAdapter"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Bad fragment at key "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 224
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public saveState()Landroid/os/Parcelable;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 177
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Landroid/support/v4/app/Fragment$SavedState;
a=0;// 
a=0;//     .line 178
a=0;//     #v1=(Reference,[Landroid/support/v4/app/Fragment$SavedState;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 179
a=0;//     const-string v2, "states"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Reference,Landroid/os/Bundle;);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 183
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 184
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     invoke-virtual {v4, v2, v3, v0}, Landroid/support/v4/app/FragmentManager;->putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 181
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_3
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v1=(Null);
a=0;//     check-cast p3, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eq p3, v0, :cond_2
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {p3, v2}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual {p3, v2}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
a=0;// 
a=0;//     .line 154
a=0;//     :cond_1
a=0;//     iput-object p3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startUpdate(Landroid/view/ViewGroup;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
}}
