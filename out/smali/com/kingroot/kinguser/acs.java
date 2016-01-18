package com.kingroot.kinguser; class acs { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/acs;
a=0;// .super Lcom/kingroot/kinguser/ud;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ack;JJ)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-direct {p0, p2, p3, p4, p5}, Lcom/kingroot/kinguser/ud;-><init>(JJ)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/acs;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public b(JI)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x1770
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/high16 v3, -0x10000
a=0;// 
a=0;//     .line 492
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ack;->k(Lcom/kingroot/kinguser/ack;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ack;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a0005
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 494
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " ("
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     div-long v1, p1, v4
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 495
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ack;->l(Lcom/kingroot/kinguser/ack;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 496
a=0;//     cmp-long v0, p1, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ack;->l(Lcom/kingroot/kinguser/ack;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 508
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 500
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ack;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a0006
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 501
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " ("
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     div-long v1, p1, v4
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 502
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ack;->m(Lcom/kingroot/kinguser/ack;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 503
a=0;//     cmp-long v0, p1, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ack;->m(Lcom/kingroot/kinguser/ack;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onFinish()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ack;->k(Lcom/kingroot/kinguser/ack;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 512
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ack;->i(Lcom/kingroot/kinguser/ack;)V
a=0;// 
a=0;//     .line 517
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ack;->dismiss()V
a=0;// 
a=0;//     .line 518
a=0;//     return-void
a=0;// 
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/acs;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ack;->j(Lcom/kingroot/kinguser/ack;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
