package com.kingroot.sdk.root; class t { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/t;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// .field private static b:Ljava/lang/Object;
a=0;// 
a=0;// .field private static c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 775
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/sdk/root/t;->a:Z
a=0;// 
a=0;//     .line 776
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/t;->b:Ljava/lang/Object;
a=0;// 
a=0;//     .line 818
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)Lcom/kingroot/sdk/root/r;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v0=(Null);
a=0;//     iget v1, p3, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 73
a=0;//     :pswitch_0
a=0;//     const/16 v1, 0x1b5b
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "interface_type="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p3, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 59
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/j;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/kingroot/sdk/root/j;-><init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/j;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :pswitch_2
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/e;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/kingroot/sdk/root/e;-><init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/e;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :pswitch_3
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/n;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/kingroot/sdk/root/n;-><init>(Landroid/content/Context;Landroid/os/Handler;Lkrsdk/d;Lcom/kingroot/sdk/commom/d;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/n;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lkrsdk/d;I)Lkrsdk/k;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     new-array v0, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const-string v1, "xmls"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     new-array v0, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const-string v1, "jars"
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 98
a=0;//     :cond_1
a=0;//     const-string v0, "next_execute_solution_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 100
a=0;//     and-int/lit8 v1, p2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v3, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 115
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     and-int/lit8 v0, p2, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 116
a=0;//     invoke-static {p0, p1, v6, v7}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Lkrsdk/d;Ljava/io/File;Ljava/io/File;)Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 184
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 103
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(One);v4=(Uninit);v6=(Reference,Ljava/io/File;);v7=(Reference,Ljava/io/File;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     and-int/lit8 v1, p2, 0x2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_10
a=0;// 
a=0;//     .line 105
a=0;//     if-nez v0, :cond_10
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Lkrsdk/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lkrsdk/k;);
a=0;//     invoke-direct {v0}, Lkrsdk/k;-><init>()V
a=0;// 
a=0;//     .line 108
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     iput v5, v0, Lkrsdk/k;->a:I
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/sdk/root/t;->a(Lkrsdk/d;Lkrsdk/k;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 122
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {p0, p1, v6, v7}, Lcom/kingroot/sdk/root/t;->b(Landroid/content/Context;Lkrsdk/d;Ljava/io/File;Ljava/io/File;)Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 128
a=0;//     :goto_2
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     iget-object v2, v0, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 131
a=0;//     #v2=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 133
a=0;//     #v8=(Reference,[Ljava/io/File;);
a=0;//     array-length v9, v8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v4, v5
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Integer);v4=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-lt v4, v9, :cond_7
a=0;// 
a=0;//     .line 155
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const-string v1, "solution_success_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 156
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_d
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v6, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 160
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_d
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 162
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 164
a=0;//     :try_start_0
a=0;//     invoke-static {v3}, Lcom/kingroot/sdk/commom/a;->a(Ljava/util/ArrayList;)[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 165
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_d
a=0;// 
a=0;//     .line 166
a=0;//     array-length v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v5
a=0;// 
a=0;//     :goto_4
a=0;//     if-lt v3, v4, :cond_c
a=0;// 
a=0;//     .line 171
a=0;//     if-nez v1, :cond_f
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     move-object v4, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     if-nez v2, :cond_e
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     :goto_6
a=0;//     #v3=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     array-length v1, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     array-length v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v1, v6
a=0;// 
a=0;//     new-array v1, v1, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     array-length v8, v4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v4, v6, v1, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     array-length v7, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v3, v6, v1, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 179
a=0;//     :goto_7
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 180
a=0;//     new-array v1, v5, [Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 182
a=0;//     :cond_5
a=0;//     iput-object v1, v0, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 125
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v2=(PosByte);v3=(One);v4=(Uninit);v6=(Reference,Ljava/io/File;);v7=(Reference,Ljava/io/File;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-static {p0, p1, v6, v7, v1}, Lcom/kingroot/sdk/root/t;->a(Landroid/content/Context;Lkrsdk/d;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 133
a=0;//     :cond_7
a=0;//     #v1=(Integer);v2=(Reference,[Lcom/kingroot/sdk/commom/d;);v4=(Integer);v8=(Reference,[Ljava/io/File;);v9=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     aget-object v1, v8, v4
a=0;// 
a=0;//     .line 134
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 136
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "131"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 140
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 141
a=0;//     array-length v11, v2
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move v1, v5
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v11, :cond_a
a=0;// 
a=0;//     :cond_8
a=0;//     #v11=(Conflicted);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 148
a=0;//     :goto_9
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 149
a=0;//     invoke-static {v10}, Lcom/kingroot/sdk/root/t;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_9
a=0;//     add-int/lit8 v1, v4, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v4, v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 141
a=0;//     :cond_a
a=0;//     #v11=(Integer);
a=0;//     aget-object v12, v2, v1
a=0;// 
a=0;//     .line 142
a=0;//     #v12=(Null);
a=0;//     iget-object v12, v12, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_b
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 144
a=0;//     #v1=(One);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 141
a=0;//     :cond_b
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 166
a=0;//     :cond_c
a=0;//     :try_start_1
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);v3=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     aget-object v6, v1, v3
a=0;// 
a=0;//     .line 169
a=0;//     #v6=(Null);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, v6, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iput-object v8, v6, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 166
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 174
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_e
a=0;//     #v3=(Integer);v4=(Reference,[Lcom/kingroot/sdk/commom/d;);v6=(Reference,Ljava/io/File;);v7=(Reference,Ljava/io/File;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_f
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     move-object v4, v1
a=0;// 
a=0;//     #v4=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_10
a=0;//     #v1=(Integer);v2=(PosByte);v3=(One);v4=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lkrsdk/d;Ljava/io/File;Ljava/io/File;)Lkrsdk/k;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     const-string v0, "solution_success_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 189
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 191
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 193
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 195
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 197
a=0;//     :try_start_0
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/commom/a;->a(Ljava/util/ArrayList;)[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 198
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v0, Lkrsdk/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lkrsdk/k;);
a=0;//     invoke-direct {v0}, Lkrsdk/k;-><init>()V
a=0;// 
a=0;//     .line 203
a=0;//     #v0=(Reference,Lkrsdk/k;);
a=0;//     iput-object v1, v0, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 205
a=0;//     invoke-static {p1, v0}, Lcom/kingroot/sdk/root/t;->a(Lkrsdk/d;Lkrsdk/k;)V
a=0;// 
a=0;//     .line 206
a=0;//     const-string v1, "\u6709\u6210\u529f\u65b9\u6848\uff0c\u53ea\u53d6\u6210\u529f\u65b9\u6848"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 215
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,[Lcom/kingroot/sdk/commom/d;);v2=(Integer);
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     .line 200
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, v3, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 199
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 215
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lkrsdk/d;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Lkrsdk/k;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 252
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Lkrsdk/k;
a=0;// 
a=0;//     #v3=(UninitRef,Lkrsdk/k;);
a=0;//     invoke-direct {v3}, Lkrsdk/k;-><init>()V
a=0;// 
a=0;//     .line 255
a=0;//     #v3=(Reference,Lkrsdk/k;);
a=0;//     const-string v0, "\u4e91\u7aef\u62c9\u53d6\u65b9\u6848\u5931\u8d25/\u624b\u673a\u91cd\u542f"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 256
a=0;//     const-string v0, "solution_id_list"
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 258
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 259
a=0;//     const-string v2, ","
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 260
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 261
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     array-length v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     array-length v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-lt v2, v6, :cond_2
a=0;// 
a=0;//     .line 283
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {v5}, Lcom/kingroot/sdk/commom/a;->a(Ljava/util/ArrayList;)[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 284
a=0;//     #v2=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 285
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_6
a=0;// 
a=0;//     .line 290
a=0;//     iput-object v2, v3, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 297
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {p1, v3}, Lcom/kingroot/sdk/root/t;->a(Lkrsdk/d;Lkrsdk/k;)V
a=0;// 
a=0;//     .line 298
a=0;//     return-object v3
a=0;// 
a=0;//     .line 263
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Integer);v4=(Reference,[Ljava/lang/String;);v5=(Reference,Ljava/util/ArrayList;);v6=(Integer);
a=0;//     aget-object v7, v4, v2
a=0;// 
a=0;//     .line 265
a=0;//     #v7=(Null);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 266
a=0;//     invoke-virtual {v7, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 267
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 269
a=0;//     :cond_3
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 270
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     new-instance v8, Ljava/io/File;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v8, p2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 274
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v8}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/kingroot/sdk/util/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 276
a=0;//     invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 277
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 263
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v2=(Reference,[Lcom/kingroot/sdk/commom/d;);v4=(Integer);v6=(Conflicted);
a=0;//     aget-object v1, v2, v0
a=0;// 
a=0;//     .line 288
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, v1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v1, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 285
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 293
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 806
a=0;//     sget-object v1, Lcom/kingroot/sdk/root/t;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 807
a=0;//     :try_start_0
a=0;//     const-string v0, "executing_sid_time"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 808
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/sdk/root/t;->a:Z
a=0;// 
a=0;//     .line 806
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 812
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/u;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 813
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/root/u;->interrupt()V
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     .line 816
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/u;);
a=0;//     return-void
a=0;// 
a=0;//     .line 806
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
a=0;// .method public static a(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 784
a=0;//     sget-object v1, Lcom/kingroot/sdk/root/t;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 786
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     .line 787
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "bootTime = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 788
a=0;//     const-string v0, "executing_sid_time"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\t"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0, v0, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 789
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/kingroot/sdk/root/t;->a:Z
a=0;// 
a=0;//     .line 784
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 793
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/u;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 794
a=0;//     sget-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/root/u;->interrupt()V
a=0;// 
a=0;//     .line 795
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     .line 797
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/u;);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/u;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/kingroot/sdk/root/u;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
a=0;// 
a=0;//     .line 798
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/u;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/root/t;->c:Lcom/kingroot/sdk/root/u;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/sdk/root/u;->start()V
a=0;// 
a=0;//     .line 799
a=0;//     return-void
a=0;// 
a=0;//     .line 784
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "solution_fail_count_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 737
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 738
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "sid = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", failCount = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 739
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "solution_fail_count_"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0, v1, v0}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 740
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 750
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     #v0=(Reference,Lkrsdk/d;);
a=0;//     new-array v1, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const-string v2, "jars"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     aput-object p0, v1, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 751
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/d;->c(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 753
a=0;//     sget-object v0, Lkrsdk/g;->a:Lkrsdk/d;
a=0;// 
a=0;//     new-array v1, v5, [Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "xmls"
a=0;// 
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     aput-object p0, v1, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 754
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/d;->c(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 755
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lkrsdk/d;Lkrsdk/k;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 338
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "yis_cfg.txt"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 339
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 374
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 342
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gx;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gx;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iput-object v0, p1, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     .line 343
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/gx;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/gx;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iput-object v0, p1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     .line 344
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 345
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     :try_start_0
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 350
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "pcRootInfo"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 351
a=0;//     const-string v3, "mobileRootInfo"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v3, p1, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v4, "canRoot"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v3, p1, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v4, "useTime"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     .line 354
a=0;//     iget-object v3, p1, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v4, "succUsers"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v3, p1, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v4, "succRate"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/kingroot/RushRoot/gx;->d:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 357
a=0;//     :try_start_1
a=0;//     iget-object v3, p1, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v4, "subitUsers"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iput-wide v4, v3, Lcom/kingroot/RushRoot/gx;->e:J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 361
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     const-string v3, "canRoot"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     .line 362
a=0;//     iget-object v0, p1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v3, "useTime"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     .line 363
a=0;//     iget-object v0, p1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v3, "succUsers"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v0, p1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v3, "succRate"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcom/kingroot/RushRoot/gx;->d:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 366
a=0;//     :try_start_3
a=0;//     iget-object v0, p1, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     const-string v3, "subitUsers"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/RushRoot/gx;->e:J
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 368
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 371
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 372
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 359
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Reference,Lorg/json/JSONObject;);v3=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/kingroot/sdk/commom/d;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x1b5d
a=0;// 
a=0;//     .line 493
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 496
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p1, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 497
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lcom/kingroot/sdk/root/t;->a(Lcom/kingroot/sdk/commom/d;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 499
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Lcom/kingroot/sdk/commom/d;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 500
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 501
a=0;//     const/16 v1, 0x1b5d
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-string v2, "download jar fail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 511
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 504
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 505
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "download jar exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1, v0}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 506
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Uninit);
a=0;//     const-string v0, "\u672c\u5730\u5df2\u5b58\u5728\u8be5\u65b9\u6848\u6587\u4ef6\uff0c\u4e0d\u7528\u4e0b\u8f7d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 511
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/kingroot/sdk/commom/d;Lkrsdk/d;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 704
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 706
a=0;//     iget v2, p1, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     fill-array-data v3, :array_0
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/sdk/root/d;->a(I[I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 707
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 708
a=0;//     const/16 v1, 0x1b5b
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "interface_type="
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p1, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 728
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 713
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Reference,[I);v4=(Uninit);
a=0;//     iget-boolean v2, p2, Lkrsdk/d;->f:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 714
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "solution_crash_"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0, v2}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 715
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     .line 716
a=0;//     const/16 v1, 0x1b5c
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "sid="
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 722
a=0;//     :cond_1
a=0;//     #v1=(One);v2=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "solution_fail_count_"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0, v2}, Lcom/kingroot/sdk/root/p;->c(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 723
a=0;//     #v2=(Integer);
a=0;//     iget v3, p2, Lkrsdk/d;->g:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_2
a=0;// 
a=0;//     .line 724
a=0;//     const/16 v1, 0x1b93
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sid = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p1, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", failcount="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v2=(Integer);v3=(Integer);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 728
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 706
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x1
a=0;//         0x2
a=0;//         0x3
a=0;//         0x4
a=0;//         0x5
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/sdk/commom/d;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x1b5e
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 541
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 553
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 554
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " not exist"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v7, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 588
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 559
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v5, p0, Lcom/kingroot/sdk/commom/d;->e:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 560
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " size not format "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Lcom/kingroot/sdk/commom/d;->e:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v7, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 565
a=0;//     :cond_1
a=0;//     #v1=(Byte);v2=(LongHi);v3=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 567
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     const-string v1, "MD5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 568
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 570
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v3, 0x400
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     .line 571
a=0;//     :goto_1
a=0;//     #v3=(Reference,[B);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v5, v6, :cond_2
a=0;// 
a=0;//     .line 574
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 575
a=0;//     invoke-static {v1}, Lcom/kingroot/sdk/util/o;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 576
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/commom/d;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 577
a=0;//     const/16 v3, 0x1b5e
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, " md5 not format "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/commom/d;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 585
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 572
a=0;//     :cond_2
a=0;//     #v3=(Reference,[B);v5=(Integer);v6=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v1, v3, v6, v5}, Ljava/security/MessageDigest;->update([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 580
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 581
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 582
a=0;//     const/16 v3, 0x1b5e
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, " check throw exception"
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v1}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 585
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 584
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v5=(LongLo);v6=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 585
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 586
a=0;//     throw v0
a=0;// 
a=0;//     .line 585
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v3=(Integer);v5=(Integer);v6=(Byte);
a=0;//     invoke-static {v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 588
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 584
a=0;//     :catchall_1
a=0;//     #v0=(Null);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 580
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Null);v5=(LongLo);v6=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/sdk/commom/d;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 634
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 639
a=0;//     iget v2, p0, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     fill-array-data v3, :array_0
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/sdk/root/d;->a(I[I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 643
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 644
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const-string v3, "777"
a=0;// 
a=0;//     invoke-static {v2, p1, v3}, Lcom/kingroot/sdk/util/c;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 645
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 665
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(PosShort);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 649
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     iget v2, p0, Lcom/kingroot/sdk/commom/d;->l:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     .line 650
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "classes.dex"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 651
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 652
a=0;//     const/16 v1, 0x1b5f
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " not exist"
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 665
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 639
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x1
a=0;//         0x3
a=0;//         0x4
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Lkrsdk/d;Ljava/io/File;Ljava/io/File;)Lkrsdk/k;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     #v2=(Null);
a=0;//     const-string v0, "\u8054\u7f51\u4e0b\u53d1\u65b9\u6848\u5217\u8868"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 221
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/wupsession/c;->b(Landroid/content/Context;)Lkrsdk/k;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 222
a=0;//     #v3=(Reference,Lkrsdk/k;);
a=0;//     iget-object v4, v3, Lkrsdk/k;->b:[Lcom/kingroot/sdk/commom/d;
a=0;// 
a=0;//     .line 224
a=0;//     #v4=(Reference,[Lcom/kingroot/sdk/commom/d;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     array-length v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     array-length v0, v4
a=0;// 
a=0;//     new-array v5, v0, [Ljava/lang/String;
a=0;// 
a=0;//     .line 227
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     array-length v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-lt v1, v6, :cond_2
a=0;// 
a=0;//     .line 241
a=0;//     array-length v0, v5
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     const-string v0, "\u5b58\u50a8\u65b9\u6848\u4e0b\u53d1\u987a\u5e8f\u5217\u8868"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     const-string v0, "solution_id_list"
a=0;// 
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-array v0, v10, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const-string v4, "yis_cfg.txt"
a=0;// 
a=0;//     aput-object v4, v0, v2
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lkrsdk/d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v0, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, "\u540e\u53f0\u6570\u636e\u4e0d\u5b8c\u6574\uff0c\u4e0d\u5b58\u50a8YIS\uff01"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 248
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 228
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);v5=(Reference,[Ljava/lang/String;);v6=(Integer);
a=0;//     aget-object v7, v4, v1
a=0;// 
a=0;//     .line 231
a=0;//     #v7=(Null);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v8, v7, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p2, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iget-object v8, v7, Lcom/kingroot/sdk/commom/d;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v8, v0}, Lcom/kingroot/sdk/util/c;->a([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v0, v7, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v0, v5, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 239
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v8, v7, Lcom/kingroot/sdk/commom/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v7, Lcom/kingroot/sdk/commom/d;->n:Ljava/lang/String;
a=0;// 
a=0;//     .line 227
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 236
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 237
a=0;//     const/16 v8, 0x1b5a
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const-string v9, ""
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v9, v0}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 247
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/io/File;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v5, "canRoot"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "useTime"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "succUsers"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "succRate"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "subitUsers"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->d:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget-wide v6, v6, Lcom/kingroot/RushRoot/gx;->e:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "canRoot"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "useTime"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->b:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "succUsers"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->c:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "succRate"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget v6, v6, Lcom/kingroot/RushRoot/gx;->d:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "subitUsers"
a=0;// 
a=0;//     iget-object v6, v3, Lkrsdk/k;->e:Lcom/kingroot/RushRoot/gx;
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gx;);
a=0;//     iget-wide v6, v6, Lcom/kingroot/RushRoot/gx;->e:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "pcRootInfo"
a=0;// 
a=0;//     invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "mobileRootInfo"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "saveRootExtInfo.json = "
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v0, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/sdk/util/e;->a(Ljava/io/File;[Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)[Ljava/lang/Object;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 874
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Lcom/kingroot/sdk/root/t;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 875
a=0;//     :try_start_0
a=0;//     sget-boolean v1, Lcom/kingroot/sdk/root/t;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 876
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 892
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/Object;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 879
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v1, "executing_sid_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/root/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 881
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const-string v1, "\t"
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     .line 882
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 883
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v1, v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 885
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v5
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 891
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,[Ljava/lang/Object;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v1, "executing_sid_time"
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 892
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 874
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 887
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,[Ljava/lang/Object;);v5=(One);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
