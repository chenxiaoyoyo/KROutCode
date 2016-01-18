package com.kingroot.kinguser; class lk { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/lk;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile mA:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;// .field mC:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;// .field mD:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/lk;->mA:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/lk;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ll;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ll;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ll;-><init>(Lcom/kingroot/kinguser/lk;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ll;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lk;->mB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v0, Lcom/kingroot/kinguser/lm;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/lm;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/lm;-><init>(Lcom/kingroot/kinguser/lk;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lm;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lk;->mC:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Lcom/kingroot/kinguser/ln;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/ln;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/ln;-><init>(Lcom/kingroot/kinguser/lk;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ln;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/lk;->mD:Lcom/kingroot/kinguser/lg;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 275
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 278
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/kr;->fb:Ljava/lang/String;
a=0;// 
a=0;//     .line 279
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a0036
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p2, v1}, Lcom/kingroot/kinguser/ks;->an(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 285
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/kr;->lI:Ljava/lang/String;
a=0;// 
a=0;//     .line 287
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 288
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a0027
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 294
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v4, Lcom/kingroot/kinguser/activitys/CommonDialogActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 295
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v4, 0x10000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 296
a=0;//     const-string v4, "Type"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 297
a=0;//     const-string v4, "Title"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 298
a=0;//     const-string v0, "Content"
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 299
a=0;//     const-string v0, "UpdatePath"
a=0;// 
a=0;//     invoke-virtual {v3, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 300
a=0;//     const-string v0, "WhereFrom"
a=0;// 
a=0;//     invoke-virtual {v3, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 307
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {p0, v7, v6, v6, v6}, Lcom/kingroot/kinguser/st;->a(IIIII)V
a=0;// 
a=0;//     .line 308
a=0;//     return-void
a=0;// 
a=0;//     .line 303
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/kinguser/ks;Lcom/kingroot/kinguser/kr;Ljava/io/File;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fn;->cc()Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fn;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/fn;->o(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     invoke-static {p0, p1, p2}, Lcom/kingroot/kinguser/lk;->b(Lcom/kingroot/kinguser/ks;Lcom/kingroot/kinguser/kr;Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/lk;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/lk;->n(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Lcom/kingroot/kinguser/ks;Lcom/kingroot/kinguser/kr;Ljava/io/File;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     .line 196
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fD()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 198
a=0;//     #v6=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fA()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 199
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 201
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0xf731400
a=0;// 
a=0;//     .line 202
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v7}, Lcom/kingroot/kinguser/jc;->fC()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 209
a=0;//     :cond_0
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ge v6, v7, :cond_1
a=0;// 
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 269
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 217
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(LongHi);v4=(LongLo);v5=(LongHi);
a=0;//     if-eqz p2, :cond_7
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 218
a=0;//     const-string v0, "download"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/ei;->z(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/et;->fK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/gq;->Y(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 222
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 223
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v4, v10}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 224
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/kingroot/kinguser/et;->fK:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 228
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 234
a=0;//     :cond_4
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/kr;->fb:Ljava/lang/String;
a=0;// 
a=0;//     .line 235
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p1, Lcom/kingroot/kinguser/kr;->type:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v8, :cond_6
a=0;// 
a=0;//     .line 237
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vi;->le()Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vi;->lg()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uc;->kC()Lcom/kingroot/kinguser/uc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/uc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/uc;->kD()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 242
a=0;//     :cond_5
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, p1, p0, v0}, Lcom/kingroot/kinguser/lk;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/kingroot/kinguser/jc;->O(Z)V
a=0;// 
a=0;//     .line 267
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/kingroot/kinguser/jc;->C(J)V
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     add-int/lit8 v1, v6, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/jc;->Q(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_6
a=0;//     #v5=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ek;->bd()Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     invoke-virtual {p0, v10}, Lcom/kingroot/kinguser/ks;->ao(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p2, v0, v4, v10}, Lcom/kingroot/kinguser/ek;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 250
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(LongHi);v4=(LongLo);
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/kr;->type:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v8, :cond_9
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vi;->le()Lcom/kingroot/kinguser/vi;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vi;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vi;->lg()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/uc;->kC()Lcom/kingroot/kinguser/uc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/uc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/uc;->kD()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 257
a=0;//     :cond_8
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lo;->hD()Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v0, v8, p1, p0}, Lcom/kingroot/kinguser/lo;->a(ILcom/kingroot/kinguser/kr;Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 261
a=0;//     :cond_9
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ek;->bd()Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v4, p1, Lcom/kingroot/kinguser/kr;->fb:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lcom/kingroot/kinguser/ks;->ao(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v4, v5, v9}, Lcom/kingroot/kinguser/ek;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static hB()Lcom/kingroot/kinguser/lk;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/kingroot/kinguser/lk;->mA:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lk;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     const-class v1, Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 46
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/lk;->mA:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/lk;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/lk;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lk;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/lk;->mA:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/lk;->mA:Lcom/kingroot/kinguser/lk;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 49
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
a=0;// .method private n(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ff;->bQ()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fJ()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 99
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fU()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v4, 0xf731400
a=0;// 
a=0;//     .line 101
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/kingroot/kinguser/gv;->a(JJJ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/kingroot/kinguser/jc;->F(J)V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hz()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 106
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lh;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/lh;->af(I)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/lh;->hu()Lcom/kingroot/kinguser/lh;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "kmPlugins.zip"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "http://mmgr.myapp.com/myapp/Kingroot/webapp_kingroot/image/KingMaster.apk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1, v0, v2, v3}, Lcom/kingroot/kinguser/lh;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hC()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lk;->mB:Lcom/kingroot/kinguser/vz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vz;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/vz;->lP()Z
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
}}
