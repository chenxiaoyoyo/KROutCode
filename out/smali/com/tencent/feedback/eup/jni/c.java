package com.tencent.feedback.eup.jni; class c { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/eup/jni/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/io/File;
a=0;// 
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;JI)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/tencent/feedback/eup/jni/c;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     .line 23
a=0;//     iput-wide p2, p0, Lcom/tencent/feedback/eup/jni/c;->b:J
a=0;// 
a=0;//     .line 24
a=0;//     iput p4, p0, Lcom/tencent/feedback/eup/jni/c;->c:I
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/feedback/eup/jni/c;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     iget v0, p0, Lcom/tencent/feedback/eup/jni/c;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/tencent/feedback/eup/jni/c;->d:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;[Ljava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "rqdp{  fileNameList == null || fileNameList.length <= 0}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 120
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     .line 122
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, p0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->canWrite()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 125
a=0;//     const-string v3, "rqdp{  file delete} %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v5, v1
a=0;// 
a=0;//     invoke-static {v3, v5}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 120
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/feedback/eup/jni/c;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     iget-wide v0, p0, Lcom/tencent/feedback/eup/jni/c;->b:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/tencent/feedback/eup/jni/c;->d:I
a=0;// 
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "rqdp{  TombFilesCleanTask mDir == null || !mDir.exists() || !mDir.isDirectory() ,pls check!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 109
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);
a=0;//     const-string v0, "rqdp{  start to clean} %s.* rqdp{  in dir} %s rqdp{  which time <} %s rqdp{  and max file nums should <} %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "tomb_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v7
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget-wide v4, p0, Lcom/tencent/feedback/eup/jni/c;->b:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v1, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     iget v4, p0, Lcom/tencent/feedback/eup/jni/c;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v1, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v3, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #v3=(Reference,Ljava/util/LinkedList;);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(PosByte);
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     new-instance v4, Lcom/tencent/feedback/eup/jni/c$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/feedback/eup/jni/c$1;);
a=0;//     invoke-direct {v4, p0, v0, v6, v3}, Lcom/tencent/feedback/eup/jni/c$1;-><init>(Lcom/tencent/feedback/eup/jni/c;IILjava/util/List;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/feedback/eup/jni/c$1;);
a=0;//     invoke-virtual {v1, v4}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 80
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     array-length v0, v1
a=0;// 
a=0;//     .line 81
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     const-string v4, "rqdp{  delete old num} %d"
a=0;// 
a=0;//     new-array v5, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v4, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v1}, Lcom/tencent/feedback/eup/jni/c;->a(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget v1, p0, Lcom/tencent/feedback/eup/jni/c;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/feedback/eup/jni/c;->c:I
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     .line 88
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 89
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     .line 91
a=0;//     const-string v4, "rqdp{  should delete not too old file num} %d"
a=0;// 
a=0;//     new-array v5, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V
a=0;// 
a=0;//     .line 94
a=0;//     if-le v1, v0, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     new-array v1, v0, [Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuffer;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 96
a=0;//     :goto_3
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v0, v5, :cond_5
a=0;// 
a=0;//     array-length v5, v1
a=0;// 
a=0;//     if-ge v0, v5, :cond_5
a=0;// 
a=0;//     .line 98
a=0;//     const-string v5, "tomb_"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 99
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 100
a=0;//     const-string v5, ".txt"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v1, v0
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v2, v5}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 96
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosByte);v5=(LongHi);v6=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v5=(Reference,[Ljava/lang/Object;);v6=(Reference,Ljava/lang/Integer;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 94
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 105
a=0;//     :cond_5
a=0;//     #v1=(Reference,[Ljava/lang/String;);v5=(Integer);
a=0;//     const-string v0, "rqdp{  delete not too old files} %d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     array-length v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/eup/jni/c;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/eup/jni/c;->a(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v0, "rqdp{  clean end!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
