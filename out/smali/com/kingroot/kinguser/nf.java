package com.kingroot.kinguser; class nf { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/nf;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private lU:Ljava/lang/String;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field protected oo:I
a=0;// 
a=0;// .field protected op:Lcom/kingroot/kinguser/nr;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 23
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nf;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/nf;->oo:I
a=0;// 
a=0;//     .line 19
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/nf;->op:Lcom/kingroot/kinguser/nr;
a=0;// 
a=0;//     .line 21
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/nf;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 24
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/nf;->oo:I
a=0;// 
a=0;//     .line 25
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nf;->lU:Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nq;->iB()Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/nf;->oo:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/ng;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/ng;);
a=0;//     invoke-direct {v2, p0}, Lcom/kingroot/kinguser/ng;-><init>(Lcom/kingroot/kinguser/nf;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ng;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/nq;->a(ILcom/kingroot/kinguser/nr;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aj(I)Lcom/kingroot/kinguser/b;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".dat"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 74
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nf;->ij()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_0
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/kinguser/uu;->b(Ljava/lang/String;Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nf;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nf;->ij()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v4, Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/b;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/kinguser/b;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     const-string v5, "UTF-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/ns;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     .line 86
a=0;//     return-object v0
a=0;// 
a=0;//     .line 78
a=0;//     :catch_0
a=0;//     #v1=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nf;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected ij()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nf;->lU:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract ik()V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract il()V
a=0;// .end method
a=0;// 
a=0;// .method public im()Lcom/kingroot/kinguser/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/nf;->oo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nf;->aj(I)Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/b;);
a=0;//     return-object v0
a=0;// .end method
}}
