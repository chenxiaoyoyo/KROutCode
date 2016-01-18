package com.kingroot.kinguser; class ij { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/ij;
a=0;// .super Lcom/kingroot/kinguser/ii;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static iD:Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private iE:I
a=0;// 
a=0;// .field private iF:Z
a=0;// 
a=0;// .field private iG:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/ii;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ij;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     .line 36
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "firewall-2.0.2.dat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/uu;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ij;->iG:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static dQ()Lcom/kingroot/kinguser/ij;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ij;->iD:Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ij;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     const-class v1, Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 43
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ij;->iD:Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ij;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ij;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ij;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ij;->iD:Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ij;->iD:Lcom/kingroot/kinguser/ij;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 46
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/common/firewall/Rule;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 130
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ij;->r(Ljava/util/List;)V
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dN()I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0, v6}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Boolean);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/ij;->iF:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     const-string v2, "cat /proc/net/ip_tables_names"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "cat /proc/net/ip_tables_matches"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "cat /proc/net/ip_tables_targets"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/ij;->iF:Z
a=0;// 
a=0;//     .line 66
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     iput v5, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     .line 68
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "filter"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, "owner"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 72
a=0;//     :cond_3
a=0;//     iput v5, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     .line 78
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "MARK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "/proc/net/netfilter/nfnetlink_queue"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 74
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 76
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     iput v6, p0, Lcom/kingroot/kinguser/ij;->iE:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public dO()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ij;->iG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ik;->as(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dP()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ij;->q(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public q(Ljava/util/List;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ij;->iG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ik;->at(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 97
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/common/firewall/Rule;
a=0;// 
a=0;//     .line 98
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/common/firewall/Rule;->type:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :pswitch_0
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/common/firewall/Rule;->iI:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/common/firewall/Rule;->iJ:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 100
a=0;//     :pswitch_1
a=0;//     #v4=(Integer);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/common/firewall/Rule;->iK:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/ij;->r(Ljava/util/List;)V
a=0;// 
a=0;//     .line 114
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public r(Ljava/util/List;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ij;->iG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/kinguser/ik;->b(Ljava/lang/String;Ljava/util/List;)Z
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public w(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ij;->iG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/kinguser/ik;->e(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
}}
