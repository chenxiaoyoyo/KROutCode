package com.kingroot.kinguser; class eq { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/eq;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile fA:Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private fB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/eq;->fA:Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/eq;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/er;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/er;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/er;-><init>(Lcom/kingroot/kinguser/eq;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/er;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/eq;->fB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static bv()Lcom/kingroot/kinguser/eq;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/kingroot/kinguser/eq;->fA:Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/eq;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 27
a=0;//     const-class v1, Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 28
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/eq;->fA:Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     new-instance v0, Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/eq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/eq;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/eq;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/eq;->fA:Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/eq;->fA:Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 31
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bw()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/jc;->eN()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 46
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0x36ee800
a=0;// 
a=0;//     .line 47
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long v6, v2, v4
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v6, v6, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/eq;->fB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
