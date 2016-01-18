package com.android.animation; class PropertyValuesHolder { void a() { int a;
a=0;// .class public Lcom/android/animation/PropertyValuesHolder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;// .field private static FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;// .field private static INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;// .field private static final sFloatEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// .field private static final sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;// .field private static final sIntEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// .field private static final sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;// .field private mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// .field private mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;// .field protected mProperty:Lcom/android/util/Property;
a=0;// 
a=0;// .field final mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;// .field mPropertyName:Ljava/lang/String;
a=0;// 
a=0;// .field mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field final mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;// .field mValueType:Ljava/lang/Class;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/android/animation/IntEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/IntEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/IntEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/IntEvaluator;);
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->sIntEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Lcom/android/animation/FloatEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/FloatEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/android/animation/FloatEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/FloatEvaluator;);
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->sFloatEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     const-class v1, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-class v1, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/android/animation/PropertyValuesHolder;->sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Lcom/android/util/Property;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 64
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 75
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 109
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 139
a=0;//     iput-object p1, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     .line 140
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {p1}, Lcom/android/util/Property;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/android/util/Property;Lcom/android/animation/PropertyValuesHolder$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/android/animation/PropertyValuesHolder;-><init>(Lcom/android/util/Property;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 64
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 75
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 109
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 131
a=0;//     iput-object p1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/String;Lcom/android/animation/PropertyValuesHolder$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/android/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static getMethodName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 743
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 749
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 747
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 748
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 749
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
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
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPropertyFunction(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 380
a=0;//     .line 381
a=0;//     #v6=(One);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v0}, Lcom/android/animation/PropertyValuesHolder;->getMethodName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 382
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     #v0=(Null);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 385
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 439
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 386
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v5=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 391
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {p1, v4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_4
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 392
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 393
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 399
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);
a=0;//     new-array v5, v6, [Ljava/lang/Class;
a=0;// 
a=0;//     .line 401
a=0;//     #v5=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v2, Ljava/lang/Float;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 402
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 411
a=0;//     :goto_1
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v2, v6, :cond_4
a=0;// 
a=0;//     aget-object v7, v0, v2
a=0;// 
a=0;//     .line 412
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v5, v3
a=0;// 
a=0;//     .line 414
a=0;//     :try_start_3
a=0;//     invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 416
a=0;//     iput-object v7, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 417
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 403
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Reference,Ljava/lang/Class;);v6=(One);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 404
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 405
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v2, Ljava/lang/Double;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 406
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 408
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     new-array v0, v6, [Ljava/lang/Class;
a=0;// 
a=0;//     .line 409
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v2, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 418
a=0;//     :catch_2
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);v2=(Integer);v6=(Integer);v7=(Null);v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 423
a=0;//     :try_start_4
a=0;//     #v8=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 424
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 426
a=0;//     iput-object v7, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 427
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 428
a=0;//     :catch_3
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 411
a=0;//     #v7=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 393
a=0;//     :catch_4
a=0;//     #v0=(Null);v1=(Null);v2=(Reference,Ljava/lang/NoSuchMethodException;);v5=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,[Ljava/lang/Class;);v1=(Reference,Ljava/lang/reflect/Method;);v2=(Integer);v5=(Reference,[Ljava/lang/Class;);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Lcom/android/util/Property;[F)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     new-instance v0, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Lcom/android/util/Property;[F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/String;[F)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     new-instance v0, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Ljava/lang/String;[F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Lcom/android/util/Property;[I)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     new-instance v0, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Lcom/android/util/Property;[I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/String;[I)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     new-instance v0, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Ljava/lang/String;[I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe(Lcom/android/util/Property;[Lcom/android/animation/Keyframe;)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     invoke-static {p1}, Lcom/android/animation/KeyframeSet;->ofKeyframe([Lcom/android/animation/Keyframe;)Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 281
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     instance-of v1, v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     new-instance v1, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     invoke-direct {v1, p0, v0}, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Lcom/android/util/Property;Lcom/android/animation/IntKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 290
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 283
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v0, Lcom/android/animation/FloatKeyframeSet;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 284
a=0;//     new-instance v1, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/android/animation/FloatKeyframeSet;
a=0;// 
a=0;//     invoke-direct {v1, p0, v0}, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Lcom/android/util/Property;Lcom/android/animation/FloatKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 287
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v1, p0}, Lcom/android/animation/PropertyValuesHolder;-><init>(Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 288
a=0;//     #v1=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, v1, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 289
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, v1, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 290
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe(Ljava/lang/String;[Lcom/android/animation/Keyframe;)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     invoke-static {p1}, Lcom/android/animation/KeyframeSet;->ofKeyframe([Lcom/android/animation/Keyframe;)Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 250
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     instance-of v1, v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v1, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     invoke-direct {v1, p0, v0}, Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/android/animation/IntKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 259
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v0, Lcom/android/animation/FloatKeyframeSet;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 253
a=0;//     new-instance v1, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/android/animation/FloatKeyframeSet;
a=0;// 
a=0;//     invoke-direct {v1, p0, v0}, Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/android/animation/FloatKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v1, p0}, Lcom/android/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 257
a=0;//     #v1=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, v1, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, v1, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 259
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Lcom/android/util/Property;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     new-instance v0, Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0}, Lcom/android/animation/PropertyValuesHolder;-><init>(Lcom/android/util/Property;)V
a=0;// 
a=0;//     .line 224
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/PropertyValuesHolder;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 226
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/String;Lcom/android/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     new-instance v0, Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0}, Lcom/android/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     invoke-virtual {v0, p2}, Lcom/android/animation/PropertyValuesHolder;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/PropertyValuesHolder;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 206
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setupGetter(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "get"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/android/animation/PropertyValuesHolder;->setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 493
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 456
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 462
a=0;//     invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 463
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 466
a=0;//     :cond_0
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 467
a=0;//     invoke-direct {p0, p1, p3, p4}, Lcom/android/animation/PropertyValuesHolder;->getPropertyFunction(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 468
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 469
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 470
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 472
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 475
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 477
a=0;//     return-object v0
a=0;// 
a=0;//     .line 475
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private setupValue(Ljava/lang/Object;Lcom/android/animation/Keyframe;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 550
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 551
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/android/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Lcom/android/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 554
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 555
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 556
a=0;//     invoke-direct {p0, v0}, Lcom/android/animation/PropertyValuesHolder;->setupGetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 558
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Lcom/android/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 564
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 561
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 559
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method calculateValue(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/KeyframeSet;->getValue(F)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;//     .line 670
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/android/animation/PropertyValuesHolder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 593
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 594
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 595
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     .line 596
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/android/animation/KeyframeSet;->clone()Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 601
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 599
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 601
a=0;//     #v0=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0}, Lcom/android/animation/PropertyValuesHolder;->clone()Lcom/android/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/PropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPropertyName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 712
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method init()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 633
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 636
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->sIntEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 640
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 643
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/animation/KeyframeSet;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 645
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 636
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->sFloatEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setAnimatedValue(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 614
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/android/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, p1, v1}, Lcom/android/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 616
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 618
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/android/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 619
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 626
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 622
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 620
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 658
a=0;//     iput-object p1, p0, Lcom/android/animation/PropertyValuesHolder;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 659
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/android/animation/KeyframeSet;->setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 660
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 327
a=0;//     invoke-static {p1}, Lcom/android/animation/KeyframeSet;->ofFloat([F)Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 328
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 309
a=0;//     invoke-static {p1}, Lcom/android/animation/KeyframeSet;->ofInt([I)Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 310
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setKeyframes([Lcom/android/animation/Keyframe;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 336
a=0;//     #v0=(Null);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     .line 337
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v2, v2, [Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 338
a=0;//     #v2=(Reference,[Lcom/android/animation/Keyframe;);
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v3, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 339
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 339
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     new-instance v0, Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/KeyframeSet;);
a=0;//     invoke-direct {v0, v2}, Lcom/android/animation/KeyframeSet;-><init>([Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 343
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setObjectValues([Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 359
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 360
a=0;//     invoke-static {p1}, Lcom/android/animation/KeyframeSet;->ofObject([Ljava/lang/Object;)Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     .line 361
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setProperty(Lcom/android/util/Property;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 700
a=0;//     iput-object p1, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     .line 701
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPropertyName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 688
a=0;//     iput-object p1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 689
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupEndValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 587
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     iget-object v0, v0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     iget-object v1, v1, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/animation/PropertyValuesHolder;->setupValue(Ljava/lang/Object;Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     .line 588
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetter(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 485
a=0;//     sget-object v0, Lcom/android/animation/PropertyValuesHolder;->sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "set"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/android/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/android/animation/PropertyValuesHolder;->setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 486
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetterAndGetter(Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 509
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/android/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 510
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 511
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->hasValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 512
a=0;//     iget-object v2, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/util/Property;);
a=0;//     invoke-virtual {v2, p1}, Lcom/android/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/android/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 516
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 519
a=0;//     #v0=(Reference,Ljava/lang/ClassCastException;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mProperty:Lcom/android/util/Property;
a=0;// 
a=0;//     .line 522
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/android/util/Property;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 523
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 524
a=0;//     invoke-virtual {p0, v1}, Lcom/android/animation/PropertyValuesHolder;->setupSetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 526
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 527
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->hasValue()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 528
a=0;//     iget-object v3, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 529
a=0;//     invoke-direct {p0, v1}, Lcom/android/animation/PropertyValuesHolder;->setupGetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 532
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     iget-object v3, p0, Lcom/android/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/android/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 533
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 540
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 535
a=0;//     :catch_2
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);v2=(Reference,Ljava/util/Iterator;);v3=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setupStartValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     iget-object v0, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     iget-object v0, v0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/animation/PropertyValuesHolder;->setupValue(Ljava/lang/Object;Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     .line 576
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/android/animation/KeyframeSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
