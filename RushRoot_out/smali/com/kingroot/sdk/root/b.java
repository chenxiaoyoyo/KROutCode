package com.kingroot.sdk.root; class b { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/sdk/root/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/sdk/root/r;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Landroid/content/Context;
a=0;// 
a=0;// .field protected b:Landroid/os/Handler;
a=0;// 
a=0;// .field protected c:Lkrsdk/d;
a=0;// 
a=0;// .field protected d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;// .field protected e:Ljava/lang/String;
a=0;// 
a=0;// .field protected f:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/b;);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/b;->f:I
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/root/b;->b:Landroid/os/Handler;
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p3, p0, Lcom/kingroot/sdk/root/b;->c:Lkrsdk/d;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p4, p0, Lcom/kingroot/sdk/root/b;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 40
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "play"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iput p1, p0, Lcom/kingroot/sdk/root/b;->f:I
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lkrsdk/h;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/b;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     invoke-static {}, Lkrsdk/c;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p1}, Lkrsdk/c;->a(Landroid/content/Context;Lkrsdk/h;)Z
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p1}, Lkrsdk/c;->a(Lkrsdk/h;)Z
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "rm -f "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/b;->c:Lkrsdk/d;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/krshell/*"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lkrsdk/h;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 125
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a()Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v7=(Null);
a=0;//     const-string v0, "beforeRoot()..."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/d;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->c:Lkrsdk/d;
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "superuser.apk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v1, v7
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/Kinguser.apk"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 68
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->c:Lkrsdk/d;
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "superuser.apk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v1, v7
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/Superuser.apk"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 74
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->c:Lkrsdk/d;
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "su"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v1, v7
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/su"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 79
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v8, "sh"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v8}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 82
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v1, "export PATH=/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:$PATH"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "cat "
a=0;// 
a=0;//     invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " > "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "cat "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " > "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "cat "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " > "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/t;->a(Lcom/kingroot/sdk/commom/d;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ls -lZ "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/p;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     return v0
a=0;// 
a=0;//     .line 87
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v9, v0
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v9
a=0;// 
a=0;//     .line 88
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fn;);v1=(Reference,Ljava/lang/Throwable;);v9=(Conflicted);
a=0;//     const-string v2, "\u590d\u5236KU\u5f02\u5e38"
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 90
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 90
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Lcom/kingroot/RushRoot/fn;);v9=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_1
a=0;//     throw v0
a=0;// 
a=0;//     .line 89
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v9, v1
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v9
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 87
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b()Lcom/kingroot/sdk/root/a;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     #v8=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/d;);
a=0;//     new-array v1, v9, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const-string v2, "kd"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v1, v8
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 105
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 107
a=0;//     #v10=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {v10}, Lcom/kingroot/sdk/root/l;->d()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v7, v0
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v7=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "RETRY_KD_SHELL"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     move v2, v8
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/b;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v11, p0, Lcom/kingroot/sdk/root/b;->d:Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v11=(Reference,Lcom/kingroot/sdk/commom/d;);
a=0;//     iget-object v11, v11, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v11, v6, v8
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v9
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-object v10
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v11=(Uninit);
a=0;//     move v2, v9
a=0;// 
a=0;//     .line 110
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(PosByte);v2=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     move v7, v8
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
}}
