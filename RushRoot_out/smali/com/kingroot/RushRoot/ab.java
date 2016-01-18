package com.kingroot.RushRoot; class ab { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/ab;
a=0;// .super Lcom/kingroot/RushRoot/bt;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/KrPluginApplication;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/KrPluginApplication;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/ab;->a:Lcom/kingroot/RushRoot/KrPluginApplication;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/bt;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ab;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const-wide/16 v0, 0x1388
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ab;->a:Lcom/kingroot/RushRoot/KrPluginApplication;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/KrPluginApplication;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 120
a=0;//     sget-boolean v0, Lcom/kingroot/RushRoot/activities/MainFragment;->e:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "func.HostProtocolFace.tellHostEverythingDone()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ay;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ay;);
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/ay;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ay;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ay;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :catch_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "UI is alive!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 126
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "has unreported statistics"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
