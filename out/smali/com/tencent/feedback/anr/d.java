package com.tencent.feedback.anr; class d { void a() { int a;
a=0;// .class final Lcom/tencent/feedback/anr/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/feedback/anr/f;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;// .field private synthetic b:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/feedback/anr/e;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iput-boolean p2, p0, Lcom/tencent/feedback/anr/d;->b:Z
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/feedback/anr/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(J)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     #v3=(Null);
a=0;//     const-string v0, "process end %d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 200
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public final a(JJLjava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     #v0=(Null);
a=0;//     const-string v2, "new process %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p5, v3, v0
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iput-wide p1, v2, Lcom/tencent/feedback/anr/e;->a:J
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iput-object p5, v2, Lcom/tencent/feedback/anr/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v2, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iput-wide p3, v2, Lcom/tencent/feedback/anr/e;->c:J
a=0;// 
a=0;//     .line 187
a=0;//     iget-boolean v2, p0, Lcom/tencent/feedback/anr/d;->b:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 171
a=0;//     #v4=(One);
a=0;//     const-string v0, "new thread %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/feedback/anr/e;->d:Ljava/util/Map;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, v0, Lcom/tencent/feedback/anr/e;->d:Ljava/util/Map;
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/anr/d;->a:Lcom/tencent/feedback/anr/e;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/feedback/anr/e;->d:Ljava/util/Map;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     aput-object p3, v1, v2
a=0;// 
a=0;//     aput-object p4, v1, v4
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 177
a=0;//     return v4
a=0;// .end method
}}
