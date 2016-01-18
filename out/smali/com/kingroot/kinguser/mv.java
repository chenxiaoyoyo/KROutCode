package com.kingroot.kinguser; class mv { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/mv;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private od:Ljava/lang/String;
a=0;// 
a=0;// .field private oe:Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;// .field private of:Lcom/kingroot/kinguser/mx;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/kingroot/kinguser/mx;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/mv;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/mv;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/mv;->od:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/mv;->of:Lcom/kingroot/kinguser/mx;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/mv;Lcom/kingroot/kinguser/nv;)Lcom/kingroot/kinguser/nv;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/mv;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private ii()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->oe:Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->oe:Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/kr;->lM:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/kr;->lF:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v1, v0}, Lcom/kingroot/kinguser/mv;->v(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private v(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nu;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/kingroot/kinguser/nu;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nu;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/nv;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/mv;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2, v0}, Lcom/kingroot/kinguser/nv;-><init>(Landroid/content/Context;Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/nv;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/mv;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/mv;->od:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/nv;->bm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     new-instance v1, Lcom/kingroot/kinguser/mw;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/mw;);
a=0;//     invoke-direct {v1, p0}, Lcom/kingroot/kinguser/mw;-><init>(Lcom/kingroot/kinguser/mv;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/mw;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/nv;->b(Lcom/kingroot/kinguser/oa;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->lW:Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nv;->iD()V
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 82
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/mv;->ii()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :pswitch_1
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     instance-of v0, v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->of:Lcom/kingroot/kinguser/mx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mx;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/mv;->of:Lcom/kingroot/kinguser/mx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/mx;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/kingroot/kinguser/mx;->c(Lcom/kingroot/kinguser/nu;)V
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/mv;->ii()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     instance-of v0, v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->of:Lcom/kingroot/kinguser/mx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mx;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/mv;->of:Lcom/kingroot/kinguser/mx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/mx;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/nu;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/kingroot/kinguser/mx;->d(Lcom/kingroot/kinguser/nu;)V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/mv;->ii()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public x(Ljava/util/List;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/mv;->oe:Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mv;->oe:Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/mv;->oe:Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 45
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/mv;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
}}
