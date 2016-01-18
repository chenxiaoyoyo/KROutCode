package com.kingroot.kinguser; class ade { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/ade;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Comparator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Fh:Ljava/text/Collator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 195
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/ade;);
a=0;//     sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/ade;->Fh:Ljava/text/Collator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/adb;Lcom/kingroot/kinguser/adb;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/ade;->Fh:Ljava/text/Collator;
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/Collator;);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/adb;->ha()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lcom/kingroot/kinguser/adb;->ha()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     check-cast p1, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     check-cast p2, Lcom/kingroot/kinguser/adb;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/kingroot/kinguser/ade;->a(Lcom/kingroot/kinguser/adb;Lcom/kingroot/kinguser/adb;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
