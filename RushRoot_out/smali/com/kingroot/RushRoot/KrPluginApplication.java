package com.kingroot.RushRoot; class KrPluginApplication { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/KrPluginApplication;
a=0;// .super Lcom/kingroot/loader/sdk/KPApplication;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Ljava/lang/String;
a=0;// 
a=0;// .field public static b:Ljava/lang/String;
a=0;// 
a=0;// .field public static c:Z
a=0;// 
a=0;// .field private static d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private e:Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;
a=0;// 
a=0;// .field private f:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;// .field private g:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Lcom/kingroot/loader/sdk/KPApplication;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/KrPluginApplication;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/aa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/aa;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/aa;-><init>(Lcom/kingroot/RushRoot/KrPluginApplication;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/aa;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->f:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ab;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ab;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/ab;-><init>(Lcom/kingroot/RushRoot/KrPluginApplication;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ab;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->g:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/kingroot/loader/sdk/KPContext;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/KrPluginApplication;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/KrPluginApplication;->d()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 19
a=0;//     #v0=(One);
a=0;//     sget-object v2, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-static {v2}, Lkrsdk/c;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     const-string v3, "kr_has_action_stats"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v2=(Integer);v3=(Reference,Ljava/lang/String;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->f:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/bt;->a()Z
a=0;// 
a=0;//     .line 107
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ae;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ae;->g()V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate(Lcom/kingroot/loader/sdk/KPContext;Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 34
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0, p1, p2}, Lcom/kingroot/loader/sdk/KPApplication;->onCreate(Lcom/kingroot/loader/sdk/KPContext;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 35
a=0;//     sput-object p1, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     .line 37
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/KrApplication;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 40
a=0;//     invoke-static {p1}, Lcom/kingroot/sdk/util/Cryptor;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ba;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ba;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/RushRoot/ba;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ba;);
a=0;//     invoke-virtual {v2, p2}, Lcom/kingroot/RushRoot/ba;->b(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ba;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ba;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ba;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sput-object v3, Lcom/kingroot/RushRoot/KrPluginApplication;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ba;->i()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     sput-boolean v3, Lcom/kingroot/RushRoot/KrPluginApplication;->c:Z
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ba;->h()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sput-boolean v3, Lcom/kingroot/RushRoot/br;->a:Z
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ba;->f()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     sput-boolean v2, Lcom/kingroot/RushRoot/ak;->a:Z
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "KrPluginApplication.VERSION_NAME = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/RushRoot/KrPluginApplication;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", channel = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", kuKdPath = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/RushRoot/KrPluginApplication;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", mShouldKrShowOkPage = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-boolean v3, Lcom/kingroot/RushRoot/KrPluginApplication;->c:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     const-string v2, "func.KrPluginApplication.onCreate"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     sget-object v2, Lcom/kingroot/RushRoot/KrPluginApplication;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v2}, Lcom/kingroot/RushRoot/ak;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/x;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/y;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->c()V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/ae;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ae;->c()V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/KrPluginApplication;->d()V
a=0;// 
a=0;//     .line 73
a=0;//     sget-boolean v0, Lcom/kingroot/RushRoot/activities/MainFragment;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-string v0, "func.HostProtocolFace.hasRootedAfterChecking()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/ax;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/ax;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/RushRoot/ax;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ax;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ax;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/RushRoot/ax;->b(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/ax;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "hasRootedAfterExecuting().ret = "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     const-string v2, "need_continue_kr_on_enter"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->g:Lcom/kingroot/RushRoot/bt;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bt;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/bt;->a()Z
a=0;// 
a=0;//     .line 80
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     const-string v1, "android.net.wifi.STATE_CHANGE"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/z;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/z;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/RushRoot/z;-><init>(Lcom/kingroot/RushRoot/KrPluginApplication;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/z;);
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->e:Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;
a=0;// 
a=0;//     .line 90
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->e:Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/kingroot/loader/sdk/KPContext;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Reference,Landroid/os/Bundle;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     const-string v0, "func.KrPluginApplication.onDestory()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->e:Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->d:Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/KrPluginApplication;->e:Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/statics/NetworkBroadcastReceiver;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/loader/sdk/KPContext;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ae;->b()V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->b()V
a=0;// 
a=0;//     .line 151
a=0;//     invoke-super {p0}, Lcom/kingroot/loader/sdk/KPApplication;->onDestroy()V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
}}
