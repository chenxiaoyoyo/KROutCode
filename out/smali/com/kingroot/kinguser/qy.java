package com.kingroot.kinguser; class qy { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/qy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/dh;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qR:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field final synthetic qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/qx;Ljava/lang/StringBuilder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/qy;->qR:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/qy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public f(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 260
a=0;//     #v1=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->a(Lcom/kingroot/kinguser/qx;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->a(Lcom/kingroot/kinguser/qx;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/qy;->qR:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 280
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/qx;->aN()V
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// 
a=0;//     .line 265
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->b(Lcom/kingroot/kinguser/qx;)Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->b(Lcom/kingroot/kinguser/qx;)Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eB()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->y(Z)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qx;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->b(Lcom/kingroot/kinguser/qx;)Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eB()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/rz;->jA()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 265
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 271
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/jc;->y(Z)V
a=0;// 
a=0;//     .line 274
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ig;->dI()Lcom/kingroot/kinguser/ig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ig;->dJ()V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qy;->qS:Lcom/kingroot/kinguser/qx;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/qx;->c(Lcom/kingroot/kinguser/qx;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
