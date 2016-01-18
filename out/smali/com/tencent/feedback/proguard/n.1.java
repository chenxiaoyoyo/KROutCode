package com.tencent.feedback.proguard; class n.1 { void a() { int a;
a=0;// .class public final Lcom/tencent/feedback/proguard/n;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     const-string v0, "eup_db"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/tencent/feedback/proguard/n;);
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/proguard/n;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(Landroid/database/sqlite/SQLiteDatabase;)Z
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     #v9=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 118
a=0;//     :try_start_0
a=0;//     new-instance v11, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 119
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "sqlite_master"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v2, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v3, "name"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     const-string v3, "type = \'table\'"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_2
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 141
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 142
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v9
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     :try_start_4
a=0;//     #v0=(Conflicted);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v11=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v2, "drop table if exists %s"
a=0;// 
a=0;//     .line 129
a=0;//     invoke-interface {v11}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 131
a=0;//     invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 133
a=0;//     sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     aput-object v0, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     const-string v4, "rqdp{  drop }%s"
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     aput-object v0, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 146
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 148
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     throw v0
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 115
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ujava/lang/Object;);v4=(Reference,Ljava/lang/String;);v5=(Reference,[Ljava/lang/Object;);v6=(Null);v7=(Null);v11=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 148
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     move v0, v8
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 146
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v10
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 139
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v10
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final declared-synchronized getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-ge v0, v6, :cond_1
a=0;// 
a=0;//     .line 160
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 163
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "rqdp{  getReadableDatabase error count} %d"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 168
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     const-string v2, "rqdp{  error get DB failed}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     const-wide/16 v2, 0xc8
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-ge v0, v6, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 196
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "rqdp{  getWritableDatabase error count} %d"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 201
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     const-string v2, "rqdp{  error get DB failed}"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     const-wide/16 v2, 0xc8
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 212
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/tencent/feedback/proguard/m;->a:[[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[[Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     sget-object v1, Lcom/tencent/feedback/proguard/m;->a:[[Ljava/lang/String;
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     .line 51
a=0;//     #v3=(Null);
a=0;//     const-string v4, "rqdp{  table:}%s %s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v7, v3, v7
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget-object v7, v3, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 48
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 45
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/n;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/feedback/common/d;->a(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/feedback/common/d;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     const-string v0, "rqdp{  downgrade a db} [%s] rqdp{  from v}%d rqdp{  to} v%d rqdp{  , deleted all tables!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "eup_db"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/feedback/proguard/n;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     const-string v0, "rqdp{  drop all success recreate!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/feedback/proguard/n;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Reference,[Ljava/lang/Object;);v2=(PosByte);v3=(Reference,Ljava/lang/Integer;);
a=0;//     const-string v0, "rqdp{  drop all fail try deleted file,may next time will success!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/n;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "eup_db"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->canWrite()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "rqdp{  upgrade a db }[%s]rqdp{   from v}%d rqdp{  to v}%d rqdp{  , deleted all tables!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "eup_db"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/feedback/proguard/n;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     const-string v0, "rqdp{  drop all success recreate!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/feedback/proguard/n;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v0, "rqdp{  drop all fail try deleted file,may next time will success!}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/proguard/n;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "eup_db"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->canWrite()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
