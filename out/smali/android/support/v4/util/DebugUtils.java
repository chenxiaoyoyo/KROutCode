package android.support.v4.util; class DebugUtils { void a() { int a;
a=0;// .class public Landroid/support/v4/util/DebugUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/DebugUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 32
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 34
a=0;//     const/16 v1, 0x2e
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 35
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 36
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_2
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 40
a=0;//     const/16 v0, 0x7b
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 41
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
