package com.kingroot.kinguser; class ft { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/ft;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final gg:Ljava/lang/String;
a=0;// 
a=0;// .field public static final gh:Ljava/lang/String;
a=0;// 
a=0;// .field public static final gi:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const-string v0, "fn1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ft;->gg:Ljava/lang/String;
a=0;// 
a=0;//     .line 21
a=0;//     const-string v0, "fn3"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ft;->gh:Ljava/lang/String;
a=0;// 
a=0;//     .line 22
a=0;//     const-string v0, "fn5"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ft;->gi:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static cj()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 32
a=0;//     #v5=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ei;->bb()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Lcom/kingroot/kinguser/uh;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/uh;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/kingroot/kinguser/ft;->gg:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f050005
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v3, v4, v5}, Lcom/kingroot/kinguser/uh;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v2, Lcom/kingroot/kinguser/uh;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/uh;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "otasurvival.sh"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v3, 0x7f050004
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v0, v3, v5}, Lcom/kingroot/kinguser/uh;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/kingroot/kinguser/uh;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bF()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bE()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3, v5}, Lcom/kingroot/kinguser/uh;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/uh;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 43
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/uf;->J(Ljava/util/List;)V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
}}
