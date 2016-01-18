package com.kingroot.RushRoot; class iz { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/iz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/iz;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/jc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/iz;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(Landroid/content/Context;ILjava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     #v0=(Byte);
a=0;//     const-string v1, "Kinguser.apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, p3, v1, p2}, Lcom/kingroot/RushRoot/iz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Kinguser-installKU(), ret:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 89
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 97
a=0;//     :catch_0
a=0;//     #v0=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     const-string v1, "com.kingroot.kinguser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/kingroot/RushRoot/jj;->a(Landroid/content/Context;Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     invoke-static {v0, p2, p3}, Lcom/kingroot/RushRoot/ir;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     .line 53
a=0;//     #v2=(PosByte);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Kinguser-install(), apkPath:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "; installedName:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "; installMethod:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Byte);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq p4, v1, :cond_0
a=0;// 
a=0;//     if-ne p4, v2, :cond_3
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     if-ne p4, v2, :cond_1
a=0;// 
a=0;//     .line 60
a=0;//     :try_start_1
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/RushRoot/iz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/RushRoot/iz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/RushRoot/iz;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 66
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Byte);v1=(Integer);v2=(PosByte);v3=(Uninit);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/RushRoot/iz;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(PosByte);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/RushRoot/iz;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_4
a=0;//     #v0=(Byte);v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 53
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 291
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "am start -n "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v2, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v3, "com.kingroot.kinguser"
a=0;// 
a=0;//     .line 293
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 296
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "starCmd:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ", ret:"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ", err:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, v2, Lcom/kingroot/RushRoot/jb;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, v2, Lcom/kingroot/RushRoot/jb;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Error"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 300
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     .line 175
a=0;//     .line 177
a=0;//     #v0=(Byte);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     const-string v2, "com.kingroot.kinguser"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v1, v2}, Lcom/kingroot/RushRoot/jj;->a(Landroid/content/Context;Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 183
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     const-string v2, "rm -r /data/data/com.kingroot.kinguser"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "chmod 0755 "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "pm install -r "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v2, v1, Lcom/kingroot/RushRoot/jb;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-object v2, v1, Lcom/kingroot/RushRoot/jb;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "Failure"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "pm install error:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/jb;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/jb;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "INSTALL_FAILED_VERSION_DOWNGRADE"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 191
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     .line 199
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Kinguser-silentInstallApk(), ret:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/jb;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "Success"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static c(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 314
a=0;//     const-string v1, "com.kingroot.kinguser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 318
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 320
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     #v1=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 117
a=0;//     :try_start_0
a=0;//     #v0=(Byte);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ji;->a()Lcom/kingroot/RushRoot/ji;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/ji;);
a=0;//     const-string v3, "com.kingroot.kinguser"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/kingroot/RushRoot/ji;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/io;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/io;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     invoke-direct {v2, v3}, Lcom/kingroot/RushRoot/io;-><init>(Lcom/kingroot/RushRoot/jc;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/io;);
a=0;//     const-string v2, "com.kingroot.kinguser"
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/ih;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/ih;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/RushRoot/ih;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/ih;);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/RushRoot/io;->a(Ljava/lang/String;Ljava/io/FileFilter;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     const-string v4, "com.kingroot.kinguser"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v3, v4}, Lcom/kingroot/RushRoot/jj;->a(Landroid/content/Context;Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     const-string v4, "pm uninstall com.kingroot.kinguser"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/jb;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "Failure"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "script failed: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/iz;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v2, v4}, Lcom/kingroot/RushRoot/ir;->a(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Ljava/util/Map;)Z
a=0;// 
a=0;//     .line 126
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 127
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p1, v1, p2}, Lcom/kingroot/RushRoot/iz;->a(Landroid/content/Context;ILjava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u5b89\u88c5Kinguser-installKU(), ret:"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 137
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(Integer);v2=(Reference,Ljava/util/List;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 112
a=0;//     :catchall_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 137
a=0;//     :catch_0
a=0;//     #v0=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Byte);v1=(Null);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized a()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->a()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 265
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "com.kingroot.kinguser.activitys.SuNotifyActivity"
a=0;// 
a=0;//     .line 266
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/iz;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     const-string v3, "/system/app/Kinguser.apk"
a=0;// 
a=0;//     .line 268
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1, v3}, Lcom/kingroot/RushRoot/iz;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/iz;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 275
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/RushRoot/iz;->c(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
