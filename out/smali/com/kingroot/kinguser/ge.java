package com.kingroot.kinguser; class ge { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ge;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic gy:Lcom/kingroot/kinguser/gd;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/gd;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 741
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/ge;->gy:Lcom/kingroot/kinguser/gd;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ge;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 745
a=0;//     new-instance v1, Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 746
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->clear()V
a=0;// 
a=0;//     .line 747
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/vb;->getInstalledApplications(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 748
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     .line 749
a=0;//     iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 750
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 755
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 756
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
a=0;// 
a=0;//     .line 757
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nk;->ip()Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/nk;->iq()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 760
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashSet;->retainAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 761
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 762
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/ul;->p(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 763
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 768
a=0;//     :cond_2
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/ge;->gy:Lcom/kingroot/kinguser/gd;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/gd;);
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/gd;->gw:Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-static {v3, v0, v1, v4}, Lcom/kingroot/kinguser/fz;->a(Lcom/kingroot/kinguser/fz;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 773
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "com.android.kinguser.console"
a=0;// 
a=0;//     .line 774
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f0a000e
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 775
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/ge;->gy:Lcom/kingroot/kinguser/gd;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/gd;);
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/gd;->gw:Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     const/16 v3, 0x7d0
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v2, v0, v1, v3}, Lcom/kingroot/kinguser/fz;->a(Lcom/kingroot/kinguser/fz;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 777
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
