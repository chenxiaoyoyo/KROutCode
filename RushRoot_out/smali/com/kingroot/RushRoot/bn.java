package com.kingroot.RushRoot; class bn { void a() { int a;
a=0;// .class public Lcom/kingroot/RushRoot/bn;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final synthetic a:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const-class v0, Lcom/kingroot/RushRoot/bn;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     sput-boolean v0, Lcom/kingroot/RushRoot/bn;->a:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 742
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/bn;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Lcom/kingroot/RushRoot/bq;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/RushRoot/bq;);
a=0;//     invoke-direct {v4}, Lcom/kingroot/RushRoot/bq;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/bq;);
a=0;//     div-int/lit8 v0, v3, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v1, v0, 0x4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v0, v4, Lcom/kingroot/RushRoot/bq;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     rem-int/lit8 v0, v3, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     iget-boolean v0, v4, Lcom/kingroot/RushRoot/bq;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     add-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x39
a=0;// 
a=0;//     add-int/lit8 v5, v0, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-boolean v0, v4, Lcom/kingroot/RushRoot/bq;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     mul-int/2addr v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iput-object v1, v4, Lcom/kingroot/RushRoot/bq;->a:[B
a=0;// 
a=0;//     invoke-virtual {v4, p0, v3}, Lcom/kingroot/RushRoot/bq;->a([BI)Z
a=0;// 
a=0;//     sget-boolean v1, Lcom/kingroot/RushRoot/bn;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     iget v1, v4, Lcom/kingroot/RushRoot/bq;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 459
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 461
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 458
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Integer);v2=(UninitRef,Ljava/lang/String;);v3=(Integer);v4=(Reference,Lcom/kingroot/RushRoot/bq;);v5=(Uninit);
a=0;//     rem-int/lit8 v0, v3, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     add-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     add-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v5=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     iget-object v0, v4, Lcom/kingroot/RushRoot/bq;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const-string v1, "US-ASCII"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Integer);v2=(UninitRef,Ljava/lang/String;);v5=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/kingroot/RushRoot/bp;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/kingroot/RushRoot/bp;);
a=0;//     mul-int/lit8 v3, v1, 0x3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-direct {v2, v3}, Lcom/kingroot/RushRoot/bp;-><init>([B)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/bp;);
a=0;//     invoke-virtual {v2, v0, v1}, Lcom/kingroot/RushRoot/bp;->a([BI)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "bad base-64"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     iget v0, v2, Lcom/kingroot/RushRoot/bp;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, v2, Lcom/kingroot/RushRoot/bp;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, v2, Lcom/kingroot/RushRoot/bp;->a:[B
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Lcom/kingroot/RushRoot/bp;);
a=0;//     iget v0, v2, Lcom/kingroot/RushRoot/bp;->b:I
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, v2, Lcom/kingroot/RushRoot/bp;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, v2, Lcom/kingroot/RushRoot/bp;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
