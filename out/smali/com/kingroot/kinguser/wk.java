package com.kingroot.kinguser; class wk { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/wk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/wk;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public encode(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     new-instance v0, Lcom/kingroot/kinguser/wl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/wl;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/wl;-><init>(Lcom/kingroot/kinguser/wk;)V
a=0;// 
a=0;//     .line 44
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wl;);
a=0;//     const-string v1, "utf-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "ILOVESEANYULEI"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/wl;->b([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/aaq;->t([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 48
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
