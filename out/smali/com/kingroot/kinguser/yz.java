package com.kingroot.kinguser; class yz { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/yz;
a=0;// .super Lcom/kingroot/kinguser/aax;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final synthetic ws:Z
a=0;// 
a=0;// .field static zh:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public zg:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     const-class v0, Lcom/kingroot/kinguser/yz;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/yz;->ws:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/aax;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/yz;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/yz;->s(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/aax;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/yz;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/yz;->s(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/aau;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(One);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/yz;->zh:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/yz;->zh:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zf;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zf;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zf;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/yz;->zh:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/yz;->zh:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v2, v2}, Lcom/kingroot/kinguser/aau;->d(Ljava/lang/Object;IZ)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/yz;->s(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/aaw;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/kingroot/kinguser/aaw;->b(Ljava/util/Collection;I)V
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/StringBuilder;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aas;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aas;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/kingroot/kinguser/aas;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aas;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v2, "vecReportSofts"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/aas;->b(Ljava/util/Collection;Ljava/lang/String;)Lcom/kingroot/kinguser/aas;
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 74
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 76
a=0;//     #v1=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     sget-boolean v1, Lcom/kingroot/kinguser/yz;->ws:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     check-cast p1, Lcom/kingroot/kinguser/yz;
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/aay;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Need define key first!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 61
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 63
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public s(Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/yz;->zg:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
}}
