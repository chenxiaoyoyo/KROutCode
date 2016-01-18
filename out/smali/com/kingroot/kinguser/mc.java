package com.kingroot.kinguser; class mc { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/mc;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field nG:I
a=0;// 
a=0;// .field nH:Ljava/lang/String;
a=0;// 
a=0;// .field nI:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 190
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/mc;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mc;->nH:Ljava/lang/String;
a=0;// 
a=0;//     .line 191
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mc;->nI:Ljava/lang/String;
a=0;// 
a=0;//     .line 194
a=0;//     iput p1, p0, Lcom/kingroot/kinguser/mc;->nG:I
a=0;// 
a=0;//     .line 199
a=0;//     :try_start_0
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 200
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/kingroot/kinguser/mc;->nH:Ljava/lang/String;
a=0;// 
a=0;//     .line 202
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/mc;->nI:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 204
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
