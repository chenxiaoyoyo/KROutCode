package com.kingroot.RushRoot; class gb { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/gb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;// .field private final synthetic b:Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/ga;Lcom/kingroot/RushRoot/gy;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/gb;->a:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/RushRoot/gb;->b:Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/gb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/gb;->a:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Lcom/kingroot/RushRoot/ga;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/gb;->b:Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gy;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gy;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\t"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gy;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\t"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/gy;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\t"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/gy;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     sget-object v0, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "has_action_stats"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 114
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
