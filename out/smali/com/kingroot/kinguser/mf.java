package com.kingroot.kinguser; class mf { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/mf;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Lcom/kingroot/kinguser/yi;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 221
a=0;//     #v1=(One);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/yi;->xo:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2}, Lcom/kingroot/kinguser/mm;->j(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 226
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 227
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 229
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     if-ne v2, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/kingroot/kinguser/yn;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 241
a=0;//     #v0=(One);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/yn;->yE:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 250
a=0;//     const-string v4, "kutime:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 251
a=0;//     const-string v4, ":"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 252
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v2, :cond_5
a=0;// 
a=0;//     .line 254
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(One);
a=0;//     aget-object v2, v3, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long/2addr v2, v4
a=0;// 
a=0;//     .line 255
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_2
a=0;// 
a=0;//     .line 257
a=0;//     const-wide/32 v2, 0x6ddd00
a=0;// 
a=0;//     .line 260
a=0;//     :cond_2
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v4, v2, v3}, Lcom/kingroot/kinguser/jc;->D(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 269
a=0;//     :cond_3
a=0;//     #v0=(One);v2=(PosByte);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Uninit);
a=0;//     iget v2, p1, Lcom/kingroot/kinguser/yn;->yF:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_4
a=0;// 
a=0;//     .line 271
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/mm;->id()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 272
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/yn;->yE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_4
a=0;//     #v0=(One);v2=(Integer);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/yn;->yE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/gq;->Y(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 279
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(One);v2=(Conflicted);v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/kingroot/kinguser/yp;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/yp;->yH:I
a=0;// 
a=0;//     .line 347
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 348
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/yp;->lF:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "temp.apk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/kingroot/kinguser/mv;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/kinguser/mv;);
a=0;//     new-instance v5, Lcom/kingroot/kinguser/mg;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/kingroot/kinguser/mg;);
a=0;//     invoke-direct {v5, v0, p0}, Lcom/kingroot/kinguser/mg;-><init>(ILandroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/mg;);
a=0;//     invoke-direct {v4, p0, v1, v5}, Lcom/kingroot/kinguser/mv;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kingroot/kinguser/mx;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/mv;);
a=0;//     invoke-static {v2, v3, v4}, Lcom/kingroot/kinguser/mm;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/mv;)V
a=0;// 
a=0;//     .line 368
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/kinguser/zj;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 83
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 84
a=0;//     #v2=(PosByte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosByte);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(One);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     #v0=(Null);
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/zj;->Ag:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sparse-switch v3, :sswitch_data_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(PosByte);v2=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 174
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v1=(One);
a=0;//     iget-byte v0, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 96
a=0;//     :sswitch_1
a=0;//     #v0=(Null);v1=(One);
a=0;//     iget-byte v0, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 101
a=0;//     :sswitch_2
a=0;//     #v0=(Null);v1=(One);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/me;->K(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 108
a=0;//     :sswitch_3
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 111
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/me;->ar(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 115
a=0;//     :sswitch_4
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 118
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/me;->aq(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 122
a=0;//     :sswitch_5
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 125
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/me;->as(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 129
a=0;//     :sswitch_6
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_6
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 132
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->S(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 136
a=0;//     :sswitch_7
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 139
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->U(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 143
a=0;//     :sswitch_8
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_8
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 146
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->T(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     :sswitch_9
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_9
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 153
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->V(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 157
a=0;//     :sswitch_a
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_a
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 160
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->X(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 164
a=0;//     :sswitch_b
a=0;//     #v0=(Null);v2=(PosByte);
a=0;//     iget-byte v2, p0, Lcom/kingroot/kinguser/zj;->Ah:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v1, :cond_b
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_b
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v2, v0}, Lcom/kingroot/kinguser/jc;->Z(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 89
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x7 -> :sswitch_0
a=0;//         0x18 -> :sswitch_1
a=0;//         0x3d -> :sswitch_2
a=0;//         0x46 -> :sswitch_3
a=0;//         0x47 -> :sswitch_4
a=0;//         0x48 -> :sswitch_5
a=0;//         0x49 -> :sswitch_6
a=0;//         0x4a -> :sswitch_7
a=0;//         0x4b -> :sswitch_8
a=0;//         0x4c -> :sswitch_9
a=0;//         0x4d -> :sswitch_a
a=0;//         0x4e -> :sswitch_b
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;IIIII)Lcom/kingroot/kinguser/ya;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     new-instance v0, Lcom/kingroot/kinguser/xy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/xy;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/xy;-><init>()V
a=0;// 
a=0;//     .line 449
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xy;);
a=0;//     iput p1, v0, Lcom/kingroot/kinguser/xy;->nO:I
a=0;// 
a=0;//     .line 450
a=0;//     iput p5, v0, Lcom/kingroot/kinguser/xy;->nP:I
a=0;// 
a=0;//     .line 453
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 454
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 457
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ya;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ya;-><init>()V
a=0;// 
a=0;//     .line 458
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);
a=0;//     iput-object p0, v0, Lcom/kingroot/kinguser/ya;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 459
a=0;//     iput p2, v0, Lcom/kingroot/kinguser/ya;->action:I
a=0;// 
a=0;//     .line 460
a=0;//     iput p3, v0, Lcom/kingroot/kinguser/ya;->nS:I
a=0;// 
a=0;//     .line 461
a=0;//     iput p4, v0, Lcom/kingroot/kinguser/ya;->nT:I
a=0;// 
a=0;//     .line 462
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/kinguser/ya;->nU:I
a=0;// 
a=0;//     .line 463
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/ya;->wN:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 464
a=0;//     iput p5, v0, Lcom/kingroot/kinguser/ya;->nP:I
a=0;// 
a=0;//     .line 465
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;IIILjava/util/ArrayList;I)Lcom/kingroot/kinguser/ya;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ya;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/ya;-><init>()V
a=0;// 
a=0;//     .line 420
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ya;);
a=0;//     iput-object p0, v0, Lcom/kingroot/kinguser/ya;->nQ:Ljava/lang/String;
a=0;// 
a=0;//     .line 421
a=0;//     iput p1, v0, Lcom/kingroot/kinguser/ya;->action:I
a=0;// 
a=0;//     .line 422
a=0;//     iput p2, v0, Lcom/kingroot/kinguser/ya;->nS:I
a=0;// 
a=0;//     .line 423
a=0;//     iput p3, v0, Lcom/kingroot/kinguser/ya;->nT:I
a=0;// 
a=0;//     .line 424
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
a=0;//     iput v1, v0, Lcom/kingroot/kinguser/ya;->nU:I
a=0;// 
a=0;//     .line 425
a=0;//     iput-object p4, v0, Lcom/kingroot/kinguser/ya;->wN:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 426
a=0;//     iput p5, v0, Lcom/kingroot/kinguser/ya;->nP:I
a=0;// 
a=0;//     .line 427
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Lcom/kingroot/kinguser/xx;)Lcom/kingroot/kinguser/ya;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/xq;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/xq;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/xq;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/xq;);
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/xq;->cm(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/xx;->wD:[B
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/xq;->p([B)V
a=0;// 
a=0;//     .line 65
a=0;//     const-string v1, "ce1"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v3, Lcom/kingroot/kinguser/zj;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/zj;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/zj;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/zj;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/kingroot/kinguser/xq;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/zj;
a=0;// 
a=0;//     .line 67
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/mf;->a(Lcom/kingroot/kinguser/zj;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 69
a=0;//     #v5=(Integer);
a=0;//     iget v1, p1, Lcom/kingroot/kinguser/xx;->nO:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/mf;->a(Ljava/lang/String;IIIII)Lcom/kingroot/kinguser/ya;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;Lcom/kingroot/kinguser/xx;)Ljava/util/List;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/xu;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/xu;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/xu;-><init>()V
a=0;// 
a=0;//     .line 204
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/xu;);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Lcom/kingroot/kinguser/xu;->wu:I
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v2, Lcom/kingroot/kinguser/zm;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/kinguser/zm;);
a=0;//     invoke-direct {v2}, Lcom/kingroot/kinguser/zm;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/zm;);
a=0;//     iput-object v2, v1, Lcom/kingroot/kinguser/xu;->wt:Lcom/kingroot/kinguser/zm;
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v2, v1, Lcom/kingroot/kinguser/xu;->wt:Lcom/kingroot/kinguser/zm;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v2, Lcom/kingroot/kinguser/zm;->An:Ljava/lang/String;
a=0;// 
a=0;//     .line 208
a=0;//     new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
a=0;// 
a=0;//     .line 209
a=0;//     #v2=(Reference,Ljava/util/concurrent/atomic/AtomicReference;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/kinguser/mb;->a(Landroid/content/Context;Lcom/kingroot/kinguser/xu;Ljava/util/concurrent/atomic/AtomicReference;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 210
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/xt;
a=0;// 
a=0;//     .line 212
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/xt;->wq:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 217
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bj(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 372
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 396
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 376
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 378
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "chown %d.%d %s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v3
a=0;// 
a=0;//     aput-object p0, v4, v6
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 381
a=0;//     const-string v1, "chmod 0%o %s"
a=0;// 
a=0;//     new-array v4, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     const/16 v5, 0x1ed
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     aput-object p0, v4, v3
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 384
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 385
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gn;->k(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 386
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v1, v0, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 388
a=0;//     :goto_1
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     .line 389
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 388
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 396
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 294
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 295
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 303
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 298
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/mm;->m(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 299
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 303
a=0;//     invoke-static {p0, v1}, Lcom/kingroot/kinguser/mm;->a(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static f(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 314
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 317
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/mm;->m(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 318
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/mm;->k(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static g(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 332
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 333
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 340
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 336
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/mm;->m(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 337
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/mm;->l(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hV()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lo;->dd()Z
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static hW()Lcom/kingroot/kinguser/ya;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static hX()Lcom/kingroot/kinguser/ya;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
