package com.kingroot.sdk.commom; class e { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/commom/e;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// .field public static b:Ljava/lang/String;
a=0;// 
a=0;// .field public static c:Ljava/lang/String;
a=0;// 
a=0;// .field public static d:I
a=0;// 
a=0;// .field private static e:I
a=0;// 
a=0;// .field private static f:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/kingroot/sdk/commom/e;->a:Z
a=0;// 
a=0;//     .line 17
a=0;//     const-string v0, "http://pmir.3g.qq.com/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 22
a=0;//     const-string v0, "http://bh.3g.qq.com"
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     const/16 v0, 0xa3
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/kingroot/sdk/commom/e;->d:I
a=0;// 
a=0;//     .line 52
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/sdk/commom/e;->e:I
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "1.0.15"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/kingroot/sdk/commom/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(ZZ)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v0, "http://wuptest.cs0309.3g.qq.com"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     sput-boolean p1, Lcom/kingroot/sdk/commom/e;->a:Z
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "useTestURL = "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", logSwitchOn = "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     const-string v0, "http://bh.cs0309.3g.qq.com"
a=0;// 
a=0;//     :goto_1
a=0;//     sput-object v0, Lcom/kingroot/sdk/commom/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "http://pmir.3g.qq.com/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "http://bh.3g.qq.com"
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget v0, Lcom/kingroot/sdk/commom/e;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
