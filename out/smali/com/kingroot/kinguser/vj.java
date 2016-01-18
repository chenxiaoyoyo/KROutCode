package com.kingroot.kinguser; class vj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/vj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static s(Ljava/lang/String;I)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 28
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v0, v3, :cond_3
a=0;// 
a=0;//     .line 29
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     .line 31
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->bb()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 33
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v5, Lcom/kingroot/kinguser/uh;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6, p1, v1}, Lcom/kingroot/kinguser/uh;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 38
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/uf;->a(Lcom/kingroot/kinguser/uk;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 39
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/File;);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     :try_start_0
a=0;//     invoke-static {p1, p0}, Lcom/kingroot/kinguser/uu;->r(ILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 50
a=0;//     :goto_1
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 55
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     move v2, v0
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/File;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 57
a=0;//     :catch_1
a=0;//     #v4=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 58
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_2
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 63
a=0;//     :cond_3
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// .end method
}}
