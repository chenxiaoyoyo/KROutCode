package com.kingroot.kinguser; class afj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/afj;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static S(Landroid/content/Context;)Ljava/util/HashMap;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v3, "kp_constraint.conf"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-array v5, v4, [B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Integer);v6=(Conflicted);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     sub-int v6, v4, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v5, v3, v6}, Ljava/io/InputStream;->read([BII)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-gez v6, :cond_1
a=0;// 
a=0;//     if-eq v3, v4, :cond_1
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/HashMap;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Integer);v4=(Integer);v5=(Reference,[B);v6=(Integer);v7=(Uninit);
a=0;//     add-int/2addr v3, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v6=(Conflicted);
a=0;//     invoke-static {v5, v1}, Lcom/kingroot/kinguser/afj;->a([BLjava/util/HashMap;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/io/IOException;);v2=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Null);v2=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_5
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Null);v3=(Integer);v4=(Integer);v5=(Reference,[B);v6=(Integer);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Reference,Ljava/io/IOException;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Null);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static T(Landroid/content/Context;)Lorg/json/JSONArray;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v2, "kp_buildin.conf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v4, v3, [B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     sub-int v5, v3, v1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v4, v1, v5}, Ljava/io/InputStream;->read([BII)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-gez v5, :cond_1
a=0;// 
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v3=(Integer);v4=(Reference,[B);v5=(Integer);
a=0;//     add-int/2addr v1, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONArray;);
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Ljava/io/InputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v2=(Reference,Ljava/io/InputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_6
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Null);v1=(Integer);v3=(Integer);v4=(Reference,[B);v5=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_4
a=0;//     #v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/loader/sdk/KPInfo;[B)I
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, -0x7
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Byte);
a=0;//     invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserFactory;);
a=0;//     invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;//     :try_end_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-eq v1, v3, :cond_8
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "pkg_name"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Boolean);
a=0;//     const-string v3, "ver_code"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->versionCode:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v3=(Boolean);
a=0;//     const-string v3, "min_ver"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->minTargetLoaderVersion:I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v3=(Boolean);
a=0;//     const-string v3, "max_ver"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->maxTargetLoaderVersion:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "entry_class"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->entryClass:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     const-string v3, "entry_fragment"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->entryFragmentClass:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v3, "ver_name"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->versionName:Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Integer);v3=(One);
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPInfo;->entryClass:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Ljava/io/File;JLjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     const-string v2, "%s-%d.apk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p3, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
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
a=0;// 
a=0;// .method private static a([BLjava/util/HashMap;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/xmlpull/v1/XmlPullParserFactory;);
a=0;//     invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-eq v0, v2, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     const-string v2, "package_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     new-instance v5, Ljava/util/zip/ZipFile;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/zip/ZipFile;);
a=0;//     invoke-direct {v5, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_c
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/util/zip/ZipFile;);
a=0;//     invoke-virtual {v5}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v6=(Reference,Ljava/util/Enumeration;);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "\\*"
a=0;// 
a=0;//     const-string v7, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v4, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v8, 0x2f
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_2
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_2
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     invoke-virtual {v5, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_d
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :try_start_3
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_e
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_4
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v7=(Conflicted);
a=0;//     invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lez v7, :cond_d
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v2, v0, v8, v7}, Ljava/io/OutputStream;->write([BII)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v7=(Conflicted);v8=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_5
a=0;//     #v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_6
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v5}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Boolean);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/util/zip/ZipEntry;);v2=(Reference,Ljava/io/File;);v3=(Null);v4=(Boolean);v5=(Reference,Ljava/util/zip/ZipFile;);v6=(Reference,Ljava/util/Enumeration;);v7=(Reference,Ljava/lang/String;);v8=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_7
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/InputStream;);v4=(Reference,Ljava/io/InputStream;);v7=(Conflicted);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_2
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_8
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_2
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_9
a=0;//     :try_start_b
a=0;//     throw v0
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v5
a=0;// 
a=0;//     :goto_a
a=0;//     :try_start_c
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_3
a=0;// 
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_b
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Boolean);v3=(Null);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v5, v3
a=0;// 
a=0;//     :goto_c
a=0;//     #v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Reference,Ljava/util/zip/ZipFile;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v5}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_2
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_d
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Boolean);v1=(Null);v3=(Null);v6=(Reference,Ljava/util/Enumeration;);
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v5}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_b
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_e
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v3=(Reference,Ujava/lang/Object;);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_d
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Null);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v4=(Reference,Ljava/io/InputStream;);v5=(Reference,Ljava/util/zip/ZipFile;);v6=(Reference,Ljava/util/Enumeration;);v8=(Integer);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_6
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_8
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_d
a=0;//     #v3=(Null);v4=(Reference,Ljava/io/InputStream;);v7=(Integer);
a=0;//     if-eqz v4, :cond_e
a=0;// 
a=0;//     :try_start_10
a=0;//     invoke-virtual {v4}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
a=0;//     .catchall {:try_start_10 .. :try_end_10} :catchall_2
a=0;// 
a=0;//     :cond_e
a=0;//     :goto_f
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1
a=0;//     .catchall {:try_start_11 .. :try_end_11} :catchall_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_9
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_a
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     :catch_b
a=0;//     #v0=(Boolean);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_e
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v3=(Reference,Ujava/lang/Object;);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catchall_3
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/zip/ZipFile;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catch_c
a=0;//     #v2=(Boolean);v3=(Null);v4=(Uninit);v5=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_4
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/io/InputStream;);v5=(Reference,Ljava/util/zip/ZipFile;);v6=(Reference,Ljava/util/Enumeration;);v7=(Reference,Ljava/lang/String;);v8=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_5
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_6
a=0;//     #v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_d
a=0;//     #v3=(Null);v4=(Boolean);v7=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_e
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static d(Lcom/kingroot/loader/sdk/KPInfo;)I
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPInfo;->rawPluginPath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/afj;->dE(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/afj;->a(Lcom/kingroot/loader/sdk/KPInfo;[B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static dE(Ljava/lang/String;)[B
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v3, Ljava/util/zip/ZipFile;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/zip/ZipFile;);
a=0;//     invoke-direct {v3, v0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/util/zip/ZipFile;);
a=0;//     const-string v0, "assets/kpconf.xml"
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-array v0, v5, [B
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Integer);v6=(Conflicted);
a=0;//     if-ge v4, v5, :cond_9
a=0;// 
a=0;//     sub-int v6, v5, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v0, v4, v6}, Ljava/io/InputStream;->read([BII)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_a
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-gez v6, :cond_3
a=0;// 
a=0;//     if-eq v4, v5, :cond_3
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     add-int/2addr v4, v6
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Ljava/io/InputStream;);v3=(Reference,Ljava/util/zip/ZipFile;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Null);v2=(Boolean);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v2=(Conflicted);v3=(Reference,Ljava/util/zip/ZipFile;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_8
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_9
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_6
a=0;//     #v4=(Integer);v5=(Integer);v6=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v6=(Conflicted);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_a
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_7
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Null);v2=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_2
a=0;//     #v2=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_9
a=0;//     #v1=(Null);v2=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_a
a=0;//     #v2=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
