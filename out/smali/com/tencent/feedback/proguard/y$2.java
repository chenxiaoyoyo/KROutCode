package com.tencent.feedback.proguard; class y$2 { void a() { int a;
a=0;// .class final Lcom/tencent/feedback/proguard/y$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:B
a=0;// 
a=0;// .field private synthetic b:Lcom/tencent/feedback/proguard/y;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/feedback/proguard/y;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/proguard/y$2;->b:Lcom/tencent/feedback/proguard/y;
a=0;// 
a=0;//     iput-byte p2, p0, Lcom/tencent/feedback/proguard/y$2;->a:B
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/y$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/y$2;->b:Lcom/tencent/feedback/proguard/y;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/y;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/feedback/proguard/y;->g()Lcom/tencent/feedback/upload/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 391
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     new-instance v1, Lcom/tencent/feedback/proguard/A;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/proguard/A;);
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/proguard/y$2;->b:Lcom/tencent/feedback/proguard/y;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/feedback/proguard/y;);
a=0;//     invoke-static {v2}, Lcom/tencent/feedback/proguard/y;->a(Lcom/tencent/feedback/proguard/y;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/proguard/y;->a()Lcom/tencent/feedback/proguard/y;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/feedback/proguard/y;);
a=0;//     iget-byte v4, p0, Lcom/tencent/feedback/proguard/y$2;->a:B
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/tencent/feedback/proguard/A;-><init>(Landroid/content/Context;Lcom/tencent/feedback/proguard/y;B)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/feedback/proguard/A;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/feedback/upload/f;->a(Lcom/tencent/feedback/upload/AbstractUploadDatas;)V
a=0;// 
a=0;//     .line 395
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
