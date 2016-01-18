package com.kingroot.kinguser; class adg { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/adg;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/adf;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adg;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adg;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adg;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adf;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adf;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dr;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 95
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     iput v1, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 96
a=0;//     const v0, 0x7f0a005e
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 97
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput v0, v2, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adg;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adf;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adf;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/dr;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
