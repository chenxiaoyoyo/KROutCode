package com.tencent.feedback.eup.jni; class c$1 { void a() { int a;
a=0;// .class final Lcom/tencent/feedback/eup/jni/c$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/FilenameFilter;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:I
a=0;// 
a=0;// .field private synthetic b:I
a=0;// 
a=0;// .field private synthetic c:Ljava/util/List;
a=0;// 
a=0;// .field private synthetic d:Lcom/tencent/feedback/eup/jni/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/feedback/eup/jni/c;IILjava/util/List;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/eup/jni/c$1;->d:Lcom/tencent/feedback/eup/jni/c;
a=0;// 
a=0;//     iput p2, p0, Lcom/tencent/feedback/eup/jni/c$1;->a:I
a=0;// 
a=0;//     iput p3, p0, Lcom/tencent/feedback/eup/jni/c$1;->b:I
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/feedback/eup/jni/c$1;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/eup/jni/c$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final accept(Ljava/io/File;Ljava/lang/String;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(One);
a=0;//     const-string v2, "rqdp{  check dir} %s rqdp{  , filename} %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p1, v3, v1
a=0;// 
a=0;//     aput-object p2, v3, v0
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v2, "tomb_"
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/eup/jni/c$1;->d:Lcom/tencent/feedback/eup/jni/c;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/eup/jni/c;);
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/eup/jni/c;->a(Lcom/tencent/feedback/eup/jni/c;)I
a=0;// 
a=0;//     .line 51
a=0;//     const-string v2, "rqdp{  accept }%s"
a=0;// 
a=0;//     new-array v3, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v3, v1
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 54
a=0;//     :try_start_0
a=0;//     iget v2, p0, Lcom/tencent/feedback/eup/jni/c$1;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/tencent/feedback/eup/jni/c$1;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p2, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 56
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-string v4, "rqdp{  mRemoveBeforeDate }%d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Lcom/tencent/feedback/eup/jni/c$1;->d:Lcom/tencent/feedback/eup/jni/c;
a=0;// 
a=0;//     #v7=(Reference,Lcom/tencent/feedback/eup/jni/c;);
a=0;//     invoke-static {v7}, Lcom/tencent/feedback/eup/jni/c;->b(Lcom/tencent/feedback/eup/jni/c;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v4, p0, Lcom/tencent/feedback/eup/jni/c$1;->d:Lcom/tencent/feedback/eup/jni/c;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/tencent/feedback/eup/jni/c;->b(Lcom/tencent/feedback/eup/jni/c;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     const-string v4, "rqdp{  recordTime} %d rqdp{  is old}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v2, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(One);v2=(LongLo);v3=(LongHi);v4=(Byte);v5=(LongHi);v6=(Null);v7=(Reference,Ljava/lang/Long;);v8=(LongHi);
a=0;//     const-string v4, "rqdp{  newFileTimeList add} %d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v4, p0, Lcom/tencent/feedback/eup/jni/c$1;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :catch_0
a=0;//     #v0=(One);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 71
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v3, "rqdp{  filename is not formatted ,shoud do delete! \n path:}%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p2, v4, v1
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
