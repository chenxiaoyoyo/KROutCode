package com.kingroot.kinguser; class ej { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/ej;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static A(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     const/16 v2, 0x2d
a=0;// 
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static B(Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x73
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 238
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     .line 239
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     const/16 v2, 0x2d
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     if-ne v1, v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 241
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Ljava/io/File;Lcom/kingroot/kinguser/za;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 162
a=0;//     .line 163
a=0;//     #v2=(One);
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/ej;->A(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 165
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 167
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/hx;->dE()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 168
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 169
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/uu;->o(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/uu;->o(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 175
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/ej;->B(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 176
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/ej;->g(Ljava/io/File;)V
a=0;// 
a=0;//     .line 197
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p2, v3}, Lcom/kingroot/kinguser/za;->cI(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p2, v1}, Lcom/kingroot/kinguser/za;->bA(I)V
a=0;// 
a=0;//     .line 201
a=0;//     :goto_2
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(One);v3=(Boolean);v4=(Uninit);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 163
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 186
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Boolean);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_5
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/gr;->ad(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 189
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 191
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/ej;->g(Ljava/io/File;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 193
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v4=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Null);v1=(PosByte);v3=(Boolean);v4=(Uninit);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 201
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static bc()Lcom/kingroot/kinguser/ys;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ys;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ys;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ys;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ys;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->eZ()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/ys;->br(I)V
a=0;// 
a=0;//     .line 85
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/util/ArrayList;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yr;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yr;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yr;);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/yr;->q(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 37
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/yr;)I
a=0;// 
a=0;//     .line 39
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/ej;->d(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/util/ArrayList;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fd;->bN()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "KuStatus"
a=0;// 
a=0;//     .line 50
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->ff()I
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yq;
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yq;->getTime()J
a=0;// 
a=0;//     .line 56
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yq;->mm()Lcom/kingroot/kinguser/za;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yq;->mn()Lcom/kingroot/kinguser/ys;
a=0;// 
a=0;//     .line 52
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static g(Ljava/io/File;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gr;->ab(Ljava/lang/String;)Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 206
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 209
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 211
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fa()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fd()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v2, v3, :cond_2
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fd()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/jc;->M(I)V
a=0;// 
a=0;//     .line 214
a=0;//     sget-object v2, Lcom/kingroot/kinguser/et;->fD:Ljava/lang/String;
a=0;// 
a=0;//     .line 216
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/wm;->Y(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fb()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wm;->shutdown()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :catch_0
a=0;//     #v3=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static u(I)Lcom/kingroot/kinguser/yq;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/kingroot/kinguser/yq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/yq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/yq;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/yq;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/yq;->setTime(J)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/ej;->v(I)Lcom/kingroot/kinguser/za;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/za;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/yq;->a(Lcom/kingroot/kinguser/za;)V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ej;->bc()Lcom/kingroot/kinguser/ys;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/yq;->a(Lcom/kingroot/kinguser/ys;)V
a=0;// 
a=0;//     .line 79
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static v(I)Lcom/kingroot/kinguser/za;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/za;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/za;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/kinguser/za;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/za;);
a=0;//     invoke-virtual {v4, p0}, Lcom/kingroot/kinguser/za;->by(I)V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eM()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/za;->bz(I)V
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {v4, v2}, Lcom/kingroot/kinguser/za;->bA(I)V
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v4, v2}, Lcom/kingroot/kinguser/za;->bB(I)V
a=0;// 
a=0;//     .line 100
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/za;->cG(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/za;->cH(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/za;->cI(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     const-wide/16 v5, 0xbb8
a=0;// 
a=0;//     .line 106
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 108
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vu;->ls()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v7, 0xe
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-lt v3, v7, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v3, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v7, "sud"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "ku.sud --ping"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v7, v8, v5, v6}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->hc:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v3, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v8, "bin"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "ls -l %s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-array v10, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v11, Lcom/kingroot/kinguser/gs;->hc:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     aput-object v11, v10, v2
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v3, v8, v9, v5, v6}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 117
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v8, Ljava/io/File;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->hd:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v8}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v3, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v9, "xbin"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "ls -l %s"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-array v11, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v12, Lcom/kingroot/kinguser/gs;->hd:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     aput-object v12, v11, v2
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v3, v9, v10, v5, v6}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 122
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 123
a=0;//     :cond_3
a=0;//     new-instance v3, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v9, "v"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "su -v"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v9, v10, v5, v6}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v3, Lcom/kingroot/kinguser/wp;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/wp;);
a=0;//     const-string v9, "V"
a=0;// 
a=0;//     const-string v10, "su -V"
a=0;// 
a=0;//     invoke-direct {v3, v9, v10, v5, v6}, Lcom/kingroot/kinguser/wp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/wp;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 127
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v3, "sh"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/kinguser/gr;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 130
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Boolean);v6=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_c
a=0;// 
a=0;//     .line 131
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 130
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Null);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_6
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);v2=(Integer);v3=(Boolean);v5=(Reference,Ljava/util/List;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/io/File;);v8=(Reference,Ljava/io/File;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     const-string v9, "bin"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     .line 137
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v7, v4}, Lcom/kingroot/kinguser/ej;->a(Ljava/lang/String;Ljava/io/File;Lcom/kingroot/kinguser/za;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 140
a=0;//     :cond_7
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "xbin"
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 141
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v8, v4}, Lcom/kingroot/kinguser/ej;->a(Ljava/lang/String;Ljava/io/File;Lcom/kingroot/kinguser/za;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 144
a=0;//     :cond_8
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "v"
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, ""
a=0;// 
a=0;//     invoke-virtual {v0, v6, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/za;->cG(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 146
a=0;//     :cond_9
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);v6=(Boolean);
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "V"
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, ""
a=0;// 
a=0;//     invoke-virtual {v0, v6, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/za;->cH(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 149
a=0;//     :cond_a
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);v6=(Boolean);
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "sud"
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "kinguser_su"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v4, v1}, Lcom/kingroot/kinguser/za;->bB(I)V
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 156
a=0;//     :cond_c
a=0;//     #v0=(Integer);
a=0;//     return-object v4
a=0;// .end method
}}
