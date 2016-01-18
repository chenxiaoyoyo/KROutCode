package com.tencent.feedback.proguard; class I { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/I;
a=0;// .super Lcom/tencent/feedback/proguard/j;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/proguard/j;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/I;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/I;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 15
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/tencent/feedback/proguard/h;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     sget-object v0, Lcom/tencent/feedback/proguard/I;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/tencent/feedback/proguard/I;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/H;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/H;);
a=0;//     invoke-direct {v0}, Lcom/tencent/feedback/proguard/H;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/H;);
a=0;//     sget-object v1, Lcom/tencent/feedback/proguard/I;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/proguard/I;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/feedback/proguard/h;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/I;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/tencent/feedback/proguard/i;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/I;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(Ljava/util/Collection;I)V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/StringBuilder;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
}}
