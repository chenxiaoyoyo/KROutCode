package com.kingroot.sdk.root; class f { void a() { int a;
a=0;// .class final Lcom/kingroot/sdk/root/f;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/sdk/root/e;
a=0;// 
a=0;// .field private final synthetic b:Ljava/lang/Process;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/sdk/root/e;Ljava/lang/Process;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/f;->a:Lcom/kingroot/sdk/root/e;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/root/f;->b:Ljava/lang/Process;
a=0;// 
a=0;//     .line 267
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/f;->b:Ljava/lang/Process;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Process;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/f;->a:Lcom/kingroot/sdk/root/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/e;);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/root/e;->a(Lcom/kingroot/sdk/root/e;)V
a=0;// 
a=0;//     .line 272
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ExeRootSolution process exit: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 279
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 274
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 275
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     const-string v1, "ExeRootSolution waitFor throw e"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 276
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "ExeRootSolution waitFor throw e2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
