package com.kingroot.kinguser; class tj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final tf:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/tj;->tf:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static o(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/kinguser/th;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     .line 27
a=0;//     sget-object v1, Lcom/kingroot/kinguser/tj;->tf:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 28
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/tj;->tf:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/th;
a=0;// 
a=0;//     .line 29
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Lcom/kingroot/kinguser/tg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/tg;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, p0, p1, v2}, Lcom/kingroot/kinguser/tg;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 34
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/tg;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/tj;->tf:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 38
a=0;//     return-object v0
a=0;// 
a=0;//     .line 37
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
