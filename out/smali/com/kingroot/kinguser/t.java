package com.kingroot.kinguser; class t { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/t;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/y;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/t;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/kinguser/x;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->S()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->R()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     invoke-interface {p0}, Lcom/kingroot/kinguser/x;->T()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/x;Lcom/kingroot/kinguser/w;)Lcom/kingroot/kinguser/v;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x36
a=0;// 
a=0;//     .line 34
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/t;->a(Lcom/kingroot/kinguser/x;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v0, Lcom/kingroot/kinguser/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/o;);
a=0;//     const/16 v1, 0x39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "invalid task"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/o;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/o;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Lcom/kingroot/kinguser/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/o;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unsupport android platform version "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " yet"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v3, v1}, Lcom/kingroot/kinguser/o;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/o;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 43
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Uninit);
a=0;//     const-string v0, "zygote"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Lcom/kingroot/kinguser/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/o;);
a=0;//     const-string v1, "unsupport zygote process yet"
a=0;// 
a=0;//     invoke-direct {v0, v3, v1}, Lcom/kingroot/kinguser/o;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/o;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "android.os.SystemProperties"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 49
a=0;//     const-string v1, "get"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-class v4, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "persist.sys.dalvik.vm.lib"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "libdvm.so"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     const-string v1, "libart.so"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Lcom/kingroot/kinguser/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/o;);
a=0;//     const/16 v1, 0x37
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "unsupport android ART mode yet"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/o;-><init>(ILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/o;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(PosByte);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_3
a=0;//     new-instance v0, Lcom/kingroot/kinguser/u;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/u;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->S()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->R()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->T()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->U()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->V()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/u;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/s;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/s;);
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->M()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/kingroot/kinguser/x;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v0
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/kinguser/u;);
a=0;//     invoke-direct/range {v1 .. v7}, Lcom/kingroot/kinguser/s;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/u;)V
a=0;// 
a=0;//     .line 74
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/s;);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/p;->X:Ljava/util/HashMap;
a=0;// 
a=0;//     const-class v2, Lcom/kingroot/kinguser/f;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_1
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/f;
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v2, Lcom/kingroot/kinguser/q;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/q;);
a=0;//     invoke-direct {v2, p1, p2}, Lcom/kingroot/kinguser/q;-><init>(Lcom/kingroot/kinguser/x;Lcom/kingroot/kinguser/w;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/q;);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/kingroot/kinguser/f;->a(Lcom/kingroot/kinguser/e;Lcom/kingroot/kinguser/c;)Lcom/kingroot/kinguser/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v0, Lcom/kingroot/kinguser/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/o;);
a=0;//     invoke-interface {v1}, Lcom/kingroot/kinguser/d;->J()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1}, Lcom/kingroot/kinguser/d;->K()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/kingroot/kinguser/d;->L()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/kingroot/kinguser/o;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/o;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/o;);
a=0;//     const/16 v1, 0x35
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "inject progress internal error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/o;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/o;);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
