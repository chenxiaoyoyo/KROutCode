package com.kingroot.kinguser; class tl { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static th:Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/tl;->th:Ljava/util/Map;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized bH(Ljava/lang/String;)Lcom/kingroot/kinguser/ti;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const-class v1, Lcom/kingroot/kinguser/tl;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/tl;->th:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ti;
a=0;// 
a=0;//     .line 23
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 24
a=0;//     new-instance v0, Lcom/kingroot/kinguser/tk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/tk;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/tk;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 25
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/tk;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/tl;->th:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 28
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 22
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
