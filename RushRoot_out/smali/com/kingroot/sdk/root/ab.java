package com.kingroot.sdk.root; class ab { void a() { int a;
a=0;// .class public Lcom/kingroot/sdk/root/ab;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lkrsdk/e;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static d:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Landroid/os/Handler;
a=0;// 
a=0;// .field protected b:Landroid/content/Context;
a=0;// 
a=0;// .field protected c:Lkrsdk/d;
a=0;// 
a=0;// .field private e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Lkrsdk/f;
a=0;// 
a=0;// .field private h:Lkrsdk/j;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// .field private j:Lkrsdk/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lkrsdk/d;Landroid/os/Looper;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 72
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/ab;->i:Z
a=0;// 
a=0;//     .line 75
a=0;//     const-string v0, "func.YunRootExecutor.<init>"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 77
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p2, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "kd"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/ab;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 84
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 553
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 554
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)I
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "func.RootExecutor.checkCanRoot("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->c(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-static {}, Lcom/kingroot/sdk/root/d;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     const-string v1, "needCheckKuUpdate here"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fv;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/fv;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "prepare"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/fv;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     and-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v7, v1
a=0;// 
a=0;//     .line 116
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     const v2, 0x30d6a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Lkrsdk/d;I)Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iput-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     .line 123
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 125
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget v1, v1, Lkrsdk/k;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v1=(Reference,Lkrsdk/k;);
a=0;//     iget-object v1, v1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 126
a=0;//     const v2, 0x30d6b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v7=(Reference,Lkrsdk/k;);
a=0;//     iget-object v7, v7, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v7, v7, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v7, v7, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v7, v7, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v7, v7, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v7, v7, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v7, v7, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v7, v7, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v1, v7, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, v7, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     if-ne v1, v9, :cond_4
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v9=(Conflicted);
a=0;//     iget-object v9, v7, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     iget-object v7, v7, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v7, v7, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     if-ne v7, v9, :cond_5
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Boolean);v9=(Conflicted);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v6, v8
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     .line 126
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 134
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     #v1=(Null);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     .line 136
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v3=(Reference,Lkrsdk/k;);
a=0;//     if-eqz v3, :cond_d
a=0;// 
a=0;//     .line 137
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v11, v3, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 138
a=0;//     #v11=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     if-eqz v11, :cond_d
a=0;// 
a=0;//     .line 139
a=0;//     array-length v9, v11
a=0;// 
a=0;//     .line 141
a=0;//     #v9=(Integer);
a=0;//     new-instance v12, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 142
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     move v10, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Integer);v3=(Conflicted);v7=(Conflicted);v10=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-lt v10, v9, :cond_a
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 160
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v3=(Reference,Lkrsdk/k;);
a=0;//     new-array v1, v2, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     invoke-virtual {v12, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iput-object v1, v3, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     move v7, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v1, v9
a=0;// 
a=0;//     .line 163
a=0;//     :goto_6
a=0;//     #v1=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u65b9\u6848\u6267\u884c\u5217\u8868 = "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     const v2, 0x30d55
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v6, v9
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput-object v8, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 166
a=0;//     return v7
a=0;// 
a=0;//     .line 115
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Null);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,[Ljava/lang/Object;);v7=(Reference,Lkrsdk/k;);v8=(PosByte);v9=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v7=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v7=(Boolean);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Boolean);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 129
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v2=(Reference,Lkrsdk/d;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Uninit);v9=(Uninit);
a=0;//     const v2, 0x30d6b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Network Fail."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 143
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Integer);v10=(Integer);v11=(Reference,[Lcom/kingroot/sdk/commom/d;);v12=(Reference,Ljava/util/ArrayList;);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     aget-object v13, v11, v10
a=0;// 
a=0;//     .line 146
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     invoke-static {v1, v13, v2}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Lcom/kingroot/sdk/commom/d;Lkrsdk/d;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 147
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 149
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/kingroot/sdk/root/ab;->i:Z
a=0;// 
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     iget v1, v13, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v1, v2, :cond_b
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/kingroot/sdk/root/ab;->i:Z
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, v13, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "_"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 142
a=0;//     :goto_8
a=0;//     add-int/lit8 v2, v10, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v8, v1
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 149
a=0;//     :cond_b
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 153
a=0;//     :cond_c
a=0;//     #v1=(Boolean);v2=(Reference,Lkrsdk/d;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u4e0d\u5141\u8bb8\u6267\u884c, sid = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, v13, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", KError.code = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     const-string v2, "DONT_ALLOW_SOLUTION"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     iget-object v15, v13, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     aput-object v15, v7, v14
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v1, v13, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/root/t;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v1, v8
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Null);v2=(Null);v3=(Reference,Lkrsdk/k;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);v9=(Conflicted);v10=(Uninit);v11=(Conflicted);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public final a()Lkrsdk/k;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final varargs a(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 559
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 560
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final varargs a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 570
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 571
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lkrsdk/h;I)Z
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.RootExecutor.takeOverByKu("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 491
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 492
a=0;//     #v6=(Null);
a=0;//     invoke-static {p1}, Lcom/kingroot/sdk/root/a;->a(Lkrsdk/h;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 494
a=0;//     #v7=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/l;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 495
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const v1, 0x30d53
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v5, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v9, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v8, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->a()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v9, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->b()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v9, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     const-string v9, ""
a=0;// 
a=0;//     aput-object v9, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v9, v5, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 496
a=0;//     const v1, 0x30d72
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     const-string v3, ""
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v5, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 498
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 500
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v7, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     if-ne v7, v0, :cond_a
a=0;// 
a=0;//     .line 501
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 502
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;Lkrsdk/h;)Z
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->f:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 505
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 506
a=0;//     const-string v0, "\u65b0\u542f\u52a8\u7684tmpShell\uff0c\u53ef\u7528"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 515
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/d;);
a=0;//     iget-object v2, v2, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "/su"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 516
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     iget-object v3, v3, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/superuser.apk"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 517
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     iget-object v4, v4, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/supolicy"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 518
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p2, v0, :cond_6
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 519
a=0;//     :goto_3
a=0;//     #v5=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/RushRoot/fz;->a(Landroid/content/Context;Lkrsdk/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 520
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "installSu = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 522
a=0;//     const/16 v0, 0x3a98
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/v;->a(II)Lcom/kingroot/sdk/root/v;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 523
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     invoke-static {v1, p2}, Lkrsdk/c;->a(Lkrsdk/h;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 524
a=0;//     :goto_4
a=0;//     #v0=(Boolean);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "installSu.isFullyKuSu = "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 525
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 526
a=0;//     invoke-virtual {v1}, Lcom/kingroot/sdk/root/a;->c()V
a=0;// 
a=0;//     :cond_1
a=0;//     move v6, v0
a=0;// 
a=0;//     .line 529
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Boolean);
a=0;//     const v1, 0x30d54
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Boolean);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v5, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v8, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->a()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->b()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     const-string v7, ""
a=0;// 
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 530
a=0;//     const v1, 0x30d73
a=0;// 
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     const-string v3, ""
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v5, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 531
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 532
a=0;//     return v6
a=0;// 
a=0;//     .line 495
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Integer);v8=(Reference,Ljava/lang/String;);v9=(Uninit);v10=(Uninit);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 496
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,[Ljava/lang/Object;);v9=(Reference,Ljava/lang/Integer;);v10=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 510
a=0;//     :cond_5
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/l;);v2=(Boolean);
a=0;//     const-string v0, "\u5df2\u6709tmpShell\uff0c\u76f4\u63a5\u7528"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 518
a=0;//     :cond_6
a=0;//     #v0=(One);v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 523
a=0;//     :cond_7
a=0;//     #v0=(Integer);v5=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 529
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v5=(Conflicted);v6=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 530
a=0;//     :cond_9
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v2=(Boolean);v5=(Reference,[Ljava/lang/Object;);v7=(Reference,Ljava/lang/Integer;);v8=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v6=(Null);v7=(Integer);v8=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lkrsdk/h;);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final b()I
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     const-string v1, "func.RootExecutor.prepare()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 172
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v10, v0, Lcom/kingroot/sdk/root/ab;->g:Lkrsdk/f;
a=0;// 
a=0;//     .line 174
a=0;//     #v10=(Reference,Lkrsdk/f;);
a=0;//     const v2, 0x30d4d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->a()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->b()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 177
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     #v2=(Null);
a=0;//     new-instance v13, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 179
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     const-string v1, "prepare() yis is null or solutionInfoArray is null"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 181
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Reference,Landroid/os/Handler;);v3=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 183
a=0;//     :cond_1
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);v2=(Null);v3=(Null);v9=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v14, v1, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 185
a=0;//     #v14=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v8, v1
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move v9, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Boolean);v3=(Boolean);v7=(Conflicted);v8=(Integer);v9=(Boolean);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     array-length v1, v14
a=0;// 
a=0;//     if-lt v8, v1, :cond_3
a=0;// 
a=0;//     .line 229
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/k;);
a=0;//     invoke-interface {v13}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     new-array v1, v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     invoke-interface {v13, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     iput-object v1, v2, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 231
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 232
a=0;//     const-string v1, "\u6ca1\u6709\u65b9\u6848\u4e0b\u8f7d\u6210\u529f\uff0c\u53ea\u602a\u7f51\u7edc\u95ee\u9898"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     const/16 v2, -0x1770
a=0;// 
a=0;//     #v2=(Short);
a=0;//     iput v2, v1, Lkrsdk/k;->a:I
a=0;// 
a=0;//     .line 236
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long/2addr v1, v11
a=0;// 
a=0;//     const-wide/32 v3, 0xf4240
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long v7, v1, v3
a=0;// 
a=0;//     .line 237
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const v2, 0x30d4e
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v1=(Reference,Lkrsdk/k;);
a=0;//     iget-object v1, v1, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     array-length v7, v14
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v7, v7, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->a()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->b()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 238
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 239
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v7=(Conflicted);v8=(Integer);
a=0;//     aget-object v15, v14, v8
a=0;// 
a=0;//     .line 187
a=0;//     #v15=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u51c6\u5907\u65b9\u6848\uff1asid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 193
a=0;//     :cond_4
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     invoke-static {v1, v15, v2}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Lcom/kingroot/sdk/commom/d;Lkrsdk/d;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 194
a=0;//     #v7=(Boolean);
a=0;//     const v2, 0x30d56
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     aput-object v16, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 195
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u4e0d\u5141\u8bb8\u6267\u884c2, sid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", KError.code = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     const-string v2, "DONT_ALLOW_SOLUTION"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     iget-object v0, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     aput-object v17, v7, v16
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v1, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/root/t;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v9
a=0;// 
a=0;//     .line 185
a=0;//     :goto_4
a=0;//     #v2=(Boolean);v3=(Boolean);v7=(Conflicted);v16=(Reference,Ljava/lang/Long;);v17=(Conflicted);
a=0;//     add-int/lit8 v1, v8, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v8, v1
a=0;// 
a=0;//     move v9, v2
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 194
a=0;//     :cond_5
a=0;//     #v1=(Reference,Landroid/content/Context;);v2=(Integer);v7=(Boolean);v16=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 203
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 204
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v15}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Lcom/kingroot/sdk/commom/d;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 205
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 207
a=0;//     invoke-static {v15}, Lcom/kingroot/sdk/root/t;->a(Lcom/kingroot/sdk/commom/d;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 209
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v4, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/root/t;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     .line 216
a=0;//     :goto_5
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v1, v4, v2
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/32 v3, 0xf4240
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long v16, v1, v3
a=0;// 
a=0;//     .line 217
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     const v2, 0x30d57
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     aput-object v18, v6, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v16, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 220
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     .line 221
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u51c6\u5907\u65b9\u6848\u6210\u529f\uff1asid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 223
a=0;//     invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move v2, v9
a=0;// 
a=0;//     .line 224
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 213
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v2=(LongLo);v3=(LongHi);v17=(Conflicted);v18=(Conflicted);
a=0;//     iget-object v4, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/sdk/root/t;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 214
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     move v7, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 217
a=0;//     :cond_8
a=0;//     #v1=(LongLo);v2=(Integer);v3=(LongLo);v4=(LongHi);v5=(LongHi);v9=(Boolean);v16=(LongLo);v17=(LongHi);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 225
a=0;//     :cond_9
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/Long;);v18=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u51c6\u5907\u65b9\u6848\u5931\u8d25\uff1asid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, v15, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v9
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 237
a=0;//     :cond_a
a=0;//     #v1=(Integer);v2=(Integer);v3=(LongLo);v4=(LongHi);v7=(LongLo);v8=(LongHi);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Boolean);v2=(LongLo);v3=(LongHi);v4=(Reference,Ljava/lang/String;);v7=(Boolean);v8=(Integer);v15=(Null);v16=(Reference,Ljava/lang/String;);
a=0;//     move v7, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public final b(I)Lkrsdk/h;
a=0;//     .locals 25
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "func.RootExecutor.execute("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 279
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     const-string v2, "EXEC_BEGIN"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 280
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 282
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     move-object/from16 v16, v1
a=0;// 
a=0;//     .line 283
a=0;//     :goto_0
a=0;//     #v16=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     const v2, 0x30d4f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     array-length v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v17, v1
a=0;// 
a=0;//     .line 288
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v17=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/l;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 289
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sput-object v1, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     sput-object v1, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 292
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/kingroot/sdk/root/d;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 293
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fv;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/fv;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "installSuAndManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/RushRoot/fv;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 294
a=0;//     #v7=(Boolean);
a=0;//     const v2, 0x30d63
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 295
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "kuOk = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v0, v0, Lcom/kingroot/sdk/root/ab;->g:Lkrsdk/f;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     .line 299
a=0;//     #v22=(Reference,Lkrsdk/f;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 300
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 301
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     .line 303
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 306
a=0;//     #v11=(Null);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 308
a=0;//     #v10=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     sget-object v2, Lcom/kingroot/sdk/root/ab;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v2, v3, v0}, Lcom/kingroot/sdk/root/g;->b(Landroid/content/Context;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 310
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v21, v1
a=0;// 
a=0;//     .line 441
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v8=(Reference,Lcom/kingroot/sdk/root/a;);v9=(Reference,Lcom/kingroot/sdk/root/v;);v10=(Integer);v11=(Reference,Lcom/kingroot/sdk/root/g;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Integer);v23=(Conflicted);v24=(Conflicted);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v1, :cond_6
a=0;// 
a=0;//     move/from16 v20, v10
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object v3, v11
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     move-object v5, v8
a=0;// 
a=0;//     move-object v6, v9
a=0;// 
a=0;//     .line 444
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/root/g;->c(Landroid/content/Context;)Lcom/kingroot/sdk/root/h;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 445
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     move/from16 v7, v17
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/g;Lcom/kingroot/sdk/root/h;Lkrsdk/h;Lkrsdk/h;Z)V
a=0;// 
a=0;//     .line 446
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 453
a=0;//     if-nez v20, :cond_15
a=0;// 
a=0;//     if-eqz v6, :cond_14
a=0;// 
a=0;//     :goto_5
a=0;//     return-object v6
a=0;// 
a=0;//     .line 282
a=0;//     :cond_3
a=0;//     #v3=(Null);v7=(Reference,[Ljava/lang/Object;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/k;->c:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     move-object/from16 v16, v1
a=0;// 
a=0;//     #v16=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move/from16 v17, v1
a=0;// 
a=0;//     #v17=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 294
a=0;//     :cond_5
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v1=(Reference,Lcom/kingroot/RushRoot/fv;);v7=(Boolean);v17=(Boolean);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 311
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Reference,Lcom/kingroot/sdk/root/a;);v9=(Reference,Lcom/kingroot/sdk/root/v;);v10=(Integer);v11=(Reference,Lcom/kingroot/sdk/root/g;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Integer);v22=(Reference,Lkrsdk/f;);v23=(Conflicted);v24=(Conflicted);
a=0;//     aget-object v23, v16, v21
a=0;// 
a=0;//     .line 312
a=0;//     #v23=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u6267\u884c\u65b9\u6848\uff1asid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 314
a=0;//     add-int/lit8 v1, v21, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_8
a=0;// 
a=0;//     .line 315
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "next_execute_solution_id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 320
a=0;//     :goto_6
a=0;//     if-eqz v22, :cond_7
a=0;// 
a=0;//     .line 321
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 323
a=0;//     :cond_7
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v3=(Reference,Lkrsdk/d;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v1, v2, v3, v0}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)Lcom/kingroot/sdk/root/r;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 324
a=0;//     #v12=(Reference,Lcom/kingroot/sdk/root/r;);
a=0;//     if-nez v12, :cond_9
a=0;// 
a=0;//     .line 325
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     const-string v2, "MAKE_SOLUTION_FAIL"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v13, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     aput-object v13, v7, v12
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v1, v10
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v7, v11
a=0;// 
a=0;//     .line 441
a=0;//     :goto_7
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     add-int/lit8 v2, v21, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v21, v2
a=0;// 
a=0;//     move v10, v1
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move-object v11, v7
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 317
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "next_execute_solution_id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v3, v21, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v3, v16, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v3, v3, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 328
a=0;//     :cond_9
a=0;//     #v0=(Null);v12=(Reference,Lcom/kingroot/sdk/root/r;);
a=0;//     const v2, 0x30d5a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 330
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v12, v0}, Lcom/kingroot/sdk/root/r;->a(I)V
a=0;// 
a=0;//     .line 333
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "init solution idx = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", sid = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 334
a=0;//     invoke-interface {v12}, Lcom/kingroot/sdk/root/r;->a()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 335
a=0;//     #v7=(Boolean);
a=0;//     const v2, 0x30d5b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v7, :cond_d
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_8
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v6, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-object v13, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     aput-object v13, v6, v1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 336
a=0;//     if-eqz v7, :cond_19
a=0;// 
a=0;//     .line 337
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     const-string v2, "KRSDK_Solution_Execute_Begin"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v13, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v13, v7, v11
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 341
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 343
a=0;//     new-instance v11, Lcom/kingroot/sdk/root/y;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/kingroot/sdk/root/y;);
a=0;//     invoke-direct {v11}, Lcom/kingroot/sdk/root/y;-><init>()V
a=0;// 
a=0;//     .line 347
a=0;//     :try_start_0
a=0;//     #v11=(Reference,Lcom/kingroot/sdk/root/y;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v4, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
a=0;// 
a=0;//     .line 348
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget v3, v0, Lcom/kingroot/sdk/commom/d;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v2, v0, v3}, Lcom/kingroot/sdk/root/g;->a(Landroid/content/Context;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 349
a=0;//     invoke-interface {v12, v11}, Lcom/kingroot/sdk/root/r;->a(Lcom/kingroot/sdk/root/y;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 351
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 352
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/root/g;->d(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 353
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     .line 354
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {v7}, Lcom/kingroot/sdk/root/g;->a()Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iput-object v1, v0, Lcom/kingroot/sdk/root/ab;->h:Lkrsdk/j;
a=0;// 
a=0;//     .line 358
a=0;//     :cond_a
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v11, v7}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;Lcom/kingroot/sdk/root/g;)V
a=0;// 
a=0;//     .line 360
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 362
a=0;//     #v4=(Byte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 363
a=0;//     #v1=(One);
a=0;//     if-nez v20, :cond_12
a=0;// 
a=0;//     .line 364
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 367
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v12}, Lcom/kingroot/sdk/root/r;->b()Lcom/kingroot/sdk/root/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 368
a=0;//     if-eqz v2, :cond_18
a=0;// 
a=0;//     .line 369
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/sdk/root/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 370
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 371
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 372
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\u65b9\u6848\u4e34\u65f6Root\u6210\u529f\uff1asid = "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 374
a=0;//     :goto_9
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v1=(Boolean);v3=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v5, v6, v11, v2, v7}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;Lkrsdk/h;Lcom/kingroot/sdk/root/g;)V
a=0;// 
a=0;//     .line 376
a=0;//     if-eqz v17, :cond_17
a=0;// 
a=0;//     .line 379
a=0;//     invoke-interface {v12, v2}, Lcom/kingroot/sdk/root/r;->a(Lkrsdk/h;)V
a=0;// 
a=0;//     .line 382
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v4, :cond_f
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move v12, v4
a=0;// 
a=0;//     .line 383
a=0;//     :goto_a
a=0;//     #v4=(Boolean);v12=(Boolean);
a=0;//     invoke-static {v12}, Lkrsdk/c;->a(Z)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 386
a=0;//     #v9=(Integer);
a=0;//     const/16 v4, 0x4e20
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Lcom/kingroot/sdk/root/v;->a(II)Lcom/kingroot/sdk/root/v;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 387
a=0;//     #v10=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     if-eqz v10, :cond_16
a=0;// 
a=0;//     .line 388
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Lcom/kingroot/sdk/root/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 389
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move/from16 v18, v1
a=0;// 
a=0;//     #v18=(One);
a=0;//     move/from16 v19, v3
a=0;// 
a=0;//     .line 392
a=0;//     :goto_b
a=0;//     #v0=(Integer);v1=(Boolean);v3=(Boolean);v18=(Boolean);v19=(Boolean);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v10, v0}, Lkrsdk/c;->a(Lkrsdk/h;I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 393
a=0;//     #v8=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 394
a=0;//     #v1=(Null);
a=0;//     if-eqz v2, :cond_1d
a=0;// 
a=0;//     if-nez v9, :cond_b
a=0;// 
a=0;//     if-eqz v8, :cond_1d
a=0;// 
a=0;//     .line 396
a=0;//     :cond_b
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v3=(Reference,Lkrsdk/d;);
a=0;//     iget-object v3, v3, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/su"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 397
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v4=(Reference,Lkrsdk/d;);
a=0;//     iget-object v4, v4, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/superuser.apk"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 398
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->c:Lkrsdk/d;
a=0;// 
a=0;//     #v5=(Reference,Lkrsdk/d;);
a=0;//     iget-object v5, v5, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "/supolicy"
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 399
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_10
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 400
a=0;//     :goto_c
a=0;//     #v6=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v1, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static/range {v1 .. v6}, Lcom/kingroot/RushRoot/fz;->a(Landroid/content/Context;Lkrsdk/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 401
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1c
a=0;// 
a=0;//     .line 402
a=0;//     invoke-static {v12}, Lkrsdk/c;->a(Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 403
a=0;//     #v3=(Integer);
a=0;//     const/16 v1, 0x3a98
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v1, v4}, Lcom/kingroot/sdk/root/v;->a(II)Lcom/kingroot/sdk/root/v;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 404
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v4, v0}, Lkrsdk/c;->a(Lkrsdk/h;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 406
a=0;//     :goto_d
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     move v15, v1
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 409
a=0;//     :goto_e
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/v;);v4=(Conflicted);v5=(Conflicted);v8=(Boolean);
a=0;//     if-nez v15, :cond_11
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     .line 410
a=0;//     :goto_f
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     move-object v5, v11
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/root/y;);
a=0;//     invoke-virtual/range {v3 .. v8}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;ILcom/kingroot/sdk/root/g;I)V
a=0;// 
a=0;//     .line 411
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     move-object v13, v7
a=0;// 
a=0;//     move v14, v8
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     invoke-virtual/range {v9 .. v15}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;ZLcom/kingroot/sdk/root/g;II)V
a=0;// 
a=0;//     .line 412
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     move v3, v6
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v4, v1
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     .line 415
a=0;//     :goto_10
a=0;//     #v1=(Boolean);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v19=(Conflicted);
a=0;//     if-eqz v18, :cond_1b
a=0;// 
a=0;//     .line 416
a=0;//     const-string v5, "\u8bb0\u5f55\u6210\u529f\u65b9\u6848\uff0c\u79fb\u9664\u4e0b\u4e00\u4e2a\u5f85\u6267\u884c\u65b9\u6848\u6807\u8bb0"
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 417
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v6, "solution_success_id"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v8, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6, v8}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 418
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v6, "next_execute_solution_id"
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     move/from16 v24, v3
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/root/a;);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     .line 427
a=0;//     :goto_11
a=0;//     #v2=(Integer);v6=(Conflicted);v8=(Conflicted);v18=(Conflicted);v24=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "sid = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", exploitRet = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", rootCode = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", tmpShell = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", suShell = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v11, v5}, Lcom/kingroot/RushRoot/fi;->a(Lcom/kingroot/sdk/root/y;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 429
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->e:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7, v1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/os/Handler;Lcom/kingroot/sdk/root/g;I)V
a=0;// 
a=0;//     .line 430
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/kingroot/sdk/wupsession/c;->b(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 431
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 434
a=0;//     if-nez v20, :cond_c
a=0;// 
a=0;//     if-nez v2, :cond_c
a=0;// 
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     if-eqz v17, :cond_13
a=0;// 
a=0;//     if-nez v4, :cond_13
a=0;// 
a=0;//     .line 435
a=0;//     :cond_c
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v11, v2, v5}, Lcom/kingroot/sdk/root/y;->b(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 440
a=0;//     :goto_12
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v1, :cond_1a
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v8, v3
a=0;// 
a=0;//     #v8=(Reference,Lcom/kingroot/sdk/root/a;);
a=0;//     move-object v9, v4
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 335
a=0;//     :cond_d
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Integer);v3=(Null);v7=(Boolean);v10=(Integer);v12=(Reference,Lcom/kingroot/sdk/root/r;);v13=(Conflicted);v20=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 350
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ujava/lang/Object;);v3=(Conflicted);v4=(Conflicted);v7=(Reference,[Ljava/lang/Object;);v13=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 351
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 352
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/root/g;->d(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 353
a=0;//     if-eqz v2, :cond_e
a=0;// 
a=0;//     .line 354
a=0;//     iput v10, v2, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {v2}, Lcom/kingroot/sdk/root/g;->a()Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/sdk/root/ab;->h:Lkrsdk/j;
a=0;// 
a=0;//     .line 357
a=0;//     :cond_e
a=0;//     throw v1
a=0;// 
a=0;//     .line 382
a=0;//     :cond_f
a=0;//     #v0=(Integer);v1=(Boolean);v3=(Boolean);v4=(PosByte);v20=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v12, v4
a=0;// 
a=0;//     #v12=(Null);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 399
a=0;//     :cond_10
a=0;//     #v1=(One);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v8=(Integer);v9=(Integer);v10=(Reference,Lcom/kingroot/sdk/root/v;);v12=(Boolean);v18=(Boolean);v19=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     .line 409
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/kingroot/sdk/root/v;);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Boolean);v15=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     .line 423
a=0;//     :cond_12
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v1=(One);v4=(Byte);v5=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/os/Handler;);v8=(Reference,Lcom/kingroot/sdk/root/a;);v9=(Reference,Lcom/kingroot/sdk/root/v;);v10=(Integer);v12=(Reference,Lcom/kingroot/sdk/root/r;);v15=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v3, v0, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move-object v3, v8
a=0;// 
a=0;//     move-object v4, v9
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     .line 437
a=0;//     :cond_13
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v1=(Boolean);v2=(Integer);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);
a=0;//     invoke-virtual {v11}, Lcom/kingroot/sdk/root/y;->a()V
a=0;// 
a=0;//     goto :goto_12
a=0;// 
a=0;//     :cond_14
a=0;//     #v1=(Reference,Landroid/content/Context;);v2=(Reference,Landroid/os/Handler;);v7=(Boolean);v13=(Conflicted);v23=(Conflicted);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 453
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_15
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_16
a=0;//     #v0=(Integer);v1=(Boolean);v3=(Boolean);v4=(PosShort);v5=(PosByte);v6=(Reference,Landroid/os/Handler;);v7=(Reference,Lcom/kingroot/sdk/root/g;);v8=(Reference,Lcom/kingroot/sdk/root/a;);v9=(Integer);v10=(Reference,Lcom/kingroot/sdk/root/v;);v12=(Boolean);v13=(Reference,Ljava/lang/String;);v23=(Null);
a=0;//     move/from16 v18, v1
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     move/from16 v19, v3
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :cond_17
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v4=(Byte);v5=(Reference,Lcom/kingroot/RushRoot/ga;);v9=(Reference,Lcom/kingroot/sdk/root/v;);v10=(Integer);v12=(Reference,Lcom/kingroot/sdk/root/r;);v18=(Conflicted);v19=(Conflicted);
a=0;//     move/from16 v18, v1
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     move v1, v3
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     move-object v4, v9
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :cond_18
a=0;//     #v1=(One);v3=(Null);v4=(Byte);v18=(Conflicted);
a=0;//     move/from16 v24, v3
a=0;// 
a=0;//     #v24=(Null);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :cond_19
a=0;//     #v0=(Null);v1=(Reference,Lcom/kingroot/sdk/root/ab;);v2=(Integer);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v7=(Boolean);v20=(Conflicted);v24=(Conflicted);
a=0;//     move v1, v10
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v7, v11
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_1a
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);v1=(Boolean);v2=(Conflicted);v3=(Reference,Lcom/kingroot/sdk/root/a;);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);v20=(Integer);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     move-object v6, v4
a=0;// 
a=0;//     move-object v3, v7
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_1b
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/root/a;);v3=(Integer);v6=(Conflicted);v18=(Boolean);
a=0;//     move/from16 v24, v3
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/root/a;);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     :cond_1c
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/root/a;);v6=(Boolean);v8=(Integer);v9=(Integer);v10=(Reference,Lcom/kingroot/sdk/root/v;);v12=(Boolean);v19=(Boolean);v24=(Conflicted);
a=0;//     move v1, v8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v9
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v4, v10
a=0;// 
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :cond_1d
a=0;//     #v0=(Integer);v1=(Null);v3=(Boolean);v4=(PosShort);v5=(PosByte);v6=(Reference,Landroid/os/Handler;);
a=0;//     move v15, v8
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move v6, v9
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v8, v1
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object v1, v10
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     goto/16 :goto_e
a=0;// .end method
a=0;// 
a=0;// .method public final c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v0, v0, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->j:Lkrsdk/k;
a=0;// 
a=0;//     iget-object v0, v0, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final d()Lkrsdk/h;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 459
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x3a98
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1, v5}, Lcom/kingroot/sdk/root/v;->a(II)Lcom/kingroot/sdk/root/v;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 460
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 461
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v6, v1
a=0;// 
a=0;//     .line 463
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ujava/lang/Object;);
a=0;//     const v1, 0x30d52
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v6}, Lcom/kingroot/sdk/root/a;->a(Lkrsdk/h;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 465
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v7=(Uninit);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 463
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/v;);v2=(Uninit);v6=(Uninit);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/v;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final e()Lkrsdk/h;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 471
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 472
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     const v1, 0x30d52
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v6}, Lcom/kingroot/sdk/root/a;->a(Lkrsdk/h;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/ab;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/sdk/root/ab;->b(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 473
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/ab;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 474
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v7=(Uninit);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 472
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final f()Lkrsdk/j;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->h:Lkrsdk/j;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/j;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 540
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->h:Lkrsdk/j;
a=0;// 
a=0;//     .line 544
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 542
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/ab;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/root/g;->b(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 543
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/root/g;->a()Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 544
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final g()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 564
a=0;//     iget-boolean v0, p0, Lcom/kingroot/sdk/root/ab;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
