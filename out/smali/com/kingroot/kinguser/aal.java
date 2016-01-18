package com.kingroot.kinguser; class aal { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aal;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field Cv:J
a=0;// 
a=0;// .field Cw:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 268
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 269
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aal;);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/aal;->Cv:J
a=0;// 
a=0;//     .line 270
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/aal;->Cw:J
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static mR()Lcom/kingroot/kinguser/aal;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aal;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aal;-><init>()V
a=0;// 
a=0;//     .line 276
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aal;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, "/proc/uptime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 277
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/uu;->q(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     const-string v2, " "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 281
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v1, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/kinguser/aal;->Cv:J
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/kingroot/kinguser/aal;->Cw:J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 285
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/aal;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aal;->Cv:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aal;->Cv:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/kingroot/kinguser/aal;->Cw:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p1, Lcom/kingroot/kinguser/aal;->Cw:J
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 298
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
