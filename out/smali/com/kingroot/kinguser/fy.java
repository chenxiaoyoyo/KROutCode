package com.kingroot.kinguser; class fy { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/fy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static go:Ljava/lang/Class;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static final R(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 21
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 26
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Class;);v1=(Conflicted);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/fy;->go:Ljava/lang/Class;
a=0;// 
a=0;//     .line 27
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fy;->go:Ljava/lang/Class;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 22
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 23
a=0;//     #v1=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 27
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Class;);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static final g(Ljava/lang/String;I)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     .line 32
a=0;//     invoke-static {p0}, Lcom/kingroot/kinguser/fy;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 34
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     .line 37
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static final getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/fy;->go:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 74
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 68
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/SecurityException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 69
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);v1=(Reference,Ljava/lang/SecurityException;);v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/SecurityException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 71
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);v1=(Reference,Ljava/lang/NoSuchFieldException;);v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/NoSuchFieldException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :catch_2
a=0;//     #v1=(One);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 68
a=0;//     :catch_3
a=0;//     #v1=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/SecurityException;);
a=0;//     goto :goto_1
a=0;// .end method
}}
