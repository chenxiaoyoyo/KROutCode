package com.kingroot.kinguser; class jv { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jv;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/loader/lpinterface/IBridgeLoaderEnd;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile kw:Z
a=0;// 
a=0;// .field private static volatile kx:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 28
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/jv;->kw:Z
a=0;// 
a=0;//     .line 29
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/jv;->kx:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jv;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPluginCall(Ljava/lang/String;Landroid/os/Bundle;Z)Landroid/os/Bundle;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Null);
a=0;//     invoke-static {p2}, Lcom/kingroot/kinguser/ka;->d(Landroid/os/Bundle;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Reference,Landroid/os/Bundle;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(One);v2=(PosByte);v3=(Null);v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/jx;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/jx;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/jx;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jx;);
a=0;//     invoke-virtual {v1, p2}, Lcom/kingroot/kinguser/jx;->c(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/gn;->cQ()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/jx;->aj(Z)V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jx;->getBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v1=(One);v2=(PosByte);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/jw;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/jw;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/kinguser/jw;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/jw;);
a=0;//     invoke-virtual {v4, p2}, Lcom/kingroot/kinguser/jw;->c(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     const-string v0, "su"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gr;->Z(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "su"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gr;->ab(Ljava/lang/String;)Lcom/kingroot/kinguser/wm;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {v4, v3}, Lcom/kingroot/kinguser/jw;->ab(I)V
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {v4, v1}, Lcom/kingroot/kinguser/jw;->aj(Z)V
a=0;// 
a=0;//     .line 56
a=0;//     sput-boolean v3, Lcom/kingroot/kinguser/jv;->kw:Z
a=0;// 
a=0;//     .line 62
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/kh;->hf()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/jv;->kx:Z
a=0;// 
a=0;//     .line 71
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v4}, Lcom/kingroot/kinguser/jw;->getBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     invoke-virtual {v4, v2}, Lcom/kingroot/kinguser/jw;->ab(I)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v4, v3}, Lcom/kingroot/kinguser/jw;->aj(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v4, v1}, Lcom/kingroot/kinguser/jw;->ab(I)V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v4, v3}, Lcom/kingroot/kinguser/jw;->aj(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 76
a=0;//     :pswitch_3
a=0;//     #v0=(Null);v4=(Integer);v5=(Uninit);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/jz;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/jz;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/jz;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jz;);
a=0;//     invoke-virtual {v1, p2}, Lcom/kingroot/kinguser/jz;->c(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jz;->gZ()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/kinguser/jc;->ab(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :pswitch_4
a=0;//     #v1=(One);v2=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v4, v1}, Lcom/kingroot/kinguser/jc;->ad(Z)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lcom/kingroot/kinguser/jc;->V(I)V
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vg;->ld()V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v5, Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v5}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v6, 0x10000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 95
a=0;//     const-class v6, Lcom/kingroot/kinguser/activitys/MainActivity;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5, v4, v6}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->go()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     sget-boolean v6, Lcom/kingroot/kinguser/jv;->kx:Z
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 97
a=0;//     sget-boolean v6, Lcom/kingroot/kinguser/jv;->kw:Z
a=0;// 
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     sget-boolean v6, Lcom/kingroot/kinguser/jv;->kw:Z
a=0;// 
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/ff;->bR()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 100
a=0;//     :cond_3
a=0;//     const-string v3, "main_pahe_state"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/jc;->gp()V
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     .line 106
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/jc;->gr()V
a=0;// 
a=0;//     .line 108
a=0;//     const-string v3, "main_pahe_state"
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v3=(Conflicted);v6=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 116
a=0;//     :goto_2
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v3, v4, v5, v1}, Lcom/kingroot/kinguser/st;->b(IIIII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     :catch_0
a=0;//     #v2=(PosByte);v3=(Conflicted);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :catch_1
a=0;//     #v1=(One);v5=(Reference,Landroid/content/Intent;);v6=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 114
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 123
a=0;//     :pswitch_5
a=0;//     #v1=(One);v3=(Null);v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/jc;->ac(Z)V
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jt;->gU()Lcom/kingroot/kinguser/afb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "com.kingroot.RushRoot"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v1}, Lcom/kingroot/kinguser/afb;->i(Ljava/lang/String;Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :pswitch_6
a=0;//     #v2=(PosByte);v3=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/kinguser/jc;->ae(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :pswitch_7
a=0;//     #v2=(PosByte);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/kc;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/kc;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/kc;-><init>()V
a=0;// 
a=0;//     .line 137
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/kc;);
a=0;//     invoke-virtual {v1, p2}, Lcom/kingroot/kinguser/kc;->c(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->gE()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 141
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v3, v3, v1, v2, v3}, Lcom/kingroot/kinguser/st;->b(IIIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :pswitch_8
a=0;//     #v1=(One);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/kd;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/kd;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/kd;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/kd;);
a=0;//     invoke-virtual {v2, p2}, Lcom/kingroot/kinguser/kd;->c(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/jc;->gE()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 151
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v3, v3, v2, v1, v3}, Lcom/kingroot/kinguser/st;->b(IIIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 37
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_4
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//     .end packed-switch
a=0;// .end method
}}
