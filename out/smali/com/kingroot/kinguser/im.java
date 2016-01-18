package com.kingroot.kinguser; class im { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/im;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile iL:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;// .field private static iM:J
a=0;// 
a=0;// .field private static iN:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private iO:Z
a=0;// 
a=0;// .field private iP:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     const-wide/16 v0, 0xbb8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/kingroot/kinguser/im;->iM:J
a=0;// 
a=0;//     .line 72
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     sput-wide v0, Lcom/kingroot/kinguser/im;->iN:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/im;->iO:Z
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/im;->iP:Ljava/util/List;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private av(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/kinguser/im;->c(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/kinguser/rx;->B(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aw(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 279
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 280
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->dq()Lcom/kingroot/kinguser/hn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/hn;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 292
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/gz;->l(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 295
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 281
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Boolean);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hd:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hc:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 283
a=0;//     :cond_3
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->do()Lcom/kingroot/kinguser/hn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/hn;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 284
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hj:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 285
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->dn()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :cond_5
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ho;->dw()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     const-string v2, "/system/bin/ddexe"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 288
a=0;//     :cond_6
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gz;->dm()Lcom/kingroot/kinguser/hn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/hn;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private ax(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 304
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/hi;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/hi;);
a=0;//     invoke-direct {v1, p1}, Lcom/kingroot/kinguser/hi;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/hi;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 305
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gz;->l(Ljava/util/List;)Z
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ay(Ljava/lang/String;)Lcom/kingroot/kinguser/io;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 309
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 319
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/io;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/im;->iP:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/io;
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/io;->iR:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 319
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(ILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     const-string v0, "%d:%s"
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
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 208
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static dR()Lcom/kingroot/kinguser/im;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget-object v0, Lcom/kingroot/kinguser/im;->iL:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     const-class v1, Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 84
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/im;->iL:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/im;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/im;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/im;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/im;->iL:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 90
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/im;->iL:Lcom/kingroot/kinguser/im;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 87
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private dS()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/im;->dT()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/kinguser/im;->c(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private dT()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 221
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/gs;->hd:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 222
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 223
a=0;//     sget-object v1, Lcom/kingroot/kinguser/gs;->hc:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 224
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 227
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gp;->cW()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 229
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hj:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 230
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hk:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hm:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 233
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 236
a=0;//     sget-object v1, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 237
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 240
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ho;->dw()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 241
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 242
a=0;//     const-string v1, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 243
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 244
a=0;//     const-string v1, "/system/bin/ddexe_real"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 252
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 254
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public au(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/im;->dS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/kinguser/rx;->B(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v1, Lcom/kingroot/kinguser/in;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/in;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/in;-><init>(Lcom/kingroot/kinguser/im;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/in;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/in;->C(Ljava/util/List;)Z
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dU()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/im;->iO:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized e(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/im;->dU()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/im;->av(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     and-int/lit16 v0, p3, 0xfce
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 130
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     and-int/lit16 v0, p3, 0x200
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     and-int/lit16 v0, p3, 0x400
a=0;// 
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     .line 131
a=0;//     :cond_3
a=0;//     and-int/lit16 v0, p3, 0x400
a=0;// 
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     .line 132
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/im;->ay(Ljava/lang/String;)Lcom/kingroot/kinguser/io;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 133
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/io;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 135
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     .line 136
a=0;//     iget-wide v0, v4, Lcom/kingroot/kinguser/io;->iT:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 140
a=0;//     :goto_1
a=0;//     sget-wide v5, Lcom/kingroot/kinguser/im;->iN:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v0, v0, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/im;->aw(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/kinguser/im;->q(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 143
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v0, Lcom/kingroot/kinguser/io;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/io;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/io;-><init>(Lcom/kingroot/kinguser/im;)V
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/io;);
a=0;//     iput-object p2, v0, Lcom/kingroot/kinguser/io;->iR:Ljava/lang/String;
a=0;// 
a=0;//     .line 146
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iput-wide v4, v0, Lcom/kingroot/kinguser/io;->iS:J
a=0;// 
a=0;//     .line 147
a=0;//     iput-wide v2, v0, Lcom/kingroot/kinguser/io;->iT:J
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/im;->iP:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 151
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);v4=(Reference,Lcom/kingroot/kinguser/io;);v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v2, v4, Lcom/kingroot/kinguser/io;->iT:J
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/im;->aw(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 156
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/kinguser/im;->q(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     :cond_6
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/im;->ay(Ljava/lang/String;)Lcom/kingroot/kinguser/io;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 161
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/io;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 163
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     .line 164
a=0;//     iget-wide v0, v4, Lcom/kingroot/kinguser/io;->iS:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 168
a=0;//     :goto_2
a=0;//     sget-wide v5, Lcom/kingroot/kinguser/im;->iM:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v0, v0, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     .line 169
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/im;->ax(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     .line 171
a=0;//     new-instance v0, Lcom/kingroot/kinguser/io;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/io;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/io;-><init>(Lcom/kingroot/kinguser/im;)V
a=0;// 
a=0;//     .line 172
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/io;);
a=0;//     iput-object p2, v0, Lcom/kingroot/kinguser/io;->iR:Ljava/lang/String;
a=0;// 
a=0;//     .line 173
a=0;//     iput-wide v2, v0, Lcom/kingroot/kinguser/io;->iS:J
a=0;// 
a=0;//     .line 174
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/kingroot/kinguser/io;->iT:J
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/im;->iP:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 182
a=0;//     :cond_7
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/im;->av(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_8
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);
a=0;//     iput-wide v2, v4, Lcom/kingroot/kinguser/io;->iS:J
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public q(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/kingroot/kinguser/im;->c(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 196
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/kinguser/rx;->B(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public x(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/im;->iO:Z
a=0;// 
a=0;//     .line 262
a=0;//     return-void
a=0;// .end method
}}
