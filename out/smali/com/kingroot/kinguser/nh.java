package com.kingroot.kinguser; class nh { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/nh;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private lU:Ljava/lang/String;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private or:Lcom/kingroot/kinguser/mv;
a=0;// 
a=0;// .field private os:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nh;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nj;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/nj;-><init>(Lcom/kingroot/kinguser/nh;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nj;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nh;->os:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 22
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nh;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nh;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nh;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 24
a=0;//     new-instance v0, Lcom/kingroot/kinguser/mv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/mv;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nh;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nh;->lU:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/ni;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/ni;);
a=0;//     invoke-direct {v3, p0}, Lcom/kingroot/kinguser/ni;-><init>(Lcom/kingroot/kinguser/nh;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ni;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/kingroot/kinguser/mv;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kingroot/kinguser/mx;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mv;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nh;->or:Lcom/kingroot/kinguser/mv;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/nh;)Lcom/kingroot/kinguser/mv;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nh;->or:Lcom/kingroot/kinguser/mv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mv;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected abstract c(Lcom/kingroot/kinguser/nu;)V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract d(Lcom/kingroot/kinguser/nu;)V
a=0;// .end method
a=0;// 
a=0;// .method protected ij()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nh;->lU:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public in()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nh;->os:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vz;->aA(Z)Z
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract io()Ljava/util/List;
a=0;// .end method
}}
