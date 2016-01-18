package com.kingroot.kinguser; class nz { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public jl:J
a=0;// 
a=0;// .field protected lc:I
a=0;// 
a=0;// .field public mName:Ljava/lang/String;
a=0;// 
a=0;// .field public mState:I
a=0;// 
a=0;// .field public mThread:Ljava/lang/Thread;
a=0;// 
a=0;// .field public mi:Ljava/lang/String;
a=0;// 
a=0;// .field public pe:Z
a=0;// 
a=0;// .field public pf:Ljava/lang/String;
a=0;// 
a=0;// .field public pg:J
a=0;// 
a=0;// .field public ph:F
a=0;// 
a=0;// .field public pi:I
a=0;// 
a=0;// .field public pj:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nz;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nz;->pe:Z
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/nz;->mState:I
a=0;// 
a=0;//     .line 85
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/nz;->jl:J
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/nz;->pj:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAbsolutePath()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nz;->pf:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nz;->mName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     return-object v0
a=0;// .end method
}}
