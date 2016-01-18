package com.kingroot.kinguser; class jr { void a() { int a;
a=0;// .class public final Lcom/kingroot/kinguser/jr;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static kn:Ljava/lang/Class;
a=0;// 
a=0;// .field private static ko:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private static kp:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private static kq:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private static kr:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private static sCache:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     :try_start_0
a=0;//     const-string v0, "android.os.ServiceManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jr;->kn:Ljava/lang/Class;
a=0;// 
a=0;//     .line 32
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jr;->kn:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v1, "getService"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jr;->ko:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 33
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jr;->kn:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v1, "addService"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     const-class v4, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-class v4, Landroid/os/IBinder;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jr;->kp:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 34
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jr;->kn:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v1, "checkService"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jr;->kq:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 35
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jr;->kn:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v1, "listServices"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jr;->kr:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jr;->kn:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v1, "sCache"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jr;->sCache:Ljava/util/HashMap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 42
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 43
a=0;//     #v0=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 46
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/NoSuchFieldException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static varargs a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     .line 62
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 63
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 64
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :catch_1
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :catch_2
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aT(Ljava/lang/String;)Landroid/os/IBinder;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jr;->kq:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p0, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/jr;->a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/IBinder;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
