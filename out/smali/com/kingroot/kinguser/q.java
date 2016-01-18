package com.kingroot.kinguser; class q { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/q;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Y:Lcom/kingroot/kinguser/x;
a=0;// 
a=0;// .field private Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/x;Lcom/kingroot/kinguser/w;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/q;);
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/q;->Y:Lcom/kingroot/kinguser/x;
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/q;->Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/q;)Lcom/kingroot/kinguser/w;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/q;->Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/w;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/e;)Lcom/kingroot/kinguser/d;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     instance-of v0, p1, Lcom/kingroot/kinguser/s;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 34
a=0;//     check-cast p1, Lcom/kingroot/kinguser/s;
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/s;->Q()Lcom/kingroot/kinguser/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/u;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/u;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 39
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "chmod 0777 "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/q;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/16 v1, 0x33
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "zgo main dex file not found"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/u;->R()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "chmod 0777 "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/kinguser/q;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 48
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/16 v1, 0x34
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "zgo mod dex file not found"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "chmod 0777 "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/u;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/q;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, "mkdir -p /data/local/tmp/zgo \n"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/q;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     const-string v0, "chmod 0777 /data/local/tmp/zgo \n"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/q;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/l;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "check ok"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/kingroot/kinguser/l;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/l;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/e;Lcom/kingroot/kinguser/d;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/q;->Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/w;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/q;->Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/kingroot/kinguser/w;->c(II)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {p2}, Lcom/kingroot/kinguser/d;->M()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/r;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/r;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/kingroot/kinguser/r;-><init>(Lcom/kingroot/kinguser/q;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/r;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/r;->start()V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcom/kingroot/kinguser/e;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcom/kingroot/kinguser/e;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/q;->Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/w;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/q;->Z:Lcom/kingroot/kinguser/w;
a=0;// 
a=0;//     invoke-interface {v0, v1, v1}, Lcom/kingroot/kinguser/w;->c(II)V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public r(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/q;->Y:Lcom/kingroot/kinguser/x;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/x;);
a=0;//     invoke-interface {v0, p1}, Lcom/kingroot/kinguser/x;->r(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
