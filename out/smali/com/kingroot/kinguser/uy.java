package com.kingroot.kinguser; class uy { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/uy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static uc:Ljava/lang/String;
a=0;// 
a=0;// .field private static ud:Ljava/lang/String;
a=0;// 
a=0;// .field private static ue:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/uy;->ud:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "Device ID ="
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/uy;->ue:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static F(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const-string v0, "000000000000000"
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 107
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 108
a=0;//     const-string v0, "000000000000001"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static G(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     .line 151
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 124
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ur;->kR()Lcom/kingroot/kinguser/ur;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 129
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ur;);
a=0;//     const-string v2, "x2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Lcom/kingroot/kinguser/uw;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 132
a=0;//     sput-object v2, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     .line 133
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_2
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uy;->kW()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/uy;->bV(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 138
a=0;//     sput-object v2, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     .line 146
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     sget-object v2, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/uy;->bV(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 147
a=0;//     const-string v2, "x2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Lcom/kingroot/kinguser/uw;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/uy;->F(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 141
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 142
a=0;//     sput-object v2, Lcom/kingroot/kinguser/uy;->uc:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_5
a=0;//     #v2=(Boolean);
a=0;//     const-string v0, "000000000000000"
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static H(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     const-string v1, "000000000000000"
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uy;->kW()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uy;->bV(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/uy;->F(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 162
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static ay(Z)Ljava/util/List;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const-string v1, "000000000000000"
a=0;// 
a=0;//     .line 46
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "permition deny!"
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 48
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, p0}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     const-string v0, "dumpsys iphonesubinfo"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v2, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 54
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     array-length v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 55
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v0, v5, :cond_3
a=0;// 
a=0;//     aget-object v6, v4, v0
a=0;// 
a=0;//     .line 56
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 57
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     sget-object v8, Lcom/kingroot/kinguser/uy;->ue:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->ue:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 73
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 75
a=0;//     return-object v3
a=0;// 
a=0;//     .line 55
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v4=(Reference,[Ljava/lang/String;);v5=(Integer);v6=(Reference,Ljava/lang/String;);v7=(Boolean);v8=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/wo;);v2=(Boolean);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic az(Z)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/uy;->ay(Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static bV(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     const-string v1, "0000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bW(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     sput-object p0, Lcom/kingroot/kinguser/uy;->ud:Ljava/lang/String;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private static kW()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->ud:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->ud:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uy;->bV(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/uz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/uz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/uz;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/uz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/uz;->lP()Z
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/uy;->ud:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static kX()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 194
a=0;//     #v6=(One);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 196
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v6}, Lcom/kingroot/kinguser/uy;->ay(Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 197
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 198
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 199
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/uy;->F(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 201
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v7, v6, :cond_3
a=0;// 
a=0;//     .line 202
a=0;//     invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 203
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uy;->bV(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v1, v5
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v0, v5
a=0;// 
a=0;//     .line 211
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Byte);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/uy;->bV(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lw()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 219
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 220
a=0;//     :goto_1
a=0;//     #v5=(PosByte);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/st;->a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/util/List;);v2=(Byte);v5=(Null);v7=(Boolean);
a=0;//     invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     move-object v4, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v5=(Boolean);v7=(Conflicted);
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 219
a=0;//     #v5=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/util/List;);v2=(Byte);v5=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized kY()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     const-class v1, Lcom/kingroot/kinguser/uy;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->gi()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/va;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/va;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/va;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/va;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/va;->lP()Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 227
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic kk()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uy;->kX()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
