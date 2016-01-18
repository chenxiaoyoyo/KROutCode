package com.kingroot.RushRoot; class fs { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/fs;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final d:[S
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x8s
a=0;//         0x40s
a=0;//         0x80s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/kingroot/RushRoot/fw;Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     const v0, 0x4b000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/fs;->b:I
a=0;// 
a=0;//     .line 33
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p2, p0, Lcom/kingroot/RushRoot/fs;->e:Landroid/content/Context;
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p1, Lcom/kingroot/RushRoot/fw;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/fs;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "DownloadKuUpdate mFilePath = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fs;->a:Ljava/lang/String;
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
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fs;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()I
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "download begin mCurrentSize = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iget-object v3, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-wide v3, v3, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", mSize = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-wide v3, v3, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", url = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/fw;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v5=(Null);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(One);
a=0;//     const/16 v4, 0x1b7e
a=0;// 
a=0;//     .line 65
a=0;//     :try_start_0
a=0;//     #v4=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-object v7, v7, Lcom/kingroot/RushRoot/fw;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/kingroot/sdk/wupsession/a;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v6, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 66
a=0;//     const/16 v4, 0x1b7f
a=0;// 
a=0;//     .line 67
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/kingroot/sdk/wupsession/a;->a()I
a=0;// 
a=0;//     .line 68
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/kingroot/sdk/wupsession/a;->c()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 69
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0xc8
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     if-ne v6, v7, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     const/16 v4, 0x1b80
a=0;// 
a=0;//     .line 71
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     invoke-virtual {v7}, Lcom/kingroot/sdk/wupsession/a;->e()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iput-wide v7, v6, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "download mKuUpdateTask.mSize = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-wide v7, v7, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-wide v6, v6, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v4, v6, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_2
a=0;// 
a=0;//     .line 75
a=0;//     const/16 v4, 0x1b81
a=0;// 
a=0;//     .line 76
a=0;//     #v4=(PosShort);
a=0;//     const/16 v3, 0x1b81
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v6}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_0 .. :try_end_0} :catch_a
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 163
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_1
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 180
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v5=(Reference,Ujava/lang/Object;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 79
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(One);v3=(Reference,Ljava/lang/String;);v4=(Byte);v5=(Null);v6=(LongLo);v7=(LongHi);v8=(LongLo);v9=(LongHi);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     const/16 v4, 0x1b82
a=0;// 
a=0;//     .line 80
a=0;//     :try_start_1
a=0;//     #v4=(PosShort);
a=0;//     new-instance v6, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-direct {v6, v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
a=0;//     :try_end_1
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_1 .. :try_end_1} :catch_a
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 82
a=0;//     :try_start_2
a=0;//     #v6=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v5, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v5=(Reference,[S);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget-short v5, v5, v7
a=0;// 
a=0;//     #v5=(Short);
a=0;//     shl-int/lit8 v5, v5, 0xa
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-array v7, v5, [B
a=0;// 
a=0;//     .line 83
a=0;//     #v7=(Reference,[B);
a=0;//     const/16 v4, 0x1b83
a=0;// 
a=0;//     .line 84
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/sdk/wupsession/a;->b()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 87
a=0;//     #v10=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 88
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget-wide v13, v5, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     .line 89
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v5=(Null);
a=0;//     const/16 v4, 0x1b85
a=0;// 
a=0;//     move-object v9, v7
a=0;// 
a=0;//     .line 92
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Integer);v9=(Reference,[B);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v7, v7, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide/16 v15, 0x0
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     cmp-long v7, v7, v15
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v7, v7, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v15=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v15, v15, Lcom/kingroot/RushRoot/fw;->b:J
a=0;//     :try_end_2
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_9
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     cmp-long v7, v7, v15
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gtz v7, :cond_7
a=0;// 
a=0;//     .line 149
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     .line 175
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v2=(Boolean);v4=(PosShort);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     invoke-static {v4, v3}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v2=(One);v5=(Integer);v7=(Byte);v8=(LongHi);v9=(Reference,[B);v10=(Reference,Ljava/io/InputStream;);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(LongLo);v16=(LongHi);
a=0;//     invoke-virtual {v10, v9}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 94
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-eq v7, v8, :cond_4
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v6, v9, v8, v7}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 102
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v8=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v15, v8, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     int-to-long v0, v7
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     add-long v15, v15, v17
a=0;// 
a=0;//     iput-wide v15, v8, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     .line 103
a=0;//     add-int/2addr v5, v7
a=0;// 
a=0;//     .line 106
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v7, v7, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v15=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v15, v15, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     cmp-long v7, v7, v15
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 107
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, v5, Lcom/kingroot/RushRoot/fw;->k:F
a=0;//     :try_end_4
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_9
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 151
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 152
a=0;//     :goto_4
a=0;//     :try_start_5
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/b;->printStackTrace()V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/b;->a()Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 163
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v6, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_8
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 171
a=0;//     :try_start_6
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 173
a=0;//     :catch_1
a=0;//     move-exception v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 112
a=0;//     :cond_9
a=0;//     :try_start_7
a=0;//     #v1=(LongHi);v5=(Integer);v7=(Byte);v8=(LongHi);v9=(Reference,[B);v10=(Reference,Ljava/io/InputStream;);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(LongLo);v16=(LongHi);v17=(LongLo);v18=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v7, v7, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     const-wide/16 v15, 0x0
a=0;// 
a=0;//     cmp-long v7, v7, v15
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_a
a=0;// 
a=0;//     .line 113
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v8=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v15, v8, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     long-to-float v8, v15
a=0;// 
a=0;//     #v8=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v15=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v15, v15, Lcom/kingroot/RushRoot/fw;->a:J
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     long-to-float v15, v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     div-float/2addr v8, v15
a=0;// 
a=0;//     iput v8, v7, Lcom/kingroot/RushRoot/fw;->k:F
a=0;// 
a=0;//     .line 115
a=0;//     :cond_a
a=0;//     #v7=(Conflicted);v8=(Conflicted);v15=(Conflicted);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "download progress = "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     iget v8, v8, Lcom/kingroot/RushRoot/fw;->k:F
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Lcom/kingroot/RushRoot/fs;->b:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v5, v7, :cond_3
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     sub-long/2addr v7, v11
a=0;// 
a=0;//     .line 120
a=0;//     const-wide/16 v15, 0x0
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     cmp-long v15, v7, v15
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-gez v15, :cond_b
a=0;// 
a=0;//     .line 121
a=0;//     const-wide/16 v7, 0x1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_b
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v15=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-wide v15, v15, Lcom/kingroot/RushRoot/fw;->b:J
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     sub-long/2addr v15, v13
a=0;// 
a=0;//     div-long v7, v15, v7
a=0;// 
a=0;//     long-to-int v7, v7
a=0;// 
a=0;//     .line 131
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0x21
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ge v7, v8, :cond_c
a=0;// 
a=0;//     .line 133
a=0;//     array-length v7, v9
a=0;// 
a=0;//     sget-object v8, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v8=(Reference,[S);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     aget-short v8, v8, v15
a=0;// 
a=0;//     #v8=(Short);
a=0;//     shl-int/lit8 v8, v8, 0xa
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eq v7, v8, :cond_3
a=0;// 
a=0;//     .line 134
a=0;//     sget-object v7, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v7=(Reference,[S);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aget-short v7, v7, v8
a=0;// 
a=0;//     #v7=(Short);
a=0;//     shl-int/lit8 v7, v7, 0xa
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v7, v7, [B
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     move-object v9, v7
a=0;// 
a=0;//     .line 136
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     #v7=(Integer);v8=(PosByte);v15=(LongLo);
a=0;//     const/16 v8, 0x41
a=0;// 
a=0;//     if-ge v7, v8, :cond_d
a=0;// 
a=0;//     .line 138
a=0;//     array-length v7, v9
a=0;// 
a=0;//     sget-object v8, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v8=(Reference,[S);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     aget-short v8, v8, v15
a=0;// 
a=0;//     #v8=(Short);
a=0;//     shl-int/lit8 v8, v8, 0xa
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eq v7, v8, :cond_3
a=0;// 
a=0;//     .line 139
a=0;//     sget-object v7, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v7=(Reference,[S);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aget-short v7, v7, v8
a=0;// 
a=0;//     #v7=(Short);
a=0;//     shl-int/lit8 v7, v7, 0xa
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v7, v7, [B
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     move-object v9, v7
a=0;// 
a=0;//     .line 141
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_d
a=0;//     #v7=(Integer);v8=(PosByte);v15=(LongLo);
a=0;//     array-length v7, v9
a=0;// 
a=0;//     sget-object v8, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v8=(Reference,[S);
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     aget-short v8, v8, v15
a=0;// 
a=0;//     #v8=(Short);
a=0;//     shl-int/lit8 v8, v8, 0xa
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eq v7, v8, :cond_3
a=0;// 
a=0;//     .line 144
a=0;//     sget-object v7, Lcom/kingroot/RushRoot/fs;->d:[S
a=0;// 
a=0;//     #v7=(Reference,[S);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     aget-short v7, v7, v8
a=0;// 
a=0;//     #v7=(Short);
a=0;//     shl-int/lit8 v7, v7, 0xa
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v7, v7, [B
a=0;//     :try_end_7
a=0;//     .catch Lcom/kingroot/sdk/wupsession/b; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_9
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     move-object v9, v7
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 155
a=0;//     :catch_2
a=0;//     #v1=(Uninit);v3=(Conflicted);v5=(Null);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 156
a=0;//     :goto_5
a=0;//     :try_start_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/io/FileOutputStream;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v3}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 163
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_e
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 171
a=0;//     :try_start_9
a=0;//     invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 173
a=0;//     :catch_3
a=0;//     move-exception v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 159
a=0;//     :catch_4
a=0;//     #v1=(Uninit);v3=(Conflicted);v5=(Null);v6=(Conflicted);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 160
a=0;//     :goto_6
a=0;//     :try_start_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/io/FileOutputStream;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 163
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v5, :cond_f
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v5, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_f
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 171
a=0;//     :try_start_b
a=0;//     invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 173
a=0;//     :catch_5
a=0;//     move-exception v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 162
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);v3=(Conflicted);v5=(Null);v6=(Conflicted);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 163
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/io/FileOutputStream;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);
a=0;//     iget-object v3, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v3, :cond_10
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/sdk/wupsession/a;->d()V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcom/kingroot/RushRoot/fs;->c:Lcom/kingroot/sdk/wupsession/a;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_10
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/wupsession/a;);
a=0;//     if-eqz v6, :cond_11
a=0;// 
a=0;//     .line 171
a=0;//     :try_start_c
a=0;//     invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
a=0;// 
a=0;//     .line 175
a=0;//     :cond_11
a=0;//     :goto_8
a=0;//     throw v2
a=0;// 
a=0;//     .line 173
a=0;//     :catch_6
a=0;//     move-exception v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_7
a=0;//     #v2=(Null);v4=(Null);v5=(Reference,Lcom/kingroot/sdk/wupsession/a;);v7=(Integer);v9=(Reference,[B);v10=(Reference,Ljava/io/InputStream;);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(LongLo);v16=(LongHi);
a=0;//     move-exception v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 162
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(One);v4=(PosShort);v5=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_2
a=0;//     #v2=(One);v5=(Reference,Ljava/io/FileOutputStream;);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 159
a=0;//     :catch_8
a=0;//     #v2=(One);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 155
a=0;//     :catch_9
a=0;//     move-exception v3
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 151
a=0;//     :catch_a
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fs;);v1=(Uninit);v3=(Conflicted);v5=(Null);v6=(Conflicted);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/wupsession/b;);
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 184
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 186
a=0;//     #v1=(One);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-object v5, p0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v5, v5, Lcom/kingroot/RushRoot/fw;->h:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 189
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget-object v4, v4, Lcom/kingroot/RushRoot/fw;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v1, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     .line 191
a=0;//     sget-object v1, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     iget-object v1, v1, Lkrsdk/d;->b:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v3, p0, Lcom/kingroot/RushRoot/fs;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {p1, v1}, Lcom/kingroot/sdk/util/c;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-char v1, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "superuser.apk"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 194
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, " exists!"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     iget v1, v1, Lcom/kingroot/RushRoot/fw;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/fs;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/RushRoot/ft;->a(ILandroid/content/Context;)Z
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 215
a=0;//     :goto_0
a=0;//     #v0=(PosShort);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "verifyKuFile result = "
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     .line 217
a=0;//     return v1
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 204
a=0;//     const/16 v0, 0x1b86
a=0;// 
a=0;//     .line 206
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_2
a=0;//     #v0=(Null);v3=(Byte);v4=(LongHi);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 208
a=0;//     const/16 v0, 0x1b87
a=0;// 
a=0;//     .line 210
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_3
a=0;//     #v0=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fs;->f:Lcom/kingroot/RushRoot/fw;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fw;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/fw;->j:I
a=0;// 
a=0;//     .line 213
a=0;//     const/16 v0, 0x1b88
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// .end method
}}
