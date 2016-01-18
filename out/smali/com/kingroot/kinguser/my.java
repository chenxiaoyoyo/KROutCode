package com.kingroot.kinguser; class my { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/my;
a=0;// .super Lcom/kingroot/kinguser/md;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected oh:Ljava/lang/String;
a=0;// 
a=0;// .field private oi:Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILjava/lang/String;Lcom/kingroot/kinguser/xx;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/md;-><init>(I)V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/my;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/my;->oi:Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/my;->oh:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/my;->oi:Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lcom/kingroot/kinguser/ym;Ljava/lang/String;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 70
a=0;//     iget v1, p2, Lcom/kingroot/kinguser/ym;->yA:I
a=0;// 
a=0;//     .line 71
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p2, Lcom/kingroot/kinguser/ym;->yC:Ljava/lang/String;
a=0;// 
a=0;//     .line 72
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p2, Lcom/kingroot/kinguser/ym;->lF:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/mv;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/mv;);
a=0;//     new-instance v5, Lcom/kingroot/kinguser/mz;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/mz;);
a=0;//     invoke-direct {v5, p0, v1, v2}, Lcom/kingroot/kinguser/mz;-><init>(Lcom/kingroot/kinguser/my;ILjava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/mz;);
a=0;//     invoke-direct {v4, p1, v0, v5}, Lcom/kingroot/kinguser/mv;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kingroot/kinguser/mx;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/mv;);
a=0;//     invoke-static {v3, p3, v4}, Lcom/kingroot/kinguser/mm;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/mv;)V
a=0;// 
a=0;//     .line 96
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 153
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/kinguser/my;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_1
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 158
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/kinguser/my;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_2
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_3
a=0;// 
a=0;//     .line 162
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/kinguser/my;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 163
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fi;->K(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 164
a=0;//     :cond_3
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     invoke-direct {p0, p2, p3}, Lcom/kingroot/kinguser/my;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 167
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fi;->K(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/my;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/my;->g(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/my;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/kinguser/my;->b(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ai(I)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "exeFile_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "jarFile_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".dex"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     .line 177
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {p2}, Lcom/kingroot/kinguser/mf;->bj(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/kinguser/my;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0, v2, v3}, Lcom/kingroot/kinguser/my;->g(II)V
a=0;// 
a=0;//     .line 203
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "rm "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v2, v0}, Lcom/kingroot/kinguser/my;->g(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v2, v0}, Lcom/kingroot/kinguser/my;->g(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private g(II)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/my;->oi:Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xx;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/my;->oh:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 124
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/my;->oh:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/my;->oi:Lcom/kingroot/kinguser/xx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/xx;);
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/xx;->nO:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, p2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/mf;->a(Ljava/lang/String;IIIII)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yb;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yb;-><init>()V
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yb;);
a=0;//     iput-object v6, v0, Lcom/kingroot/kinguser/yb;->wP:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 138
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mh;->a(Lcom/kingroot/kinguser/yb;)V
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     const-string v0, "export CLASSPATH=%s && /system/bin/app_process /system/bin %s"
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput-object p2, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "%s %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public d([B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ym;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ym;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ym;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ym;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/my;->a([BLcom/kingroot/kinguser/afv;)V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hP()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(PosByte);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/my;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/afv;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/my;->nK:Lcom/kingroot/kinguser/afv;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/afv;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ym;
a=0;// 
a=0;//     .line 51
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/ym;->yA:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/my;->ai(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 53
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/my;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v2, v0, v1}, Lcom/kingroot/kinguser/my;->a(Landroid/content/Context;Lcom/kingroot/kinguser/ym;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
}}
