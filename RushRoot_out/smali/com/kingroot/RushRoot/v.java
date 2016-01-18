package com.kingroot.RushRoot; class v { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/v;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     const-string v0, "func.HostProtocolFace.tellHostRootEnd()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/az;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/az;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/az;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/az;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/RushRoot/az;->a(Z)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/az;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "need_continue_kr_on_enter"
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.HostProtocolFace.tellHostKrRootFail("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bb;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bb;-><init>()V
a=0;// 
a=0;//     .line 143
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bb;);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/RushRoot/bb;->a(I)V
a=0;// 
a=0;//     .line 144
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/bb;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.HostProtocolFace.tellHostKrRootSuc("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bc;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bc;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bc;-><init>()V
a=0;// 
a=0;//     .line 156
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bc;);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/RushRoot/bc;->a(I)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/bc;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
