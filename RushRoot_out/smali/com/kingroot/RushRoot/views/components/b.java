package com.kingroot.RushRoot.views.components; class b { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/views/components/b;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/views/components/b;->a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/views/components/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/b;->a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/views/components/b;->a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->a(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->a(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;F)F
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/b;->a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->b(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/b;->a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->c(Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;)F
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/views/components/b;->a:Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/views/components/CheckingProgressBar;->postInvalidate()V
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/views/components/b;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const-wide/16 v1, 0xa
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lcom/kingroot/RushRoot/views/components/b;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
