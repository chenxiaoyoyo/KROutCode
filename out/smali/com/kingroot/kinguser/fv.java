package com.kingroot.kinguser; class fv { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/fv;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static gj:Ljava/lang/String;
a=0;// 
a=0;// .field private static volatile gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fv;->gj:Ljava/lang/String;
a=0;// 
a=0;//     .line 181
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fv;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fv;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fv;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fw;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     const-class v1, Lcom/kingroot/kinguser/fv;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 189
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fv;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v0, Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/fw;);
a=0;//     const-string v2, "a4"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/fj;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/kingroot/kinguser/fw;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fw;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fv;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fv;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/fw;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 192
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
}}
