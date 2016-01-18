package com.kingroot.kinguser; class nq { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nq;
a=0;// .super Lcom/kingroot/kinguser/nh;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static oN:Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private oO:Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nh;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nq;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nq;->oO:Ljava/util/Map;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/aab;)Ljava/util/List;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 241
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/aab;->BQ:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/aab;->BQ:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aaf;
a=0;// 
a=0;//     .line 243
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     new-instance v3, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/kr;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/kr;-><init>()V
a=0;// 
a=0;//     .line 245
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/kr;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/aaf;->mL()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ".dat"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/kr;->lG:Ljava/lang/String;
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/kr;->lG:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/kinguser/kr;->lM:Ljava/lang/String;
a=0;// 
a=0;//     .line 248
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/aaf;->lH:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/kingroot/kinguser/kr;->lH:I
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aaf;->lF:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/kr;->lF:Ljava/lang/String;
a=0;// 
a=0;//     .line 253
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private ap(I)Lcom/kingroot/kinguser/zv;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zv;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zv;-><init>()V
a=0;// 
a=0;//     .line 205
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zv;);
a=0;//     iput p1, v0, Lcom/kingroot/kinguser/zv;->Bu:I
a=0;// 
a=0;//     .line 206
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/zv;->Bv:[B
a=0;// 
a=0;//     .line 207
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/zv;->lH:I
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ".dat"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 211
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nq;->ij()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 213
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     :try_start_0
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/uu;->b(Ljava/lang/String;Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 222
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/ut;->m(Ljava/io/File;)Lcom/kingroot/kinguser/ut;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 223
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ut;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/ut;->ub:[B
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/zv;->Bv:[B
a=0;// 
a=0;//     .line 225
a=0;//     iget v2, v1, Lcom/kingroot/kinguser/ut;->ua:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/zv;->lH:I
a=0;// 
a=0;//     .line 226
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/ut;->tZ:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/zv;->version:I
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 216
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/io/File;);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private f(Ljava/util/ArrayList;)Ljava/util/List;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 160
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/zr;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/zr;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/zr;-><init>()V
a=0;// 
a=0;//     .line 161
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/zr;);
a=0;//     iput-object p1, v2, Lcom/kingroot/kinguser/zr;->Au:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 166
a=0;//     #v3=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/zr;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 168
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/kingroot/kinguser/jc;->x(J)V
a=0;// 
a=0;//     .line 173
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aab;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nq;->a(Lcom/kingroot/kinguser/aab;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static iB()Lcom/kingroot/kinguser/nq;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nq;->oN:Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nq;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     const-class v1, Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 58
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nq;->oN:Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/nq;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nq;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/nq;->oN:Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nq;->oN:Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
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
a=0;// .method private iC()Ljava/util/ArrayList;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 192
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const v1, 0x9d2c
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nq;->ap(I)Lcom/kingroot/kinguser/zv;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/zv;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fV()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     const v1, 0x9d3b
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/nq;->ap(I)Lcom/kingroot/kinguser/zv;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/zv;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 198
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILcom/kingroot/kinguser/nr;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nq;->oO:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected c(Lcom/kingroot/kinguser/nu;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/nu;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 110
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/nu;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ".dat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 112
a=0;//     :try_start_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/nu;->mName:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nq;->oO:Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/nr;
a=0;// 
a=0;//     .line 115
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-interface {v0}, Lcom/kingroot/kinguser/nr;->ik()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected d(Lcom/kingroot/kinguser/nu;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/nu;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/nu;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ".dat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/nu;->mName:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nq;->oO:Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/nr;
a=0;// 
a=0;//     .line 138
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     invoke-interface {v0}, Lcom/kingroot/kinguser/nr;->il()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public in()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 85
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fq()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 87
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/nh;->in()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected io()Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nq;->iC()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nq;->f(Ljava/util/ArrayList;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
