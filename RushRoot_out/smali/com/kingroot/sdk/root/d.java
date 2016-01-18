package com.kingroot.sdk.root; class d { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 98
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/32 v2, 0x30d40
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 101
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 96
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(LongLo);v2=(LongHi);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-wide v0, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static varargs a(I[I)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Null);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     aget v3, p1, v1
a=0;// 
a=0;//     .line 69
a=0;//     #v3=(Integer);
a=0;//     if-ne p0, v3, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
