package com.kingroot.RushRoot; class aw { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/aw;
a=0;// .super Lcom/kingroot/RushRoot/ay;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 5
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/kingroot/RushRoot/ay;-><init>()V
a=0;// 
a=0;//     .line 10
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/aw;);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/aw;->a:Z
a=0;// 
a=0;//     .line 15
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/aw;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Landroid/os/Bundle;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     #v0=(Null);
a=0;//     const-string v1, "has_root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     const-string v1, "has_root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/kingroot/RushRoot/aw;->a:Z
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "err_code"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/aw;->b:I
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Landroid/os/Bundle;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "has_root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Lcom/kingroot/RushRoot/aw;->a:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 26
a=0;//     const-string v1, "err_code"
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/RushRoot/aw;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 27
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-boolean v0, p0, Lcom/kingroot/RushRoot/aw;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/RushRoot/aw;->a:Z
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final e()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/16 v0, 0x270f
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/kingroot/RushRoot/aw;->b:I
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final f()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget v0, p0, Lcom/kingroot/RushRoot/aw;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
