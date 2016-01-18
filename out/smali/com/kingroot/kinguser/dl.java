package com.kingroot.kinguser; class dl { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/dl;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic eE:Lcom/kingroot/kinguser/app/KUApplication;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/app/KUApplication;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/dl;->eE:Lcom/kingroot/kinguser/app/KUApplication;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 141
a=0;//     #v7=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0, v7}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     .line 144
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lG()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/AbsApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v1, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     const-string v2, "u:object_r:app_data_file:s0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 152
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/hx;->a(Ljava/lang/String;Lcom/kingroot/kinguser/hz;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 155
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     const-string v3, "chcon %s %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v6, "u:object_r:app_data_file:s0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     aput-object v0, v4, v7
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vn;->fg()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/jc;->G(Z)V
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ho;->dv()V
a=0;// 
a=0;//     .line 176
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/gg;->cF()I
a=0;// 
a=0;//     .line 179
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cw()V
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jt;->gW()V
a=0;// 
a=0;//     .line 184
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gn()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     invoke-static {v7}, Lcom/kingroot/kinguser/jt;->aa(I)Z
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
}}
