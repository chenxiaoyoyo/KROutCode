package com.kingroot.RushRoot; class ez { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/ez;
a=0;// .super Lcom/kingroot/RushRoot/et;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ez;->b:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/et;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ez;->c:Ljava/util/List;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ez;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ez;->g()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 26
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 27
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ez;->g()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ez;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/ez;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ez;->b:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ez;->b:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 26
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ez;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ez;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static g()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ez;->b:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ez;->b:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final a(Ljava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ff;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ez;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ez;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 65
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v3, v1, v3
a=0;// 
a=0;//     const-wide/32 v5, 0x5265c00
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v0, v3, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ez;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ez;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 74
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/RushRoot/et;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongLo);v3=(LongLo);v4=(LongHi);v5=(LongLo);v6=(LongHi);
a=0;//     const-string v0, "SuScanner can run for only 3 times one day!"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const-string v0, "su"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final d()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     const/16 v0, 0xb4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final e()Lcom/kingroot/RushRoot/ey;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/fa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/fa;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/fa;-><init>(Lcom/kingroot/RushRoot/ez;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fa;);
a=0;//     return-object v0
a=0;// .end method
}}
