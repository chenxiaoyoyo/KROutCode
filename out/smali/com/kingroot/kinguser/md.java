package com.kingroot.kinguser; class md { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/md;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mContext:Landroid/content/Context;
a=0;// 
a=0;// .field protected nJ:I
a=0;// 
a=0;// .field protected nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/md;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/md;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 22
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/md;->nJ:I
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a([BLcom/kingroot/kinguser/afv;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/kingroot/kinguser/afp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/afp;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/afp;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afp;);
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/afp;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/afp;->p([B)V
a=0;// 
a=0;//     .line 41
a=0;//     const-string v1, "cloudcmd"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/kingroot/kinguser/afp;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/md;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract d([B)V
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/md;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract hP()I
a=0;// .end method
}}