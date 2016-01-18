package com.kingroot.kinguser; class aeb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aeb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static a([Landroid/content/pm/Signature;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 234
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 238
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p0, v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/pm/Signature;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v0, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 239
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v2, "X.509"
a=0;// 
a=0;//     invoke-static {v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/security/cert/X509Certificate;
a=0;// 
a=0;//     .line 240
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 241
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_1
a=0;//     invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/security/Principal;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 248
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-gt v2, v3, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 249
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(PosByte);
a=0;//     const-string v2, "O="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 254
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_4
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 255
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_4
a=0;//     add-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     .line 259
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 260
a=0;//     #v3=(Integer);
a=0;//     if-gt v3, v2, :cond_5
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 261
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_5
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 265
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 266
a=0;//     #v0=(Reference,Ljava/security/cert/CertificateException;);
a=0;//     invoke-virtual {v0}, Ljava/security/cert/CertificateException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/List;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     #v3=(Null);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 140
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     .line 143
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aec;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aec;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aec;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aec;);
a=0;//     invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 152
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aeb;->nl()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 155
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 156
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v2, v0, :cond_3
a=0;// 
a=0;//     .line 157
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 167
a=0;//     :goto_2
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v4, v1, :cond_9
a=0;// 
a=0;//     .line 168
a=0;//     invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v8, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v8, 0x2710
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     if-ge v1, v8, :cond_2
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 177
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v8=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v1, v4, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v4, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 183
a=0;//     :goto_4
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_5
a=0;// 
a=0;//     .line 184
a=0;//     invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/aeb;->dt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 185
a=0;//     invoke-interface {v7, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 186
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/aeb;->dt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 183
a=0;//     :cond_4
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 192
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 193
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 194
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 195
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 196
a=0;//     :goto_6
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v7}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v4, v2, :cond_6
a=0;// 
a=0;//     .line 197
a=0;//     invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 198
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 199
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 200
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 196
a=0;//     :cond_7
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 207
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Integer);v2=(Integer);v4=(Integer);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 371
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, p0, v2}, Lcom/kingroot/kinguser/vb;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 372
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 374
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 373
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     :goto_1
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 53
a=0;//     :goto_2
a=0;//     invoke-static {p0, p1, p2}, Lcom/kingroot/kinguser/aeb;->d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     new-instance p0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #p0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     new-instance p1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #p1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #p1=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 52
a=0;//     :cond_2
a=0;//     new-instance p2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #p2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #p2=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static c(Ljava/util/List;Ljava/util/List;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 297
a=0;//     #v2=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     invoke-interface {p0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 298
a=0;//     invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 299
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 302
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 297
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/pm/PackageManager;)Ljava/util/Set;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/util/HashSet;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v4}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 385
a=0;//     #v4=(Reference,Ljava/util/HashSet;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 388
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 391
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v6, Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 394
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 395
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v7=(Reference,Ljava/util/Iterator;);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 398
a=0;//     iput-object v10, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 402
a=0;//     :cond_0
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/content/pm/Signature;);
a=0;//     aget-object v1, v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Landroid/content/pm/Signature;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 403
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 404
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 405
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 406
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v9, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     #v9=(Reference,[Landroid/content/pm/Signature;);
a=0;//     invoke-static {v9}, Lcom/kingroot/kinguser/aeb;->a([Landroid/content/pm/Signature;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 409
a=0;//     :cond_1
a=0;//     #v9=(Conflicted);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v8=(Conflicted);
a=0;//     invoke-static {v2, v6}, Lcom/kingroot/kinguser/aeb;->a(Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 415
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aeb;->nm()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 418
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v8=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 419
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 420
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 421
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 423
a=0;//     invoke-interface {v6, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 424
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 432
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge v2, v1, :cond_3
a=0;// 
a=0;//     .line 433
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iput-object v10, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     .line 432
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 427
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x1e
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_6
a=0;// 
a=0;//     invoke-static {v0, v7}, Lcom/kingroot/kinguser/aeb;->c(Ljava/util/List;Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 428
a=0;//     :cond_6
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 438
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 442
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method private static d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vb;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vb;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 74
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_4
a=0;// 
a=0;//     .line 76
a=0;//     invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     iget-object v7, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/kingroot/kinguser/ff;->J(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);v1=(Boolean);
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 86
a=0;//     iput-object v9, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     .line 87
a=0;//     invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/content/pm/Signature;);
a=0;//     aget-object v1, v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Landroid/content/pm/Signature;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 93
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v8, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     #v8=(Reference,[Landroid/content/pm/Signature;);
a=0;//     invoke-static {v8}, Lcom/kingroot/kinguser/aeb;->a([Landroid/content/pm/Signature;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 98
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 103
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v4, v5}, Lcom/kingroot/kinguser/aeb;->a(Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 105
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aeb;->nm()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 108
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     .line 111
a=0;//     invoke-interface {v5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 112
a=0;//     invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 122
a=0;//     :goto_3
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge v2, v1, :cond_5
a=0;// 
a=0;//     .line 123
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iput-object v9, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     .line 122
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 115
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x1e
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_7
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/kingroot/kinguser/aeb;->c(Ljava/util/List;Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 116
a=0;//     :cond_7
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 118
a=0;//     :cond_8
a=0;//     #v1=(Boolean);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 126
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static dt(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 218
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private static nl()Ljava/util/List;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 282
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "google"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 283
a=0;//     const-string v1, "android"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 284
a=0;//     sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 285
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static nm()Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 312
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "android"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 313
a=0;//     const-string v1, "com.android.launcher"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 314
a=0;//     const-string v1, "com.android.systemui"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 315
a=0;//     const-string v1, "com.android.phone"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 316
a=0;//     const-string v1, "com.android.contacts"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 317
a=0;//     const-string v1, "com.android.nfc"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 318
a=0;//     const-string v1, "com.android.launcher"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 319
a=0;//     const-string v1, "com.android.mms"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 320
a=0;//     const-string v1, "com.android.bluetooth"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 321
a=0;//     const-string v1, "com.android.settings"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 322
a=0;//     const-string v1, "com.android.packageinstaller"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 323
a=0;//     const-string v1, "com.android.stk"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 324
a=0;//     return-object v0
a=0;// .end method
}}
