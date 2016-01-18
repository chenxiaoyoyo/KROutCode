package com.tencent.feedback.proguard; class X { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/X;
a=0;// .super Lcom/tencent/feedback/proguard/j;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/String;
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// .field public c:I
a=0;// 
a=0;// .field public d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 19
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/proguard/j;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/X;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/X;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 13
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/X;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 15
a=0;//     iput v1, p0, Lcom/tencent/feedback/proguard/X;->c:I
a=0;// 
a=0;//     .line 17
a=0;//     iput v1, p0, Lcom/tencent/feedback/proguard/X;->d:I
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/tencent/feedback/proguard/h;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 42
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0, v2}, Lcom/tencent/feedback/proguard/h;->b(IZ)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/X;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p1, v2, v2}, Lcom/tencent/feedback/proguard/h;->b(IZ)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/X;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/X;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/feedback/proguard/h;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/feedback/proguard/X;->c:I
a=0;// 
a=0;//     .line 45
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/X;->d:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/feedback/proguard/h;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/feedback/proguard/X;->d:I
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/tencent/feedback/proguard/i;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/X;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/X;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 35
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/X;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(II)V
a=0;// 
a=0;//     .line 36
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/X;->d:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(II)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/StringBuilder;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
}}
