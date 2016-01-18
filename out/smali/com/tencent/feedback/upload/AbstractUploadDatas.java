package com.tencent.feedback.upload; class AbstractUploadDatas { void a() { int a;
a=0;// .class public abstract Lcom/tencent/feedback/upload/AbstractUploadDatas;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final a:I
a=0;// 
a=0;// .field protected final b:I
a=0;// 
a=0;// .field protected c:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/tencent/feedback/upload/AbstractUploadDatas;);
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     iput p3, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->a:I
a=0;// 
a=0;//     .line 38
a=0;//     iput p2, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b:I
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;I[B)Lcom/tencent/feedback/proguard/C;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 80
a=0;//     .line 86
a=0;//     #v1=(Byte);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/t;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 89
a=0;//     #v3=(Reference,Lcom/tencent/feedback/proguard/w;);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/w;->f()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/w;->g()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3}, Lcom/tencent/feedback/proguard/w;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {p2, v1, v2, v3}, Lcom/tencent/feedback/proguard/a;->a([BIILjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 93
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     const-string v3, "rqdp{  enzp error! }%d %d "
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v4, v1
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/C;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Byte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 99
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/c;->p()Lcom/tencent/feedback/common/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/common/c;);
a=0;//     invoke-static {p1, v3, p2, v1, v2}, Lcom/tencent/feedback/proguard/a;->a(ILcom/tencent/feedback/common/c;[BII)Lcom/tencent/feedback/proguard/C;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/C;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 103
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  imposiable comStrategy error} %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v6
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     const-string v0, "rqdp{  encode failed, clear db data}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 151
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract a()Lcom/tencent/feedback/proguard/C;
a=0;// .end method
a=0;// 
a=0;// .method public final b()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget v0, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x457
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/w;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosShort);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/proguard/t;->a(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/t;->b()Lcom/tencent/feedback/proguard/w;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/feedback/upload/AbstractUploadDatas;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/feedback/proguard/w;->e(I)Lcom/tencent/feedback/proguard/w$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/w$a;->a()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "rqdp{  imposiable comStrategy error }%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 68
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract done(Z)V
a=0;// .end method
}}
