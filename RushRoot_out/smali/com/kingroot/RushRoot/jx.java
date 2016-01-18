package com.kingroot.RushRoot; class jx { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/jx;
a=0;// .super Lcom/kingroot/RushRoot/jw;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static h:Ljava/util/HashMap;
a=0;// 
a=0;// .field static i:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;// .field private j:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/jx;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 95
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/jx;->i:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/jw;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/jx;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/jz;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     .line 277
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/jx;->j:I
a=0;// 
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput-short v1, v0, Lcom/kingroot/RushRoot/jz;->a:S
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/jw;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/jx;);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/jz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/jz;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     .line 277
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/jx;->j:I
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {p0}, Lcom/kingroot/RushRoot/jx;->b()V
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iput p1, v0, Lcom/kingroot/RushRoot/jz;->d:I
a=0;// 
a=0;//     .line 247
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const-string v0, "."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "put name can not startwith . , now is "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
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
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Lcom/kingroot/RushRoot/jw;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a([B)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "decode package must include size head"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kd;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p1, v1}, Lcom/kingroot/RushRoot/kd;-><init>([BB)V
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kd;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kd;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/RushRoot/jz;->a(Lcom/kingroot/RushRoot/kd;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     iget-short v0, v0, Lcom/kingroot/RushRoot/jz;->a:S
a=0;// 
a=0;//     #v0=(Short);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kd;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/jz;->g:[B
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/kd;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kd;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kd;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/jx;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v1, Lcom/kingroot/RushRoot/jx;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/jx;->h:Ljava/util/HashMap;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/RushRoot/kd;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jx;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 192
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     :cond_2
a=0;//     #v0=(Short);v1=(PosByte);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jx;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kd;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/jz;->g:[B
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/kingroot/RushRoot/kd;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kd;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kd;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/jx;->i:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v1, Lcom/kingroot/RushRoot/jx;->i:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v2, Lcom/kingroot/RushRoot/jx;->i:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v1, Lcom/kingroot/RushRoot/jx;->i:Ljava/util/HashMap;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/RushRoot/kd;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jx;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/RushRoot/jx;->b:Ljava/util/HashMap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 190
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 191
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final a()[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iget-short v0, v0, Lcom/kingroot/RushRoot/jz;->a:S
a=0;// 
a=0;//     #v0=(Short);
a=0;//     if-ne v0, v3, :cond_3
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jz;->e:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jz;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "servantName can not is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jz;->f:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jz;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 65
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "funcName can not is null"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_3
a=0;//     #v0=(Short);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jz;->e:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/jz;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/jz;->f:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/jz;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kf;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/RushRoot/kf;-><init>(I)V
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kf;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kf;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     iget-short v1, v1, Lcom/kingroot/RushRoot/jz;->a:S
a=0;// 
a=0;//     #v1=(Short);
a=0;//     if-ne v1, v3, :cond_6
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/RushRoot/kf;->a(Ljava/util/Map;I)V
a=0;// 
a=0;//     .line 82
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/kf;->a()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/kh;->a(Ljava/nio/ByteBuffer;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/kingroot/RushRoot/jz;->g:[B
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/kf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/kf;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/RushRoot/kf;-><init>(I)V
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/kf;);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/kf;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/RushRoot/jz;->a(Lcom/kingroot/RushRoot/kf;)V
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/kf;->a()Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/kh;->a(Ljava/nio/ByteBuffer;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 88
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_6
a=0;//     #v1=(Short);v2=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/RushRoot/jx;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/RushRoot/kf;->a(Ljava/util/Map;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-super {p0}, Lcom/kingroot/RushRoot/jw;->b()V
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput-short v1, v0, Lcom/kingroot/RushRoot/jz;->a:S
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iput-object p1, v0, Lcom/kingroot/RushRoot/jz;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 211
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/jx;->g:Lcom/kingroot/RushRoot/jz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/jz;);
a=0;//     iput-object p1, v0, Lcom/kingroot/RushRoot/jz;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
}}
