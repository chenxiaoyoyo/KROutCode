package com.kingroot.sdk.root; class PkgAddBroadcastReceiver { void a() { int a;
a=0;// .class public Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->b:Z
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v1, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v1, "android.intent.action.PACKAGE_REPLACED"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     const-string v1, "package"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     sget-object v1, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "PkgAddBroadcastReceiver.register()"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     const-string v0, "PkgAddBroadcastReceiver.waitForReceiveAndUnRegister...."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/g;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 72
a=0;//     #v1=(Boolean);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "PkgAddBroadcastReceiver.wait...."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", tid = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 73
a=0;//     sget-object v2, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     iget-boolean v2, v2, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->b:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     .line 70
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_1
a=0;//     const-string v0, "PkgAddBroadcastReceiver.timeout...."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->a:Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;);
a=0;//     const-string v0, "PkgAddBroadcastReceiver.unregister()"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "android.intent.action.PACKAGE_REPLACED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "PkgAddBroadcastReceiver.onReceive() packageName = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 33
a=0;//     const-string v1, "package:com.kingroot.kinguser"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/PkgAddBroadcastReceiver;->b:Z
a=0;// 
a=0;//     .line 37
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
