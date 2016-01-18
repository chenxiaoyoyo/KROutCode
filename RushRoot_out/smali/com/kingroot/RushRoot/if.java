package com.kingroot.RushRoot; class if { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/if;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;// .field private b:Lcom/kingroot/RushRoot/jm;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/jc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/if;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ig;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ig;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/ig;-><init>(Lcom/kingroot/RushRoot/if;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ig;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/if;->b:Lcom/kingroot/RushRoot/jm;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "/system/bin/su"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     const-string v4, "/system/xbin/su"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/jg;->c(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/jg;->c(Ljava/io/File;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 63
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 69
a=0;//     const-string v2, "su"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "sh"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " -v"
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v3, v2}, Lcom/kingroot/RushRoot/iq;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/RushRoot/jr;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/jr;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v3, v2, Lcom/kingroot/RushRoot/jr;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/RushRoot/jr;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "kinguser_su"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 70
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/jc;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 75
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(One);v1=(Null);v3=(Reference,Ljava/io/File;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     :cond_3
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/iw;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/iw;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/iw;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/iw;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/iw;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/iw;->a()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/iw;->d()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/iw;->c()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     const-string v0, "/system/bin/su"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v0, "/system/xbin/su"
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v6, Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v7, Lcom/kingroot/RushRoot/ie;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/kingroot/RushRoot/ie;);
a=0;//     iget-object v8, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     #v8=(Reference,Lcom/kingroot/RushRoot/jc;);
a=0;//     invoke-direct {v7, v8}, Lcom/kingroot/RushRoot/ie;-><init>(Lcom/kingroot/RushRoot/jc;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/ie;);
a=0;//     invoke-virtual {v7, v2, v1, v0}, Lcom/kingroot/RushRoot/ie;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     invoke-static {v0, v4, v5}, Lcom/kingroot/RushRoot/id;->b(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Ljava/util/Map;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/if;->a:Lcom/kingroot/RushRoot/jc;
a=0;// 
a=0;//     invoke-static {v0, v3, v6}, Lcom/kingroot/RushRoot/id;->a(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Ljava/util/Map;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(One);v1=(Null);v2=(Conflicted);v3=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
