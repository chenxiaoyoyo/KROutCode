package com.kingroot.kinguser; class qi { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/qi;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/qg;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/qi;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 654
a=0;//     #v2=(Null);
a=0;//     const v0, 0x186d0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 656
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/qj;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/qj;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/qj;-><init>(Lcom/kingroot/kinguser/qi;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/qj;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/wi;->a(ZLcom/kingroot/kinguser/wj;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 671
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qg;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qg;->x(Lcom/kingroot/kinguser/qg;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 672
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qg;->x(Lcom/kingroot/kinguser/qg;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ace;->dismiss()V
a=0;// 
a=0;//     .line 673
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/qg;->a(Lcom/kingroot/kinguser/qg;Lcom/kingroot/kinguser/ace;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     .line 676
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 671
a=0;//     :catchall_0
a=0;//     #v0=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/qg;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/qg;->x(Lcom/kingroot/kinguser/qg;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 672
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/qg;->x(Lcom/kingroot/kinguser/qg;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ace;->dismiss()V
a=0;// 
a=0;//     .line 673
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/qg;->a(Lcom/kingroot/kinguser/qg;Lcom/kingroot/kinguser/ace;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     .line 671
a=0;//     :cond_1
a=0;//     throw v0
a=0;// 
a=0;//     .line 668
a=0;//     :catch_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 671
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qg;->x(Lcom/kingroot/kinguser/qg;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 672
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qg;->x(Lcom/kingroot/kinguser/qg;)Lcom/kingroot/kinguser/ace;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ace;->dismiss()V
a=0;// 
a=0;//     .line 673
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qi;->qH:Lcom/kingroot/kinguser/qg;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
