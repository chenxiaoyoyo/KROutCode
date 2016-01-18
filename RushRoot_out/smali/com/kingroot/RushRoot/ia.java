package com.kingroot.RushRoot; class ia { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ia;
a=0;// .super Lcom/kingroot/RushRoot/hk;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hk;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ia;);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->a:Z
a=0;// 
a=0;//     .line 29
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     .line 30
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->c:Z
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/RushRoot/jc;ZZ)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 227
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/il;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 230
a=0;//     const-string v1, "/system/bin/sutemp"
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 231
a=0;//     const-string v1, "/system/xbin/sutemp"
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 232
a=0;//     const-string v1, "rm /system/bin/sutemp"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 233
a=0;//     const-string v1, "rm /system/xbin/sutemp"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 235
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     const-string v1, "/system/bin/su"
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 237
a=0;//     const-string v1, "rm /system/bin/su"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 238
a=0;//     const-string v1, "ln -s %s %s"
a=0;// 
a=0;//     new-array v2, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "/system/xbin/su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     const-string v3, "/system/bin/su"
a=0;// 
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 239
a=0;//     const-string v1, "/system/bin/su"
a=0;// 
a=0;//     invoke-static {v1, v5}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 243
a=0;//     const-string v1, "/system/xbin/su"
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 244
a=0;//     const-string v1, "rm /system/xbin/su"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 245
a=0;//     const-string v1, "ln -s %s %s"
a=0;// 
a=0;//     new-array v2, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "/system/bin/su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     const-string v3, "/system/xbin/su"
a=0;// 
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 246
a=0;//     const-string v1, "/system/xbin/su"
a=0;// 
a=0;//     invoke-static {v1, v5}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 249
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/il;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/jc;->a(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 160
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     const-string v2, "/system/xbin/su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v2}, Lcom/kingroot/RushRoot/hy;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     const-string v2, "/system/xbin/su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/iq;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;ZZ)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v3=(Uninit);
a=0;//     const-string v3, "/system/xbin/sutemp"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v3}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const-string v2, "/system/xbin/su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v2}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;ZZ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v2, "/system/bin/su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v2}, Lcom/kingroot/RushRoot/hy;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     const-string v2, "/system/bin/su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/iq;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-static {p0, v1, v0}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;ZZ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     const-string v3, "/system/bin/sutemp"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v3}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     const-string v2, "/system/bin/su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v2}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     invoke-static {p0, v1, v0}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;ZZ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(One);v2=(Integer);v3=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Integer);v3=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ia;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 301
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, p1, p2, v0}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 302
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0xded
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 304
a=0;//     const-wide/16 v0, 0x7d0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 308
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 309
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     const/16 v0, 0x1ed
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {p0, p1, p2, v0}, Lcom/kingroot/RushRoot/ia;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     invoke-static {p2}, Lcom/kingroot/RushRoot/iq;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 306
a=0;//     :catch_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Ljava/lang/String;I)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 262
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 263
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/il;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 264
a=0;//     invoke-static {p2, v2}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 265
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "rm "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 266
a=0;//     const-string v1, "cat %s > %s"
a=0;// 
a=0;//     new-array v4, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p1, v4, v2
a=0;// 
a=0;//     aput-object p2, v4, v3
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "chown 0.0 "
a=0;// 
a=0;//     invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 268
a=0;//     const-string v1, "chmod 0%o %s"
a=0;// 
a=0;//     new-array v4, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     aput-object p2, v4, v3
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 269
a=0;//     invoke-static {p2, v3}, Lcom/kingroot/RushRoot/ik;->a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 270
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/il;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 273
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/RushRoot/jc;->a(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 274
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 276
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lt v1, v0, :cond_1
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 277
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 279
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jb;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 280
a=0;//     const-string v5, "rm "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     const-string v5, "mount"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 281
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ik;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 276
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x1ed
a=0;// 
a=0;//     .line 320
a=0;//     #v0=(PosShort);
a=0;//     const/16 v1, 0xded
a=0;// 
a=0;//     .line 321
a=0;//     #v1=(PosShort);
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     .line 322
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Coolpad 8720L"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 328
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 324
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ip;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static declared-synchronized b(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ia;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ic;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ic;);
a=0;//     invoke-direct {v0, p1}, Lcom/kingroot/RushRoot/ic;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ic;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p0, v0, v2}, Lcom/kingroot/RushRoot/iu;->a(Lcom/kingroot/RushRoot/jc;Lcom/kingroot/RushRoot/iv;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->c:Z
a=0;// 
a=0;//     .line 41
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->a:Z
a=0;// 
a=0;//     .line 44
a=0;//     const-string v3, "/system/bin/su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/RushRoot/hy;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 45
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "/system/xbin/su"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4}, Lcom/kingroot/RushRoot/hy;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Integer);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     if-ne v0, v5, :cond_2
a=0;// 
a=0;//     .line 47
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hp;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hp;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hp;);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     .line 58
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ia;->b()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     .line 60
a=0;//     const-string v3, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v0, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "/system/bin/su"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 63
a=0;//     const-string v4, "/system/xbin/su"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {p1, v3, v0}, Lcom/kingroot/RushRoot/hy;->a(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Lcom/kingroot/RushRoot/hp;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->a:Z
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/sbin/su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/vendor/bin/su"
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/system/sbin/su"
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 68
a=0;//     :goto_1
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->c:Z
a=0;// 
a=0;//     .line 72
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->c:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ia;->a:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 48
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(One);v3=(Integer);
a=0;//     if-ne v3, v5, :cond_3
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 49
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :cond_3
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 72
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final b(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     #v4=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/in;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/RushRoot/ia;->b(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "repair su..."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->c:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/ib;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/ib;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/RushRoot/ib;-><init>(Lcom/kingroot/RushRoot/ia;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ib;);
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1, v1, v2}, Lcom/kingroot/RushRoot/iu;->a(Lcom/kingroot/RushRoot/jc;Lcom/kingroot/RushRoot/iv;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ia;->a:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hp;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hp;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/hp;-><init>()V
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hp;);
a=0;//     iput v4, v1, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     .line 92
a=0;//     iput v4, v1, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     .line 93
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ia;->b()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     .line 94
a=0;//     const-string v2, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v3, "/system/bin/su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 97
a=0;//     const-string v3, "/system/xbin/su"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 98
a=0;//     invoke-static {p1, v2, v1}, Lcom/kingroot/RushRoot/hy;->b(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Lcom/kingroot/RushRoot/hp;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
