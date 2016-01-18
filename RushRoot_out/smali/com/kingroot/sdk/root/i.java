package com.kingroot.sdk.root; class i { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/i;
a=0;// .super Lcom/kingroot/sdk/root/a;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Ljava/lang/Class;
a=0;// 
a=0;// .field private d:Ljava/lang/Object;
a=0;// 
a=0;// .field private e:Ljava/lang/Object;
a=0;// 
a=0;// .field private f:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Lcom/kingroot/sdk/root/k;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Lcom/kingroot/sdk/root/a;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/i;);
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/root/i;->c:Ljava/lang/Class;
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p2, p0, Lcom/kingroot/sdk/root/i;->d:Ljava/lang/Object;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p3, p0, Lcom/kingroot/sdk/root/i;->e:Ljava/lang/Object;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p4, p0, Lcom/kingroot/sdk/root/i;->f:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     .line 29
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/kingroot/sdk/root/a;->a:I
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final c()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/i;->c:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/i;->f:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v1, v1, Lcom/kingroot/sdk/root/k;->l:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/i;->f:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v2, v2, Lcom/kingroot/sdk/root/k;->m:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/i;->d:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/kingroot/sdk/root/i;->e:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "\u8c03\u7528JavaShell\u7684close()\u65b9\u6cd5\u5f02\u5e38!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final d(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-static {}, Lcom/kingroot/sdk/util/f;->d()V
a=0;// 
a=0;//     .line 35
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/root/i;->c:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/i;->f:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v2, v2, Lcom/kingroot/sdk/root/k;->j:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/kingroot/sdk/root/i;->f:Lcom/kingroot/sdk/root/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/sdk/root/k;);
a=0;//     iget-object v3, v3, Lcom/kingroot/sdk/root/k;->k:[Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v2, p0, Lcom/kingroot/sdk/root/i;->d:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/kingroot/sdk/root/i;->e:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "cmd: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", ret: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     return-object v0
a=0;// 
a=0;//     .line 40
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "\u8c03\u7528JavaShell\u7684executeCommand()\u65b9\u6cd5\u5f02\u5e38!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 42
a=0;//     const/16 v2, 0x1b68
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-string v3, "jshell throw exception"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Lcom/kingroot/sdk/util/f;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
