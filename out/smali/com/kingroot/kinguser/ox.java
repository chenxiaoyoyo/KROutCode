package com.kingroot.kinguser; class ox { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ox;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ox;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ox;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPreDraw()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 193
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ox;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ow;->Y()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ox;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ow;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/oy;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/oy;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/oy;-><init>(Lcom/kingroot/kinguser/ox;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/oy;);
a=0;//     const-wide/16 v2, 0x64
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/kinguser/dr;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ox;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ow;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     const-string v1, "main_pahe_state"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 221
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ox;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     invoke-static {v1, v0, v4}, Lcom/kingroot/kinguser/ow;->a(Lcom/kingroot/kinguser/ow;IZ)V
a=0;// 
a=0;//     .line 223
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ox;->pS:Lcom/kingroot/kinguser/ow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ow;);
a=0;//     invoke-static {v0, v4}, Lcom/kingroot/kinguser/ow;->a(Lcom/kingroot/kinguser/ow;Z)Z
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
}}
