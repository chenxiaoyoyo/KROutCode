package com.kingroot.kinguser; class id { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/id;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static dG()Ljava/util/List;
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x1ed
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 12
a=0;//     #v1=(Null);
a=0;//     new-instance v12, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v0, "/system/bin/ddexe_real"
a=0;// 
a=0;//     .line 15
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 16
a=0;//     const-string v0, "/system/bin/ddexereal"
a=0;// 
a=0;//     .line 18
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 19
a=0;//     const-string v10, "/data/data-lib/king/ddexe"
a=0;// 
a=0;//     .line 21
a=0;//     :goto_0
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/kingroot/kinguser/he;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hg;);
a=0;//     const-string v9, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "/system/bin/ddexe"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v8, v1
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/kingroot/kinguser/hg;-><init>(IIIIIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hg;);
a=0;//     invoke-direct {v13, v0}, Lcom/kingroot/kinguser/he;-><init>(Lcom/kingroot/kinguser/hg;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v13, Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/kingroot/kinguser/he;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hg;);
a=0;//     const-string v9, "u:object_r:system_file:s0"
a=0;// 
a=0;//     const-string v10, "/data/data-lib/king/install-recovery.sh.bin"
a=0;// 
a=0;//     const-string v11, "/system/bin/install-recovery.sh"
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     move v8, v1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/kingroot/kinguser/hg;-><init>(IIIIIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hg;);
a=0;//     invoke-direct {v13, v0}, Lcom/kingroot/kinguser/he;-><init>(Lcom/kingroot/kinguser/hg;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v13, Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/kingroot/kinguser/he;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hg;);
a=0;//     const-string v9, "u:object_r:system_file:s0"
a=0;// 
a=0;//     const-string v10, "/data/data-lib/king/install-recovery.sh"
a=0;// 
a=0;//     const-string v11, "/system/etc/install-recovery.sh"
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     move v8, v1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/kingroot/kinguser/hg;-><init>(IIIIIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hg;);
a=0;//     invoke-direct {v13, v0}, Lcom/kingroot/kinguser/he;-><init>(Lcom/kingroot/kinguser/hg;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v13, Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/kingroot/kinguser/he;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hg;);
a=0;//     const-string v9, "u:object_r:system_file:s0"
a=0;// 
a=0;//     const-string v10, "/data/data-lib/king/install_recovery.sh"
a=0;// 
a=0;//     const-string v11, "/system/etc/install_recovery.sh"
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     move v8, v1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/kingroot/kinguser/hg;-><init>(IIIIIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hg;);
a=0;//     invoke-direct {v13, v0}, Lcom/kingroot/kinguser/he;-><init>(Lcom/kingroot/kinguser/hg;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v13, Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/kingroot/kinguser/he;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hg;);
a=0;//     const-string v9, "u:object_r:system_file:s0"
a=0;// 
a=0;//     const-string v10, "/data/data-lib/king/install-cm-recovery.sh"
a=0;// 
a=0;//     const-string v11, "/system/etc/install-cm-recovery.sh"
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     move v8, v1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/kingroot/kinguser/hg;-><init>(IIIIIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hg;);
a=0;//     invoke-direct {v13, v0}, Lcom/kingroot/kinguser/he;-><init>(Lcom/kingroot/kinguser/hg;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 76
a=0;//     const-string v0, "/system/bin/debuggerd_real"
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     const-string v0, "/system/bin/efcvhhfse"
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 81
a=0;//     const-string v10, "/data/data-lib/king/debuggerd"
a=0;// 
a=0;//     .line 83
a=0;//     :goto_1
a=0;//     new-instance v13, Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/kingroot/kinguser/he;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hg;);
a=0;//     const-string v9, "u:object_r:system_file:s0"
a=0;// 
a=0;//     const-string v11, "/system/bin/debuggerd"
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v5, v4
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     move v8, v1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/kingroot/kinguser/hg;-><init>(IIIIIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hg;);
a=0;//     invoke-direct {v13, v0}, Lcom/kingroot/kinguser/he;-><init>(Lcom/kingroot/kinguser/hg;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 94
a=0;//     return-object v12
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     move-object v10, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);
a=0;//     move-object v10, v0
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
