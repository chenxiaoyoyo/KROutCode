package com.kingroot.kinguser; class uf { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/uf;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/uf;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static J(Ljava/util/List;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ug;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ug;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ug;-><init>(Ljava/util/List;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ug;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ug;->lP()Z
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/kinguser/uk;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     .line 92
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/uk;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ui;->bM(Ljava/lang/String;)Lcom/kingroot/kinguser/uj;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/uj;->kH()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 97
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/uu;->n(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 98
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/uj;->b(Lcom/kingroot/kinguser/uj;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v4, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 104
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/uk;->kF()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 107
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/uk;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/uu;->n(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 111
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v3, Lcom/kingroot/kinguser/uj;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/uj;);
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/uk;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Lcom/kingroot/kinguser/uj;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/uj;);
a=0;//     invoke-virtual {v3, v1, v2}, Lcom/kingroot/kinguser/uj;->Q(J)V
a=0;// 
a=0;//     .line 113
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ui;->a(Lcom/kingroot/kinguser/uj;)V
a=0;// 
a=0;//     .line 117
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
