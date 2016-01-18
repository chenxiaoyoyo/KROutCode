package com.kingroot.RushRoot; class ga { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ga;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljava/io/File;
a=0;// 
a=0;// .field private c:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "slog"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "actsts"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ga;->b:Ljava/io/File;
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "slog"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "rest"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/ga;->c:Ljava/io/File;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     const-class v1, Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ga;->a:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/ga;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/RushRoot/ga;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/ga;->a:Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/kingroot/RushRoot/ga;->a:Lcom/kingroot/RushRoot/ga;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 67
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
a=0;// .method private static a(Ljava/lang/String;)Lcom/kingroot/RushRoot/gy;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 128
a=0;//     #v4=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     const-string v1, "\t"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 131
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gy;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gy;-><init>()V
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gy;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     aget-object v1, v2, v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/gy;->a:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 140
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(One);
a=0;//     aget-object v1, v2, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/gy;->b:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 145
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     aget-object v1, v2, v7
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gy;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 146
a=0;//     aget-object v1, v2, v5
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v3, v2, v6
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     aget-object v2, v2, v7
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gy;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 135
a=0;//     :catch_0
a=0;//     #v1=(Integer);v2=(Reference,[Ljava/lang/String;);v3=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 136
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     const-string v3, "line2sui_1"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 137
a=0;//     iput v4, v0, Lcom/kingroot/RushRoot/gy;->a:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :catch_1
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     const-string v3, "line2sui_2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 143
a=0;//     iput v4, v0, Lcom/kingroot/RushRoot/gy;->b:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/RushRoot/ga;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ga;->b:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x7c
a=0;// 
a=0;//     .line 270
a=0;//     #v3=(PosByte);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     invoke-static {p4}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p4
a=0;// 
a=0;//     .line 275
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 279
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 281
a=0;//     sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 282
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 283
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 287
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 288
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 289
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 291
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 295
a=0;//     sget-object v1, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v1=(Reference,Lkrsdk/d;);
a=0;//     iget-object v1, v1, Lkrsdk/d;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 298
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 300
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 304
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 305
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     .line 177
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {p2, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     return-object p2
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gy;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gy;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gy;);
a=0;//     iput p1, v0, Lcom/kingroot/RushRoot/gy;->a:I
a=0;// 
a=0;//     .line 99
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long/2addr v1, v3
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/gy;->b:I
a=0;// 
a=0;//     .line 100
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/gy;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 101
a=0;//     iput-object p2, v0, Lcom/kingroot/RushRoot/gy;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/gb;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/gb;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/kingroot/RushRoot/gb;-><init>(Lcom/kingroot/RushRoot/ga;Lcom/kingroot/RushRoot/gy;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/gb;);
a=0;//     invoke-virtual {p3, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/RushRoot/ga;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ga;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     .line 185
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "%3B"
a=0;// 
a=0;//     .line 186
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p0}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     .line 188
a=0;//     const-string v2, "%7C"
a=0;// 
a=0;//     .line 189
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 190
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     .line 191
a=0;//     const-string v2, "%0A"
a=0;// 
a=0;//     .line 192
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 193
a=0;//     const-string v1, "\t"
a=0;// 
a=0;//     .line 194
a=0;//     const-string v2, "%09"
a=0;// 
a=0;//     .line 195
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 196
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static c(Ljava/lang/String;)Lcom/kingroot/RushRoot/go;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 438
a=0;//     #v4=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 439
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     const-string v1, "\t"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 441
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 442
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/go;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/go;-><init>()V
a=0;// 
a=0;//     .line 443
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/go;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v1, v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/go;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 445
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(One);
a=0;//     aget-object v2, v1, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/go;->b:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 450
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(PosByte);
a=0;//     aget-object v2, v1, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/go;->c:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 455
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(PosByte);
a=0;//     aget-object v2, v1, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/go;->d:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 460
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     :try_start_3
a=0;//     #v2=(PosByte);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/kingroot/RushRoot/go;->e:J
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     .line 466
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 447
a=0;//     :catch_0
a=0;//     #v1=(Reference,[Ljava/lang/String;);v2=(Integer);v3=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     iput v4, v0, Lcom/kingroot/RushRoot/go;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 452
a=0;//     :catch_1
a=0;//     #v2=(Integer);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     iput v4, v0, Lcom/kingroot/RushRoot/go;->c:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 457
a=0;//     :catch_2
a=0;//     #v2=(Integer);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     iput v4, v0, Lcom/kingroot/RushRoot/go;->d:I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 462
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/kingroot/RushRoot/go;->e:J
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Ljava/util/ArrayList;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ga;->b:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/File;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 159
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 160
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     return-object v1
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 161
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/gy;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 162
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/gy;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sui = null, line = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final varargs a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x7c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 369
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 371
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v0, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v0, p2, p3, p4}, Lcom/kingroot/RushRoot/ga;->a(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 372
a=0;//     array-length v3, p6
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     array-length v0, p6
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v0, v3, :cond_2
a=0;// 
a=0;//     .line 386
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 387
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 388
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v1, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 389
a=0;//     invoke-direct {p0, p1, v3, p5}, Lcom/kingroot/RushRoot/ga;->a(ILjava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 390
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "EMID : "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     const-string v0, "Undefined"
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", pv = "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 391
a=0;//     return-void
a=0;// 
a=0;//     .line 372
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Null);v3=(Integer);
a=0;//     aget-object v4, p6, v0
a=0;// 
a=0;//     .line 373
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 374
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 375
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 378
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 379
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 372
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 384
a=0;//     :cond_2
a=0;//     #v3=(PosByte);v4=(Conflicted);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 383
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 390
a=0;//     :pswitch_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/StringBuilder;);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "EMID_KRSDK_Device_Info_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     const-string v0, "EMID_KRSDK_Download_KU_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_3
a=0;//     const-string v0, "EMID_KRSDK_Prepare_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_4
a=0;//     const-string v0, "EMID_KRSDK_Prepare_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_5
a=0;//     const-string v0, "EMID_KRSDK_Execute_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_6
a=0;//     const-string v0, "EMID_KRSDK_Execute_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_7
a=0;//     const-string v0, "EMID_KRSDK_GetShell_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_8
a=0;//     const-string v0, "EMID_KRSDK_GetShell_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_9
a=0;//     const-string v0, "EMID_KRSDK_PushSu_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_a
a=0;//     const-string v0, "EMID_KRSDK_PushSu_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_b
a=0;//     const-string v0, "EMID_KRSDK_Got_Solutions"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_c
a=0;//     const-string v0, "EMID_KRSDK_Solution_Prepare_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_d
a=0;//     const-string v0, "EMID_KRSDK_Solution_Prepare_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_e
a=0;//     const-string v0, "EMID_KRSDK_Solution_Verify_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_f
a=0;//     const-string v0, "EMID_KRSDK_Solution_Decompress_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_10
a=0;//     const-string v0, "EMID_KRSDK_Solution_Init_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_11
a=0;//     const-string v0, "EMID_KRSDK_Solution_Init_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_12
a=0;//     const-string v0, "EMID_KRSDK_Solution_Execute_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_13
a=0;//     const-string v0, "EMID_KRSDK_Solution_Is_Fully_Root_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_14
a=0;//     const-string v0, "EMID_KRSDK_Remount_System_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_15
a=0;//     const-string v0, "EMID_KRSDK_Push_SU_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_16
a=0;//     const-string v0, "EMID_KRSDK_Run_KD_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_17
a=0;//     const-string v0, "EMID_KRSDK_Fatal_Solution_count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_18
a=0;//     const-string v0, "EMID_KRSDK_Trace"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_19
a=0;//     const-string v0, "EMID_KRSDK_PrepareKu_End_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_1a
a=0;//     const-string v0, "EMID_KRSDK_InstallManager_Begin_Count"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_1b
a=0;//     const-string v0, "EMID_KRSDK_InstallManager_End_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_1c
a=0;//     const-string v0, "EMID_KRSDK_Solution_Is_True_Root_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_1d
a=0;//     const-string v0, "EMID_KRSDK_EXReport_Info"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_1e
a=0;//     const-string v0, "EMID_KRSDK_Solution_PushSu_End_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_1f
a=0;//     const-string v0, "EMID_KRSDK_Solution_RequestSu_End_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_20
a=0;//     const-string v0, "EMID_KRSDK_Root_Distribute_Begin_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_21
a=0;//     const-string v0, "EMID_KRSDK_Root_Distribute_End_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_22
a=0;//     const-string v0, "EMID_KRSDK_Prepare_Switch_End_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_23
a=0;//     const-string v0, "EMID_KRSDK_Submit_Request_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_24
a=0;//     const-string v0, "EMID_KRSDK_SDK_Initialize_End_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_25
a=0;//     const-string v0, "EMID_KRSDK_Ku_Result_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_26
a=0;//     const-string v0, "EMID_KRSDK_Ku_Result_Check_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_27
a=0;//     const-string v0, "EMID_KRSDK_Repair_Root_Begin_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_28
a=0;//     const-string v0, "EMID_KRSDK_Repair_Root_Result_Count"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x30d4b
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_b
a=0;//         :pswitch_c
a=0;//         :pswitch_d
a=0;//         :pswitch_e
a=0;//         :pswitch_f
a=0;//         :pswitch_10
a=0;//         :pswitch_11
a=0;//         :pswitch_12
a=0;//         :pswitch_13
a=0;//         :pswitch_14
a=0;//         :pswitch_15
a=0;//         :pswitch_16
a=0;//         :pswitch_17
a=0;//         :pswitch_18
a=0;//         :pswitch_19
a=0;//         :pswitch_1a
a=0;//         :pswitch_1b
a=0;//         :pswitch_1c
a=0;//         :pswitch_1d
a=0;//         :pswitch_1e
a=0;//         :pswitch_1f
a=0;//         :pswitch_20
a=0;//         :pswitch_21
a=0;//         :pswitch_22
a=0;//         :pswitch_23
a=0;//         :pswitch_24
a=0;//         :pswitch_0
a=0;//         :pswitch_25
a=0;//         :pswitch_26
a=0;//         :pswitch_27
a=0;//         :pswitch_28
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v5, 0x3b
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v4, 0x7c
a=0;// 
a=0;//     .line 318
a=0;//     #v4=(PosByte);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 321
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v6, v6, v2, v3}, Lcom/kingroot/RushRoot/ga;->a(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 322
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 330
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ro.board.platform"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 331
a=0;//     const-string v2, "ro.mtk.hardware"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 332
a=0;//     const-string v2, "ro.hardware"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     .line 330
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 333
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 334
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ro.miui.ui.version.code"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "ro.miui.ui.version.name"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 336
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ro.cm.device"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "ro.cm.version"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 338
a=0;//     const-string v0, "ro.build.version.opporom"
a=0;// 
a=0;//     invoke-static {v0}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 339
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 340
a=0;//     invoke-static {}, Lcom/kingroot/sdk/commom/e;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 342
a=0;//     sget v0, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 345
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 351
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v6, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 354
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/y;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 356
a=0;//     const v1, 0x30d4b
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, v0, p1}, Lcom/kingroot/RushRoot/ga;->a(ILjava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 357
a=0;//     return-void
a=0;// 
a=0;//     .line 346
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/StringBuilder;);v2=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 345
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;Lcom/kingroot/sdk/root/g;I)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0x3e8
a=0;// 
a=0;//     .line 583
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 594
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 585
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/go;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/go;-><init>()V
a=0;// 
a=0;//     .line 586
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/go;);
a=0;//     int-to-long v1, p3
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/kingroot/RushRoot/go;->e:J
a=0;// 
a=0;//     .line 587
a=0;//     iget-object v1, p2, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/go;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 588
a=0;//     iget v1, p2, Lcom/kingroot/sdk/root/g;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->b:I
a=0;// 
a=0;//     .line 589
a=0;//     iget v1, p2, Lcom/kingroot/sdk/root/g;->c:I
a=0;// 
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->f:I
a=0;// 
a=0;//     .line 590
a=0;//     iget-wide v1, p2, Lcom/kingroot/sdk/root/g;->d:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     div-long/2addr v1, v5
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->c:I
a=0;// 
a=0;//     .line 591
a=0;//     iget-wide v1, p2, Lcom/kingroot/sdk/root/g;->f:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     iget-wide v3, p2, Lcom/kingroot/sdk/root/g;->e:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     const-wide/32 v3, 0xf4240
a=0;// 
a=0;//     div-long/2addr v1, v3
a=0;// 
a=0;//     .line 592
a=0;//     iget v3, v0, Lcom/kingroot/RushRoot/go;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-long/2addr v1, v5
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->d:I
a=0;// 
a=0;//     .line 593
a=0;//     invoke-virtual {p0, v0, p1}, Lcom/kingroot/RushRoot/ga;->a(Lcom/kingroot/RushRoot/go;Landroid/os/Handler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;Lcom/kingroot/sdk/root/g;Lcom/kingroot/sdk/root/h;Lkrsdk/h;Lkrsdk/h;Z)V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 601
a=0;//     if-nez p2, :cond_3
a=0;// 
a=0;//     .line 602
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 603
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 604
a=0;//     #v2=(Null);
a=0;//     const-string v9, "0"
a=0;// 
a=0;//     .line 605
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Null);
a=0;//     move-wide v11, v3
a=0;// 
a=0;//     .line 612
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v10=(Integer);v11=(LongLo);v12=(LongHi);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 613
a=0;//     :goto_1
a=0;//     #v6=(Boolean);
a=0;//     if-eqz p5, :cond_5
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 615
a=0;//     :goto_2
a=0;//     #v8=(Boolean);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     iget-boolean v2, v0, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 616
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 617
a=0;//     :goto_3
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Boolean);
a=0;//     move v8, v1
a=0;// 
a=0;//     .line 621
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     if-eqz p2, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     iget-boolean v1, v0, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     move v1, v8
a=0;// 
a=0;//     .line 626
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static/range {p4 .. p4}, Lcom/kingroot/sdk/root/a;->a(Lkrsdk/h;)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 627
a=0;//     #v13=(Integer);
a=0;//     const v2, 0x30d50
a=0;// 
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v3=(Boolean);
a=0;//     if-eqz p2, :cond_a
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     iget-boolean v1, v0, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     const-string v4, "7034"
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v7, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 628
a=0;//     #v1=(Null);
a=0;//     invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v11, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/h;);
a=0;//     iget v11, v0, Lcom/kingroot/sdk/root/h;->c:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v11, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v10, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     aput-object v10, v7, v1
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     move-object v1, v9
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v7, v10
a=0;// 
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v6, p1
a=0;// 
a=0;//     .line 627
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 629
a=0;//     if-eqz p6, :cond_2
a=0;// 
a=0;//     .line 630
a=0;//     const v2, 0x30d54
a=0;// 
a=0;//     if-eqz v8, :cond_c
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_9
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v7, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 631
a=0;//     #v1=(Null);
a=0;//     invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/sdk/root/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v6, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->a()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/a;->b()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     if-eqz v8, :cond_d
a=0;// 
a=0;//     :goto_a
a=0;//     aput-object v9, v7, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v7, v1
a=0;// 
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     move-object v6, p1
a=0;// 
a=0;//     .line 630
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 633
a=0;//     :cond_2
a=0;//     #v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 607
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     iget-wide v1, v0, Lcom/kingroot/sdk/root/g;->f:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v3, v0, Lcom/kingroot/sdk/root/h;->b:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     const-wide/32 v3, 0xf4240
a=0;// 
a=0;//     div-long v3, v1, v3
a=0;// 
a=0;//     .line 608
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget v1, v0, Lcom/kingroot/sdk/root/g;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     .line 609
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v9, v0, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 610
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget v1, v0, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     move v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move-wide v11, v3
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 612
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 613
a=0;//     :cond_5
a=0;//     #v6=(Boolean);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 616
a=0;//     :cond_6
a=0;//     #v8=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 617
a=0;//     :cond_7
a=0;//     #v6=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Integer);
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 624
a=0;//     #v1=(Boolean);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 627
a=0;//     :cond_9
a=0;//     #v13=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Boolean);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 628
a=0;//     :cond_b
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/h;);v1=(PosByte);v5=(Reference,Ljava/lang/String;);v7=(Reference,[Ljava/lang/Object;);v10=(PosByte);v11=(Reference,Ljava/lang/Integer;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 630
a=0;//     :cond_c
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 631
a=0;//     :cond_d
a=0;//     #v1=(PosByte);v3=(Boolean);v10=(LongLo);v11=(LongHi);
a=0;//     const-string v9, ""
a=0;// 
a=0;//     goto :goto_a
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;ILcom/kingroot/sdk/root/g;I)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 544
a=0;//     #v0=(Null);
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     .line 551
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 546
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 547
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "end verifyR, rootCode = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p2, v1}, Lcom/kingroot/RushRoot/fi;->a(Lcom/kingroot/sdk/root/y;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 550
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const v1, 0x30d68
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v7, p4, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v0
a=0;// 
a=0;//     iget-object v0, p4, Lcom/kingroot/sdk/root/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v6, v5
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v6, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);
a=0;//     move v2, v5
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;Lcom/kingroot/sdk/root/g;)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 515
a=0;//     #v7=(Null);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 541
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 517
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-wide v0, p3, Lcom/kingroot/sdk/root/g;->f:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p3, Lcom/kingroot/sdk/root/g;->e:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     const-wide/32 v2, 0xf4240
a=0;// 
a=0;//     div-long v8, v0, v2
a=0;// 
a=0;//     .line 518
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 519
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "sid = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p3, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", onRoot done. exploitSuc = "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p3, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", childDuingTime = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 529
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p3, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 530
a=0;//     iget-boolean v0, p3, Lcom/kingroot/sdk/root/g;->j:Z
a=0;// 
a=0;//     .line 534
a=0;//     :goto_1
a=0;//     iget-object v3, p3, Lcom/kingroot/sdk/root/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 535
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 536
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 539
a=0;//     :cond_3
a=0;//     const v1, 0x30d5c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v2, v7
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v0, p3, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v3, "7034"
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v6, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 540
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v0, p3, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v6, v7
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v6, v5
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v5, p1
a=0;// 
a=0;//     .line 539
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v4=(Uninit);v5=(One);v6=(Uninit);
a=0;//     iget v0, p3, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);
a=0;//     move v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Reference,Ljava/lang/String;);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 539
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;Lkrsdk/h;Lcom/kingroot/sdk/root/g;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 554
a=0;//     #v0=(Null);
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     .line 564
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 556
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 557
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "tmpShell = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 558
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "KdRootShell.getKDRootShell() : "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
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
a=0;//     invoke-virtual {p2, v1}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 562
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const v1, 0x30d5d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v3, p4, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     const-string v3, "7034"
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 563
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v7, p4, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v0
a=0;// 
a=0;//     invoke-static {p3}, Lcom/kingroot/sdk/root/a;->a(Lkrsdk/h;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v6, v5
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v5, p1
a=0;// 
a=0;//     .line 562
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);
a=0;//     move v2, v5
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v3=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/os/Handler;Lcom/kingroot/sdk/root/y;ZLcom/kingroot/sdk/root/g;II)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 567
a=0;//     #v0=(Null);
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     .line 574
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 569
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "SuRootShell.getSuRootShell() : "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->c()Ljava/lang/String;
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
a=0;//     invoke-virtual {p2, v1}, Lcom/kingroot/sdk/root/y;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 573
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const v1, 0x30d69
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p3, :cond_2
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
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v7, p4, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v0
a=0;// 
a=0;//     iget-object v0, p4, Lcom/kingroot/sdk/root/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v6, v5
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v6, v0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v6, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ga;);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/kingroot/RushRoot/ga;->a(IILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);
a=0;//     move v2, v5
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/kingroot/RushRoot/go;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gc;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gc;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/kingroot/RushRoot/gc;-><init>(Lcom/kingroot/RushRoot/ga;Lcom/kingroot/RushRoot/go;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gc;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 488
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final varargs a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Handler;[Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v5, 0x7c
a=0;// 
a=0;//     .line 402
a=0;//     #v5=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 404
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sget v3, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v3, p2, p3, p4}, Lcom/kingroot/RushRoot/ga;->a(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 406
a=0;//     array-length v3, p6
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     array-length v0, p6
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v0, v3, :cond_2
a=0;// 
a=0;//     .line 416
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 418
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 419
a=0;//     const v1, 0x30d62
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, v0, p5}, Lcom/kingroot/RushRoot/ga;->a(ILjava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 420
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "[Trace] "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " : "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 421
a=0;//     return-void
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     aget-object v4, p6, v0
a=0;// 
a=0;//     .line 407
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 408
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 406
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 414
a=0;//     :cond_2
a=0;//     #v3=(PosByte);v4=(Conflicted);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 413
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ga;->b:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 173
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/util/ArrayList;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ga;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/File;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 496
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 497
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 505
a=0;//     return-object v1
a=0;// 
a=0;//     .line 497
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 498
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ga;->c(Ljava/lang/String;)Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 499
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/go;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 500
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 502
a=0;//     :cond_1
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "rootResult = null, line = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/ga;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 510
a=0;//     return-void
a=0;// .end method
}}
