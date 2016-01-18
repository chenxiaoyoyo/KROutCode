package com.kingroot.RushRoot; class fu { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/fu;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/concurrent/Callable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;// .field private b:Lcom/kingroot/RushRoot/fr;
a=0;// 
a=0;// .field private c:Lcom/kingroot/RushRoot/fs;
a=0;// 
a=0;// .field private final d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// .field private final f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/kingroot/RushRoot/fw;Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/fu;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/fu;->g:J
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/fu;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p2, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p3, p0, Lcom/kingroot/RushRoot/fu;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p4, p0, Lcom/kingroot/RushRoot/fu;->e:Landroid/os/Handler;
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/fr;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/fr;);
a=0;//     invoke-direct {v0, p2, p3}, Lcom/kingroot/RushRoot/fr;-><init>(Lcom/kingroot/RushRoot/fw;Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fr;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/fu;->b:Lcom/kingroot/RushRoot/fr;
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/fs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/fs;);
a=0;//     invoke-direct {v0, p2, p3}, Lcom/kingroot/RushRoot/fs;-><init>(Lcom/kingroot/RushRoot/fw;Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/fu;->c:Lcom/kingroot/RushRoot/fs;
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     const-string v0, "startDownload begin verifyResult = 1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/fu;->g:J
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->c:Lcom/kingroot/RushRoot/fs;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/fs;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 150
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v3, p0, Lcom/kingroot/RushRoot/fu;->g:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v0, v3
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/fu;->g:J
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v6, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "DownloadKu"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/fu;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 152
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 153
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(One);
a=0;//     const/16 v1, 0x1b89
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/RushRoot/fw;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "startDownload "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/fw;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " exists!"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v1, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "startDownload end verifyResult = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 166
a=0;//     return v0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v2=(Integer);v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->c:Lcom/kingroot/RushRoot/fs;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/fw;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fs;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 40
a=0;//     const-string v1, ":"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 41
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 43
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 44
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v6, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 45
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/fu;->g:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v0, v6, v2
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x30d4c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/fu;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->d:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final synthetic call()Ljava/lang/Object;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1
a=0;//     #v7=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "KuUpdate call begin status = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     move v2, v7
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "KuUpdate call end status = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", verifyResult = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(One);v8=(Uninit);
a=0;//     const-string v0, "startCheck begin verifyResult = 1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->b:Lcom/kingroot/RushRoot/fr;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/fr;->a()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     new-array v6, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get version : "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "CheckUpdate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/fu;->e:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/fw;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/fw;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/fw;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->b:Lcom/kingroot/RushRoot/fr;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fr;);
a=0;//     iget-object v1, v0, Lcom/kingroot/RushRoot/fr;->d:Lcom/kingroot/RushRoot/gt;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gt;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/fr;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "notNeedDownloadKingUser: mLocalProductVersion = "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", mLocalBuildno = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "LocalVersion: "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v4, v1, Lcom/kingroot/RushRoot/gt;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v1, Lcom/kingroot/RushRoot/gt;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v1, Lcom/kingroot/RushRoot/gt;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ServerVersion: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->d:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->f:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", ServerApkBuildno = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gt;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v3, v4, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     const/16 v0, 0x1b8b
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "startCheck end verifyResult = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/fu;->a(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Null);v3=(Integer);v4=(Integer);v7=(One);
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gt;->a:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_5
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gt;->b:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->d:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt v3, v4, :cond_2
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gt;->b:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->d:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_5
a=0;// 
a=0;//     iget v3, v1, Lcom/kingroot/RushRoot/gt;->c:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v4, v4, Lcom/kingroot/RushRoot/fw;->f:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt v3, v4, :cond_2
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gt;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/fw;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v1, v3, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "notNeedDownloadKingUser return false"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v7=(Boolean);
a=0;//     const-string v0, "startCheck: will startDownload here..."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/fu;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v7=(One);
a=0;//     const/16 v0, 0x1b8a
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fu;->a:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     move v2, v7
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/fu;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/fu;->a(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
