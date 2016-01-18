package com.kingroot.kinguser; class aed { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aed;
a=0;// .super Lcom/kingroot/kinguser/ki;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected FZ:Lcom/kingroot/kinguser/aef;
a=0;// 
a=0;// .field protected Ga:Lcom/kingroot/kinguser/aee;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ki;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aed;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aef;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aef;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aef;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aef;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aed;->FZ:Lcom/kingroot/kinguser/aef;
a=0;// 
a=0;//     .line 31
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aee;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aee;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/aee;-><init>(Lcom/kingroot/kinguser/aed;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aee;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aed;->Ga:Lcom/kingroot/kinguser/aee;
a=0;// 
a=0;//     .line 173
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private N(Ljava/util/List;)Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v3, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/adp;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/adp;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/adp;);
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v4, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iput-wide v4, v3, Lcom/kingroot/kinguser/adp;->ip:J
a=0;// 
a=0;//     .line 69
a=0;//     :try_start_0
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     iput-object v0, v3, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 64
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, v3, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v1, v3, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     throw v0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 70
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v3=(Reference,Lcom/kingroot/kinguser/adp;);v5=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/adp;->kI:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, v3, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private P(Ljava/util/List;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/kinguser/adp;->Fw:Z
a=0;// 
a=0;//     .line 111
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/kinguser/adp;->dw:Z
a=0;// 
a=0;//     .line 112
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v5, v0, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v5, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 118
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v1, v2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/adp;->Fv:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aed;->FZ:Lcom/kingroot/kinguser/aef;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aef;);
a=0;//     invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// 
a=0;//     .line 115
a=0;//     :catch_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public O(Ljava/util/List;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/kinguser/adp;->Fw:Z
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/kingroot/kinguser/adp;->dw:Z
a=0;// 
a=0;//     .line 91
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 93
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v5, v0, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v5, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 97
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v1, v2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/adp;->Fv:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aed;->FZ:Lcom/kingroot/kinguser/aef;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aef;);
a=0;//     invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :catch_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public Q(Ljava/util/List;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     #v8=(Null);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 131
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 133
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/adp;
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v4, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget v4, v4, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x2710
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-le v4, v5, :cond_0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v4, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/adp;->Fu:Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v4, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "com.android"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     iput-boolean v8, v0, Lcom/kingroot/kinguser/adp;->Fw:Z
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     iget-wide v6, v0, Lcom/kingroot/kinguser/adp;->ip:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v5, v6, v7}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const v6, 0x7f0a004e
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v0, Lcom/kingroot/kinguser/adp;->Fv:Ljava/lang/String;
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 147
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iput-boolean v8, v0, Lcom/kingroot/kinguser/adp;->dw:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, v0, Lcom/kingroot/kinguser/adp;->Fw:Z
a=0;// 
a=0;//     .line 144
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     iget-wide v5, v0, Lcom/kingroot/kinguser/adp;->ip:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {v4, v5, v6}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v0, Lcom/kingroot/kinguser/adp;->Fv:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aed;->Ga:Lcom/kingroot/kinguser/aee;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aee;);
a=0;//     invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aed;->Ga:Lcom/kingroot/kinguser/aee;
a=0;// 
a=0;//     invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 155
a=0;//     invoke-interface {p1}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 157
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public hg()Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/kingroot/kinguser/aeb;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 45
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/aed;->N(Ljava/util/List;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/aed;->N(Ljava/util/List;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 47
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/kinguser/aed;->N(Ljava/util/List;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0, v1}, Lcom/kingroot/kinguser/aed;->O(Ljava/util/List;)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/kinguser/aed;->P(Ljava/util/List;)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {p0, v3}, Lcom/kingroot/kinguser/aed;->Q(Ljava/util/List;)V
a=0;// 
a=0;//     .line 55
a=0;//     const-string v4, "personal"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 56
a=0;//     const-string v1, "presys"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     const-string v1, "sys"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 59
a=0;//     return-object v0
a=0;// .end method
}}
