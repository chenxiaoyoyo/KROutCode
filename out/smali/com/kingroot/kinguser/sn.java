package com.kingroot.kinguser; class sn { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/sn;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;// .field private rX:Landroid/content/pm/PackageManager;
a=0;// 
a=0;// .field private rY:Ljava/util/HashMap;
a=0;// 
a=0;// .field private rZ:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/service/KingRootAppListService;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/sn;->rW:Lcom/kingroot/kinguser/service/KingRootAppListService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 163
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sn;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/sn;->rX:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/sn;->rY:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/sn;->rZ:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 169
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vd;->lb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sn;->rZ:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sn;->rZ:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, "13fd04e376114fcb2a248547c949b885"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public jG()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Binder;->getCallingUid()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 180
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/sn;->rY:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/sn;->rX:Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 183
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     .line 185
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/vd;->bX(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 188
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sn;->rZ:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/sn;->rY:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/sn;->rY:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
