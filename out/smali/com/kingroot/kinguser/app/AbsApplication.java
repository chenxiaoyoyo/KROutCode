package com.kingroot.kinguser.app; class AbsApplication { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/app/AbsApplication;
a=0;// .super Landroid/app/Application;
a=0;// .source "SourceFile done"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static ez:Ljava/lang/String;
a=0;// 
a=0;// .field private static mAppContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// # dk == AbsAppHandler,eA == mHandler
a=0;// .field private eA:Lcom/kingroot/kinguser/dk;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;// 	   #done
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Landroid/app/Application;-><init>()V
a=0;// 
a=0;//     .line 90
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/app/AbsApplication;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static ax()Ljava/lang/String;
a=0;// 	   #done ax() == getmyProcessName
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->ez:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/util/ProcessUtils;->aX(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->ez:Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->ez:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->ez:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ay()Landroid/content/Context;
a=0;// 	   #done ay() == getContext
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     sget-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/os/Message;)V
a=0;// 	   #done
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getHandler()Landroid/os/Handler;
a=0;// 	   #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/app/AbsApplication;->eA:Lcom/kingroot/kinguser/dk;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dk;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;// 	   #done
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-super {p0}, Landroid/app/Application;->onCreate()V
a=0;// 
a=0;//     .line 34
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/app/AbsApplication;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 35
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/util/ProcessUtils;->aX(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/app/AbsApplication;->ez:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dj;);
a=0;//     invoke-direct {v0, p0, p0}, Lcom/kingroot/kinguser/dj;-><init>(Lcom/kingroot/kinguser/app/AbsApplication;Lcom/kingroot/kinguser/app/AbsApplication;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dj;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/app/AbsApplication;->eA:Lcom/kingroot/kinguser/dk;
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
}}
