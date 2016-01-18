package com.kingroot.kinguser; class rv { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/rv;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rd:Landroid/content/Intent;
a=0;// 
a=0;// .field final synthetic rm:Lcom/kingroot/kinguser/receiver/PackageReceiver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/receiver/PackageReceiver;Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/rv;->rm:Lcom/kingroot/kinguser/receiver/PackageReceiver;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/rv;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/rv;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rv;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 24
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/rv;->rd:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 27
a=0;//     const-string v3, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v1=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/it;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/it;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/it;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/it;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/kinguser/it;->h(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     const-string v3, "android.intent.action.PACKAGE_REPLACED"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 30
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     const-string v3, "android.intent.action.PACKAGE_REMOVED"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
}}
