package com.kingroot.kinguser; class zw { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/zw;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static BB:Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;// .field private static BC:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private BA:Ljava/lang/String;
a=0;// 
a=0;// .field private Bz:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zx;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zx;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zx;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/zw;->BC:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/zw;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zy;-><init>()V
a=0;// 
a=0;//     .line 341
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/kinguser/zy;->bZ(I)V
a=0;// 
a=0;//     .line 343
a=0;//     instance-of v1, p1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 344
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->bY(I)V
a=0;// 
a=0;//     .line 345
a=0;//     check-cast p1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->ca(I)V
a=0;// 
a=0;//     .line 363
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 346
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     instance-of v1, p1, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 347
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->bY(I)V
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->dh(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 349
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, p1, Ljava/lang/Short;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 350
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->bY(I)V
a=0;// 
a=0;//     .line 351
a=0;//     check-cast p1, Ljava/lang/Short;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->b(S)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, p1, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 353
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->bY(I)V
a=0;// 
a=0;//     .line 354
a=0;//     check-cast p1, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/zy;->U(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     instance-of v1, p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 356
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->bY(I)V
a=0;// 
a=0;//     .line 357
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->aE(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 358
a=0;//     :cond_5
a=0;//     instance-of v1, p1, [Ljava/lang/Byte;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/zy;->bY(I)V
a=0;// 
a=0;//     .line 360
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/zy;->s([B)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aD(Z)Lcom/kingroot/kinguser/aag;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     new-instance v1, Lcom/kingroot/kinguser/aag;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/aag;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/aag;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/aag;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/aag;->Ci:Ljava/lang/String;
a=0;// 
a=0;//     .line 233
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->kL()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/aag;->Ar:I
a=0;// 
a=0;//     .line 236
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/zw;->mJ()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/aag;->Cf:I
a=0;// 
a=0;//     .line 239
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eL()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eM()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 241
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v1, Lcom/kingroot/kinguser/aag;->Cg:I
a=0;// 
a=0;//     .line 243
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     .line 244
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/zw;->mE()Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zw;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zw;->lo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/aag;->yG:Ljava/lang/String;
a=0;// 
a=0;//     .line 249
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 240
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v1, Lcom/kingroot/kinguser/aag;->yG:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static bE(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     .line 376
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "%3B"
a=0;// 
a=0;//     .line 377
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p0}, Lcom/kingroot/kinguser/zw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 378
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     .line 379
a=0;//     const-string v2, "%7C"
a=0;// 
a=0;//     .line 380
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/kinguser/zw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 381
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     .line 382
a=0;//     const-string v2, "%0A"
a=0;// 
a=0;//     .line 383
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/kinguser/zw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 384
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     .line 368
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 369
a=0;//     invoke-virtual {p2, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 371
a=0;//     :cond_0
a=0;//     return-object p2
a=0;// .end method
a=0;// 
a=0;// .method private static dg(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     const-string v0, "Linux version "
a=0;// 
a=0;//     .line 389
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "Linux version "
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 390
a=0;//     const-string v0, "Linux version "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 391
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 394
a=0;//     :cond_0
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public static mE()Lcom/kingroot/kinguser/zw;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     sget-object v0, Lcom/kingroot/kinguser/zw;->BB:Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zw;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     const-class v1, Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/zw;->BB:Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/zw;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/zw;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zw;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/zw;->BB:Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/zw;->BB:Lcom/kingroot/kinguser/zw;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 51
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static mH()Lcom/kingroot/kinguser/zs;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 161
a=0;//     #v2=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 162
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vs;->L(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 164
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     .line 165
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/us;->D(Landroid/content/Context;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v5, Lcom/kingroot/kinguser/zs;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/zs;);
a=0;//     invoke-direct {v5}, Lcom/kingroot/kinguser/zs;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/zs;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vs;->I(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iput-object v6, v5, Lcom/kingroot/kinguser/zs;->xp:Ljava/lang/String;
a=0;// 
a=0;//     .line 169
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vs;->K(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, v5, Lcom/kingroot/kinguser/zs;->xq:Ljava/lang/String;
a=0;// 
a=0;//     .line 170
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->xr:Ljava/lang/String;
a=0;// 
a=0;//     .line 171
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->zt:Ljava/lang/String;
a=0;// 
a=0;//     .line 172
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->zy:Ljava/lang/String;
a=0;// 
a=0;//     .line 173
a=0;//     const/16 v0, 0x11
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zs;->wx:I
a=0;// 
a=0;//     .line 174
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->gR()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->zs:Ljava/lang/String;
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->kL()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zs;->Ar:I
a=0;// 
a=0;//     .line 176
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->zz:Ljava/lang/String;
a=0;// 
a=0;//     .line 177
a=0;//     iput v1, v5, Lcom/kingroot/kinguser/zs;->Aw:I
a=0;// 
a=0;//     .line 178
a=0;//     const/16 v0, 0xc9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zs;->zc:I
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v5, Lcom/kingroot/kinguser/zs;->Ax:Z
a=0;// 
a=0;//     .line 187
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vd;->lb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AY:Ljava/lang/String;
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->An:Ljava/lang/String;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lq()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->Ao:Ljava/lang/String;
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->ls()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zs;->Ay:I
a=0;// 
a=0;//     .line 191
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->xt:Ljava/lang/String;
a=0;// 
a=0;//     .line 192
a=0;//     const/16 v0, 0x804
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput-short v0, v5, Lcom/kingroot/kinguser/zs;->zB:S
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lw()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zs;->Az:I
a=0;// 
a=0;//     .line 196
a=0;//     aget-object v0, v4, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AA:Ljava/lang/String;
a=0;// 
a=0;//     .line 197
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/us;->kT()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AB:Ljava/lang/String;
a=0;// 
a=0;//     .line 198
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lcom/kingroot/kinguser/zs;->AC:I
a=0;// 
a=0;//     .line 199
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget-object v0, v4, v0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AD:Ljava/lang/String;
a=0;// 
a=0;//     .line 200
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/us;->kS()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, v5, Lcom/kingroot/kinguser/zs;->AE:J
a=0;// 
a=0;//     .line 201
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/us;->kU()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, v5, Lcom/kingroot/kinguser/zs;->AF:J
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v0, Lcom/kingroot/kinguser/vt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/vt;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/vt;-><init>()V
a=0;// 
a=0;//     .line 204
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vt;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vs;->a(Lcom/kingroot/kinguser/vt;)V
a=0;// 
a=0;//     .line 205
a=0;//     iget-wide v0, v0, Lcom/kingroot/kinguser/vt;->uK:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, v5, Lcom/kingroot/kinguser/zs;->AG:J
a=0;// 
a=0;//     .line 207
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lA()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AM:Ljava/lang/String;
a=0;// 
a=0;//     .line 208
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lz()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AH:Ljava/lang/String;
a=0;// 
a=0;//     .line 209
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lx()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AI:Ljava/lang/String;
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->ly()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 212
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lC()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->AN:Ljava/lang/String;
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lB()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->Bi:Ljava/lang/String;
a=0;// 
a=0;//     .line 215
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->ev()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->lJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 216
a=0;//     iput v2, v5, Lcom/kingroot/kinguser/zs;->AX:I
a=0;// 
a=0;//     .line 218
a=0;//     const-string v0, "gsm.version.baseband"
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/we;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->Bg:Ljava/lang/String;
a=0;// 
a=0;//     .line 219
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/we;->lV()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/zw;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->Bd:Ljava/lang/String;
a=0;// 
a=0;//     .line 220
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/zw;->dg(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/zw;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/kingroot/kinguser/zs;->Bj:Ljava/lang/String;
a=0;// 
a=0;//     .line 221
a=0;//     return-object v5
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iput-boolean v2, v5, Lcom/kingroot/kinguser/zs;->Ax:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static mI()Lcom/kingroot/kinguser/zt;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 253
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 255
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/zt;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/zt;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/kinguser/zt;-><init>()V
a=0;// 
a=0;//     .line 256
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/zt;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/kinguser/jc;->fp()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v4, v7}, Lcom/kingroot/kinguser/zt;->bU(I)V
a=0;// 
a=0;//     .line 259
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/zt;->bX(I)V
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {v4, v0}, Lcom/kingroot/kinguser/zt;->bV(I)V
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v4, v5}, Lcom/kingroot/kinguser/zt;->bW(I)V
a=0;// 
a=0;//     .line 263
a=0;//     const/16 v5, 0x7e9
a=0;// 
a=0;//     .line 264
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     .line 266
a=0;//     #v6=(Integer);
a=0;//     and-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lw()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 273
a=0;//     #v6=(Boolean);
a=0;//     new-array v7, v7, [Ljava/lang/String;
a=0;// 
a=0;//     .line 274
a=0;//     #v7=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/us;->D(Landroid/content/Context;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 276
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 278
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     const/16 v9, 0x3eb
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vs;->J(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 280
a=0;//     const/16 v9, 0x3e9
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vs;->K(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 282
a=0;//     const/16 v9, 0x3ec
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/vs;->L(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 284
a=0;//     const/16 v9, 0x3ee
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     const/16 v10, 0x11
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 285
a=0;//     const/16 v9, 0x3fb
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 286
a=0;//     const/16 v9, 0x3ea
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/kingroot/kinguser/um;->kL()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 288
a=0;//     const/16 v9, 0x3ef
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 290
a=0;//     const/16 v9, 0x3f4
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 291
a=0;//     const/16 v9, 0x3f5
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     const/16 v10, 0xc9
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v9, v10}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v9}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 292
a=0;//     const/16 v9, 0x3f0
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-static {v9, v0}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 293
a=0;//     const/16 v0, 0x3f8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 295
a=0;//     const/16 v0, 0x3f1
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lq()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 297
a=0;//     const/16 v0, 0x3f2
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->ls()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 298
a=0;//     const/16 v0, 0x3fa
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 299
a=0;//     const/16 v0, 0x3ed
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/um;->ev()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 301
a=0;//     const/16 v0, 0x3f9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/um;->kM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 303
a=0;//     const/16 v0, 0x3fd
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/we;->lV()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/zw;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 305
a=0;//     const/16 v0, 0x3fe
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/um;->gR()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 307
a=0;//     const/16 v0, 0x3f6
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 309
a=0;//     const/16 v0, 0x3f7
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vd;->lb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 311
a=0;//     const/16 v0, 0x3fc
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lA()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 314
a=0;//     const/16 v0, 0x3ff
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/us;->kS()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 315
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v7, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 317
a=0;//     const/16 v0, 0x401
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lC()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 319
a=0;//     const/16 v0, 0x402
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lB()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 321
a=0;//     const/16 v0, 0x403
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 323
a=0;//     const/16 v0, 0x404
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lz()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 325
a=0;//     const/16 v0, 0x405
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/zw;->dg(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/wd;->ci(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/zw;->a(ILjava/lang/Object;)Lcom/kingroot/kinguser/zy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/zy;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/zy;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v4, v8}, Lcom/kingroot/kinguser/zt;->u(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 329
a=0;//     return-object v4
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v6=(Integer);v7=(PosByte);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 269
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static mJ()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 398
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/kingroot/kinguser/ly;->o(Landroid/content/Context;)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 399
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 401
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     if-ne v3, v2, :cond_2
a=0;// 
a=0;//     .line 402
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 403
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     if-ne v3, v1, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 404
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 405
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 406
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public df(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2, p1, v0}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 120
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aad;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/aad;->BV:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized ln()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->ln()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/zw;->mG()Ljava/lang/String;
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 134
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized lo()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/zw;->mF()Ljava/lang/String;
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 149
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public mF()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/mb;->c(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aac;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aac;->yG:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vs;->cd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->Bz:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public mG()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->ln()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/mb;->b(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/yo;
a=0;// 
a=0;//     .line 88
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/yo;->ln()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/vs;->cc(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/zw;->BA:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public mK()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 415
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fo()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 416
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 417
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     sget-object v0, Lcom/kingroot/kinguser/zw;->BC:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 420
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
