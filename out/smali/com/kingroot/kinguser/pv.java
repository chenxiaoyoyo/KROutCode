package com.kingroot.kinguser; class pv { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/pv;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/ps;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/pv;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/wb;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 173
a=0;//     #v2=(One);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/gj;->s(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 174
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/kingroot/kinguser/ps;->l(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 178
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ps;->a(Lcom/kingroot/kinguser/ps;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ps;->a(Lcom/kingroot/kinguser/ps;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ps;->a(Lcom/kingroot/kinguser/ps;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     sub-long v3, v1, v3
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     iget-wide v5, v5, Lcom/kingroot/kinguser/ps;->qc:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_1
a=0;// 
a=0;//     .line 181
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/ps;->qc:J
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/ps;->a(Lcom/kingroot/kinguser/ps;)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     add-long/2addr v3, v5
a=0;// 
a=0;//     sub-long v1, v3, v1
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/ps;->a(Lcom/kingroot/kinguser/ps;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lcom/kingroot/kinguser/ps;->a(Lcom/kingroot/kinguser/ps;J)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/pv;->qn:Lcom/kingroot/kinguser/ps;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ps;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/dr;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     iput v0, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// 
a=0;//     .line 182
a=0;//     :catch_0
a=0;//     #v1=(LongLo);v2=(LongHi);v3=(Conflicted);v4=(LongHi);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_0
a=0;// .end method
}}
