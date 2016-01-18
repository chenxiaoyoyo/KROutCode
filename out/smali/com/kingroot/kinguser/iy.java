package com.kingroot.kinguser; class iy { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/iy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static jf:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jd:Ljava/util/List;
a=0;// 
a=0;// .field private je:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     new-instance v0, Lcom/kingroot/kinguser/iz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/iz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/iz;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/iz;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/iy;->jf:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/iy;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/iy;->jd:Ljava/util/List;
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/iy;->init()V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private aD(Ljava/lang/String;)Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 134
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->jd:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, p1}, Lcom/kingroot/kinguser/iy;->p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     new-instance v0, Lcom/kingroot/kinguser/hu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/hu;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/hu;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/hu;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/hu;->a(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/iy;->f(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v0, "sh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "su -v"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/kinguser/ja;->aE(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/iy;->f(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     .line 113
a=0;//     const-string v0, "sh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "su -v"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/kinguser/ja;->aE(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private e(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->jd:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/util/ProcessUtils;->K(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/iy;->jd:Ljava/util/List;
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ep()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/iy;->aD(Ljava/lang/String;)Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcom/kingroot/kinguser/ja;->a(Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static el()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 232
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fu()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 233
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0xf731400
a=0;// 
a=0;//     .line 234
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     sget-object v0, Lcom/kingroot/kinguser/iy;->jf:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private f(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ep()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/hx;->o(Ljava/lang/String;Ljava/lang/String;)Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v0, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-wide v4, v0, Lcom/kingroot/kinguser/hz;->ip:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-object v6, v0, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/kinguser/ja;->a(IIIJLjava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private g(Lcom/kingroot/kinguser/ja;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 181
a=0;//     #v4=(One);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 182
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->eo()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 183
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 184
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ep()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 186
a=0;//     if-eq v1, v4, :cond_0
a=0;// 
a=0;//     if-eq v1, v5, :cond_0
a=0;// 
a=0;//     if-ne v1, v6, :cond_6
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->em()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 189
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 227
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->D(Ljava/util/List;)V
a=0;// 
a=0;//     .line 228
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 192
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Boolean);v3=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->en()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 195
a=0;//     new-array v2, v3, [Ljava/lang/String;
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->getMode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toOctalString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v7
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->er()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->es()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     .line 199
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->et()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v6
a=0;// 
a=0;//     .line 200
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 202
a=0;//     if-ne v1, v4, :cond_4
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->eq()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ew()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v5, :cond_5
a=0;// 
a=0;//     if-ne v1, v6, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_5
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ev()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->eu()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->getSize()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_2
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ey()Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 214
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 215
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_7
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ep()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ey()Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ey()Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 220
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/ja;->ey()Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->ppid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 156
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Null);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected ek()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ja;->ex()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ja;->em()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ja;->eo()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     .line 73
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/iy;->b(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/iy;->g(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_2
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ja;->eo()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_3
a=0;// 
a=0;//     .line 75
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/iy;->c(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 76
a=0;//     :cond_3
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ja;->eo()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     if-ne v2, v3, :cond_4
a=0;// 
a=0;//     .line 77
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/iy;->d(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 78
a=0;//     :cond_4
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ja;->eo()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/iy;->e(Lcom/kingroot/kinguser/ja;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 86
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected init()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 48
a=0;//     #v3=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ho;->dw()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     const-string v2, "/system/bin/ddexe"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     const-string v2, "/system/bin/ddexe_real"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     const-string v2, "/system/bin/ddexereal"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hd:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2, v4}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->hc:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2, v4}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->hj:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->hl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v4}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->hk:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/gs;->hm:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v4}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/gs;->he:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     const-string v2, "ku.sud"
a=0;// 
a=0;//     invoke-direct {v1, v2, v5}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     const-string v2, "kuInotify"
a=0;// 
a=0;//     invoke-direct {v1, v2, v5}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/iy;->je:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/ja;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/ja;);
a=0;//     const-string v2, "k_worker"
a=0;// 
a=0;//     invoke-direct {v1, v2, v5}, Lcom/kingroot/kinguser/ja;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ja;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
}}
