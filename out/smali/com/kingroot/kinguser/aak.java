package com.kingroot.kinguser; class aak { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aak;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field Cq:J
a=0;// 
a=0;// .field Cr:J
a=0;// 
a=0;// .field Cs:J
a=0;// 
a=0;// .field Ct:J
a=0;// 
a=0;// .field Cu:J
a=0;// 
a=0;// .field name:Ljava/lang/String;
a=0;// 
a=0;// .field pid:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 324
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 325
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aak;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/aak;->pid:I
a=0;// 
a=0;//     .line 326
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aak;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 327
a=0;//     iput-wide v1, p0, Lcom/kingroot/kinguser/aak;->Cq:J
a=0;// 
a=0;//     .line 328
a=0;//     iput-wide v1, p0, Lcom/kingroot/kinguser/aak;->Cr:J
a=0;// 
a=0;//     .line 329
a=0;//     iput-wide v1, p0, Lcom/kingroot/kinguser/aak;->Cs:J
a=0;// 
a=0;//     .line 330
a=0;//     iput-wide v1, p0, Lcom/kingroot/kinguser/aak;->Ct:J
a=0;// 
a=0;//     .line 331
a=0;//     iput-wide v1, p0, Lcom/kingroot/kinguser/aak;->Cu:J
a=0;// 
a=0;//     .line 332
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;Ljava/io/File;)Lcom/kingroot/kinguser/aak;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 335
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 358
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aak;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 338
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/uu;->q(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 339
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 342
a=0;//     const-string v2, " "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 343
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x28
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v1, v3, :cond_0
a=0;// 
a=0;//     .line 345
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcom/kingroot/kinguser/aak;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/aak;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/kinguser/aak;-><init>()V
a=0;// 
a=0;//     .line 346
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/aak;);
a=0;//     iput-object p0, v1, Lcom/kingroot/kinguser/aak;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 347
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Lcom/kingroot/kinguser/aak;->pid:I
a=0;// 
a=0;//     .line 348
a=0;//     const/16 v3, 0x15
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, v1, Lcom/kingroot/kinguser/aak;->Cq:J
a=0;// 
a=0;//     .line 349
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iput-wide v3, v1, Lcom/kingroot/kinguser/aak;->Cr:J
a=0;// 
a=0;//     .line 350
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iput-wide v3, v1, Lcom/kingroot/kinguser/aak;->Cs:J
a=0;// 
a=0;//     .line 351
a=0;//     const/16 v3, 0xf
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iput-wide v3, v1, Lcom/kingroot/kinguser/aak;->Ct:J
a=0;// 
a=0;//     .line 352
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v2, v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v1, Lcom/kingroot/kinguser/aak;->Cu:J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 353
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aak;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 354
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/aak;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/aak;->pid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Lcom/kingroot/kinguser/aak;->pid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aak;->Cq:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aak;->Cq:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/aak;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/aak;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 372
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
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
a=0;// .method public b(Lcom/kingroot/kinguser/aak;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aak;->Cr:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aak;->Cr:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aak;->Cs:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aak;->Cs:J
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aak;->Ct:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aak;->Ct:J
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aak;->Cu:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aak;->Cu:J
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 386
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
