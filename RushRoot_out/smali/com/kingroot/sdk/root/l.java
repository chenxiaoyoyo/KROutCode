package com.kingroot.sdk.root; class l { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/l;
a=0;// .super Lcom/kingroot/sdk/root/x;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lkrsdk/h;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static c:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private e:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/kingroot/RushRoot/fn;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/x;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/l;->e:I
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/x;->d:Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     .line 26
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/x;->a:I
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;I)Lcom/kingroot/sdk/root/l;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v3, Lkrsdk/g;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v0, "REAL_KD_PATH"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u83b7\u53d6\u5230\u4fdd\u5b58\u7684KD\u8def\u5f84 : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", \u9ed8\u8ba4\u7684KD\u8def\u5f84 : "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 82
a=0;//     :goto_1
a=0;//     #v1=(Integer);v3=(Reference,Lcom/kingroot/RushRoot/fn;);v4=(Reference,Lcom/kingroot/sdk/root/l;);v6=(Conflicted);v10=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 85
a=0;//     :try_start_0
a=0;//     new-instance v5, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     invoke-direct {v5, p0}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
a=0;// 
a=0;//     .line 87
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     const-wide/16 v8, 0x3a98
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v5, v3, v8, v9}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;J)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "getKDRootShell() ret = "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, v3, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v8, ", stdout = "
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v8, v3, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v8, ", stderr = "
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v8, v3, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v6, v3, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     iget-object v6, v3, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/kingroot/sdk/root/a;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v6, Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/kingroot/sdk/root/l;);
a=0;//     invoke-direct {v6, v5}, Lcom/kingroot/sdk/root/l;-><init>(Lcom/kingroot/RushRoot/fn;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_2
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     iput v1, v6, Lcom/kingroot/sdk/root/l;->e:I
a=0;// 
a=0;//     .line 92
a=0;//     sput-object p0, Lcom/kingroot/sdk/root/l;->c:Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 143
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_3
a=0;//     const-string v0, "cd /"
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/kingroot/sdk/root/l;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     return-object v6
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v1=(Null);v4=(Conflicted);v6=(Uninit);v10=(Uninit);
a=0;//     const-string v0, "REAL_KD_PATH"
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v4=(Reference,Lcom/kingroot/sdk/root/l;);v5=(Reference,Lcom/kingroot/RushRoot/fn;);v6=(Integer);v8=(Reference,Ljava/lang/String;);v9=(LongHi);v10=(Conflicted);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 96
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     move v3, v7
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     .line 114
a=0;//     :goto_4
a=0;//     #v3=(Boolean);v6=(Reference,Lcom/kingroot/sdk/root/l;);v9=(Conflicted);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u5c1d\u8bd5\u53e6\u4e00\u4e2aKD : "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     :try_start_5
a=0;//     new-instance v4, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     invoke-direct {v4, v0}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     .line 118
a=0;//     :try_start_6
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v3, "export PATH=/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:$PATH"
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 119
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     const-wide/16 v8, 0x3a98
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v4, v3, v8, v9}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;J)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "getKDRootShell() realPath ret = "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, v3, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v8, ", stdout = "
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v8, v3, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v8, ", stderr = "
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v8, v3, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v5, v3, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/root/a;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u53e6\u4e00\u4e2aKD\u6210\u529f\u8fde\u63a5 : "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v5, Lcom/kingroot/sdk/root/l;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/sdk/root/l;);
a=0;//     invoke-direct {v5, v4}, Lcom/kingroot/sdk/root/l;-><init>(Lcom/kingroot/RushRoot/fn;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
a=0;// 
a=0;//     .line 124
a=0;//     :try_start_7
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     iput v1, v5, Lcom/kingroot/sdk/root/l;->e:I
a=0;// 
a=0;//     .line 125
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/l;->c:Ljava/lang/String;
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
a=0;// 
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 126
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 99
a=0;//     :cond_4
a=0;//     #v6=(Integer);
a=0;//     const/16 v6, 0x1b6a
a=0;// 
a=0;//     :try_start_8
a=0;//     #v6=(PosShort);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "ret="
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, v3, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ",stdout="
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, v3, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ",stdout="
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v6, v3}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     .line 103
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/fp;);v9=(LongHi);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 104
a=0;//     :goto_5
a=0;//     #v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const-string v6, "VirtualTerminal create fail"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v3}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 105
a=0;//     const/16 v6, 0x1b6b
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v8, v3}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 106
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v4}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_5
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     move v3, v7
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .line 110
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 128
a=0;//     :catch_1
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 129
a=0;//     :goto_6
a=0;//     #v8=(Conflicted);
a=0;//     const-string v6, "VirtualTerminal create2 fail"
a=0;// 
a=0;//     invoke-static {v6, v3}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 130
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v4}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     :cond_6
a=0;//     move-object v3, v4
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 136
a=0;//     :goto_7
a=0;//     #v5=(Conflicted);
a=0;//     if-gt v1, p1, :cond_7
a=0;// 
a=0;//     .line 137
a=0;//     const-wide/16 v5, 0x3e8
a=0;// 
a=0;//     :try_start_9
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_3
a=0;// 
a=0;//     .line 140
a=0;//     :goto_8
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "try again to get kd shell. i = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 148
a=0;//     :catch_2
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 128
a=0;//     :catch_4
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_5
a=0;//     #v8=(Reference,Ljava/lang/String;);v9=(LongHi);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 103
a=0;//     :catch_6
a=0;//     #v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v10, v5
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     move-object v3, v10
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_7
a=0;//     #v10=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v10, v5
a=0;// 
a=0;//     #v10=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     move-object v4, v10
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);v6=(Reference,Ujava/lang/Object;);v10=(Conflicted);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);v5=(Integer);v8=(Reference,Ljava/lang/String;);v9=(LongHi);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     move-object v4, v6
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(Boolean);v5=(Reference,Lcom/kingroot/RushRoot/fn;);v9=(Conflicted);
a=0;//     move-object v3, v5
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     move-object v4, v6
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v6=(PosShort);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/sdk/root/l;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Lkrsdk/h;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "chmod 6755 "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lkrsdk/h;->a(Ljava/lang/String;)Lkrsdk/i;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "chown 0.0 "
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lkrsdk/h;->a(Ljava/lang/String;)Lkrsdk/i;
a=0;// 
a=0;//     .line 40
a=0;//     const-string v0, "start kd : "
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, " -d"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     invoke-interface {p1, v0}, Lkrsdk/h;->a(Ljava/lang/String;)Lkrsdk/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v0}, Lkrsdk/i;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     const/16 v1, 0x1b69
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ret="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v0, Lkrsdk/i;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ",stdout="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, v0, Lkrsdk/i;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lkrsdk/i;);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     sput-object p0, Lcom/kingroot/sdk/root/l;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final d()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iget v0, p0, Lcom/kingroot/sdk/root/l;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
