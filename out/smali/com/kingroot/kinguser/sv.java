package com.kingroot.kinguser; class sv { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/sv;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic su:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/sv;->su:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sv;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->jr()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->bu()V
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kk()V
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sv;->su:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 60
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sv;->su:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
a=0;// 
a=0;//     .line 61
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// 
a=0;//     .line 61
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
