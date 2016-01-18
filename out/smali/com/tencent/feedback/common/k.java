package com.tencent.feedback.common; class k { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/common/k;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 5
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/k;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/util/SparseArray;)Landroid/util/SparseArray;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 18
a=0;//     new-instance v1, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {p0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V
a=0;// 
a=0;//     .line 20
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p0, v0}, Landroid/util/SparseArray;->keyAt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {p0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 20
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 27
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
