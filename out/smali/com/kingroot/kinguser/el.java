package com.kingroot.kinguser; class el { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/el;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic fw:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ek;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/el;->fw:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/el;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fN()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 386
a=0;//     #v6=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 387
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v6, v0, :cond_0
a=0;// 
a=0;//     .line 388
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fM()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 389
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0xf731400
a=0;// 
a=0;//     .line 390
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 394
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(LongHi);v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     const-string v1, "dumpsys notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/el;->fw:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     const-string v4, "NotificationRecord"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v4}, Lcom/kingroot/kinguser/ek;->a(Lcom/kingroot/kinguser/ek;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 398
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/el;->fw:Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     add-int/lit8 v0, v0, -0x2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/ek;->y(I)V
a=0;// 
a=0;//     .line 401
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     add-int/lit8 v1, v6, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/jc;->S(I)V
a=0;// 
a=0;//     .line 402
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/kingroot/kinguser/jc;->E(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
