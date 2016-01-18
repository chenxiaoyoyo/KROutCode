package com.android.util; class ReflectiveProperty { void a() { int a;
a=0;// .class Lcom/android/util/ReflectiveProperty;
a=0;// .super Lcom/android/util/Property;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PREFIX_GET:Ljava/lang/String; = "get"
a=0;// 
a=0;// .field private static final PREFIX_IS:Ljava/lang/String; = "is"
a=0;// 
a=0;// .field private static final PREFIX_SET:Ljava/lang/String; = "set"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 47
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p2, p3}, Lcom/android/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/android/util/ReflectiveProperty;);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "get"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     check-cast v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 92
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-direct {p0, p2, v0}, Lcom/android/util/ReflectiveProperty;->typesMatch(Ljava/lang/Class;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v1, Lcom/android/util/NoSuchPropertyException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/util/NoSuchPropertyException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Underlying type ("
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ") "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "does not match Property type ("
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/android/util/NoSuchPropertyException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/util/NoSuchPropertyException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 54
a=0;//     :catch_0
a=0;//     #v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     check-cast v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "is"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     check-cast v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 71
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Null);
a=0;//     check-cast v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_4
a=0;//     invoke-virtual {p1, p3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-direct {p0, p2, v0}, Lcom/android/util/ReflectiveProperty;->typesMatch(Ljava/lang/Class;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v1, Lcom/android/util/NoSuchPropertyException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/util/NoSuchPropertyException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Underlying type ("
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ") "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "does not match Property type ("
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/android/util/NoSuchPropertyException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/util/NoSuchPropertyException;);
a=0;//     throw v1
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_4
a=0;// 
a=0;//     .line 83
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Lcom/android/util/NoSuchPropertyException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/util/NoSuchPropertyException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "No accessor method or field found for property with name "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/android/util/NoSuchPropertyException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/NoSuchPropertyException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "set"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_5
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-virtual {p1, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/util/ReflectiveProperty;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_5
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 104
a=0;//     :catch_5
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private typesMatch(Ljava/lang/Class;Ljava/lang/Class;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Null);
a=0;//     if-eq p2, p1, :cond_9
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 119
a=0;//     sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-ne p2, v2, :cond_0
a=0;// 
a=0;//     const-class v2, Ljava/lang/Float;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_1
a=0;// 
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_2
a=0;// 
a=0;//     const-class v2, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_2
a=0;//     sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_3
a=0;// 
a=0;//     const-class v2, Ljava/lang/Long;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_3
a=0;//     sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_4
a=0;// 
a=0;//     const-class v2, Ljava/lang/Double;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_4
a=0;//     sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_5
a=0;// 
a=0;//     const-class v2, Ljava/lang/Short;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_5
a=0;//     sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_6
a=0;// 
a=0;//     const-class v2, Ljava/lang/Byte;
a=0;// 
a=0;//     if-eq p1, v2, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-ne p2, v2, :cond_8
a=0;// 
a=0;//     const-class v2, Ljava/lang/Character;
a=0;// 
a=0;//     if-ne p1, v2, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 130
a=0;//     :cond_8
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/android/util/ReflectiveProperty;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 159
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 161
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 166
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public isReadOnly()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 152
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 138
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 139
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 140
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/android/util/ReflectiveProperty;->mField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Property "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/android/util/ReflectiveProperty;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is read-only"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
