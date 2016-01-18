package com.kingroot.kinguser; class g { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static s(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     const/16 v1, 0x78
a=0;// 
a=0;//     .line 131
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v1, :cond_2
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 135
a=0;//     :cond_2
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     const-string v1, "ipme result: "
a=0;// 
a=0;//     .line 137
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ipme result: "
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     const-string v1, "ipme result: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 139
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "[,]"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 140
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 141
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a(Lcom/kingroot/kinguser/e;Lcom/kingroot/kinguser/c;)Lcom/kingroot/kinguser/d;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v4=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 37
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p2, p1}, Lcom/kingroot/kinguser/c;->a(Lcom/kingroot/kinguser/e;)Lcom/kingroot/kinguser/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/d;);
a=0;//     invoke-interface {v0}, Lcom/kingroot/kinguser/d;->J()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Null);v2=(Null);v3=(One);v4=(Null);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/m;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 49
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Impe file is not found, the path is "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 31
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v1=(Null);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 54
a=0;//     :cond_4
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "So file is not found, the path is "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Null);v2=(Null);
a=0;//     new-instance v5, Lcom/kingroot/kinguser/i;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/i;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/h;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/kingroot/kinguser/h;-><init>(Lcom/kingroot/kinguser/g;Lcom/kingroot/kinguser/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/h;);
a=0;//     invoke-direct {v5, v0}, Lcom/kingroot/kinguser/i;-><init>(Lcom/kingroot/kinguser/k;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 66
a=0;//     :try_start_3
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/i;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5, v0, v3}, Lcom/kingroot/kinguser/i;->a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 72
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5, v0, v2}, Lcom/kingroot/kinguser/i;->a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 78
a=0;//     :goto_2
a=0;//     :try_start_5
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "chmod 0755 "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/kingroot/kinguser/c;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "chown 0.0 "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ";chcon u:object_r:system_file:s0 "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/kingroot/kinguser/c;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "chmod 0755 "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/kingroot/kinguser/c;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->getPid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_b
a=0;// 
a=0;//     .line 87
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, "%s %s %s"
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v3, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const-string v8, "-n"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v1, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     invoke-interface {p2, v1}, Lcom/kingroot/kinguser/c;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 90
a=0;//     :try_start_6
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_3
a=0;//     :try_start_7
a=0;//     #v1=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     const-string v5, "%s %s %d %s"
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v3, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const-string v8, "-f"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     aput-object v2, v6, v7
a=0;// 
a=0;//     invoke-static {v0, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-interface {p2, v0}, Lcom/kingroot/kinguser/c;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 99
a=0;//     invoke-interface {p2, p1}, Lcom/kingroot/kinguser/c;->b(Lcom/kingroot/kinguser/e;)V
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Null);v3=(Conflicted);v6=(Conflicted);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v6, "redirct file error"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3, v6}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 73
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v5, "redirct file error"
a=0;// 
a=0;//     invoke-direct {v0, v2, v5}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 91
a=0;//     :catch_2
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v7=(PosByte);v8=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 105
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 106
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "%s %s %s %s %d %s %s"
a=0;// 
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v7, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aput-object v3, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v7, v2
a=0;// 
a=0;//     invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 112
a=0;//     :goto_5
a=0;//     invoke-interface {p2, p1}, Lcom/kingroot/kinguser/c;->c(Lcom/kingroot/kinguser/e;)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-interface {p2, v0}, Lcom/kingroot/kinguser/c;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 116
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/g;->s(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Ipme inject the target progress(pid="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ") failed"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v0, v3, v4, v2, v1}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 121
a=0;//     :goto_6
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     invoke-interface {p2, p1, v0}, Lcom/kingroot/kinguser/c;->a(Lcom/kingroot/kinguser/e;Lcom/kingroot/kinguser/d;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_7
a=0;//     #v0=(PosByte);v2=(PosByte);v3=(Reference,Ljava/lang/String;);v4=(Boolean);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 109
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v7=(PosByte);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "%s %d %s %s %d %s %s"
a=0;// 
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v7, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aput-object v3, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v7, v0
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v7, v2
a=0;// 
a=0;//     invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(PosByte);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 119
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "Done"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3, v4, v2, v1}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;Ljava/lang/String;I)V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v7=(Uninit);v8=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
