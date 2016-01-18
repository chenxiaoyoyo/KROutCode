package com.tencent.feedback.proguard; class V { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/V;
a=0;// .super Lcom/tencent/feedback/proguard/j;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static f:Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Z
a=0;// 
a=0;// .field public b:Z
a=0;// 
a=0;// .field public c:I
a=0;// 
a=0;// .field public d:I
a=0;// 
a=0;// .field private e:Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 21
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/tencent/feedback/proguard/j;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/V;);
a=0;//     iput-boolean v2, p0, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     .line 13
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/V;->e:Ljava/util/Map;
a=0;// 
a=0;//     .line 15
a=0;//     iput-boolean v2, p0, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     .line 17
a=0;//     iput v1, p0, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     .line 19
a=0;//     iput v1, p0, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/tencent/feedback/proguard/h;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, v3, v4}, Lcom/tencent/feedback/proguard/h;->a(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     .line 51
a=0;//     sget-object v0, Lcom/tencent/feedback/proguard/V;->f:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/tencent/feedback/proguard/V;->f:Ljava/util/Map;
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 55
a=0;//     new-array v1, v4, [B
a=0;// 
a=0;//     .line 56
a=0;//     #v1=(Reference,[B);
a=0;//     aput-byte v3, v1, v3
a=0;// 
a=0;//     .line 58
a=0;//     sget-object v2, Lcom/tencent/feedback/proguard/V;->f:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/feedback/proguard/V;->f:Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v4, v3}, Lcom/tencent/feedback/proguard/h;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/feedback/proguard/V;->e:Ljava/util/Map;
a=0;// 
a=0;//     .line 61
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0, v3}, Lcom/tencent/feedback/proguard/h;->a(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     .line 62
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v0, v1, v3}, Lcom/tencent/feedback/proguard/h;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     .line 63
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1, v3}, Lcom/tencent/feedback/proguard/h;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/tencent/feedback/proguard/i;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/proguard/V;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(ZI)V
a=0;// 
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/V;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/V;->e:Ljava/util/Map;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(Ljava/util/Map;I)V
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     iget-boolean v0, p0, Lcom/tencent/feedback/proguard/V;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(ZI)V
a=0;// 
a=0;//     .line 42
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/V;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(II)V
a=0;// 
a=0;//     .line 43
a=0;//     iget v0, p0, Lcom/tencent/feedback/proguard/V;->d:I
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/i;->a(II)V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/StringBuilder;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
}}
