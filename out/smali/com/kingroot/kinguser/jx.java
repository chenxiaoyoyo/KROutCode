package com.kingroot.kinguser; class jx { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jx;
a=0;// .super Lcom/kingroot/kinguser/jy;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ky:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 5
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/jy;-><init>()V
a=0;// 
a=0;//     .line 9
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jx;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/jx;->ky:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aj(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/jx;->ky:Z
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Landroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     const-string v0, "has_root"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     const-string v0, "has_root"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/jx;->ky:Z
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public gX()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gY()Landroid/os/Bundle;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "has_root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/jx;->ky:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 20
a=0;//     return-object v0
a=0;// .end method
}}
