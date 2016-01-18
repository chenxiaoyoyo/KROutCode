package android.support.v4.content; class FileProvider { void a() { int a;
a=0;// .class public Landroid/support/v4/content/FileProvider;
a=0;// .super Landroid/content/ContentProvider;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTR_NAME:Ljava/lang/String; = "name"
a=0;// 
a=0;// .field private static final ATTR_PATH:Ljava/lang/String; = "path"
a=0;// 
a=0;// .field private static final COLUMNS:[Ljava/lang/String;
a=0;// 
a=0;// .field private static final DEVICE_ROOT:Ljava/io/File;
a=0;// 
a=0;// .field private static final META_DATA_FILE_PROVIDER_PATHS:Ljava/lang/String; = "android.support.FILE_PROVIDER_PATHS"
a=0;// 
a=0;// .field private static final TAG_CACHE_PATH:Ljava/lang/String; = "cache-path"
a=0;// 
a=0;// .field private static final TAG_EXTERNAL:Ljava/lang/String; = "external-path"
a=0;// 
a=0;// .field private static final TAG_FILES_PATH:Ljava/lang/String; = "files-path"
a=0;// 
a=0;// .field private static final TAG_ROOT_PATH:Ljava/lang/String; = "root-path"
a=0;// 
a=0;// .field private static sCache:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "_display_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "_size"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     sput-object v0, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V
a=0;// 
a=0;//     .line 313
a=0;//     #p0=(Reference,Landroid/support/v4/content/FileProvider;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     .line 437
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Reference,Ljava/io/File;);v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, p1, v2
a=0;// 
a=0;//     .line 438
a=0;//     #v4=(Null);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 439
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 437
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 442
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 452
a=0;//     #v1=(Null);
a=0;//     new-array v0, p1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 453
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 454
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static copyOf([Ljava/lang/String;I)[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 446
a=0;//     #v1=(Null);
a=0;//     new-array v0, p1, [Ljava/lang/String;
a=0;// 
a=0;//     .line 447
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 448
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     sget-object v1, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 214
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 215
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     :try_start_1
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 225
a=0;//     :try_start_2
a=0;//     sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 228
a=0;//     return-object v0
a=0;// 
a=0;//     .line 218
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 219
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 227
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 221
a=0;//     :catch_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 222
a=0;//     :try_start_3
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public static getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v0, p2}, Landroid/support/v4/content/FileProvider$PathStrategy;->getUriForFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static modeToMode(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     const-string v0, "r"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     .line 432
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 414
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "w"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "wt"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 415
a=0;//     :cond_1
a=0;//     const/high16 v0, 0x2c000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 418
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "wa"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 419
a=0;//     const/high16 v0, 0x2a000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 422
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "rw"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 423
a=0;//     const/high16 v0, 0x38000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "rwt"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 426
a=0;//     const/high16 v0, 0x3c000000    # 0.0078125f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Invalid mode: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 239
a=0;//     #v7=(One);
a=0;//     new-instance v2, Landroid/support/v4/content/FileProvider$SimplePathStrategy;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/content/FileProvider$SimplePathStrategy;);
a=0;//     invoke-direct {v2, p1}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 241
a=0;//     #v2=(Reference,Landroid/support/v4/content/FileProvider$SimplePathStrategy;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, p1, v3}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const-string v4, "android.support.FILE_PROVIDER_PATHS"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/pm/ProviderInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 245
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Missing android.support.FILE_PROVIDER_PATHS meta-data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 251
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Null);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Landroid/content/res/XmlResourceParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v7, :cond_4
a=0;// 
a=0;//     .line 252
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v0, v4, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     invoke-interface {v3}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 255
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "name"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v1, v4}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 256
a=0;//     const-string v5, "path"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v1, v5}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 259
a=0;//     const-string v6, "root-path"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 260
a=0;//     sget-object v0, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;
a=0;// 
a=0;//     new-array v6, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v5, v6, v8
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 269
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->addRoot(Ljava/lang/String;Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1
a=0;//     #v6=(Boolean);
a=0;//     const-string v6, "files-path"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v6, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v5, v6, v8
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 263
a=0;//     :cond_2
a=0;//     #v6=(Boolean);
a=0;//     const-string v6, "cache-path"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 264
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v6, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v5, v6, v8
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 265
a=0;//     :cond_3
a=0;//     #v6=(Boolean);
a=0;//     const-string v6, "external-path"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 266
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-array v6, v7, [Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v6, v8
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 275
a=0;//     :cond_4
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/SecurityException;);
a=0;//     const-string v1, "Provider must not be exported"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/SecurityException;);
a=0;//     const-string v1, "Provider must grant uri permissions"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     iget-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getType(Landroid/net/Uri;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iget-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x2e
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 171
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/MimeTypeMap;);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, "application/octet-stream"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "No external inserts"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     invoke-static {p2}, Landroid/support/v4/content/FileProvider;->modeToMode(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 204
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v1, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 140
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     sget-object p2, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     array-length v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v4, v1, [Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     array-length v1, p2
a=0;// 
a=0;//     new-array v5, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 147
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v6, p2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v2, v6, :cond_2
a=0;// 
a=0;//     aget-object v0, p2, v2
a=0;// 
a=0;//     .line 148
a=0;//     #v0=(Null);
a=0;//     const-string v7, "_display_name"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     const-string v0, "_display_name"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v4, v1
a=0;// 
a=0;//     .line 150
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v5, v1
a=0;// 
a=0;//     .line 147
a=0;//     :goto_1
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :cond_1
a=0;//     #v0=(Null);v7=(Boolean);
a=0;//     const-string v7, "_size"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 152
a=0;//     const-string v0, "_size"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v4, v1
a=0;// 
a=0;//     .line 153
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v7, v5, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 157
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-static {v4, v1}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {v5, v1}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 160
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     new-instance v2, Landroid/database/MatrixCursor;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/database/MatrixCursor;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v2, v0, v3}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 161
a=0;//     #v2=(Reference,Landroid/database/MatrixCursor;);
a=0;//     invoke-virtual {v2, v1}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 162
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Integer);v3=(Reference,Ljava/io/File;);v7=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "No external updates"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
