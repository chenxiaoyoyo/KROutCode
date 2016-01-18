package com.kingroot.kinguser; class acc { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/acc;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic Eu:Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 683
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/acc;->Eu:Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/acc;);
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
a=0;//     .line 686
a=0;//     #v3=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 698
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 699
a=0;//     return-void
a=0;// 
a=0;//     .line 688
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 689
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a0009
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
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
a=0;//     .line 691
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/acc;->Eu:Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;->m(Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 692
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/acc;->Eu:Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;->m(Lcom/kingroot/kinguser/view/PermissionRequestActivityMiui;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 686
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0xa
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
