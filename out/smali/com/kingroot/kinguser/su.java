package com.kingroot.kinguser; class su { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/su;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static mR:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private static ss:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private static st:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sw;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/sw;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sw;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/su;->mR:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sx;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/sx;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sx;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/su;->ss:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sy;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/sy;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sy;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/su;->st:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static aQ(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     if-lez p0, :cond_1
a=0;// 
a=0;//     .line 51
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v1}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sv;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/sv;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sv;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/sv;->lP()Z
a=0;// 
a=0;//     .line 65
a=0;//     monitor-enter v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 66
a=0;//     int-to-long v2, p0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 67
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/Object;);v2=(LongLo);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     throw v0
a=0;// 
a=0;//     .line 74
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kf()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kh()V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kj()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bu()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kh()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic jr()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kf()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static ke()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->ki()V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kg()V
a=0;// 
a=0;//     .line 33
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 34
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eY()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x36ee800
a=0;// 
a=0;//     .line 36
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/su;->mR:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static kf()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jK()Lcom/kingroot/kinguser/st;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/st;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/st;->jR()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 93
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jK()Lcom/kingroot/kinguser/st;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/st;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/st;->jT()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 99
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Ljava/util/ArrayList;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jc;->r(J)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jK()Lcom/kingroot/kinguser/st;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/st;->jS()V
a=0;// 
a=0;//     .line 105
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static kg()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 115
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fj()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 116
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 117
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/su;->ss:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static kh()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jK()Lcom/kingroot/kinguser/st;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/st;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/st;->jV()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 138
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jK()Lcom/kingroot/kinguser/st;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/st;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/st;->kd()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 139
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jK()Lcom/kingroot/kinguser/st;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/st;->jX()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 140
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 144
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Reference,Ljava/util/ArrayList;);v2=(Integer);v3=(One);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Ljava/util/ArrayList;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jc;->u(J)V
a=0;// 
a=0;//     .line 147
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jU()V
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->kc()V
a=0;// 
a=0;//     .line 149
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jW()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ki()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     sget-object v0, Lcom/kingroot/kinguser/su;->st:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static kj()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jZ()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 174
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Context;);v2=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Ljava/util/ArrayList;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/st;->jY()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic kk()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/su;->kj()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
