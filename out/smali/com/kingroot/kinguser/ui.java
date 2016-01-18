package com.kingroot.kinguser; class ui { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/ui;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ui;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/kinguser/uj;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ui;->kG()Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fw;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/uj;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/uj;->kI()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/fw;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ui;->kG()Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fw;->cm()V
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static bM(Ljava/lang/String;)Lcom/kingroot/kinguser/uj;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     new-instance v0, Lcom/kingroot/kinguser/uj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/uj;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/uj;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/uj;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ui;->kG()Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/fw;);
a=0;//     invoke-virtual {v1, p0}, Lcom/kingroot/kinguser/fw;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 148
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/uj;->bN(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static kG()Lcom/kingroot/kinguser/fw;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ui;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fw;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 136
a=0;//     const-class v1, Lcom/kingroot/kinguser/uf;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 137
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ui;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/fw;);
a=0;//     const-string v2, "kulibs.conf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/kingroot/kinguser/fw;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fw;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/ui;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 142
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/ui;->gk:Lcom/kingroot/kinguser/fw;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 140
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
