package com.kingroot.RushRoot; class je { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/je;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:I
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// .field public c:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/je;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/InputStream;)Lcom/kingroot/RushRoot/je;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/je;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/je;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/je;-><init>()V
a=0;// 
a=0;//     .line 120
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/je;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/jd;->a([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/RushRoot/je;->a:I
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/jd;->a([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/RushRoot/je;->b:I
a=0;// 
a=0;//     .line 125
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     .line 127
a=0;//     iput-object v0, v1, Lcom/kingroot/RushRoot/je;->c:[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 132
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 129
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
