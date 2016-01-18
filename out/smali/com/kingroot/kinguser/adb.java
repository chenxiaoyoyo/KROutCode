package com.kingroot.kinguser; class adb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/adb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Fb:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private Fc:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private Fd:Z
a=0;// 
a=0;// .field private Fe:Z
a=0;// 
a=0;// .field private Ff:Z
a=0;// 
a=0;// .field private kI:Ljava/lang/String;
a=0;// 
a=0;// .field private lb:Ljava/lang/String;
a=0;// 
a=0;// .field private lc:I
a=0;// 
a=0;// .field private qf:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;ZZ)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adb;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adb;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/adb;->qf:I
a=0;// 
a=0;//     .line 44
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     .line 47
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     .line 50
a=0;//     iput-boolean v1, p0, Lcom/kingroot/kinguser/adb;->Ff:Z
a=0;// 
a=0;//     .line 96
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adb;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 97
a=0;//     iput p2, p0, Lcom/kingroot/kinguser/adb;->qf:I
a=0;// 
a=0;//     .line 98
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/adb;->na()V
a=0;// 
a=0;//     .line 99
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/adb;->Fb:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 100
a=0;//     iput-object p4, p0, Lcom/kingroot/kinguser/adb;->Fc:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 101
a=0;//     iput-boolean p5, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     .line 102
a=0;//     iput-boolean p6, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/adb;->nc()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Ff:Z
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Lcom/kingroot/kinguser/vb;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/adb;->kI:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 106
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;)Lcom/kingroot/kinguser/adb;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adb;);v1=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p1, v2}, Lcom/kingroot/kinguser/adb;->p(II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 72
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 73
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_3
a=0;//     invoke-static {p0, p2}, Lcom/kingroot/kinguser/ada;->a(Ljava/lang/String;Ljava/util/ArrayList;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 81
a=0;//     :goto_1
a=0;//     #v5=(Boolean);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p1, v2}, Lcom/kingroot/kinguser/adb;->p(II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 82
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, p3}, Lcom/kingroot/kinguser/ada;->a(Ljava/lang/String;Ljava/util/ArrayList;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 89
a=0;//     :goto_2
a=0;//     #v6=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/adb;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/kingroot/kinguser/adb;-><init>(Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;ZZ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adb;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Null);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v6=(Uninit);
a=0;//     move v6, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v5=(Uninit);v6=(Uninit);
a=0;//     move v5, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private na()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     .line 134
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->qf:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/adb;->p(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->qf:I
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/adb;->p(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static p(II)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     and-int v0, p0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aG(Z)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     #v1=(Null);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->qf:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/adb;->p(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adb;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/adb;->Fb:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v2, p1}, Lcom/kingroot/kinguser/ada;->a(Ljava/lang/String;Ljava/util/ArrayList;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, p1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     .line 165
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 168
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 165
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 168
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public aH(Z)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 180
a=0;//     #v1=(Null);
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->qf:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/adb;->p(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adb;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/adb;->Fc:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v2, p1}, Lcom/kingroot/kinguser/ada;->a(Ljava/lang/String;Ljava/util/ArrayList;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, p1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     .line 182
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 185
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 182
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 185
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public aI(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/adb;->Ff:Z
a=0;// 
a=0;//     .line 193
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getPackageName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adb;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getType()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ha()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adb;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public nb()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Ff:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public nc()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 208
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/adb;->lc:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 210
a=0;//     :pswitch_0
a=0;//     #v0=(Null);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :pswitch_1
a=0;//     #v0=(Null);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :pswitch_2
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/adb;->Fe:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/adb;->Fd:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
