package com.kingroot.RushRoot; class ao { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/ao;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;)Lcom/kingroot/RushRoot/bj;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     .line 71
a=0;//     #v4=(Null);
a=0;//     const-string v1, "\t"
a=0;// 
a=0;//     .line 73
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/bj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/bj;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/bj;-><init>()V
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/bj;);
a=0;//     aget-object v2, v1, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/bj;->a:I
a=0;// 
a=0;//     .line 81
a=0;//     aget-object v2, v1, v5
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/RushRoot/bj;->b:I
a=0;// 
a=0;//     .line 82
a=0;//     aget-object v2, v1, v6
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v0, Lcom/kingroot/RushRoot/bj;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     aget-object v2, v1, v4
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-object v3, v1, v5
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     aget-object v1, v1, v6
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/bj;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 74
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
