package com.kingroot.kinguser; class aco { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/aco;
a=0;// .super Lcom/kingroot/kinguser/acw;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ack;Lcom/kingroot/kinguser/ack;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/aco;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lcom/kingroot/kinguser/acw;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aco;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 185
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/aco;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     .line 186
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aco;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ack;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ack;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f0a0009
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aco;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ack;->e(Lcom/kingroot/kinguser/ack;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aco;->EO:Lcom/kingroot/kinguser/ack;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/ack;->e(Lcom/kingroot/kinguser/ack;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
