package com.kingroot.kinguser; class nv { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nv;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private oP:Landroid/content/Context;
a=0;// 
a=0;// .field private oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;// .field private oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;// .field private final oS:Ljava/lang/Object;
a=0;// 
a=0;// .field private oT:Ljava/lang/String;
a=0;// 
a=0;// .field private oU:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;// .field oV:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nv;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nv;->oS:Ljava/lang/Object;
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nv;->oU:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nw;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/nw;-><init>(Lcom/kingroot/kinguser/nv;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nw;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nv;->oV:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nv;->oP:Landroid/content/Context;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/nv;)Lcom/kingroot/kinguser/oa;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oU:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/nv;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nv;->iE()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private iE()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nv;->iF()V
a=0;// 
a=0;//     .line 262
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private iF()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/nz;->pf:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/nz;->mName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".tmp"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 267
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 272
a=0;//     :cond_0
a=0;//     invoke-virtual {v1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 274
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public b(Lcom/kingroot/kinguser/oa;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nv;->oU:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bm(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/nv;->oT:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oT:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hx()J
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oV:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/oa;->d(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oS:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 285
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nx;->iI()V
a=0;// 
a=0;//     .line 287
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 291
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 292
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nv;->oT:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/nz;->mName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 293
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 295
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 299
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nv;->oS:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 300
a=0;//     :try_start_1
a=0;//     new-instance v4, Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/nx;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/nv;->oP:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     iget-object v6, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-direct {v4, v5, v6, v2}, Lcom/kingroot/kinguser/nx;-><init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     iput-object v4, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     iput-object v4, v2, Lcom/kingroot/kinguser/nz;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nv;->oT:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v2, Lcom/kingroot/kinguser/nz;->pf:Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 306
a=0;//     :try_start_2
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/nx;->iJ()J
a=0;//     :try_end_2
a=0;//     .catch Lcom/kingroot/kinguser/lx; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 310
a=0;//     :try_start_3
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/nx;->iI()V
a=0;// 
a=0;//     .line 312
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     .line 315
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     monitor-exit v3
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 317
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 289
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/Object;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 307
a=0;//     :catch_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Reference,Ujava/lang/Object;);v3=(Reference,Ljava/lang/Object;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/content/Context;);v6=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 310
a=0;//     :try_start_5
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/nx;->iI()V
a=0;// 
a=0;//     .line 312
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 310
a=0;//     :catchall_2
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/content/Context;);v6=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/nx;->iI()V
a=0;// 
a=0;//     .line 312
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     throw v0
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// .end method
a=0;// 
a=0;// .method public iD()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oV:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/oa;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/oa;->d(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oS:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 140
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nx;->iI()V
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/nz;->mName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 149
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 155
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 160
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nv;->oS:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 166
a=0;//     :try_start_2
a=0;//     new-instance v2, Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/nx;);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/nv;->oP:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     invoke-direct {v2, v3, v4, v0}, Lcom/kingroot/kinguser/nx;-><init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/nx;);
a=0;//     iput-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oV:Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/nx;->b(Lcom/kingroot/kinguser/oa;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/nz;->mThread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oQ:Lcom/kingroot/kinguser/nz;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/nv;->oT:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/nz;->pf:Ljava/lang/String;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nv;->oR:Lcom/kingroot/kinguser/nx;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nx;->start()V
a=0;// 
a=0;//     .line 173
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// 
a=0;//     .line 144
a=0;//     :catchall_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     #v2=(Boolean);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     monitor-exit v1
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}