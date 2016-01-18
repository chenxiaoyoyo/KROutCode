package com.kingroot.kinguser; class jl { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/jl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/w;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jR:J
a=0;// 
a=0;// .field private jS:Lcom/kingroot/kinguser/aao;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/aao;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 550
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 547
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jl;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/jl;->jR:J
a=0;// 
a=0;//     .line 548
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jl;->jS:Lcom/kingroot/kinguser/aao;
a=0;// 
a=0;//     .line 551
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/jl;->jS:Lcom/kingroot/kinguser/aao;
a=0;// 
a=0;//     .line 552
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public c(II)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jl;->jS:Lcom/kingroot/kinguser/aao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aao;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 576
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 563
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 564
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/jl;->jR:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 565
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/jl;->jR:J
a=0;// 
a=0;//     .line 569
a=0;//     :cond_1
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/jl;->jR:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/jl;->jR:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     const-wide/16 v2, 0x3a98
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jl;->jS:Lcom/kingroot/kinguser/aao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aao;);
a=0;//     const/16 v1, 0x3e6
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/aan;->a(Lcom/kingroot/kinguser/aao;ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 574
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(LongHi);v2=(Conflicted);v3=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jl;->jS:Lcom/kingroot/kinguser/aao;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
