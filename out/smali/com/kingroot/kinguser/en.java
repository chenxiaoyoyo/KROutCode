package com.kingroot.kinguser; class en { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/en;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static fx:J
a=0;// 
a=0;// .field private static final fy:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field private static final fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/kingroot/kinguser/en;->fx:J
a=0;// 
a=0;//     .line 21
a=0;//     new-instance v0, Lcom/kingroot/kinguser/eo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/eo;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/eo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/eo;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/en;->fy:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ep;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ep;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ep;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ep;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/en;->fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static bk()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/kingroot/kinguser/en;->fy:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->isRunning()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     sget-object v0, Lcom/kingroot/kinguser/en;->fy:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static bl()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "/data/system/kubuildin.data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bs()V
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bm()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fe;->bO()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 120
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bl()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bn()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bl()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bn()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static bn()Z
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     .line 143
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bl()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->br()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bq()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     .line 171
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v0, v5, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 172
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fn()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 173
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long v7, v1, v5
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide v9, 0x1cf7c5800L
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v0, v7, v9
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 174
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 177
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     cmp-long v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     sget-object v1, Lcom/kingroot/kinguser/en;->fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v0, "/data/system/kubuildin.data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 154
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 158
a=0;//     :try_start_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/en;->k(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     :goto_3
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     .line 165
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 162
a=0;//     :goto_4
a=0;//     #v0=(LongLo);v1=(LongHi);v5=(Conflicted);
a=0;//     sget-object v5, Lcom/kingroot/kinguser/en;->fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     .line 165
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(LongLo);v1=(LongHi);v5=(Conflicted);
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 160
a=0;//     :catch_3
a=0;//     #v5=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongLo);v2=(LongHi);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);v9=(LongLo);v10=(LongHi);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(LongLo);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,[B);v5=(Uninit);v6=(Uninit);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     move-wide v5, v2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bo()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fe;->bO()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 195
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bl()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bp()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 199
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bp()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 203
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static bp()Z
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     .line 218
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bl()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 221
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->br()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 223
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bq()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     .line 245
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v0, v5, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 246
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fn()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 247
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long v7, v1, v5
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide v9, 0x757b12c00L
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v0, v7, v9
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 251
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     cmp-long v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v1, Lcom/kingroot/kinguser/en;->fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 228
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v0, "/data/system/kubuildin.data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/uu;->bT(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 229
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     .line 230
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 232
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 233
a=0;//     :try_start_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/en;->k(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     :goto_3
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     .line 240
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 237
a=0;//     :goto_4
a=0;//     #v0=(LongLo);v1=(LongHi);v5=(Conflicted);
a=0;//     sget-object v5, Lcom/kingroot/kinguser/en;->fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     .line 240
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(LongLo);v1=(LongHi);v5=(Conflicted);
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 235
a=0;//     :catch_3
a=0;//     #v5=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongLo);v2=(LongHi);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);v9=(LongLo);v10=(LongHi);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(LongLo);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,[B);v5=(Uninit);v6=(Uninit);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     move-wide v5, v2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static bq()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     sget-wide v0, Lcom/kingroot/kinguser/en;->fx:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private static br()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     sget-wide v0, Lcom/kingroot/kinguser/en;->fx:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method private static bs()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/kingroot/kinguser/en;->fx:J
a=0;// 
a=0;//     .line 270
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bt()Lcom/kingroot/kinguser/vz;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     sget-object v0, Lcom/kingroot/kinguser/en;->fz:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic bu()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bs()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static k(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     sput-wide p0, Lcom/kingroot/kinguser/en;->fx:J
a=0;// 
a=0;//     .line 274
a=0;//     return-void
a=0;// .end method
}}
