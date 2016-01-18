package com.kingroot.kinguser.util; class ProcessUtils$ProcessInfo { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile done"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public name:Ljava/lang/String;
a=0;// 
a=0;// .field public pid:I
a=0;// 
a=0;// .field public ppid:I
a=0;// 
a=0;// .field public uid:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 288
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 289
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     .line 290
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->ppid:I
a=0;// 
a=0;//     .line 291
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 292
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     .line 293
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IILjava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 296
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;);
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     .line 297
a=0;//     iput p2, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->ppid:I
a=0;// 
a=0;//     .line 298
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 299
a=0;//     iput p4, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     .line 300
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "PID="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " PPID="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->ppid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " NAME="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " UID="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
