package com.kingroot.kinguser; class ea { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/ea;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile ea done"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private eK:Ljava/lang/String;
a=0;// 
a=0;// .field private fh:Landroid/view/View;
a=0;// 
a=0;// .field private fi:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ea;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ea;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const-string p2, ""
a=0;// 
a=0;//     :cond_0
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/ea;->eK:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ea;->aU()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ea;->fh:Landroid/view/View;
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->fh:Landroid/view/View;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 38
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ea;->aV()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ea;->fi:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->fi:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ea;->aW()V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ea;->aI()V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public Y()Landroid/view/View;
a=0;//     #done Y() == getSingleView()
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->fh:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     #done
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract aU()Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method protected abstract aV()Landroid/view/ViewGroup;
a=0;// .end method
a=0;// 
a=0;// .method protected abstract aW()V
a=0;// .end method
a=0;// 
a=0;// .method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->fi:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->fi:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getContainer()Landroid/view/ViewGroup;
a=0;//     #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->fi:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLayoutInflater()Landroid/view/LayoutInflater;
a=0;//     #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/String;
a=0;//     #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ea;->eK:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}