package com.kingroot.kinguser; class qc { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/qc;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/qa;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/qc;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/qc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 160
a=0;//     #v7=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/fz;->cr()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 163
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 164
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 165
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/km;
a=0;// 
a=0;//     .line 166
a=0;//     iget v5, v0, Lcom/kingroot/kinguser/km;->kZ:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     iget v5, v0, Lcom/kingroot/kinguser/km;->kZ:I
a=0;// 
a=0;//     if-ne v7, v5, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_2
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v6, v0, Lcom/kingroot/kinguser/km;->kZ:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 177
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qc;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     const-wide/32 v5, 0x7f0a0013
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/kingroot/kinguser/qa;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v5, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 179
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-direct {v0, v5}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 180
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/km;
a=0;// 
a=0;//     .line 181
a=0;//     new-instance v6, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-direct {v6, v0, v5}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 184
a=0;//     :cond_4
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qc;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     const-wide/32 v5, 0x7f0a0014
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/kingroot/kinguser/qa;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v3, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v8
a=0;// 
a=0;//     invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-direct {v0, v3}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 187
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_2
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
a=0;//     check-cast v0, Lcom/kingroot/kinguser/km;
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v5, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-direct {v5, v0, v3}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 191
a=0;//     :cond_5
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qc;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     const-wide/32 v5, 0x7f0a0015
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/kingroot/kinguser/qa;->g(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v8
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 194
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/km;
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v3, Lcom/kingroot/kinguser/dw;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-direct {v3, v0, v1}, Lcom/kingroot/kinguser/dw;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/dw;);
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 199
a=0;//     :cond_6
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/qc;->qy:Lcom/kingroot/kinguser/qa;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/qa;);
a=0;//     invoke-virtual {v0, v4}, Lcom/kingroot/kinguser/qa;->c(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
}}
