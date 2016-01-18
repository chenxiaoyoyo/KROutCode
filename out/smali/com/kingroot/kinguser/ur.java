package com.kingroot.kinguser; class ur { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/ur;
a=0;// .super Lcom/kingroot/kinguser/ub;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/uw;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static tX:Ljava/lang/ref/SoftReference;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private gm:Ljava/util/Properties;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private tU:Ljava/lang/String;
a=0;// 
a=0;// .field private tV:Ljava/lang/String;
a=0;// 
a=0;// .field private tW:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ub;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ur;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->tW:[B
a=0;// 
a=0;//     .line 37
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "e_config"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->tU:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uu;->kV()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Kingroot/user"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Kingroot/user"
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
a=0;//     const-string v1, "e_config"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->tU:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tU:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ur;->bK(Ljava/lang/String;)Ljava/util/Properties;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/ur;->a(Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v0, Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v0}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     .line 80
a=0;//     :cond_3
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ur;->bK(Ljava/lang/String;)Ljava/util/Properties;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tU:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/ur;->a(Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static kR()Lcom/kingroot/kinguser/ur;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ur;->tX:Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/SoftReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ur;->tX:Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ur;
a=0;// 
a=0;//     .line 85
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     const-class v1, Lcom/kingroot/kinguser/ur;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ur;->tX:Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ur;->tX:Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ur;
a=0;// 
a=0;//     .line 93
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ur;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ur;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ur;-><init>()V
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ur;);
a=0;//     new-instance v2, Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/ref/SoftReference;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ref/SoftReference;);
a=0;//     sput-object v2, Lcom/kingroot/kinguser/ur;->tX:Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     .line 101
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected cl()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fu;->ck()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->tW:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 109
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ur;->tW:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 119
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Properties;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tU:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Properties;);
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/kingroot/kinguser/ur;->a(Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uu;->kV()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "e_config"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ur;->tV:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ur;->gm:Ljava/util/Properties;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/kingroot/kinguser/ur;->a(Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// 
a=0;//     .line 131
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
