package com.kingroot.RushRoot; class ae { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ae;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// .field public static b:I
a=0;// 
a=0;// .field public static d:I
a=0;// 
a=0;// .field private static e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public c:[I
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// .field private g:Lkrsdk/e;
a=0;// 
a=0;// .field private h:Landroid/os/Handler;
a=0;// 
a=0;// .field private i:Landroid/os/Handler;
a=0;// 
a=0;// .field private j:Landroid/os/Handler;
a=0;// 
a=0;// .field private k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// .field private l:J
a=0;// 
a=0;// .field private m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;// .field private n:I
a=0;// 
a=0;// .field private o:Ljava/lang/Object;
a=0;// 
a=0;// .field private p:Z
a=0;// 
a=0;// .field private q:Z
a=0;// 
a=0;// .field private r:Z
a=0;// 
a=0;// .field private s:I
a=0;// 
a=0;// .field private t:J
a=0;// 
a=0;// .field private u:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/RushRoot/ae;->a:Z
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     .line 1532
a=0;//     const v0, 0xc357b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/kingroot/RushRoot/ae;->d:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 156
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/ae;->l:J
a=0;// 
a=0;//     .line 1098
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     .line 1521
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1523
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     .line 1525
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     .line 1531
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     .line 1628
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     .line 101
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ai;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ai;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/RushRoot/ai;-><init>(Lcom/kingroot/RushRoot/ae;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ai;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// 
a=0;//     .line 1531
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1
a=0;//         0x1
a=0;//         0x1
a=0;//         0x1
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     .line 1178
a=0;//     #v0=(PosByte);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 1179
a=0;//     const/16 p0, 0x78
a=0;// 
a=0;//     .line 1183
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return p0
a=0;// 
a=0;//     .line 1180
a=0;//     :cond_1
a=0;//     if-ge p0, v0, :cond_0
a=0;// 
a=0;//     move p0, v0
a=0;// 
a=0;//     .line 1181
a=0;//     #p0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ae;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ae;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ae;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/RushRoot/ae;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ae;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     const-string v2, "func.RootSdk.initThreadIfNeed()"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "Init RootHandlerThread"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v3, "KR.RootThread"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/ah;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/ah;);
a=0;//     invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v3, v0, v4}, Lcom/kingroot/RushRoot/ah;-><init>(Lcom/kingroot/RushRoot/ae;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/ah;);
a=0;//     iput-object v3, v0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/RushRoot/ae;->l:J
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, v0, Lcom/kingroot/RushRoot/ae;->j:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     const-string v2, "Init ProgressSaveThread"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v3, "KR.ProgressThread"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/ag;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/ag;);
a=0;//     invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v0, v2}, Lcom/kingroot/RushRoot/ag;-><init>(Lcom/kingroot/RushRoot/ae;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/ag;);
a=0;//     iput-object v3, v0, Lcom/kingroot/RushRoot/ae;->j:Landroid/os/Handler;
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {}, Lkrsdk/g;->a()V
a=0;// 
a=0;//     .line 153
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 149
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "func.RootSdk.destoryRootThread()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     const-string v0, "Quit RootHandlerThread"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 190
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v0}, Landroid/os/Looper;->quit()V
a=0;// 
a=0;//     .line 196
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     .line 197
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/RushRoot/ae;->l:J
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "Quit ProgressSaveThread"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->j:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v0}, Landroid/os/Looper;->quit()V
a=0;// 
a=0;//     .line 205
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/ae;->j:Landroid/os/Handler;
a=0;// 
a=0;//     .line 207
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13881
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13882
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13883
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13884
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13885
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13886
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13887
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13888
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13889
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x1388a
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x1388b
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x1388c
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x1388d
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x1388e
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x1388f
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x13890
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 209
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/lang/Object;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const v8, 0x13889
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 921
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(One);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.dispatchUI("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 922
a=0;//     iput p1, p0, Lcom/kingroot/RushRoot/ae;->n:I
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/RushRoot/ae;->o:Ljava/lang/Object;
a=0;// 
a=0;//     .line 923
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     move-object v1, p2
a=0;// 
a=0;//     .line 993
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/af;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 994
a=0;//     :cond_0
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/af;);
a=0;//     if-nez v2, :cond_11
a=0;// 
a=0;//     .line 995
a=0;//     const-string v0, "OnRootListener is NULL."
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1075
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 927
a=0;//     :sswitch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Null);v7=(PosByte);
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     .line 928
a=0;//     const-string v0, "UI_ROOT_SUC"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 929
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 930
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/ae;->c(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lcom/kingroot/RushRoot/ae;->t:J
a=0;// 
a=0;//     .line 931
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 933
a=0;//     const v0, 0x13887
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 934
a=0;//     invoke-static {v7}, Lcom/kingroot/RushRoot/v;->b(I)V
a=0;// 
a=0;//     .line 939
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_10
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 940
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/io/Serializable;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 942
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v7, :cond_3
a=0;// 
a=0;//     .line 943
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/ae;->c(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lcom/kingroot/RushRoot/ae;->t:J
a=0;// 
a=0;//     .line 962
a=0;//     :cond_1
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     const/16 v5, 0x64
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ge v0, v5, :cond_e
a=0;// 
a=0;//     .line 963
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     .line 964
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "onRooting .. "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v5, p0, Lcom/kingroot/RushRoot/ae;->t:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, " .... "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 967
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->j:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 968
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->j:Landroid/os/Handler;
a=0;// 
a=0;//     iget v5, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v0, v3, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 969
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 970
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput v8, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 971
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 972
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     iget-wide v6, p0, Lcom/kingroot/RushRoot/ae;->t:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 936
a=0;//     :cond_2
a=0;//     #v0=(Integer);v5=(LongLo);v6=(LongHi);v7=(PosByte);
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/v;->b(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 945
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 947
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v5, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v0, v5, :cond_4
a=0;// 
a=0;//     const/16 v5, 0xf
a=0;// 
a=0;//     if-eq v0, v5, :cond_4
a=0;// 
a=0;//     const/16 v5, 0x23
a=0;// 
a=0;//     if-eq v0, v5, :cond_4
a=0;// 
a=0;//     const/16 v5, 0x32
a=0;// 
a=0;//     if-ne v0, v5, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     move v0, v4
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 948
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/RushRoot/ae;->c(I)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lcom/kingroot/RushRoot/ae;->t:J
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(PosByte);v6=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 947
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v5=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const/16 v5, 0xf
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v0, v5, :cond_7
a=0;// 
a=0;//     const/16 v5, 0x28
a=0;// 
a=0;//     if-eq v0, v5, :cond_7
a=0;// 
a=0;//     const/16 v5, 0x32
a=0;// 
a=0;//     if-ne v0, v5, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 949
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v5, 0x46
a=0;// 
a=0;//     if-ne v0, v5, :cond_1
a=0;// 
a=0;//     .line 950
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 951
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/v;->a()V
a=0;// 
a=0;//     .line 955
a=0;//     const-string v0, "func.ui_root_fail()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v3, v3}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Reference,Lkrsdk/j;);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v4, :cond_c
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_c
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_c
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_c
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const v2, 0x13885
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->f()Lkrsdk/j;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_b
a=0;//     #v2=(Reference,Lkrsdk/j;);
a=0;//     invoke-static {v3, v2}, Lcom/kingroot/RushRoot/ae;->a(ZLkrsdk/j;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x13886
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 974
a=0;//     :cond_d
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Null);v5=(Integer);v6=(LongHi);
a=0;//     const-string v0, "progressSaveHandler is NULL"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 977
a=0;//     :cond_e
a=0;//     #v0=(Integer);v5=(PosByte);v6=(Conflicted);
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_f
a=0;// 
a=0;//     .line 979
a=0;//     const-string v0, "\u6ee1100, \u6210\u529f\u5566\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 980
a=0;//     const p1, 0x1388f
a=0;// 
a=0;//     move-object p2, v2
a=0;// 
a=0;//     #p2=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 982
a=0;//     :cond_f
a=0;//     #v0=(Integer);p2=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u8d85\u51fa\u8fdb\u5ea6\u4e86::"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 986
a=0;//     :cond_10
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/Object;);v5=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 998
a=0;//     :cond_11
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Reference,Lcom/kingroot/RushRoot/af;);v7=(Conflicted);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1012
a=0;//     :pswitch_1
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->d()V
a=0;// 
a=0;//     .line 1013
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     .line 1014
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/v;->b(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1000
a=0;//     :pswitch_2
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v0}, Lcom/kingroot/RushRoot/af;->b(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1003
a=0;//     :pswitch_3
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->a()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1006
a=0;//     :pswitch_4
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->b()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1009
a=0;//     :pswitch_5
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->c()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_6
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 1017
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     .line 1018
a=0;//     invoke-interface {v2, v0}, Lcom/kingroot/RushRoot/af;->a(Lcom/kingroot/RushRoot/gx;)V
a=0;// 
a=0;//     .line 1019
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1022
a=0;//     :pswitch_7
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->e()V
a=0;// 
a=0;//     .line 1023
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1026
a=0;//     :pswitch_8
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1027
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1028
a=0;//     check-cast v1, Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     .line 1029
a=0;//     invoke-interface {v2, v1}, Lcom/kingroot/RushRoot/af;->b(Lcom/kingroot/RushRoot/gx;)V
a=0;// 
a=0;//     .line 1030
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1033
a=0;//     :pswitch_9
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1034
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1035
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->f()V
a=0;// 
a=0;//     .line 1036
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1039
a=0;//     :pswitch_a
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1040
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1041
a=0;//     check-cast v1, Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     .line 1042
a=0;//     invoke-interface {v2, v1}, Lcom/kingroot/RushRoot/af;->c(Lcom/kingroot/RushRoot/gx;)V
a=0;// 
a=0;//     .line 1043
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     .line 1044
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/RushRoot/ae;->c(Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1047
a=0;//     :pswitch_b
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1048
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1049
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->g()V
a=0;// 
a=0;//     .line 1050
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     .line 1051
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/RushRoot/ae;->c(Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1054
a=0;//     :pswitch_c
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1055
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v0}, Lcom/kingroot/RushRoot/af;->a(I)V
a=0;// 
a=0;//     .line 1056
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1059
a=0;//     :pswitch_d
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v2}, Lcom/kingroot/RushRoot/af;->h()V
a=0;// 
a=0;//     .line 1060
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     .line 1061
a=0;//     invoke-direct {p0, v4}, Lcom/kingroot/RushRoot/ae;->c(Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1065
a=0;//     :pswitch_e
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/kingroot/RushRoot/af;->a([I)V
a=0;// 
a=0;//     .line 1066
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1069
a=0;//     :pswitch_f
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1071
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/kingroot/RushRoot/af;->a([I)V
a=0;// 
a=0;//     .line 1072
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->o()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v2=(Null);v7=(PosByte);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 923
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x13887 -> :sswitch_0
a=0;//         0x13889 -> :sswitch_1
a=0;//         0x13890 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 998
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x13881
a=0;//         :pswitch_1
a=0;//         :pswitch_6
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_b
a=0;//         :pswitch_0
a=0;//         :pswitch_c
a=0;//         :pswitch_2
a=0;//         :pswitch_e
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_4
a=0;//         :pswitch_7
a=0;//         :pswitch_d
a=0;//         :pswitch_0
a=0;//         :pswitch_f
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static a(J)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x7d0
a=0;// 
a=0;//     .line 673
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v4, p0
a=0;// 
a=0;//     .line 674
a=0;//     sub-long v4, v2, v4
a=0;// 
a=0;//     .line 675
a=0;//     cmp-long v6, v4, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_0
a=0;// 
a=0;//     .line 680
a=0;//     :goto_0
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "remainTime = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 682
a=0;//     :try_start_0
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 686
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 677
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v4, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 678
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 683
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);
a=0;//     move-wide v0, v4
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ae;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ae;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/ae;->b(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(ZLkrsdk/j;)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     .line 1588
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "reportRootResult result = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1589
a=0;//     const-string v9, ""
a=0;// 
a=0;//     .line 1590
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p0, :cond_5
a=0;// 
a=0;//     .line 1591
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :goto_0
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     move-wide v4, v7
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     if-nez p1, :cond_4
a=0;// 
a=0;//     move-wide v6, v7
a=0;// 
a=0;//     :goto_4
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/kingroot/RushRoot/statics/a;->a(Ljava/lang/String;IIJJ)V
a=0;// 
a=0;//     .line 1603
a=0;//     :goto_5
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     .line 1604
a=0;//     return-void
a=0;// 
a=0;//     .line 1591
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(LongLo);
a=0;//     invoke-interface {p1}, Lkrsdk/j;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-interface {p1}, Lkrsdk/j;->b()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-interface {p1}, Lkrsdk/j;->f()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-interface {p1}, Lkrsdk/j;->c()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-interface {p1}, Lkrsdk/j;->d()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1597
a=0;//     :cond_5
a=0;//     #v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(LongLo);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez p1, :cond_6
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :goto_6
a=0;//     if-nez p1, :cond_7
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_7
a=0;//     #v2=(Integer);
a=0;//     if-nez p1, :cond_8
a=0;// 
a=0;//     move-wide v3, v7
a=0;// 
a=0;//     :goto_8
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     if-nez p1, :cond_9
a=0;// 
a=0;//     move-wide v5, v7
a=0;// 
a=0;//     :goto_9
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     if-nez p1, :cond_a
a=0;// 
a=0;//     :goto_a
a=0;//     invoke-virtual/range {v0 .. v9}, Lcom/kingroot/RushRoot/statics/a;->a(Ljava/lang/String;IJJJLjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-interface {p1}, Lkrsdk/j;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_7
a=0;//     invoke-interface {p1}, Lkrsdk/j;->f()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_8
a=0;//     invoke-interface {p1}, Lkrsdk/j;->c()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_9
a=0;//     invoke-interface {p1}, Lkrsdk/j;->d()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_a
a=0;//     invoke-interface {p1}, Lkrsdk/j;->e()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     goto :goto_a
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ae;Landroid/content/Context;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/ae;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ZZ)Z
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 735
a=0;//     const-string v0, "func.verifyClientRootSuc()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 736
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     .line 738
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 739
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "func.HostProtocolFace.hasRootedAfterExecuting()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/aw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/aw;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/aw;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/aw;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v4, v5}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/kingroot/RushRoot/aw;->b(Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->c()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->f()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "hasRootedAfterExecuting().ret = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ", errCode = "
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 740
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->c()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 741
a=0;//     #v8=(Boolean);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->f()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 742
a=0;//     #v4=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long v2, v5, v2
a=0;// 
a=0;//     const-wide/32 v5, 0xf4240
a=0;// 
a=0;//     div-long v9, v2, v5
a=0;// 
a=0;//     .line 743
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "hasRootedAfterExecuting.suc = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 744
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 746
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->d()Lkrsdk/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 747
a=0;//     sget v2, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Lkrsdk/c;->a(Lkrsdk/h;I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 748
a=0;//     #v11=(Integer);
a=0;//     invoke-interface {v0}, Lkrsdk/h;->c()V
a=0;// 
a=0;//     .line 749
a=0;//     if-nez v11, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v6, v0
a=0;// 
a=0;//     .line 750
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v6=(Boolean);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "verifyClientRootSuc() : kuTellMeSuc = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", kuErrCode = "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ",  krVerifySuc = "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", krVerifyCode = "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 751
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 753
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v7, v0
a=0;// 
a=0;//     .line 755
a=0;//     :goto_4
a=0;//     #v7=(PosByte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     const v1, 0x30d70
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v9, v5, v13
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v5, v9
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Lkrsdk/e;->a(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 756
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     const v1, 0x30d71
a=0;// 
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v12, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Lkrsdk/e;->a(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 758
a=0;//     return v8
a=0;// 
a=0;//     .line 739
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(LongLo);v3=(LongHi);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/aw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/aw;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/aw;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/aw;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->d()V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/aw;->e()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 744
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);v4=(Integer);v5=(LongLo);v6=(LongHi);v7=(Conflicted);v8=(Boolean);v9=(LongLo);v10=(LongHi);
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 749
a=0;//     :cond_3
a=0;//     #v2=(Integer);v11=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v6, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 751
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v2=(Reference,Ljava/lang/String;);v6=(Boolean);
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 753
a=0;//     :cond_5
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v7, v0
a=0;// 
a=0;//     #v7=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v7=(Conflicted);
a=0;//     if-eqz p2, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v7, v0
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v7=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v7, v0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 755
a=0;//     :cond_8
a=0;//     #v0=(Reference,Lkrsdk/e;);v1=(Integer);v7=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 756
a=0;//     :cond_9
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,[Ljava/lang/Object;);v9=(One);v10=(Reference,Ljava/lang/Integer;);v13=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "func.RootSdk.destoryReportThread()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ae;->e:Lcom/kingroot/RushRoot/ae;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     const-string v0, "Quit KRSDKReportThread"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 239
a=0;//     invoke-static {}, Lkrsdk/g;->b()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 236
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/ae;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     #v3=(Null);
a=0;//     const-string v0, "func.rt_continue_root()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lkrsdk/g;->a(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/sdk/root/g;->j:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "\u65b9\u6848\u91cd\u542f\u540eRoot\u6210\u529f\u4e86"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v3, v2}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/v;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x13887
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/root/g;->a()Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/RushRoot/ae;->a(ZLkrsdk/j;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "\u65b9\u6848\u91cd\u542f\u540eRoot\u5931\u8d25\u4e86"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, v1}, Lkrsdk/e;->a(I)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v1=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v1}, Lkrsdk/e;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->m()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/v;->a()V
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const v2, 0x13885
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v3, v3}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x13886
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->m:Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/root/g;->a()Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/RushRoot/ae;->a(ZLkrsdk/j;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(One);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x13889
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x1388b
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->k()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private b(Z)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const v7, 0x13891
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const v6, 0x13888
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 603
a=0;//     #v0=(One);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "func.rt_check_yun_root("
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ")"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 604
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 605
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v5}, Lcom/kingroot/sdk/util/i;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 606
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_f
a=0;// 
a=0;//     .line 608
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v5=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v5, v0}, Lkrsdk/e;->a(I)I
a=0;// 
a=0;//     .line 609
a=0;//     iget-boolean v5, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 610
a=0;//     invoke-static {v3, v4}, Lcom/kingroot/RushRoot/ae;->a(J)V
a=0;// 
a=0;//     .line 613
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v3=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v3}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 614
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     iget v4, v3, Lkrsdk/k;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_c
a=0;// 
a=0;//     .line 616
a=0;//     iget-object v1, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     iget-object v1, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_a
a=0;// 
a=0;//     .line 617
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v1=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v1}, Lkrsdk/e;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 619
a=0;//     iget-object v1, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     iget-object v1, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     iget-object v1, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     .line 621
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     .line 622
a=0;//     :cond_1
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/ae;->d(Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 623
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v1, v7}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 650
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 651
a=0;//     iget-object v1, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     iget-object v1, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_b
a=0;// 
a=0;//     iget-object v0, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     iget-object v0, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     iget-object v0, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v0, v0, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     .line 653
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x13883
a=0;// 
a=0;//     iget-object v2, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 670
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 625
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(Boolean);v2=(Null);v3=(Reference,Lkrsdk/k;);v4=(Integer);v5=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->m()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x13882
a=0;// 
a=0;//     iget-object v5, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     invoke-static {v1, v4, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 632
a=0;//     :cond_5
a=0;//     #v1=(Integer);v5=(Boolean);
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     if-eqz p1, :cond_8
a=0;// 
a=0;//     .line 633
a=0;//     :cond_6
a=0;//     iget-boolean v1, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/kingroot/RushRoot/ae;->d(Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 634
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v1, v7}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 636
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->m()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 639
a=0;//     :cond_8
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x1388e
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 644
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 648
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 656
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x13884
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 661
a=0;//     :cond_c
a=0;//     #v0=(One);v1=(PosByte);v4=(Conflicted);v5=(Boolean);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_d
a=0;// 
a=0;//     if-eqz p1, :cond_e
a=0;// 
a=0;//     :cond_d
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v2, v6, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 665
a=0;//     :cond_f
a=0;//     #v0=(One);v2=(Null);v3=(LongLo);v4=(LongHi);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_10
a=0;// 
a=0;//     if-nez p1, :cond_10
a=0;// 
a=0;//     .line 666
a=0;//     invoke-static {v3, v4}, Lcom/kingroot/RushRoot/ae;->a(J)V
a=0;// 
a=0;//     .line 668
a=0;//     :cond_10
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v3, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_11
a=0;// 
a=0;//     if-eqz p1, :cond_12
a=0;// 
a=0;//     :cond_11
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v2, v6, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1204
a=0;//     #v1=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1231
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 1208
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(One);v1=(Null);v3=(Uninit);
a=0;//     const-string v2, "krsdk"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1210
a=0;//     const-string v3, "krsdk.res"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v3, v2}, Lkrsdk/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1211
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 1212
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "extractFile fail: code = "
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lkrsdk/b;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", msg = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lkrsdk/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1213
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1216
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     new-instance v3, Lkrsdk/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lkrsdk/d;);
a=0;//     invoke-direct {v3}, Lkrsdk/d;-><init>()V
a=0;// 
a=0;//     .line 1217
a=0;//     #v3=(Reference,Lkrsdk/d;);
a=0;//     iput-object v2, v3, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     .line 1218
a=0;//     sget-boolean v2, Lcom/kingroot/RushRoot/ak;->a:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v3, Lkrsdk/d;->d:Z
a=0;// 
a=0;//     .line 1219
a=0;//     sget-boolean v2, Lcom/kingroot/RushRoot/br;->a:Z
a=0;// 
a=0;//     iput-boolean v2, v3, Lkrsdk/d;->e:Z
a=0;// 
a=0;//     .line 1220
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/ak;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v3, Lkrsdk/d;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 1221
a=0;//     const/16 v2, 0x270f
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iput v2, v3, Lkrsdk/d;->g:I
a=0;// 
a=0;//     .line 1223
a=0;//     invoke-static {p1, v3}, Lkrsdk/g;->a(Landroid/content/Context;Lkrsdk/d;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1224
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 1225
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "init fail: code = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lkrsdk/b;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", msg = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lkrsdk/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1226
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1228
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Boolean);
a=0;//     const-string v1, "getRootExecutor start..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1229
a=0;//     invoke-static {}, Lkrsdk/g;->d()Lkrsdk/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     .line 1230
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "getRootExecutor end, rootExecutor = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1204
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private c(I)J
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x32
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0xf
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const-wide/high16 v6, 0x3ff8000000000000L    # 1.5
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 1113
a=0;//     .line 1115
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1116
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq p1, v2, :cond_0
a=0;// 
a=0;//     .line 1117
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     rsub-int/lit8 v4, p1, 0x64
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long v0, v2, v4
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1167
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u5f53\u524d\u8fdb\u5ea6\uff1a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", \u91cd\u65b0\u8ba1\u7b97\u65f6\u95f4\u95f4\u9694\uff1a"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1168
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 1125
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v2}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, v2, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget v2, v2, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit16 v2, v2, 0x3e8
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v4, v2, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 1126
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-wide/32 v2, 0x1d4c0
a=0;// 
a=0;//     .line 1128
a=0;//     :cond_3
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x4e20
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_4
a=0;// 
a=0;//     .line 1129
a=0;//     const-wide/16 v2, 0x4e20
a=0;// 
a=0;//     .line 1132
a=0;//     :cond_4
a=0;//     iget-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     .line 1134
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge p1, v4, :cond_5
a=0;// 
a=0;//     .line 1135
a=0;//     const-wide/16 v0, 0x190
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1136
a=0;//     :cond_5
a=0;//     if-ge p1, v8, :cond_6
a=0;// 
a=0;//     .line 1137
a=0;//     const-wide/16 v0, 0xbb8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1138
a=0;//     :cond_6
a=0;//     const/16 v4, 0x23
a=0;// 
a=0;//     if-ge p1, v4, :cond_7
a=0;// 
a=0;//     .line 1139
a=0;//     const-wide/16 v4, 0x2
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     mul-long/2addr v2, v4
a=0;// 
a=0;//     const-wide/16 v4, 0x14
a=0;// 
a=0;//     div-long v0, v2, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1140
a=0;//     :cond_7
a=0;//     #v4=(PosByte);
a=0;//     if-ge p1, v9, :cond_8
a=0;// 
a=0;//     .line 1141
a=0;//     const-wide/16 v0, 0x85
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1142
a=0;//     :cond_8
a=0;//     const/16 v4, 0x46
a=0;// 
a=0;//     if-ge p1, v4, :cond_9
a=0;// 
a=0;//     .line 1143
a=0;//     const-wide/32 v4, 0x4f588
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     const-wide/16 v6, 0x2
a=0;// 
a=0;//     mul-long/2addr v2, v6
a=0;// 
a=0;//     sub-long v2, v4, v2
a=0;// 
a=0;//     const-wide/16 v4, 0x14
a=0;// 
a=0;//     div-long v0, v2, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1145
a=0;//     :cond_9
a=0;//     #v4=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "computeInterval\u8d85\u65f6\u9650\u5ea6\uff1a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1164
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1149
a=0;//     :cond_a
a=0;//     #v2=(LongLo);v3=(LongHi);v4=(Boolean);v5=(LongHi);
a=0;//     if-gez p1, :cond_b
a=0;// 
a=0;//     .line 1150
a=0;//     const-wide/16 v0, 0x7d0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1151
a=0;//     :cond_b
a=0;//     if-ge p1, v8, :cond_c
a=0;// 
a=0;//     .line 1152
a=0;//     const-wide/16 v0, 0x85
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1153
a=0;//     :cond_c
a=0;//     const/16 v4, 0x28
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge p1, v4, :cond_d
a=0;// 
a=0;//     .line 1154
a=0;//     long-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     mul-double/2addr v2, v6
a=0;// 
a=0;//     double-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x19
a=0;// 
a=0;//     :try_start_2
a=0;//     #v4=(LongLo);
a=0;//     div-long v0, v2, v4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1155
a=0;//     :cond_d
a=0;//     #v4=(PosByte);
a=0;//     if-ge p1, v9, :cond_e
a=0;// 
a=0;//     .line 1156
a=0;//     const-wide/16 v0, 0xc8
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1157
a=0;//     :cond_e
a=0;//     const/16 v4, 0x46
a=0;// 
a=0;//     if-ge p1, v4, :cond_f
a=0;// 
a=0;//     .line 1158
a=0;//     const-wide v4, 0x4115f90000000000L    # 360000.0
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     long-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     mul-double/2addr v2, v6
a=0;// 
a=0;//     sub-double v2, v4, v2
a=0;// 
a=0;//     double-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x14
a=0;// 
a=0;//     div-long v0, v2, v4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1160
a=0;//     :cond_f
a=0;//     #v4=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "computeInterval\u8d85\u65f6\u9650\u5ea6\uff1a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/kingroot/RushRoot/ae;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->k()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Z)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1081
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "CLICK_ROOT_NANOTIME"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/p;->d(Landroid/content/Context;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 1082
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 1084
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sub-long v7, v2, v0
a=0;// 
a=0;//     .line 1085
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1087
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     const-string v1, "CLICK_ROOT_DURING_TIME"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Lkrsdk/e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1092
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(LongLo);v3=(LongHi);v4=(Uninit);v5=(One);v7=(LongLo);v8=(LongHi);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 1087
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1090
a=0;//     :cond_2
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Byte);v7=(Uninit);v8=(Uninit);
a=0;//     const-string v0, "\u6ca1\u6709\u4fdd\u5b58\u5230\u70b9\u51fbRoot\u6309\u94ae\u7684\u65f6\u95f4\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static d(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1623
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u4e0a\u62a5\u5ba2\u6237\u7aef\u68c0\u67e5Root\u7edf\u8ba1\u70b9: rootState = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1624
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/RushRoot/statics/a;->a(I)V
a=0;// 
a=0;//     .line 1625
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     .line 1626
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/kingroot/RushRoot/ae;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 41
a=0;//     #v5=(One);
a=0;//     const-string v0, "func.rt_fix_root()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->e()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->d()Lkrsdk/h;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/h;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->f()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     sget v3, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v0, v2, v3}, Lkrsdk/e;->a(Lkrsdk/h;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "takeOverByKu.suc = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v2}, Lkrsdk/h;->c()V
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v5, v5}, Lcom/kingroot/RushRoot/ae;->a(ZZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->l()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-boolean v0, Lcom/kingroot/RushRoot/ae;->a:Z
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v5, v5}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x13890
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v5, v1}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     invoke-direct {p0, v5}, Lcom/kingroot/RushRoot/ae;->b(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Reference,Lkrsdk/h;);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d(Z)Z
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1540
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.checkNeedToSetOsc("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
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
a=0;//     .line 1542
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->g()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1543
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aput v2, v0, v2
a=0;// 
a=0;//     .line 1545
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lkrsdk/c;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1547
a=0;//     const-string v0, "\u5df2\u5f00\u542f\u7684\u6a21\u62df\u4f4d\u7f6e\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1549
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 1550
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     aput v2, v0, v9
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v6, v2
a=0;// 
a=0;//     .line 1561
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v6=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 1562
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1563
a=0;//     const-string v0, "\u4e0a\u62a5ALLOC_OSC_ROOT_COUNT\u7684Trace"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1565
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     const v1, 0x30d6c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v8, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     aget v8, v8, v2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v5, v2
a=0;// 
a=0;//     iget-object v8, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     aget v8, v8, v7
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v5, v7
a=0;// 
a=0;//     iget-object v7, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     aget v7, v7, v10
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v10
a=0;// 
a=0;//     iget-object v7, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     aget v7, v7, v9
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v9
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Lkrsdk/e;->a(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 1568
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1552
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(One);v8=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     aput v2, v0, v7
a=0;// 
a=0;//     .line 1553
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     aput v7, v0, v10
a=0;// 
a=0;//     .line 1554
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     aput v7, v0, v9
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v6, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1557
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v6=(Uninit);
a=0;//     const-string v0, "\u672a\u5f00\u542f\u7684\u6a21\u62df\u4f4d\u7f6e\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 1558
a=0;//     #v6=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v6=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1561
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/kingroot/RushRoot/ae;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->m()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/kingroot/RushRoot/ae;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->n()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private j()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 159
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/kingroot/RushRoot/ae;->l:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private k()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const v6, 0x1388c
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 527
a=0;//     #v4=(Null);
a=0;//     const-string v0, "func.rt_check_root()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 528
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->e()Lkrsdk/h;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 529
a=0;//     #v1=(Reference,Lkrsdk/h;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 532
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     sget v2, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Lkrsdk/e;->a(Lkrsdk/h;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 533
a=0;//     #v0=(Boolean);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "takeOverByKu.suc = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
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
a=0;//     .line 534
a=0;//     invoke-interface {v1}, Lkrsdk/h;->c()V
a=0;// 
a=0;//     .line 535
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 536
a=0;//     invoke-direct {p0, v4, v5}, Lcom/kingroot/RushRoot/ae;->a(ZZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 538
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-boolean v0, Lcom/kingroot/RushRoot/ae;->a:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 540
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x13881
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 542
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/ae;->d(I)V
a=0;// 
a=0;//     .line 556
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 545
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/ae;->d(I)V
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v6}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 548
a=0;//     invoke-direct {p0, v4}, Lcom/kingroot/RushRoot/ae;->b(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 552
a=0;//     :cond_2
a=0;//     #v1=(Reference,Lkrsdk/h;);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/ae;->d(I)V
a=0;// 
a=0;//     .line 553
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 554
a=0;//     invoke-direct {p0, v4}, Lcom/kingroot/RushRoot/ae;->b(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private l()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 563
a=0;//     #v1=(Null);
a=0;//     const-string v0, "func.takeOverByKu()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 566
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/KrPluginApplication;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 567
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 568
a=0;//     const-string v2, ","
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 569
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_2
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "kukdPath_"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " = "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aget-object v5, v3, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 571
a=0;//     aget-object v4, v3, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4, v1}, Lcom/kingroot/sdk/root/l;->a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 572
a=0;//     #v4=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/e;);
a=0;//     sget v5, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v2, v4, v5}, Lkrsdk/e;->a(Lkrsdk/h;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 576
a=0;//     #v2=(Boolean);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "kukd.takeOverByKu.suc = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", path = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aget-object v6, v3, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 577
a=0;//     invoke-interface {v4}, Lkrsdk/h;->c()V
a=0;// 
a=0;//     .line 578
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 579
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0, v1, v2}, Lcom/kingroot/RushRoot/ae;->a(ZZ)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 580
a=0;//     #v2=(Boolean);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "kukd.verifyClientRootSuc.suc = "
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", path = "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aget-object v5, v3, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 581
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 582
a=0;//     :cond_0
a=0;//     #v5=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 588
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method private m()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const v5, 0x13888
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 766
a=0;//     #v3=(One);
a=0;//     const-string v0, "func.rt_start_root()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/i;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 768
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 769
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v0}, Lkrsdk/e;->b()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 776
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v2=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v2}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 777
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     iget v2, v2, Lkrsdk/k;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_8
a=0;// 
a=0;//     .line 778
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     .line 779
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 780
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->g()V
a=0;// 
a=0;//     .line 782
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 784
a=0;//     :try_start_1
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/av;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 785
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "func.HostProtocolFace.tellHostRootStart()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/az;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/az;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/az;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/az;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v4}, Lcom/kingroot/RushRoot/az;->a(Z)V
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/az;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "need_continue_kr_on_enter"
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {v0, v4, v5}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 786
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     sget v4, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v0, v4}, Lkrsdk/e;->b(I)Lkrsdk/h;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 787
a=0;//     :try_start_2
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/v;->a()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 791
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/av;->a()V
a=0;// 
a=0;//     .line 794
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);v4=(Conflicted);v6=(Conflicted);
a=0;//     sget v2, Lcom/kingroot/RushRoot/ae;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Lkrsdk/c;->a(Lkrsdk/h;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 795
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 796
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ZZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 799
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 800
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     .line 805
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 806
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     .line 807
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     .line 813
a=0;//     :goto_3
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->j()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 814
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x13887
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 837
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 772
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Uninit);v4=(PosByte);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 774
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 788
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Null);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v6
a=0;// 
a=0;//     :goto_5
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lkrsdk/h;);v2=(Reference,Ljava/lang/Throwable;);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 791
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/av;->a()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/av;->a()V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 794
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 809
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     invoke-interface {v0}, Lkrsdk/e;->f()Lkrsdk/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/RushRoot/ae;->a(ZLkrsdk/j;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 816
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "Overdue RootThread IGNORE IGNORE IGNORE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 819
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "Root\u5931\u8d25\u4e86, \u9a8c\u8bc1\u5931\u8d25\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 821
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->n()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 826
a=0;//     :cond_7
a=0;//     #v0=(Integer);v4=(PosByte);v6=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->n()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 830
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v0, v5, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 834
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v0, v5, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 788
a=0;//     :catch_2
a=0;//     #v1=(Null);v2=(Null);v4=(Integer);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method private n()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 843
a=0;//     #v1=(Null);
a=0;//     const-string v0, "func.rt_root_fail()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 847
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 848
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/statics/a;);
a=0;//     invoke-virtual {v0, v1, v1}, Lcom/kingroot/RushRoot/statics/a;->a(ZZ)V
a=0;// 
a=0;//     .line 849
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/statics/a;->a()Lcom/kingroot/RushRoot/statics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/statics/a;->h()V
a=0;// 
a=0;//     .line 855
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 858
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->j()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 859
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const v2, 0x13885
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, v0, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 871
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 851
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->f()Lkrsdk/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/ae;->a(ZLkrsdk/j;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 861
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lkrsdk/k;);v1=(Boolean);v2=(One);
a=0;//     const-string v0, "Overdue RootThread IGNORE IGNORE IGNORE"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 865
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->j()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 866
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x13886
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 868
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     const-string v0, "Overdue RootThread IGNORE IGNORE IGNORE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private o()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 916
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->n:I
a=0;// 
a=0;//     .line 917
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->o:Ljava/lang/Object;
a=0;// 
a=0;//     .line 918
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private p()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1364
a=0;//     const-string v0, "func.checkRoot()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1365
a=0;//     const v0, 0x1388b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1366
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f93
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 1367
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(ILcom/kingroot/RushRoot/af;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1260
a=0;//     #v1=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "func.dispatchWhere("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", OnRootListener)"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1262
a=0;//     const-string v0, "func.removeRootListener()"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/RushRoot/af;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/kingroot/RushRoot/af;->i()V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 1263
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 1264
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1265
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u7eed\u4e0a\u4e0a\u4e00\u8fc7\u7a0b\uff1awhatUI = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->n:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1269
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->i:Landroid/os/Handler;
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->n:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 1270
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/ae;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->o:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1305
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1262
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1278
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1281
a=0;//     :pswitch_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->p()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1284
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ae;->fixRoot()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1287
a=0;//     :pswitch_2
a=0;//     const-string v0, "func.continueRoot()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lkrsdk/c;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "ROOT_PROGRESS"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u4fdd\u5b58\u7684\u8fdb\u5ea6\uff1a"
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "PLUGIN_ENTER_ROOT_TYPE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     const v0, 0x13889
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f92
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/v;->a()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ae;->p()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1278
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final varargs a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 1580
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1581
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     const v1, 0x30d6d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface/range {v0 .. v5}, Lkrsdk/e;->a(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1585
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1583
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "RootExecutor IS NULL"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1374
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.checkYunRoot("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
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
a=0;//     .line 1375
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 1376
a=0;//     :cond_0
a=0;//     const v0, 0x13889
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1380
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f95
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 1381
a=0;//     return-void
a=0;// 
a=0;//     .line 1378
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     const v0, 0x1388c
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1312
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.continueAfterNetworkSetted("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     .line 1313
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     .line 1314
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/RushRoot/ae;->a(Z)V
a=0;// 
a=0;//     .line 1320
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1315
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 1316
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/RushRoot/ae;->startRoot(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1317
a=0;//     :cond_2
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 1318
a=0;//     invoke-virtual {p0, v3}, Lcom/kingroot/RushRoot/ae;->a(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1238
a=0;//     const-string v0, "func.initSdk()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1239
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x15f91
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 1240
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1352
a=0;//     const-string v0, "func.removeRootListener()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1353
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1354
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V
a=0;// 
a=0;//     .line 1355
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ae;->k:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 1357
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final e()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 1476
a=0;//     #v4=(One);
a=0;//     const-string v0, "func.continueAfterSettingMockLoc()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1477
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1478
a=0;//     const-string v0, "func.fixRootAfterSettingMockLoc()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u7ee7\u7eed\u7684\u8fdb\u5ea6\uff1a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "CLICK_ROOT_NANOTIME"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/kingroot/RushRoot/ae;->d(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const v0, 0x13891
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1482
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1478
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(LongLo);v3=(LongHi);
a=0;//     const v0, 0x13889
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f94
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1480
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0, v4}, Lcom/kingroot/RushRoot/ae;->startRoot(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final f()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1503
a=0;//     #v1=(Null);
a=0;//     const-string v0, "func.retryRoot()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1504
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1505
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     .line 1506
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     .line 1507
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u521d\u59cb\u5316\u8fdb\u5ea6\uff1a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1508
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "CLICK_ROOT_NANOTIME"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 1509
a=0;//     const v0, 0x13889
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1510
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f95
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 1512
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final fixRoot()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1442
a=0;//     #v2=(Null);
a=0;//     const-string v0, "func.fixRoot()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1443
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "PLUGIN_ENTER_ROOT_TYPE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1444
a=0;//     iput-boolean v3, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     .line 1445
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1446
a=0;//     iput-boolean v2, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     .line 1447
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     .line 1448
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u521d\u59cb\u5316\u8fdb\u5ea6\uff1a"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1449
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "CLICK_ROOT_NANOTIME"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 1451
a=0;//     const v0, 0x13889
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1452
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f97
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 1453
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final g()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1515
a=0;//     const-string v0, "func.reportOnNetworkReady()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1516
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x15f98
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 1517
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final h()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1635
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 1636
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     .line 1643
a=0;//     :goto_0
a=0;//     #v0=(LongLo);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 1640
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/e;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->g:Lkrsdk/e;
a=0;// 
a=0;//     invoke-interface {v0}, Lkrsdk/e;->a()Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1641
a=0;//     iget-wide v0, v0, Lcom/kingroot/RushRoot/gx;->e:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     .line 1643
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final i()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1651
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/ae;->h()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     .line 1652
a=0;//     iget-wide v0, p0, Lcom/kingroot/RushRoot/ae;->u:J
a=0;// 
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public final startRoot(Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1388
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.startRoot("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
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
a=0;//     .line 1389
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1390
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->q:Z
a=0;// 
a=0;//     .line 1391
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->r:Z
a=0;// 
a=0;//     .line 1392
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     .line 1393
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u521d\u59cb\u5316\u8fdb\u5ea6\uff1a"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/kingroot/RushRoot/ae;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1396
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "CLICK_ROOT_NANOTIME"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 1398
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "func.startRootInternal("
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
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
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "PLUGIN_ENTER_ROOT_TYPE"
a=0;// 
a=0;//     invoke-static {v0, v1, v4}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     iput-boolean v4, p0, Lcom/kingroot/RushRoot/ae;->p:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "startRoot("
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
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
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/RushRoot/ae;->d(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const v0, 0x1388a
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/ae;->c:[I
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1399
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1398
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     const v0, 0x13889
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/kingroot/RushRoot/ae;->a(ILjava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ae;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const v1, 0x15f94
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "func.HostProtocolFace.tellHostClickBeginRoot()"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/br;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ay;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ay;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/ay;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ay;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/KrPluginApplication;->a()Lcom/kingroot/loader/sdk/KPContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/ay;->g()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/loader/sdk/KPContext;->talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
