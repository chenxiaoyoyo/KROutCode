package com.tencent.feedback.proguard; class t$2 { void a() { int a;
a=0;// .class final Lcom/tencent/feedback/proguard/t$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;// .field private synthetic b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/feedback/proguard/t;Lcom/tencent/feedback/proguard/s;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iput-object p2, p0, Lcom/tencent/feedback/proguard/t$2;->a:Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;//     iput p3, p0, Lcom/tencent/feedback/proguard/t$2;->b:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/t$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/t$2;->a:Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/s;);
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/proguard/s;->d()V
a=0;// 
a=0;//     .line 272
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/t$2;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 274
a=0;//     const-string v0, "rqdp{  query finished should notify}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/t$2;->a:Lcom/tencent/feedback/proguard/s;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/proguard/s;->e()V
a=0;// 
a=0;//     .line 277
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
