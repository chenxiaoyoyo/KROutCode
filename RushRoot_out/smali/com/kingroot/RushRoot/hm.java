package com.kingroot.RushRoot; class hm { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/hm;
a=0;// .super Lcom/kingroot/RushRoot/hk;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;// .field private d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/hq;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/hk;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/hm;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/hm;->a:Z
a=0;// 
a=0;//     .line 33
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/hm;)Lcom/kingroot/RushRoot/hq;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/hm;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/hm;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/hm;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/hm;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/hm;->a:Z
a=0;// 
a=0;//     .line 69
a=0;//     iput v2, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/hq;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(One);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget-boolean v0, v0, Lcom/kingroot/RushRoot/hq;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ip;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/hq;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v4, :cond_3
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/hq;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/hq;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v4, :cond_4
a=0;// 
a=0;//     .line 87
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/hq;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gt v0, v3, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/hq;->j:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/hq;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/RushRoot/hy;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/hm;->a:Z
a=0;// 
a=0;//     .line 96
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/hm;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hp;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hp;-><init>()V
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hp;);
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/hq;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/hq;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget v3, v3, Lcom/kingroot/RushRoot/hq;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/hq;->i:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v3, v0, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/hq;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v3, v0}, Lcom/kingroot/RushRoot/hy;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Lcom/kingroot/RushRoot/hp;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     .line 110
a=0;//     :goto_2
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/hm;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :cond_5
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 106
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/hm;->b:I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final b(Lcom/kingroot/RushRoot/jc;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 299
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hq;);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "repair "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/hq;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hn;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/hn;-><init>(Lcom/kingroot/RushRoot/hm;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hn;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/kingroot/RushRoot/iu;->a(Lcom/kingroot/RushRoot/jc;Lcom/kingroot/RushRoot/iv;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 290
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "repair "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/hm;->c:Lcom/kingroot/RushRoot/hq;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/kingroot/RushRoot/hq;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "..."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 293
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hm;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/hm;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
