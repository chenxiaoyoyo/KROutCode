package com.kingroot.kinguser; class ps { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/ps;
a=0;// .super Lcom/kingroot/kinguser/dp;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static qg:Z
a=0;// 
a=0;// .field public static volatile qh:Z
a=0;// 
a=0;// .field public static volatile qi:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mStartTime:J
a=0;// 
a=0;// .field private qa:Landroid/os/CountDownTimer;
a=0;// 
a=0;// .field protected qb:J
a=0;// 
a=0;// .field protected qc:J
a=0;// 
a=0;// .field protected qd:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field protected qe:I
a=0;// 
a=0;// .field private qf:I
a=0;// 
a=0;// .field protected qj:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field protected qk:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private ql:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private qm:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/ps;->qg:Z
a=0;// 
a=0;//     .line 52
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/ps;->qh:Z
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lcom/kingroot/kinguser/ps;->qi:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/dp;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     const-wide/16 v0, 0x1388
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->qb:J
a=0;// 
a=0;//     .line 43
a=0;//     const-wide/16 v0, 0x4b0
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->qc:J
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ps;->qd:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ps;->qe:I
a=0;// 
a=0;//     .line 48
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->mStartTime:J
a=0;// 
a=0;//     .line 49
a=0;//     iput v2, p0, Lcom/kingroot/kinguser/ps;->qf:I
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ps;->qj:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ps;->qk:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v0, Lcom/kingroot/kinguser/pu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/pu;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/pu;-><init>(Lcom/kingroot/kinguser/ps;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/pu;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ps;->ql:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v0, Lcom/kingroot/kinguser/pv;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/pv;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/pv;-><init>(Lcom/kingroot/kinguser/ps;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/pv;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ps;->qm:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->iO()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->qb:J
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->iP()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->qc:J
a=0;// 
a=0;//     .line 62
a=0;//     iput p2, p0, Lcom/kingroot/kinguser/ps;->qf:I
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private O(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 321
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ps;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/ps;->mStartTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/ps;J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/ps;->O(J)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 114
a=0;//     #v2=(One);
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dp;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dr;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/dr;->removeMessages(I)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qj:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qk:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->jb()V
a=0;// 
a=0;//     .line 129
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/ps;->qe:I
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qd:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/ps;->au(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dr;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/dr;->removeMessages(I)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qk:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qj:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 147
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/ps;->qf:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 148
a=0;//     const-wide/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/kinguser/ps;->O(J)V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->iQ()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected aI()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v6=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->aI()V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jt;->gm()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->ql:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->mStartTime:J
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v0, Lcom/kingroot/kinguser/pt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/pt;);
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/ps;->qb:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/kingroot/kinguser/ps;->qb:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ps;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/pt;-><init>(Lcom/kingroot/kinguser/ps;JJ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/pt;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ps;->qa:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qj:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qa:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;
a=0;// 
a=0;//     .line 102
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/ps;->mStartTime:J
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qk:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qm:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected au(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/pw;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/pw;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/kingroot/kinguser/pw;-><init>(Lcom/kingroot/kinguser/ps;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/pw;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 288
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected av(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 300
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ps;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/kingroot/kinguser/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 301
a=0;//     const-string v1, "main_pahe_state"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/ps;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->aL()Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->finish()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 307
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 304
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract iO()J
a=0;// .end method
a=0;// 
a=0;// .method public abstract iP()J
a=0;// .end method
a=0;// 
a=0;// .method public abstract iQ()V
a=0;// .end method
a=0;// 
a=0;// .method protected jb()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qa:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/CountDownTimer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ps;->qa:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V
a=0;// 
a=0;//     .line 330
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected l(IZ)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 342
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->gs()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->gq()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 344
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ff;->bR()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 345
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 347
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kh;->hc()Lcom/kingroot/kinguser/kh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/kh;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/kh;->hf()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/gg;->cz()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_3
a=0;// 
a=0;//     .line 349
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/ps;->qg:Z
a=0;// 
a=0;//     .line 360
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sget-boolean v0, Lcom/kingroot/kinguser/ps;->qg:Z
a=0;// 
a=0;//     .line 364
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 351
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/ps;->qg:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 354
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/gg;->cG()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 355
a=0;//     sput-boolean v0, Lcom/kingroot/kinguser/ps;->qg:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/ps;->jb()V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dp;->onStop()V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
}}
